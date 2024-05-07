package jp.co.aforce.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainfilter {
    public static void main(String[] args) {
        String csvFile = "src/jp/co/aforce/lib/input.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.lines()
              .skip(1) // ヘッダー行をスキップ
              .map(line -> line.split(","))
              .filter(fields -> fields.length == 5)
              .map(fields -> {
                  int id = Integer.parseInt(fields[0].trim());
                  String name = fields[1].trim();
                  String gender = fields[2].trim();
                  int age = Integer.parseInt(fields[3].trim());
                  String occupation = fields[4].trim();
                  return new Personnow2(id, name, gender, age, occupation);
              })
              .filter(person -> person.getGender().equals("男")) // 男性のデータのみをフィルタリング
              .map(person -> "ID:" + person.getId() + " 名前：" + person.getName() + " 性別：" + person.getGender() + " 年齢：" + person.getAge() + " 職業：" + person.getOccupation())
              .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Personnow2 {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String occupation;

    public Personnow2(int id, String name, String gender, int age, String occupation) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}
