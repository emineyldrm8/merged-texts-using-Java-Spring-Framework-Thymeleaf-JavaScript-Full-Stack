
 function generate() {
        var a = parseInt(document.getElementById("nochapter").value);
        let ch = document.getElementById("ch");
        const kelimelistesi = [];

        ch.innerHTML = "";

        for (i = 0; i < a; i++) {
          let li = `
                         <div id="added-text">
                        <div class="d-flex flex-column bg-light p-3 mb-3">
                          <textarea id="${i}" name="added-text" rows="4" cols="50"></textarea>
                        </div>
                        </div>


                `;

          ch.insertAdjacentHTML("beforeend", li);
        }
      }

      function combination() {
        var a = parseInt(document.getElementById("nochapter").value);

        const kelimelistesi = [];
        const chler = [];
        for (i = 0; i < a; i++) {
          chler[i] = document.getElementById("ch").value;
        }
        
        let ch = document.getElementById("end");

        
        var i;
        for (i = 0; i < a; i++) {
          var istring = i.toString();
          var girilentext = document.getElementById(istring).value;
          kelimelistesi[i] = girilentext;
        }
        let tummetinler = kelimelistesi.join("-");
  
           var kelimesayisi=document.getElementById("nochapter").value;
            var kullaniciForm = {}
        kullaniciForm["enterednumber"] =kelimesayisi;
        kullaniciForm["allTexts"] =tummetinler;
        
   

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/kullanici",
            data: JSON.stringify(kullaniciForm),
            dataType: 'json',
            cache: false,
            timeout: 600000000000,
            success: function (data) {
            },
            error: function (e) {

            }
        });
      }
 function cleanpage()
 { let clearResult= document.getElementById("result");
 let clearResultforonewords= document.getElementById("resultforonewords");
 let clearDuration= document.getElementById("duration");
        clearResult.innerHTML = "";
       clearDuration.innerHTML = "";
	 clearResultforonewords.innerHTML="";
 }
      
       
   

