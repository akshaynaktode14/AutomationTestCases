package InterviewPrograms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeWithReqResSpecAPI {
	static RequestSpecification requestSpec;
	static responseSpecification responseSpecc;
	static int empId;
	
	@BeforeClass
	public static void setup() {
		 requestSpec= new RequestSpecBuilder();
		 .setBaseUri("https://localhost:3000")
		 .setContentType(ContentType.JSON)
		 .build();
		 responseSpec= new ResponseSpecBuilder();
		 .expectStatusCode(200)
		 .expectContentType(ContentType.JSON)
		 .expectResponseTime(lessThan(3000L))
		 .build();
	}
	
	@Test
	public void employeeFlow() {
		
//		==================================
//				POST Request
//		==================================
		JSONObject request= new JSONObject();
		request.put("firstName","Akshay");
		request.put("lastName","Naktode");
		request.put("city","Pune");
		
		Response postResponse= given()
				.spec(requestSpec)
				.body(request.toString())
			.when()
				.post("/employee")
			.then()
				.statusCode(201)
				.extract().response();
		empId= postResponse.JsonPath().getInt("id");
		System.out.println("Generated Employee ID : "+empId);
				
//		==================================
//		GET Request
//		==================================
		given()
			.spec(requestSpec)
			.pathParam("id",empId)
		.when()
			.get("/employee/{id}")
		.then()
			.spec(responseSpec)
			.body("firstName",equalTo("Akshay"))
			.log().all();
//		==================================
//		PUT Request
//		==================================
		
		JSONObject updateRequest= new JSONObject();
		updateRequest.put("firstName","Akshay");
		updateRequest.put("lastName","Naktode");
		updateRequest.put("city","Nagpur");  //updating City
		
		given()
			.spec(requestSpec)
			.pathParam("id",empId)
			.body(updateRequest.toString())
		.when()
			.put("/employee/{id}")
		.then()
			.spec(responseSpec)
			.body("city",equalTo("Nagpur"))
			.log().all();
		
//		==================================
//		DELETE Request
//		==================================
		given()
			.spec(requestSpec)
			.patParam("id",empId)
		.when()
			.delete("/employee/{id}")
		.then()
		.spec(responseSpec)
		.log().all();
	}
	

}
