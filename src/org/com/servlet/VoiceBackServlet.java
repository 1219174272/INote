package org.com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.com.entitys.NoteUser;
import org.com.entitys.RespCode;
import org.com.entitys.VoiceBackRep;
import org.com.entitys.VoiceBackResp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * ������֤��״̬֪ͨ�ӿ�
 */
public class VoiceBackServlet extends HttpServlet{

	private static final long serialVersionUID = -2119868200097964820L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// ��ȡ�������
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String str = null;
		StringBuffer reqBody = new StringBuffer();
		while ((str = reader.readLine()) != null)
		{
			reqBody.append(str);
		}
		System.out.println("�յ�����" + reqBody);

		// ������ע���Ӧ��bean
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		VoiceBackRep voiceCallback = gson.fromJson(reqBody.toString(), VoiceBackRep.class);

		// �ж�ǩ���Ƿ���ȷ
		String sig = DigestUtils.md5Hex(NoteUser.ACCOUNT_SID + NoteUser.AUTH_TOKEN + voiceCallback.getTimestamp());
		if (sig.equals(voiceCallback.getSig()))
		{
			System.out.println("ǩ����ȷ��");
		} else
		{
			System.out.println("ǩ������");
			VoiceBackResp voiceCallbackResp = new VoiceBackResp();
			voiceCallbackResp.setRespCode(RespCode.SIGN_ERROR);
			String respStr = gson.toJson(voiceCallbackResp);
			System.out.println("���ص�����:" + respStr);
			response.getWriter().write(respStr);
			return;
		}

		// TODO ͨ��callId�ж��Ƿ��ظ�֪ͨ

		// TODO ҵ���������߸����Լ�������ʵ��

		// ��Ӧ
		VoiceBackResp voiceCallbackResp = new VoiceBackResp();
		voiceCallbackResp.setRespCode(RespCode.SUCCESS);
		String respStr = gson.toJson(voiceCallbackResp);
		System.out.println("���ص�����:" + respStr);

		response.getWriter().write(respStr);
	}
	
}
