
public class TrappingWater {

    public static void main(String args[]) {
        int h[] = { 4, 2, 0, 6, 3, 2, 5 }, len = h.length;
        int TotalTW = TrapWater(h, len);
        System.out.println("Total water trapped=" + TotalTW);
    }

    public static int TrapWater(int h[], int len) {

        int maxL[] = new int[len];
        maxL[0] = h[0];
        int maxR[] = new int[len];
        maxR[len - 1] = h[len - 1];
        for (int i = 1; i < len; i++) {
            // for Maximun Left side value from start of array
            if (maxL[i - 1] > h[i]) {
                maxL[i] = maxL[i - 1];
            } else {
                maxL[i] = h[i];
            }

            // for MAximun Right value starting from end of array
            if (maxR[len - 1 - (i - 1)] > h[len - 1 - i]) {
                maxR[len - 1 - i] = maxR[len - 1 - (i - 1)];
            } else {
                maxR[len - 1 - i] = h[len - 1 - i];
            }
        }

        // System.out.println(Arrays.toString(maxL));
        // System.out.println(Arrays.toString(maxR));

        if (h.length == 1 || h.length == 2) {
            return 0;
        }
        // //ascending or descending order
        // for (int i = 0; i < h.length; i++) {
        // //ascending
        // if(h[i]<h[i+1] && h[h.length-2]<h[h.length-1]){return 0;}
        // // descending
        // else if(h[i]>h[i+1] && h[h.length-2]>h[h.length-1]){return 0;}
        // }

        int wL, TotalWater = 0;
        for (int i = 0; i < h.length; i++) {
            wL = Math.min(maxL[i], maxR[i]);
            TotalWater = TotalWater + (wL - h[i]);
        }
        return TotalWater;

    }
}
