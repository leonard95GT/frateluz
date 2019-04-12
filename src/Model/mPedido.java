/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author rodolfo
 */
public class mPedido {
    public Date dataPedido;
    
    //Questão I - Informações do Pedido
    public int codPedido;
    public String nomeRespPedido, endRespPedido, cidRespPedido,
            bairroRespPedido, emailRespPedido,
            estRespPedido, cepRespPedido;
    int telRespPedido, celRespPedido;
    
    //Questão II - Informações da Igreja a receber os lustres
    public Date aberturaIgreja;    
    public String cidIgrejaPedido, bairroIgrejaPedido, endIgrejaPedido,
            cnpjIgrejaPedido, estIgrejaPedido, cepIgrejaPedido;
    int telIgrejaPedido, celIgrejaPedido;
    
    //Questão III - Informações da Administração
    public String cidAdm, bairroAdm, endAdm, cnpjAdm, estAdm, cepAdm;
    int telAdm, celAdm;
    
    //Questão IV - Informações da Presidência
    public String nomePresAdm, emailPresAdm;
    public int telPresAdm, celPresAdm;
    
    //Questão V - Transportadora
    public String nomeTransp, emailTransp;
    public int telTransp, celTransp;
    
    //Questão VI - Responsável pela Construção
    public String nomeRespConstr, emailRespContr;
    public int telRespContr, celRespContr;
    
    //Questão VII - Dados do prédio
    public String tipoServPredio, tipoIlumPredio,
            tipoLampPredio;
    public int qtdeLampPredio, qtdeWattsLamPr;
    
    //Questäo VIII - Dados do Eletricista Responsável
    public String nomEletrResp, emailEletrResp;
    public int telEletrResp, celEletrResp;
    
    //Questão IX - Dados do responsável (ministério)
    public String nomeMinisterio, emailMinisterio;
    public int telMinisterio, celMinisterio;
    
    //Questão X - Local da entrega (Transportadora)
    public String cidLocalEntrg, bairroLocalEntrg,
            endLocalEntrg, ufLocalEntrg;
    int cepLocalEntrg, telLocalEntrg, celLocalEntrg;
    
    //Questão XI - Medidas da Igreja
    public int largIgrejaTotal, compIgrejaTotal,
            altIgrejaTotal, largGaleria, compGaleria,
            altGaleria;
    public String tipoForro, corForro, corParedeInt;
    public boolean galeria;
    
    //Questão XII - Observações
    public String obs;
    
    

