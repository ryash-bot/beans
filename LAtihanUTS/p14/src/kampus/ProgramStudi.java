/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author user1
 */
class ProgramStudi extends DosenTetap {
    private String namaProgramStudi;
    private String fakultas;    

    public ProgramStudi() {
    }

    public ProgramStudi(String namaProgramStudi, String fakultas) {
        this.namaProgramStudi = namaProgramStudi;
        this.fakultas = fakultas;
    }

    public String getNamaProgramStudi() {
        return namaProgramStudi;
    }

    public void setNamaProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    
}
