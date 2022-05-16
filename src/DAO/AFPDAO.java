package DAO;
import BEAN.AFP;
import UTIL.DbBean;
import java.util.Vector;
import java.sql.*;
public class AFPDAO {
    public AFPDAO() {}    
    public Vector<AFP> listaAfp(boolean sw, String cad){
        String sql;
        Vector<AFP> lista = new Vector<AFP>();
        DbBean db = new DbBean();
        sql = "Select * from AFP";
        try{
            ResultSet result = db.execSQL(sql);
            while(result.next()){
                AFP afp = new AFP();
                afp.setId_Afp(result.getInt(1));
                afp.setNombAfp(result.getString(2));
                lista.add(afp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }   
}
