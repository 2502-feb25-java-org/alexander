function storeSignUp(){
    var firstName=document.getElementById("firstName").value;
    localStorage.firstName=firstName;

    var lastName=document.getElementById("lastName").value;
    localStorage.lastName=lastName;
	
	if (firstName === lastName) {
		alert("First name and last name cannot be the same!");
		document.getElementById("firstName").value = "";
		document.getElementById("lastName").value = "";
		
		//document.getElementById("firstName").value = "First and last name cannot be the same!";
		//document.getElementById("lastName").value = "First and last name cannot be the same!";
	}

    var email=document.getElementById("email").value;
    localStorage.email=email;

    var phone=document.getElementById("phone").value;
    localStorage.phone=phone;

    var age=document.getElementById("age").value;
    localStorage.age=age;

    var genders=document.getElementsByName("gender");
    if(genders){
        for(i=0;i<genders.length;i++){
            if(genders[i].checked){
                localStorage.gender=genders[i].value;
                break;
            }
        }
    }
	
	var adreesLine1=document.getElementById("address-line1").value;
    localStorage.adreesLine1=adreesLine1;
	
	var adreesLine2=document.getElementById("address-line2").value;
    localStorage.adreesLine2=adreesLine2;
	
	var city=document.getElementById("city").value;
    localStorage.city=city;
	
	var region=document.getElementById("region").value;
    localStorage.region=region;
	
	var postalCode=document.getElementById("postal-code").value;
    localStorage.postalCode=postalCode;
	
	var country=document.getElementById("country").value;
    localStorage.country=country;
	
}
function loadOldSignUp(){
    var firstName=document.getElementById("firstName");
    firstName.value=localStorage.firstName;

    var lastName=document.getElementById("lastName");
    lastName.value=localStorage.lastName;

    var email=document.getElementById("email");
    email.value=localStorage.email;

    var phone=document.getElementById("phone");
    phone.value=localStorage.phone;

    var age=document.getElementById("age");
    age.value=localStorage.age;

    var genders=document.getElementsByName("gender");

    if(genders&&localStorage.gender){
        for(i=0;i<genders.length;i++){
            if(genders[i].value==localStorage.gender){
                genders[i].checked=true;
                break;
            }
        }
    }
	
	var adreesLine1=document.getElementById("address-line1");
    adreesLine1.value=localStorage.adreesLine1;
	
	var adreesLine2=document.getElementById("address-line2");
    adreesLine2.value=localStorage.adreesLine2;
	
	var city=document.getElementById("city");
    city.value=localStorage.city;
	
	var region=document.getElementById("region");
    region.value=localStorage.region;
	
	var postalCode=document.getElementById("postal-code");
    postalCode.value=localStorage.postalCode;
	
	var country=document.getElementById("country");
    country.value=localStorage.country;
}