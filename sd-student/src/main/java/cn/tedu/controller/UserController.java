package cn.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

@RestController  //����ֵ���json��ʽ��֧��RESTFUL��ʽ
public class UserController {

	@Autowired
	private UserService userService;
	
	//��ѯ����
	//�������http://localhost:8060/user/find
	@RequestMapping("/user/find")
	public List<User> find(){
		return userService.find();
		
	}
	
	@RequestMapping("/find/{id}")
	public User findUserById(@PathVariable Integer id){
		return userService.findUserById(id);
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insertUser(User user){
		userService.insert(user);
		return "�����û��ɹ���";
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String updateUser(User user){
		userService.update(user);
		return "���³ɹ�";
	}
	
}