package com.example.multi;

import static com.example.multi.Constant.LayoutOne;
import static com.example.multi.Constant.LayoutTwo;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter implements IMainPresenter {
    @Override
    public List<ItemWrapper> getItems() {
        List<ItemWrapper> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ItemWrapper itemWrapper = new ItemWrapper();
            if (list.size() % 10 == 0) {
                itemWrapper.setViewType(LayoutOne);
                ItemOne itemOne = new ItemOne("Wellcome " + i);
                itemWrapper.setItemOne(itemOne);
            } else {
                itemWrapper.setViewType(LayoutTwo);
                int image = R.drawable.celtic;
                if (i % 2 == 0) image = R.drawable.rangers;
                ItemTwo itemTwo = new ItemTwo(
                        image,
                        "Hello",
                        "This is item " + i
                );
                itemWrapper.setItemTwo(itemTwo);
            }
            list.add(itemWrapper);
        }
        return list;
    }
}
