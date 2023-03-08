/**
 * 
 */
package com.ntss.bricks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntss.bricks.domain.Sale;
import com.ntss.bricks.repositories.SaleRepository;

/**
 * @author 3719072
 *
 */
@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public Iterable<Sale> listAllSales() {
		return saleRepository.findAll();
	}

	@Override
	public Sale getSaleById(Integer id) {
		return saleRepository.findById(id).orElse(null);
	}

	@Override
	public Sale saveSale(Sale sale) {
		return saleRepository.save(sale);
	}

}
