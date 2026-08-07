package vo;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface n1<T extends View> {
    void setClipPath(T t11, String str);

    void setClipRule(T t11, int i11);

    void setColor(T t11, Integer num);

    void setDisplay(T t11, String str);

    void setFill(T t11, Dynamic dynamic);

    void setFillOpacity(T t11, float f11);

    void setFillRule(T t11, int i11);

    void setFilter(T t11, String str);

    void setFont(T t11, Dynamic dynamic);

    void setFontSize(T t11, Dynamic dynamic);

    void setFontWeight(T t11, Dynamic dynamic);

    void setMarkerEnd(T t11, String str);

    void setMarkerMid(T t11, String str);

    void setMarkerStart(T t11, String str);

    void setMask(T t11, String str);

    void setMatrix(T t11, ReadableArray readableArray);

    void setName(T t11, String str);

    void setPointerEvents(T t11, String str);

    void setPropList(T t11, ReadableArray readableArray);

    void setResponsible(T t11, boolean z11);

    void setStroke(T t11, Dynamic dynamic);

    void setStrokeDasharray(T t11, Dynamic dynamic);

    void setStrokeDashoffset(T t11, float f11);

    void setStrokeLinecap(T t11, int i11);

    void setStrokeLinejoin(T t11, int i11);

    void setStrokeMiterlimit(T t11, float f11);

    void setStrokeOpacity(T t11, float f11);

    void setStrokeWidth(T t11, Dynamic dynamic);

    void setVectorEffect(T t11, int i11);
}
