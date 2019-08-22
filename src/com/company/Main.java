package com.company;



import java.io.*;



public class Main {

    public static void main(String[] args) {



        String s;

        int a = 0;

        int b = 0;



        System.out.println("Вывод текста из файла: ");

        File file;
        file = new File("C:\\Users\\user\\Desktop\\text.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((s = br.readLine()) != null) {



                System.out.println(s);

                ++a;

            }



        } catch (IOException exc) {

            System.out.println("Ошибка :" + exc);

        }



        System.out.println(a);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Текст: ");



        try (FileWriter fw = new FileWriter(file)) {



            do {

                b++;

                System.out.println(": ");

                s = br.readLine();



                if (b > a) break;

                s = s + "\r\n";

                fw.write(s);

            } while (b < a);



        } catch (IOException exc) {

            System.out.println("Ошибка: " + exc);

        }



        System.out.println(b);



    }



}


