package vs;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ts.l0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i implements us.k, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f119823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f119824j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f119827m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f119815a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f119816b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f119817c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f119818d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0<Long> f119819e = new l0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0<e> f119820f = new l0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f119821g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f119822h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f119825k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f119826l = -1;

    private void h(byte[] bArr, int i11, long j11) {
        byte[] bArr2 = this.f119827m;
        int i12 = this.f119826l;
        this.f119827m = bArr;
        if (i11 == -1) {
            i11 = this.f119825k;
        }
        this.f119826l = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.f119827m)) {
            return;
        }
        byte[] bArr3 = this.f119827m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f119826l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f119826l);
        }
        this.f119820f.a(j11, eVarA);
    }

    @Override // vs.a
    public void b(long j11, float[] fArr) {
        this.f119818d.e(j11, fArr);
    }

    public void c(float[] fArr, boolean z11) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            u.d("SceneRenderer", "Failed to draw a frame", e11);
        }
        if (this.f119815a.compareAndSet(true, false)) {
            ((SurfaceTexture) ts.a.e(this.f119824j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e12) {
                u.d("SceneRenderer", "Failed to draw a frame", e12);
            }
            if (this.f119816b.compareAndSet(true, false)) {
                GlUtil.j(this.f119821g);
            }
            long timestamp = this.f119824j.getTimestamp();
            Long lG = this.f119819e.g(timestamp);
            if (lG != null) {
                this.f119818d.c(this.f119821g, lG.longValue());
            }
            e eVarJ = this.f119820f.j(timestamp);
            if (eVarJ != null) {
                this.f119817c.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f119822h, 0, fArr, 0, this.f119821g, 0);
        this.f119817c.a(this.f119823i, this.f119822h, z11);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f119817c.b();
            GlUtil.b();
            this.f119823i = GlUtil.f();
        } catch (GlUtil.GlException e11) {
            u.d("SceneRenderer", "Failed to initialize the renderer", e11);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f119823i);
        this.f119824j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: vs.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f119814a.f119815a.set(true);
            }
        });
        return this.f119824j;
    }

    @Override // vs.a
    public void e() {
        this.f119819e.c();
        this.f119818d.d();
        this.f119816b.set(true);
    }

    public void f(int i11) {
        this.f119825k = i11;
    }

    @Override // us.k
    public void g(long j11, long j12, u0 u0Var, MediaFormat mediaFormat) {
        this.f119819e.a(j12, Long.valueOf(j11));
        h(u0Var.f40722v, u0Var.f40723w, j12);
    }
}
