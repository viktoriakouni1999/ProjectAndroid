package com.example.sep4android.ViewModels;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.sep4android.Models.ArchiveRoom;
import com.example.sep4android.Repositories.ArchiveRepository;

import java.util.ArrayList;

import DTO.RoomsDTO;

public class ArchiveViewModel extends AndroidViewModel {

    private ArchiveRepository repository;


    public ArchiveViewModel(@NonNull Application application) {
        super(application);
        repository = ArchiveRepository.getInstance();
    }

    public LiveData<ArrayList<RoomsDTO>> getArchiveRooms(){
        return repository.getArchiveRooms();
    }

    public void getArchiveRoom(int roomNumber){
        repository.getArchiveRoom(roomNumber);
    }

}
