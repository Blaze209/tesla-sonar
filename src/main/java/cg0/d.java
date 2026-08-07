package cg0;

import android.graphics.Rect;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcg0/c;", "Lzf0/i0;", "imageToAnalyze", "Landroid/graphics/Rect;", "a", "(Lcg0/c;Lzf0/i0;)Landroid/graphics/Rect;", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final Rect a(ViewfinderInfo viewfinderInfo, i0 imageToAnalyze) {
        int height;
        int width;
        double d11;
        s.k(viewfinderInfo, "<this>");
        s.k(imageToAnalyze, "imageToAnalyze");
        int iWidth = viewfinderInfo.getViewport().width();
        int iHeight = viewfinderInfo.getViewport().height();
        if (iWidth == 0 || iHeight == 0) {
            return null;
        }
        if (imageToAnalyze.d() == 90 || imageToAnalyze.d() == 270) {
            height = imageToAnalyze.getHeight();
            width = imageToAnalyze.getWidth();
        } else {
            height = imageToAnalyze.getWidth();
            width = imageToAnalyze.getHeight();
        }
        double d12 = height;
        double d13 = iWidth;
        double d14 = d12 / d13;
        double d15 = width;
        double d16 = iHeight;
        double d17 = d15 / d16;
        double dMin = Math.min(d14, d17);
        double d18 = 0.0d;
        if (d14 > d17) {
            d11 = 0.0d;
            d18 = (d12 - (d13 * dMin)) / 2.0d;
        } else {
            d11 = (d15 - (d16 * dMin)) / 2.0d;
        }
        double d19 = d18 + (((double) (viewfinderInfo.getRegion().left - viewfinderInfo.getViewport().left)) * dMin);
        double d21 = d11 + (((double) (viewfinderInfo.getRegion().top - viewfinderInfo.getViewport().top)) * dMin);
        double dWidth = ((double) viewfinderInfo.getRegion().width()) * dMin;
        double dHeight = ((double) viewfinderInfo.getRegion().height()) * dMin;
        return (imageToAnalyze.d() == 90 || imageToAnalyze.d() == 270) ? new Rect((int) d21, (int) d19, (int) (d21 + dHeight), (int) (d19 + dWidth)) : new Rect((int) d19, (int) d21, (int) (d19 + dWidth), (int) (d21 + dHeight));
    }
}
