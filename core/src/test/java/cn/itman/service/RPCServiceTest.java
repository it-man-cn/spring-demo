package cn.itman.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.itman.Application;
import cn.itman.common.service.RPCService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class RPCServiceTest {

	@Autowired
	private RPCService rpcService;
	
	@Test
	public void testRPCService(){
		System.out.println(rpcService);
		System.out.println(rpcService.getHost());
	}
}
