package concerttours.controller;

import concerttours.data.ProductData;
import concerttours.facades.ProductFacade;
import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ProductController {

    @Resource
    private ProductFacade productFacade;

    @Resource
    private CatalogService catalogService;

    @GetMapping(value = "/product")
    public String getProductPage(@RequestParam String code, Model model){
        catalogService.setSessionCatalogVersion("Default", "Online");
        ProductData product = null;
        if (code != null)
        {
            product = productFacade.getProduct(code);
        }
        model.addAttribute("product", product);
        return "product";
    }
}
