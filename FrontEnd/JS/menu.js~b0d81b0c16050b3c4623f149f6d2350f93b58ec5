function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html"
    }

    let user = JSON.parse(userTxt);
    document.getElementById("user").innerHTML = `Bem-vindo(a), ${user.nome} (RACF: ${user.racf})!`
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto} width=30% height=30%>`
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function gerarRelatorio() {
   // let dataInicio = document.getElementById("dataInicio").value
   // let dataFinal = document.getElementById("dataFinal").value
    
   
   fetch("http://localhost:8080/usuarios/all")
    .then(res => tratarResposta(res))

}

 function tratarResposta(resposta) {
     if(resposta){
   resposta.json().then(res => exibirDados(res))
     }
     
 }   

 function exibirDados(listaUsers) {
    let tabela = '<table class = table table-sm> <tr> <th>nome</th> <th>email</th> <th>RACF</th>  </tr>'

    for(i=0; i < listaUsers.length; i++) {
        tabela = tabela + `<tr> <td>${listaUsers[i].nome}</td>  <td>${listaUsers[i].email}</td> <td>${listaUsers[i].racf}</td> </tr>`
    }

    tabela = tabela + '</table>'
    document.getElementById("tabela").innerHTML = tabela
}