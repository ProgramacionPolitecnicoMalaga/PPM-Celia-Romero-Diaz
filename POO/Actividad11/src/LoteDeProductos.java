public class LoteDeProductos {
    private Producto[] productos;
    // private final static int MAX_PRODUCTOS = 100;
    private int totalProductos;
    private SelectorDeMejoresProductos selectorDeMejorProducto;

    public LoteDeProductos(){
        totalProductos = 0;
        productos = new Producto[100];
        selectorDeMejorProducto = new CriterioMejorPrecio();
    }

    public void  addProducto(Producto producto){
        if(totalProductos < productos.length){
            productos[totalProductos] = producto;
            totalProductos++;
        }
    }

    Producto getProductoEnPosicion(int i){
        if ((i >= 0) && (i < totalProductos))
            return  productos[i];
        return null;
    }

    public int getTotalProductos(){
        return totalProductos;
    }

    public void setSelectorDeMejorProducto(SelectorDeMejoresProductos selectorDeMejorProducto) {
        this.selectorDeMejorProducto = selectorDeMejorProducto;
    }

    public Producto getSellersChoice(){
            return selectorDeMejorProducto.elegirMejorProducto(this);
    }
}
