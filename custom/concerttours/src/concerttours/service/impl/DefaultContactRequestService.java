package concerttours.service.impl;

import concerttours.daos.ContactRequestDao;
import concerttours.model.ContactRequestModel;
import concerttours.service.ContactRequestService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import javax.annotation.Resource;
import java.util.List;

public class DefaultContactRequestService implements ContactRequestService {

    private ContactRequestDao contactRequestDao;

    public ContactRequestDao getContactRequestDao() {
        return contactRequestDao;
    }

    public void setContactRequestDao(ContactRequestDao contactRequestDao) {
        this.contactRequestDao = contactRequestDao;
    }

    @Override
    public ContactRequestModel getContactRequest(String sender) {
        final List<ContactRequestModel> result = contactRequestDao.findBySender(sender);
        final int resultCount = result.size();
        System.out.println(resultCount);
        if (resultCount == 0)
        {
            throw new UnknownIdentifierException(
                    "ContactRequest with sender '" + sender + "' not found!"
            );
        }
        else if (resultCount > 1)
        {
            throw new AmbiguousIdentifierException(
                    "ContactRequest with sender '" + sender + "' is not unique, "
                            + resultCount + " requests found!"
            );
        }
        return result.get(0);
    }
}
