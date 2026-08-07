package rs;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f109074g = new b(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f109080f;

    public b(int i11, int i12, int i13, int i14, int i15, Typeface typeface) {
        this.f109075a = i11;
        this.f109076b = i12;
        this.f109077c = i13;
        this.f109078d = i14;
        this.f109079e = i15;
        this.f109080f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return p0.f115040a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static b b(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static b c(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f109074g.f109075a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f109074g.f109076b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f109074g.f109077c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f109074g.f109078d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f109074g.f109079e, captionStyle.getTypeface());
    }
}
