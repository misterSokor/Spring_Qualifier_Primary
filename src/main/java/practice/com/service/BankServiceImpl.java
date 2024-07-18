package practice.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import practice.com.model.User;
import java.math.BigDecimal;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
//    @Qualifier("usualCommissionHandler")
    private CommissionHandler commissionHandler;

    @Override
    public void pay(int serviceId, BigDecimal amount, User user) {
        commissionHandler.getCommission(amount);
    }
}
