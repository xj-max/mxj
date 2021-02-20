package com.rj.bd.xm;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

/**
 * @desc使用hutool工具发送邮件
 * @author 马兴佳
 *
 */
public class Email {

	public static void main(String[] args) {
		MailAccount account = new MailAccount();
		//1.传入邮件服务器的SMTP地址，可选，默认为smtp.<发件人邮箱后缀>
        account.setHost("smtp.qq.com");
        //2.邮件服务器的SMTP端口，可选，默认25
        account.setPort(25);
        account.setAuth(true);
        //3.发件人必须正确，否则发送失败）
        account.setFrom("1022602075@qq.com");
        //4. 用户名，默认为发件人邮箱前缀
        account.setUser("1022602075");
        //5.授权码
        account.setPass("bgvbaxpfxyeebfgj");

	     MailUtil.send(account,CollUtil.newArrayList("1022602075@qq.com"), "测试", "邮件来自Hutool测试", false);
	     Console.log("邮件发送成功");
}
}
