public class INtegerarray2d {
    public static void main(String[] args) {
        int [][] numbers=new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                numbers[i][i1]=(int)(Math.random() * 100);


            }

        }
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println(i);

            }

        }

    }
}
