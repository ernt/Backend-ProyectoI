const nombre = document.getElementById("Name");
const precios = document.getElementById("precios");
const descripcion = document.getElementById("descripcion");
const categoria = document.getElementById("categoria");
const imagen = document.getElementById("imagen");
const descuento_id = document.getElementById("descuento_id");
const cantidad = document.getElementById("cantidad");

let btnEditar = document.getElementById("btnEditar");

let btnAgregar = document.getElementById("btnAgregar");
let btnEliminar = document.getElementById("btnEliminar");
const imagenValidacion = document.getElementById("imagen");
const iconoImagen = document.querySelector(".btnImagen");

let alertValidacionesTexto = document.getElementById("alertValidacionesTexto");
let alertValidaciones = document.getElementById("alertValidaciones");

let contenedorTarjetas = document.getElementById("contenedorTarjetas");

let datos = JSON.parse(localStorage.getItem("datos")) || []; // aqui se guarda la tabla

let isValid = true;
let idTimeout;
let precio = 0;

//quita el bugsito de que si das enter se eliminen objetos
document.addEventListener("keydown", function (e) {
  if (e.key === "Enter" && e.target.nodeName === "INPUT") {
    e.preventDefault();
    return false;
  }
});

//VALIDA CAMPOS CON BORDE ROJO  O VERDE
// btnAgregar.addEventListener("click", function (event) {
//   event.preventDefault();
//   isValid = true;
//   clearTimeout(idTimeout);
//   //quita los textos si se cumple todo
//   alertValidacionesTexto.innerHTML = "";
//   //quita el se debe escribir.. estableciendolo en none fijo
//   alertValidaciones.style.display = "none";
//   //   nombre.value = nombre.value.trim(); HACE LO MISMO QUE BLUR
//   let lista = "Los siguientes campos deben ser llenados correctamente:<ul>";
//   //validacion de campo nombre
//   nombre.value.length < 2
//     ? ((nombre.style.border = "solid thin red"),
//       (lista += "<li>Se debe escribir un nombre de 2 o mas letras</li>"),
//       (alertValidaciones.style.display = "block"),
//       (isValid = false))
//     : (nombre.style.border = "");
//   //validacion campo descripcion
//   descripcion.value.length < 10
//     ? ((descripcion.style.border = "solid thin red"),
//       (lista += "<li>Se debe escribir una descripcion mayor a 10 caracteres</li>"),
//       (alertValidaciones.style.display = "block"),
//       (isValid = false))
//     : (descripcion.style.border = "");
//   //validacion categoria
//   !categoria.value
//     ? ((categoria.style.border = "solid thin red"),
//       (lista += "<li>Se debe seleccionar una categoria</li>"),
//       (alertValidaciones.style.display = "block"),
//       (isValid = false))
//     : (categoria.style.border = "");
//   //validacion imagen
//   imagenValidacion.files.length === 0
//     ? ((iconoImagen.style.border = "solid thin red"),
//       (lista += "<li>Agrega una imagen</li>"),
//       (alertValidaciones.style.display = "block"),
//       (isValid = false))
//     : (iconoImagen.style.border = "");

//   //validacion de campo precio
//   !validarPrecio()
//     ? ((precios.style.border = "solid thin red"),
//       (lista += "<li> Se debe escribir una precio valido</li>"),
//       (alertValidaciones.style.display = "block"),
//       (isValid = false))
//     : (precios.style.border = "");

//   lista += "</ul>";
//   alertValidacionesTexto.insertAdjacentHTML("beforeend", lista);

//   idTimeout = setTimeout(() => {
//     alertValidaciones.style.display = "none";
//   }, 3000);

