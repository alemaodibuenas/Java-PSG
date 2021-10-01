package CriacaoUML;

public class SubCategoria extends CamposComuns{
    private int subCategoriaID;
    private int categoriaID;
    private Categoria categoria;

    //Construtor
    public SubCategoria(Categoria categoria){
        this.categoria = categoria;        
    }

    public int getSubCategoriaID() {
        return subCategoriaID;
    }

    public void setSubCategoriaID(int subCategoriaID) {
        this.subCategoriaID = subCategoriaID;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
