package com.lukianchenko;

import com.lukianchenko.revertList.ListItem;
import com.lukianchenko.revertList.ListReverter;
import org.junit.jupiter.api.Test;

public class ListReverterTest {

  @Test // just for running this logic without main
  void revertItems_whenListIsInput_thenReverseListIsReturned() {
    ListReverter listReverter = new ListReverter();
    ListItem listItem = listReverter.createDefaultList();
    listItem.printAllValues();

    ListItem revertList = listReverter.revertItems(listItem);
    revertList.printAllValues();
  }

}
