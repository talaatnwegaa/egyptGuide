package com.talaat_nwegaa.clipcodes;

public class Tourism {

    private String mHeader;
    private String mText;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mlink;

    public Tourism(String header, int imageResourceId, String text, String link){
        mHeader=header;
        mImageResourceId=imageResourceId;
        mText=text;
        mlink=link;

    }
    public String getHeader(){
        return mHeader;
    }
    public int getImage(){
        return mImageResourceId;
    }
    public String getText(){
        return mText;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;}
    public String getLink(){return mlink;}

}
