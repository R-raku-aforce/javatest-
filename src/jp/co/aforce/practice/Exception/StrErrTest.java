package jp.co.aforce.practice.Exception;

public class StrErrTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		strCheck(null);
	}
	
	static void strCheck(String str) {
		if(str.equals("")) {
			System.out.println("Stringはnullでした。");
		}
	}
}
//例外ー練習問題３
//nullの文字列オブジェクトに対して"equals"メソッドを呼び出そうとしているので、エラーが発生しました。
//このオブジェクトは実際にnullです。

//例外ー練習問題４
//・変数をnull以外に初期化すること
//・配列は空で設定する
//・戻り値はnullを返さない
//・optionaklを使う。戻り値を自動的に判断できる。
