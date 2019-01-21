package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] coolArray = {{10,15,13,8},{12,6,9,7},{17,11,16,14}};
        Position partA = Successors.findPosition(7,coolArray);
        System.out.println("Row of 7: " + partA.row);
        System.out.println("Column of 7: " + partA.column);

        Position[][] partB = Successors.getSuccessorArray(coolArray);
        for(int i = 0; i < partB.length;i++)
        {
            for(int j = 0; j < partB.length;j++)
            {
                if(partB[i][j] != null)
                {
                    System.out.println("(" + partB[i][j].row + ", " + partB[i][j].column + ")");
                }
                else
                {System.out.println("null");}
            }
        }
        System.out.println();
    }
}
