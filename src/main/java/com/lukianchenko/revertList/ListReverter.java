package com.lukianchenko.revertList;

public class ListReverter {

  public ListItem createDefaultList() {
    ListItem item1 = new ListItem();
    ListItem item2 = new ListItem();
    ListItem item3 = new ListItem();

    item1.value = 1;
    item2.value = 2;
    item3.value = 3;

    item1.nextItem = item2;
    item2.nextItem = item3;
    return item1;
  }


  public ListItem revertItems(ListItem item) {

    ListItem previousItem = null;
    ListItem currentItem = item;
    ListItem nextItem = currentItem.nextItem;

    currentItem.nextItem = previousItem;
    while (nextItem != null) {
      previousItem = currentItem;
      currentItem = nextItem;
      nextItem = nextItem.nextItem;

      currentItem.nextItem = previousItem;
    }
    return currentItem;

  }

}
