**Tarea de Interfaces en Java**

Este repositorio contiene la implementación de tres sistemas prácticos desarrollados en Java, centrados en el uso de interfaces como contratos de comportamiento, aplicación de polimorfismo y segregación de responsabilidades.

**Descripción de los Ejercicios**

**1. Sistema Académico de Documentos (Nivel Medio)**
Gestión de impresión para documentos institucionales mediante una interfaz común.
* **Interfaz:** `Imprimible`.
* **Clases:** `Certificado`, `ActaNotas` y `HorarioAcademico`.
* **Características:** Cada clase maneja atributos propios (carrera, período, etc.) y personaliza su mensaje de impresión.

**2. Sistema Bancario de Pagos (Nivel Medio)**
Procesamiento de transacciones financieras con reglas de negocio específicas.
* **Interfaz:** `Pagable`.
* **Clases:** `PagoEfectivo`, `PagoTarjeta` y `Transferencia`.
* **Lógica:** Implementa validación de montos positivos y el cálculo de comisiones adicionales para tarjetas y transferencias.

**3. Sistema de Roles Empresariales (Nivel Avanzado Plus)**
Modelo de seguridad basado en múltiples interfaces para definir capacidades por rol.
* **Interfaces:** `Autenticable`, `Reportable` y `Gestionable`.
* **Roles:**
    * **Cajero:** Puede autenticarse y gestionar datos.
    * **Supervisor:** Puede autenticarse y generar reportes.
    * **Administrador:** Posee acceso total a las tres interfaces.
* **Seguridad:** Validación estricta de credenciales de usuario.

**Buenas Prácticas y Diseño**
Para garantizar un código profesional y escalable, se aplicaron los siguientes principios:
* **Nombres Basados en Capacidades:** Interfaces nombradas como acciones (ej. `Pagable`, `Imprimible`).
* **Segregación de Interfaces:** Uso de interfaces pequeñas para evitar que las clases implementen métodos innecesarios.
* **Encapsulamiento:** Atributos privados y uso de métodos de acceso.
* **Polimorfismo:** Declaración de variables tipo interfaz para mayor flexibilidad.
* **Validaciones:** Control de errores para montos inválidos o accesos denegados.

**Video Explicativo (Ejercicio 3)**
El video detalla la problemática del sistema de roles, el diseño del modelo, el uso de polimorfismo y la ejecución del menú principal.

## 🏗️ Estructura de Paquetes
```text
src/
 ├── SistemaAcademicoDeDocumentos/
 ├── SistemaBancarioDePagos/
 └── SistemaDeRolesEmpresariales/
