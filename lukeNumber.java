/**
 * The Luke Number class
 * has the number itself , constructor, getter
 * and a method that checks whether this number can be written as W^2+1
 */
public class lukeNumber {
    private long numb;  //число люка

    /**
     * Constructor
     * @param numb generated Luke number
     */
    lukeNumber(long numb){
        this.numb = numb;
    } //конструктор що записує число

    /**
     * Getter
     * @return luke number
     */
    public long getNumb() {
        return numb;
    } //гетер що повертає число

    /**
     * method checks whether a number can be written as W^2+1
     * @return true or false if possible or not possible
     */
    public boolean check(){  //перевірка що повертає true якщо число можна записати як W^2-1
        if((Math.sqrt((double)numb-1))%1 == 0){
            return true;
        }
        return false;
    }
}
