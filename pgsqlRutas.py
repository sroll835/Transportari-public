import csv


nombre_archivo = "rutas.csv"
with open(nombre_archivo, "r") as archivo:
    lector = csv.reader(archivo, delimiter=",")
    next(lector, None)
    for fila in lector:
        fila = fila[0].split(";")
        iR = fila[0]
        nR = fila[1]
        d = fila[2]
        p = fila[3]
        nP = fila[4]
        tS = fila[5]
        e = fila[6]
        print("INSERT INTO rutas (idRuta,nombre,destino,posicion,parada,servicio,estacion) VALUES "+"("+iR+","+"'"+nR+"'"+","+"'"+d+"'"+","+p+","+"'"+nP+"'"+","+"'"+tS+"'"+","+"'"+e+"'"+");")
