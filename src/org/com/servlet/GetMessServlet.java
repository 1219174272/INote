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
		//�������˺���Ϣ
		AccountInfo(response);
		System.err.println("----------------------------------------------------");
		String industrySMS = IndustrySMS(phone);
		//�����������JSP
		response.getWriter().print(industrySMS);
	}

	/**
	 * �������˺���Ϣ
	 */
	public void AccountInfo(HttpServletResponse response) throws IOException {

		String operation = "/query/accountInfo";
		String accountSid = NoteUser.ACCOUNT_SID;
		String url = NoteUser.BASE_URL + operation;
		String body = "accountSid=" + accountSid + NoteUtil.createCommonParam();
		String result = NoteUtil.post(url, body);
		System.out.println("��ȡ�������˺���Ϣ:result:" + "\n" + result);
		
	}

	/**
	 * ��֤��֪ͨ���Žӿ�
	 */
	public String IndustrySMS(String phone) {
		String operation = "/industrySMS/sendSMS";
		String accountSid = NoteUser.ACCOUNT_SID;
		String to = phone;
		String smsContent = "���Ƿ��Ƽ���������֤��Ϊ" + NoteUser.getRandnum() + "������10��������ȷ���룬��Ǳ��˲���������Դ˶��š�";
		String url = NoteUser.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();
		String result = NoteUtil.post(url, body);
		System.out.println("��ȡrespDesc��Ϣ:"+result.substring(result.lastIndexOf("c")+4 , result.lastIndexOf('"')));
		System.out.println("��֤��֪ͨ���Žӿ�:result:" + "\n" + result);
		return NoteUser.getRandnum();
	}

}
