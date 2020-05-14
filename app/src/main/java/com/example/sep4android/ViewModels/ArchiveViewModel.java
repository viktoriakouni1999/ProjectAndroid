package com.example.sep4android.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.sep4android.Models.ArchiveRoom;
import com.example.sep4android.Repositories.ArchiveRepository;

import java.util.ArrayList;

public class ArchiveViewModel extends AndroidViewModel {

    private ArchiveRepository repository;


    public ArchiveViewModel(@NonNull Application application) {
        super(application);
        repository = ArchiveRepository.getInstance(application);
    }

    public LiveData<ArrayList<ArchiveRoom>> getArchiveRooms(){
        return repository.getArchiveRooms();
    }




}
