package practice.com.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class UsualCommissionHandler implements CommissionHandler{
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("Usual commission handler called");
        return amount.multiply(BigDecimal.valueOf(0.05));
    }
}
