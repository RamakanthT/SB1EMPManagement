<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<div id="container">
		<h2>Login Success</h2>
		<form action="" method="post">
			Login successful Emp Details:
			${empTO.empId}${sessionScope.empTO.empId}<br><br> 
			
			Emp personal details: <br> 
			empId : ${empTO.empPersonalTO.empId}${sessionScope.empTO.empPersonalTO.empId}<br>
			empFirstName: ${empTO.empPersonalTO.empFirstName}${sessionScope.empTO.empPersonalTO.empFirstName}<br>
			empLastName: ${empTO.empPersonalTO.empLastName}${sessionScope.empTO.empPersonalTO.empLastName}<br>
			empDob: ${empTO.empPersonalTO.empDob}${sessionScope.empTO.empPersonalTO.empDob}<br>
			empPhone: ${empTO.empPersonalTO.empPhone}${sessionScope.empTO.empPersonalTO.empPhone}<br><br>
			
			Emp Dept details:<br>
			
			empId : ${empTO.empDeptTO.empId}${sessionScope.empTO.empDeptTO.empId}<br>
			empDeptNo: ${empTO.empDeptTO.empDeptNo}${sessionScope.empTO.empDeptTO.empDeptNo}<br>
			empDeptName: ${empTO.empDeptTO.empDeptName}${sessionScope.empTO.empDeptTO.empDeptName}<br>
			empDeptCategory: ${empTO.empDeptTO.empDeptCategory}${sessionScope.empTO.empDeptTO.empDeptCategory}<br>
			empDeptLocation: ${empTO.empDeptTO.empDeptLocation}${sessionScope.empTO.empDeptTO.empDeptLocation}<br><br>
			
			Emp Insurance details:
			empId: ${empTO.empInsuranceTO.empId}${sessionScope.empTO.empInsuranceTO.empId}<br>
			empPolicyId: ${empTO.empInsuranceTO.empPolicyId}${sessionScope.empTO.empInsuranceTO.empPolicyId}<br>
			empNominee: ${empTO.empInsuranceTO.empNominee}${sessionScope.empTO.empInsuranceTO.empNominee}<br>
			empPolicy: ${empTO.empInsuranceTO.empPolicy}${sessionScope.empTO.empInsuranceTO.empPolicy}<br>
			empPolicyAmt: ${empTO.empInsuranceTO.empPolicyAmt}${sessionScope.empTO.empInsuranceTO.empPolicyAmt}<br><br>
						

		</form>
	</div>
</body>
</html>

