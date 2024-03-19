public class inventario {

    private static mascotas[] listaMascotas;

    public inventario(mascotas[] listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public mascotas[] getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(mascotas[] listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public static void mostrarInventario() {
        System.out.println("Inventario:");
        for (int i = 0; i < listaMascotas.length; i++) {
            System.out.println((i + 1) + ". " + listaMascotas[i].muestra());
        }
    }


}
