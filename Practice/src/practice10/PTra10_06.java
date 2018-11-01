package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
		car1.color = "赤";
		car1.gasoline = 60;


		Car car2 = new Car();
		car2.color = "青";
		car1.gasoline = 70;


		Car car3 = new Car();
		car3.color = "緑";
		car1.gasoline = 40;

		int sum = 0;

		int count = 0;

		// 目的地までの距離
		final int distance = 300;



		while(true) {

			int modori = car1.run();
			count++;

			sum += modori ;
			System.out.println(sum);

			if(sum>distance) {
				System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
				break;
			}


		}

		while(true) {

			int modori = car2.run();
			count++;

			sum += modori ;
			System.out.println(sum);

			if(sum>distance) {
				System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
				break;
			}


		}

		while(true) {

			int modori = car3.run();
			count++;

			sum += modori ;
			System.out.println(sum);

			if(sum>distance) {
				System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
				break;
			}


		}
	}
}
