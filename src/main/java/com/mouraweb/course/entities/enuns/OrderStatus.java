package com.mouraweb.course.entities.enuns;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	
	// OBS: abaixo esta um metodo para enumerar as OrderStatus no banco de dados.
	//		caso algum programador queira fazer alguma alteração, nesse caso não irá afetar a ordem dos status.
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("código de status do pedido inválido");
	}
}
