package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0017R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0017R\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0017R\u0016\u00104\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0017R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0017R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010%R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/swmansion/gesturehandler/core/l;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Ljn0/h0;", "f1", "c1", "", "e1", "()Z", "s0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "force", "l", "(Z)V", "j0", "o0", "", Gender.OTHER, Gender.FEMALE, "maxDeltaX", "P", "maxDeltaY", "Q", "maxDist", "", "R", "J", "maxDurationMs", "S", "maxDelayMs", "", "T", "I", "numberOfTaps", Gender.UNKNOWN, "minNumberOfPointers", "V", "currentMaxNumberOfPointers", "W", "startX", "X", "startY", "Y", "offsetX", "Z", "offsetY", "a0", "lastX", "b0", "lastY", "Landroid/os/Handler;", "c0", "Landroid/os/Handler;", "handler", "d0", "tapsSoFar", "Ljava/lang/Runnable;", "e0", "Ljava/lang/Runnable;", "failDelayed", "f0", "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends GestureHandler {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private float offsetX;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private float offsetY;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private float lastY;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private int tapsSoFar;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private float maxDeltaX = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private float maxDeltaY = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private float maxDist = Float.MIN_VALUE;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private long maxDurationMs = 500;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private long maxDelayMs = 200;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int numberOfTaps = 1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private int minNumberOfPointers = 1;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private int currentMaxNumberOfPointers = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final Runnable failDelayed = new Runnable() { // from class: y90.o
        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.core.l.d1(this.f125309a);
        }
    };

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/l$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/l;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/l;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/l;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/j;", "h", "(Lcom/swmansion/gesturehandler/core/l;)Lz90/j;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends GestureHandler.b<l> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<l> type = l.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<l> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public l a(Context context) {
            return new l();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.j c(l handler) {
            s.k(handler, "handler");
            return new z90.j(handler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(l handler, ReadableMap config) {
            s.k(handler, "handler");
            s.k(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfTaps")) {
                handler.numberOfTaps = config.getInt("numberOfTaps");
            }
            if (config.hasKey("maxDurationMs")) {
                handler.maxDurationMs = config.getInt("maxDurationMs");
            }
            if (config.hasKey("maxDelayMs")) {
                handler.maxDelayMs = config.getInt("maxDelayMs");
            }
            if (config.hasKey("maxDeltaX")) {
                handler.maxDeltaX = w.g(config.getDouble("maxDeltaX"));
            }
            if (config.hasKey("maxDeltaY")) {
                handler.maxDeltaY = w.g(config.getDouble("maxDeltaY"));
            }
            if (config.hasKey("maxDist")) {
                handler.maxDist = w.g(config.getDouble("maxDist"));
            }
            if (config.hasKey("minPointers")) {
                handler.minNumberOfPointers = config.getInt("minPointers");
            }
        }
    }

    public l() {
        G0(true);
    }

    private final void c1() {
        Handler handler = this.handler;
        if (handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        } else {
            s.h(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i11 = this.tapsSoFar + 1;
        this.tapsSoFar = i11;
        if (i11 == this.numberOfTaps && this.currentMaxNumberOfPointers >= this.minNumberOfPointers) {
            k();
            return;
        }
        Handler handler2 = this.handler;
        s.h(handler2);
        handler2.postDelayed(this.failDelayed, this.maxDelayMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(l lVar) {
        lVar.D();
    }

    private final boolean e1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        if (this.maxDeltaX != Float.MIN_VALUE && Math.abs(f11) > this.maxDeltaX) {
            return true;
        }
        float f12 = (this.lastY - this.startY) + this.offsetY;
        if (this.maxDeltaY != Float.MIN_VALUE && Math.abs(f12) > this.maxDeltaY) {
            return true;
        }
        float f13 = (f12 * f12) + (f11 * f11);
        float f14 = this.maxDist;
        return f14 != Float.MIN_VALUE && f13 > f14 * f14;
    }

    private final void f1() {
        Handler handler = this.handler;
        if (handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        } else {
            s.h(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.handler;
        s.h(handler2);
        handler2.postDelayed(this.failDelayed, this.maxDurationMs);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void j0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void l(boolean force) {
        super.l(force);
        B();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int state = getState();
            int actionMasked = sourceEvent.getActionMasked();
            if (state == 0) {
                this.offsetX = BitmapDescriptorFactory.HUE_RED;
                this.offsetY = BitmapDescriptorFactory.HUE_RED;
                y90.i iVar = y90.i.f125305a;
                this.startX = iVar.b(sourceEvent, true);
                this.startY = iVar.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                y90.i iVar2 = y90.i.f125305a;
                this.lastX = iVar2.b(sourceEvent, true);
                float fC = iVar2.c(sourceEvent, true);
                this.lastY = fC;
                this.startX = this.lastX;
                this.startY = fC;
            } else {
                y90.i iVar3 = y90.i.f125305a;
                this.lastX = iVar3.b(sourceEvent, true);
                this.lastY = iVar3.c(sourceEvent, true);
            }
            if (this.currentMaxNumberOfPointers < sourceEvent.getPointerCount()) {
                this.currentMaxNumberOfPointers = sourceEvent.getPointerCount();
            }
            if (e1()) {
                D();
                return;
            }
            if (state == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
                return;
            }
            if (state == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        this.tapsSoFar = 0;
        this.currentMaxNumberOfPointers = 0;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void s0() {
        super.s0();
        this.maxDeltaX = Float.MIN_VALUE;
        this.maxDeltaY = Float.MIN_VALUE;
        this.maxDist = Float.MIN_VALUE;
        this.maxDurationMs = 500L;
        this.maxDelayMs = 200L;
        this.numberOfTaps = 1;
        this.minNumberOfPointers = 1;
        G0(true);
    }
}
