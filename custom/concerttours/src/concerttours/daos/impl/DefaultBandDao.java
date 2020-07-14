package concerttours.daos.impl;

import concerttours.daos.BandDao;
import concerttours.daos.ContactRequestDao;
import concerttours.jalo.Band;
import concerttours.jalo.ContactRequest;
import concerttours.model.BandModel;
import concerttours.model.ContactRequestModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class DefaultBandDao implements BandDao {

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<BandModel> findBands() {
        final FlexibleSearchQuery query = new FlexibleSearchQuery( "SELECT {p:" + BandModel.PK + "} "//
                + "FROM {" + BandModel._TYPECODE + " AS p} ");
        return flexibleSearchService.<BandModel> search(query).getResult();
    }

    @Override
    public List<BandModel> findBandsByCode(String code) {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(String.format("SELECT {%s} FROM {%s} WHERE {%s}=?code", BandModel.PK, "Band",BandModel.CODE));
        query.addQueryParameter("code",code);
        return flexibleSearchService.<BandModel> search(query).getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
