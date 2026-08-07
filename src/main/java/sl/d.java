package sl;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lsl/d;", "Lrl/b;", "<init>", "()V", "", "frameNumber", "Ltk/a;", "Landroid/graphics/Bitmap;", "e", "(I)Ltk/a;", DateTokenConverter.CONVERTER_KEY, Snapshot.WIDTH, Snapshot.HEIGHT, "f", "(III)Ltk/a;", "", "c", "(I)Z", "Ljn0/h0;", "clear", "bitmapReference", "frameType", "b", "(ILtk/a;I)V", "a", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements rl.b {
    @Override // rl.b
    public void a(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        s.k(bitmapReference, "bitmapReference");
    }

    @Override // rl.b
    public void b(int frameNumber, tk.a<Bitmap> bitmapReference, int frameType) {
        s.k(bitmapReference, "bitmapReference");
    }

    @Override // rl.b
    public boolean c(int frameNumber) {
        return false;
    }

    @Override // rl.b
    public tk.a<Bitmap> d(int frameNumber) {
        return null;
    }

    @Override // rl.b
    public tk.a<Bitmap> e(int frameNumber) {
        return null;
    }

    @Override // rl.b
    public tk.a<Bitmap> f(int frameNumber, int width, int height) {
        return null;
    }

    @Override // rl.b
    public void clear() {
    }
}
