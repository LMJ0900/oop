package view;

import builder.ProductBuilder;
import model.ProductDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {

        List<ProductDto> product = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            product.add(new ProductBuilder()
                    .pno(i)
                    .name(util.createRandomName())
                    .company(util.createRandomCompany())
                    .price(util.createRandomInteger(20000,100000))
                    .build());
        }

        product.forEach(i->{
            System.out.println(i.toString());
        });
    }
}