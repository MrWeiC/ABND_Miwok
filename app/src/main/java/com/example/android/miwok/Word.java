package com.example.android.miwok;

/**
 * Created by weichen on 8/4/16.
 */
public class Word {
    /**
     * Default translation of the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation of the word
     */
    private String mMiwokTranslation;
    /**
     * Image resourceId for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Audio resourceId for the word
     */
    private int mAudioResourceId;
    /**
     * Constant for no image provided.
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Gets image resource id
     * @return image resource id
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public Word(String def, String miwok, int mAudioResourceId) {
        this.mDefaultTranslation = def;
        this.mMiwokTranslation = miwok;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String def, String miwok, int imageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = def;
        this.mMiwokTranslation = miwok;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }


    /**
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
            "mDefaultTranslation='" + mDefaultTranslation + '\'' +
            ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
            ", mImageResourceId=" + mImageResourceId +
            ", mAudioResourceId=" + mAudioResourceId +
            '}';
    }
}
