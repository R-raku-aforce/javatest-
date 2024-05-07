package jp.co.aforce.practice;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		generics<String> stringObj = new generics<>("Hello World!");
		System.out.println(stringObj.getValue());
		
		generics<Integer> intObj = new generics<>(1999);
		System.out.println(intObj.getValue());
		
	}

}
