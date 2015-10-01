package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * <pre>
 * org.dimigo.collection
 *  ㄴMelonGenreChart
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class MelonGenreChart {
		public static void main(String[] args) {
			Map<String, List<Music>> map = new HashMap<String, List<Music>>();
			
			List<Music> ballad = Arrays.asList(
					new Music("내 첫사랑", "베리굿"),
					new Music("또 다시 사랑", "임창정"),
					new Music("부산에 가면", "박진영")
			);

			List<Music> dance = Arrays.asList(
					new Music("커피", "유재환, 김예림"),
					new Music("다 잘될거야", "쿨")
			);
			
			map.put("발라드", ballad);
			map.put("댄스", dance);

			System.out.println("----- << 멜론 장르별 챠트 >> -----");
			printMap(map);
			
			System.out.println("----- << 3위 발라드곡 변경 >> -----");
			ballad.set(2, new Music("지우고 지워도", "차수경"));
			printMap(map);

			System.out.println("----- << 1위 발라드곡 삭제 >> -----");
			ballad.remove("1");
			printMap(map);
		}

		public static void printMap(Map<String, List<Music>> map)	{
			int i=0;
			for(String kind : map.keySet())
			{
				System.out.println("[" + kind + "]");
				for(Music music : map.get(kind))	{
					i++;
					System.out.println(i + ". " + music);
				}
				i=0;
			}
		}
}