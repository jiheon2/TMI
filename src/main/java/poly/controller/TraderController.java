package poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping(value = "/trader")
public class TraderController {
    @GetMapping(value = "/traderIndex")
    public String main() throws Exception {
        log.info("start!");
        return "trader/traderIndex";
    }
}
