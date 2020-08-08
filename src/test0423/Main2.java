package test0423;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextDouble()) {

            double huobi = in.nextDouble();

            String huoString = "";

            huoString = new DecimalFormat(",000.00").format(huobi);



            if (huobi<0){
                if (huoString.charAt(1)=='0'&&huoString.charAt(2)!='0'){
                    huoString ="-"+ huoString.substring(2);
                }else if (huoString.charAt(1)=='0'&&huoString.charAt(2)=='0'){
                    huoString = "-"+huoString.substring(3);
                }

            }else {
                if (huoString.charAt(0)=='0'&&huoString.charAt(1)!='0'){
                    huoString = huoString.substring(1);
                }else if (huoString.charAt(0)=='0'&&huoString.charAt(1)=='0'){
                    huoString = huoString.substring(2);
                }
            }



            if (huobi < 0.01&&huobi>0) {

                huoString = "$0.00";
            } else if (huoString.charAt(0) == '-') {

                huoString = "($" + huoString.substring(1) + ")";

            } else {
                huoString = "$" + huoString;
            }

            System.out.println(huoString);

        }
    }


}
