import java.sql.*;
import java.util.ArrayList;


import com.mysql.cj.jdbc.Driver;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
//        protected information is inside the config class and gitignored
        Config config = new Config();
        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            Statement statement = connection.createStatement();


//            CINSERT INTO EXAMPLES
//            String sql = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly FORNADA', 'Foot-Loose', 2008, 'Rock, Urban, R&B', 14.5)";
//            statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if(rs.next()){
//                System.out.println("Inserted into : " + rs.getLong(1));
//            }
            ResultSet rs =  statement.executeQuery("SELECT * FROM albums");
//            SELECT EXAMPLES
            while(rs.next() ){
                albums.add(
                        new Album(
                            rs.getLong("id"),
                            rs.getString("artist"),
                            rs.getString("name"),
                            rs.getInt("release_date"),
                            rs.getString("genre"),
                            rs.getDouble("sales")
                        )
                );
//                get method depends on table datatype
//                System.out.println("rs.getlong('id') = " + rs.getLong("id"));
//                gets the 3 column value
//                System.out.println("rs.getString(3) = " + rs.getString(3));
            }

//            DELETE EXAMPLES
//            long idToDelete = 8;
//            sql = "DELETE FROM albums where id = " +idToDelete;
//            statement.execute(sql);

//            UPDATE EXAMPLE
            double sales = 60.5;
            statement.execute("UPDATE albums SET sales =" + sales +" WHERE id = 9");




        } catch(SQLException e){
            e.printStackTrace();
        }

        for (Album album : albums){
            System.out.println(album.getId());
            System.out.println(album.getArtist());
            System.out.println(album.getAlbum());
            System.out.println(album.getGenre());
            System.out.println(album.getRelease_date());
            System.out.println(album.getSales());
        }

    }
}
