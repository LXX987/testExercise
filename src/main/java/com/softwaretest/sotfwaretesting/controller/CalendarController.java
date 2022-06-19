package com.softwaretest.sotfwaretesting.controller;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalendarController {

    @RequestMapping("/calendar")
    @ResponseBody
    public Object fun(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
}
