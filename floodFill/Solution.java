class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int X = image[sr][sc]; // Original color of the starting pixel

        // If the starting pixel is already the target color, return immediately
        if (X == color) {
            return image;
        }

        // Helper method for recursion
        fill(image, sr, sc, X, color);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int X, int color) {
        // Base case: Out of bounds or not matching the original color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != X) {
            return;
        }

        // Update the pixel to the new color
        image[sr][sc] = color;

        // Recursively call for the four cardinal directions
        fill(image, sr - 1, sc, X, color); // Up
        fill(image, sr + 1, sc, X, color); // Down
        fill(image, sr, sc - 1, X, color); // Left
        fill(image, sr, sc + 1, X, color); // Right
    }
}