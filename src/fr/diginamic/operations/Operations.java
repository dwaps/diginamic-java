package fr.diginamic.operations;

public class Operations {
  public Double calcul(double a, double b, char operator) throws Exception {
    switch (operator) {
      case '+':
        return a + b;
      case '-':
        return a - b;
      case '*':
        return a * b;
      case '/':
        return a / b;
    }
    throw new Exception("Opérateur non valide");
  }
}
