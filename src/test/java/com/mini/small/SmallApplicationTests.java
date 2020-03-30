package com.mini.small;

import com.mini.small.dao.CategoryMapper;
import com.mini.small.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmallApplicationTests {

    @Autowired
    private CategoryMapper  categoryMapper;

    @Test
    public void contextLoads() {
        Category  category = categoryMapper.findById(100001);
        System.out.println(category.toString());

    }

}
