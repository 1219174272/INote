package org.com.entitys;

/**
 * ���Ż�ִ���ͽӿ�(�ص�)
 */
public class ReceNoticeReq {
	
	//���ű�ʶ����һ����32���ַ���ɵĶ���Ψһ��ʶ��
	private String smsId;
	//���ŷ��͵��ֻ����롣
	private String phone;
	//���ŷ���״̬���档0���ɹ���1��ʧ��
	private String status;
	//���Ż�ִ�������ݣ����ط��ش����룩��
	private String respMessage;
	//���Ž���ʱ��(���ͳɹ����ػ�ִ�е���ľ���ʱ�䣬���Ϊδ֪״̬��ʧ��״̬����Ϊ�ա���ʽΪyyyy-mm-dd hh:mm:ss)
	private String receiveTime;
	//�Ʒ�����(����ǩ��+��������70�����ڰ���70��Ϊ1��������70����ÿ��Ϊ67�ּ�������)
	private String chargingNum;
	
	public String getSmsId() {
		return smsId;
	}
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRespMessage() {
		return respMessage;
	}
	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getChargingNum() {
		return chargingNum;
	}
	public void setChargingNum(String chargingNum) {
		this.chargingNum = chargingNum;
	}
	
}
