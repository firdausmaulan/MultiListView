package com.example.multi;

public class ItemWrapper {

    private ItemOne itemOne;

    private ItemTwo itemTwo;

    private int viewType;

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public ItemOne getItemOne() {
        return itemOne;
    }

    public void setItemOne(ItemOne itemOne) {
        this.itemOne = itemOne;
    }

    public ItemTwo getItemTwo() {
        return itemTwo;
    }

    public void setItemTwo(ItemTwo itemTwo) {
        this.itemTwo = itemTwo;
    }
}
