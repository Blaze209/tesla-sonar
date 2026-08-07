package tl;

import android.graphics.Bitmap;
import android.util.SparseArray;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.ExecutorService;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ltl/c;", "Ltl/b;", "Lmm/d;", "platformBitmapFactory", "Lrl/c;", "bitmapFrameRenderer", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Lmm/d;Lrl/c;Landroid/graphics/Bitmap$Config;Ljava/util/concurrent/ExecutorService;)V", "Lql/a;", "backend", "", "frameNumber", "g", "(Lql/a;I)I", "Lrl/b;", "bitmapFrameCache", "animationBackend", "", "a", "(Lrl/b;Lql/a;I)Z", "Lmm/d;", "b", "Lrl/c;", "c", "Landroid/graphics/Bitmap$Config;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "TAG", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "f", "Landroid/util/SparseArray;", "pendingFrameDecodeJobs", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mm.d platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rl.c bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService executorService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Class<c> TAG;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<Runnable> pendingFrameDecodeJobs;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Ltl/c$a;", "Ljava/lang/Runnable;", "Lql/a;", "animationBackend", "Lrl/b;", "bitmapFrameCache", "", "frameNumber", "frameId", "<init>", "(Ltl/c;Lql/a;Lrl/b;II)V", "frameType", "", "a", "(II)Z", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmapReference", "b", "(ILtk/a;I)Z", "Ljn0/h0;", "run", "()V", "Lql/a;", "Lrl/b;", "c", "I", DateTokenConverter.CONVERTER_KEY, "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ql.a animationBackend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final rl.b bitmapFrameCache;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int frameNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int frameId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f114750e;

        public a(c cVar, ql.a animationBackend, rl.b bitmapFrameCache, int i11, int i12) {
            s.k(animationBackend, "animationBackend");
            s.k(bitmapFrameCache, "bitmapFrameCache");
            this.f114750e = cVar;
            this.animationBackend = animationBackend;
            this.bitmapFrameCache = bitmapFrameCache;
            this.frameNumber = i11;
            this.frameId = i12;
        }

        private final boolean a(int frameNumber, int frameType) {
            tk.a<Bitmap> aVarF;
            int i11 = 2;
            try {
                if (frameType == 1) {
                    aVarF = this.bitmapFrameCache.f(frameNumber, this.animationBackend.c(), this.animationBackend.d());
                } else {
                    if (frameType != 2) {
                        tk.a.C(null);
                        return false;
                    }
                    aVarF = this.f114750e.platformBitmapFactory.b(this.animationBackend.c(), this.animationBackend.d(), this.f114750e.bitmapConfig);
                    i11 = -1;
                }
                tk.a<Bitmap> aVar = aVarF;
                boolean zB = b(frameNumber, aVar, frameType);
                tk.a.C(aVar);
                return (zB || i11 == -1) ? zB : a(frameNumber, i11);
            } catch (RuntimeException e11) {
                qk.a.F(this.f114750e.TAG, "Failed to create frame bitmap", e11);
                return false;
            } finally {
                tk.a.C(null);
            }
        }

        private final boolean b(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
            if (tk.a.b0(bitmapReference) && bitmapReference != null) {
                rl.c cVar = this.f114750e.bitmapFrameRenderer;
                Bitmap bitmapH = bitmapReference.H();
                s.j(bitmapH, "get(...)");
                if (cVar.a(frameNumber, bitmapH)) {
                    qk.a.y(this.f114750e.TAG, "Frame %d ready.", Integer.valueOf(frameNumber));
                    synchronized (this.f114750e.pendingFrameDecodeJobs) {
                        this.bitmapFrameCache.a(frameNumber, bitmapReference, frameType);
                        h0 h0Var = h0.f84049a;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.bitmapFrameCache.c(this.frameNumber)) {
                    qk.a.y(this.f114750e.TAG, "Frame %d is cached already.", Integer.valueOf(this.frameNumber));
                    SparseArray sparseArray = this.f114750e.pendingFrameDecodeJobs;
                    c cVar = this.f114750e;
                    synchronized (sparseArray) {
                        cVar.pendingFrameDecodeJobs.remove(this.frameId);
                        h0 h0Var = h0.f84049a;
                    }
                    return;
                }
                if (a(this.frameNumber, 1)) {
                    qk.a.y(this.f114750e.TAG, "Prepared frame %d.", Integer.valueOf(this.frameNumber));
                } else {
                    qk.a.k(this.f114750e.TAG, "Could not prepare frame %d.", Integer.valueOf(this.frameNumber));
                }
                SparseArray sparseArray2 = this.f114750e.pendingFrameDecodeJobs;
                c cVar2 = this.f114750e;
                synchronized (sparseArray2) {
                    cVar2.pendingFrameDecodeJobs.remove(this.frameId);
                    h0 h0Var2 = h0.f84049a;
                }
            } catch (Throwable th2) {
                SparseArray sparseArray3 = this.f114750e.pendingFrameDecodeJobs;
                c cVar3 = this.f114750e;
                synchronized (sparseArray3) {
                    cVar3.pendingFrameDecodeJobs.remove(this.frameId);
                    h0 h0Var3 = h0.f84049a;
                    throw th2;
                }
            }
        }
    }

    public c(mm.d platformBitmapFactory, rl.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        s.k(platformBitmapFactory, "platformBitmapFactory");
        s.k(bitmapFrameRenderer, "bitmapFrameRenderer");
        s.k(bitmapConfig, "bitmapConfig");
        s.k(executorService, "executorService");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.bitmapConfig = bitmapConfig;
        this.executorService = executorService;
        this.TAG = c.class;
        this.pendingFrameDecodeJobs = new SparseArray<>();
    }

    private final int g(ql.a backend, int frameNumber) {
        return (backend.hashCode() * 31) + frameNumber;
    }

    @Override // tl.b
    public boolean a(rl.b bitmapFrameCache, ql.a animationBackend, int frameNumber) throws Throwable {
        Throwable th2;
        s.k(bitmapFrameCache, "bitmapFrameCache");
        s.k(animationBackend, "animationBackend");
        int iG = g(animationBackend, frameNumber);
        synchronized (this.pendingFrameDecodeJobs) {
            try {
                try {
                    if (this.pendingFrameDecodeJobs.get(iG) != null) {
                        qk.a.y(this.TAG, "Already scheduled decode job for frame %d", Integer.valueOf(frameNumber));
                        return true;
                    }
                    if (bitmapFrameCache.c(frameNumber)) {
                        qk.a.y(this.TAG, "Frame %d is cached already.", Integer.valueOf(frameNumber));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, frameNumber, iG);
                        this.pendingFrameDecodeJobs.put(iG, aVar);
                        this.executorService.execute(aVar);
                        h0 h0Var = h0.f84049a;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }
}
