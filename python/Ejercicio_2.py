# Solicitar los datos al usuario
nombre = input("Ingrese su nombre: ")
edad = input("Ingrese su edad: ")
direccion = input("Ingrese su dirección: ")
telefono = input("Ingrese su teléfono: ")

# Almacenar los datos en un diccionario
datos_usuario = {
    "Nombre": nombre,
    "Edad": edad,
    "Dirección": direccion,
    "Teléfono": telefono
}

# Mostrar el mensaje con la información
print(f"{datos_usuario['Nombre']} tiene {datos_usuario['Edad']} años, vive en {datos_usuario['Dirección']} y su número de teléfono es {datos_usuario['Teléfono']}.")
