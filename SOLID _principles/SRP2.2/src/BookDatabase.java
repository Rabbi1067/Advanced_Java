import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDatabase {
    public void save (Book book){
        try{
            Connection con = ConnectionSingleton.getConnection();
            String sql = "Insert into books(title.author) values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,book.getTitle());
            ps.setString(2,book.getAuthor());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
