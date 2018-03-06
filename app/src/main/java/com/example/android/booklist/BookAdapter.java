package com.example.android.booklist;

/**
 * Created by bcoat on 3/5/2018.
 */

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * A {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Book} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    private static final String LOG_TAG = BookAdapter.class.getName();

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        //Find the ImageView with the view ID book_cover
        //TODO: Change to use image from cover image url
        ImageView coverImage = (ImageView) listItemView.findViewById(R.id.book_cover);

        //Get the URL for the cover image
        coverImage.setImageResource(R.drawable.small_book_cover);

        // Find the TextView with view ID book_title
        TextView titleView = (TextView) listItemView.findViewById(R.id.book_title);
        //Get the title of the current book
        String bookTitle = currentBook.getTitle();
        // Display the title of the current book in that TextView
        titleView.setText(bookTitle);

        // Find the TextView with view ID book_author
        TextView authorView = (TextView) listItemView.findViewById(R.id.book_author);
        //Get the author of the current book
        String bookAuthor = currentBook.getAuthor();

        // Display the location of the current earthquake in that TextView
        authorView.setText(formatAuthorName(bookAuthor));

        // Find the TextView with view ID book_publication_date
        TextView publicationDateView = (TextView) listItemView.findViewById(R.id.book_publication_date);
        //Get the publication date for the current book
        String publicationDate = currentBook.getPublicationDate();

        Log.v(LOG_TAG, "Publication date: " + publicationDate);
        // Display the publication date of the current book in that TextView
        publicationDateView.setText(formatDate(publicationDate));

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted author name string from Author name object
     *
     */
    private String formatAuthorName(String bookAuthor) {
        String firstString = bookAuthor.substring(2);
        bookAuthor = firstString.substring(0, firstString.length() - 2);
        //If there are multiple authors only display the first one listed
        if (bookAuthor.contains(",")){
            String[] parts = bookAuthor.split("\"");
            bookAuthor = parts[0];
        }
        return bookAuthor;
    }


    /**
     * Return the formatted date string
     */
    private String formatDate(String publicationDate) {
        int stringLength = publicationDate.length();
        String formattedDate;
        //If there is a part of the date missing just display the year
        if (stringLength != 10){
            String[] parts = publicationDate.split("-");
            formattedDate = parts[0];
        } else {
            String[] parts = publicationDate.split("-");
            formattedDate = parts[1] + "/" + parts[2] + "/" + parts[0];
        }
        return formattedDate;

    }

}
