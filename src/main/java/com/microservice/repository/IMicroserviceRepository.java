package com.microservice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.microservice.model.Microservice;

@Mapper
public interface IMicroserviceRepository {

	@Insert("insert into microservice(user_name, email_id, phone_number, address, nationality, gender, age) " +
			"values(#{name}, #{emailId}, #{phoneNumber}, #{address}, #{nationality}, #{gender}, #{age})")
	void addMicroservice(Microservice microservice);

	@Update("update microservice set email_id=#{emailId}, phone_number=#{phoneNumber}, address=#{address}, " +
			"nationality=#{nationality}, gender=#{gender}, age=#{age} where user_id=#{userId}")
	void updateMicroservice(Microservice microservice);

	@Delete("delete from microservice where user_id = #{userId}")
	void deleteMicroservice(int userId);

	@Select("select * from microservice where user_id = #{userId}")
	@Results({
			@Result(property = "userId", column = "user_id"),
			@Result(property = "name", column = "user_name"),
			@Result(property = "emailId", column = "email_id"),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "address", column = "address"),
			@Result(property = "nationality", column = "nationality"),
			@Result(property = "gender", column = "gender"),
			@Result(property = "age", column = "age")
	})
	Microservice getById(int userId);

	@Select("select * from microservice")
	@Results({
			@Result(property = "userId", column = "user_id"),
			@Result(property = "name", column = "user_name"),
			@Result(property = "emailId", column = "email_id"),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "address", column = "address"),
			@Result(property = "nationality", column = "nationality"),
			@Result(property = "gender", column = "gender"),
			@Result(property = "age", column = "age")
	})
	List<Microservice> getAll();

	@Select("select * from microservice where phone_number = #{phoneNumber}")
	@Results({
			@Result(property = "userId", column = "user_id"),
			@Result(property = "name", column = "user_name"),
			@Result(property = "emailId", column = "email_id"),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "address", column = "address"),
			@Result(property = "nationality", column = "nationality"),
			@Result(property = "gender", column = "gender"),
			@Result(property = "age", column = "age")
	})
	List<Microservice> getByPhoneNumber(String phoneNumber);


}
