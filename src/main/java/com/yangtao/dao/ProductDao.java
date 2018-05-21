package com.yangtao.dao;

import com.yangtao.model.Product;
/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {
	    void saveProduct(Product product);
}
