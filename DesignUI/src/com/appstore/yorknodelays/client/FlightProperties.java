package com.appstore.yorknodelays.client;

import com.appstore.yorknodelays.shared.Flight;
import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

interface FlightProperties extends PropertyAccess<Flight> {
    ModelKeyProvider<Flight> id();
    
    @Path("id")
    ValueProvider<Flight, String> flightId();
     
    @Path("destination.id")
    ValueProvider<Flight, String> destination();
    @Path("departure.id")
    ValueProvider<Flight, String> origin();
    
    ValueProvider<Flight, String> remarks();
}
