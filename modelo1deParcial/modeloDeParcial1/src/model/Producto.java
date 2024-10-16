package model;

public class Producto extends Mercancia {

    private String producto;
    private double precio;
    private boolean descuentoEn2daUnidad;

    public Producto(String codMercancia , double porcentaje, String producto, double precio, boolean descuentoEn2daUnidad){
        super(codMercancia,porcentaje);
        this.producto = producto;
        this.precio = precio;
        this.descuentoEn2daUnidad = descuentoEn2daUnidad;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal = precio;
        if(descuentoEn2daUnidad){
            precioFinal = precio -((this.porcentajeDescuento / 2) * precio / 100 );
        }
        return precioFinal;
    }

    public boolean preguntarOferta(){
        return descuentoEn2daUnidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precio=" + precio + ", descuentoEn2daUnidad=" + descuentoEn2daUnidad + '}';
    }
    
}
