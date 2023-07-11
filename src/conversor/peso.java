/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author germa
 */
public class peso {
    private double valor1, resultado1;
    private int unidad, unidadFinal;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getResultado1() {
        return resultado1;
    }

    public void setResultado1(double resultado1) {
        this.resultado1 = resultado1;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getUnidadFinal() {
        return unidadFinal;
    }

    public void setUnidadFinal(int unidadFinal) {
        this.unidadFinal = unidadFinal;
    }

    public peso() {
    }
    
    public double convertir() {
        double factorConversion = 1.0; // Debe ser obtenido de un servicio de cotización de divisas

        // Determinar la unidad de origen
        switch (unidad) {
            case 0:
                // Kilogramo (kg)
                factorConversion *= 1.0;
                break;
            case 1:
                // Gramo (g)
                factorConversion *= 0.001;
                break;
            case 2:
                // Hectogramo (hg)
                factorConversion *= 0.1;
                break;
            case 3:
                // Decagramo (dag)
                factorConversion *= 0.01;
                break;
            case 4:
                // Decigramo (dg)
                factorConversion *= 0.0001;
                break;
            case 5:
                // Centigramo (cg)
                factorConversion *= 0.00001;
                break;
            case 6:
                // Miligramo (mg)
                factorConversion *= 0.000001;
                break;
            case 7:
                // Libra (lb)
                factorConversion *= 0.453592;
                break;
            // Añadir más casos para otras unidades de origen
            default:
                break;
        }

        // Determinar la unidad de destino
        switch (unidadFinal) {
            case 0:
                // Kilogramo (kg)
                factorConversion /= 1.0;
                break;
            case 1:
                // Gramo (g)
                factorConversion /= 0.001;
                break;
            case 2:
                // Hectogramo (hg)
                factorConversion /= 0.1;
                break;
            case 3:
                // Decagramo (dag)
                factorConversion /= 0.01;
                break;
            case 4:
                // Decigramo (dg)
                factorConversion /= 0.0001;
                break;
            case 5:
                // Centigramo (cg)
                factorConversion /= 0.00001;
                break;
            case 6:
                // Miligramo (mg)
                factorConversion /= 0.000001;
                break;
            case 7:
                // Libra (lb)
                factorConversion /= 0.453592;
                break;
            // Añadir más casos para otras unidades de destino
            default:
                break;
        }

        // Realizar el cálculo de conversión
        resultado1 = valor1 * factorConversion;
        return resultado1;
    }
}
