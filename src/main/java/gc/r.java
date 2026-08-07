package gc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgc/r;", "", "<init>", "()V", "", "mimeType", "Lokio/j;", "source", "Lgc/q;", "strategy", "Lgc/l;", "a", "(Ljava/lang/String;Lokio/j;Lgc/q;)Lgc/l;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;Lgc/l;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f67827a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Paint paint = new Paint(3);

    private r() {
    }

    public final l a(String mimeType, okio.j source, q strategy) {
        if (!strategy.e(mimeType, source)) {
            return l.f67817d;
        }
        e7.a aVar = new e7.a(new m(source.peek().K3()));
        return new l(aVar.H(), aVar.w());
    }

    public final Bitmap b(Bitmap inBitmap, l exifData) {
        if (!exifData.getIsFlipped() && !s.a(exifData)) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (s.a(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        float f11 = rectF.left;
        if (f11 != BitmapDescriptorFactory.HUE_RED || rectF.top != BitmapDescriptorFactory.HUE_RED) {
            matrix.postTranslate(-f11, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = s.b(exifData) ? Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), yc.b.c(inBitmap)) : Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), yc.b.c(inBitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(inBitmap, matrix, paint);
        inBitmap.recycle();
        return bitmapCreateBitmap;
    }
}
