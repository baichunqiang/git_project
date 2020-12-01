package com.student.model;

public class StudentModel {
	
	private int id;
	private String username;
	private String password;
	private int sex;
	private String love;
	
	public StudentModel(int id,String username,String password,int sex ,String love) {
    super();
    this.id = id;   //用户id 
    this.username = username;// 用户姓名
    this.password = password;  //用户密码
    this.sex = sex;   //年龄
    this.love = love;  //兴趣爱好
    		
		
  }
	
	
}
