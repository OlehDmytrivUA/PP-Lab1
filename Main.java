import java.util.Scanner;

/**
 * Class Main with main method from which the execution of the program begins
 */
public class Main {
    /**
     * main method from which the execution of the program begins
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of luke Numbers: ");
        int N = scan.nextInt();         //зчитуємо кількість чисел чку потрбно згенерувати

        lukeNumbers LukNumbrs = new lukeNumbers(N); //створюємо об'єкт чисел люка що є масивом об'єктів самого числа
        LukNumbrs.PrintLukeNumbers();               //виводжу всі згенеровані числа
        LukNumbrs.PrintLukeNumbersWithCheck();      //виводжу ті що задовільняють умову
    }
}
