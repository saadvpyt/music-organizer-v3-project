
/**
 * Write a description of class answers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class answers
{
    // question 28
    //for (String filename : tracks)
    // question 29
    //while (!found)
    //found = true;
    
    //question 30
    public void multiplesOfFive(){
        int a = 10;
        int b = 95;
        while (a<b){
            if (a%5==0){
                System.out.println(a);
            }
            a = a + 1;
        }
    }
    // question 31
        public void sumOf1To10(){
        int a = 1;
        int b = 10;
        int sum = 0;
        while (a<=b){
            sum = sum + a;
            a = a + 1;
        }
        System.out.println(sum);
    }
    
    //question 32
    public void sum(int a,int b){
        int sum = 0;
        while (a<=b){
            sum = sum + a;
            a = a + 1;
        }
    }
}
