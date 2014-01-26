package com.learninghouse.mymusiclist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyMusicListService {
    private List<Song> songs;

    {
        songs = new ArrayList<Song>();
        songs.add(new Song("I'm Yours","Jason Mraz","We Sing, We Dance, we Steal Things",getDate(2008, 05, 15)));
        songs.add(new Song("Kryptonite","3 Doors Down","The Better Life",getDate(2001, 01, 17)));
        songs.add(new Song("Timber","Pit Bull","The Better Life",getDate(2013, 10, 7)));
        songs.add(new Song("Dark Horse","Katy Perry","Single",getDate(2013, 12, 17)));
        songs.add(new Song("Counting Stars","One Republic","Single",getDate(2013, 6, 14)));
        songs.add(new Song("Demons","Imagine Dragons","Single",getDate(2013, 10, 22)));
        songs.add(new Song("Drink A Beer","Luke Bryan","Crash My Party",getDate(2013, 11, 11)));

        songs.add(new Song("I'm Yours","Jason Mraz","We Sing, We Dance, we Steal Things",getDate(2008, 05, 15)));
        songs.add(new Song("Kryptonite","3 Doors Down","The Better Life",getDate(2001, 01, 17)));
        songs.add(new Song("Timber","Pit Bull","The Better Life",getDate(2013, 10, 7)));
        songs.add(new Song("Dark Horse","Katy Perry","Single",getDate(2013, 12, 17)));
        songs.add(new Song("Counting Stars","One Republic","Single",getDate(2013, 6, 14)));
        songs.add(new Song("Demons","Imagine Dragons","Single",getDate(2013, 10, 22)));
        songs.add(new Song("Drink A Beer","Luke Bryan","Crash My Party",getDate(2013, 11, 11)));
    }


    public List<Song> findAll(){
        return songs;
    }

    public Song findOne(String name){
        for(Song song:songs){
            if(song.getName().equals(name)){
                return song;
            }
        }
        return new Song();
    }

    private static Date getDate(int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year,month,day,0,0);
        return c.getTime();
    }
}
