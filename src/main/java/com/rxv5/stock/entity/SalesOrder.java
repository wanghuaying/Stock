package com.rxv5.stock.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 销售单
 * 
 * @author Rixu
 * 
 */
@Entity
@Table(name = "T_SALES_ORDER")
public class SalesOrder implements Serializable {

	private static final long serialVersionUID = -9070481429429579297L;

	@Id
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@GeneratedValue(generator = "idGenerator")
	@Column(name = "SALES_ORDER_ID", length = 32)
	private String id;

	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;// 客户名称

	@Column(name = "CLIENT_PHONE", length = 50)
	private String clientPhone;// 客户联系电话

	@Column(name = "CLIENT_ADDR", length = 50)
	private String clientAddr;// 客户地址

	@Column(name = "SALES_DATE")
	private Date salesDate;// 销售日期

	@Column(name = "REMARK_", length = 1000)
	private String remark;// 备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientAddr() {
		return clientAddr;
	}

	public void setClientAddr(String clientAddr) {
		this.clientAddr = clientAddr;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "SalesOrder [id=" + id + ", clientName=" + clientName + ", clientPhone=" + clientPhone + ", clientAddr="
				+ clientAddr + ", salesDate=" + salesDate + ", remark=" + remark + "]";
	}

}
