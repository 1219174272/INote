package org.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.entitys.NoteUser;
import org.com.util.NoteUtil;

public class GetMessServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		String phone = request.getParameter("phone");
		System.out.println("phone:"+phone);
		//开发者账号信息
		AccountInfo(response);
		System.err.println("----------------------------------------------------");
		String industrySMS = IndustrySMS(phone);
		//返回随机数到JSP
		response.getWriter().print(industrySMS);
	}

	/**
	 * 开发者账号信息
	 */
	public void AccountInfo(HttpServletResponse response) throws IOException {

		String operation = "/query/accountInfo";
		String accountSid = NoteUser.ACCOUNT_SID;
		String url = NoteUser.BASE_URL + operation;
		String body = "accountSid=" + accountSid + NoteUtil.createCommonParam();
		String result = NoteUtil.post(url, body);
		System.out.println("获取开发者账号信息:result:" + "\n" + result);
		
	}

	/**
	 * 验证码通知短信接口
	 */
	public String IndustrySMS(String phone) {
		String operation = "/industrySMS/sendSMS";
		String accountSid = NoteUser.ACCOUNT_SID;
		String to = phone;
		String smsContent = "【非凡科季】您的验证码为" + NoteUser.getRandnum() + "，请于10分钟内正确输入，如非本人操作，请忽略此短信。";
		String url = NoteUser.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();
		String result = NoteUtil.post(url, body);
		System.out.println("获取respDesc信息:"+result.substring(result.lastIndexOf("c")+4 , result.lastIndexOf('"')));
		System.out.println("验证码通知短信接口:result:" + "\n" + result);
		return NoteUser.getRandnum();
	}

}
