package com.javaweb.service;


import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.model.request.BuildingSearchRequest;
import com.javaweb.model.response.BuildingSearchResponse;

import java.util.ArrayList;
import java.util.Map;

public interface BuildingService {
    ArrayList<BuildingSearchResponse> findAll(BuildingSearchRequest request);
    void createAndUpdateBuilding(BuildingDTO requestDTO);
    void deleteBuildings(ArrayList<Long> ids);
}
