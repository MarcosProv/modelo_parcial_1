package model;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Mercancia> mercancias;

    public Sistema() {
        mercancias = new ArrayList<>();
    }

    public Mercancia traerMercancia(String codMercancia) {
        Mercancia retorno = null;
        for (Mercancia mercancia : mercancias) {
            if (mercancia.compararCodigo(codMercancia)) {
                retorno = mercancia;
                break;
            }
        }
        return retorno;
    }

    public ArrayList<Mercancia> traerMercancia(boolean enOferta) {
        ArrayList<Mercancia> listaRetorno = new ArrayList<>();
        for (Mercancia mercancia : mercancias) {
            if (mercancia.preguntarOferta()) {
                listaRetorno.add(mercancia);
            }
        }
        return listaRetorno;
    }

    
    ////////////////////////////////////////////////////////// AGREGADO DE MERCANCIA /////////////////////////////////////////////////////////////
    
    
    private void consultarMercancia(String codMercancia) {
        for (Mercancia mercancia : mercancias) {
            if (mercancia.compararCodigo(codMercancia)) {
                throw new IllegalArgumentException("Ya existe esa mercancia");
            }
        }
    }
    
    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) {
        boolean retorno;
        try {
            consultarMercancia(codMercancia);
            Producto nuevoProducto = new Producto(codMercancia, porcentajeDescuento, producto, precioProducto, esDescuentoEn2daUnidad);
            mercancias.add(nuevoProducto);
            retorno = true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            retorno = false;
        }
        return retorno;
    }
    
    public boolean agregarServicio(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) {
        boolean retorno;
        try {
            consultarMercancia(codMercancia);
            Servicio nuevoServicio = new Servicio(codMercancia, porcentajeDescuento, producto, precioProducto, esDescuentoEn2daUnidad);
            mercancias.add(nuevoServicio);
            retorno = true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            retorno = false;
        }
        return retorno;
    }
}
