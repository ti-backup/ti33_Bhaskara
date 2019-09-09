package com.example.bhaskara;

public class Matematica {
    public double Exponenciacao(double base, int expoente){
        double resultado;
        int potencia;

        if (expoente == 0) return 1.0;

        resultado = base;
        potencia = expoente;
        if (expoente < 0) potencia *= -1;

        for (int i = 2; i <= potencia; i++){
            resultado *= base;
        }

        if (expoente < 0) resultado = 1.0 / resultado;

        return resultado;
    }

    public double CalculaDelta(double a, double b, double c){
        double resultado;
        //resultado = Math.pow(b, 2) -4 * a * c;
        resultado = Exponenciacao(b, 2) -4 * a * c;
        return 0.0;
    }

    public double[] CalculaRaizesEq2Grau(){
        return null;
    }
}








/*
    double resultado = base;
        for (int i = 2; i <= expoente; i++){
                resultado *= base;
                }
                return base;

 */