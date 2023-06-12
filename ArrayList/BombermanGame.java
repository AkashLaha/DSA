package com.akash.ArrayList;

import java.util.Arrays;

public class BombermanGame {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}; // Sample grid
        int seconds = 5; // Number of seconds to simulate

        // Print initial grid
        System.out.println("Initial grid:");
        printGrid(grid);

        // Simulate the game
        for (int i = 2; i <= seconds; i++) {
            if (i % 2 == 0) {
                // Plant bombs in all cells
                for (int row = 0; row < grid.length; row++) {
                    Arrays.fill(grid[row], 2);
                }
            } else {
                // Detonate bombs
                for (int row = 0; row < grid.length; row++) {
                    for (int col = 0; col < grid[0].length; col++) {
                        if (grid[row][col] == i-3) {
                            grid[row][col] = 0;
                            if (row > 0) grid[row-1][col] = 0; // Top cell
                            if (row < grid.length-1) grid[row+1][col] = 0; // Bottom cell
                            if (col > 0) grid[row][col-1] = 0; // Left cell
                            if (col < grid[0].length-1) grid[row][col+1] = 0; // Right cell
                        }
                    }
                }
            }

            // Print current grid
            System.out.println("After " + i + " seconds:");
            printGrid(grid);
        }
    }

    // Helper method to print the grid
    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell == 0 ? "." : "O");
            }
            System.out.println();
        }
        System.out.println();
    }
}
