function getWardrobes(){
  $.get("/api/wardrobe/", function(data){

    if(data.length <= 0){
     return;
    }

    var html = "";

     for(var i = 0 ; i< data.length ; i++){
        html += "<p>" + data[i].name + " Is it open: " + data[i].isOpen + "</p>";
        }

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