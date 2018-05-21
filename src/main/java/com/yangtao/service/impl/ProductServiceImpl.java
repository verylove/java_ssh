package com.yangtao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yangtao.dao.*;
import com.yangtao.model.*;
import com.yangtao.service.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

}