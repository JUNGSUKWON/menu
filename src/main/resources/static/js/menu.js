$(document).ready(function(){
    $("button").click(function(){
      $.post("/ajaxmenu.naver",
      {
          menu: $("#menu").val(), 
          img_link: $("#img_link").val()
      },
      function(data, status){
        //alert("Data: " + data + "\nStatus: " + status);
  //   		$("#div1").html(data);  // div1의 위치에 html 출력
          console.log(data);
          alert(data);
            // 새로 고침
            location.reload();
      });
    });
  });