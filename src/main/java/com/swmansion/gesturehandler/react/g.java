package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0003R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Lcom/swmansion/gesturehandler/react/g;", "Ly90/c;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", Action.KEY_ATTRIBUTE, "", "f", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)[I", "", "handlerTag", "Ljn0/h0;", "g", "(I)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "e", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "otherHandler", "", "a", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "b", DateTokenConverter.CONVERTER_KEY, "c", "h", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "waitForRelations", "simultaneousRelations", "blockingRelations", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements y90.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<int[]> waitForRelations = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<int[]> simultaneousRelations = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<int[]> blockingRelations = new SparseArray<>();

    private final int[] f(ReadableMap config, String key) {
        ReadableArray array = config.getArray(key);
        s.h(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = array.getInt(i11);
        }
        return iArr;
    }

    @Override // y90.c
    public boolean a(GestureHandler handler, GestureHandler otherHandler) {
        s.k(handler, "handler");
        s.k(otherHandler, "otherHandler");
        int[] iArr = this.waitForRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y90.c
    public boolean b(GestureHandler handler, GestureHandler otherHandler) {
        s.k(handler, "handler");
        s.k(otherHandler, "otherHandler");
        int[] iArr = this.blockingRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y90.c
    public boolean c(GestureHandler handler, GestureHandler otherHandler) {
        s.k(handler, "handler");
        s.k(otherHandler, "otherHandler");
        int[] iArr = this.simultaneousRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y90.c
    public boolean d(GestureHandler handler, GestureHandler otherHandler) {
        s.k(handler, "handler");
        s.k(otherHandler, "otherHandler");
        if (otherHandler instanceof com.swmansion.gesturehandler.core.e) {
            return ((com.swmansion.gesturehandler.core.e) otherHandler).getDisallowInterruption();
        }
        return otherHandler instanceof l.b;
    }

    public final void e(GestureHandler handler, ReadableMap config) {
        s.k(handler, "handler");
        s.k(config, "config");
        handler.A0(this);
        if (config.hasKey("waitFor")) {
            this.waitForRelations.put(handler.getTag(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.simultaneousRelations.put(handler.getTag(), f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.blockingRelations.put(handler.getTag(), f(config, "blocksHandlers"));
        }
    }

    public final void g(int handlerTag) {
        this.waitForRelations.remove(handlerTag);
        this.simultaneousRelations.remove(handlerTag);
    }

    public final void h() {
        this.waitForRelations.clear();
        this.simultaneousRelations.clear();
    }
}
