/**
 * 
 */
package com.ntss.bricks.services;

import com.ntss.bricks.domain.Sale;

/**
 * @author 3719072
 *
 */
public interface SaleService {
    Iterable<Sale> listAllSales();

    Sale getSaleById(Integer id);

    Sale saveSale(Sale sale);
}
