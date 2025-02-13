package model;

public class NFCompra {

    private int Codigo;
    private String DataEmissao;
    private double Valor;
    private String CNPJFornecedor;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDataEmissao() {
        return DataEmissao;
    }

    public void setDataEmissao(String DataEmissao) {
        this.DataEmissao = DataEmissao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getCNPJFornecedor() {
        return CNPJFornecedor;
    }

    public void setCNPJFornecedor(String CNPJFornecedor) {
        this.CNPJFornecedor = CNPJFornecedor;
    }

    @Override
    public String toString() {
        return "NFCompra{"
                + "Codigo=" + Codigo
                + ", DataEmissao='" + DataEmissao + '\''
                + ", Valor=" + Valor
                + ", CNPJFornecedor='" + CNPJFornecedor + '\''
                + '}';
    }
}
