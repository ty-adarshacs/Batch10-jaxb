package com.te.marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.te.jaxb.EmployeeInfo;

public class MarshallingTest {
  public static void main(String[] args) {
	EmployeeInfo info=new EmployeeInfo();
	info.setId(10);
	info.setName("asd");
	info.setPhone(1233);
	try {
		JAXBContext context=JAXBContext.newInstance(EmployeeInfo.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(info, System.out);
		marshaller.marshal(info, new File("employee.xml"));
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
