package concerttours.daos;

import concerttours.model.ContactRequestModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface ContactRequestDao {
    public List<ContactRequestModel> findBySender(String sender);
}
