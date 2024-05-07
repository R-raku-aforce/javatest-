package jp.co.aforce.lib;

//ライブラリー練習問題１
//・Java.utilパッケージ
//・Java.ioパッケージ

//ライブラリー練習問題３
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderWithArrays {
    public static void main(String[] args) {
        String csvFile = "src/jp/co/aforce/lib/input.csv";
        String line;
        boolean skipHeader = true;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue; // 跳过标题行
                }

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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}









