import java.util.Scanner;
public class Application{

    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.next();
        int val = Integer.parseInt(input.toString());
        System.out.print(factorial(val));
    }
    public int factorial(int number){
        if(number ==1 ){
            return 1;
        }else{
            return number + factorial(number-1);
        }
    }
}