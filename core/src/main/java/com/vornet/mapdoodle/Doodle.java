package com.vornet.mapdoodle;

/**
 * Created by Vorn on 7/3/2016.
 */

public interface Doodle {
    void draw(DoodleContext context);
    GeoPoint[] getPoints();
    GeoPoint[] getBounds();
    String getId();
    void remove();
}
