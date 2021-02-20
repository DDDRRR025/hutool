package DRY_Test.pinyin;

import cn.hutool.extra.pinyin.PinyinUtil;
import cn.hutool.extra.pinyin.engine.pinyin4j.Pinyin4jEngine;

public class Test {
	public static void main(String[] args) {
//		获取拼音
		// "ni hao"
		String pinyin = PinyinUtil.getPinyin("你好", " ");
	System.out.println(pinyin);
//		获取拼音首字母
		// "h, s, d, y, g"
		String result = PinyinUtil.getFirstLetter("H是第一个", ", ");

//		自定义拼音库（拼音引擎）
		Pinyin4jEngine engine = new Pinyin4jEngine();

		// "ni hao h"
		String pinyin2 = engine.getPinyin("你好h", " ");

		
	}
}
