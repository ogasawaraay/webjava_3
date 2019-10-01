package jp.co.systena.tigerscave.shoppingdb;

import java.util.ArrayList;
import java.util.List;


public class ListService {

  public List<Item> getItemList() {


    List<Item> itemList = new ArrayList<Item>();

    Item item = new Item();

    item.setItemid(10);
    item.setName("ごはん（並）");
    item.setPrice(100);
    itemList.add(item);


    item = new Item(20, "ごはん（大）", 150);
    itemList.add(item);

    item = new Item(30, "みそしる", 50);
    itemList.add(item);


    return itemList;
  }
}






//@Service
//public class ListService<Item> {
//
//  //  Itemクラスの商品オブジェクトをたくさん作って値をいれるメソッド
////  public ArrayList<Item> ListService () {
////  クラス名 変数名 = new クラス名();　←インスタンスの生成。Itemの枠をつくるイメージ
//
//
//  public ArrayList<Item> getItemList(int itemId){
//    ArrayList<Item> itemList = new ArrayList<Item>();
//    itemList.add(Item1);
//    itemList.add(Item2);
//    return itemList;
//
//
//  }
//
//
//}
//  //HashMapを定義。Itemから商品の情報を引っ張ってくる
//  Map<Integer, Item> ItemList = new HashMap<Integer,Item>();
//
//  ItemList.put(0, new Item(0, "ごはん",180));
//  ItemList.put(1, new Item(0, "みそしる",80));
//
//  }
// ↑HashMapはやめにして配列にする


//  public static void main(String args[]) {
//
////    Item Item1 = new Item(0,"ごはん",180);
////    Item Item2 = new Item(1,"ごはん2",200);
//
//
//
////  }
//
//}

