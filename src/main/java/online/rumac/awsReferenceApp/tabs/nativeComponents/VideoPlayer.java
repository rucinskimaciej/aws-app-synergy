package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public class VideoPlayer extends NativeComponentsView {

    private MobileElement videoElement;

    public VideoPlayer(MobileDriver driver) {
        super(driver);
        String idLocator = "com.amazonaws.devicefarm.android.referenceapp:id/native_video_player";
        videoElement = supplyElementBy("ID", idLocator);
    }

    public boolean isDisplayed() {
        return videoElement.isDisplayed();
    }

    public boolean isPlaying() {
        return videoElement.isEnabled();
    }

    public MobileElement getVideoElement() {
        return videoElement;
    }

    @Override
    protected void goToView() {
        scroll().right(2);
    }
}
