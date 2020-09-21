package com.lukianchenko.revertList;

public class ListItem {

  public int value;

  public ListItem nextItem;

  public void printAllValues() {
    System.out.println(this.value);
    if (this.nextItem != null) {
      this.nextItem.printAllValues();
    }
  }

}
