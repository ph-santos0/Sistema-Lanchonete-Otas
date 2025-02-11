package model;

import java.sql.Date;

/**
 *
 * @author ph-santos
 */
public class NFVenda {
    private int codigo;
    private Date dataEmissao;
    private double valor;
    private String cpfCliente;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public String toString() {
        return "NFVenda{" +
                "codigo=" + codigo +
                ", dataEmissao=" + dataEmissao +
                ", valor=" + valor +
                ", cpfCliente='" + cpfCliente + "'" +
                '}';
    }
}