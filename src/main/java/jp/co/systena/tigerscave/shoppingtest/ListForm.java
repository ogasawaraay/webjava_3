package jp.co.systena.tigerscave.shoppingtest;

import javax.validation.constraints.Size;

public class ListForm {
  @Size(max=10)         // 入力最大長
  private String itemId;

  public String getItemId() {
    return this.itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

}
