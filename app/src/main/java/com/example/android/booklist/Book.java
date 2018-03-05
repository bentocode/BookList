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

    /** Time of publication of the book */
    private long mTimeInMilliseconds;

    /** Purchase price of the book */
    private double mPurchasePrice;

    /** Website URL of the book */
    private String mUrl;

    /**URL for the cover image of the book*/
    private String mCoverImageUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title is the title of the book
     * @param author is the author of the book
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           book was published
     * @param purchasePrice is the retail purchase price of the book
     * @param url is the website URL to find more details about the book
     *
     * @param coverImageUrl is the URL for the cover image of the book
     */
    public Book(String title, String author, long timeInMilliseconds, double purchasePrice, String url, String coverImageUrl) {
        mTitle = title;
        mAuthor = author;
        mTimeInMilliseconds = timeInMilliseconds;
        mPurchasePrice = purchasePrice;
        mUrl = url;
        mCoverImageUrl = coverImageUrl;
    }

//TODO: Define get methods
}

