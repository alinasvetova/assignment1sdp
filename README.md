# UML Diagram for Builder Pattern Project

```mermaid
classDiagram

%% === Main ===
class Main {
  + main(String[] args) void
}

%% === Car & Builder ===
class Car {
  - UUID uniqueId
  - String model
  - int year
  - String color
  - int speed
  + toString() String
}

class CarBuilder as "Car.Builder" {
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

%% === Report & Builder ===
class Report {
  - UUID uniqueId
  - String title
  - List~String~ messages
  + toString() String
}

class ReportBuilder as "Report.Builder" {
  - String title
  - List~String~ messages
  + ReportBuilder title(String)
  + ReportBuilder messages(List~String~)
  + Report build()
}

ReportBuilder --> Report : builds
Main --> ReportBuilder : uses
