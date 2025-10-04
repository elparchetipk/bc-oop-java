# Historia y Evolución de la Programación Orientada a Objetos

## 📖 Índice
1. [Orígenes de la POO](#orígenes-de-la-poo)
2. [Los Pioneros: Simula y Smalltalk](#los-pioneros-simula-y-smalltalk)
3. [Expansión de la POO](#expansión-de-la-poo)
4. [Por qué Java Adoptó POO](#por-qué-java-adoptó-poo)
5. [Evolución de los Conceptos POO](#evolución-de-los-conceptos-poo)
6. [POO en el Mundo Actual](#poo-en-el-mundo-actual)

---

## 🌱 Orígenes de la POO

### ¿Por qué nació la POO?

En las décadas de 1960-1970, los programas se volvían cada vez más complejos:
- Proyectos con millones de líneas de código
- Equipos grandes de desarrolladores
- Mantenimiento difícil y costoso
- Reutilización de código limitada

**Problema principal:** La programación estructurada no escalaba bien para sistemas grandes.

### La Crisis del Software (1968)

En la conferencia de la OTAN sobre ingeniería de software, se identificó la **"Crisis del Software"**:

```
❌ 50% de proyectos fallaban completamente
❌ 80% se retrasaban o excedían presupuesto
❌ Software con errores críticos en producción
❌ Costos de mantenimiento = 70% del costo total
```

**Diagnóstico:**
- Código "espagueti" (sin estructura clara)
- Variables globales modificadas desde cualquier lugar
- Funciones interdependientes y acopladas
- Imposible reutilizar código entre proyectos

**Solución propuesta:** Nuevo paradigma que organizara el código de forma más natural, **modelando el mundo real**.

---

## 👨‍💻 Los Pioneros: Simula y Smalltalk

### Simula (1962-1967) - La Primera POO

**Creadores:** Ole-Johan Dahl y Kristen Nygaard (Norwegian Computing Center)

**Contexto:**
- Desarrollado para **simulaciones de sistemas complejos**
- Ejemplo: Simular tráfico vehicular, sistemas de colas
- Necesitaban representar entidades del mundo real en código

**Problema que resolvieron:**
```
Simulación de tráfico:
- Múltiples autos con características diferentes
- Cada auto tiene comportamiento independiente
- ¿Cómo modelar esto en código estructurado? → Caos
```

**Innovación: El concepto de "Clase"**

```simula
! Primer ejemplo histórico de clase (1965)
Class Coche;
Begin
    Text marca;
    Integer velocidad;
    
    Procedure acelerar(incremento);
    Begin
        velocidad := velocidad + incremento;
    End;
    
    Procedure frenar(decremento);
    Begin
        velocidad := velocidad - decremento;
    End;
End;

! Crear objetos (instancias)
Ref(Coche) miCoche;
miCoche :- new Coche;
miCoche.marca :- "Volvo";
miCoche.acelerar(50);
```

**Conceptos introducidos por Simula:**
- ✅ **Clases** y **objetos**
- ✅ **Herencia** (una clase puede extender otra)
- ✅ **Polimorfismo** básico
- ✅ **Corrutinas** (precursor de concurrencia)

**Impacto:**
> "Simula plantó la semilla de la POO, pero el mundo no estaba listo todavía."

---

### Smalltalk (1972-1980) - POO Pura

**Creador:** Alan Kay y equipo en **Xerox PARC**

**Visión revolucionaria:**
> "Todo es un objeto. Incluso las clases son objetos. Los objetos se comunican mediante mensajes."

**Contexto histórico:**
- Xerox PARC: Laboratorio que inventó la GUI, mouse, Ethernet
- Objetivo: Crear un lenguaje para programación educativa
- Inspiración: Biología celular (células = objetos)

**Filosofía de Alan Kay:**
```
Mundo Real:
- Las células son autónomas
- Se comunican mediante mensajes químicos
- Encapsulan su estado interno

Smalltalk:
- Los objetos son autónomos
- Se comunican mediante mensajes
- Encapsulan su estado
```

**Innovaciones de Smalltalk:**

1. **POO pura:**
```smalltalk
"TODO es un objeto, incluso los números"
5 + 3        "5 es un objeto, le envías mensaje '+' con argumento 3"
true ifTrue: [ 'Hola' ]  "true es un objeto que responde a ifTrue:"
```

2. **Primer entorno integrado (IDE):**
   - Editor de código visual
   - Depurador interactivo
   - Inspector de objetos en tiempo real

3. **Garbage Collection automático**
   - Liberación automática de memoria
   - Programador no gestiona memoria manualmente

4. **Interfaz gráfica moderna:**
   - Ventanas, botones, menús
   - Modelo de eventos
   - Inspiró a Macintosh y Windows

**Sintaxis Smalltalk:**
```smalltalk
"Definir clase"
Object subclass: #Persona
    instanceVariableNames: 'nombre edad'
    
"Método"
saludar
    ^ 'Hola, soy ', nombre
    
"Crear objeto y enviar mensaje"
juan := Persona new.
juan nombre: 'Juan'.
juan edad: 25.
juan saludar.
```

**Impacto:**
- Inspiró a **Java, Python, Ruby, Objective-C, JavaScript**
- Estableció los **4 pilares de POO**: Encapsulación, Herencia, Polimorfismo, Abstracción
- Demostró que POO era viable para sistemas reales

**Curiosidad:**
> Steve Jobs visitó Xerox PARC en 1979, vio Smalltalk y su GUI, y eso inspiró el Macintosh.

---

## 🌍 Expansión de la POO

### C++ (1983) - POO llega a las masas

**Creador:** Bjarne Stroustrup (Bell Labs)

**Estrategia:**
- Agregó POO a C (lenguaje dominante de la época)
- Mantuvo compatibilidad con C
- Nombre original: "C with Classes"

**Innovaciones:**
```cpp
// Clases con control de acceso
class Persona {
private:
    string nombre;
    int edad;
    
public:
    Persona(string n, int e) : nombre(n), edad(e) {}
    
    void saludar() {
        cout << "Hola, soy " << nombre << endl;
    }
};

// Herencia múltiple (controversial)
class Estudiante : public Persona, public Identificable {
    // ...
};
```

**Impacto:**
- POO adoptada masivamente por la industria (años 80-90)
- Base para Windows, Photoshop, videojuegos AAA
- Demostró que POO podía ser eficiente

---

### Objective-C (1984) - POO para Apple

**Creadores:** Brad Cox y Tom Love

**Características:**
- Mezcla de C + Smalltalk
- Sistema de mensajes dinámico
- Base de macOS e iOS (hasta la llegada de Swift en 2014)

```objective-c
// Sintaxis inspirada en Smalltalk
@interface Persona : NSObject
@property NSString *nombre;
- (void)saludar;
@end

@implementation Persona
- (void)saludar {
    NSLog(@"Hola, soy %@", self.nombre);
}
@end

// Uso
Persona *juan = [[Persona alloc] init];
[juan saludar];  // Enviar mensaje
```

---

### Eiffel (1986) - POO con contratos

**Creador:** Bertrand Meyer

**Innovación:** Design by Contract (programación por contratos)
- Precondiciones
- Postcondiciones
- Invariantes

```eiffel
deposit (amount: INTEGER)
    require
        amount > 0  -- Precondición
    do
        balance := balance + amount
    ensure
        balance = old balance + amount  -- Postcondición
    end
```

**Influencia:** Inspiró assertions en Java, C#, Python

---

### Python (1991) - POO accesible

**Creador:** Guido van Rossum

**Filosofía:**
- POO opcional, no obligatoria
- Sintaxis simple y legible
- "Baterías incluidas"

```python
class Persona:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def saludar(self):
        print(f"Hola, soy {self.nombre}")

# Uso
juan = Persona("Juan")
juan.saludar()
```

**Impacto:**
- POO accesible para principiantes
- Lenguaje de educación por excelencia

---

### Ruby (1995) - POO elegante

**Creador:** Yukihiro Matsumoto

**Filosofía:**
> "Diseñado para hacerte feliz como programador"

```ruby
class Persona
  attr_accessor :nombre
  
  def initialize(nombre)
    @nombre = nombre
  end
  
  def saludar
    puts "Hola, soy #{@nombre}"
  end
end

juan = Persona.new("Juan")
juan.saludar
```

**Innovación:**
- TODO es un objeto (más puro que Python)
- Bloques y closures elegantes

---

## ☕ Por qué Java Adoptó POO

### Java (1995) - POO mainstream

**Contexto histórico:**
- Web estaba explotando (Netscape Navigator, Internet)
- C++ era poderoso pero peligroso (punteros, memory leaks, herencia múltiple)
- Necesidad: Lenguaje portable, seguro y productivo

**Decisión de diseño de James Gosling:**
> "Tomar lo mejor de Smalltalk (POO pura, garbage collection) y C++ (sintaxis familiar, performance), eliminar lo peligroso"

**Filosofía de Java:**
```
Java = Smalltalk (pureza POO) + C++ (sintaxis) - (punteros + herencia múltiple + complejidad)
```

**Por qué Java es fundamentalmente POO:**

1. **Todo (casi) es un objeto**
   - Excepción: tipos primitivos (`int`, `double`, etc.) por performance
   - Pero existen wrappers (`Integer`, `Double`)

2. **Encapsulación obligatoria**
   - Modificadores de acceso (`private`, `protected`, `public`)
   - Todo vive dentro de clases

3. **Herencia simple controlada**
   - Evita complejidad de herencia múltiple de C++
   - Una clase solo puede extender otra

4. **Interfaces como solución elegante**
   - Implementas múltiples interfaces
   - Contrato sin implementación

5. **Polimorfismo incorporado**
   - Sobrecarga y sobrescritura de métodos
   - Referencias polimórficas naturales

6. **Garbage Collection automático**
   - Inspirado en Smalltalk
   - Libera al programador de gestionar memoria

**Ventaja clave de Java:**
```
"Write Once, Run Anywhere" (WORA) + POO = Ideal para la web de los 90s
```

---

## 📈 Evolución de los Conceptos POO

### Década 1960-1970: Nacimiento

```
1962-1967: Simula
└─ Define: clases, objetos, herencia

1972-1980: Smalltalk
└─ Perfecciona: POO pura, mensajes, garbage collection
```

**Concepto dominante:** Modelar el mundo real

---

### Década 1980: Adopción Industrial

```
1983: C++
└─ POO en sistemas de alto rendimiento

1984: Objective-C
└─ POO en Apple

1986: Eiffel
└─ POO con contratos formales
```

**Concepto dominante:** Herencia y reutilización de código

---

### Década 1990: Mainstream

```
1991: Python
└─ POO accesible

1995: Java
└─ POO en la web, portable

1995: Ruby
└─ POO elegante

1995: JavaScript
└─ POO basada en prototipos
```

**Concepto dominante:** Encapsulación y modularidad

---

### Década 2000: Refinamiento

```
2000: C#
└─ POO moderna en .NET

2004: Java 5 - Generics
└─ POO parametrizada (type-safe)

2009: Go
└─ POO sin herencia (composición)
```

**Concepto dominante:** Composición sobre herencia

---

### Década 2010-2025: Evolución y Fusión

```
2011: Kotlin
└─ POO concisa, null-safety

2014: Swift
└─ POO segura para iOS

2014: Java 8 - Lambdas
└─ POO + Programación funcional

2017: Java 9 - Módulos
└─ POO a gran escala

2021: Java 17 - Records
└─ POO inmutable simplificada
```

**Concepto dominante:** POO + Funcional (paradigmas híbridos)

---

## 🏗️ POO en el Mundo Actual (2025)

### Lenguajes POO más usados

| Lenguaje | Año | Tipo de POO | Uso Principal |
|----------|-----|-------------|---------------|
| **Java** | 1995 | POO clásica | Enterprise, Android, backend |
| **Python** | 1991 | POO opcional | Data Science, IA, scripting |
| **JavaScript** | 1995 | POO prototipos | Web frontend/backend |
| **C#** | 2000 | POO moderna | .NET, Unity, enterprise |
| **C++** | 1983 | POO + bajo nivel | Videojuegos, sistemas |
| **Kotlin** | 2011 | POO concisa | Android, backend |
| **Swift** | 2014 | POO segura | iOS, macOS |
| **TypeScript** | 2012 | POO tipada | Web enterprise |

### Sistemas construidos con POO

**Aplicaciones empresariales:**
- ✅ SAP (ERP)
- ✅ Salesforce (CRM)
- ✅ Sistemas bancarios (BBVA, Banco de la República)

**Plataformas:**
- ✅ Android OS (15M líneas de código Java/Kotlin)
- ✅ Windows (.NET, C++)
- ✅ macOS/iOS (Objective-C, Swift)

**Frameworks:**
- ✅ Spring Boot (Java - backend)
- ✅ Django (Python - web)
- ✅ .NET (C# - enterprise)

**Videojuegos:**
- ✅ Minecraft (Java)
- ✅ Fortnite (C++ con Unreal Engine)
- ✅ Unity (C#)

**Aplicaciones web:**
- ✅ LinkedIn (Java)
- ✅ Netflix (Java)
- ✅ Twitter (Scala - POO funcional)

---

## 🎯 Lecciones de la Historia

### ¿Qué aprendimos en 60 años de POO?

1. **POO resuelve complejidad**
   - Proyectos grandes necesitan organización
   - Modelar el mundo real funciona

2. **No hay bala de plata**
   - POO no es perfecta para todo
   - Combinar paradigmas es válido (POO + funcional)

3. **Encapsulación es clave**
   - Ocultar detalles reduce errores
   - Interfaces públicas estables permiten cambios internos

4. **Composición > Herencia**
   - Lección aprendida con el tiempo
   - Herencia profunda es frágil

5. **Simplicidad importa**
   - Java Records, Kotlin data classes
   - Reducir boilerplate aumenta productividad

6. **POO evoluciona**
   - No es el mismo paradigma de 1967
   - Se adapta a nuevas necesidades (concurrencia, funcional)

---

## 📚 Línea de Tiempo Visual

```
1960  ┌─────────────────────────────────────┐
      │                                     │
1967  │  SIMULA                             │  Primera POO
      │  ├─ Clases                          │
      │  ├─ Objetos                         │
      │  └─ Herencia                        │
      │                                     │
1972  │  SMALLTALK                          │  POO pura
      │  ├─ Todo es objeto                  │
      │  ├─ Garbage Collection              │
      │  └─ IDE moderno                     │
      │                                     │
1983  │  C++                                │  POO mainstream
      │  └─ POO + eficiencia                │
      │                                     │
1995  │  JAVA                               │  POO portable
      │  ├─ Write Once, Run Anywhere        │
      │  ├─ Web + POO                       │
      │  └─ Simplicidad vs C++              │
      │                                     │
2004  │  JAVA 5 - Generics                  │  POO tipada
      │                                     │
2014  │  JAVA 8 - Lambdas                   │  POO + Funcional
      │                                     │
2021  │  JAVA 17 - Records                  │  POO moderna
      │                                     │
2025  │  HOY                                │  POO híbrida
      └─────────────────────────────────────┘
```

---

## 🎯 Puntos Clave

**Recuerda:**

1. 🌱 **POO nació** para resolver la crisis del software de los 60s
2. 👨‍💻 **Simula** (1967) creó clases y objetos
3. 💬 **Smalltalk** (1972) perfeccionó la POO pura
4. 🌍 **C++** (1983) llevó POO a las masas
5. ☕ **Java** (1995) hizo POO mainstream y portable
6. 📈 **POO evolucionó** de herencia a composición
7. 🔄 **Hoy** combinamos POO con otros paradigmas

**Mensaje final:**
> "La POO no es solo un paradigma de programación, es una forma de pensar sobre problemas complejos modelando el mundo real en código."

---

## 📚 Recursos Adicionales

- [History of OOP - Wikipedia](https://en.wikipedia.org/wiki/Object-oriented_programming#History)
- [The Early History of Smalltalk - Alan Kay (PDF)](http://worrydream.com/EarlyHistoryOfSmalltalk/)
- [Simula Research Laboratory](https://www.simula.no/)
- [Oracle: OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)

---

**Próximo tema:** [Paradigmas de Programación](./02-paradigmas-programacion.md)

---

**Última actualización:** 3 de octubre de 2025  
**Bootcamp:** POO Java - SENA  
**Semana:** 1 - Introducción a POO
