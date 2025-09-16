package payment;

public class PaymentApp2 {

	public static void main(String[] args) {
		// DB 저장소 준비
		PaymentRepository repo = new DBPaymentRepository();
		
		// 서비스 객체 생성
		PaymentService service = new PaymentService(repo);
		
		// 결제 수단
		Payment card = new CreditCardPayment();
		Payment kakao = new KakaoPayPayment();
		
		// 결제 실행
		service.processPayment(card, 10000);
		service.processPayment(kakao, 5000);
	}

}
