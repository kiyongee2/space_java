package payment;

/*
 * 인터페이스 - public 속성
 * 
 */
interface Payment {
	void pay(int amount);     //결제 기능
	String getPaymentType();  //결제 수단
}

//신용카드 결제
class CreditCardPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println(amount + "원을 신용카드로 결제했습니다.");
	}

	@Override
	public String getPaymentType() {
		return "CreditCard";
	}
}

//카카오 페이 결제
class KakaoPayPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println(amount + "원을 카카오페이로 결제했습니다.");
	}

	@Override
	public String getPaymentType() {
		return "KakaoPay";
	}	
}












