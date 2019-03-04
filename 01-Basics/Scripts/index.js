function storeSignUp(){
    var firstName=document.getElementById("firstName").value;
    localStorage.firstName=firstName;
}
function loadOldSignUp(){
    var firstName=document.getElementById("firstName").value;
    firstName.value=localStorage.firstName;
}