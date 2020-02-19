package com.nexapps.nenglish.domain;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

	
public class Pronunciations implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("url")
	private String urlAudio;

	public String getUrlAudio() {
		return urlAudio;
	}

	public void setUrlAudio(String urlAudio) {
		this.urlAudio = urlAudio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pronunciations [urlAudio=");
		builder.append(urlAudio);
		builder.append("]");
		return builder.toString();
	}
	

	
	
	
	
}
/*
 *    { 
         "entry":"root",
         "pronunciations":[ 
            { 
               "transcriptions":[  ],
               "audio":{ 
                  "url":"http://audio.linguarobot.io/en/root-au.mp3",
                  "license":{ 
                     "name":"BY-SA 4.0",
                     "url":"https://creativecommons.org/licenses/by-sa/4.0"
                  },
                  "sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=75649427"
               },
                "context":{ 
                  "regions":[ 
                     "United States"
                  ]
               }
            }
   }


 */