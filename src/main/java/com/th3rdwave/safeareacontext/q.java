package com.th3rdwave.safeareacontext;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/th3rdwave/safeareacontext/a;", "insets", "Lcom/facebook/react/bridge/WritableMap;", "b", "(Lcom/th3rdwave/safeareacontext/a;)Lcom/facebook/react/bridge/WritableMap;", "", "", "", "a", "(Lcom/th3rdwave/safeareacontext/a;)Ljava/util/Map;", "Lcom/th3rdwave/safeareacontext/c;", "rect", DateTokenConverter.CONVERTER_KEY, "(Lcom/th3rdwave/safeareacontext/c;)Lcom/facebook/react/bridge/WritableMap;", "c", "(Lcom/th3rdwave/safeareacontext/c;)Ljava/util/Map;", "react-native-safe-area-context_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {
    public static final Map<String, Float> a(EdgeInsets insets) {
        s.k(insets, "insets");
        return v0.m(x.a("top", Float.valueOf(w.f(insets.getTop()))), x.a("right", Float.valueOf(w.f(insets.getRight()))), x.a("bottom", Float.valueOf(w.f(insets.getBottom()))), x.a("left", Float.valueOf(w.f(insets.getLeft()))));
    }

    public static final WritableMap b(EdgeInsets insets) {
        s.k(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", w.f(insets.getTop()));
        writableMapCreateMap.putDouble("right", w.f(insets.getRight()));
        writableMapCreateMap.putDouble("bottom", w.f(insets.getBottom()));
        writableMapCreateMap.putDouble("left", w.f(insets.getLeft()));
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final Map<String, Float> c(Rect rect) {
        s.k(rect, "rect");
        return v0.m(x.a("x", Float.valueOf(w.f(rect.getX()))), x.a("y", Float.valueOf(w.f(rect.getY()))), x.a(Snapshot.WIDTH, Float.valueOf(w.f(rect.getWidth()))), x.a(Snapshot.HEIGHT, Float.valueOf(w.f(rect.getHeight()))));
    }

    public static final WritableMap d(Rect rect) {
        s.k(rect, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", w.f(rect.getX()));
        writableMapCreateMap.putDouble("y", w.f(rect.getY()));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, w.f(rect.getWidth()));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, w.f(rect.getHeight()));
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
