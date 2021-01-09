package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import javafx.geometry.Point2D;

import java.awt.*;

public class ScreenPoints {

    public final MobileDriver driver;
    public final Dimension dimension;
    public final Point2D center;
    public final Point2D rightEdgeOffset;
    public final Point2D leftEdgeOffset;
    public final Point2D upEdgeOffset;
    public final Point2D downEdgeOffset;

    public ScreenPoints(MobileDriver driver, int offset) {
        if (offset < 0) throw new IllegalArgumentException("Offset cannot be negative");
        this.driver = driver;
        dimension = driver.screen().getSize();
        center = new Point2D(dimension.getWidth() / 2, dimension.getHeight() / 2);
        rightEdgeOffset = new Point2D(dimension.getWidth() - offset, dimension.getHeight() / 2);
        leftEdgeOffset = new Point2D(offset, dimension.getHeight() / 2);
        upEdgeOffset = new Point2D(dimension.getWidth() / 2, offset);
        downEdgeOffset = new Point2D(dimension.getWidth() / 2, dimension.getHeight() - offset);
    }
}
