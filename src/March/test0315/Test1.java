package March.test0315;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Li Xuyang
 * @date 2020/3/15 19:03
 */
public class Test1 {
    public static void main(String[] args) {
        run1();
    }

    public static void run1() {
        Scanner in = new Scanner(System.in);

        ArrayList<String> userLeixingList = new ArrayList<>();
        ArrayList<String> userFileList = new ArrayList<>();
        HashMap<String, String> userMap = new HashMap<>();

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {

            String userLeixing = in.next();


            String userFile = in.next();

            if (!userMap.containsKey(userFile)) {
                userMap.put(userFile, userLeixing);
                userLeixingList.add(userLeixing);
                userFileList.add(userFile);
            } else {
                if (userLeixing.charAt(1) > userMap.get(userFile).charAt(1)) {
                    userLeixing = userMap.get(userFile) + " " + userLeixing;
                } else {
                    userLeixing = userLeixing + " " + userMap.get(userFile);
                }

                userLeixingList.add(userLeixing);
                userMap.put(userFile, userLeixing);
            }


        }

        for (int i = 0; i < userFileList.size(); i++) {
            System.out.println(userFileList.get(i) + " " + userMap.get(userFileList.get(i)));

        }

in.close();
    }
}
