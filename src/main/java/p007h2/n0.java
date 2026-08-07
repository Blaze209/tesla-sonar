package p007h2;

import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextLayoutResult;
import j3.g;
import j3.h;
import p013kotlin.Metadata;
import w4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li4/m0;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Lj3/g;", "b", "(Li4/m0;IZZ)J", "", "a", "(Li4/m0;IZZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n0 {
    public static final float a(TextLayoutResult textLayoutResult, int i11, boolean z11, boolean z12) {
        return textLayoutResult.j(i11, textLayoutResult.c(((!z11 || z12) && (z11 || !z12)) ? Math.max(i11 + (-1), 0) : i11) == textLayoutResult.y(i11));
    }

    public static final long b(TextLayoutResult textLayoutResult, int i11, boolean z11, boolean z12) {
        int iQ = textLayoutResult.q(i11);
        return iQ >= textLayoutResult.n() ? g.INSTANCE.b() : h.a(n.m(a(textLayoutResult, i11, z11, z12), BitmapDescriptorFactory.HUE_RED, r.g(textLayoutResult.getSize())), n.m(textLayoutResult.m(iQ), BitmapDescriptorFactory.HUE_RED, r.f(textLayoutResult.getSize())));
    }
}
