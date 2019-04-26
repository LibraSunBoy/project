package com.sunnice.portal;

import com.sunnice.generator.entity.PmsSkuStock;
import com.sunnice.portal.service.PmsSkuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalApplicationTests {
	@Autowired
	private PmsSkuService skuService;

	@Test
	public void contextLoads() {
		List<PmsSkuStock> pmsSkuStocks = skuService.queryList(1, 10);
		for (PmsSkuStock skuStock:pmsSkuStocks){
			System.out.println(skuStock.toString());
		}
	}

	@Test
	public void contextLoads01() {
		Integer count = skuService.queryCount(36l);
		System.out.println("Integer"+count);
	}

}
