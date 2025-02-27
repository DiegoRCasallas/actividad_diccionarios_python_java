# Cadena de texto de ejemplo
directorio = """cedula;nombre;email;telefono;descuento
1001234567;Luis González;luisgonzalez@mail.com;656343576;12.5
1007654321;Ana López;analopez@mail.com;612345678;10.0"""

# Separar la cadena en líneas
lineas = directorio.split("\n")

# La primera línea contiene los nombres de los campos
campos = lineas[0].split(";")

# Crear un diccionario para almacenar la información de los clientes
clientes = {}

# Procesar cada línea (excepto la primera)
for linea in lineas[1:]:
    datos = linea.split(";")
    cedula = datos[0]
    
    # Crear un diccionario para el cliente actual
    info_cliente = {campos[i]: datos[i] for i in range(len(campos))}
    
    # Añadir el cliente al diccionario principal
    clientes[cedula] = info_cliente

# Mostrar el diccionario resultante
print("Diccionario de clientes:")
for cedula, info in clientes.items():
    print(f"Cédula: {cedula} -> Info: {info}")
