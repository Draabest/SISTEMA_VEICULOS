public class Bicicleta {

    //Variaveis
    private String modelo;
    private String marca;
    private String cor;
    private String material;
    private int quantidadeDeMarchas;
    private boolean amortecedor;

    //Construtor
    public Bicicleta(String modelo, String marca, String cor, String material, int quantidadeDeMarchas, boolean amortecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.quantidadeDeMarchas = quantidadeDeMarchas;
        this.amortecedor = amortecedor;
    }


    //Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public int getQuantidadeDeMarchas() { return quantidadeDeMarchas; }
    public void setQuantidadeDeMarchas(int quantidadeDeMarchas) { this.quantidadeDeMarchas = quantidadeDeMarchas; }

    public boolean isAmortecedor() { return amortecedor; }
    public void setAmortecedor(boolean amortecedor) { this.amortecedor = amortecedor; }

    //Metodo INSERT para banco de dados
    public String gerarComandoInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, marca, cor, material, quantidadeDeMarchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %d, %b);",
            modelo, marca, cor, material, quantidadeDeMarchas, amortecedor);
    }
}