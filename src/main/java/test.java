public class test {
    public static void main(String[] args) {
        MySQLAdsDao  adsDao = new MySQLAdsDao();
        Ad ad = new Ad(
                2,
                3,
                "Sega Genesis",
                "SOnic Rocks"
        );
        adsDao.insert(ad);
        
    }
}
