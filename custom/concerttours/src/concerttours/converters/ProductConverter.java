package concerttours.converters;

import concerttours.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.List;

public class ProductConverter implements Converter<ProductModel, ProductData> {

    @Override
    public ProductData convert(ProductModel productModel) {
        ProductData productData = new ProductData();
        productData.setCode(productModel.getCode());
        productData.setDescription(productModel.getDescription());
        productData.setName(productModel.getName());
        if (productModel.getPicture() != null)
            productData.setPictureUrl(productModel.getPicture().getURL());
        return productData;
    }

    @Override
    public ProductData convert(ProductModel productModel, ProductData productData) throws ConversionException {
        return null;
    }

    @Override
    public List<ProductData> convertAll(Collection<? extends ProductModel> productModels) throws ConversionException {
        return null;
    }

    @Override
    public List<ProductData> convertAllIgnoreExceptions(Collection<? extends ProductModel> productModels) {
        return null;
    }

    @Override
    public Logger getLogger() {
        return null;
    }
}
