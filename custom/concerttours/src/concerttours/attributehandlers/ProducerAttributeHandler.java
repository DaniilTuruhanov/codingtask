package concerttours.attributehandlers;

import concerttours.model.ConcertModel;
import concerttours.model.ProducerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ProducerAttributeHandler extends AbstractDynamicAttributeHandler<String, ProducerModel> {

    @Override
    public String get(final ProducerModel model) {
        return model.getFirstName() + " " + model.getLastName();
    }
}