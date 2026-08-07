package v8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.u;
import s7.h0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class i implements u8.k, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f118379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f118380j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f118383m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f118371a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f118372b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f118373c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f118374d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0<Long> f118375e = new h0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0<e> f118376f = new h0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f118377g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f118378h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f118381k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f118382l = -1;

    private void h(byte[] bArr, int i11, long j11) {
        byte[] bArr2 = this.f118383m;
        int i12 = this.f118382l;
        this.f118383m = bArr;
        if (i11 == -1) {
            i11 = this.f118381k;
        }
        this.f118382l = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.f118383m)) {
            return;
        }
        byte[] bArr3 = this.f118383m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f118382l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f118382l);
        }
        this.f118376f.a(j11, eVarA);
    }

    @Override // v8.a
    public void b(long j11, float[] fArr) {
        this.f118374d.e(j11, fArr);
    }

    public void c(float[] fArr, boolean z11) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            t.e("SceneRenderer", "Failed to draw a frame", e11);
        }
        if (this.f118371a.compareAndSet(true, false)) {
            ((SurfaceTexture) s7.a.f(this.f118380j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e12) {
                t.e("SceneRenderer", "Failed to draw a frame", e12);
            }
            if (this.f118372b.compareAndSet(true, false)) {
                GlUtil.o(this.f118377g);
            }
            long timestamp = this.f118380j.getTimestamp();
            Long lG = this.f118375e.g(timestamp);
            if (lG != null) {
                this.f118374d.c(this.f118377g, lG.longValue());
            }
            e eVarJ = this.f118376f.j(timestamp);
            if (eVarJ != null) {
                this.f118373c.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f118378h, 0, fArr, 0, this.f118377g, 0);
        this.f118373c.a(this.f118379i, this.f118378h, z11);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f118373c.b();
            GlUtil.b();
            this.f118379i = GlUtil.f();
        } catch (GlUtil.GlException e11) {
            t.e("SceneRenderer", "Failed to initialize the renderer", e11);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f118379i);
        this.f118380j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: v8.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f118370a.f118371a.set(true);
            }
        });
        return this.f118380j;
    }

    @Override // v8.a
    public void e() {
        this.f118375e.c();
        this.f118374d.d();
        this.f118372b.set(true);
    }

    public void f(int i11) {
        this.f118381k = i11;
    }

    @Override // u8.k
    public void g(long j11, long j12, u uVar, MediaFormat mediaFormat) {
        this.f118375e.a(j12, Long.valueOf(j11));
        h(uVar.C, uVar.D, j12);
    }
}
