package com.reactnativeauto;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

/**
 * A screen that shows a simple "Hello World!" message.
 *
 * <p>See {@link AutoService} for the app's entry point to the car host.
 */
public class AutoScreen extends Screen {
  public AutoScreen(@NonNull CarContext carContext) {
    super(carContext);
  }

  @NonNull
  @Override
  public Template onGetTemplate() {
    Row row = new Row.Builder().setTitle("Hello AndroidX!").build();
    return new PaneTemplate.Builder(new Pane.Builder().addRow(row).build())
      .setHeaderAction(Action.APP_ICON)
      .build();
  }
}
