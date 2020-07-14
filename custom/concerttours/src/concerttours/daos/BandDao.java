package concerttours.daos;

import concerttours.model.BandModel;
import concerttours.model.ContactRequestModel;

import java.util.List;

public interface BandDao {
    List<BandModel> findBands();
    List<BandModel> findBandsByCode(String code);
}
