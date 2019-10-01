package jp.co.systena.tigerscave.shoppingdb;

public class ListForm {

  // Item.javaと同様にメンバ変数にしておく
  private int itemid;
  private int num; //個数

//コントローラにわたすため、入力情報（itemidと個数）を取得してセットする
  public int getItemid() {
    return itemid;
  }

  public void setItemid(int itemid) {
    this.itemid = itemid;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
}
