package actions;

import structures.Tile;

import java.util.Stack;
public class PublicFunction {

    private static int compareByValue(Tile tile1, Tile tile2) {
        return Integer.compare(tile1.getValue(), tile2.getValue());
    }
    public static Tile[] sortTilesByValues(Tile[] tiles) {
        Stack<Tile> inputStack = new Stack<>();
        Stack<Tile> tempStack = new Stack<>();

        // Push all Tile objects from the array to the inputStack
        for (Tile tile : tiles) {
            inputStack.push(tile);
        }

        while (!inputStack.isEmpty()) {
            Tile temp = inputStack.pop();

            // Move Tile objects from tempStack to inputStack until the right place for temp is found
            while (!tempStack.isEmpty() && compareByValue(tempStack.peek(), temp) > 0) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Create a new array to hold the sorted Tile objects
        Tile[] sortedTiles = new Tile[tiles.length];

        // Move sorted Tile objects to the new array
        for (int i = sortedTiles.length - 1; i >= 0; i--) {
            sortedTiles[i] = tempStack.pop();
        }

        return sortedTiles;
    }

    private static int compareByRow(Tile tile1, Tile tile2) {
        return Integer.compare(tile1.getRow(), tile2.getRow());
    }
    public static Tile[] sortTilesByRows(Tile[] tiles) {
        Stack<Tile> inputStack = new Stack<>();
        Stack<Tile> tempStack = new Stack<>();

        // Push all Tile objects from the array to the inputStack
        for (Tile tile : tiles) {
            inputStack.push(tile);
        }

        while (!inputStack.isEmpty()) {
            Tile temp = inputStack.pop();

            // Move Tile objects from tempStack to inputStack until the right place for temp is found
            while (!tempStack.isEmpty() && compareByRow(tempStack.peek(), temp) > 0) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Create a new array to hold the sorted Tile objects
        Tile[] sortedTiles = new Tile[tiles.length];

        // Move sorted Tile objects to the new array
        for (int i = sortedTiles.length - 1; i >= 0; i--) {
            sortedTiles[i] = tempStack.pop();
        }

        return sortedTiles;
    }

    private static int compareByCol(Tile tile1, Tile tile2) {
        return Integer.compare(tile1.getCol(), tile2.getCol());
    }
    public static Tile[] sortTilesByColumns(Tile[] tiles) {
        Stack<Tile> inputStack = new Stack<>();
        Stack<Tile> tempStack = new Stack<>();

        // Push all Tile objects from the array to the inputStack
        for (Tile tile : tiles) {
            inputStack.push(tile);
        }

        while (!inputStack.isEmpty()) {
            Tile temp = inputStack.pop();

            // Move Tile objects from tempStack to inputStack until the right place for temp is found
            while (!tempStack.isEmpty() && compareByCol(tempStack.peek(), temp) > 0) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Create a new array to hold the sorted Tile objects
        Tile[] sortedTiles = new Tile[tiles.length];

        // Move sorted Tile objects to the new array
        for (int i = sortedTiles.length - 1; i >= 0; i--) {
            sortedTiles[i] = tempStack.pop();
        }

        return sortedTiles;
    }

    public static void SwapValues(Tile tile1, Tile tile2) {
        int temp = tile1.getValue();
        int temp2 = tile2.getValue();
        tile1.setValue(temp2);
        tile2.setValue(temp);
    }
    public static Tile[] reverse(Tile[] arr) {
        int length = arr.length;

        Tile[] reversedArray = new Tile[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }
        return reversedArray;
    }

}
