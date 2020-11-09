public class Album {
    private long id;
    private String artist;
    private String album;
    private int release_date;
    private String genre;
    private double sales;

    public Album(){}
    public Album(long id, String artist, String album, int release_date, String genre, double sales) {
        this.id = id;
        this.artist = artist;
        this.album = album;
        this.release_date = release_date;
        this.genre = genre;
        this.sales = sales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
