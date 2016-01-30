package br.ufpi.es.checar.Entidade;

import java.util.Date;

/**
 * Created by lucas on 29/01/2016.
 */
public class CNH {
    private String NumeroRegistro;
    private String Categoria;
    private Date Validade;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) { this.CPF = CPF; }

    private String CPF;

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        NumeroRegistro = numeroRegistro;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date validade) {
        Validade = validade;
    }
}
