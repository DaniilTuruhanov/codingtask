package concerttours.controller;

import concerttours.service.TrainingProductService;
import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.core.model.product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/productTraining")
public class TrainingProductController {

    @Resource
    private CatalogService catalogService;

    @Resource
    private TrainingProductService trainingProductService;

    @GetMapping
    public String getProductTrainingPage(@RequestParam String code, @RequestParam String name, Model model) {
        catalogService.setSessionCatalogVersion("concertoursProductCatalog", "Online");

        ProductModel product = null;
        if (!code.equals("") && !name.equals("")) {
            product = trainingProductService.getProductForCodeAndName(code, name);
        }

        model.addAttribute("product", product);
        return "productTraining";
    }
}