//   if (isValid) {
//     const timestamp = new Date().getTime();
//     let card = `
//     <div id="${timestamp}" class="card m-3 col-sm-4 col-md-4 col-lg-3 col-xl-3 ">
//     <img src="${imagen}" alt="img" class="img-fluid fixed-image cardImage">
//       <div class="card-body">
//         <h5 class="card-title">${nombre.value}</h5>
//         <p class="card-price">Precio: ${precios.value}</p>
//         <div class="content">
//         <p class="card-text">${descripcion.value}</p>
//         <a class="popover-btn">Leer más </a>
//         <section class="popover">
//         <h3>
//         ${nombre.value}
//         </h3>
//         <span>
//         Precio: <strong>${precios.value}</strong>
//         </span>
//         <p>
//         ${descripcion.value}
//         </p>
//         <button onclick="eliminarPoper(event)" class="" id="btnPoper"><i class="bi bi-x-circle fs-5"></i></button>
//         </section>
//         <button type="button" onclick="eliminarCard(event)" class="btn btn-danger btn-sm "  id="btnEliminar">Eliminar</button>
//         <button id="btnEditar"onclick="editarProducto(event)" type="button" class="btn btn-outline-primary btn-sm"><i class="bi bi-pencil-square"></i></button>
//       </div>
//     </div>

//     `;

//     let elemento = `{
//     "id"          :     "${timestamp}",
//     "imagen"      :     "${imagen}",
//     "nombre"      :     "${nombre.value}",
//     "precio"      :     "${precios.value}",
//     "descripcion" :     "${descripcion.value}",
//     "categoria"   :     "${categoria.value}"
//   }`;

//     datos.push(JSON.parse(elemento));
//     localStorage.setItem("datos", JSON.stringify(datos));

//     contenedorTarjetas.insertAdjacentHTML("beforeend", card);

//     //popers
//     let buttons = document.querySelectorAll(".popover-btn");
//     let popovers = document.querySelectorAll(".popover");

//     buttons.forEach(function (button, index) {
//       let popover = popovers[index];
//       button.addEventListener("click", function (e) {
//         e.preventDefault;
//         popover.style.display = "block";
//       });
//     });

//     document.addEventListener("click", function (event) {
//       buttons.forEach(function (button, index) {
//         let popover = popovers[index];
//         if (!button.contains(event.target) && !popover.contains(event.target)) {
//           popover.style.display = "none";
//         }
//       });
//     });

//     descripcion.value = "";
//     precios.value = "";
//     nombre.value = "";
//     document.getElementById("vista-previa").src = "";
//     nombre.focus();
//     categoria.value = "";
//   }
// });

// CUANDO TE SALES DEL CAMPO "BLUR" en este caso quita espacios
// precios.addEventListener("blur", function (event) {
//   event.preventDefault();
//   precios.value = precios.value.trim();
//   nombre.value = nombre.value.trim();
//   descripcion.value = descripcion.value.trim();
// });

// function eliminarCard(event) {
//   let tarjeta = event.target.closest(".card");

//   // Obtener el ID de la tarjeta que se va a eliminar
//   let idTarjeta = tarjeta.getAttribute("id");

//   // Mostrar el cuadro de confirmación de Bootstrap
//   let confirmationModal = new bootstrap.Modal(document.getElementById("confirmation-modal"));
//   let modalTitle = document.getElementById("modal-title");
//   let modalBody = document.getElementById("modal-body");
//   modalTitle.textContent = "¿Estás seguro de que deseas eliminar el producto?";
//   modalBody.textContent = "Esta acción no se puede deshacer.";
//   confirmationModal.show();

//   // Manejar la respuesta del usuario
//   let confirmYes = document.getElementById("confirm-yes");
//   let confirmNo = document.getElementById("confirm-no");
//   confirmYes.addEventListener("click", function () {
//     // Eliminar la tarjeta del DOM
//     tarjeta.remove();

//     // Eliminar la tarjeta de los datos almacenados en el local storage
//     let indice = datos.findIndex((elemento) => elemento.id === idTarjeta);
//     if (indice !== -1) {
//       datos.splice(indice, 1);
//       localStorage.setItem("datos", JSON.stringify(datos));
//     }

//     // Ocultar el cuadro de confirmación de Bootstrap
//     confirmationModal.hide();
//   });
//   confirmNo.addEventListener("click", function () {
//     // Ocultar el cuadro de confirmación de Bootstrap
//     confirmationModal.hide();
//   });
// }

