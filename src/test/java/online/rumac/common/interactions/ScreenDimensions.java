package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import javafx.geometry.Point2D;

import java.awt.*;

public class ScreenDimensions {

    public final MobileDriver driver;
    public final Dimension dimension;
    public final Point2D center;
    public final Point2D rightEdgeOffset;
    public final Point2D leftEdgeOffset;
    public final Point2D upEdgeOffset;
    public final Point2D downEdgeOffset;

    public ScreenDimensions(MobileDriver driver) {
        this.driver = driver;
        dimension = driver.screen().getSize();
        center = new Point2D(dimension.getWidth() / 2, dimension.getHeight() / 2);
        rightEdgeOffset = new Point2D(dimension.getWidth() - 10, dimension.getHeight() / 2);
        leftEdgeOffset = new Point2D(10, dimension.getHeight() / 2);
        upEdgeOffset = new Point2D(dimension.getWidth() / 2, 10);
        downEdgeOffset = new Point2D(dimension.getWidth() / 2, dimension.getHeight() - 10);
    }
}
