
/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.grid;
 
import java.util.ArrayList;
import java.util.List;
 
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.client.loader.HttpProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.data.shared.loader.ListLoadResultBean;
//import com.sencha.gxt.data.shared.loader.JsonReader;
import com.sencha.gxt.data.shared.loader.ListLoadConfig;
import com.sencha.gxt.data.shared.loader.ListLoadResult;
import com.sencha.gxt.data.shared.loader.ListLoader;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
//import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
 
public class Departures implements IsWidget, EntryPoint {
 
 
  public interface FlightAutoBeanFactory extends AutoBeanFactory {
 
   // AutoBean<RecordResult> items();
 
    AutoBean<ListLoadConfig> loadConfig();
  }
 
  public interface Departures {
    String getTime();
 
    String getFligtName();
 
    String getOrigin();
 
    String getDestination();
 
    String getRemarks();
  }
 
  /**
   * Defines the structure of the root JSON object being returned by the server.
   * This class is needed as we cannot return a list of objects. Instead, we
   * return a single object with a single property that contains the data
   * records.
   */
  /*public interface RecordResult {
 
    List<Flight> getRecords();
  }
 
  class DataRecordJsonReader extends JsonReader<ListLoadResult<Flight>, RecordResult> {
    public DataRecordJsonReader(AutoBeanFactory factory, Class<RecordResult> rootBeanType) {
      super(factory, rootBeanType);
    }
 
    @Override
    protected ListLoadResult<Flight> createReturnData(Object loadConfig, RecordResult incomingData) {
      return new ListLoadResultBean<Flight>(incomingData.getRecords());
    }
  }
   */
  interface FlightProperties extends PropertyAccess<Flight> {
    @Path("name")
    ModelKeyProvider<Flight> key();
 
    ValueProvider<Flight, String> name();
     
    ValueProvider<Flight, String> Flight();
     
    ValueProvider<Flight, String> Origin();
     
    ValueProvider<Flight, String> Destination();
     
    ValueProvider<Flight, String> zip();
  }
   
  @Override
  public void onModuleLoad() {
    RootPanel.get().add(this);
  }
 
  @Override
  public Widget asWidget() {
    FlightAutoBeanFactory factory = GWT.create(FlightAutoBeanFactory.class);
 
//    DataRecordReader reader = new DataRecordJsonReader(factory, RecordResult.class);
 
    String path = "data/data.json";
    RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, path);
    HttpProxy<ListLoadConfig> proxy = new HttpProxy<ListLoadConfig>(builder);
 
    final ListLoader<ListLoadConfig, ListLoadResult<Flight>> loader = new ListLoader<ListLoadConfig, ListLoadResult<Flight>>(
        proxy, reader);
    loader.useLoadConfig(factory.create(ListLoadConfig.class).as());
     
    FlightProperties props = GWT.create(FlightProperties.class);
     
    ListStore<Flight> store = new ListStore<Flight>(props.key());
    loader.addLoadHandler(new LoadResultListStoreBinding<ListLoadConfig, Flight, ListLoadResult<Flight>>(store));
     
    ColumnConfig<Flight, String> cc1 = new ColumnConfig<Flight, String>(props.name(), 100, "Time");
    ColumnConfig<Flight, String> cc2 = new ColumnConfig<Flight, String>(props.Flight(), 165, "Flight");
    ColumnConfig<Flight, String> cc3 = new ColumnConfig<Flight, String>(props.Origin(), 100, "Origin");
    ColumnConfig<Flight, String> cc4 = new ColumnConfig<Flight, String>(props.Destination(), 50, "Destination");
    ColumnConfig<Flight, String> cc5 = new ColumnConfig<Flight, String>(props.zip(), 65, "Remarks");
     
    List<ColumnConfig<Flight, ?>> l = new ArrayList<ColumnConfig<Flight, ?>>();
    l.add(cc1);
    l.add(cc2);
    l.add(cc3);
    l.add(cc4);
    l.add(cc5);
    ColumnModel<Flight> cm = new ColumnModel<Flight>(l);
 
    Grid<Flight> grid = new Grid<Flight>(store, cm);
    grid.getView().setForceFit(true);
    grid.setLoader(loader);
    grid.setLoadMask(true);
    grid.setBorders(true);
    grid.getView().setEmptyText("Display arrval flights details");
     
    FramedPanel cp = new FramedPanel();
    cp.setHeadingText("Departures");
    cp.setCollapsible(true);
    cp.setAnimCollapse(true);
    cp.setWidget(grid);
    cp.setPixelSize(575, 350);
    cp.addStyleName("margin-10");
   {
       
    //  @Override
     // public void onSelect(SelectEvent event) {
      //  loader.load();
      }
    ;{
     
    return cp;
  }
 
}}
