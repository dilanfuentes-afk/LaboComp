public class HallarValor {
    public static int hallarValor(int [] vec, int num) {
        for (int i = 0; i < vec.length; i++) {
            if (num == vec[i]){
                return i;
            }
        }
        return -1;
    }
}