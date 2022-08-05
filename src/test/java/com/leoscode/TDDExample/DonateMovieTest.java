package com.leoscode.TDDExample;




import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DonateMovieTest {

    private final Library library;
    private final Movie movie;

    public DonateMovieTest() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    public void movieAddedToCatalogue(){

        library.donate(movie);
        assertTrue(library.contains(library, movie));
    }

    @Test
    public void retainCopyAdded(){
        library.donate(movie);
        assertEquals(1, movie.getCopies());

    }


}
