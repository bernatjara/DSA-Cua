import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new LaMevaClase(5);
        try {



        q.push(1);
            System.out.println(q.size());
        q.push(2);
            System.out.println(q.size());
/*        q.push(3);
            System.out.println(q.size());
        q.push(4);
            System.out.println(q.size());
        q.push(5);
            System.out.println(q.size());

          q.push(6);
*/

        }
        catch (FullQueueException fullExp) {
            //
            System.out.println("EXCEPCIÓ!!");
            fullExp.printStackTrace();
        }
        /*catch (EmptyQueueException empty) {
            System.out.println("EXCEPCIÓ!!");
            empty.printStackTrace();
        }*/

    }
}
