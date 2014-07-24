/*
    Optical Workshop Monitoring System is a desktop application to fulfill the workflow control requirement at IRDE (DRDO) Dehradun.
    Copyright (C) 2014  Mayank Chaudhari (devil15)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

   For any query mail me at m.charly3015@gmail.com 
 */

package opticalworkshopmonitoringsystem;

/**
 *
 * @author devil15
 */
import java.sql.*;

public class Db_Connect {
    
    public static Connection con=null;
    public static Connection in()
    {
       try{
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/drdo","root","");
          }
      catch(Exception ex){}
      return con;
    }
    
    public static Connection out()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/drdo","root","");
        }
        catch(Exception e){}
        return con;
     }

}
