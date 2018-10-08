class Solution {
    public int[] intersection(int[] a1, int[] a2) {
        int n = Math.min(a1.length, a2.length);
        int[] is = new int[n];
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            int tmep = a1[i];
            for (int j = 0; j < a2.length; j++) {
                if (tmep == a2[j]) {
                    boolean exist = false;
                    for (int k = 0; k < count; k++) {
                        if (is[k] == tmep) {
                            exist = true;
                            break;
                        }
                    }
                    if (count >= n) {
                        break;
                    }
                    if (!exist) {
                        is[count] = tmep;
                        count++;
                    }
                    break;
                }
            }
        }
        int[] itersection = new int[count];
        for (int i = 0; i < count; i++) {
            itersection[i] = is[i];
        }
        return itersection;

    }
}
