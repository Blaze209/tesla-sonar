package mm;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmm/a;", "Lmm/d;", "Lxm/d;", "bitmapPool", "Lpm/a;", "closeableReferenceFactory", "<init>", "(Lxm/d;Lpm/a;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ltk/a;", "Landroid/graphics/Bitmap;", DateTokenConverter.CONVERTER_KEY, "(IILandroid/graphics/Bitmap$Config;)Ltk/a;", "a", "Lxm/d;", "b", "Lpm/a;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(21)
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xm.d bitmapPool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pm.a closeableReferenceFactory;

    public a(xm.d bitmapPool, pm.a closeableReferenceFactory) {
        s.k(bitmapPool, "bitmapPool");
        s.k(closeableReferenceFactory, "closeableReferenceFactory");
        this.bitmapPool = bitmapPool;
        this.closeableReferenceFactory = closeableReferenceFactory;
    }

    @Override // mm.d
    public tk.a<Bitmap> d(int width, int height, Bitmap.Config bitmapConfig) {
        s.k(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = this.bitmapPool.get(fn.c.i(width, height, bitmapConfig));
        if (bitmap.getAllocationByteCount() < width * height * fn.c.h(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(width, height, bitmapConfig);
        tk.a<Bitmap> aVarC = this.closeableReferenceFactory.c(bitmap, this.bitmapPool);
        s.j(aVarC, "create(...)");
        return aVarC;
    }
}
