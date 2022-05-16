package BEAN;
public class Empleado {
    private int Id_Empleado;
    private String apellidos;
    private int sexo;
    private int conSeg;
    private int numSeg;
    private int secun;
    private int tec;
    private int univ;
    private int afp;
    private int estado;

    public Empleado() {
    }

    public Empleado(int Id_Empleado, String apellidos, int sexo, int conSeg, int numSeg, int secun, int tec, int univ, int afp, int estado) {
        this.Id_Empleado = Id_Empleado;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.conSeg = conSeg;
        this.numSeg = numSeg;
        this.secun = secun;
        this.tec = tec;
        this.univ = univ;
        this.afp = afp;
        this.estado = estado;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getConSeg() {
        return conSeg;
    }

    public void setConSeg(int conSeg) {
        this.conSeg = conSeg;
    }

    public int getNumSeg() {
        return numSeg;
    }

    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    public int getSecun() {
        return secun;
    }

    public void setSecun(int secun) {
        this.secun = secun;
    }

    public int getTec() {
        return tec;
    }

    public void setTec(int tec) {
        this.tec = tec;
    }

    public int getUniv() {
        return univ;
    }

    public void setUniv(int univ) {
        this.univ = univ;
    }

    public int getAfp() {
        return afp;
    }

    public void setAfp(int afp) {
        this.afp = afp;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
}
