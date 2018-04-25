function getWardrobes(){
  $.get("/api/wardrobe/", function(data){

    if(data != null){
     return;
    }

    var html = "";

        html += "<p>" + data.name + " Is it open: " + data.isOpen + "</p>";


     $("#wardrobes").html(html);

     });
}

function saveWardrobe(e){
    e.preventDefault();
    var name = $("#name").val();
    var isOpen = true;

    $.get("/api/wardrobe/" + name + "/" + isOpen , function(){
        getWardrobes();

        });
 }

$("#saveForm").submit(saveWardrobe);  //eventhandler
getWardrobes();