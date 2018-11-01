package practice10;

public class Car {
	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	int serialNo;
	String color;
	int gasoline;

	int run(){
		this.gasoline--;

		if(gasoline < 0) {
			System.out.println("もう進めない");
			return -1;
		}

		int limitNumber = 15;
		int index = new java.util.Random().nextInt(limitNumber)+1;
		return index;






	}
}
