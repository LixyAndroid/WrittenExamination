package April.test0416;

/**
 * @author Li Xuyang
 * @date 2020/4/16 15:46
 */
public class Singleton {

    private volatile static Singleton instance = null;

    //私有化构造方法 ,构造方法私有化，外部不能new
    private Singleton() {
    }

    public static Singleton getInstance() {


        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }


        }

        return instance;

    }

}
