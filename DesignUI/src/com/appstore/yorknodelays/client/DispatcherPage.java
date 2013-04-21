/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.appstore.yorknodelays.client;

import java.util.Date;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.sencha.gxt.core.client.util.ToggleGroup;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Slider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent.ParseErrorHandler;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.DoublePropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.IntegerPropertyEditor;
//import com.sencha.gxt.widget.core.client.form.DestinationField;
import com.sencha.gxt.widget.core.client.form.Radio;
import com.sencha.gxt.widget.core.client.form.SpinnerField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TimeField;
import com.sencha.gxt.widget.core.client.form.validator.MinDateValidator;
import com.sencha.gxt.widget.core.client.form.validator.MinLengthValidator;
import com.sencha.gxt.widget.core.client.info.Info;

//List of Flights or Airports
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
import com.sencha.gxt.data.shared.loader.JsonReader;
import com.sencha.gxt.data.shared.loader.ListLoadConfig;
import com.sencha.gxt.data.shared.loader.ListLoadResult;
import com.sencha.gxt.data.shared.loader.ListLoader;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
//import com.sencha.gxt.explorer.client.model.Example.Detail;
//import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DispatcherPage implements EntryPoint, IsWidget {
	
	private VerticalPanel vp; {
	 
	  public Widget asWidget() {
	    if (vp == null) {
	      vp = new VerticalPanel();
	      vp.setSpacing(10);
	      createForm1();
	     /* createForm2();*/
	    }
	    return vp;
	  }
	 
	  public void onModuleLoad() {
	    RootPanel.get().add(asWidget());
	  }
	 
	  private void createForm1() {
	    FramedPanel panel = new FramedPanel();
	    panel.setHeadingText("Airport");
	    panel.setWidth(350);
	    panel.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p = new VerticalLayoutContainer();
	    panel.add(p);
	 
	   /* TextField Origin = new TextField();
	    Origin.setAllowBlank(false);
	    Origin.setEmptyText("");*/
	/*    Origin.addValueChangeHandler(new ValueChangeHandler<String>() {
	      @Override
	      public void onValueChange(ValueChangeEvent<String> event) {
	        Info.display("Value Changed", "First name changed to " + event.getValue() == null ? "blank" : event.getValue());
	      }
	    }); */
	    
	    //Label
	    p.add(new FieldLabel(Origin, "Origin:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(Destination, "or Destination:"), new VerticalLayoutData(1, -1));
	    
	    //Text, type the Airport code
	    
	    TextField Origin = new TextField();
	    Origin.setAllowBlank(false);
	    p.add(new FieldLabel(Origin, ""), new VerticalLayoutData(1, -1));
	    
	    TextField Destination = new TextField();
	    Destination.setAllowBlank(false);
	    p.add(new FieldLabel(Destination, ""), new VerticalLayoutData(1, -1));
	 
	
	    // Search Button
	    
	    panel.addButton(new TextButton("Search"));
	    vp.add(panel); }
	    
	    // List of Airport & Flights
	  
	    //public class DispatcherPage implements IsWidget, EntryPoint {
	    	 
	    	 
	    	  public interface DestinationAutoBeanFactory extends AutoBeanFactory {
	    	 
	    	    AutoBean<RecordResult> items();
	    	 
	    	    AutoBean<ListLoadConfig> loadConfig();
	    	  }
	    	 
	    	  public interface Destination {
	    	    String getName();
	    	 
	    	    String getDestination();
	    	 
	    	    String getOrigin();
	    	 
	    	    String getETA();
	    	 
	    	    String getZip();
	    	  }
	    	 
	    	  /**
	    	   * Defines the structure of the root JSON object being returned by the server.
	    	   * This class is needed as we cannot return a list of objects. Instead, we
	    	   * return a single object with a single property that contains the data
	    	   * records.
	    	   */
	    	  public interface RecordResult {
	    	 
	    	    List<Destination> getRecords();
	    	  }
	    	 
	    	  class DataRecordJsonReader extends JsonReader<ListLoadResult<Destination>, RecordResult> {
	    	    public DataRecordJsonReader(AutoBeanFactory factory, Class<RecordResult> rootBeanType) {
	    	      super(factory, rootBeanType);
	    	    }
	    	 
	    	    @Override
	    	    protected ListLoadResult<Destination> createReturnData(Object loadConfig, RecordResult incomingData) {
	    	      return new ListLoadResultBean<Destination>(incomingData.getRecords());
	    	    }
	    	  }
	    	   
	    	  interface DestinationProperties extends PropertyAccess<Destination> {
	    	    @Path("name")
	    	    ModelKeyProvider<Destination> key();
	    	 
	    	    ValueProvider<Destination, String> name();
	    	     
	    	    ValueProvider<Destination, String> Destination();
	    	     
	    	    ValueProvider<Destination, String> Origin();
	    	     
	    	    ValueProvider<Destination, String> ETA();
	    	     
	    	    ValueProvider<Destination, String> zip();
	    	  }
	    	   
	    	  @Override
	    	  public void onModuleLoad() {
	    		  RootPanel.get().add(asWidget());
	    	  }
	    	 
	    	  @Override
	    	  public Widget asWidget() {
	    	    DestinationAutoBeanFactory factory = GWT.create(DestinationAutoBeanFactory.class);
	    	 
	    	    DataRecordJsonReader reader = new DataRecordJsonReader(factory, RecordResult.class);
	    	 
	    	    String path = "data/data.json";
	    	    RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, path);
	    	    HttpProxy<ListLoadConfig> proxy = new HttpProxy<ListLoadConfig>(builder);*/
	    	 
	    	   final ListLoader<ListLoadConfig, ListLoadResult<Destination>> loader = new ListLoader<ListLoadConfig, ListLoadResult<Destination>>(
	    	        proxy, reader);
	    	    loader.useLoadConfig(factory.create(ListLoadConfig.class).as());
	    	     
	    	    DestinationProperties props = GWT.create(DestinationProperties.class);
	    	     
	    	    ListStore<Destination> store = new ListStore<Destination>(props.key());
	    	    loader.addLoadHandler(new LoadResultListStoreBinding<ListLoadConfig, Destination, ListLoadResult<Destination>>(store));
	    	     
	    	    ColumnConfig<Destination, String> cc1 = new ColumnConfig<Destination, String>(props.name(), 100, "Flights");
	    	    ColumnConfig<Destination, String> cc2 = new ColumnConfig<Destination, String>(props.Destination(), 165, "Destination");
	    	    ColumnConfig<Destination, String> cc3 = new ColumnConfig<Destination, String>(props.Origin(), 100, "Origin");
	    	    ColumnConfig<Destination, String> cc4 = new ColumnConfig<Destination, String>(props.ETA(), 50, "ETA");
	    	    ColumnConfig<Destination, String> cc5 = new ColumnConfig<Destination, String>(props.zip(), 65, "Remarks");
	    	     
	    	    List<ColumnConfig<Destination, ?>> l = new ArrayList<ColumnConfig<Destination, ?>>();
	    	    l.add(cc1);
	    	    l.add(cc2);
	    	    l.add(cc3);
	    	    l.add(cc4);
	    	    l.add(cc5);
	    	    ColumnModel<Destination> cm = new ColumnModel<Destination>(l);
	    	 
	    	    Grid<Destination> grid = new Grid<Destination>(store, cm);
	    	    grid.getView().setForceFit(true);
	    	    grid.setLoader(loader);
	    	    grid.setLoadMask(true);
	    	    grid.setBorders(true);
	    	    grid.getView().setEmptyText("Airlines, Destination, Origin, Time, Remarks to be displayed here");
	    	     
	    	    FramedPanel cp = new FramedPanel();
	    	    cp.setHeadingText("Airport Information");
	    	    cp.setCollapsible(true);
	    	    cp.setAnimCollapse(true);
	    	    cp.setWidget(grid);
	    	    cp.setPixelSize(575, 350);
	    	    cp.addStyleName("margin-10");
	    	    cp.setButtonAlign(BoxLayoutPack.CENTER);
	    	    cp.addButton(new TextButton("Load Json", new SelectHandler() {
	    	    	
	    	    	@Override
	    	    	public void onSelect(SelectEvent event) {
	    	    		loader.load();
	    	    	}
	    	    }));
	    	     
	    	    return cp;
	    	    
	    	 }
	}
	    
	    NumberField<Integer> age = new NumberField<Integer>(new IntegerPropertyEditor());
	    age.addParseErrorHandler(new ParseErrorHandler() {
	
	    @Override
	    public void onParseError(ParseErrorEvent event) {
	    	Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a number");
	    }
	    }
	    });
	    age.setAllowBlank(false);
	 
		p.add(new FieldLabel(age, "Age"), new VerticalLayoutData(1, -1));*/
	 /*
	    StockProperties props = GWT.create(StockProperties.class);
	    ListStore<Stock> store = new ListStore<Stock>(props.key());
	    store.addAll(TestData.getStocks());
	 
	    ComboBox<Stock> combo = new ComboBox<Stock>(store, props.nameLabel());
	    combo.addValueChangeHandler(new ValueChangeHandler<Stock>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Stock> event) {
	        Info.display("Selected", "You selected " + event.getValue());
	      }
	    });
	    combo.setAllowBlank(true);
	    combo.setForceSelection(true);
	    combo.setTriggerAction(TriggerAction.ALL);
	    
	    p.add(new FieldLabel(combo, "Company"), new VerticalLayoutData(1, -1));
	 
	    
	 
	    DateField date = new DateField();
	    date.addParseErrorHandler(new ParseErrorHandler() {
	 
	      @Override
	      public void onParseError(ParseErrorEvent event) {
	        Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a date");
	      }
	    });
	 
	    date.addValueChangeHandler(new ValueChangeHandler<Date>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Date> event) {
	        String v = event.getValue() == null ? "nothing"
	            : DateTimeFormat.getFormat(PredefinedFormat.DATE_MEDIUM).format(event.getValue());
	        Info.display("Selected", "You selected " + v);
	 
	      }
	    });
	    date.addValidator(new MinDateValidator(new Date()));
	    p.add(new FieldLabel(date, "Birthday"), new VerticalLayoutData(1, -1));
	 
	    TimeField time = new TimeField();
	    time.addParseErrorHandler(new ParseErrorHandler() {
	 
	      @Override
	      public void onParseError(ParseErrorEvent event) {
	        Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a valid time");
	      }
	    });
	 
	    time.setMinValue(new DateWrapper().clearTime().addHours(8).asDate());
	    time.setMaxValue(new DateWrapper().clearTime().addHours(18).addSeconds(1).asDate());
	    p.add(new FieldLabel(time, "Time"), new VerticalLayoutData(1, -1));
	 
	    Slider slider = new Slider();
	    slider.setMinValue(40);
	    slider.setMaxValue(90);
	    slider.setValue(0);
	    slider.setIncrement(5);
	    slider.setMessage("{0} inches tall");
	    p.add(new FieldLabel(slider, "Size"), new VerticalLayoutData(1, -1));
	     
	    ValueChangeHandler<Boolean> musicHandler = new ValueChangeHandler<Boolean>() {
	       
	      @Override
	      public void onValueChange(ValueChangeEvent<Boolean> event) {
	        CheckBox check = (CheckBox)event.getSource();
	        Info.display("Music Changed", check.getBoxLabel() + " " + (event.getValue() ? "selected" : "not selected"));
	      }
	    };
	 
	    CheckBox check1 = new CheckBox();
	    check1.setEnabled(false);
	    check1.setBoxLabel("Classical");
	    check1.addValueChangeHandler(musicHandler);
	 
	    CheckBox check2 = new CheckBox();
	    check2.setBoxLabel("Rock");
	    check2.addValueChangeHandler(musicHandler);
	    check2.setValue(true);
	 
	    CheckBox check3 = new CheckBox();
	    check3.setBoxLabel("Blues");
	    check3.addValueChangeHandler(musicHandler);
	 
	    HorizontalPanel hp = new HorizontalPanel();
	    hp.add(check1);
	    hp.add(check2);
	    hp.add(check3);
	 
	    p.add(new FieldLabel(hp, "Music"));
	 
	    Radio radio = new Radio();
	    radio.setBoxLabel("Red");
	 
	    Radio radio2 = new Radio();
	    radio2.setBoxLabel("Blue");
	    radio2.setValue(true);
	 
	    hp = new HorizontalPanel();
	    hp.add(radio);
	    hp.add(radio2);
	 
	    p.add(new FieldLabel(hp, "Color"));
	 
	    // we can set name on radios or use toggle group
	    ToggleGroup toggle = new ToggleGroup();
	    toggle.add(radio);
	    toggle.add(radio2);
	    toggle.addValueChangeHandler(new ValueChangeHandler<HasValue<Boolean>>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<HasValue<Boolean>> event) {
	        ToggleGroup group = (ToggleGroup)event.getSource();
	        Radio radio = (Radio)group.getValue();
	        Info.display("Color Changed", "You selected " + radio.getBoxLabel());
	      }
	    });
	 
	    TextArea description = new TextArea();
	    description.setAllowBlank(false);
	    description.addValidator(new MinLengthValidator(10));
	    p.add(new FieldLabel(description, "Description"), new VerticalLayoutData(1, 100));
	 
	    final SpinnerField<Double> spinnerField = new SpinnerField<Double>(new DoublePropertyEditor());
	    spinnerField.setIncrement(.1d);
	    spinnerField.setMinValue(-10d);
	    spinnerField.setMaxValue(10d);
	    spinnerField.setAllowNegative(true);
	    spinnerField.setAllowBlank(false);
	    spinnerField.getPropertyEditor().setFormat(NumberFormat.getFormat("0.0"));
	    spinnerField.addValueChangeHandler(new ValueChangeHandler<Double>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Double> event) {
	        Info.display("Duration Changed",
	            "Duration changed to " + event.getValue() == null ? "nothing" : event.getValue() + "");
	      }
	    });
	    spinnerField.addSelectionHandler(new SelectionHandler<Double>() {
	 
	      @Override
	      public void onSelection(SelectionEvent<Double> event) {
	        String msg = "nothing";
	        if (event.getSelectedItem() != null) {
	          msg = spinnerField.getPropertyEditor().render(event.getSelectedItem());
	        }
	 
	        Info.display("Spin Change", "Current value changed to " + msg);
	      }
	    });*/
	 
	  /*  Label spinLabel = new Label("Role");
	 
	    p.add(spinLabel, new VerticalLayoutData(1, -1));
	 
	    panel.addButton(new TextButton("Pilot"));
	    panel.addButton(new TextButton("Dispatcher"));
	    panel.addButton(new TextButton("Controller"));
	    vp.add(panel);
	  /*}
	 
	 /* private void createForm2() {
	    FramedPanel form2 = new FramedPanel();
	    form2.setHeadingText("Simple Form with FieldSets");
	    form2.setWidth(350);
	 
	    FieldSet fieldSet = new FieldSet();
	    fieldSet.setHeadingText("User Information");
	    fieldSet.setCollapsible(true);
	    form2.add(fieldSet);
	 
	    VerticalLayoutContainer p = new VerticalLayoutContainer();
	    fieldSet.add(p);
	 
	    TextField firstName = new TextField();
	    firstName.setAllowBlank(false);
	    p.add(new FieldLabel(firstName, "Origin"), new VerticalLayoutData(1, -1));
	 
	    TextField lastName= new TextField();
	    lastName.setAllowBlank(false);
	    p.add(new FieldLabel(lastName, "Destination"), new VerticalLayoutData(1, -1));
	 
	    /*TextField Destination = new TextField();
	    Destination.setAllowBlank(false);
	    p.add(new FieldLabel(Destination, "Destination"), new VerticalLayoutData(1, -1));
	 
	    form2.addButton(new TextButton("Pilot"));
	    form2.addButton(new TextButton("Dispatcher"));
	    form2.addButton(new TextButton("Controller"));
	    vp.add(form2);*/
	  }
}

