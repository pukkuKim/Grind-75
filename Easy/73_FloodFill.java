class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // you wanna move to the pixel that's sharing a border w/ the current pixel
        // and check if that pixel has the same colour as the previous one BEFORE it changed its colour

        // save the initial colour
        int initColor = image[sr][sc];

        // if changing colour is not necessary (i.e. color == initColor), simply return image rn
        if (color == initColor) {
            return image;
        }

        changeColour(image, sr, sc, color, initColor);

        return image;
    }

    private void changeColour(int[][] image, int sr, int sc, int color, int initColor) {

        if (image[sr][sc] == initColor) {
            image[sr][sc] = color;

            if (sr - 1 >= 0) {
                changeColour(image, sr - 1, sc, color, initColor);
            }
            if (sr + 1 <= image.length - 1) {
                changeColour(image, sr + 1, sc, color, initColor);
            }
            if (sc - 1 >= 0) {
                changeColour(image, sr, sc - 1, color, initColor);
            }
            if (sc + 1 <= image[sr].length - 1) {
                changeColour(image, sr, sc + 1, color, initColor);
            }
        }
    }
}