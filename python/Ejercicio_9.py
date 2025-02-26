# Diccionario para almacenar las facturas
facturas = {}
cantidad_cobrada = 0
cantidad_pendiente = 0

while True:
    print("\nSeleccione una opción:")
    print("1. Añadir nueva factura")
    print("2. Pagar una factura")
    print("3. Terminar")
    opcion = input("Ingrese su opción: ")

    if opcion == "1":
        # Añadir una nueva factura
        numero_factura = input("Ingrese el número de la factura: ")
        coste = float(input("Ingrese el coste de la factura: "))
        facturas[numero_factura] = coste
        cantidad_pendiente += coste
        print(f"Factura {numero_factura} añadida con un coste de {coste:.2f}.")

    elif opcion == "2":
        # Pagar una factura existente
        numero_factura = input("Ingrese el número de la factura a pagar: ")
        if numero_factura in facturas:
            coste = facturas.pop(numero_factura)
            cantidad_cobrada += coste
            cantidad_pendiente -= coste
            print(f"Factura {numero_factura} pagada con un coste de {coste:.2f}.")
        else:
            print(f"La factura {numero_factura} no existe.")

    elif opcion == "3":
        # Terminar el programa
        print("Terminando el programa.")
        break

    else:
        print("Opción no válida. Intente nuevamente.")

    # Mostrar las cantidades cobradas y pendientes
    print(f"Cantidad cobrada hasta el momento: {cantidad_cobrada:.2f}")
    print(f"Cantidad pendiente de cobro: {cantidad_pendiente:.2f}")