// function editarProducto(event) {
//   //obtener el elemento padre mas cercano
//   let tarjeta = event.target.closest(".card");
//   // Obtener el ID de la tarjeta que se va a eliminar
//   let idTarjeta = tarjeta.getAttribute("id");
//   //muestra el modal
//   let confirmationModal = new bootstrap.Modal(document.getElementById("exampleModal"));
//   confirmationModal.show();
//   let btnAgregarModal = document.getElementById("btnAgregarModal");
//   let nombreModal = document.getElementById("NameModal");
//   let preciosModal = document.getElementById("preciosModal");
//   let descripcionModal = document.getElementById("descripcionModal");

//   btnAgregarModal.addEventListener("click", function () {
//     let nombreTarjeta = tarjeta.querySelector("h5");
//     let precioTarjeta = tarjeta.querySelector(".card-price");
//     let descripcionmTarjeta = tarjeta.querySelector(".card-text");

//     let validacionModal = true;

//     nombreModal.value.length < 2
//       ? ((nombreModal.style.border = "solid thin red"),
//         (alertValidaciones.style.display = "block"),
//         (validacionModal = false))
//       : (nombreModal.style.border = "");

//     descripcionModal.value.length < 10
//       ? ((descripcionModal.style.border = "solid thin red"),
//         (alertValidaciones.style.display = "block"),
//         (validacionModal = false))
//       : (descripcionModal.style.border = "");

//     preciosModal.value == "" ||
//     isNaN(preciosModal.value) ||
//     parseFloat(preciosModal.value) <= 0
//       ? ((preciosModal.style.border = "solid thin red"),
//         (alertValidaciones.style.display = "block"),
//         (validacionModal = false))
//       : (preciosModal.style.border = "");

//     if (validacionModal) {
//       btnAgregarModal.setAttribute("data-bs-dismiss", "modal");
//       btnAgregarModal.classList.remove("btn-primary");
//       btnAgregarModal.classList.add("btn-danger");
//       btnAgregarModal.innerText = "Cerrar";
//     }

//     if (validacionModal) {
//       //cambiar datos de la card
//       (nombreTarjeta.innerText = nombreModal.value),
//         (precioTarjeta.innerText = preciosModal.value),
//         (descripcionmTarjeta.innerText = descripcionModal.value);
//       // guardar los cambios en el localStorage
//       let productos = JSON.parse(localStorage.getItem("datos"));
//       let producto = productos.find((p) => p.id === idTarjeta);
//       producto.nombre = nombreModal.value;
//       producto.precio = preciosModal.value;
//       producto.descripcion = descripcionModal.value;
//       localStorage.setItem("datos", JSON.stringify(productos));
//     }
//   });
// }
//GET-----------------------------------------------------------------
const getAll = async () => {
  try {
    let res = await fetch("/api/productos/");
    let json = await res.json();

    if (!res.ok) throw { status: res.status, statusText: res.statusText };

    json.forEach((cargado) => {
      let cardGuardadas = `
        <div id="${cargado.id}" class="card m-3 col-sm-4 col-md-4 col-lg-3 col-xl-3 ">
        <img src="${cargado.imagen}" alt="img" class="img-fluid fixed-image cardImage">
          <div class="card-body">
            <h5 class="card-title">${cargado.nombre}</h5>
            <p class="card-price">Precio: ${cargado.precio}</p>
            <p class="card-text">${cargado.descripcion}</p>
            <a class="popover-btn">Leer más </a>
            <section class="popover">
            <h3>
            ${cargado.nombre}
            </h3>
            <span>
            Precio: <strong>${cargado.precio}</strong>
            </span>
            <p>
            ${cargado.descripcion}
            </p>
            
            <button onclick="eliminarPoper(event)" class="" id="btnPoper"><i class="bi bi-x-circle fs-5"></i></button>
            </section>
            <button type="button" onclick="eliminarCard(event)" class="btn btn-danger btn-sm "  id="btnEliminar">Eliminar</button>
            <button id="btnEditar" data-bs-toggle="modal" data-bs-target="#exampleModal"  onclick="agregarDatosForm(event)" type="button" class="btn btn-outline-primary btn-sm"><i class="bi bi-pencil-square"></i></button>
    
      `;
      contenedorTarjetas.insertAdjacentHTML("beforeend", cardGuardadas);
    });
  } catch (err) {
    let message = err.statusText || "Ocurrio un error al cargar";
    contenedorTarjetas.insertAdjacentHTML(
      "beforeend",
      `<p>Error ${err.status}:${message}</p>`
    );
  }
};
document.addEventListener("DOMContentLoaded", getAll);

