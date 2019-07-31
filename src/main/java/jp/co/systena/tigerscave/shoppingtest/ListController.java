package jp.co.systena.tigerscave.shoppingtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ListController {
  @RequestMapping(value="/showList")     // URLとのマッピング
  public String showList(@ModelAttribute("ListForm") ListForm listform) {
    return "ListView.html";
  }


  @RequestMapping(value="/orderItem")
  public void Item() {}

}



