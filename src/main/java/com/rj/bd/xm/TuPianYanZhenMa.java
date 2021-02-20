package com.rj.bd.xm;
/**
 * @desc 生成图片验证码的三种方式
 * @author 马兴佳
 * 
 */
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;

public class TuPianYanZhenMa {

	public static void main(String[] args) {
		//定义验证码的长和宽(第一种方法)
        //LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(300, 200);
        //将验证码写入文件
        //lineCaptcha.write(FileUtil.file("E:\\2.jpg"));
        
        
		
        //2.生成圆圈干扰的验证码(CircleCaptcha)
//        CircleCaptcha circleCaptcha = CaptchaUtil.createCircleCaptcha(200, 100);
//        circleCaptcha.write(FileUtil.file("E:\\3.jpg"));
//        Console.log("验证码生成成功了");
        
        //3.生成扭曲干扰验证码(ShearCaptcha)
      //四个参数分别为宽、高、字符数、干扰线宽度
       ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
        shearCaptcha.write(FileUtil.file("E:\\6.jpg"));
//        //输出code
       System.out.println(shearCaptcha.getCode());
        //校验
       if (!shearCaptcha.verify("1234")){
           //重新生成验证码
       	shearCaptcha.createCode();
           System.out.println(shearCaptcha.getCode());//3m4l6
            //写入
           shearCaptcha.write(FileUtil.file("E:\\6.jpg"));
          Console.log("验证码生成成功了");
        }
	}

}