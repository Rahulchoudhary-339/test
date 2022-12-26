import java.sql.SQLOutput;
import java.util.Scanner;

class Oddeven {
    public int n;
    int lengthh,count;
    int digit=0;
    int k=0;
    int p;
    int a,b,c,d;

    void userInput() {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }

    void Process() {
        for (int i = 1; i <= n; i++) {
            lengthh = String.valueOf(i).length();
            if (lengthh% 2 != 0) {
                a = a + (lengthh * 2);
            } else if (lengthh % 2 == 0 && lengthh % 4 != 0) {
                b = b + (lengthh * 3);
            } else if (lengthh % 2 == 0 && lengthh % 4 == 0) {
                c = c + (lengthh * 4);
            }
        }
        d = a + b + c;
        //System.out.println("total"+d);
        while(d!=0){
            digit = digit + (d % 10);
            d = d / 10;
            if (d==0) {
                if(digit>9)
                {
                    d=digit;
                    digit=0;
                }
            }
        }
        System.out.println("Your final answer is:"+digit);
            }


    }

public class Que1 {
    public static void main(String[] args) {
        Oddeven ob =new Oddeven();
        ob.userInput();
        ob.Process();

    }


    }

