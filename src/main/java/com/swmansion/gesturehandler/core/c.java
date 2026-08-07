package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 @2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0010R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010!R\u0016\u00106\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010!R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010-R\u0011\u0010?\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/swmansion/gesturehandler/core/c;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/view/MotionEvent;", "ev", "", "excludePointer", "Lkotlin/Pair;", "", "W0", "(Landroid/view/MotionEvent;Z)Lkotlin/Pair;", "Ljn0/h0;", "s0", "()V", "event", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "", "newState", "previousState", "p0", "(II)V", "prevState", "w", "v", "(Landroid/view/MotionEvent;)V", "o0", "", Gender.OTHER, "J", "getMinDurationMs", "()J", "a1", "(J)V", "minDurationMs", "P", Gender.FEMALE, "defaultMaxDist", "Q", "maxDist", "R", "I", "numberOfPointersRequired", "S", "startX", "T", "startY", Gender.UNKNOWN, "startTime", "V", "previousTime", "Landroid/os/Handler;", "W", "Landroid/os/Handler;", "handler", "X", "currentPointers", "Y0", "()I", "duration", "Y", "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends GestureHandler {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private long minDurationMs;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final float defaultMaxDist;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private float maxDist;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int numberOfPointersRequired;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private long previousTime;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private int currentPointers;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/c$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/c;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/c;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/d;", "h", "(Lcom/swmansion/gesturehandler/core/c;)Lz90/d;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends GestureHandler.b<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<c> type = c.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<c> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c a(Context context) {
            s.h(context);
            return new c(context);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.d c(c handler) {
            s.k(handler, "handler");
            return new z90.d(handler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(c handler, ReadableMap config) {
            s.k(handler, "handler");
            s.k(config, "config");
            super.f(handler, config);
            if (config.hasKey("minDurationMs")) {
                handler.a1(config.getInt("minDurationMs"));
            }
            if (config.hasKey("maxDist")) {
                handler.maxDist = w.g(config.getDouble("maxDist"));
            }
            if (config.hasKey("numberOfPointers")) {
                handler.D0(config.getInt("numberOfPointers"));
            }
        }
    }

    public c(Context context) {
        s.k(context, "context");
        this.minDurationMs = 500L;
        G0(true);
        float f11 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.defaultMaxDist = f11;
        this.maxDist = f11;
        this.numberOfPointersRequired = 1;
    }

    private final Pair<Float, Float> W0(MotionEvent ev2, boolean excludePointer) {
        if (excludePointer) {
            int pointerCount = ev2.getPointerCount();
            float x11 = BitmapDescriptorFactory.HUE_RED;
            float y11 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != ev2.getActionIndex()) {
                    x11 += ev2.getX(i11);
                    y11 += ev2.getY(i11);
                }
            }
            return new Pair<>(Float.valueOf(x11 / (ev2.getPointerCount() - 1)), Float.valueOf(y11 / (ev2.getPointerCount() - 1)));
        }
        bo0.j jVarW = n.w(0, ev2.getPointerCount());
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(ev2.getX(((s0) it).nextInt())));
        }
        float fF0 = (float) v.f0(arrayList);
        bo0.j jVarW2 = n.w(0, ev2.getPointerCount());
        ArrayList arrayList2 = new ArrayList(v.y(jVarW2, 10));
        Iterator<Integer> it2 = jVarW2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(ev2.getY(((s0) it2).nextInt())));
        }
        return new Pair<>(Float.valueOf(fF0), Float.valueOf((float) v.f0(arrayList2)));
    }

    static /* synthetic */ Pair X0(c cVar, MotionEvent motionEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return cVar.W0(motionEvent, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(c cVar) {
        cVar.k();
    }

    public final int Y0() {
        return (int) (this.previousTime - this.startTime);
    }

    public final void a1(long j11) {
        this.minDurationMs = j11;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (getState() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.previousTime = jUptimeMillis;
                this.startTime = jUptimeMillis;
                p();
                Pair pairX0 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue = ((Number) pairX0.a()).floatValue();
                float fFloatValue2 = ((Number) pairX0.b()).floatValue();
                this.startX = fFloatValue;
                this.startY = fFloatValue2;
                this.currentPointers++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.currentPointers++;
                Pair pairX1 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue3 = ((Number) pairX1.a()).floatValue();
                float fFloatValue4 = ((Number) pairX1.b()).floatValue();
                this.startX = fFloatValue3;
                this.startY = fFloatValue4;
                if (this.currentPointers > this.numberOfPointersRequired) {
                    D();
                    this.currentPointers = 0;
                }
            }
            if (getState() == 2 && this.currentPointers == this.numberOfPointersRequired && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.handler = handler;
                long j11 = this.minDurationMs;
                if (j11 > 0) {
                    s.h(handler);
                    handler.postDelayed(new Runnable() { // from class: y90.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.swmansion.gesturehandler.core.c.Z0(this.f125307a);
                        }
                    }, this.minDurationMs);
                } else if (j11 == 0) {
                    k();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.currentPointers--;
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.handler = null;
                }
                if (getState() == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() == 6) {
                int i11 = this.currentPointers - 1;
                this.currentPointers = i11;
                if (i11 < this.numberOfPointersRequired && getState() != 4) {
                    D();
                    this.currentPointers = 0;
                    return;
                }
                Pair<Float, Float> pairW0 = W0(sourceEvent, true);
                float fFloatValue5 = pairW0.a().floatValue();
                float fFloatValue6 = pairW0.b().floatValue();
                this.startX = fFloatValue5;
                this.startY = fFloatValue6;
                return;
            }
            Pair pairX2 = X0(this, sourceEvent, false, 2, null);
            float fFloatValue7 = ((Number) pairX2.a()).floatValue();
            float fFloatValue8 = ((Number) pairX2.b()).floatValue();
            float f11 = fFloatValue7 - this.startX;
            float f12 = fFloatValue8 - this.startY;
            float f13 = (f11 * f11) + (f12 * f12);
            float f14 = this.maxDist;
            if (f13 > f14 * f14) {
                if (getState() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        super.o0();
        this.currentPointers = 0;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void p0(int newState, int previousState) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void s0() {
        super.s0();
        this.minDurationMs = 500L;
        this.maxDist = this.defaultMaxDist;
        G0(true);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void v(MotionEvent event) {
        s.k(event, "event");
        this.previousTime = SystemClock.uptimeMillis();
        super.v(event);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void w(int newState, int prevState) {
        this.previousTime = SystemClock.uptimeMillis();
        super.w(newState, prevState);
    }
}
