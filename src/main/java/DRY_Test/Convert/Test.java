package DRY_Test.Convert;

import java.util.Date;
import java.util.List;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.CharsetUtil;

/**
 * @desc 类型转换
 *
 */
public class Test {
	public static void main(String[] args) {
		// 常见类型转换
		int a = 1;
		// aStr为"1"
		String aStr = Convert.toStr(a);
		
		long[] b = { 1, 2, 3, 4, 5 };
		// bStr为："[1, 2, 3, 4, 5]"
		String bStr = Convert.toStr(b);
		
		// 转换为指定类型数组
		String[] bArr = { "1", "2", "3", "4" };
		// 结果为Integer数组
		Integer[] intArray = Convert.toIntArray(bArr);
		long[] c = { 1, 2, 3, 4, 5 };
		// 结果为Integer数组
		Integer[] intArray2 = Convert.toIntArray(c);

		// 转换为日期对象
		String Stra = "2017-05-06";
		Date value = Convert.toDate(Stra);

		// 转换为集合
		Object[] aObj = { "a", "你", "好", "", 1 };
		List<?> listA = Convert.convert(List.class, aObj);
		// 从4.1.11开始可以这么用
		List<?> listB = Convert.toList(a);

		// 半角转全角
		String ajiao = "123456789";
		// 结果为："１２３４５６７８９"
		String sbc = Convert.toSBC(ajiao);
		// 全角转半角
		String bjiao = "１２３４５６７８９";
		// 结果为"123456789"
		String dbc = Convert.toDBC(bjiao);

		// 16进制转换
		String aStri = "我是个字符串";
		// 结果："e68891e698afe4b8aae5ad97e7aca6e4b8b2"
		String hex = Convert.toHex(aStri, CharsetUtil.CHARSET_UTF_8);
		// 转换16进制
		String hex2 = "e68891e698afe4b8aae5ad97e7aca6e4b8b2";
		// 结果为："我是一个小小的可爱的字符串" 老版本
		String raw = Convert.hexStrToStr(hex2, CharsetUtil.CHARSET_UTF_8);
		// 注意：在4.1.11之后hexStrToStr将改名为hexToStr 新版本
		String raw2 = Convert.hexToStr(hex2, CharsetUtil.CHARSET_UTF_8);
		// Unicode和字符串转换
		String aStrin = "我是一个小小的可爱的字符串";
		// 结果为："\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32"
		String unicode = Convert.strToUnicode(aStrin);
		// 结果为："我是一个小小的可爱的字符串"
		String raw3 = Convert.unicodeToStr(unicode);

	}
}
