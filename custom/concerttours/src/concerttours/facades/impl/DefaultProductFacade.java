package concerttours.facades.impl;

import concerttours.converters.PriceConverter;
import concerttours.converters.ProductConverter;
import concerttours.data.PriceData;
import concerttours.data.ProductData;
import concerttours.facades.ProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.product.PriceService;
import de.hybris.platform.product.ProductService;

import java.util.List;

public class DefaultProductFacade implements ProductFacade {

    private ProductConverter productConverter;
    private PriceConverter priceConverter;
    private ProductService productService;
    private PriceService priceService;


    public void setProductService(ProductService productService)
    {
        this.productService = productService;
    }

    public void setPriceService(PriceService priceService)
    {
        this.priceService = priceService;
    }

    public void setProductConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    public void setPriceConverter(PriceConverter priceConverter) {
        this.priceConverter = priceConverter;
    }

    @Override
    public ProductData getProduct(String productCode) {
        ProductModel product = productService.getProductForCode(productCode);
        List<PriceInformation> prices = priceService.getPriceInformationsForProduct(product);
        ProductData productData = productConverter.convert(product);
        if (!prices.isEmpty())
        {
            PriceInformation price = prices.iterator().next();
            PriceData priceData = priceConverter.convert(price);
            productData.setPrice(priceData);
        }
        return productData;
    }
}
