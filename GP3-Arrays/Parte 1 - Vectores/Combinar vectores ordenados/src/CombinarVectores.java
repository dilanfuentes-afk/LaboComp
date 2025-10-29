public class CombinarVectores {
    public static int [] combinarVectoresOrdenados(int [] vec1, int [] vec2) {
        int [] vec = new int[vec1.length + vec2.length];
        for (int i = 0; i < vec1.length; i++) {
            vec[i] = vec1[i];
        }
        for (int i = 0; i < vec2.length; i++) {
            vec[vec1.length + i] = vec2[i];
        }
        ordenarVector(vec);
        return vec;
    }

    public static void ordenarVector(int [] vec){

        for (int f = vec.length - 1; f > 0; f--) {
            for (int i = 0; i < f; i++) {
                if (vec[i] > vec[f]){
                    int temp = vec[i];
                    vec[i] = vec[f];
                    vec[f] = temp;
                }
            }
        }
    }

}