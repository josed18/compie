/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author clases
 */
public class llamada {

    static String classqueryS(String simbolo, String simbolos, String string, String compie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String queryS(String query,String table,String where,String name)
    {
        int c_attr=5;
        String u[]=query.split(", ");
        boolean b[]=new boolean[c_attr];
        for(int a=1;a<c_attr;a+=1){b[a]=false;}
        for(int a=0;a<u.length;a+=1)
        {
            switch(u[a])
            {
                /*case "IDP":b[1]=true;break;
                case "nomb_pb":b[2]=true;break;
                case "tipo_pb":b[3]=true;break;
                case "descripcion":b[4]=true;break;*/
                //case "IDC":b[1]=true;break;
                case "simbolo":b[1]=true;break;
                case "tipo":b[2]=true;break;
                case "descripcion":b[3]=true;break;
            }
        }
        String select="";
        try
        {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/"+name;
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement statement = conn.createStatement();
            String sub=table;
            if (where.length()>0){sub+=" "+where;}
            ResultSet rs = statement.executeQuery("SELECT "+query+" FROM "+sub);
            while(rs.next())
            {
                String u2[]=table.split(", ");
                if (!table.contains(", "))
                {u2[0]=table;}
                for(int a=0;a<u2.length;a+=1)
                {
                    switch(u2[a])
                    {
                        case "simbolos":
                            //if (b[1]){int a1=rs.getInt("IDC");select+=a1+" ";}
                            if (b[1]){String a1=rs.getString("simbolo");select+=a1+" ";}
                            if (b[2]){String a2=rs.getString("tipo");select+=a2+" ";}
                            if (b[3]){String a3=rs.getString("descripcion");select+=a3+" ";}
                            select+="\n";
                        break;
                        /*case "tabla2":
                            if (b[1]){int a1=rs.getInt("attr1");select+=a1+" ";}
                            if (b[2]){String a2=rs.getString("attr2");select+=a2+" ";}
                            select+="\n";
                        break;*/
                    }
                }
            }
            statement.close();
        }
        catch (Exception e){System.err.println(e.getMessage());}
        
        return select;
    }
    
}
