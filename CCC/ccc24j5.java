import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine()); // Number of Rows
        int C = Integer.parseInt(br.readLine()); // Number of Coloumns

        String[][] patchMap = new String[R][C]; // Map of Patch

        for (int i = 0; i < R; i++) {
            patchMap[i] = br.readLine().split("");
        }

        /*
        for (String[] x : patchMap) {
            System.out.println(Arrays.toString(x));
        }
         */

        int[] currentPos = new int[2]; // {row,coloumn} NOT {x,y}
        currentPos[0] = Integer.parseInt(br.readLine());
        currentPos[1] = Integer.parseInt(br.readLine());

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[R][C];

        visited[currentPos[0]][currentPos[1]] = true;
        queue.add(currentPos);
        int V = 0;

        while (!queue.isEmpty()) {
            currentPos = queue.poll();
            V += harvest(patchMap, currentPos);
            for (int[] pos : getNeighbours(R, C, currentPos)) {
                if (pos[0] >= 0 && !patchMap[pos[0]][pos[1]].equals("*")) {
                    if (!visited[pos[0]][pos[1]]) {
                        //System.out.println(Arrays.toString(pos));
                        visited[pos[0]][pos[1]] = true;
                        queue.add(pos);
                    }
                }
            }
        }

        System.out.println(V);
    }

    public static int[][] getNeighbours(int R, int C, int[] pos) {
        int[][] possibleNeighbours = {{pos[0]-1,pos[1]},{pos[0]+1,pos[1]},{pos[0],pos[1]-1},{pos[0],pos[1]+1}}; //{Up,Down,Left,Right}
        int[] invalid = {-1,-1};
        for (int i = 0; i < 4; i++) {
            if (possibleNeighbours[i][0] < 0 || possibleNeighbours[i][1] < 0 || possibleNeighbours[i][0] >= R || possibleNeighbours[i][1] >= C) { //Invalid
                possibleNeighbours[i] = invalid;
            }
        }

        return possibleNeighbours;
    }

    public static int harvest(String[][] patchMap, int[] pos) {
        String crop = patchMap[pos[0]][pos[1]];
        if (crop.equals("S")) {
            return 1;
        } else if (crop.equals("M")) {
            return 5;
        } else {
            return 10;
        }
    }
}
