public class songImplement implements Isong {

    private long id;
    private String name;
    private String artist;
    private String album;
    private int rating;
    private int year;

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long value) {
        this.id = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public void setArtist(String value) {
        this.artist = value ;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setAlbum(String value) {
        this.album = value;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int value) {
        this.rating = value;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int value) {
        this.year = value;
    }
    public String displaySong() {
        return getName() + "" + getAlbum();
    }
}
