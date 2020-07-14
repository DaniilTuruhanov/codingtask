package concerttours.controller;

import concerttours.model.ContactRequestModel;
import concerttours.service.ContactRequestService;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping(value = "/contactRequest")
public class ContactRequestController {

    @Autowired
    private ContactRequestService contactRequestService;

    @Autowired
    private ModelService modelService;

    public ContactRequestService getContactRequestService() {
        return contactRequestService;
    }

    public void setContactRequestService(ContactRequestService contactRequestService) {
        this.contactRequestService = contactRequestService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public String getContactRequstPage() {
        return "contactRequest";
    }

    @PostMapping
    public String setNewSenderAndMessage(@RequestParam String sender, @RequestParam String newSender, @RequestParam String newMessage, Model model) {
        ContactRequestModel contactRequest = new ContactRequestModel();
        if (!sender.equals("")) {
            try {
                contactRequest = contactRequestService.getContactRequest(sender);
            } catch (final UnknownIdentifierException e) {
            }
        }
        if (contactRequest == null) {
            contactRequest = new ContactRequestModel();
            modelService.attach(contactRequest);
        }
        if (!newSender.equals("")) {
            contactRequest.setSender(newSender);
        }
        if (!newMessage.equals("")) {
            contactRequest.setMessage(newMessage);
        }
        modelService.save(contactRequest);
        model.addAttribute("contactRequest", contactRequest);
        return "contactRequest";
    }
}