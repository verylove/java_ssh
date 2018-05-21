package com.yangtao.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;
import com.yangtao.model.*;
import com.yangtao.service.*;

/**
 * 商品操作-控制层
 *
 */
@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ProductService productService;
    private String pname;
    private double price;

    /**
     * 保存商品操作
     * 
     * @return
     */
    public String saveProduct() {
        Product product = new Product(pname, price);
        productService.saveProduct(product);
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        this.addActionMessage("保存成功..."+df.format(day));
        return SUCCESS;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public void validate() {
        if(pname == null || "".equals(pname.trim())) {
            this.addFieldError("pname", "商品名称不能为空");
        }
    }

}