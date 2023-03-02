package com.khadri.hibernate.assigned;

public class OrderZomoto {

	private String uuid;
	private String orderId;
	private String orderName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "OrderZomoto [uuid=" + uuid + ", orderId=" + orderId + ", orderName=" + orderName + "]";
	}

}
