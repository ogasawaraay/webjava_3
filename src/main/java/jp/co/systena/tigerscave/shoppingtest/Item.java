package jp.co.systena.tigerscave.shoppingtest;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

//    int itemId;
//    String name;
//    int price;
//
//    public void itemList(int itemId,String name,int price) {
//      this.itemId = itemId;
//      this.name = name;
//      this.price = price;
//
//  }

//  public class Object main(String[] args) {
//    ItemList obj = new ItemList();

public class Item{
//ItemListの中身宣言
  int itemId;
  String name;
  int price;

//Itemidとそれに紐づく情報たちを宣言
  public Item(int itemId,String name,int price) {
    this.itemId = itemId;
    this.name = name;
    this.price = price;
  }

  public int getItemId() {
    return itemId;
  }
  public String getName() {
    return name;
  }
  public int getPrice() {
    return price;
  }
}

