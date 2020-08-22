package test0821tengxun;

/**
 * @author Li Xuyang
 * @date 2020/8/21 20:02
 */
public class LRUByXuyang {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        StringBuilder strbuilder = new StringBuilder();
        String str = "12387";

        strbuilder.append(put(str, "4"));

        System.out.println(strbuilder);
        String res1 = get(strbuilder.toString(), "3");
        System.out.println(res1);
    }

    public static String get(String str, String str2) {
        if (str.contains(str2)) {
            return str2;
        } else {
            return "";
        }
    }

    public static String put(String str, String str2) {

        StringBuilder strBuider = new StringBuilder(str);
        if (!str2.isEmpty()){
            strBuider.deleteCharAt(0);

        }

        StringBuilder res = new StringBuilder();
        res.append(str2);
        res.append(strBuider);
        return res.toString();

    }
}
