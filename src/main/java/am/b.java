package am;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jµ\u0001\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lam/b;", "", "<init>", "()V", "", "", "componentAttribution", "shortcutAttribution", "dataSourceExtras", "imageSourceExtras", "Landroid/graphics/Rect;", "viewportDimensions", "scaleType", "Landroid/graphics/PointF;", "focusPoint", "imageExtras", "callerContext", "", "logWithHighSamplingRate", "Landroid/net/Uri;", "mainUri", "Lbm/b$a;", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Lbm/b$a;", "middleware_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1759a = new b();

    private b() {
    }

    public static final bm.b.a a(Map<String, ? extends Object> componentAttribution, Map<String, ? extends Object> shortcutAttribution, Map<String, ? extends Object> dataSourceExtras, Map<String, ? extends Object> imageSourceExtras, Rect viewportDimensions, String scaleType, PointF focusPoint, Map<String, ? extends Object> imageExtras, Object callerContext, boolean logWithHighSamplingRate, Uri mainUri) {
        s.k(componentAttribution, "componentAttribution");
        s.k(shortcutAttribution, "shortcutAttribution");
        bm.b.a aVar = new bm.b.a();
        if (viewportDimensions != null) {
            aVar.viewportWidth = viewportDimensions.width();
            aVar.viewportHeight = viewportDimensions.height();
        }
        aVar.scaleType = scaleType;
        if (focusPoint != null) {
            aVar.focusX = Float.valueOf(focusPoint.x);
            aVar.focusY = Float.valueOf(focusPoint.y);
        }
        aVar.callerContext = callerContext;
        aVar.logWithHighSamplingRate = logWithHighSamplingRate;
        aVar.mainUri = mainUri;
        aVar.datasourceExtras = dataSourceExtras;
        aVar.imageExtras = imageExtras;
        aVar.shortcutExtras = shortcutAttribution;
        aVar.componentExtras = componentAttribution;
        aVar.imageSourceExtras = imageSourceExtras;
        return aVar;
    }
}
