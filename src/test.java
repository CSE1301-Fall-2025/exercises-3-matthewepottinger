public class test {

    public static void main(String[] args) {
    int[][] multiplicationTable = generateMultiplicationTable(5);
    for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(multiplicationTable[i][j] + " "); 
            }
            System.out.println(); 
        }
    }

    public static int[][] generateMultiplicationTable(int n) {
        int[][] multiplicationTable = new int [n][n];
        for (int i = 1; i<=multiplicationTable.length; i++){
            for (int j = 1; j <= multiplicationTable[0].length; j++){
                multiplicationTable[i-1][j-1] = i*j;
            }
        }
        return multiplicationTable;
    }
}
