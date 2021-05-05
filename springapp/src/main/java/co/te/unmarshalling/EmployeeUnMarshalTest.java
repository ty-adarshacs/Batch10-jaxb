package co.te.unmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.te.jaxb.EmployeeInfo;

public class EmployeeUnMarshalTest {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(EmployeeInfo.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			EmployeeInfo employeeInfo = (EmployeeInfo) unmarshaller.unmarshal(new File("employee.xml"));

				System.out.println(employeeInfo.getId());
				System.out.println(employeeInfo.getName());
				System.out.println(employeeInfo.getPhone());
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}

}
