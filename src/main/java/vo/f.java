package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface f<T extends View> extends com.facebook.react.uimanager.r1 {
    void setColors(T t11, ReadableArray readableArray);

    void setEnabled(T t11, boolean z11);

    void setNativeRefreshing(T t11, boolean z11);

    void setProgressBackgroundColor(T t11, Integer num);

    void setProgressViewOffset(T t11, float f11);

    void setRefreshing(T t11, boolean z11);

    void setSize(T t11, String str);
}
