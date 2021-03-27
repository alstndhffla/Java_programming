package ObjectOrientedProgramming;


public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = 201803120001L;
		order.customerId = "abc123";
		order.orderDate = "2020년 3월 20일"; 
		order.customerName = "김민수";
		order.productId = "PD345-12";
		order.shippingAddress = "경기도 안산시";
		
		System.out.println("주문번호: " + order.orderId);
		System.out.println("고객아이디: " + order.customerId);
		System.out.println("주문날짜: " + order.orderDate);
		System.out.println("고객이름: " + order.customerName);
		System.out.println("상품번호: " + order.productId);
		System.out.println("배송주소: " + order.shippingAddress);
	}

}
