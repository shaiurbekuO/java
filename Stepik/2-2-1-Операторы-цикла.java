import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                sum += i;
            }
        }System.out.println(sum);
    }
}