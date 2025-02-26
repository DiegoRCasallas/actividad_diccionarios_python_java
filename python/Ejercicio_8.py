# Solicitar la lista de palabras y sus traducciones
entrada = input("Ingrese las palabras en formato 'español:inglés' separadas por comas: ")

# Crear el diccionario de traducción
diccionario_traduccion = {}
pares = entrada.split(",")

for par in pares:
    idiomas = par.split(":")
    espanol = idiomas[0].strip()
    ingles = idiomas[1].strip()
    diccionario_traduccion[espanol] = ingles

# Solicitar la frase en español para traducir
frase = input("Ingrese una frase en español: ")

# Traducir la frase palabra por palabra
palabras = frase.split(" ")
frase_traducida = " ".join(diccionario_traduccion.get(palabra, palabra) for palabra in palabras)

# Mostrar la frase traducida
print(f"Frase traducida: {frase_traducida}")
