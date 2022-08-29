package org.example;

import java.util.List;

public class AutoFactory {
    private int productionSize;
    private ProductionLine ProductionLine;

    private List<Car> Cars;

    public AutoFactory(org.example.ProductionLine productionLine) {
        ProductionLine = productionLine;
    }

    public AutoFactory(int productionSize, ProductionLine ProductionLine)
    {
        this.ProductionLine = ProductionLine;
        this.productionSize = productionSize;
    }

    public void RunProduction() {
        int CarBuilt = 0;
        while (CarBuilt < productionSize)
        { Cars.add(ProductionLine.work()); CarBuilt++;}
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    public int getCarsCount() {
        return Cars.size();
    }
}
