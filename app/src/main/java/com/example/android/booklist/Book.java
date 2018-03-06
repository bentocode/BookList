package com.example.android.booklist;
/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * A {@link Book} object contains information related to a single book.
 */
public class Book {

    /** Title of the book */
    private String mTitle;

    /** Author of the book */
    private String mAuthor;

    /** Date of publication of the book */
    private String mPublicationDate;

    /** Website URL of the book */
    private String mUrl;

    /**URL for the cover image of the book*/
    private String mCoverImageUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title is the title of the book
     * @param author is the author of the book
     * @param publicationDate is the date of publication in String format
     * @param url is the website URL to find more details about the book
     *
     * @param coverImageUrl is the URL for the cover image of the book
     */
    public Book(String title, String author, String publicationDate, String url, String coverImageUrl) {
        mTitle = title;
        mAuthor = author;
        mPublicationDate = publicationDate;
        mUrl = url;
        mCoverImageUrl = coverImageUrl;
    }

    /** Returns the title of the book */
    public String getTitle(){

        return mTitle;

    }

    /**Returns the author of the book */
    public String getAuthor(){

        return mAuthor;

    }

    /**Returns the publication date of the book */
    public String getPublicationDate(){

        return mPublicationDate;

    }


    /**Returns the url of the book */
    public String getBookUrl(){

        return mUrl;

    }

    /**Returns the cover image url of the book */
    public String getCoverImageUrl(){

        return mCoverImageUrl;

    }

}

