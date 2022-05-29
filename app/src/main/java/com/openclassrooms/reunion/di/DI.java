package com.openclassrooms.reunion.di;

import com.openclassrooms.reunion.service.DummyReunionApiService;
import com.openclassrooms.reunion.service.DummyReunionApiService;
import com.openclassrooms.reunion.service.ReunionApiService;
import com.openclassrooms.reunion.service.ReunionApiService;

/**
 * Dependency injector to get instance of services
 */
public class DI {

    private static ReunionApiService service = new DummyReunionApiService();

    /**
     * Get an instance on @{@link ReunionApiService}
     * @return
     */
    public static ReunionApiService getReunionApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link ReunionApiService}. Useful for tests, so we ensure the context is clean.
     * @return
     */
    public static ReunionApiService getNewInstanceApiService() {
        return new DummyReunionApiService();
    }
}
