package sprint4;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a [][] = new int[5][5];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[0][4]=50;

        a[1][0]=60;
        a[1][1]=70;
        a[1][2]=80;
        a[1][3]=90;
        a[1][4]=100;

        a[2][0]=110;
        a[2][1]=120;
        a[2][2]=130;
        a[2][3]=140;
        a[2][4]=150;

        a[3][0]=160;
        a[3][1]=170;
        a[3][2]=180;
        a[3][3]=190;
        a[3][4]=200;

        a[4][0]=210;
        a[4][1]=220;
        a[4][2]=230;
        a[4][3]=240;
        a[4][4]=250;

        for (int r=0;r<a.length;r++) {
            for (int c=0; c < a.length; c++) {
                System.out.print(a[r][c]+ " ");
            }
            System.out.println();
        }

    }



}
