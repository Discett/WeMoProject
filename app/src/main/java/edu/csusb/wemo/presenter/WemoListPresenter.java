package edu.csusb.wemo.presenter;

import edu.csusb.wemo.view.WemoListView;

/**
 * Created by Josiah on 2/21/2017.
 */

public interface WemoListPresenter extends Presenter<WemoListView> {


    void initializeDevices();
}
