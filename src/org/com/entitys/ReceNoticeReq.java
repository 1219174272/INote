package org.com.entitys;

/**
 * 短信回执推送接口(回调)
 */
public class ReceNoticeReq {
	
	//短信标识符。一个由32个字符组成的短信唯一标识符
	private String smsId;
	//短信发送的手机号码。
	private String phone;
	//短信发送状态报告。0：成功；1：失败
	private String status;
	//短信回执具体内容（网关返回错误码）。
	private String respMessage;
	//短信接收时间(发送成功返回回执中到达的具体时间，如果为未知状态或失败状态，则为空。格式为yyyy-mm-dd hh:mm:ss)
	private String receiveTime;
	//计费条数(短信签名+短信内容70字以内包含70字为1条，超过70字则按每条为67字计算条数)
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
