package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface r0<T extends View> {
    void setClipPath(T t11, String str);

    void setClipRule(T t11, int i11);

    void setDisplay(T t11, String str);

    void setMarkerEnd(T t11, String str);

    void setMarkerMid(T t11, String str);

    void setMarkerStart(T t11, String str);

    void setMask(T t11, String str);

    void setMatrix(T t11, ReadableArray readableArray);

    void setName(T t11, String str);

    void setPointerEvents(T t11, String str);

    void setResponsible(T t11, boolean z11);
}
