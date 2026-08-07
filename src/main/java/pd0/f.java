package pd0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpd0/f;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "leftPx", "rightPx", "heightPx", "densityScale", "", "color", "Ljn0/h0;", "b", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFI)V", "widthPx", "batteryPct", "chargeLimitPct", "fillColor", "notChargedColor", "beyondLimitColor", "Landroid/graphics/Bitmap;", "a", "(IIFIIIII)Landroid/graphics/Bitmap;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f102146a = new f();

    private f() {
    }

    private final void b(Canvas canvas, Paint paint, float leftPx, float rightPx, float heightPx, float densityScale, int color) {
        float f11 = 4.0f * densityScale;
        float f12 = f11 + f11;
        if (rightPx <= leftPx || f12 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Paint.Style style = paint.getStyle();
        float strokeWidth = paint.getStrokeWidth();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f11);
        canvas.save();
        canvas.clipRect(leftPx, BitmapDescriptorFactory.HUE_RED, rightPx, heightPx);
        float fTan = heightPx * ((float) Math.tan(Math.toRadians(35.0d)));
        for (float f13 = leftPx; f13 < rightPx + fTan; f13 += f12) {
            canvas.drawLine(f13, BitmapDescriptorFactory.HUE_RED, f13 - fTan, heightPx, paint);
        }
        canvas.restore();
        paint.setStyle(style);
        paint.setStrokeWidth(strokeWidth);
    }

    public final Bitmap a(int widthPx, int heightPx, float densityScale, int batteryPct, int chargeLimitPct, int fillColor, int notChargedColor, int beyondLimitColor) {
        float f11;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(widthPx, heightPx, Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int iN = n.n(batteryPct, 0, 100);
        int iN2 = n.n(chargeLimitPct, iN, 100);
        float f12 = 4.0f * densityScale;
        Path path = new Path();
        float f13 = widthPx;
        float f14 = heightPx;
        path.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f13, f14), f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float f15 = (widthPx * iN2) / 100.0f;
        if (iN2 >= 100) {
            f12 = 0.0f;
        }
        float fI = n.i(f12 + f15, f13);
        if (f15 > BitmapDescriptorFactory.HUE_RED) {
            paint.setColor(notChargedColor);
            f11 = f14;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f15, f11, paint);
        } else {
            f11 = f14;
        }
        if (fI < f13) {
            float f16 = f11;
            b(canvas, paint, fI, f13, f16, densityScale, beyondLimitColor);
            canvas = canvas;
            f11 = f16;
            paint = paint;
        }
        float f17 = (widthPx * iN) / 100.0f;
        if (f17 > BitmapDescriptorFactory.HUE_RED) {
            paint.setColor(fillColor);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f17, f11, paint);
        }
        canvas.restore();
        return bitmapCreateBitmap;
    }
}
