# Transportari
## Integrantes
| Nombres | Github |
|---|---|
| Leidy Marcela Ducuara | [Link](https://github.com/LeidyDucuara) |
| Juan Camilo Gil | [Link](https://github.com/Juank544) |
| Juan Sebastián Caceres | [link](https://github.com/sroll835) |

---
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/f0e85251df3b45d4bec535fe95f0e8ab)](https://www.codacy.com?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=MichisTeam/Transportari&amp;utm_campaign=Badge_Grade)

[![CircleCI](https://circleci.com/gh/MichisTeam/Transportari.svg?style=svg&circle-token=de58f232b79b20bc09b75c300769d70096ff6c35)](https://circleci.com/gh/MichisTeam/Transportari)

## Resumen

Transportari es una aplicación de movilidad que nos permite cononcer las rutas del Sistema Integrado de Transporte 
Público y saber en tiempo real la ubicación de la ruta que necesitamos específicamente, también podremos conocer que 
tan solicitada es la ruta y así planear los tiempos de viaje que tendrá el usuario.

## Descripción

Esta idea se enfoca en mejorar los viajes en el transporte público, de manera que se tenga un mejor manejo en los 
tiempos y la gestión de los recursos que se disponen, en este caso los buses de SITP y Transmilenio.

## Problema que se resuelve

Este sistema es muy impredecible la hora a la que puede pasar un bus, donde las personas pierden tiempo por una mala 
gestión de los recursos, Google nos ofrece unos intervalos de tiempo, pero no son muy precisos y el nombre de las rutas 
no están actualizadas.

![img](img/intervalos.png)

Teniendo la posición actual de los buses las personas mejoran la gestión de su tiempo. 

## Alcance

- La idea se propone para un alcance local, donde los capitalinos puedan disfrutar de un mejor servicio de transporte 
público.

- El real time se evidencia en la posición real del bus para poder escoger la mejor ruta.

## Historias de Usuario

#### Registrar viaje

COMO: Usuario del sistema <br/>
QUIERO: Registrar un viaje dentro del sistema <br/>
PARA QUÉ: Aparecer en el sistema como viajero activo dentro de una ruta <br/>

#### Actualizar viaje

COMO: Usuario del sistema <br/>
QUIERO: Realizar cambios en mi viaje <br/>
PARA QUÉ: Poder cambiar de destino en caso de ser necesario <br/>

#### Consultar rutas de transporte

COMO: Usuario del sistema <br/>
QUIERO: Ver rutas próximas que necesito <br/>
PARA QUÉ: Escoger la mejor ruta que brinde los tiempos de desplazamiento óptimos <br/>

#### Consultar densidad de usuarios

COMO: Usuario del sistema <br/>
QUIERO: Ver la cantidad de usuarios <br/>
PARA QUÉ: Saber la disponibilidad de asientos <br/>

## Diseño Entidad-Relación

![img](img/entidad-relacion.png)