function storeSignUp(){
    var firstName=document.getElementById("firstName").value;
    localStorage.firstName=firstName;

    var lastName=document.getElementById("lastName").value;
    localStorage.lastName=lastName;

    /*
    if(firstName===lastName)
        alert("First name cannot be the same as last name");*/

    var email=document.getElementById("email").value;
    localStorage.email=email;

    var password=document.getElementById("password").value;
    localStorage.password=password;

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
}
function loadOldSignUp(){
    var firstName=document.getElementById("firstName");
    firstName.value=localStorage.firstName;

    var lastName=document.getElementById("lastName");
    lastName.value=localStorage.lastName;

    var email=document.getElementById("email");
    email.value=localStorage.email;

    var password=document.getElementById("password");
    password.value=localStorage.password;

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
}