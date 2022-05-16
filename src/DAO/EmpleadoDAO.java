package DAO;

import BEAN.Empleado;
import UTIL.DbBean;
import java.util.Vector;
import java.sql.*;

public class EmpleadoDAO {
    public EmpleadoDAO(){}
       
    public Vector<Empleado> listEmp(boolean sw, String cad){
        Vector<Empleado> lista = new Vector<Empleado>();
        DbBean con = new DbBean();
        String sql = "Select * from empleado ";
        if(sw == true){
            sql = sql + " where apellidos like '"+ cad +"%'";
        }
        try{
            ResultSet resultado = con.execSQL(sql);
            
            while(resultado.next()){
                Empleado emp = new Empleado();
                emp.setId_Empleado(resultado.getInt(1));
                emp.setApellidos(resultado.getString(2));
                emp.setSexo(resultado.getInt(3));
                emp.setConSeg(resultado.getInt(4));
                emp.setNumSeg(resultado.getInt(5));
                emp.setSecun(resultado.getInt(6));
                emp.setTec(resultado.getInt(7));
                emp.setUniv(resultado.getInt(8));
                emp.setAfp(resultado.getInt(9));
                emp.setEstado(resultado.getInt(10));
                lista.add(emp);
            }    
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    public void insUpd(String op, Empleado emp){
        String sql = "";
        DbBean db = new DbBean();
        if(op.equals("insert")){
            sql = "insert into empleado values ('"+ emp.getId_Empleado() +"' ";
            sql = sql + ", '"+ emp.getApellidos() +"'";
            sql = sql + ", '"+ emp.getSexo() +"'";
            sql = sql + ", '"+ emp.getConSeg() +"'";
            sql = sql + ", '"+ emp.getNumSeg() +"'";
            sql = sql + ", '"+ emp.getSecun()+"'";
            sql = sql +", '"+ emp.getTec() +"'";
            sql = sql +", '"+ emp.getUniv() +"'";
            sql = sql +", '"+ emp.getAfp() +"'";
            sql = sql +", '"+ emp.getEstado() +"')";
        }else if(op.equals("update")){
            sql = "update empleado set ";
            sql = sql + " apellidos = '"+ emp.getApellidos() +"'";
            sql = sql + ", sexo = "+ emp.getSexo() +"";
            sql = sql + ", conseg = "+ emp.getConSeg() +"";
            sql = sql + ", numSeg = "+ emp.getNumSeg() +"";
            sql = sql + ", secun = "+ emp.getSecun() +"";
            sql = sql + ", tec = "+ emp.getTec() +"";
            sql = sql + ", univ = "+ emp.getUniv() +"";
            sql = sql + ", afp = "+ emp.getAfp()+"";
            sql = sql + ", estado = "+ emp.getEstado()+"";
            sql = sql + " where id_empleado = "+ emp.getId_Empleado() +"";                    
        }
        try{
            db.updateSQL(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
        try{
            db.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
