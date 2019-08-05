/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
   
 */

package com.loginradius.sdk.models.responsemodels.userprofile.objects;
import com.google.gson.annotations.SerializedName;

	// <summary>
	//	Response containing Definition for Complete Job Bookmark Company data
	// </summary>
	public class JobBookmarkCompany {
	
		
		@SerializedName("Id")
        private String id;
		
		@SerializedName("Name")
        private String name;



		// <summary>
		//	Company id
		// </summary>
		public String getId() {
			return id;
		}
		// <summary>
		//	Company id
		// </summary>
		public void setId(String id) {
			this.id = id;
		}
		// <summary>
		//	Company name
		// </summary>
		public String getName() {
			return name;
		}
		// <summary>
		//	Company name
		// </summary>
		public void setName(String name) {
			this.name = name;
		}
    }