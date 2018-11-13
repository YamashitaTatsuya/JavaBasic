/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b1 = true;
		Boolean b2 = b1;

		byte by1 = 100;
		Byte by2 =by1;

		short s1 = 300;
		Short s2 = s1;

		char c1 = '日';
		Character c2 = c1;

		int i1 = 1000;
		Integer i2 = i1;

		long l1 = 2000L;
		Long l2 = l1;

		float f1 = 3.14F;
		Float f2 = f1;


		double d1 = 453.592;
		Double d2 = d1;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください


		System.out.println(b2);
        System.out.println(by2);
        System.out.println(s2);
        System.out.println(c2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
	}
}
