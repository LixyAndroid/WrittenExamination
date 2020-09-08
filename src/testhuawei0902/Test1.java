package testhuawei0902;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] temp = new int[2];
            temp[0] = in.nextInt();
            temp[1] = in.nextInt();
            list.add(temp);
        }

        ArrayList<Integer> max1 = new ArrayList<>();
        ArrayList<Integer> bianhao1 = new ArrayList<>();


        ArrayList<Integer> max2 = new ArrayList<>();
        ArrayList<Integer> bianhao2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[1] == 1) {

                if (max1.size() < 3) {
                    max1.add(list.get(i)[0]);
                    bianhao1.add(i + 1);
                } else {
                    int min1 = max1.get(0);
                    int indexmin1 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (min1 > max1.get(j)) {
                            min1 = max1.get(j);
                            indexmin1 = j;
                        }

                    }
                    if (min1 < list.get(i)[0]) {
                        max1.set(indexmin1, list.get(i)[0]);
                        bianhao1.set(indexmin1, i + 1);
                    }
                }
            } else {
                if (max2.size() < 3) {
                    max2.add(list.get(i)[0]);
                    bianhao2.add(i + 1);
                } else {
                    int min2 = max2.get(0);
                    int indexmin2 = 0;
                    for (int j = 0; j < 3; j++) {
                        if (min2 > max2.get(j)) {
                            min2 = max2.get(j);
                            indexmin2 = j;
                        }

                    }
                    if (min2 < list.get(i)[0]) {
                        max2.set(indexmin2, list.get(i)[0]);
                        bianhao2.set(indexmin2, i + 1);
                    }

                }
            }

        }


        int[] ints1 = new int[3];
        int[] ints2 = new int[3];


        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < max1.size(); i++) {
            sum1 += max1.get(i);
        }

        for (int i = 0; i < max2.size(); i++) {
            sum2 += max2.get(i);
        }


        if (sum1 > sum2) {
            if (max1.size() < 3) {
                System.out.println("null");
                return;
            }

            for (int i = 0; i < bianhao1.size(); i++) {
                ints1[i] = bianhao1.get(i);
            }
            Arrays.sort(ints1);

            for (int i = 0; i < ints1.length; i++) {
                if (i < ints1.length - 1) {
                    System.out.print(ints1[i] + " ");
                } else {
                    System.out.println(ints1[i]);
                }
            }
            System.out.println(1);
            System.out.println(sum1);
        } else if (sum1 < sum2) {
            if (max2.size() < 3) {
                System.out.println("null");
                return;
            }
            for (int i = 0; i < bianhao2.size(); i++) {
                ints2[i] = bianhao2.get(i);
            }
            Arrays.sort(ints2);

            for (int i = 0; i < ints2.length; i++) {
                if (i < ints2.length - 1) {
                    System.out.print(ints2[i] + " ");
                } else {
                    System.out.println(ints2[i]);
                }
            }

            System.out.println(2);
            System.out.println(sum2);
        } else {
            if (max1.size() < 3) {
                System.out.println("null");
                return;
            }

            for (int i = 0; i < bianhao1.size(); i++) {
                ints1[i] = bianhao1.get(i);
            }
            Arrays.sort(ints1);

            for (int i = 0; i < bianhao2.size(); i++) {
                ints2[i] = bianhao2.get(i);
            }
            Arrays.sort(ints2);

            if (ints1[0] < ints2[0]) {

                for (int i = 0; i < ints1.length; i++) {
                    if (i < ints1.length - 1) {
                        System.out.print(ints1[i] + " ");
                    } else {
                        System.out.println(ints1[i]);
                    }
                }
                System.out.println(1);
                System.out.println(sum1);
            } else {

                for (int i = 0; i < ints2.length; i++) {
                    if (i < ints2.length - 1) {
                        System.out.print(ints2[i] + " ");
                    } else {
                        System.out.println(ints2[i]);
                    }
                }

                System.out.println(2);
                System.out.println(sum2);
            }

        }


    }
}
