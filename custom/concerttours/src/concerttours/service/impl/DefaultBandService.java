package concerttours.service.impl;

import concerttours.daos.BandDao;
import concerttours.model.BandModel;
import concerttours.service.BandService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

public class DefaultBandService implements BandService {

    private BandDao bandDao;

    @Override
    public List<BandModel> getBands() {
        return bandDao.findBands();
    }

    @Override
    public BandModel getBandForCode(String code) {
        final List<BandModel> result = bandDao.findBandsByCode(code);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Band with code '" + code + "' not found!");
        }
        else if (result.size() > 1)
        {
            throw new AmbiguousIdentifierException("Band code '" + code + "' is not unique, " + result.size() + " bands found!");
        }
        return result.get(0);
    }

    public BandDao getBandDao() {
        return bandDao;
    }

    public void setBandDao(BandDao bandDao) {
        this.bandDao = bandDao;
    }
}
