package practice.com.service;

import practice.com.model.User;
import java.math.BigDecimal;

public interface BankService {
    void pay(int serviceId, BigDecimal amount, User user);
}
