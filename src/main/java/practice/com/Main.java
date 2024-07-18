package practice.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.com.config.AppConfig;
import practice.com.model.Card;
import practice.com.model.User;
import practice.com.service.BankService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User bob = new User("Bob", 25);
        Card bobCard = new Card("1234567890", Card.CardType.USUAL);
        bob.setCard(bobCard);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        BankService bankService = context.getBean(BankService.class);
        bankService.pay(128, BigDecimal.valueOf(1000), bob);
    }
}
