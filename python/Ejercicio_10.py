# Diccionario para almacenar clientes
clientes = {}

while True:
    # Mostrar el menú de opciones
    print("\nSeleccione una opción:")
    print("1. Añadir cliente")
    print("2. Eliminar cliente")
    print("3. Mostrar cliente")
    print("4. Listar todos los clientes")
    print("5. Listar clientes preferentes")
    print("6. Terminar")
    opcion = input("Ingrese su opción: ")

    if opcion == "1":
        # Añadir un nuevo cliente
        nif = input("Ingrese el NIF del cliente: ")
        nombre = input("Ingrese el nombre del cliente: ")
        direccion = input("Ingrese la dirección del cliente: ")
        telefono = input("Ingrese el teléfono del cliente: ")
        correo = input("Ingrese el correo electrónico del cliente: ")
        preferente = input("¿Es un cliente preferente? (sí/no): ").strip().lower() == "sí"

        clientes[nif] = {
            "Nombre": nombre,
            "Dirección": direccion,
            "Teléfono": telefono,
            "Correo": correo,
            "Preferente": preferente
        }
        print(f"Cliente {nombre} añadido con éxito.")

    elif opcion == "2":
        # Eliminar un cliente
        nif = input("Ingrese el NIF del cliente a eliminar: ")
        if clientes.pop(nif, None):
            print(f"Cliente con NIF {nif} eliminado con éxito.")
        else:
            print("Cliente no encontrado.")

    elif opcion == "3":
        # Mostrar datos de un cliente
        nif = input("Ingrese el NIF del cliente: ")
        cliente = clientes.get(nif)
        if cliente:
            print(f"Datos del cliente {nif}: {cliente}")
        else:
            print("Cliente no encontrado.")

    elif opcion == "4":
        # Listar todos los clientes
        if clientes:
            print("Lista de todos los clientes:")
            for nif, datos in clientes.items():
                print(f"NIF: {nif}, Nombre: {datos['Nombre']}")
        else:
            print("No hay clientes en la base de datos.")

    elif opcion == "5":
        # Listar clientes preferentes
        preferentes = {nif: datos for nif, datos in clientes.items() if datos["Preferente"]}
        if preferentes:
            print("Lista de clientes preferentes:")
            for nif, datos in preferentes.items():
                print(f"NIF: {nif}, Nombre: {datos['Nombre']}")
        else:
            print("No hay clientes preferentes en la base de datos.")

    elif opcion == "6":
        # Terminar el programa
        print("Terminando el programa.")
        break

    else:
        print("Opción no válida. Intente nuevamente.")
