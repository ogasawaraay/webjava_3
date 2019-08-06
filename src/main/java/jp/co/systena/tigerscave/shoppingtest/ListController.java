package jp.co.systena.tigerscave.shoppingtest;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class ListController {


@Controller // Viewあり。Viewを返却するアノテーション
public class ListController {
  @RequestMapping("/showList") // URLとのマッピング


  //↓ListController用に書き換える
  public String index(HttpSession session, Model model,
                            @RequestParam(name = "name", required = false) String name) {
    // Viewに渡すデータを設定
//    model.addAttribute("name", name);
//    model.addAttribute("message", new java.util.Date());


    int itemId = 0;
    getItemList(itemId);

    // Viewのテンプレート名を返す
    return "ListView.html";
  }


private void getItemList(int itemId) {
    // TODO 自動生成されたメソッド・スタブ

  }


//  private static final ListForm ListForm = null;




//
//  public String ListController() {
////    public listform;
//    ListForm listform = new ListForm();
//    showList(ListForm listform);
//
//
//
//  }
//
//
//  @RequestMapping(value="/showList")     // URLとのマッピング
//  public String showList(@ModelAttribute("ListForm") ListForm listform) {
//    return "ListView.html";
//  }




  //注文するとき
  @RequestMapping(value="/orderItem")
  public void Item() {}

}