//POST---------------------------------------------------------------------
btnAgregar.addEventListener("click", async (e) => {
  e.preventDefault();
  try {
    let RequestOptions = {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        nombre: nombre.value,
        descripcion: descripcion.value,
        imagen: `${imagen.value}`,
        precio: precios.value,
        cantidad: cantidad.value,
        descuento_id: descuento_id.value,
        categoria: categoria.value,
      }),
    };
    let res = await fetch("/api/productos/", RequestOptions);
    let json = await res.json();

    if (res.ok) location.reload();
    if (!res.ok) throw { status: res.status, statusText: res.statusText };
  } catch (err) {
    let message = err.statusText || "Ocurrio un error al agregar";
    contenedorTarjetas.insertAdjacentHTML(
      "beforeend",
      `<p>Error ${err.status}:${message}</p>`
    );
  }
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

//DELETE -------------------------------------------------------------
function eliminarCard(event) {
  event.preventDefault();
  let tarjetaPadre = event.target.closest(".card");
  let idProductoBorrado = tarjetaPadre.id;

  try {
    let RequestOptions = {
      method: "DELETE",
    };
    let res = fetch(`/api/productos/${idProductoBorrado}`, RequestOptions);

    location.reload();
  } catch (err) {
    let message = err.statusText || "Ocurrio un error al borrar";
    contenedorTarjetas.insertAdjacentHTML(
      "beforeend",
      `<p>Error ${err.status}:${message}</p>`
    );
  }
}

const nombreModal = document.getElementById("nombreModal");
const preciosModal = document.getElementById("precioModal");
const descripcionModal = document.getElementById("descripcionModal");
const categoriaModal = document.getElementById("categoriaModal");
const imagenModal = document.getElementById("imagenModal");
const descuento_idModal = document.getElementById("descuento_idModal");
const cantidadModal = document.getElementById("cantidadModal");
let idProductoEditado;
//Relleno del modal con el producto seleccionado
async function agregarDatosForm(event) {
  idProductoEditado = event.target.closest(".card").id;
  try {
    let res = await fetch(`/api/productos/${idProductoEditado}`);
    let json = await res.json();

    if (!res.ok) throw { status: res.status, statusText: res.statusText };
    nombreModal.value = json.nombre;
    preciosModal.value = json.precio;
    descripcionModal.value = json.descripcion;
    categoriaModal.value = json.categorias_id;
    imagenModal.value = json.imagen;
    descuento_idModal.value = json.descuento_id;
    cantidadModal.value = json.cantidad;
  } catch (error) {
    let message = err.statusText || "Ocurrio un error al cargar";
    contenedorTarjetas.insertAdjacentHTML(
      "beforeend",
      `<p>Error ${err.status}:${message}</p>`
    );
  }
}

//PUT
async function editarProducto(event) {
  event.preventDefault();
  try {
    let RequestOptions = {
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        nombre: nombreModal.value,
        descripcion: categoriaModal.value,
        imagen: imagenModal.value,
        precio: preciosModal.value,
        cantidad: cantidadModal.value,
        descuento_id: descuento_idModal.value,
        categorias_id: categoriaModal.value,
      }),
    };
    console.log(RequestOptions.body);
    console.log(idProductoEditado);
    let res = await fetch(`/api/productos/${idProductoEditado}`, RequestOptions);
    let json = await res.json();
    if (!res.ok) throw { status: res.status, statusText: res.statusText };
  } catch (error) {
    let message = "Ocurrio un error al editar";
    contenedorTarjetas.insertAdjacentHTML("afterbegin", `<p>Error:${message}</p>`);
  }
}
