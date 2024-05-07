package jp.co.aforce.practice.Exception;

public class JavaTest {
    public static void main(String[] args) throws AforceException2, AforceException1 {
    	testMethod();
    }	 
    public static void testMethod() throws AforceException1 {
        try {
            // 何らかの処理
            throw new AforceException1("AforceException1エラーが発生しました");
        } catch (AforceException1 e) {
            throw e;
        }
     }
}