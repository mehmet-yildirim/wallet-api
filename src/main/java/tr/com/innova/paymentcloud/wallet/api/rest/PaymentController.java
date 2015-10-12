package tr.com.innova.paymentcloud.wallet.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * Created by mehme on 13.10.2015.
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @RequestMapping(value = "/token", method = {RequestMethod.POST})
    public String token() {
        return "test";
    }

}
