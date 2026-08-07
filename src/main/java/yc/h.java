package yc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p013kotlin.Metadata;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyc/h;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "Lsc/g;", "size", "Lsc/f;", "scale", "c", "(ZLandroid/graphics/Bitmap;Lsc/g;Lsc/f;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lsc/g;Lsc/f;Z)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f125348a = new h();

    private h() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == b.e(config);
    }

    private final boolean c(boolean allowInexactSize, Bitmap bitmap, Size size, sc.f scale) {
        if (allowInexactSize) {
            return true;
        }
        long jB = gc.j.b(bitmap.getWidth(), bitmap.getHeight(), size, scale, Size.f111062d);
        return gc.j.d(bitmap.getWidth(), bitmap.getHeight(), q.c(jB), q.d(jB), scale) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, Size size, sc.f scale, boolean allowInexactSize) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(allowInexactSize, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iG = g0.g(drawableMutate);
        if (iG <= 0) {
            iG = 512;
        }
        int iB = g0.b(drawableMutate);
        int i11 = iB > 0 ? iB : 512;
        long jB = gc.j.b(iG, i11, size, scale, Size.f111062d);
        double d11 = gc.j.d(iG, i11, q.c(jB), q.d(jB), scale);
        int iC = yn0.a.c(((double) iG) * d11);
        int iC2 = yn0.a.c(d11 * ((double) i11));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, b.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i12, i13, i14, i15);
        return bitmapCreateBitmap;
    }
}
