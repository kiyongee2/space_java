package payment;

public class PaymentApp {

	public static void main(String[] args) {
		// 저장소 생성
		PaymentRepository repo = new DBPaymentRepository();
		
		// 결제 수단 생성
		Payment card = new CreditCardPayment();
		Payment kakao = new KakaoPayPayment();
		
		//결제 실행
		int amount1 = 10000;
		int amount2 = 5000;
		
		card.pay(amount1);
		repo.save(card.getPaymentType(), amount1); //db에 저장
		
		kakao.pay(amount2);
		repo.save(kakao.getPaymentType(), amount2);
	}
}
