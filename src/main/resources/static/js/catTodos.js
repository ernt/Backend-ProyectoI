let contenedorTarjetas = document.getElementById("contenedorTarjetas");

//CAMBIAR ARREGLO DE OBJETOS POR LO QUE DEVUELVE LA PROMESA
// Realiza la llamada al API para obtener la lista de objetos modelo
fetch("/api/productos/")
  .then((response) => response.json())
  .then((data) => {
    products = data;
    // Maneja la lista de productos
    products.forEach((cargado) => {
      let card = `
        <div id="${cargado.id}" class="card m-3 col-sm-4 col-md-4 col-lg-3 col-xl-3 ">
        <img src="${cargado.imagen}" alt="img" class="img-fluid fixed-image cardImage">
          <div class="card-body">
            <h5 class="card-title">${cargado.nombre}</h5>
            <p class="card-price">Precio: ${cargado.precio}</p>
            <div>
            <div>
            <p class="card-text">${cargado.descripcion}</p>
            <button class="popover-btn">Leer más </button>
            <button  onclick="agregarProducto(event)" class="btn carritoBoton"><i class="bi bi-cart-plus fs-4"></i></button>
            <section class="popover">
            <h3>
            ${cargado.nombre}
            </h3>
            <span>
            Precio: <strong >${cargado.precio}</strong>
            </span>
            <p>
            ${cargado.descripcion}
            </p>
            <button onclick="eliminarPoper(event)" class="" id="btnPoper"><i class="bi bi-x-circle fs-5"></i></button>
            </section>
            </div>
          </div>
        </div>
      `;

      contenedorTarjetas.insertAdjacentHTML("beforeend", card);
    });
  })
  .catch((error) => {
    // Maneja errores de la solicitud
    console.error("Error:", error);
  });
let buttons = document.querySelectorAll(".popover-btn");
let popovers = document.querySelectorAll(".popover");

buttons.forEach(function (button, index) {
  let popover = popovers[index];
  button.addEventListener("click", function () {
    popover.style.display = "block";
  });
});

document.addEventListener("click", function (event) {
  buttons.forEach(function (button, index) {
    let popover = popovers[index];
    if (!button.contains(event.target) && !popover.contains(event.target)) {
      popover.style.display = "none";
    }
  });
});
