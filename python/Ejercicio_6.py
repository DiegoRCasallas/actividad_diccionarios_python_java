# Crear un diccionario vacío
datos_persona = {}

# Lista de campos a solicitar
campos = ["Nombre", "Edad", "Sexo", "Teléfono", "Correo electrónico"]

# Solicitar los datos y llenar el diccionario
for campo in campos:
    valor = input(f"Ingrese su {campo}: ")
    datos_persona[campo] = valor

    # Mostrar los datos actuales
    print(f"Datos actuales: {datos_persona}")
