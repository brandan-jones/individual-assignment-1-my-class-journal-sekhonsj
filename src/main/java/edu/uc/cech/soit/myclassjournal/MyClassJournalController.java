package edu.uc.cech.soit.myclassjournal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }


}
