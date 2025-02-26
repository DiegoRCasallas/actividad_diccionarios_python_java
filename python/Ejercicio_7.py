# Crear un diccionario para la cesta de la compra
cesta_compra = {}

# Ciclo para añadir artículos a la cesta
while True:
    articulo = input("Ingrese el nombre del artículo (o 'terminar' para finalizar): ").lower()
    if articulo == "terminar":
        break
    precio = float(input(f"Ingrese el precio de {articulo}: "))
    cesta_compra[articulo] = precio

# Mostrar la lista de la compra y calcular el coste total
print("\nLista de la compra:")
coste_total = 0
for articulo, precio in cesta_compra.items():
    print(f"{articulo}: {precio:.2f}")
    coste_total += precio

print(f"\nTotal Coste: {coste_total:.2f}")
