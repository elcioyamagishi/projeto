function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html"
    }

    let user = JSON.parse(userTxt);
    document.getElementById("user").innerHTML = `Bem-vindo(a), ${user.nome}!`
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto} width=30% height=30%>`
}