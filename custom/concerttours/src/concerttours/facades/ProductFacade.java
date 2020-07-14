package concerttours.facades;

import concerttours.data.ProductData;

public interface ProductFacade {
    public ProductData getProduct(String productCode);
}
