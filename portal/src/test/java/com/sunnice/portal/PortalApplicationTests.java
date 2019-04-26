package com.sunnice.portal;

import com.sunnice.generator.entity.UmsAdmin;
import com.sunnice.portal.service.UmsAdminService;
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
	private UmsAdminService adminService;

	@Test
	public void contextLoads() {
		List<UmsAdmin> adminList = adminService.queryList(1, 10);
		for (UmsAdmin admin:adminList){
			System.out.println(admin.toString());
		}
	}
//
//	@Test
//	public void contextLoads01() {
//		Integer count = skuService.queryCount(36l);
//		System.out.println("Integer"+count);
//	}

}
