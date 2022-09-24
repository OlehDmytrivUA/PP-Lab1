/**
 * Class creates Lucas Number array and can print all generated numbers
 * or only wich we can write like W^2+1
 */
public class lukeNumbers {
    private lukeNumber [] arr; //масив обєктів чисел
    private int N = 0;  //реальна кількість чисел


    /**
     * method that generates an array of Luke numbers
     * @param N the number of numbers to be generated
     */
    lukeNumbers (int N){            // метод що генерує масив перших N чисел Люка
        if (N<1){return;}           // якщо N менше за 1
        arr = new lukeNumber[N];    // створюю масив чисел люка кількістю N
        this.N=N;
        if (N==1){arr[0] = new lukeNumber(2);return;}                            // якщо N == 1
        if (N==2){arr[0] = new lukeNumber(2);arr[1] = new lukeNumber(2);return;} // якщо N == 2

        arr[0] = new lukeNumber(2);                                              // якщо N > 2
        arr[1] = new lukeNumber(1);                                              // то виконуємо цикл
        for (int i = 2; i < N ; i++) {                                           // генерації чисел
            arr[i] = new lukeNumber(arr[i-2].getNumb()+arr[i-1].getNumb());
        }
    }

    /**
     * method that print all generated luke numbers
     */
    public void PrintLukeNumbers(){     //метод що виводить всі згенеровані числа
        long luke;
        for (int i = 0; i < N; i++) {
                luke = arr[i].getNumb();
                System.out.println(i+1 +" - Luke number -- "+ luke + "\n");
        }
    }

    /**
     * method that print luke numbers wich we can write like W^2 + 1
     */
    public void PrintLukeNumbersWithCheck(){  //метод що виводить числа з відповідною перевіркою
        long luke;
        for (int i = 0; i < N; i++) {
            if(arr[i].check()){               //перевірка чи число можна записати як w^2-1
                luke = arr[i].getNumb();
                System.out.println(i+1 +" - Luke number we can write like W^2 + 1 -- "+ luke + "\n");
            }
        }
    }
}
