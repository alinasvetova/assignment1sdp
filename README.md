# UML Diagram for Builder Pattern Project

```mermaid
classDiagram

class Main {
  + main(String[] args) void
}

class Car {
  - UUID uniqueId
  - String model
  - int year
  - String color
  - int speed
  + toString() String
}

class CarBuilder {
  - String model
  - int year
  - String color
  - int speed
  + CarBuilder model(String)
  + CarBuilder year(int)
  + CarBuilder color(String)
  + CarBuilder speed(int)
  + Car build()
}

CarBuilder --> Car : builds
Main --> CarBuilder : uses

class Report {
  - UUID uniqueId
  - String title
  - List~String~ messages
  + toString() String
}

class ReportBuilder {
  - String title
  - List~String~ messages
  + ReportBuilder title(String)
  + ReportBuilder messages(List~String~)
  + Report build()
}

ReportBuilder --> Report : builds
Main --> ReportBuilder : uses
