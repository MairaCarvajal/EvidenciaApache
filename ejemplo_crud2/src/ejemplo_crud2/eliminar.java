/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_crud2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author MAIRA
 */

public class eliminar {

    public void eliminarpersona(int id) throws SQLException {
        String sql = "DELETE FROM persona WHERE id = ?";  // Asegúrate de que el nombre de la columna sea correcto
        try (Connection con = new conexion().getConection();  // Crea una nueva instancia de conexion
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
 }
}
}