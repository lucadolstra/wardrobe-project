function getWardrobe(){
  $.get("/api/wardrobe/", function(data){
      return;
       var html = "";
       html += "<p>" + data.name + " Is it open: " + data.isOpen + "</p>";
     $("#wardrobe").html(html);

     });
}

function saveWardrobe(e){
    e.preventDefault();
    var name = $("#name").val();
    var isOpen = true;

    $.get("/api/wardrobe/" + name + "/" + isOpen , function(){
        getWardrobe();

        });
 }

$("#saveForm").submit(saveWardrobe);  //eventhandler
getWardrobe();