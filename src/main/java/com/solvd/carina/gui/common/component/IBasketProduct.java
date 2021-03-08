package com.solvd.carina.gui.common.component;

public interface IBasketProduct {

    public void increaseQuantity(int product, int howMuch);

    public void decreaseQuantity(int product, int howMuch);

    public void deleteProduct(int product);

    public double getTotalRowPrice(int product);

    public double getProductPrice(int product);

    public double getTotalPriceOfAllProductRows();
}
