package xyf.xrpc.config.spring.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import xyf.xrpc.common.URL;
import xyf.xrpc.config.ApplicationConfig;
import xyf.xrpc.config.RegistryConfig;

public class ConfigSpringTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\developer\\java\\myeclipse\\xrpc-dev-test\\config-spring-test.xml");
	    context.start();
	    
	    ApplicationConfig appConfig = (ApplicationConfig)context.getBean(ApplicationConfig.class);
	    System.out.println(appConfig);
	    
	    RegistryConfig registryConfig = (RegistryConfig)context.getBean(RegistryConfig.class);
	    System.out.println(registryConfig);
	    
	    Map<String, String> paras = new HashMap<String, String>();
	    paras.put("p1", "v1");
	    paras.put("p2", "v2");
	    URL url = new URL("registry", "127.0.0.1", 8080, "", paras);
	    System.out.println(url);
	}
}
