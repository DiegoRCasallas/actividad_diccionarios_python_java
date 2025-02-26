# Diccionario de divisas y sus valores en pesos colombianos
divisas = {
    "Euro": 4444.0,
    "Dollar": 4422.0,
    "Yen": 31.86,
    "Libra": 5157.0,
    "Franco Suizo": 4811.0,
    "Dólar Canadiense": 3271.0,
    "Peso Mexicano": 220.0,
    "Real Brasileño": 870.0,
    "Rublo Ruso": 55.45,
    "Yuan Chino": 677.5
}

# Preguntar al usuario por una divisa
divisa = input("Ingrese el nombre de la divisa: ").strip().lower()

# Convertir la primera letra a mayúscula
divisa = divisa.capitalize()

if divisa in divisas:
    valor = float(input(f"Ingrese el valor en {divisa}: "))
    conversion = valor * divisas[divisa]
    print(f"{valor} {divisa}(s) equivale a {conversion} pesos colombianos.")
else:
    print("Divisa no encontrada en el diccionario.")
