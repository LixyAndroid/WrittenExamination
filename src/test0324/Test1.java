package test0324;

/**
 * @author Li Xuyang
 * @date 2020/3/24 14:49
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.run();

    }

    private  void run() {
        int index = 1;

        while (true) {

            if (index%2==1&&index%3==2&&index%5==4&&index%6==5&&index%7==0){
                break;
            }
            index+=1;

        }

        System.out.println(index);
    }
}
