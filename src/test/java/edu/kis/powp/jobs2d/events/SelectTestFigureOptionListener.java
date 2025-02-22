package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Figure Joe 2": {
                DrawerFeature.getDrawerController().clearPanel();
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            }
            default: {
                DrawerFeature.getDrawerController().clearPanel();
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            }
        }
    }
}
