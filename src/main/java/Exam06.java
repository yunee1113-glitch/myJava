public class Exam06 {
    public static void main(String [] args) {
        int A=0;
        for (int i=100 ; i<=300 ; i++ ){
            if (i%5==0 && i%7==0){
                A+=i;
            }
        }
        System.out.println(A);
    }
}
