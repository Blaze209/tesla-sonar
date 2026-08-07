package wl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jm.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import rl.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010!¨\u0006%"}, d2 = {"Lwl/b;", "Lrl/c;", "Lrl/b;", "bitmapFrameCache", "Lhm/a;", "animatedDrawableBackend", "", "isNewRenderImplementation", "<init>", "(Lrl/b;Lhm/a;Z)V", "Landroid/graphics/Rect;", "bounds", "Ljn0/h0;", "e", "(Landroid/graphics/Rect;)V", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", "a", "(ILandroid/graphics/Bitmap;)Z", "Lrl/b;", "b", "Lhm/a;", "c", "Z", "Ljm/d;", DateTokenConverter.CONVERTER_KEY, "Ljm/d;", "animatedImageCompositor", "Ljm/d$b;", "Ljm/d$b;", "callback", "()I", "intrinsicWidth", "intrinsicHeight", "f", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class<?> f122030g = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rl.b bitmapFrameCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private hm.a animatedDrawableBackend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d animatedImageCompositor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d.b callback;

    /* JADX INFO: renamed from: wl.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"wl/b$b", "Ljm/d$b;", "", "frameNumber", "Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "a", "(ILandroid/graphics/Bitmap;)V", "Ltk/a;", "b", "(I)Ltk/a;", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2620b implements d.b {
        C2620b() {
        }

        @Override // jm.d.b
        public void a(int frameNumber, Bitmap bitmap) {
            s.k(bitmap, "bitmap");
        }

        @Override // jm.d.b
        public tk.a<Bitmap> b(int frameNumber) {
            return b.this.bitmapFrameCache.e(frameNumber);
        }
    }

    public b(rl.b bitmapFrameCache, hm.a animatedDrawableBackend, boolean z11) {
        s.k(bitmapFrameCache, "bitmapFrameCache");
        s.k(animatedDrawableBackend, "animatedDrawableBackend");
        this.bitmapFrameCache = bitmapFrameCache;
        this.animatedDrawableBackend = animatedDrawableBackend;
        this.isNewRenderImplementation = z11;
        C2620b c2620b = new C2620b();
        this.callback = c2620b;
        this.animatedImageCompositor = new d(this.animatedDrawableBackend, z11, c2620b);
    }

    @Override // rl.c
    public boolean a(int frameNumber, Bitmap targetBitmap) {
        s.k(targetBitmap, "targetBitmap");
        try {
            this.animatedImageCompositor.h(frameNumber, targetBitmap);
            return true;
        } catch (IllegalStateException e11) {
            qk.a.l(f122030g, e11, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(frameNumber));
            return false;
        }
    }

    @Override // rl.c
    public int c() {
        return this.animatedDrawableBackend.getWidth();
    }

    @Override // rl.c
    public int d() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // rl.c
    public void e(Rect bounds) {
        hm.a aVarI = this.animatedDrawableBackend.i(bounds);
        s.j(aVarI, "forNewBounds(...)");
        if (aVarI != this.animatedDrawableBackend) {
            this.animatedDrawableBackend = aVarI;
            this.animatedImageCompositor = new d(aVarI, this.isNewRenderImplementation, this.callback);
        }
    }
}
