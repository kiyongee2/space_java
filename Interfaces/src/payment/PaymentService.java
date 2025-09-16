package payment;

public class PaymentService {
	private final PaymentRepository paymentRepository;
	
	//생성자 주입(DI) - Dependency Injection(매개변수 저장소 객체 전달)
	public PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	
	//결제 실행 및 DB 저장
	public void processPayment(Payment payment, int amount) {
		payment.pay(amount);
		paymentRepository.save(payment.getPaymentType(), amount);
	}
}
