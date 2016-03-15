package ru.grishin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        java.io.File f = new java.io.File("INPUT.TXT");
        if (!f.exists()) {
            System.out.println("Входящий файл не найден.");
        } else {
            Scanner in = new Scanner(new File("INPUT.TXT"));
            while (in.hasNextLine()) {
                list.add(in.nextLine());
            }
            String[] s = list.get(0).split(" ");
            char[] ch0 = s[0].toCharArray();
            char[] ch1 = s[1].toCharArray();
            int a = 0;
            int b = 0;
            for (int i = 0; i < s[0].length(); i++) {
                if (ch0[i] == ch1[i]) {
                    a += 1;
                } else {
                    for (int j = 0; j < s[0].length(); j++) {
                        if (ch1[i] == ch0[j]) {
                            b += 1;
                        }
                    }
                }
            }
            System.out.println(a + " " + b);
            File fil = new File("OUTPUT.TXT");
            FileWriter wrt = new FileWriter(fil);
            wrt.write(a + " " + b);
            wrt.flush();
        }
    }
}