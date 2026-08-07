package sl;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ/\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J-\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"Lsl/c;", "Lrl/b;", "<init>", "()V", "Ljn0/h0;", "g", "", "frameNumber", "Ltk/a;", "Landroid/graphics/Bitmap;", "e", "(I)Ltk/a;", DateTokenConverter.CONVERTER_KEY, Snapshot.WIDTH, Snapshot.HEIGHT, "f", "(III)Ltk/a;", "", "c", "(I)Z", "clear", "bitmapReference", "frameType", "b", "(ILtk/a;I)V", "a", "I", "lastFrameNumber", "Ltk/a;", "lastBitmapReference", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements rl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int lastFrameNumber = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private tk.a<Bitmap> lastBitmapReference;

    private final synchronized void g() {
        tk.a.C(this.lastBitmapReference);
        this.lastBitmapReference = null;
        this.lastFrameNumber = -1;
    }

    @Override // rl.b
    public void a(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        s.k(bitmapReference, "bitmapReference");
    }

    @Override // rl.b
    public synchronized void b(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        try {
            s.k(bitmapReference, "bitmapReference");
            if (this.lastBitmapReference != null) {
                Bitmap bitmapH = bitmapReference.H();
                tk.a<Bitmap> aVar = this.lastBitmapReference;
                if (s.f(bitmapH, aVar != null ? aVar.H() : null)) {
                    return;
                }
            }
            tk.a.C(this.lastBitmapReference);
            this.lastBitmapReference = tk.a.t(bitmapReference);
            this.lastFrameNumber = frameNumber;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // rl.b
    public synchronized boolean c(int frameNumber) {
        return frameNumber == this.lastFrameNumber && tk.a.b0(this.lastBitmapReference);
    }

    @Override // rl.b
    public synchronized void clear() {
        g();
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> d(int frameNumber) {
        return tk.a.t(this.lastBitmapReference);
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> e(int frameNumber) {
        return this.lastFrameNumber == frameNumber ? tk.a.t(this.lastBitmapReference) : null;
    }

    @Override // rl.b
    public synchronized tk.a<Bitmap> f(int frameNumber, int width, int height) {
        tk.a<Bitmap> aVarT;
        try {
            aVarT = tk.a.t(this.lastBitmapReference);
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
        return aVarT;
    }
}
