public class ExcelSheetColumnNumber {
/*
* A = 1
* B = 2
* C = 3
* .
* .
* .
* Z= 26
* AA=27 -> 26*1+1
* AB=28 -> 26*1+2
* ZB=678 -> 26*26+2
* ZZB=18254   -> +2+(26*(26+(26*(26+26*0))))
* */
public static void main(String[] args) {
    System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZZB"));
}
    public int titleToNumber(String columnTitle) {
        int size=columnTitle.length(),sum=0,digitVal=1;
        for (int i = 0; i < size; i++) {
        digitVal=columnTitle.charAt(i)-'A'+1;
        sum=digitVal+sum*26;
        }
        return sum;
    }
}
