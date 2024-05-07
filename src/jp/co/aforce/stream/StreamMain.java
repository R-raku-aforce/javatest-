package jp.co.aforce.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamMain {
    public static void main(String[] args) {
        String csvFile = "src/jp/co/aforce/lib/input.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.lines()
              .skip(1) // ヘッダー行をスキップ
              .forEach(line -> {
                  String[] fields = line.split(",");
                  if (fields.length == 5) {
                      int id = Integer.parseInt(fields[0].trim());
                      String name = fields[1].trim();
                      String gender = fields[2].trim();
                      int age = Integer.parseInt(fields[3].trim());
                      String occupation = fields[4].trim();

                      System.out.println("ID:" + id + " 名前：" + name + " 性別：" + gender + " 年齢：" + age + " 職業：" + occupation);
                  } else {
                      System.out.println("Invalid data: " + line);
                  }
              });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

