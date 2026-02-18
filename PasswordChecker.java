package com.sarvesh.javabasics;
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
┏━┓┏━┓┏━┓┏━┓╻ ╻┏━┓┏━┓╺┳┓   ┏━╸╻ ╻┏━╸┏━╸╻┏ ┏━╸┏━┓
┣━┛┣━┫┗━┓┗━┓┃╻┃┃ ┃┣┳┛ ┃┃   ┃  ┣━┫┣╸ ┃  ┣┻┓┣╸ ┣┳┛
╹  ╹ ╹┗━┛┗━┛┗┻┛┗━┛╹┗╸╺┻┛   ┗━╸╹ ╹┗━╸┗━╸╹ ╹┗━╸╹┗╸
        		""");
        System.out.print("Enter a Password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigits = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                hasUppercase = true;
            else if (Character.isLowerCase(ch))
                hasLowercase = true;
            else if (Character.isDigit(ch))
                hasDigits = true;
            else
                hasSpecial = true;
        }

        int score = 0;

        if (password.length() >= 8) score++;
        if (hasUppercase) score++;
        if (hasLowercase) score++;
        if (hasDigits) score++;
        if (hasSpecial) score++;

        if (score <= 2)
            System.out.println("Weak Password");
        else if (score <= 4)
            System.out.println("Medium Password");
        else
            System.out.println("Strong Password");

        sc.close();
    }
}
