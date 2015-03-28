
package com.GetData;


public class GetLocationAPI
{
	int userId;
	int latitude;
	int longitude;
	
	public void setData(int userId,int latitude,int longitude)
	{
		this.userId=userId;
		this.latitude=latitude;
		this.longitude=longitude;
		StoreData();
	}
        void StoreData()
        {
            DBStore obj=new DBStore();
            obj.DBStorer(userId,latitude,longitude);
        }
}
		
	
	
