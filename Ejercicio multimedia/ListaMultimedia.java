public class ListaMultimedia {
    private Multimedia[] array;
    private int size;
    private int maxSize;

    public ListaMultimedia(int maxSize) {
        this.maxSize = maxSize;
        this.array = new Multimedia[maxSize];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean add(Multimedia m) {
        if (size < maxSize) {
            array[size] = m;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public Multimedia get(int position) {
        if (position >= 0 && position < size) {
            return array[position];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String texto="";
        for(int i = 0; i<size;i++){
           
            texto+=array[i].toString()+"]\n";
        }
        return texto;
    }

 
}
