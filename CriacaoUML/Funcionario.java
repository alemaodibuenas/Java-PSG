package CriacaoUML;

import java.util.*;

public class Funcionario extends CamposDeData {
    private int funcionarioID;
    private long chaveID;
    private String nome;
    private String sobreNome;
    private Date dataAdmissao;
    private String sexo;
    private Date dataNascimento;
    private String eMail;
    private int ctps;
    private int ctpsNum;
    private int ctpsSerie;
    private int paisID;
    private Pais pais;
    
    public void funcionario(Pais pais){
        this.pais = pais;        
    }

    public int getFuncionarioID() {
        return funcionarioID;
    }

    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public long getChaveID() {
        return chaveID;
    }

    public void setChaveID(long chaveID) {
        this.chaveID = chaveID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public int getCtpsNum() {
        return ctpsNum;
    }

    public void setCtpsNum(int ctpsNum) {
        this.ctpsNum = ctpsNum;
    }

    public int getCtpsSerie() {
        return ctpsSerie;
    }

    public void setCtpsSerie(int ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }

    public int getPaisID() {
        return paisID;
    }

    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }    
}
