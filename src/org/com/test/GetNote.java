package org.com.test;

import java.util.Date;
import java.util.Random;

import org.com.entitys.NoteUser;
import org.com.util.NoteUtil;
import org.junit.Test;

/**
 * 获取短信信息与验证码
 */
public class GetNote {
	
	//API开发者中心 Https API
	
	/**
	 * 开发者账号信息
	 */
	@Test
	public void AccountInfo(){
		
		//开发者账号信息查询后缀
		String operation = "/query/accountInfo";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//开发者账号信息请求地址
		String url = NoteUser.BASE_URL+ operation;
		//post数据
		String body = "accountSid=" + accountSid + NoteUtil.createCommonParam();
		//提交请求
		String result  = NoteUtil.post(url, body);
		
		System.out.println("获取开发者账号信息:result:" + "\n" + result);
	}
	
	/**
	 * 验证码通知短信接口
	 */
	@Test
	public void IndustrySMS(){
		
		//验证码通知短信接口后缀
		String operation = "/industrySMS/sendSMS";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//接收号码
		String to = "152********";
		//短信内容(短信签名+短信内容)必须根据模板创建(短信签名+短信内容)必须根据模板创建
		String smsContent = "【非凡科季】您的验证码为"+NoteUser.getRandnum()+"，请于10分钟内正确输入，如非本人操作，请忽略此短信。";
		//验证码通知短信接口请求地址
		String url = NoteUser.BASE_URL + operation;
		//post数据
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// 提交请求
		String result = NoteUtil.post(url, body);
		
		System.out.println("验证码通知短信接口:result:" + "\n" + result);
		
	}
	
	/**
	 * 会员营销短信接口
	 */
	public void AffMarkSMS(){
		
		//会员营销短信接口后缀
		String operation = "/affMarkSMS/sendSMS";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//接收号码
		String to = "152********";
		//短信内容(短信签名+短信内容)必须根据模板创建
		String smsContent = "【秒嘀科技】您的优惠券就快过期啦！不想白白浪费，就快来使用吧！戳： m.miaodiyun.com 使用！回TD退订。";
		//会员营销短信接口请求地址
		String url = NoteUser.BASE_URL + operation;
		//post数据
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// 提交请求
		String result = NoteUtil.post(url, body);
		System.out.println("会员营销短信接口:result:" + "\n" + result);
	}
	
	/**
	 * 短信邮验证码通知短信接口
	 */
	public void IndustryEmailSMS(){
		//短信邮验证码通知短信接口后缀
		String operation = "/industryEmailSMS/sendEmailSMS";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//接收号码
		String to = "152********";
		//短信内容(短信签名+短信内容)必须根据模板创建
		String smsContent = "【秒嘀科技】您在秒嘀注册的验证码为"+NoteUser.getRandnum()+"。";
		//短信邮验证码通知短信接口请求地址
		String url = NoteUser.BASE_URL + operation;
		//post数据
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// 提交请求
		String result = NoteUtil.post(url, body);
		System.out.println("短信邮验证码通知短信接口:result:" + "\n" + result);
	}
	
	/**
	 * 短信邮会员营销短信接口
	 */
	public void AffMarkEmailSMS(){
		//短信邮会员营销短信接口后缀
		String operation = "/affMarkEmailSMS/sendEmailSMS";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//接收号码
		String to = "152********";
		//短信内容(短信签名+短信内容)必须根据模板创建
		String smsContent = "【秒嘀科技】您的优惠券就快过期啦！不想白白浪费，就快来使用吧！戳： m.miaodiyun.com 使用！回TD退订 。";
		//短信邮会员营销短信接口请求地址
		String url = NoteUser.BASE_URL + operation;
		//post数据
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent
				+ NoteUtil.createCommonParam();

		// 提交请求
		String result = NoteUtil.post(url, body);
		System.out.println("短信邮会员营销短信接口:result:" + "\n" + result);
	}
	
	/**
	 * 语音验证码
	 */
	public void VoiceCode(){
		
		//语音验证码后缀
		String operation = "/call/voiceCode";
		//用户账号ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//验证码内容
		String verifyCode = NoteUser.getRandnum();
		//接收号码
		String called = "152********";
		//被叫侧显示的号码。
		String callDisplayNumber = "";
		//语音播放次数(1~3)
		String playTimes = "2";
		//语音验证码状态通知回调地址（必须符合URL规范），平台向该Url发送呼叫结果通知
		String respUrl = "";
		//语音验证码请求地址
		String url = NoteUser.BASE_URL + operation;
		//post数据
		String body = "accountSid=" + accountSid + "&verifyCode=" + verifyCode + "&called=" + called + "&callDisplayNumber=" + callDisplayNumber + "&playTimes=" + playTimes + "&respUrl=" + respUrl + NoteUtil.createCommonParam();

		// 提交请求
		String result = NoteUtil.post(url, body);
		System.out.println("语音验证码:result:" + "\n" + result);
	}

	@Test
	public void Test1(){
		String fileName=new Date().getTime()+""+new Random().nextInt(10000);
		System.out.println(fileName);
	}
	
}
