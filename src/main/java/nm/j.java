package nm;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001/B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0013J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0013J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010'\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b)\u0010#J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00108R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010:¨\u0006<"}, d2 = {"Lnm/j;", "", "Lkk/k;", "fileCache", "Lsk/h;", "pooledByteBufferFactory", "Lsk/k;", "pooledByteStreams", "Ljava/util/concurrent/Executor;", "readExecutor", "writeExecutor", "Lnm/t;", "imageCacheStatsTracker", "<init>", "(Lkk/k;Lsk/h;Lsk/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lnm/t;)V", "Ljk/d;", Action.KEY_ATTRIBUTE, "", "g", "(Ljk/d;)Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Lac/e;", "Lum/k;", "n", "(Ljk/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lac/e;", "pinnedImage", "l", "(Ljk/d;Lum/k;)Lac/e;", "Lcom/facebook/common/memory/PooledByteBuffer;", "r", "(Ljk/d;)Lcom/facebook/common/memory/PooledByteBuffer;", "encodedImage", "Ljn0/h0;", "u", "(Ljk/d;Lum/k;)V", "j", "k", "m", "f", "(Ljk/d;)V", "p", "Ljava/lang/Void;", "s", "(Ljk/d;)Lac/e;", "h", "()Lac/e;", "a", "Lkk/k;", "b", "Lsk/h;", "c", "Lsk/k;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "e", "Lnm/t;", "Lnm/c0;", "Lnm/c0;", "stagingArea", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class<?> f95161i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kk.k fileCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sk.h pooledByteBufferFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sk.k pooledByteStreams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor readExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Executor writeExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t imageCacheStatsTracker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c0 stagingArea;

    public j(kk.k fileCache, sk.h pooledByteBufferFactory, sk.k pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        p013kotlin.jvm.internal.s.k(fileCache, "fileCache");
        p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
        p013kotlin.jvm.internal.s.k(pooledByteStreams, "pooledByteStreams");
        p013kotlin.jvm.internal.s.k(readExecutor, "readExecutor");
        p013kotlin.jvm.internal.s.k(writeExecutor, "writeExecutor");
        p013kotlin.jvm.internal.s.k(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.fileCache = fileCache;
        this.pooledByteBufferFactory = pooledByteBufferFactory;
        this.pooledByteStreams = pooledByteStreams;
        this.readExecutor = readExecutor;
        this.writeExecutor = writeExecutor;
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        c0 c0VarD = c0.d();
        p013kotlin.jvm.internal.s.j(c0VarD, "getInstance(...)");
        this.stagingArea = c0VarD;
    }

    private final boolean g(jk.d key) {
        um.k kVarC = this.stagingArea.c(key);
        if (kVarC != null) {
            kVarC.close();
            qk.a.y(f95161i, "Found image for %s in staging area", key.getAnimationUriString());
            this.imageCacheStatsTracker.k(key);
            return true;
        }
        qk.a.y(f95161i, "Did not find image for %s in staging area", key.getAnimationUriString());
        this.imageCacheStatsTracker.c(key);
        try {
            return this.fileCache.f(key);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        Object objE = vm.a.e(obj, null);
        try {
            this$0.stagingArea.a();
            this$0.fileCache.a();
            vm.a.f(objE);
            return null;
        } catch (Throwable th2) {
            try {
                vm.a.c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                vm.a.f(objE);
                throw th3;
            }
        }
    }

    private final ac.e<um.k> l(jk.d key, um.k pinnedImage) {
        qk.a.y(f95161i, "Found image for %s in staging area", key.getAnimationUriString());
        this.imageCacheStatsTracker.k(key);
        ac.e<um.k> eVarH = ac.e.h(pinnedImage);
        p013kotlin.jvm.internal.s.j(eVarH, "forResult(...)");
        return eVarH;
    }

    private final ac.e<um.k> n(final jk.d key, final AtomicBoolean isCancelled) {
        try {
            final Object objD = vm.a.d("BufferedDiskCache_getAsync");
            return ac.e.b(new Callable() { // from class: nm.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.o(objD, isCancelled, this, key);
                }
            }, this.readExecutor);
        } catch (Exception e11) {
            qk.a.H(f95161i, e11, "Failed to schedule disk-cache read for %s", key.getAnimationUriString());
            return ac.e.g(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final um.k o(Object obj, AtomicBoolean isCancelled, j this$0, jk.d key) {
        p013kotlin.jvm.internal.s.k(isCancelled, "$isCancelled");
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(key, "$key");
        Object objE = vm.a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            um.k kVarC = this$0.stagingArea.c(key);
            if (kVarC != null) {
                qk.a.y(f95161i, "Found image for %s in staging area", key.getAnimationUriString());
                this$0.imageCacheStatsTracker.k(key);
            } else {
                qk.a.y(f95161i, "Did not find image for %s in staging area", key.getAnimationUriString());
                this$0.imageCacheStatsTracker.c(key);
                try {
                    PooledByteBuffer pooledByteBufferR = this$0.r(key);
                    if (pooledByteBufferR == null) {
                        vm.a.f(objE);
                        return null;
                    }
                    tk.a aVarC0 = tk.a.c0(pooledByteBufferR);
                    p013kotlin.jvm.internal.s.j(aVarC0, "of(...)");
                    try {
                        um.k kVar = new um.k((tk.a<PooledByteBuffer>) aVarC0);
                        tk.a.C(aVarC0);
                        kVarC = kVar;
                    } catch (Throwable th2) {
                        tk.a.C(aVarC0);
                        throw th2;
                    }
                } catch (Exception unused) {
                    vm.a.f(objE);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                vm.a.f(objE);
                return kVarC;
            }
            qk.a.x(f95161i, "Host thread was interrupted, decreasing reference count");
            kVarC.close();
            throw new InterruptedException();
        } catch (Throwable th3) {
            try {
                vm.a.c(obj, th3);
                throw th3;
            } catch (Throwable th4) {
                vm.a.f(objE);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, jk.d key, um.k kVar) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(key, "$key");
        Object objE = vm.a.e(obj, null);
        try {
            this$0.u(key, kVar);
            c0 c0Var = this$0.stagingArea;
            p013kotlin.jvm.internal.s.h(kVar);
            c0Var.h(key, kVar);
            um.k.o(kVar);
            vm.a.f(objE);
        } catch (Throwable th2) {
            try {
                vm.a.c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                c0 c0Var2 = this$0.stagingArea;
                p013kotlin.jvm.internal.s.h(kVar);
                c0Var2.h(key, kVar);
                um.k.o(kVar);
                vm.a.f(objE);
                throw th3;
            }
        }
    }

    private final PooledByteBuffer r(jk.d key) throws IOException {
        try {
            Class<?> cls = f95161i;
            qk.a.y(cls, "Disk cache read for %s", key.getAnimationUriString());
            ik.a aVarD = this.fileCache.d(key);
            if (aVarD == null) {
                qk.a.y(cls, "Disk cache miss for %s", key.getAnimationUriString());
                this.imageCacheStatsTracker.g(key);
                return null;
            }
            qk.a.y(cls, "Found entry in disk cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.f(key);
            InputStream inputStreamA = aVarD.a();
            try {
                PooledByteBuffer pooledByteBufferE = this.pooledByteBufferFactory.e(inputStreamA, (int) aVarD.size());
                inputStreamA.close();
                qk.a.y(cls, "Successful read from disk cache for %s", key.getAnimationUriString());
                return pooledByteBufferE;
            } catch (Throwable th2) {
                inputStreamA.close();
                throw th2;
            }
        } catch (IOException e11) {
            qk.a.H(f95161i, e11, "Exception reading from cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.i(key);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, jk.d key) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(key, "$key");
        Object objE = vm.a.e(obj, null);
        try {
            this$0.stagingArea.g(key);
            this$0.fileCache.e(key);
            vm.a.f(objE);
            return null;
        } catch (Throwable th2) {
            try {
                vm.a.c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                vm.a.f(objE);
                throw th3;
            }
        }
    }

    private final void u(jk.d key, final um.k encodedImage) {
        Class<?> cls = f95161i;
        qk.a.y(cls, "About to write to disk-cache for key %s", key.getAnimationUriString());
        try {
            this.fileCache.b(key, new jk.j() { // from class: nm.i
                @Override // jk.j
                public final void write(OutputStream outputStream) {
                    j.v(encodedImage, this, outputStream);
                }
            });
            this.imageCacheStatsTracker.e(key);
            qk.a.y(cls, "Successful disk-cache write for key %s", key.getAnimationUriString());
        } catch (IOException e11) {
            qk.a.H(f95161i, e11, "Failed to write to disk-cache for key %s", key.getAnimationUriString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(um.k kVar, j this$0, OutputStream os2) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(os2, "os");
        p013kotlin.jvm.internal.s.h(kVar);
        InputStream inputStreamJ = kVar.J();
        if (inputStreamJ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.pooledByteStreams.a(inputStreamJ, os2);
    }

    public final void f(jk.d key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        this.fileCache.g(key);
    }

    public final ac.e<Void> h() {
        this.stagingArea.a();
        final Object objD = vm.a.d("BufferedDiskCache_clearAll");
        try {
            return ac.e.b(new Callable() { // from class: nm.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.i(objD, this);
                }
            }, this.writeExecutor);
        } catch (Exception e11) {
            qk.a.H(f95161i, e11, "Failed to schedule disk-cache clear", new Object[0]);
            return ac.e.g(e11);
        }
    }

    public final boolean j(jk.d key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this.stagingArea.b(key) || this.fileCache.c(key);
    }

    public final boolean k(jk.d key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final ac.e<um.k> m(jk.d key, AtomicBoolean isCancelled) {
        ac.e<um.k> eVarN;
        ac.e<um.k> eVarL;
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(isCancelled, "isCancelled");
        if (!bn.b.d()) {
            um.k kVarC = this.stagingArea.c(key);
            return (kVarC == null || (eVarL = l(key, kVarC)) == null) ? n(key, isCancelled) : eVarL;
        }
        bn.b.a("BufferedDiskCache#get");
        try {
            um.k kVarC2 = this.stagingArea.c(key);
            if (kVarC2 == null || (eVarN = l(key, kVarC2)) == null) {
                eVarN = n(key, isCancelled);
            }
            return eVarN;
        } finally {
            bn.b.b();
        }
    }

    public final void p(final jk.d key, um.k encodedImage) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(encodedImage, "encodedImage");
        if (!bn.b.d()) {
            if (!um.k.u0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.f(key, encodedImage);
            final um.k kVarN = um.k.n(encodedImage);
            try {
                final Object objD = vm.a.d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: nm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD, this, key, kVarN);
                    }
                });
                return;
            } catch (Exception e11) {
                qk.a.H(f95161i, e11, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.h(key, encodedImage);
                um.k.o(kVarN);
                return;
            }
        }
        bn.b.a("BufferedDiskCache#put");
        try {
            if (!um.k.u0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.f(key, encodedImage);
            final um.k kVarN2 = um.k.n(encodedImage);
            try {
                final Object objD2 = vm.a.d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: nm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD2, this, key, kVarN2);
                    }
                });
            } catch (Exception e12) {
                qk.a.H(f95161i, e12, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.h(key, encodedImage);
                um.k.o(kVarN2);
            }
            h0 h0Var = h0.f84049a;
            bn.b.b();
        } catch (Throwable th2) {
            bn.b.b();
            throw th2;
        }
    }

    public final ac.e<Void> s(final jk.d key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        this.stagingArea.g(key);
        try {
            final Object objD = vm.a.d("BufferedDiskCache_remove");
            return ac.e.b(new Callable() { // from class: nm.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.t(objD, this, key);
                }
            }, this.writeExecutor);
        } catch (Exception e11) {
            qk.a.H(f95161i, e11, "Failed to schedule disk-cache remove for %s", key.getAnimationUriString());
            return ac.e.g(e11);
        }
    }
}
