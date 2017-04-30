function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}

function validateBasic(){
     var login=document.getElementById('nombre').value;
     var pass=document.getElementById('pass').value;
      if(login.trim().length<=0){
        alert("El nombre de usuario esta vacio");
        document.getElementById('nombre').focus();
        return false;
    }
    
   if(pass.trim().length<=0){
        alert("La password esta vacia");
        document.getElementById('pass').focus();
        return false;
    }
    return true;
}

function validate(){
    var pass=document.getElementById('loginPass').value;
    var passCheck=document.getElementById('loginPassCheck').value;
    var phone=document.getElementById('telefono').value;
    var email=document.getElementById('email').value;
    var nombre=document.getElementById('nombre').value;
    var login=document.getElementById('loginName').value;
    var apellido=document.getElementById('apellido').value;
    
       if(nombre.trim().length<=0){
        alert("El campo nombre esta vacio");
        document.getElementById('nombre').focus();
        return false;
    }
      if(apellido.trim().length<=0){
        alert("El campo apellido esta vacio");
        document.getElementById('apellido').focus();
        return false;
    }
   
    
    if(login.trim().length<=0){
        alert("El nombre de usuario esta vacio");
        document.getElementById('loginName').focus();
        return false;
    }
    
   if(pass.trim().length<=0){
        alert("La password esta vacia");
        document.getElementById('loginPass').focus();
        return false;
    }
    if(!(pass===passCheck))
    {
	alert("Las passwords no coinciden");
        document.getElementById('loginPassCheck').value="";
        document.getElementById('loginPassCheck').focus();
	return false;
    }
     if(!validateEmail(email)){
        alert("El email no es correcto");
        document.getElementById('email').focus();
        return false;
    }
   if(phone.trim().length<=0){
        alert("El campo telefono esta vacio");
        document.getElementById('telefono').focus();
        return false;
    }
   
  
   
    if(!(/[0-9]/.test(phone))) {
        alert("El campo telefono debe tener solo numeros");
        document.getElementById('telefono').focus();
        return false;
    }
    return true;
   
}
