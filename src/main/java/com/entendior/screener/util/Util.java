package com.entendior.screener.util;

import java.io.File;
import java.util.Comparator;

public class Util {
	
	public static final Comparator<File> CP_FILES_BY_DATE = new Comparator<File>(){
	    public int compare(File f1, File f2)
	    {
	        return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
	    } };
	    
    public static final Comparator<File> CP_FILES_BY_NAME = new Comparator<File>(){
	    public int compare(File f1, File f2)
	    {
	        int default_AtoZ_1to9 = f1.getName().compareTo(f2.getName());
			return default_AtoZ_1to9;
	    } };
	
	/**
	 * Sorts date named files (e.g 20130717) from newest to oldest.
	 * 
	 */
    public static final Comparator<File> CP_FILES_BY_NAME_REVERSE = new Comparator<File>(){
	    public int compare(File f1, File f2)
	    {
	        int default_AtoZ_1to9 = f1.getName().compareTo(f2.getName());
	        
			return -1*default_AtoZ_1to9;
	    } };

}
