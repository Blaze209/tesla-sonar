package sl;

import android.graphics.Bitmap;
import android.util.SparseArray;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import um.e;
import um.f;
import um.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\r0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006'"}, d2 = {"Lsl/b;", "Lrl/b;", "Ljm/c;", "animatedFrameCache", "", "enableBitmapReusing", "<init>", "(Ljm/c;Z)V", "", "frameNumber", "Ljn0/h0;", "g", "(I)V", "Ltk/a;", "Landroid/graphics/Bitmap;", "e", "(I)Ltk/a;", DateTokenConverter.CONVERTER_KEY, Snapshot.WIDTH, Snapshot.HEIGHT, "f", "(III)Ltk/a;", "c", "(I)Z", "clear", "()V", "bitmapReference", "frameType", "b", "(ILtk/a;I)V", "a", "Ljm/c;", "Z", "Landroid/util/SparseArray;", "Lum/e;", "Landroid/util/SparseArray;", "preparedPendingFrames", "Ltk/a;", "lastRenderedItem", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements rl.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class<?> f111419f = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jm.c animatedFrameCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enableBitmapReusing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<tk.a<e>> preparedPendingFrames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private tk.a<e> lastRenderedItem;

    /* JADX INFO: renamed from: sl.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsl/b$a;", "", "<init>", "()V", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmapReference", "Lum/e;", "c", "(Ltk/a;)Ltk/a;", "closeableImage", "b", "Ljava/lang/Class;", "TAG", "Ljava/lang/Class;", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tk.a<e> c(tk.a<Bitmap> bitmapReference) {
            f fVarW1 = f.W1(bitmapReference, o.f116468d, 0);
            s.j(fVarW1, "of(...)");
            return tk.a.c0(fVarW1);
        }

        public final tk.a<Bitmap> b(tk.a<e> closeableImage) {
            try {
                if (tk.a.b0(closeableImage)) {
                    s.h(closeableImage);
                    if (closeableImage.H() instanceof f) {
                        e eVarH = closeableImage.H();
                        s.i(eVarH, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((f) eVarH).V();
                    }
                }
                return null;
            } finally {
                tk.a.C(closeableImage);
            }
        }

        private Companion() {
        }
    }

    public b(jm.c animatedFrameCache, boolean z11) {
        s.k(animatedFrameCache, "animatedFrameCache");
        this.animatedFrameCache = animatedFrameCache;
        this.enableBitmapReusing = z11;
        this.preparedPendingFrames = new SparseArray<>();
    }

    private final synchronized void g(int frameNumber) {
        tk.a<e> aVar = this.preparedPendingFrames.get(frameNumber);
        if (aVar != null) {
            this.preparedPendingFrames.delete(frameNumber);
            tk.a.C(aVar);
            qk.a.z(f111419f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
        }
    }

    @Override // rl.b
    public synchronized void a(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        s.k(bitmapReference, "bitmapReference");
        try {
            tk.a<e> aVarC = INSTANCE.c(bitmapReference);
            if (aVarC == null) {
                tk.a.C(aVarC);
                return;
            }
            tk.a<e> aVarA = this.animatedFrameCache.a(frameNumber, aVarC);
            if (tk.a.b0(aVarA)) {
                tk.a.C(this.preparedPendingFrames.get(frameNumber));
                this.preparedPendingFrames.put(frameNumber, aVarA);
                qk.a.z(f111419f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
            }
            tk.a.C(aVarC);
        } catch (Throwable th2) {
            tk.a.C(null);
            throw th2;
        }
    }

    @Override // rl.b
    public synchronized void b(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        s.k(bitmapReference, "bitmapReference");
        g(frameNumber);
        tk.a<e> aVarC = null;
        try {
            aVarC = INSTANCE.c(bitmapReference);
            if (aVarC != null) {
                tk.a.C(this.lastRenderedItem);
                this.lastRenderedItem = this.animatedFrameCache.a(frameNumber, aVarC);
            }
            tk.a.C(aVarC);
        } catch (Throwable th2) {
            tk.a.C(aVarC);
            throw th2;
        }
    }

    @Override // rl.b
    public synchronized boolean c(int frameNumber) {
        return this.animatedFrameCache.b(frameNumber);
    }

    @Override // rl.b
    public synchronized void clear() {
        try {
            tk.a.C(this.lastRenderedItem);
            this.lastRenderedItem = null;
            int size = this.preparedPendingFrames.size();
            for (int i11 = 0; i11 < size; i11++) {
                tk.a.C(this.preparedPendingFrames.valueAt(i11));
            }
            this.preparedPendingFrames.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> d(int frameNumber) {
        return INSTANCE.b(tk.a.t(this.lastRenderedItem));
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> e(int frameNumber) {
        return INSTANCE.b(this.animatedFrameCache.c(frameNumber));
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> f(int frameNumber, int width, int height) {
        if (!this.enableBitmapReusing) {
            return null;
        }
        return INSTANCE.b(this.animatedFrameCache.d());
    }
}
