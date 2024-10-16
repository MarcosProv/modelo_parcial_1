package model;

public class Servicio extends Mercancia {
    private String servicio;
    private double presupuesto;
    private boolean enPromocion;
    
    public Servicio(String codMercancia, double porcentaje, String servicio, double presupuesto, boolean enPromocion){
        super(codMercancia, porcentaje);
        this.servicio = servicio;
        this.presupuesto = presupuesto;
        this.enPromocion = enPromocion;
    }
    
    public boolean preguntarOferta(){
        return enPromocion;
    }
    
    @Override
    public double calcularPrecioFinal(){
        double precioFinal= presupuesto;
        if (enPromocion){
            precioFinal= presupuesto - (presupuesto * this.porcentajeDescuento / 100 );
        }
        return precioFinal;
    }
    

    @Override
    public String toString() {
        return "Servicio{" + "servicio=" + servicio + ", presupuesto=" + presupuesto + ", enPromocion=" + enPromocion + '}';
    }
    
    
}
