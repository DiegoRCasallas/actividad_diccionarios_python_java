# Diccionario de meses
meses = {
    "01": "enero", "02": "febrero", "03": "marzo", "04": "abril",
    "05": "mayo", "06": "junio", "07": "julio", "08": "agosto",
    "09": "septiembre", "10": "octubre", "11": "noviembre", "12": "diciembre"
}

# Solicitar la fecha al usuario
fecha = input("Ingrese la fecha en formato dd/mm/aaaa: ")

# Separar la fecha en día, mes y año
partes = fecha.split("/")
if len(partes) != 3:
    print("Formato de fecha incorrecto. Asegúrese de ingresar una fecha en el formato dd/mm/aaaa.")
else:
    dia, mes, año = partes

    # Verificar si el mes es válido
    if mes in meses:
        # Mostrar la fecha en el nuevo formato
        print(f"{dia} de {meses[mes]} de {año}")
    else:
        print("Mes no válido. Asegúrese de ingresar una fecha en el formato correcto.")
