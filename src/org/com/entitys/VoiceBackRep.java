package org.com.entitys;

/**
 * ������֤��״̬֪ͨ�ӿ�(�ص�)
 */
public class VoiceBackRep {
	
	//���е�Ψһ��ʶ����Ӧ������֤��ӿڷ��ص�callId��
	private String callId;
	//���е绰���롣֧���ֻ����̻�������Ϊ�̻�ʱ��Ҫ������ţ��磺075512345678��
	private String called;
	//ͨ��״̬��0������ͨ����1������δ������2�����оܽӣ�3�����ʧ�ܡ�
	private String state;
	//ͨ��ʱ������λ����
	private String callTime;
	//��֤�����ݣ�Ϊ����0~9������4-8λ��������֤��ӿ��е�verifyCode��
	private String DTMFaction;
	//�����͵�ʱ�䡣Ϊ�Ӹ�������ʱ��1970��01��01��00ʱ00��00���������ڵ���������Ҫ��׼�����룬��: 1295430113��
	private String timestamp;
	//Ҫ��׼�����룬��: 1295430113��
	private String sig;
	
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCalled() {
		return called;
	}
	public void setCalled(String called) {
		this.called = called;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCallTime() {
		return callTime;
	}
	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}
	public String getDTMFaction() {
		return DTMFaction;
	}
	public void setDTMFaction(String dTMFaction) {
		DTMFaction = dTMFaction;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
	
}
