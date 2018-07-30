import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        songImplement songimplement = new songImplement();
        songimplement.setName("test");
        songimplement.setAlbum("2005");
        songimplement.setArtist("Prince");
        songimplement.setRating(10);

     /*   System.out.printf("The song Name is : %s\n" , songimplement.getName());
        System.out.printf("The song Album is :%s\n" , songimplement.getAlbum());
        System.out.printf("The song Artist is : %s\n" , songimplement.getArtist());
        System.out.printf("The song Rating is : %s\n" , songimplement.getRating());*/

        ArrayList<songImplement> songArray = new ArrayList<>();
        songArray.add(songimplement);

        songImplement newSong = new songImplement();
        newSong.setName("test1");
        newSong.setAlbum("2012");
        newSong.setArtist("Prince1");
        newSong.setRating(10);

        songArray.add(newSong);

/*        System.out.printf("The song Name is : %s\n" , newSong.getName());
        System.out.printf("The song Album is :%s\n" , newSong.getAlbum());
        System.out.printf("The song Artist is : %s\n" , newSong.getArtist());
        System.out.printf("The song Rating is : %s\n" , newSong.getRating());*/

        for(songImplement test : songArray)
        {
            System.out.printf("This srtist is %s and the album is %s \n" , test.getName() , test.getAlbum());
        }


    }

}
