package concerttours.daos.impl;

import concerttours.daos.ContactRequestDao;
import concerttours.jalo.ContactRequest;
import concerttours.model.ContactRequestModel;
import de.hybris.platform.jalo.flexiblesearch.FlexibleSearch;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import javax.annotation.Resource;
import java.util.List;

public class DefaultContactRequestDao extends AbstractItemDao implements ContactRequestDao {

    @Override
    public List<ContactRequestModel> findBySender(String sender) {
        final String queryString = String.format("SELECT {%s} FROM {%s} WHERE {%s} = ?sender",
                ContactRequest.PK, "ContactRequest",
                ContactRequest.SENDER);
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("sender", sender);
        final SearchResult<ContactRequestModel> result = flexibleSearchService.search(query);
        return result.getResult();
    }
}
