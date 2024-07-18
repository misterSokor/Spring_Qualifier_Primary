package practice.com.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class GoldCommissionHandler implements CommissionHandler{
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("Gold commission handler called");
        return BigDecimal.ZERO;
    }
}
