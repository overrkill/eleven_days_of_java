import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class test{
   int x =1 ;
}
public class DayNine extends test {

    static  int cnt = 0 ;
    DayNine(int x){
        super();
        super.x = x;
        cnt++;
    }
    static void disp(){
        System.out.println(cnt);
    }
    public static void main(String... args){
        DayNine a = new DayNine(10);
        System.out.println(a.x);
        System.out.println("hashmap");
        HashMap e = new HashMap();
        e.put("s",1);
        e.remove("a");
        System.out.println(e);
        // obj
        DayNine o1 = new DayNine(10);
        DayNine o2 = new DayNine(10);

        o2.disp();

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
//        cant do string and int sorting
//        al.add("new");
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        String bob = new String("bob");
        String notBob = bob;
        System.out.println((bob=="bob")+""+(bob.equals(notBob)));

// String Buffer
        StringBuffer s1 = new StringBuffer("new");
        StringBuffer s2 = s1.append("ab");
        System.out.println(s2);

    }
}
