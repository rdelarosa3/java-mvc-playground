public class test {
    public static void main(String[] args) {
        Config config = new Config();
        MySQLAdsDao  adsDao = new MySQLAdsDao(config);
        Ad ad = new Ad(
                2,
                3,
                "Sega Genesis",
                "SOnic Rocks"
        );
        adsDao.insert(ad);
        
    }
}
