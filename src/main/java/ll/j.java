package ll;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0018\u001a\u00020\u00138&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\"\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lll/j;", "", "", "radius", "Ljn0/h0;", "g", "(F)V", "", "color", Snapshot.WIDTH, "b", "(IF)V", "", "repeatEdgePixels", "h", "(Z)V", "isCircle", "()Z", DateTokenConverter.CONVERTER_KEY, "", "getRadii", "()[F", "t", "([F)V", "radii", "getPadding", "()F", "f", "padding", "getScaleDownInsideBorders", "q", "scaleDownInsideBorders", "getPaintFilterBitmap", "j", "paintFilterBitmap", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface j {
    void b(int color, float width);

    void d(boolean z11);

    void f(float f11);

    void g(float radius);

    void h(boolean repeatEdgePixels);

    void j(boolean z11);

    void q(boolean z11);

    void t(float[] fArr);
}
