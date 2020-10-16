# Kursinnhold

## Kort om kotlin
- Multi-paradigme språk ([objektorientert](https://en.wikipedia.org/wiki/Object-oriented_programming), [funksjonelt](https://en.wikipedia.org/wiki/Functional_programming))
- Fullt kompatibelt med Java og kjører på JVM
- Kan også kompileres til Javascript eller native kode
- God verktøystøtte i IntelliJ

## Språket

### Main
- En enkeltstående mainfunskjon nok til å kjøre
- Trenger ikke ta imot kommandolinjeparameter, men kan

### Typer
- Kotlin skiller på typer
  - Immutable - kan ikke endres, bruker `val`
  - Mutable - kan endres, bruker `var`
  - Immutable er default og det man vil bruke mest mulig
- I Kotlin er alle typer objekter (ikke `boolean`, men `Boolean`)
- Man trenger ikke eksplisitt angi type når man deklarerer, compiler kan utlede den
- Man må eksplisitt definere om man ønsker å bruke mutable-lister, default er immutable

### Funksjoner
- Funksjoner er `fun` :)
- Kan angi return-type, men Kotlin-compiler kan også skjønne det selv
- Parametre må ha type
- Parametre kan ha navn og da kan metodekall stokke om på parametre
- Single expression statement: Trenger da ikke krøllparenteser
- Kan ta imot funksjoner som parametre (mer om lamba senere)
- Extension functions, legg på dine egne metoder på objekt

### Klasser og objekter
- Klasser kan ha en default constructor som parametre rett til klassen
- Data classes
  - Autogenerere getters og setters
  - Enkel kopiering der man kan endre deler av objektet
  - Kan også ha metoder
- Arv, på samme måte som i Java, men med litt annen syntaks
- Det reserverte ordet `new` brukes ikke

### Strings
- Tripple quote - string over mange linjer med formattering
- Template strings - putt variabler/uttrykk rett inn i String

### Null
- Kotlin prøver å eliminere NullPointerException
- Eksplisitt angi at en type kan være null (`?`)
- Trygge null-referanser (`?.`) - hvis ett av leddene er null, blir uttrykket null
- Angi en alternativ verdi - Elvis-operator (`?:`)

### Lambda
- More to come...

## Koans
- Et sett oppgaver ment til å gi en innføring i Kotlin
- Oppgavene kan løses på to måter
  - Edu-tools plugin i IntelliJ
  - [I nettleser](https://play.kotlinlang.org/koans/overview)
- Løs oppgave, kjør test, kikk på fasit

## Nyttige linker
- [Kotlin](https://kotlinlang.org/)
