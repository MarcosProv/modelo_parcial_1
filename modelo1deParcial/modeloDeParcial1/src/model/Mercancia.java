package model;

public abstract class Mercancia {

    protected String codMercancia;
    protected double porcentajeDescuento;

    public Mercancia(String codMercancia, double porcentajeDescuento) {
        try{
        this.codMercancia = validarCaranteres(codMercancia);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
          // como puedo evitar que se cree el objeto de todas formas?
        }
        this.porcentajeDescuento = porcentajeDescuento;
    }

    abstract double calcularPrecioFinal();
    abstract boolean preguntarOferta();
        
    
    public boolean compararCodigo(String codigo){
            return this.codMercancia.endsWith(codigo);
    }

    private String validarCaranteres(String cadena) {
        if (cadena.length() != 7) {
            throw new NullPointerException("Cantidad de caracteres invalida");
        } else {
            return cadena;
        }
    }
}
