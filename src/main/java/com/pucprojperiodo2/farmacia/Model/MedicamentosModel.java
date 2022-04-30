package com.pucprojperiodo2.farmacia.Model;

import javax.persistence.*;


@Entity
@Table(name= "Medicamentos")
public class MedicamentosModel {
    @Id
    @Column(name = "nome_produto", nullable = false, length = 60)
    private String nomeProduto;

    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="tipo_produto",nullable = false)
    private String tipoProduto;
    @Column(name = "data_finalizacaoprocesso",nullable = false)
    private String dataFinalizacaoProcesso;
    @Column(name = "categoria_regulatoria",nullable = false)
    private String categoriaRegulatoria;
    @Column(name = "nume_registro_produto",nullable = false)
    private long numeRegistroProduto;
    @Column(name = "data_vencimento_registro",nullable = false)
    private String dataVencimentoRegistro;
    @Column(name = "numero_processo",nullable = false)
    private long numeroProcesso;
    @Column(name = "classe_terapeutica",nullable = false)
    private String classeTerapeutica;
    @Column(name = "empresa_detentora_registro",nullable = false)
    private String empresaDetentoraRegistro;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDataFinalizacaoProcesso() {
        return dataFinalizacaoProcesso;
    }

    public void setDataFinalizacaoProcesso(String dataFinalizacaoProcesso) {
        this.dataFinalizacaoProcesso = dataFinalizacaoProcesso;
    }

    public String getCategoriaRegulatoria() {
        return categoriaRegulatoria;
    }

    public void setCategoriaRegulatoria(String categoriaRegulatoria) {
        this.categoriaRegulatoria = categoriaRegulatoria;
    }

    public long getNumeRegistroProduto() {
        return numeRegistroProduto;
    }

    public void setNumeRegistroProduto(long numeRegistroProduto) {
        this.numeRegistroProduto = numeRegistroProduto;
    }

    public String getDataVencimentoRegistro() {
        return dataVencimentoRegistro;
    }

    public void setDataVencimentoRegistro(String dataVencimentoRegistro) {
        this.dataVencimentoRegistro = dataVencimentoRegistro;
    }

    public long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getClasseTerapeutica() {
        return classeTerapeutica;
    }

    public void setClasseTerapeutica(String classeTerapeutica) {
        this.classeTerapeutica = classeTerapeutica;
    }

    public String getEmpresaDetentoraRegistro() {
        return empresaDetentoraRegistro;
    }

    public void setEmpresaDetentoraRegistro(String empresaDetentoraRegistro) {
        this.empresaDetentoraRegistro = empresaDetentoraRegistro;
    }
}
