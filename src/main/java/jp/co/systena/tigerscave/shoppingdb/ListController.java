package jp.co.systena.tigerscave.shoppingdb;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//パッケージ名を変更したらエラーが多発してしまったので修正中

@Controller
public class ListController {

  @Autowired
  HttpSession session;//セッション

  @RequestMapping(value = "/showList", method = RequestMethod.GET) // URLとのマッピング
  public ModelAndView index(ModelAndView mav) {

    // Viewに渡すデータを設定
    Map<Integer, Item> itemListMap = getItemListMap();
    mav.addObject("itemList", itemListMap);


    // Viewのテンプレート名を返す
    mav.setViewName("ListView.html");
    return mav;
  }



  private Cart getCart() {
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
      cart = new Cart();
      session.setAttribute("cart", cart);
    }

    return cart;
  }

  private Map<Integer, Item> getItemListMap() {
    ListService service = new ListService();
    List<Item> itemList = service.getItemList();
    return null;
  }
}


