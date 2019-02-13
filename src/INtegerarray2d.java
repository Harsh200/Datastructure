public class INtegerarray2d {
    public static void main(String[] args) {
        int[][] numbers = new int[20][20];
        int rowsum = 0,colsum=0;
        int index=0,indexc=0;
        int max = 0,maxc=0;
        for (int i = 0; i < 20; i++) {
            rowsum = 0;
            colsum=0;
            for (int i1 = 0; i1 < 20; i1++) {
                numbers[i][i1] = (int) (Math.random() * 100);
                rowsum = rowsum + numbers[i][i1];
            }
            if (rowsum > max) {
                max = rowsum;
                index = i;
            }
                System.out.println("row Sum" + rowsum);

            }
            System.out.println("this is highest value of row sum" + max + "\n At index" + index);
            for (int[] number : numbers) {
                for (int i : number) {
                    System.out.println(i);
                }
            }

        }
    }

