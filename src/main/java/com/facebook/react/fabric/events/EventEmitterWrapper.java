package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0003¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "", "eventName", "Lcom/facebook/react/bridge/NativeMap;", "params", "", "category", "Ljn0/h0;", "dispatchEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;I)V", "dispatchEventSynchronously", "(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V", "dispatchUniqueEvent", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "dispatch", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;I)V", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "dispatchUnique", "destroy", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
public final class EventEmitterWrapper extends HybridClassBase {
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    private EventEmitterWrapper() {
    }

    private final native void dispatchEvent(String eventName, NativeMap params, int category);

    private final native void dispatchEventSynchronously(String eventName, NativeMap params);

    private final native void dispatchUniqueEvent(String eventName, NativeMap params);

    public final synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatch(String eventName, WritableMap params, int eventCategory) {
        s.k(eventName, "eventName");
        if (isValid()) {
            dispatchEvent(eventName, (NativeMap) params, eventCategory);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchEventSynchronously(String eventName, WritableMap params) {
        s.k(eventName, "eventName");
        if (isValid()) {
            UiThreadUtil.assertOnUiThread();
            dispatchEventSynchronously(eventName, (NativeMap) params);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchUnique(String eventName, WritableMap params) {
        s.k(eventName, "eventName");
        if (isValid()) {
            dispatchUniqueEvent(eventName, (NativeMap) params);
        }
    }
}
