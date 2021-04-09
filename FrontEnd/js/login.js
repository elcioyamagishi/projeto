function autenticar(evento) {
    evento.preventDefault(); //cancela o envio do formulario

    let user = document.getElementById("txtUser").value
    let senha = document.getElementById("txtSenha").value

    let usuario = {
        email: user,
        racf: user,
        senha: senha // montando o objetivo << agora precisamos colocar no corpo da mensagem

    }

    let msg = {
        method: 'POST', //declarando qual método utilizaremos no login
        body: JSON.stringify(usuario),// colocando o que terá no corpo da mensagem. Temos que transformar o objetivo em js em texto (ir em formato JSON através do stringify)
        headers: {
            'Content-type': 'application/json' // ou seja, construimos um objeto e o corpo da msg que enviaremos para o backend
        }
    }

    fetch("http://localhost:8080/usuarios/login", msg)
        .then(res => tratarResposta(res)) // chamada async - comando para enviar para o backend. then() é promessa

}

function tratarResposta(resposta) {
   if(resposta.status !=200){
       document.getElementById("msgError").innerHTML = "Usuário/Senha invalido(a)"
   }else{
       resposta.json().then(res => fazerLogin(res)) // só traz as informações de dentro do usuário

   }
    
}

function fazerLogin(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "dashmenu.html" 
    
}

