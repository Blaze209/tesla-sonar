package ia;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f77178g = new a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f77184f;

    public a(int i11, int i12, int i13, int i14, int i15, Typeface typeface) {
        this.f77179a = i11;
        this.f77180b = i12;
        this.f77181c = i13;
        this.f77182d = i14;
        this.f77183e = i15;
        this.f77184f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f77178g.f77179a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f77178g.f77180b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f77178g.f77181c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f77178g.f77182d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f77178g.f77183e, captionStyle.getTypeface());
    }
}
