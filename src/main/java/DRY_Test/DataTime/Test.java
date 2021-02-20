package DRY_Test.DataTime;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;
import cn.hutool.core.date.TimeInterval;

/**
 * @Desc 日期类
 *
 */
public class Test {
	public static void main(String[] args) {
		// Date、long、Calendar之间的相互转换
		// 当前时间
		Date date = DateUtil.date();
		// 当前时间
		Date date2 = DateUtil.date(Calendar.getInstance());
		// 当前时间
		Date date3 = DateUtil.date(System.currentTimeMillis());
		// 当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String now = DateUtil.now();
		// 当前日期字符串，格式：yyyy-MM-dd
		String today = DateUtil.today();

		// 字符串转日期
		String dateStr = "2017-03-01";
		Date date21 = DateUtil.parse(dateStr);
		Date date22 = DateUtil.parse(dateStr, "yyyy-MM-dd");

		// 格式化日期输出
		Date date31 = DateUtil.parse(dateStr);

		// 结果 2017/03/01
		String format = DateUtil.format(date31, "yyyy/MM/dd");

		// 常用格式的格式化，结果：2017-03-01
		String formatDate = DateUtil.formatDate(date31);

		// 结果：2017-03-01 00:00:00
		String formatDateTime = DateUtil.formatDateTime(date31);

		// 结果：00:00:00
		String formatTime = DateUtil.formatTime(date31);

		// 获取Date对象的某个部分
		Date date41 = DateUtil.date();
		// 获得年的部分
		DateUtil.year(date41);
		// 获得月份，从0开始计数
		DateUtil.month(date41);
		// 获得月份枚举
		DateUtil.monthEnum(date41);

		// 开始和结束时间
		String dateStr51 = "2017-03-01 22:33:23";
		Date date51 = DateUtil.parse(dateStr51);

		// 一天的开始，结果：2017-03-01 00:00:00
		Date beginOfDay = DateUtil.beginOfDay(date51);

		// 一天的结束，结果：2017-03-01 23:59:59
		Date endOfDay = DateUtil.endOfDay(date51);

		// 日期时间偏移
		String dateStr61 = "2017-03-01 22:33:23";
		Date date61 = DateUtil.parse(dateStr61);

		// 结果：2017-03-03 22:33:23
		Date newDate = DateUtil.offset(date61, DateField.DAY_OF_MONTH, 2);

		// 常用偏移，结果：2017-03-04 22:33:23
		DateTime newDate2 = DateUtil.offsetDay(date61, 3);

		// 常用偏移，结果：2017-03-01 19:33:23
		DateTime newDate3 = DateUtil.offsetHour(date61, -3);
		// 昨天
		DateUtil.yesterday();
		// 明天
		DateUtil.tomorrow();
		// 上周
		DateUtil.lastWeek();
		// 下周
		DateUtil.nextWeek();
		// 上个月
		DateUtil.lastMonth();
		// 下个月
		DateUtil.nextMonth();

		// 日期时间差
		String dateStr71 = "2017-03-01 22:33:23";
		Date date71 = DateUtil.parse(dateStr71);

		String dateStr72 = "2017-04-01 23:33:23";
		Date date72 = DateUtil.parse(dateStr72);

		// 相差一个月，31天
		long betweenDay = DateUtil.between(date71, date72, DateUnit.DAY);

		// 计时器
		TimeInterval timer = DateUtil.timer();
		timer.interval();// 花费毫秒数
		timer.intervalRestart();// 返回花费时间，并重置开始时间
		timer.intervalMinute();// 花费分钟数

		// 星座属相
		// "水瓶座"
		String zodiac = DateUtil.getZodiac(Month.FEBRUARY.getValue(), 16);

		// "蛇"
		String chineseZodiac = DateUtil.getChineseZodiac(2001);

		// 年龄
		DateUtil.ageOfNow("2001-02-16");

		// 是否闰年
		DateUtil.isLeapYear(2021);

	}
}
