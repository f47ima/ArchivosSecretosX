# Archivos Secretos X

Aplicación de consola en Java que administra un archivo de expedientes clasificados: avistamientos aéreos, registros de radar y testimonios.

> Trabajo realizado como primer parcial de Programación II de la Tecnicatura en Programación de la Universidad Tecnológica Nacional (UTN).

## Qué hace

Un `ArchivoSecreto` (en el ejemplo, "Boveda 51") guarda expedientes de tres tipos. Permite:

- Agregar expedientes. No se aceptan duplicados: dos expedientes son iguales si tienen el mismo código y el mismo agente a cargo.
- Listar todos los expedientes registrados.
- Filtrar los expedientes por nivel de secreto (`BAJO`, `MEDIO` o `ALTO`).
- Analizar y generar reportes de los expedientes que lo permiten.

| Tipo de expediente | Dato propio | Se puede analizar | Genera reporte |
|---|---|---|---|
| `AvistamientoAereo` | Ubicación | Sí | No |
| `RegistroRadar` | Altitud detectada | Sí | Sí |
| `TestimonioClasificado` | Nombre clave del testigo | No | Sí |

## Conceptos de POO aplicados

- **Clase abstracta:** `Expediente` define los datos comunes (código, agente y nivel de secreto) y obliga a las subclases a implementar `getDescripcion()`.
- **Herencia e interfaces:** los tres tipos de expediente extienden de `Expediente` y se combinan con las interfaces `Analizables` y `Reportables`.
- **Polimorfismo:** `Main` recorre una lista de `Expediente` y decide con `instanceof` qué puede analizar o reportar cada uno.
- **Enum:** `NivelSecreto` representa los niveles de confidencialidad.
- **Excepción propia:** `ExpedienteDuplicadoException` se lanza al intentar agregar un expediente repetido.
- **Validaciones y encapsulamiento:** los constructores validan sus parámetros (`NullPointerException` e `IllegalArgumentException`) y `obtenerExpedientes()` devuelve una copia de la lista.
- **Documentación:** todas las clases tienen Javadoc.

## Cómo ejecutarlo

Requiere **Java 17 o superior** (probado con JDK 21). Desde la carpeta del repositorio:

```bash
javac -d out src/gonzalez/fatima/pp/progii122/*.java
java -cp out gonzalez.fatima.pp.progii122.Main
```

También se puede abrir la carpeta `src` en un IDE como NetBeans o IntelliJ y ejecutar la clase `Main`.

## Ejemplo de salida

```
No se pudo agregar el expediente: Ya existe un expediente con codigo 'UAP-001' y agente 'Agente Fox'.
Expedientes registrados:
AvistamientoAereo[ codigo=UAP-001, agente=Agente Fox, nivelSecreto=ALTO, Ubicacion=Desierto de Nevada]
RegistroRadar[ codigo=RAD-777, agente=Agente Dana, nivelSecreto=MEDIO, altitudDetectada=12500]
TestimonioClasificado[ codigo=TEST-404, agente=Agente Skinner, nivelSecreto=BAJO, nombreClaveTestigo=Testigo Orion]
RegistroRadar[ codigo=RAD-999, agente=Agente Fox, nivelSecreto=ALTO, altitudDetectada=18300]


Expedientes analizables:
Se analizo el avistamiento aereo: UAP-001
Se analizo el registro de radar: RAD-777
El expediente 'TEST-404' no puede analizarse.
Se analizo el registro de radar: RAD-999

Reportes generados:
El expediente 'UAP-001' no genera reporte.
Reporte de radar: RAD-777. Altitud detectada: 12500 metros.
Reporte de testimonio clasificado : TEST-404 Nombre clave del testigo: Testigo Orion.
Reporte de radar: RAD-999. Altitud detectada: 18300 metros.

Expedientes de nivel ALTO:
AvistamientoAereo[ codigo=UAP-001, agente=Agente Fox, nivelSecreto=ALTO, Ubicacion=Desierto de Nevada]
RegistroRadar[ codigo=RAD-999, agente=Agente Fox, nivelSecreto=ALTO, altitudDetectada=18300]
```

La primera línea corresponde al intento de agregar por segunda vez el expediente `UAP-001` del agente Fox.

## Estructura del proyecto

```
src/gonzalez/fatima/pp/progii122/
├── Main.java
├── ArchivoSecreto.java
├── Expediente.java
├── AvistamientoAereo.java
├── RegistroRadar.java
├── TestimonioClasificado.java
├── NivelSecreto.java
├── Analizables.java
├── Reportables.java
└── ExpedienteDuplicadoException.java
```

El diagrama de clases está en [UML_PP_Defensa.pdf](UML_PP_Defensa.pdf).

## Tecnologías

- Java
