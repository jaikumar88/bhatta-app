/**
 * 
 */
package com.ntss.bricks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ntss.bricks.domain.Sale;
import com.ntss.bricks.services.SaleService;

/**
 * @author Jai
 *
 */
@Controller
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	
	 @RequestMapping(value = "/sales", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("sales", saleService.listAllSales());
	        System.out.println("Returning Sales:");
	        return "sales";
	    }

	    @RequestMapping("sale/{id}")
	    public String showProduct(@PathVariable Integer id, Model model){
	        model.addAttribute("sale", saleService.getSaleById(id));
	        return "saleshow";
	    }

	    @RequestMapping("sale/edit/{id}")
	    public String edit(@PathVariable Integer id, Model model){
	        model.addAttribute("sale", saleService.getSaleById(id));
	        return "saleform";
	    }

	    @RequestMapping("sale/new")
	    public String newProduct(Model model){
	        model.addAttribute("sale", new Sale());
	        return "saleform";
	    }

	    @RequestMapping(value = "sale", method = RequestMethod.POST)
	    public String saveSale(Sale sale){

	    	saleService.saveSale(sale);

	        return "redirect:/sale/" + sale.getId();
	    }
	/**
	 * @return the SaleService
	 */
	public SaleService getSaleService() {
		return saleService;
	}

	/**
	 * @param SaleService the SaleService to set
	 */
	public void setSaleService(SaleService saleService) {
		this.saleService = saleService;
	}
	
	
	
}
