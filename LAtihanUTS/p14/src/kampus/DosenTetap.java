/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author user1
 */
public class DosenTetap extends Dosen{
    private ProgramStudi programStudi;

    public DosenTetap() {
    }
    public ProgramStudi getProgramStudi(){
    return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public void tampilBiodata() {
        System.out.println("Nip :" + getNid());
        System.out.println("Nama Dosen :" + getNama());
        System.out.println("Program Strudi :" + getProgramStudi());
        System.out.println("Fakultas :" + getFakultas());
        
    }
    
    
}
