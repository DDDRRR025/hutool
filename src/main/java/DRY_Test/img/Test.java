package DRY_Test.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
/**
 * @desc 图片工具
 */
public class Test {
	public static void main(String[] args) {
//		scale 缩放图片
		ImgUtil.scale(
			    FileUtil.file("e:/wyz.png"), 
			    FileUtil.file("e:/wyz_result.png"), 
			    0.5f//缩放比例
			);
		
//		cut 剪裁图片
		ImgUtil.cut(
			    FileUtil.file("e:/wyz.png"), 
			    FileUtil.file("e:/wyz_result.png"), 
			    new Rectangle(200, 200, 100, 100)//裁剪的矩形区域
			);
		
//		slice 按照行列剪裁切片（将图片分为20行和20列）
		ImgUtil.slice(FileUtil.file("e:/wyz.png"), FileUtil.file("e:/dest/"), 10, 10);
		
//		convert 图片类型转换，支持GIF->JPG、GIF->PNG、PNG->JPG、PNG->GIF(X)、BMP->PNG等
		ImgUtil.convert(FileUtil.file("e:/wyz.png"), FileUtil.file("e:/wzyConvert.jpg"));
		
//		gray 彩色转为黑白
		ImgUtil.gray(FileUtil.file("e:/wyz.png"), FileUtil.file("e:/wyz_result.png"));

//		pressText 添加文字水印
		ImgUtil.pressText(//
			    FileUtil.file("e:/wyz.png"), //
			    FileUtil.file("e:/wyz_result.png"), //
			    "版权所有", Color.WHITE, //文字
			    new Font("黑体", Font.BOLD, 100), //字体
			    0, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
			);
//		flip 水平翻转图片
		ImgUtil.flip(FileUtil.file("e:/wyz.png"), FileUtil.file("e:/wyz_result.png"));

	}
}
