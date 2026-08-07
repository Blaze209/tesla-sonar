package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface l<T extends View> extends com.facebook.react.uimanager.r1 {
    void setAnimated(T t11, boolean z11);

    void setAnimationType(T t11, String str);

    void setHardwareAccelerated(T t11, boolean z11);

    void setIdentifier(T t11, int i11);

    void setNavigationBarTranslucent(T t11, boolean z11);

    void setPresentationStyle(T t11, String str);

    void setStatusBarTranslucent(T t11, boolean z11);

    void setSupportedOrientations(T t11, ReadableArray readableArray);

    void setTransparent(T t11, boolean z11);

    void setVisible(T t11, boolean z11);
}
