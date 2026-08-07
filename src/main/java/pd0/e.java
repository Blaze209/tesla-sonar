package pd0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpd0/e;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "index", "percentageFull", Snapshot.HEIGHT, "offset", "thickness", "deltaXFullBar", "", "tint", "Ljn0/h0;", "b", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFFFI)V", "widthPx", "heightPx", "batteryPct", "chargeLimitPct", "fillColor", "notChargedColor", "beyondLimitColor", "segmentCount", "Landroid/graphics/Bitmap;", "a", "(IIIIIIII)Landroid/graphics/Bitmap;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f102145a = new e();

    private e() {
    }

    private final void b(Canvas canvas, Paint paint, float index, float percentageFull, float height, float offset, float thickness, float deltaXFullBar, int tint) {
        float f11 = index * (offset + thickness);
        float f12 = height - (percentageFull * height);
        float f13 = percentageFull * deltaXFullBar;
        Path path = new Path();
        path.moveTo(f11, height);
        path.lineTo(f11 + f13, f12);
        float f14 = f11 + thickness;
        path.lineTo(f13 + f14, f12);
        path.lineTo(f14, height);
        path.close();
        paint.setColor(tint);
        canvas.drawPath(path, paint);
    }

    public final Bitmap a(int widthPx, int heightPx, int batteryPct, int chargeLimitPct, int fillColor, int notChargedColor, int beyondLimitColor, int segmentCount) {
        int i11;
        if (segmentCount <= 0) {
            throw new IllegalArgumentException("segmentCount must be positive");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(widthPx, heightPx, Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        float f11 = heightPx;
        float f12 = f11 * 0.65f;
        float f13 = (widthPx - f12) / ((segmentCount * 0.5f) + (segmentCount - 1));
        float f14 = f13 * 0.5f;
        int i12 = 0;
        int iN = n.n(batteryPct, 0, 100);
        int iN2 = n.n(chargeLimitPct, iN, 100);
        float f15 = (iN * segmentCount) / 100.0f;
        int i13 = (int) f15;
        float f16 = i13;
        float f17 = f15 - f16;
        int i14 = (int) ((iN2 * segmentCount) / 100.0f);
        while (i12 < segmentCount) {
            if (i12 < i13) {
                i11 = fillColor;
            } else {
                i11 = i12 < i14 ? notChargedColor : beyondLimitColor;
            }
            float f18 = f16;
            b(canvas, paint, i12, 1.0f, f11, f13, f14, f12, i11);
            i12++;
            f16 = f18;
        }
        float f19 = f16;
        if (i13 < segmentCount && f17 > BitmapDescriptorFactory.HUE_RED) {
            b(canvas, paint, f19, f17, f11, f13, f14, f12, fillColor);
        }
        return bitmapCreateBitmap;
    }
}
