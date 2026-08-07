package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface j<T extends View> extends com.facebook.react.uimanager.r1 {
    void clearElementsHighlights(T t11);

    void highlightElements(T t11, ReadableArray readableArray);

    void highlightTraceUpdates(T t11, ReadableArray readableArray);
}
