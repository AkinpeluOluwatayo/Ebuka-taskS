const prompt = require('prompt-sync')();
function checkPassword(correctpass){

  
   for(let index = 1; index <= 3; index++){
  
   let userPin = parseInt(prompt("Enter security pin (4 digit pin)"));
   
   if(userPin === correctpass){

      console.log("Access granted");
	return;

    }else{
      
      console.log("Try again");

   }
  }

	console.log("Access denied");
    }
checkPassword(1234);
