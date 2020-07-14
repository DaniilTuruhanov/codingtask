package concerttours.converters;

import concerttours.data.PriceData;
import concerttours.data.ProductData;
import de.hybris.platform.jalo.order.price.PriceInformation;
import org.springframework.core.convert.converter.Converter;

public class PriceConverter implements Converter<PriceInformation, PriceData> {
    @Override
    public PriceData convert(PriceInformation priceInformation) {
        PriceData priceData = new PriceData();
        priceData.setCurrency(priceInformation.getPriceValue().getCurrencyIso());
        priceData.setPrice(priceInformation.getPriceValue().getValue());
        return priceData;
    }
}
