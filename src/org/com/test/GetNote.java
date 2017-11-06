package org.com.test;

import java.util.Date;
import java.util.Random;

import org.com.entitys.NoteUser;
import org.com.util.NoteUtil;
import org.junit.Test;

/**
 * ��ȡ������Ϣ����֤��
 */
public class GetNote {
	
	//API���������� Https API
	
	/**
	 * �������˺���Ϣ
	 */
	@Test
	public void AccountInfo(){
		
		//�������˺���Ϣ��ѯ��׺
		String operation = "/query/accountInfo";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//�������˺���Ϣ�����ַ
		String url = NoteUser.BASE_URL+ operation;
		//post����
		String body = "accountSid=" + accountSid + NoteUtil.createCommonParam();
		//�ύ����
		String result  = NoteUtil.post(url, body);
		
		System.out.println("��ȡ�������˺���Ϣ:result:" + "\n" + result);
	}
	
	/**
	 * ��֤��֪ͨ���Žӿ�
	 */
	@Test
	public void IndustrySMS(){
		
		//��֤��֪ͨ���Žӿں�׺
		String operation = "/industrySMS/sendSMS";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//���պ���
		String to = "152********";
		//��������(����ǩ��+��������)�������ģ�崴��(����ǩ��+��������)�������ģ�崴��
		String smsContent = "���Ƿ��Ƽ���������֤��Ϊ"+NoteUser.getRandnum()+"������10��������ȷ���룬��Ǳ��˲���������Դ˶��š�";
		//��֤��֪ͨ���Žӿ������ַ
		String url = NoteUser.BASE_URL + operation;
		//post����
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// �ύ����
		String result = NoteUtil.post(url, body);
		
		System.out.println("��֤��֪ͨ���Žӿ�:result:" + "\n" + result);
		
	}
	
	/**
	 * ��ԱӪ�����Žӿ�
	 */
	public void AffMarkSMS(){
		
		//��ԱӪ�����Žӿں�׺
		String operation = "/affMarkSMS/sendSMS";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//���պ���
		String to = "152********";
		//��������(����ǩ��+��������)�������ģ�崴��
		String smsContent = "�����ֿƼ��������Ż�ȯ�Ϳ������������װ��˷ѣ��Ϳ���ʹ�ðɣ����� m.miaodiyun.com ʹ�ã���TD�˶���";
		//��ԱӪ�����Žӿ������ַ
		String url = NoteUser.BASE_URL + operation;
		//post����
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// �ύ����
		String result = NoteUtil.post(url, body);
		System.out.println("��ԱӪ�����Žӿ�:result:" + "\n" + result);
	}
	
	/**
	 * ��������֤��֪ͨ���Žӿ�
	 */
	public void IndustryEmailSMS(){
		//��������֤��֪ͨ���Žӿں�׺
		String operation = "/industryEmailSMS/sendEmailSMS";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//���պ���
		String to = "152********";
		//��������(����ǩ��+��������)�������ģ�崴��
		String smsContent = "�����ֿƼ�����������ע�����֤��Ϊ"+NoteUser.getRandnum()+"��";
		//��������֤��֪ͨ���Žӿ������ַ
		String url = NoteUser.BASE_URL + operation;
		//post����
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent + NoteUtil.createCommonParam();

		// �ύ����
		String result = NoteUtil.post(url, body);
		System.out.println("��������֤��֪ͨ���Žӿ�:result:" + "\n" + result);
	}
	
	/**
	 * �����ʻ�ԱӪ�����Žӿ�
	 */
	public void AffMarkEmailSMS(){
		//�����ʻ�ԱӪ�����Žӿں�׺
		String operation = "/affMarkEmailSMS/sendEmailSMS";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//���պ���
		String to = "152********";
		//��������(����ǩ��+��������)�������ģ�崴��
		String smsContent = "�����ֿƼ��������Ż�ȯ�Ϳ������������װ��˷ѣ��Ϳ���ʹ�ðɣ����� m.miaodiyun.com ʹ�ã���TD�˶� ��";
		//�����ʻ�ԱӪ�����Žӿ������ַ
		String url = NoteUser.BASE_URL + operation;
		//post����
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent
				+ NoteUtil.createCommonParam();

		// �ύ����
		String result = NoteUtil.post(url, body);
		System.out.println("�����ʻ�ԱӪ�����Žӿ�:result:" + "\n" + result);
	}
	
	/**
	 * ������֤��
	 */
	public void VoiceCode(){
		
		//������֤���׺
		String operation = "/call/voiceCode";
		//�û��˺�ID
		String accountSid = NoteUser.ACCOUNT_SID;
		//��֤������
		String verifyCode = NoteUser.getRandnum();
		//���պ���
		String called = "152********";
		//���в���ʾ�ĺ��롣
		String callDisplayNumber = "";
		//�������Ŵ���(1~3)
		String playTimes = "2";
		//������֤��״̬֪ͨ�ص���ַ���������URL�淶����ƽ̨���Url���ͺ��н��֪ͨ
		String respUrl = "";
		//������֤�������ַ
		String url = NoteUser.BASE_URL + operation;
		//post����
		String body = "accountSid=" + accountSid + "&verifyCode=" + verifyCode + "&called=" + called + "&callDisplayNumber=" + callDisplayNumber + "&playTimes=" + playTimes + "&respUrl=" + respUrl + NoteUtil.createCommonParam();

		// �ύ����
		String result = NoteUtil.post(url, body);
		System.out.println("������֤��:result:" + "\n" + result);
	}

	@Test
	public void Test1(){
		String fileName=new Date().getTime()+""+new Random().nextInt(10000);
		System.out.println(fileName);
	}
	
}
