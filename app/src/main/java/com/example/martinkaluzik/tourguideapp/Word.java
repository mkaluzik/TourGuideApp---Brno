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
package com.example.martinkaluzik.tourguideapp;

public class Word {

    private String mFirstLine;
    private String mSecondLine;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param FirstLine is the name of the place
     * @param SecondLine is the place description or detail
     */
    public Word(String FirstLine, String SecondLine) {
        mFirstLine = FirstLine;
        mSecondLine = SecondLine;
    }

    /**
     * Create a new Word object.
     */
    public Word(String FirstLine, String SecondLine, int imageResourceId) {
        mFirstLine = FirstLine;
        mSecondLine = SecondLine;
        mImageResourceId = imageResourceId;
    }

    public String getFirstLine() {
        return mFirstLine;
    }

    public String getSecondLine() {
        return mSecondLine;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}