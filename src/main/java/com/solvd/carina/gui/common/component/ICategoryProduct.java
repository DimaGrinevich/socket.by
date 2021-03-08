package com.solvd.carina.gui.common.component;

import java.util.List;

public interface ICategoryProduct {
    public List<Double> getPrices();
    public List<String> getTitles();
    public void addProductToBasket(int product);
    public void toTheProduct(int product);

}
