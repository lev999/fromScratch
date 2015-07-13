package home.lev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    @ResponseBody
    public String home(){
        return "Hello world";
    }

}
