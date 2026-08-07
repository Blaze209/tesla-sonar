package vo;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface d2<T extends View> {
    void setClipPath(T t11, String str);

    void setClipRule(T t11, int i11);

    void setCx(T t11, Dynamic dynamic);

    void setCy(T t11, Dynamic dynamic);

    void setDisplay(T t11, String str);

    void setFx(T t11, Dynamic dynamic);

    void setFy(T t11, Dynamic dynamic);

    void setGradient(T t11, ReadableArray readableArray);

    void setGradientTransform(T t11, ReadableArray readableArray);

    void setGradientUnits(T t11, int i11);

    void setMarkerEnd(T t11, String str);

    void setMarkerMid(T t11, String str);

    void setMarkerStart(T t11, String str);

    void setMask(T t11, String str);

    void setMatrix(T t11, ReadableArray readableArray);

    void setName(T t11, String str);

    void setPointerEvents(T t11, String str);

    void setResponsible(T t11, boolean z11);

    void setRx(T t11, Dynamic dynamic);

    void setRy(T t11, Dynamic dynamic);
}
