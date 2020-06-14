import java.util.Date;

/**
 * @author wangzhe
 * @Create 2020-06-11 20:57
 */
public class Hello {

    private static Date date1;

    public static void main(String[] arg){
        test();

    }

    public static void test() {
        //region Description
        System.out.println("ttttt");
        System.out.println("qqqq");
        //endregion
        date1 = new Date();
        System.out.println(date1);
        System.out.println("");
        System.out.println("date1 = " + date1);
    }

    public void testUpdate(){

    }

    /**
     *id
     */
     private int id;
     /**
      *姓名
      */
     private String name;



}
