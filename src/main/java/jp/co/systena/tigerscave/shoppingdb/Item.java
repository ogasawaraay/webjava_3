package jp.co.systena.tigerscave.shoppingdb;


public class Item{

  //メンバ変数にしておく
  private int itemid;
  private String name;
  private int price;

//Itemidとそれに紐づく情報たちを宣言
  public Item(int itemid, String name, int price) {
    this.itemid = itemid;
    this.name = name;
    this.price = price;
  }

//コンストラクタ
  public Item() {
  }

  //  リストサービスで使う
  public int getItemId() {
    return itemid;
  }

  public void setItemid(int itemid) {
    this.itemid = itemid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int Price) {
    this.price = price;
  }
}



