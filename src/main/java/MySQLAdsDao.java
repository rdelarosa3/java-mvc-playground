import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Config config = new Config();
    private Connection connection;
    private List<Ad> ads;

    public MySQLAdsDao(){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all(){
        ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add( ad );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        if (ads.size() < 1) {
            generateAds();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String sql = String.format("INSERT INTO ads (user_id,title,description) VALUES (%d,'%s','%s')",
                ad.getUserId(),ad.getTitle(),ad.getDescription());
        long adId = 0L;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                adId = rs.getLong(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return adId;
    }

    private void generateAds() {
        List<Ad> seed = new ArrayList<>();
        seed.add(new Ad(
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));

        seed.add(new Ad(
                1,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        seed.add(new Ad(
                2,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        seed.add(new Ad(
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        for(Ad ad : seed){
            insert(ad);
        }
        all();
    }
}
