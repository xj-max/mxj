package com.rj.bd.xm;
/**
 * @desc 二维码生成
 * @author 
 * 
 */
import java.awt.Color;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

public class ErWeiMa {

	public static void main(String[] args) {
		//1.直接生成
		//QrCodeUtil.generate("https://baijiahao.baidu.com/s?id=1691957538440338215&wfr=spider&for=pc",300,300, FileUtil.file("E:\\wenzhang.jpg"));
		//Console.log("二维码成功生成！！！");
		//2.
		 QrConfig config = new QrConfig();
	        config.setMargin(3);//设置边距
	        config.setForeColor(Color.CYAN);//设置前景色
	        config.setBackColor(Color.GRAY);//设置背景色
	        config.setImg("D:\\素材\\素材\\book.jpg");//设置logo小图标

	        QrCodeUtil.generate("https://baijiahao.baidu.com/s?id=1691957538440338215&wfr=spider&for=pc",config, FileUtil.file("E:\\wenzhang3.jpg"));
	        Console.log("二维码成功生成！！！");
	}

}
