package jp.co.systena.tigerscave.shoppingtest;


public class ListService {
//ItemListの中身宣言
//Itemidとそれに紐づく情報たちを宣言する
  int itemId;
  String name;
  int price;

  public void itemList(int itemId,String name,int price) {
    this.itemId = itemId;
    this.name = name;
    this.price = price;
    
  }



}
