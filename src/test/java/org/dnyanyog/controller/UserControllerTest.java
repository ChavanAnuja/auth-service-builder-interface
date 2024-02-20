package org.dnyanyog.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testng.annotations.Test;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest extends AbstractTestNGSpringContextTests {

	@Autowired
	MockMvc mockMvc;
	
//	@Test(priority=2)
//	public void verifyAddUser() throws XPathExpressionException, Exception {
//		RequestBuilder requestBuilder=MockMvcRequestBuilders.post("/api/v1/auth/user").content("\"username\":\"tanuja\",\r\n"
//				+ "    \"password\":\"23\",\r\n"
//				+ "    \"email\":\"abc@gmail.com\",\r\n"
//				+ "    \"age\":\"9\""
//			).contentType(MediaType.APPLICATION_XML_VALUE).accept(MediaType.APPLICATION_XML_VALUE);
//		
//		MvcResult result=mockMvc.perform(requestBuilder).andExpect(status().isOk())
//				  .andExpect(xpath("/AddUserResponse/status").string("Success"))
//				  .andExpect(xpath("/AddUserResponse/message"). string("User found"))
//				  .andExpect(xpath("/AddUserResponse/userId"). string("0"))
//
//				  .andExpect(xpath("/UserData/username"). string("Anuja"))
//				  .andExpect(xpath("/UserData/password"). string("123"))
//				  .andExpect(xpath("/UserData/email"). string("abc2gmail.com"))
//				  .andExpect(xpath("/UserData/age"). string("5"))
//				  .andExpect(xpath("/UserData/user_id"). string("0"))
//
//				  .andReturn();
//	
//	}
	
	
}
