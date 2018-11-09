/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		// file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
		ArrayList<Player> array = new ArrayList<Player>();

		try(Scanner scanner = new Scanner (new File("file/BestElevenCandidate.csv"))){



		 while (scanner.hasNext()) {
             String line = scanner.nextLine();

             Player player = new Player();

             String[] temp = line.split(",");

             player.setPosition(temp[0]);
             player.setName(temp[1]);
             player.setCountry(temp[2]);
             player.setTeam(temp[3]);


             array.add(player);

         }
		}catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		Collections.shuffle(array);


        for(int i = 0; i<array.size(); i++) {
        	if(array.get(i).getPosition().equals("GK") && gkCount < 1) {
        		System.out.println(array.get(i));
        		gkCount++;
        	}


        	if(array.get(i).getPosition().equals("DF") && dfCount < 4) {
        		System.out.println(array.get(i));
        		dfCount++;
        	}

        	if(array.get(i).getPosition().equals("MF") && mfCount < 4) {
        		System.out.println(array.get(i));
        		mfCount++;
        	}
        	if(array.get(i).getPosition().equals("FW") && fwCount < 4) {
        		System.out.println(array.get(i));
        		fwCount++;
        	}
        }
	}
}
