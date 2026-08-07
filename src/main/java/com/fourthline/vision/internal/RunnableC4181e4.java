package com.fourthline.vision.internal;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.view.Surface;
import com.fourthline.vision.internal.camera.view.glutils.GLDrawer2D;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC4181e4 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f38279k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f38280l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f38282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f38283c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4253o2 f38289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GLDrawer2D f38290j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f38281a = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38284d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f38285e = new float[32];

    /* JADX INFO: renamed from: com.fourthline.vision.internal.e4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RunnableC4181e4 createHandler() {
            RunnableC4181e4 runnableC4181e4 = new RunnableC4181e4();
            new Thread(runnableC4181e4, "FourthlineVision.RenderHandler").start();
            return runnableC4181e4;
        }

        private a() {
        }
    }

    public static /* synthetic */ void draw$default(RunnableC4181e4 runnableC4181e4, int i11, float[] fArr, float[] fArr2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            fArr = null;
        }
        if ((i12 & 4) != 0) {
            fArr2 = null;
        }
        runnableC4181e4.draw(i11, fArr, fArr2);
    }

    private final void internalPrepare() {
        internalRelease();
        EGLContext eGLContext = this.f38282b;
        Surface surface = null;
        if (eGLContext == null) {
            p013kotlin.jvm.internal.s.B("eglContext");
            eGLContext = null;
        }
        Surface surface2 = this.f38283c;
        if (surface2 == null) {
            p013kotlin.jvm.internal.s.B("surface");
        } else {
            surface = surface2;
        }
        this.f38289i = new C4253o2(eGLContext, surface);
        this.f38290j = new GLDrawer2D();
    }

    private final void internalRelease() {
        GLDrawer2D gLDrawer2D = this.f38290j;
        if (gLDrawer2D != null) {
            gLDrawer2D.release();
        }
        C4253o2 c4253o2 = this.f38289i;
        if (c4253o2 != null) {
            c4253o2.release();
        }
        this.f38290j = null;
        this.f38289i = null;
    }

    public final void draw() {
        draw$default(this, 0, null, null, 7, null);
    }

    public final void release() {
        this.f38287g = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4253o2 c4253o2;
        GLDrawer2D gLDrawer2D;
        this.f38288h = 0;
        while (!this.f38287g) {
            if (this.f38286f) {
                this.f38286f = false;
                internalPrepare();
            }
            int i11 = this.f38288h;
            if (i11 > 0) {
                this.f38288h = i11 - 1;
                if (this.f38284d >= 0 && (c4253o2 = this.f38289i) != null && (gLDrawer2D = this.f38290j) != null) {
                    gLDrawer2D.setMatrix(this.f38285e, 16);
                    gLDrawer2D.draw(this.f38284d, this.f38285e);
                    c4253o2.swap();
                }
            }
        }
        internalRelease();
    }

    public final void setEglContext(Surface surface) {
        p013kotlin.jvm.internal.s.k(surface, "surface");
        if (this.f38287g) {
            return;
        }
        this.f38282b = EGL14.eglGetCurrentContext();
        this.f38283c = surface;
        this.f38286f = true;
        Matrix.setIdentityM(this.f38285e, 0);
        Matrix.setIdentityM(this.f38285e, 16);
    }

    public final void draw(int i11) {
        draw$default(this, i11, null, null, 6, null);
    }

    public final void draw(int i11, float[] fArr) {
        draw$default(this, i11, fArr, null, 4, null);
    }

    public final void draw(int i11, float[] fArr, float[] fArr2) {
        ReentrantLock reentrantLock = this.f38281a;
        reentrantLock.lock();
        try {
            if (this.f38287g) {
                return;
            }
            if (fArr != null && fArr.length >= 16) {
                System.arraycopy(fArr, 0, this.f38285e, 0, 16);
            } else {
                Matrix.setIdentityM(this.f38285e, 0);
            }
            if (fArr2 != null && fArr2.length >= 16) {
                System.arraycopy(fArr2, 0, this.f38285e, 16, 16);
            } else {
                Matrix.setIdentityM(this.f38285e, 16);
            }
            this.f38284d = i11;
            this.f38288h++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
