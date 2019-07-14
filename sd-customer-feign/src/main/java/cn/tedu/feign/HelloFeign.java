package cn.tedu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-user")
public interface HelloFeign {
	//����͵��÷��񷵻�ֵ�����������������������͡�����ע��һģһ��
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable(value="name") String name);
}