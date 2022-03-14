//IIFE and Closure
const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("sowmya: "+empId()); 
  console.log("rahul: "+empId()); 
  console.log("Arya: "+empId());
   

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(lastName);
  }
  
  var greeting = function(ln){
    console.log('Welcome ' + ln);
  };
  
  fullName("sowmya", "kaitha", greeting);
  console.log("\n");
  fullName("rahul ", "kaitha", greeting);
  console.log("\n");
  fullName("Arya", "stark", greeting);
