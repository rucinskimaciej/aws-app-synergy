package online.rumac.pages.menu.view;

public enum Menu {

    HOME("Home"),
    WEB("WebView"),
    NATIVE_COMPONENTS("Native Components"),
    INPUT_CONTROLS("Input Controls"),
    NESTED_VIEWS("Nested Views"),
    CRASH_BUG("Crash/Bug"),
    ALERTS("Alerts"),
    LOGIN_PAGE("Login Page"),
    LOCAL_WEB_VIEW("Local WebView View"),
    FIXTURES("Fixtures"),
    SUPPLEMENTAL_UPLOADS("Supplemental Uploads");

    private final String field;
    Menu(String field) {
        this.field = field;
    }

    public static String getXpath(int i) {
        return "(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[" + i + "]";
    }

    public static int ofIndex(Menu menuItem) {
        return valueOf(menuItem.toString()).ordinal() + 1;
    }

    public String getField() {
        return field;
    }
}
