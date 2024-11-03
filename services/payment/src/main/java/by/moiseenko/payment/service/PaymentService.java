package by.moiseenko.payment.service;

import by.moiseenko.payment.dto.mapper.PaymentMapper;
import by.moiseenko.payment.dto.request.PaymentNotificationRequest;
import by.moiseenko.payment.dto.request.PaymentRequest;
import by.moiseenko.payment.kafka.NotificationProducer;
import by.moiseenko.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;
    private final PaymentMapper mapper;
    private final NotificationProducer notificationProducer;

    public Integer createPayment(PaymentRequest request) {
        var payment = this.repository.save(this.mapper.toPayment(request));

        this.notificationProducer.sendNotification(
                new PaymentNotificationRequest(
                        request.orderReference(),
                        request.amount(),
                        request.paymentMethod(),
                        request.customer().firstname(),
                        request.customer().lastname(),
                        request.customer().email()
                )
        );
        return payment.getId();
    }
}
