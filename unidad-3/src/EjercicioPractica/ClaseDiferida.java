package EjercicioPractica;

public class ClaseDiferida {
    public int maxArea(int[] height) {
        int currentArea;
        int maxArea = 0;
        int n = height.length;

        int i = 0;
        int d = n - 1;

        while(i != d){
            currentArea = getArea(d,i,height);

            if (currentArea > maxArea){
                maxArea = currentArea;
            }

            if (height[i] < height[d]){
                i++;
            } else{
                d--;
            }
        }
        return maxArea;
    }

    public static int getArea(int f, int i, int[] heights) {
        int base = Math.abs(i - f);
        int altura = Math.min(heights[i], heights[f]);
        return base * altura;
    }
}
