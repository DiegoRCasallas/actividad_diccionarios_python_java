
# Diccionario de precios de repuestos
precios_repuestos = {
    "Bujia": 1.40,
    "Pastillas de freno": 5.80,
    "Radiador": 300.50,
    "Rodamiento": 10.70
}

# Solicitar al usuario el nombre del repuesto
repuesto = input("Ingrese el nombre del repuesto: ").strip().lower()

# Convertir la primera letra a mayúscula
repuesto = repuesto.capitalize()

# Verificar si el repuesto está en el diccionario
if repuesto in precios_repuestos:
    cantidad = int(input("Ingrese la cantidad requerida: "))
    precio_total = precios_repuestos[repuesto] * cantidad
    print(f"El precio total de {cantidad} {repuesto}(s) es {precio_total:.2f} pesos.")
else:
    print("El repuesto no se encuentra en el inventario.")
