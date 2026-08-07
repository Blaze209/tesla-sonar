package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f55328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f55329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f55330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f55331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f55334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f55335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f55336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f55337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f55338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f55339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f55340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f55341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f55342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f55343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f55346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f55347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f55348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f55349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f55350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f55351x;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            j.this.f55347t = motionEvent.getX();
            j.this.f55348u = motionEvent.getY();
            j.this.f55349v = 1;
            return true;
        }
    }

    public interface b {
        void a(j jVar);

        boolean b(j jVar);

        boolean c(j jVar);
    }

    public j(Context context, b bVar) {
        this(context, bVar, null);
    }

    private boolean j() {
        return this.f55349v != 0;
    }

    public float d() {
        return this.f55334g;
    }

    public float e() {
        return this.f55330c;
    }

    public float f() {
        return this.f55331d;
    }

    public float g() {
        if (!j()) {
            float f11 = this.f55335h;
            if (f11 > BitmapDescriptorFactory.HUE_RED) {
                return this.f55334g / f11;
            }
            return 1.0f;
        }
        boolean z11 = this.f55351x;
        boolean z12 = (z11 && this.f55334g < this.f55335h) || (!z11 && this.f55334g > this.f55335h);
        float fAbs = Math.abs(1.0f - (this.f55334g / this.f55335h)) * 0.5f;
        if (this.f55335h <= this.f55344q) {
            return 1.0f;
        }
        return z12 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public long h() {
        return this.f55341n - this.f55342o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f11;
        float f12;
        this.f55341n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f55332e) {
            this.f55350w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z11 = (motionEvent.getButtonState() & 32) != 0;
        boolean z12 = this.f55349v == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        if (actionMasked == 0 || z13) {
            if (this.f55343p) {
                this.f55329b.a(this);
                this.f55343p = false;
                this.f55336i = BitmapDescriptorFactory.HUE_RED;
                this.f55349v = 0;
            } else if (j() && z13) {
                this.f55343p = false;
                this.f55336i = BitmapDescriptorFactory.HUE_RED;
                this.f55349v = 0;
            }
            if (z13) {
                return true;
            }
        }
        if (!this.f55343p && this.f55333f && !j() && !z13 && z11) {
            this.f55347t = motionEvent.getX();
            this.f55348u = motionEvent.getY();
            this.f55349v = 2;
            this.f55336i = BitmapDescriptorFactory.HUE_RED;
        }
        boolean z14 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12;
        boolean z15 = actionMasked == 6;
        int actionIndex = z15 ? motionEvent.getActionIndex() : -1;
        int i11 = z15 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f12 = this.f55347t;
            f11 = this.f55348u;
            if (motionEvent.getY() < f11) {
                this.f55351x = true;
            } else {
                this.f55351x = false;
            }
        } else {
            float x11 = 0.0f;
            float y11 = 0.0f;
            for (int i12 = 0; i12 < pointerCount; i12++) {
                if (actionIndex != i12) {
                    x11 += motionEvent.getX(i12);
                    y11 += motionEvent.getY(i12);
                }
            }
            float f13 = i11;
            float f14 = x11 / f13;
            f11 = y11 / f13;
            f12 = f14;
        }
        float fAbs2 = 0.0f;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (actionIndex != i13) {
                fAbs += Math.abs(motionEvent.getX(i13) - f12);
                fAbs2 += Math.abs(motionEvent.getY(i13) - f11);
            }
        }
        float f15 = i11;
        float f16 = (fAbs / f15) * 2.0f;
        float f17 = (fAbs2 / f15) * 2.0f;
        float fHypot = j() ? f17 : (float) Math.hypot(f16, f17);
        boolean z16 = this.f55343p;
        this.f55330c = f12;
        this.f55331d = f11;
        if (!j() && this.f55343p && (fHypot < this.f55345r || z14)) {
            this.f55329b.a(this);
            this.f55343p = false;
            this.f55336i = fHypot;
        }
        if (z14) {
            this.f55337j = f16;
            this.f55339l = f16;
            this.f55338k = f17;
            this.f55340m = f17;
            this.f55334g = fHypot;
            this.f55335h = fHypot;
            this.f55336i = fHypot;
        }
        int i14 = j() ? this.f55344q : this.f55345r;
        if (!this.f55343p && fHypot >= i14 && (z16 || Math.abs(fHypot - this.f55336i) > this.f55344q)) {
            this.f55337j = f16;
            this.f55339l = f16;
            this.f55338k = f17;
            this.f55340m = f17;
            this.f55334g = fHypot;
            this.f55335h = fHypot;
            this.f55342o = this.f55341n;
            this.f55343p = this.f55329b.c(this);
        }
        if (actionMasked == 2) {
            this.f55337j = f16;
            this.f55338k = f17;
            this.f55334g = fHypot;
            if (this.f55343p ? this.f55329b.b(this) : true) {
                this.f55339l = this.f55337j;
                this.f55340m = this.f55338k;
                this.f55335h = this.f55334g;
                this.f55342o = this.f55341n;
            }
        }
        return true;
    }

    public void l(boolean z11) {
        this.f55332e = z11;
        if (z11 && this.f55350w == null) {
            this.f55350w = new GestureDetector(this.f55328a, new a(), this.f55346s);
        }
    }

    public void m(boolean z11) {
        this.f55333f = z11;
    }

    public j(Context context, b bVar, Handler handler) {
        this.f55349v = 0;
        this.f55328a = context;
        this.f55329b = bVar;
        this.f55344q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f55345r = 0;
        this.f55346s = handler;
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i11 > 18) {
            l(true);
        }
        if (i11 > 22) {
            m(true);
        }
    }
}
