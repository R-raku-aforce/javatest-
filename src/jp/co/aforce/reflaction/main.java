package jp.co.aforce.reflaction;	

import java.lang.reflect.Field;

public class main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO 自動生成されたメソッド・スタブ

		TestEntity entity = new TestEntity("123","Honey");
//		entity.setId("4520");
//		entity.setName("Bill");
		
//		String id = entity.getId();
//		String name = entity.getName();
//		
//		System.out.println(id + "" + name);
		
        // フィールドの値を設定する
        Field idField = TestEntity.class.getDeclaredField("id");
        
        // プライベートフィールドにアクセスするため
        idField.setAccessible(true); 
        idField.set(entity, "4520");

        Field nameField = TestEntity.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(entity, "Bill");

        // フィールドの値を取得する
        String idValue = (String) idField.get(entity);
        String nameValue = (String) nameField.get(entity);

        System.out.println("ID: " + idValue);
        System.out.println("Name: " + nameValue);
        
        //練習問題４
        //アノテーションはソースコードにメタデータを追加するための機能です。特性を自由に指定できます。
        //＠Overrideなどを使うとコードの品質を向上できます。
        //ミスを防ぎながら、コードの解析の補助にも役に立つ。
		//構文：＠アノテーション型/　＠アノテーション型()
        //パッケージ、クラス、メソッド、フィールド、コンストラクタート変数の前に記述する。
	}

}
