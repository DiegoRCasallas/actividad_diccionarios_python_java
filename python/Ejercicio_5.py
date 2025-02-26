# Diccionario con los créditos de las asignaturas
creditos_curso = {
    "Matemáticas": 6,
    "Física": 4,
    "Química": 5
}

# Mostrar los créditos de cada asignatura
for asignatura, creditos in creditos_curso.items():
    print(f"{asignatura} tiene {creditos} créditos.")

# Calcular y mostrar el total de créditos
total_creditos = sum(creditos_curso.values())
print(f"El total de créditos del curso es {total_creditos}.")
