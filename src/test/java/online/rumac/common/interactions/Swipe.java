package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import javafx.geometry.Point2D;

import java.awt.Dimension;

public class Swipe {

    private final MobileDriver driver;
    private final ScreenDimensions screenDimensions;

    public Swipe(MobileDriver driver) {
        this.driver = driver;
        screenDimensions = new ScreenDimensions(driver);
    }

    public void right() {
        swipeFromCenterTo(screenDimensions.leftEdgeOffset);
    }

    public void left() {
        swipeFromCenterTo(screenDimensions.rightEdgeOffset);
    }

    public void up() {
        swipeFromCenterTo(screenDimensions.downEdgeOffset);
    }

    public void down () {
        swipeFromCenterTo(screenDimensions.upEdgeOffset);
    }

    private void swipeFromCenterTo(Point2D edge) {
        driver.screen().scroll(1, 100,
                (int) screenDimensions.center.getX(), (int) screenDimensions.center.getY(),
                (int) edge.getX(), (int) edge.getY());
    }
}
