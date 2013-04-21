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

import com.appstore.yorknodelays.shared.Flight;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat;
import com.google.gwt.user.client.ui.FlowPanel;
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
import com.sencha.gxt.widget.core.client.form.FormPanel.LabelAlign;
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
import com.sencha.gxt.data.client.editor.ListStoreEditor;
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
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FlightDetailsArrivals implements EntryPoint, IsWidget {
	
	private static final FlightProperties props = GWT.create(FlightProperties.class);
	private VerticalPanel vp;
	
	ListStore<Flight> flightStore = new ListStore<Flight>(props.id());
	ListStoreEditor<Flight> flights = new ListStoreEditor<Flight>(flightStore); 
	
	@Override
	public Widget asWidget() {
		
		FlowPanel container = new FlowPanel();
		
		FramedPanel panel = new FramedPanel();
	    panel.setHeadingText("Arrivals");
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
	    
	    /*Label
	    TextField Origin = new TextField();
	    Origin.setReadOnly(true);
	    Origin.setEmptyText("");
	    TextField Destination = new TextField();
	    Origin.setReadOnly(true);
	    Origin.setEmptyText("");
	    p.add(new FieldLabel(Origin, "Origin:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(Destination, "or Destination:"), new VerticalLayoutData(1, -1));
	 
	
	    // Search Button
	    
	    panel.addButton(new TextButton("Search"));
	    container.add(panel); */
	    
	    List<ColumnConfig<Flight, ?>> columns = new ArrayList<ColumnConfig<Flight,?>>();
	    ColumnConfig<Flight, String> name = new ColumnConfig<Flight, String>(props.flightId(), 200, "Fligt Name");
	    columns.add(name);
	    ColumnConfig<Flight, String> origin = new ColumnConfig<Flight, String>(props.origin(), 100, "Origin");
	    columns.add(origin);
	    ColumnConfig<Flight, String> destination = new ColumnConfig<Flight, String>(props.destination(), 100, "Destination");
	    columns.add(destination);
	    ColumnConfig<Flight, String> remarks = new ColumnConfig<Flight, String>(props.remarks(), 100, "Remarks");
	    columns.add(remarks);
	     
	    Grid<Flight> grid = new Grid<Flight>(flightStore, new ColumnModel<Flight>(columns));
	    grid.setBorders(true);
	     
	    grid.getView().setForceFit(true);
	    GridInlineEditing<Flight> inlineEditor = new GridInlineEditing<Flight>(grid);
	    
	    grid.setWidth(382);
	    grid.setHeight(200);
	     
	    FieldLabel flightContainer = new FieldLabel();
	    flightContainer.setText("Flights");
	    flightContainer.setLabelAlign(LabelAlign.TOP);
	    flightContainer.setWidget(grid);
	    container.add(flightContainer);   
	    return container;
	}

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
	}
}
