package y00;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, d2 = {"Ly00/e;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "<init>", "()V", "Ljn0/h0;", "e", DateTokenConverter.CONVERTER_KEY, "Landroid/view/Surface;", "c", "()Landroid/view/Surface;", "a", "b", "Landroid/graphics/SurfaceTexture;", "p0", "onFrameAvailable", "(Landroid/graphics/SurfaceTexture;)V", "Landroid/graphics/SurfaceTexture;", "mSurfaceTexture", "Landroid/view/Surface;", "mSurface", "Ljava/lang/Object;", "Ljava/lang/Object;", "mFrameSyncObject", "", "Z", "mFrameAvailable", "Ly00/h;", "Ly00/h;", "mTextureRender", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SurfaceTexture mSurfaceTexture;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Surface mSurface;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object mFrameSyncObject = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean mFrameAvailable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h mTextureRender;

    public e() {
        e();
    }

    private final void e() {
        h hVar = new h();
        this.mTextureRender = hVar;
        hVar.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(hVar.getMTextureID());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    public final void a() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(100);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.mFrameAvailable = false;
            h0 h0Var = h0.f84049a;
        }
        h hVar = this.mTextureRender;
        if (hVar != null) {
            hVar.a("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void b() {
        h hVar = this.mTextureRender;
        if (hVar != null) {
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            s.h(surfaceTexture);
            hVar.c(surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Surface getMSurface() {
        return this.mSurface;
    }

    public final void d() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture p11) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
            h0 h0Var = h0.f84049a;
        }
    }
}
