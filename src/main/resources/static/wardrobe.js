function getCloset(){
                $.get("/api/wardrobe/", function(data){

                   });
}

 function saveWardrobe(e){

        e.preventDefault();

        var name = $("#name").val();

         $.post("/api/wardrobe/add",
                {
                name : name

                },
               function(data){
                getCloset();
                $("p").html("Closet: " + data.name );
          });
}


 function open(){
 $.get("/api/wardrobe/open", function(data){
 $("p").html("Closet open: " + data);

 });
 }

 function close(){
 $.get("/api/wardrobe/close", function(data){
 $("p").html(data);
 });
  $("#close").hide;
 }

 function enter(){
 $.get("/api/wardrobe/enter", function(data){
  $("p").html(data);

 });
 }

 function kick(){
 $.get("/api/wardrobe/kick2", function(data){
  $("p").html(data);
 });
 }

 function exit(){
 $.get("/api/wardrobe/exit", function(data){
  $("p").html(data);
 });
 }

// function del(){
//  $.get("/api/wardrobe/delete", function(data){
//   $("p").html(data);
//  });
// }
//

$("#saveForm").submit(saveWardrobe);  //eventhandler
$("#open").click(open);
$("#close").click(close);
$("#in").click(enter);
$("#kick").click(kick);
$("#out").click(exit);
//$("#delete")click(del);
