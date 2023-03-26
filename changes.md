# Veranderingen Jabberpoint

## Style
- Factory voor Styles gemaakt
- Styles worden aangemaakt in de factory aandehand van een level enum. Niet meer in de class Style
- fields in Style zijn private en worden met een getter en setter bereikt in andere classes
- Exception gemaakt voor wanneer er een StyleLevel mee wordt gegeven waar geen implementatie vvoor is binnen de factory
- field font final gemaakt omdat deze bij elke style hetzelfde is
- Font creatie verantwoordelijkheid van Style naar StyleFactory verplaatst
- field fontsize verwijjderd. deze data is te verkrijgen uit de font field.

## SlideItem
- field level declaratie weg gehaald achter de declaratie

## Algemeen
- level ints naar level StyleLevel veranderd, voor XMLAccessor een int to StyleLevel methode gemaakt in StyleLevel.