 function open(){
 $.get("/api/wardrobe/open", function(data){
 alert(data);
 });
 }

 function close(){
 $.get("/api/wardrobe/close", function(data){
 alert(data);
 $("#close").hide;
 });
 }

 function enter(){
 $.get("/api/wardrobe/enter", function(data){
 alert(data);
 });
 }

 function kick(){
 $.get("/api/wardrobe/kick", function(data){
 alert(data);
 });
 }

 function exit(){
 $.get("/api/wardrobe/exit", function(data){
 alert(data);
 });
 }

 function getCloset(){
               $.get("/api/wardrobe/", function(data){

                 alert(data);

                  });
         }

 function saveWardrobe(e){

        e.preventDefault();

        var name = $("#name").val();

         $.post("/api/wardrobe/add",
                {
                name : name
                },
                function(data, status){
                getCloset();
                alert("Data: " + data.name + "\nStatus: " + status);


                    });
             }



$("#saveForm").submit(saveWardrobe);  //eventhandler
$("#open").click(open);
$("#close").click(close);
$("#in").click(enter);
$("#kick").click(kick);
$("#out").click(exit);
