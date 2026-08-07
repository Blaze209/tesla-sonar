package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import vo.b;

/* JADX INFO: loaded from: classes4.dex */
public class a<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & b<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
            ((b) this.mViewManager).closeDrawer(t11);
        } else if (str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
            ((b) this.mViewManager).openDrawer(t11);
        }
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "statusBarBackgroundColor":
                ((b) this.mViewManager).setStatusBarBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "drawerBackgroundColor":
                ((b) this.mViewManager).setDrawerBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "keyboardDismissMode":
                ((b) this.mViewManager).setKeyboardDismissMode(t11, (String) obj);
                break;
            case "drawerWidth":
                ((b) this.mViewManager).setDrawerWidth(t11, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                break;
            case "drawerPosition":
                ((b) this.mViewManager).setDrawerPosition(t11, (String) obj);
                break;
            case "drawerLockMode":
                ((b) this.mViewManager).setDrawerLockMode(t11, (String) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
