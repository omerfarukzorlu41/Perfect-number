import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total=0;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for(int i =1; i < number ;i++){
            if(number % i == 0){
                total +=i;
            }
        }
        if(number == total){
            System.out.println(number+" number is a perfect number");
        }else{
            System.out.println(number+" number is a not perfect number");
        }
    }
}
