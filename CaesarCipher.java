

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int shift, i, n, ans;
        String str;
        String str1 = "";
        System.out.println("Enter The String To be Encrypted:");
        str = sc.nextLine();
        str = str.toLowerCase();
        n = str.length();
        char ch1[] = str.toCharArray();
        char ch3;
        System.out.println("String To Be Encrypted:" + str.toUpperCase());
        System.out.println("Enter A Numeric Key:");
        shift = sc.nextInt();

        System.out.println();
        System.out.print("Encrypted text is:");
        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                ch3 = (char) (((int) ch1[i] + shift - 97) % 26 + 97);
                str1 = str1 + ch3;
            }
        }
        System.out.println(str1.toUpperCase());

        System.out.println("Encrypt Again? \n"
                + "[1] Yes \n"
                + "[2] No");
        ans = sc.nextInt();
        if (ans == 2) {
            System.exit(0);
        }
        while (ans == 1) {
            Scanner sca = new Scanner(System.in);
            int shift1, i1, n1, ans1;
            String strt;
            String str11 = "";
            System.out.println("Enter The String To be Encrypted:");
            strt = sca.nextLine();
            strt = strt.toLowerCase();
            n1 = strt.length();
            char ch11[] = strt.toCharArray();
            char ch31;
            System.out.println("String To Be Encrypted:" + strt.toUpperCase());
            System.out.println("Enter A Numeric Key:");
            shift1 = sca.nextInt();

            System.out.println();
            System.out.print("Encrypted text is:");
            for (i1 = 0; i1 < n1; i1++) {
                if (Character.isLetter(ch11[i1])) {
                    ch31 = (char) (((int) ch11[i1] + shift1 - 97) % 26 + 97);
                    str11 = str11 + ch31;
                }
            }
            System.out.println(str11.toUpperCase());

            System.out.println("Encrypt Again? \n"
                    + "[1] Yes \n"
                    + "[2] No");
            ans1 = sc.nextInt();
            if (ans1 == 2) {
                System.exit(0);
            }
        }
    }
}
