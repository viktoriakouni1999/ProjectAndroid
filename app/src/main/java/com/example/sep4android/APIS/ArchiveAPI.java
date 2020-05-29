package com.example.sep4android.APIS;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ArchiveAPI {
    @GET("/api/archive")
    Call<List<RoomResponse>> getAllArchiveRooms();

    @GET("/api/archive/latestValues")
    Call<List<ArchiveResponse>> getAllArchiveRoomsLatestValues();

    @GET("/api/archive/{roomNumber}/latestValuesByArchiveId")
    Call<ArchiveResponse> getArchiveRoomLatestValues(@Path("roomNumber") int roomNumber);


   //  @GET("api/v2/archive/GetCo2/{roomNumber}")
   // Call<ConditionsResponse> getRoomConditionLevel(@Path("roomNumber") int roomNumber);
}