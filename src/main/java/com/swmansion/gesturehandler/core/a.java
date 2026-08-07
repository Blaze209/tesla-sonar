package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0003R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/swmansion/gesturehandler/core/a;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "a1", "(Landroid/view/MotionEvent;)V", "", "b1", "(Landroid/view/MotionEvent;)Z", "W0", "Landroid/view/VelocityTracker;", "tracker", "V0", "(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V", "s0", "force", "l", "(Z)V", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "j0", "o0", "", Gender.OTHER, "I", "getNumberOfPointersRequired", "()I", "Z0", "(I)V", "numberOfPointersRequired", "P", "getDirection", "Y0", "direction", "", "Q", "J", "maxDurationMs", "R", "minVelocity", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "handler", "T", "maxNumberOfPointersSimultaneously", "Ljava/lang/Runnable;", Gender.UNKNOWN, "Ljava/lang/Runnable;", "failDelayed", "V", "Landroid/view/VelocityTracker;", "velocityTracker", "W", "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends GestureHandler {
    private static final double X;
    private static final double Y;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int maxNumberOfPointersSimultaneously;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private int numberOfPointersRequired = 1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private int direction = 1;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long maxDurationMs = 800;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final long minVelocity = 2000;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final Runnable failDelayed = new Runnable() { // from class: y90.a
        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.core.a.X0(this.f125283a);
        }
    };

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/a$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/a;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/a;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/a;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/a;", "h", "(Lcom/swmansion/gesturehandler/core/a;)Lz90/a;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends GestureHandler.b<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<a> type = a.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<a> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            return new a();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.a c(a handler) {
            s.k(handler, "handler");
            return new z90.a(handler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(a handler, ReadableMap config) {
            s.k(handler, "handler");
            s.k(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfPointers")) {
                handler.Z0(config.getInt("numberOfPointers"));
            }
            if (config.hasKey("direction")) {
                handler.Y0(config.getInt("direction"));
            }
        }
    }

    static {
        y90.i iVar = y90.i.f125305a;
        X = iVar.a(30.0d);
        Y = iVar.a(60.0d);
    }

    private final void V0(VelocityTracker tracker, MotionEvent event) {
        float rawX = event.getRawX() - event.getX();
        float rawY = event.getRawY() - event.getY();
        event.offsetLocation(rawX, rawY);
        s.h(tracker);
        tracker.addMovement(event);
        event.offsetLocation(-rawX, -rawY);
    }

    private final void W0(MotionEvent event) {
        if (b1(event)) {
            return;
        }
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(a aVar) {
        aVar.D();
    }

    private final void a1(MotionEvent event) {
        this.velocityTracker = VelocityTracker.obtain();
        p();
        this.maxNumberOfPointersSimultaneously = 1;
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

    private final boolean b1(MotionEvent event) {
        boolean z11;
        boolean z12;
        V0(this.velocityTracker, event);
        m.Companion companion = m.INSTANCE;
        VelocityTracker velocityTracker = this.velocityTracker;
        s.h(velocityTracker);
        m mVarB = companion.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.add(Boolean.valueOf(c1(this, mVarB, numArr[i11].intValue(), X)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i12 = 0; i12 < 4; i12++) {
            arrayList2.add(Boolean.valueOf(c1(this, mVarB, numArr2[i12].intValue(), Y)));
        }
        if (arrayList.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (((Boolean) it.next()).booleanValue()) {
                z11 = true;
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z12 = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = false;
                break;
            }
            if (((Boolean) it2.next()).booleanValue()) {
                z12 = true;
                break;
            }
        }
        boolean z13 = z11 | z12;
        boolean z14 = mVarB.getMagnitude() > ((double) this.minVelocity);
        if (this.maxNumberOfPointersSimultaneously != this.numberOfPointersRequired || !z13 || !z14) {
            return false;
        }
        Handler handler = this.handler;
        s.h(handler);
        handler.removeCallbacksAndMessages(null);
        k();
        return true;
    }

    private static final boolean c1(a aVar, m mVar, int i11, double d11) {
        return (aVar.direction & i11) == i11 && mVar.l(m.INSTANCE.a(i11), d11);
    }

    public final void Y0(int i11) {
        this.direction = i11;
    }

    public final void Z0(int i11) {
        this.numberOfPointersRequired = i11;
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
            if (state == 0) {
                a1(sourceEvent);
            }
            if (state == 2) {
                b1(sourceEvent);
                if (sourceEvent.getPointerCount() > this.maxNumberOfPointersSimultaneously) {
                    this.maxNumberOfPointersSimultaneously = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    W0(sourceEvent);
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void s0() {
        super.s0();
        this.numberOfPointersRequired = 1;
        this.direction = 1;
    }
}
