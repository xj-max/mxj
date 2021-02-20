package com.rj.bd.xm;
/**
 * @desc hutool中图片工具中的九个使用方法
 * @author 马兴佳
 * 
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;

public class Picture {

	public static void main(String[] args) throws IOException {
		//1.scale 缩放图片
		ImgUtil.scale(
				 FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/qq男.jpg"), 
				 FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/qq男22.jpg"), 
			 0.5f//缩放比例
				);
		Console.log("图片缩放成功！！！");
		
		//2.裁剪图片 cut
//		ImgUtil.cut(
//				 FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/qq男2.jpg"), 
//				 FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/qq男3.jpg"), 
//				 new Rectangle(1200, 1200, 1000, 1000)//裁剪的矩形区域
//				);
//		Console.log("图片裁剪成功！！！");
//		
		
		//3.slice 按照行列裁剪切片
//		ImgUtil.slice(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/qq女.jpg"), FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/"), 100, 100);
//		Console.log("图片裁剪成功！！！");
//		
		//4.convert 图片类型转换，支持GIF->JPG、GIF->PNG、PNG->JPG、PNG->GIF(X)、BMP->PNG等
//		ImgUtil.convert(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/1.jpg"), FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/12.png"));
//		Console.log("图片类型转换成功！！！");
		
		//5.gray 彩色转为黑白
//		ImgUtil.gray(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/666.jpg"), FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/88.jpg"));
//		Console.log("图片彩色转为黑白转换成功！！！");
		
		//6.pressText 添加文字水印
//		ImgUtil.pressText(//
//			    FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/666.jpg"), //
//			    FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/99.jpg"), //
//			    "盗版必究", Color.RED, //文字
//			    new Font("黑体", Font.BOLD, 100), //字体
//			    0, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
//			    0, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
//			    0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
//			);
//		Console.log("图片添加水印成功！！！");
		
		
		//7.pressImage 添加图片水印
		
//		ImgUtil.pressImage(
//			    FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/666.jpg"), 
//			    FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/00.jpg"), 
//			    ImgUtil.read(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/_r0_c1.jpg")), //水印图片
//			    60, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
//			    -60, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
//			    0.8f//水印图片的透明度
//
//			);
//		Console.log("图片添加图片水印成功！！！");
		
		//8.rotate 旋转图片
		// 旋转180度
//		BufferedImage image = (BufferedImage) ImgUtil.rotate(ImageIO.read(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/_r0_c1.jpg")), 180);
//		ImgUtil.write(image, FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/11.jpg"));
//		Console.log("图片旋转成功！！！");
	
		
		//9.flip 水平翻转图片
//		ImgUtil.flip(FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/_r0_c1.jpg"), FileUtil.file("C:/Users/马兴佳/Desktop/杂项/照片/test/22.jpg"));
//		Console.log("图片水平翻转成功！！！");
	
	}

}
