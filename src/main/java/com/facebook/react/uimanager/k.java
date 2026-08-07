package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f23324e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23320a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f23321b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23322c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23323d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.facebook.react.uimanager.events.r f23325f = new com.facebook.react.uimanager.events.r();

    public k(ViewGroup viewGroup) {
        this.f23324e = viewGroup;
    }

    private void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f23320a == -1) {
            qk.a.I("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        gn.a.b(!this.f23322c, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) gn.a.c(eventDispatcher);
        int iF = b1.f(this.f23324e);
        int i11 = this.f23320a;
        com.facebook.react.uimanager.events.s sVar = com.facebook.react.uimanager.events.s.CANCEL;
        long j11 = this.f23323d;
        float[] fArr = this.f23321b;
        eventDispatcher2.h(com.facebook.react.uimanager.events.q.h(iF, i11, sVar, motionEvent, j11, fArr[0], fArr[1], this.f23325f));
    }

    private int b(MotionEvent motionEvent) {
        return w0.c(motionEvent.getX(), motionEvent.getY(), this.f23324e, this.f23321b, null);
    }

    private void e(int i11, int i12, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = b1.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.markActiveTouchForTag(i11, i12);
    }

    private void h(int i11, int i12, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = b1.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.sweepActiveTouchForTag(i11, i12);
    }

    public void c(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        d(motionEvent, eventDispatcher, null);
    }

    public void d(MotionEvent motionEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f23320a != -1) {
                qk.a.m("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f23322c = false;
            this.f23323d = motionEvent.getEventTime();
            this.f23320a = b(motionEvent);
            e(b1.f(this.f23324e), this.f23320a, reactContext);
            int iF = b1.f(this.f23324e);
            int i11 = this.f23320a;
            com.facebook.react.uimanager.events.s sVar = com.facebook.react.uimanager.events.s.START;
            long j11 = this.f23323d;
            float[] fArr = this.f23321b;
            eventDispatcher.h(com.facebook.react.uimanager.events.q.h(iF, i11, sVar, motionEvent, j11, fArr[0], fArr[1], this.f23325f));
            return;
        }
        if (this.f23322c) {
            return;
        }
        if (this.f23320a == -1) {
            qk.a.m("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            b(motionEvent);
            int iF2 = b1.f(this.f23324e);
            int i12 = this.f23320a;
            com.facebook.react.uimanager.events.s sVar2 = com.facebook.react.uimanager.events.s.END;
            long j12 = this.f23323d;
            float[] fArr2 = this.f23321b;
            eventDispatcher.h(com.facebook.react.uimanager.events.q.h(iF2, i12, sVar2, motionEvent, j12, fArr2[0], fArr2[1], this.f23325f));
            h(iF2, this.f23320a, reactContext);
            this.f23320a = -1;
            this.f23323d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            b(motionEvent);
            int iF3 = b1.f(this.f23324e);
            int i13 = this.f23320a;
            com.facebook.react.uimanager.events.s sVar3 = com.facebook.react.uimanager.events.s.MOVE;
            long j13 = this.f23323d;
            float[] fArr3 = this.f23321b;
            eventDispatcher.h(com.facebook.react.uimanager.events.q.h(iF3, i13, sVar3, motionEvent, j13, fArr3[0], fArr3[1], this.f23325f));
            return;
        }
        if (action == 5) {
            int iF4 = b1.f(this.f23324e);
            int i14 = this.f23320a;
            com.facebook.react.uimanager.events.s sVar4 = com.facebook.react.uimanager.events.s.START;
            long j14 = this.f23323d;
            float[] fArr4 = this.f23321b;
            eventDispatcher.h(com.facebook.react.uimanager.events.q.h(iF4, i14, sVar4, motionEvent, j14, fArr4[0], fArr4[1], this.f23325f));
            return;
        }
        if (action == 6) {
            int iF5 = b1.f(this.f23324e);
            int i15 = this.f23320a;
            com.facebook.react.uimanager.events.s sVar5 = com.facebook.react.uimanager.events.s.END;
            long j15 = this.f23323d;
            float[] fArr5 = this.f23321b;
            eventDispatcher.h(com.facebook.react.uimanager.events.q.h(iF5, i15, sVar5, motionEvent, j15, fArr5[0], fArr5[1], this.f23325f));
            return;
        }
        if (action == 3) {
            if (this.f23325f.c(motionEvent.getDownTime())) {
                a(motionEvent, eventDispatcher);
            } else {
                qk.a.m("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            h(b1.f(this.f23324e), this.f23320a, reactContext);
            this.f23320a = -1;
            this.f23323d = Long.MIN_VALUE;
            return;
        }
        qk.a.I("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f23320a);
    }

    public void f(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        this.f23322c = false;
    }

    public void g(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f23322c) {
            return;
        }
        a(motionEvent, eventDispatcher);
        this.f23322c = true;
        this.f23320a = -1;
    }
}