    public mPedido(Date dataPedido,int codPedido, String nomeRespPedido, String endRespPedido, String cidRespPedido, String bairroRespPedido, String emailRespPedido, 
            String estRespPedido, String cepRespPedido, int telRespPedido, int celRespPedido,Date aberturaIgreja, String cidIgrejaPedido, String bairroIgrejaPedido, 
            String endIgrejaPedido, String cnpjIgrejaPedido, String estIgrejaPedido, String cepIgrejaPedido, int telIgrejaPedido, int celIgrejaPedido, String cidAdm, 
            String bairroAdm, String endAdm, String cnpjAdm, String estAdm, String cepAdm, int telAdm, int celAdm, String nomePresAdm, String emailPresAdm,
            int telPresAdm, int celPresAdm, String nomeTransp, String emailTransp, int telTransp, int celTransp, String nomeRespConstr, String emailRespContr, 
            int telRespContr, int celRespContr, String tipoServPredio, String tipoIlumPredio, String tipoLampPredio, int qtdeLampPredio, int qtdeWattsLamPr, 
            String nomEletrResp, String emailEletrResp, int telEletrResp, int celEletrResp, String nomeMinisterio, String emailMinisterio, 
            int telMinisterio, int celMinisterio, String cidLocalEntrg, String bairroLocalEntrg, String endLocalEntrg, String ufLocalEntrg, 
            int cepLocalEntrg, int telLocalEntrg, int celLocalEntrg, int largIgrejaTotal, int compIgrejaTotal, int altIgrejaTotal, 
            int largGaleria, int compGaleria, int altGaleria, String tipoForro, String corForro, String corParedeInt, boolean galeria, String obs) {
        this.dataPedido = dataPedido;
        this.codPedido = codPedido;
        this.nomeRespPedido = nomeRespPedido;
        this.endRespPedido = endRespPedido;
        this.cidRespPedido = cidRespPedido;
        this.bairroRespPedido = bairroRespPedido;
        this.emailRespPedido = emailRespPedido;
        this.estRespPedido = estRespPedido;
        this.cepRespPedido = cepRespPedido;
        this.telRespPedido = telRespPedido;
        this.celRespPedido = celRespPedido;
        this.aberturaIgreja = aberturaIgreja;
        this.cidIgrejaPedido = cidIgrejaPedido;
        this.bairroIgrejaPedido = bairroIgrejaPedido;
        this.endIgrejaPedido = endIgrejaPedido;
        this.cnpjIgrejaPedido = cnpjIgrejaPedido;
        this.estIgrejaPedido = estIgrejaPedido;
        this.cepIgrejaPedido = cepIgrejaPedido;
        this.telIgrejaPedido = telIgrejaPedido;
        this.celIgrejaPedido = celIgrejaPedido;
        this.cidAdm = cidAdm;
        this.bairroAdm = bairroAdm;
        this.endAdm = endAdm;
        this.cnpjAdm = cnpjAdm;
        this.estAdm = estAdm;
        this.cepAdm = cepAdm;
        this.telAdm = telAdm;
        this.celAdm = celAdm;
        this.nomePresAdm = nomePresAdm;
        this.emailPresAdm = emailPresAdm;
        this.telPresAdm = telPresAdm;
        this.celPresAdm = celPresAdm;
        this.nomeTransp = nomeTransp;
        this.emailTransp = emailTransp;
        this.telTransp = telTransp;
        this.celTransp = celTransp;
        this.nomeRespConstr = nomeRespConstr;
        this.emailRespContr = emailRespContr;
        this.telRespContr = telRespContr;
        this.celRespContr = celRespContr;
        this.tipoServPredio = tipoServPredio;
        this.tipoIlumPredio = tipoIlumPredio;
        this.tipoLampPredio = tipoLampPredio;
        this.qtdeLampPredio = qtdeLampPredio;
        this.qtdeWattsLamPr = qtdeWattsLamPr;
        this.nomEletrResp = nomEletrResp;
        this.emailEletrResp = emailEletrResp;
        this.telEletrResp = telEletrResp;
        this.celEletrResp = celEletrResp;
        this.nomeMinisterio = nomeMinisterio;
        this.emailMinisterio = emailMinisterio;
        this.telMinisterio = telMinisterio;
        this.celMinisterio = celMinisterio;
        this.cidLocalEntrg = cidLocalEntrg;
        this.bairroLocalEntrg = bairroLocalEntrg;
        this.endLocalEntrg = endLocalEntrg;
        this.ufLocalEntrg = ufLocalEntrg;
        this.cepLocalEntrg = cepLocalEntrg;
        this.telLocalEntrg = telLocalEntrg;
        this.celLocalEntrg = celLocalEntrg;
        this.largIgrejaTotal = largIgrejaTotal;
        this.compIgrejaTotal = compIgrejaTotal;
        this.altIgrejaTotal = altIgrejaTotal;
        this.largGaleria = largGaleria;
        this.compGaleria = compGaleria;
        this.altGaleria = altGaleria;
        this.tipoForro = tipoForro;
        this.corForro = corForro;
        this.corParedeInt = corParedeInt;
        this.galeria = galeria;
        this.obs = obs;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    
    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public String getNomeRespPedido() {
        return nomeRespPedido;
    }

    public void setNomeRespPedido(String nomeRespPedido) {
        this.nomeRespPedido = nomeRespPedido;
    }

    public String getEndRespPedido() {
        return endRespPedido;
    }

    public void setEndRespPedido(String endRespPedido) {
        this.endRespPedido = endRespPedido;
    }

    public String getCidRespPedido() {
        return cidRespPedido;
    }

    public void setCidRespPedido(String cidRespPedido) {
        this.cidRespPedido = cidRespPedido;
    }

    public String getBairroRespPedido() {
        return bairroRespPedido;
    }

    public void setBairroRespPedido(String bairroRespPedido) {
        this.bairroRespPedido = bairroRespPedido;
    }

    public String getEmailRespPedido() {
        return emailRespPedido;
    }

    public void setEmailRespPedido(String emailRespPedido) {
        this.emailRespPedido = emailRespPedido;
    }

    public String getEstRespPedido() {
        return estRespPedido;
    }

    public void setEstRespPedido(String estRespPedido) {
        this.estRespPedido = estRespPedido;
    }

    public String getCepRespPedido() {
        return cepRespPedido;
    }

    public void setCepRespPedido(String cepRespPedido) {
        this.cepRespPedido = cepRespPedido;
    }

    public int getTelRespPedido() {
        return telRespPedido;
    }

    public void setTelRespPedido(int telRespPedido) {
        this.telRespPedido = telRespPedido;
    }

    public int getCelRespPedido() {
        return celRespPedido;
    }

    public void setCelRespPedido(int celRespPedido) {
        this.celRespPedido = celRespPedido;
    }

    public Date getAberturaIgreja() {
        return aberturaIgreja;
    }

    public void setAberturaIgreja(Date aberturaIgreja) {
        this.aberturaIgreja = aberturaIgreja;
    }

    public String getCidIgrejaPedido() {
        return cidIgrejaPedido;
    }

    public void setCidIgrejaPedido(String cidIgrejaPedido) {
        this.cidIgrejaPedido = cidIgrejaPedido;
    }

    public String getBairroIgrejaPedido() {
        return bairroIgrejaPedido;
    }

    public void setBairroIgrejaPedido(String bairroIgrejaPedido) {
        this.bairroIgrejaPedido = bairroIgrejaPedido;
    }

    public String getEndIgrejaPedido() {
        return endIgrejaPedido;
    }

    public void setEndIgrejaPedido(String endIgrejaPedido) {
        this.endIgrejaPedido = endIgrejaPedido;
    }

    public String getCnpjIgrejaPedido() {
        return cnpjIgrejaPedido;
    }

    public void setCnpjIgrejaPedido(String cnpjIgrejaPedido) {
        this.cnpjIgrejaPedido = cnpjIgrejaPedido;
    }

    public String getEstIgrejaPedido() {
        return estIgrejaPedido;
    }

    public void setEstIgrejaPedido(String estIgrejaPedido) {
        this.estIgrejaPedido = estIgrejaPedido;
    }

    public String getCepIgrejaPedido() {
        return cepIgrejaPedido;
    }

    public void setCepIgrejaPedido(String cepIgrejaPedido) {
        this.cepIgrejaPedido = cepIgrejaPedido;
    }

    public int getTelIgrejaPedido() {
        return telIgrejaPedido;
    }

    public void setTelIgrejaPedido(int telIgrejaPedido) {
        this.telIgrejaPedido = telIgrejaPedido;
    }

    public int getCelIgrejaPedido() {
        return celIgrejaPedido;
    }

    public void setCelIgrejaPedido(int celIgrejaPedido) {
        this.celIgrejaPedido = celIgrejaPedido;
    }

    public String getCidAdm() {
        return cidAdm;
    }

    public void setCidAdm(String cidAdm) {
        this.cidAdm = cidAdm;
    }

    public String getBairroAdm() {
        return bairroAdm;
    }

    public void setBairroAdm(String bairroAdm) {
        this.bairroAdm = bairroAdm;
    }

    public String getEndAdm() {
        return endAdm;
    }

    public void setEndAdm(String endAdm) {
        this.endAdm = endAdm;
    }

    public String getCnpjAdm() {
        return cnpjAdm;
    }

    public void setCnpjAdm(String cnpjAdm) {
        this.cnpjAdm = cnpjAdm;
    }

    public String getEstAdm() {
        return estAdm;
    }

    public void setEstAdm(String estAdm) {
        this.estAdm = estAdm;
    }

    public String getCepAdm() {
        return cepAdm;
    }

    public void setCepAdm(String cepAdm) {
        this.cepAdm = cepAdm;
    }

    public int getTelAdm() {
        return telAdm;
    }

    public void setTelAdm(int telAdm) {
        this.telAdm = telAdm;
    }

    public int getCelAdm() {
        return celAdm;
    }

    public void setCelAdm(int celAdm) {
        this.celAdm = celAdm;
    }

    public String getNomePresAdm() {
        return nomePresAdm;
    }

    public void setNomePresAdm(String nomePresAdm) {
        this.nomePresAdm = nomePresAdm;
    }

    public String getEmailPresAdm() {
        return emailPresAdm;
    }

    public void setEmailPresAdm(String emailPresAdm) {
        this.emailPresAdm = emailPresAdm;
    }

    public int getTelPresAdm() {
        return telPresAdm;
    }

    public void setTelPresAdm(int telPresAdm) {
        this.telPresAdm = telPresAdm;
    }

    public int getCelPresAdm() {
        return celPresAdm;
    }

    public void setCelPresAdm(int celPresAdm) {
        this.celPresAdm = celPresAdm;
    }

    public String getNomeTransp() {
        return nomeTransp;
    }

    public void setNomeTransp(String nomeTransp) {
        this.nomeTransp = nomeTransp;
    }

    public String getEmailTransp() {
        return emailTransp;
    }

    public void setEmailTransp(String emailTransp) {
        this.emailTransp = emailTransp;
    }

    public int getTelTransp() {
        return telTransp;
    }

    public void setTelTransp(int telTransp) {
        this.telTransp = telTransp;
    }

    public int getCelTransp() {
        return celTransp;
    }

    public void setCelTransp(int celTransp) {
        this.celTransp = celTransp;
    }

    public String getNomeRespConstr() {
        return nomeRespConstr;
    }

    public void setNomeRespConstr(String nomeRespConstr) {
        this.nomeRespConstr = nomeRespConstr;
    }

    public String getEmailRespContr() {
        return emailRespContr;
    }

    public void setEmailRespContr(String emailRespContr) {
        this.emailRespContr = emailRespContr;
    }

    public int getTelRespContr() {
        return telRespContr;
    }

    public void setTelRespContr(int telRespContr) {
        this.telRespContr = telRespContr;
    }

    public int getCelRespContr() {
        return celRespContr;
    }

    public void setCelRespContr(int celRespContr) {
        this.celRespContr = celRespContr;
    }

    public String getTipoServPredio() {
        return tipoServPredio;
    }

    public void setTipoServPredio(String tipoServPredio) {
        this.tipoServPredio = tipoServPredio;
    }

    public String getTipoIlumPredio() {
        return tipoIlumPredio;
    }

    public void setTipoIlumPredio(String tipoIlumPredio) {
        this.tipoIlumPredio = tipoIlumPredio;
    }

    public String getTipoLampPredio() {
        return tipoLampPredio;
    }

    public void setTipoLampPredio(String tipoLampPredio) {
        this.tipoLampPredio = tipoLampPredio;
    }

    public int getQtdeLampPredio() {
        return qtdeLampPredio;
    }

    public void setQtdeLampPredio(int qtdeLampPredio) {
        this.qtdeLampPredio = qtdeLampPredio;
    }

    public int getQtdeWattsLamPr() {
        return qtdeWattsLamPr;
    }

    public void setQtdeWattsLamPr(int qtdeWattsLamPr) {
        this.qtdeWattsLamPr = qtdeWattsLamPr;
    }

    public String getNomEletrResp() {
        return nomEletrResp;
    }

    public void setNomEletrResp(String nomEletrResp) {
        this.nomEletrResp = nomEletrResp;
    }

    public String getEmailEletrResp() {
        return emailEletrResp;
    }

    public void setEmailEletrResp(String emailEletrResp) {
        this.emailEletrResp = emailEletrResp;
    }

    public int getTelEletrResp() {
        return telEletrResp;
    }

    public void setTelEletrResp(int telEletrResp) {
        this.telEletrResp = telEletrResp;
    }

    public int getCelEletrResp() {
        return celEletrResp;
    }

    public void setCelEletrResp(int celEletrResp) {
        this.celEletrResp = celEletrResp;
    }

    public String getNomeMinisterio() {
        return nomeMinisterio;
    }

    public void setNomeMinisterio(String nomeMinisterio) {
        this.nomeMinisterio = nomeMinisterio;
    }

    public String getEmailMinisterio() {
        return emailMinisterio;
    }

    public void setEmailMinisterio(String emailMinisterio) {
        this.emailMinisterio = emailMinisterio;
    }

    public int getTelMinisterio() {
        return telMinisterio;
    }

    public void setTelMinisterio(int telMinisterio) {
        this.telMinisterio = telMinisterio;
    }

    public int getCelMinisterio() {
        return celMinisterio;
    }

    public void setCelMinisterio(int celMinisterio) {
        this.celMinisterio = celMinisterio;
    }

    public String getCidLocalEntrg() {
        return cidLocalEntrg;
    }

    public void setCidLocalEntrg(String cidLocalEntrg) {
        this.cidLocalEntrg = cidLocalEntrg;
    }

    public String getBairroLocalEntrg() {
        return bairroLocalEntrg;
    }

    public void setBairroLocalEntrg(String bairroLocalEntrg) {
        this.bairroLocalEntrg = bairroLocalEntrg;
    }

    public String getEndLocalEntrg() {
        return endLocalEntrg;
    }

    public void setEndLocalEntrg(String endLocalEntrg) {
        this.endLocalEntrg = endLocalEntrg;
    }

    public String getUfLocalEntrg() {
        return ufLocalEntrg;
    }

    public void setUfLocalEntrg(String ufLocalEntrg) {
        this.ufLocalEntrg = ufLocalEntrg;
    }

    public int getCepLocalEntrg() {
        return cepLocalEntrg;
    }

    public void setCepLocalEntrg(int cepLocalEntrg) {
        this.cepLocalEntrg = cepLocalEntrg;
    }

    public int getTelLocalEntrg() {
        return telLocalEntrg;
    }

    public void setTelLocalEntrg(int telLocalEntrg) {
        this.telLocalEntrg = telLocalEntrg;
    }

    public int getCelLocalEntrg() {
        return celLocalEntrg;
    }

    public void setCelLocalEntrg(int celLocalEntrg) {
        this.celLocalEntrg = celLocalEntrg;
    }

    public int getLargIgrejaTotal() {
        return largIgrejaTotal;
    }

    public void setLargIgrejaTotal(int largIgrejaTotal) {
        this.largIgrejaTotal = largIgrejaTotal;
    }

    public int getCompIgrejaTotal() {
        return compIgrejaTotal;
    }

    public void setCompIgrejaTotal(int compIgrejaTotal) {
        this.compIgrejaTotal = compIgrejaTotal;
    }

    public int getAltIgrejaTotal() {
        return altIgrejaTotal;
    }

    public void setAltIgrejaTotal(int altIgrejaTotal) {
        this.altIgrejaTotal = altIgrejaTotal;
    }

    public int getLargGaleria() {
        return largGaleria;
    }

    public void setLargGaleria(int largGaleria) {
        this.largGaleria = largGaleria;
    }

    public int getCompGaleria() {
        return compGaleria;
    }

    public void setCompGaleria(int compGaleria) {
        this.compGaleria = compGaleria;
    }

    public int getAltGaleria() {
        return altGaleria;
    }

    public void setAltGaleria(int altGaleria) {
        this.altGaleria = altGaleria;
    }

    public String getTipoForro() {
        return tipoForro;
    }

    public void setTipoForro(String tipoForro) {
        this.tipoForro = tipoForro;
    }

    public String getCorForro() {
        return corForro;
    }

    public void setCorForro(String corForro) {
        this.corForro = corForro;
    }

    public String getCorParedeInt() {
        return corParedeInt;
    }

    public void setCorParedeInt(String corParedeInt) {
        this.corParedeInt = corParedeInt;
    }

    public boolean isGaleria() {
        return galeria;
    }

    public void setGaleria(boolean galeria) {
        this.galeria = galeria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
    
    
}
