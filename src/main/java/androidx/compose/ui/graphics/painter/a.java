package androidx.compose.ui.graphics.painter;

import k3.d3;
import k3.i3;
import p013kotlin.Metadata;
import w4.n;
import w4.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lk3/i3;", "image", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "Lk3/d3;", "filterQuality", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "a", "(Lk3/i3;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final BitmapPainter a(i3 i3Var, long j11, long j12, int i11) {
        BitmapPainter bitmapPainter = new BitmapPainter(i3Var, j11, j12, null);
        bitmapPainter.a(i11);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(i3 i3Var, long j11, long j12, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = n.INSTANCE.a();
        }
        long j13 = j11;
        if ((i12 & 4) != 0) {
            j12 = s.a(i3Var.getWidth(), i3Var.getHeight());
        }
        long j14 = j12;
        if ((i12 & 8) != 0) {
            i11 = d3.INSTANCE.a();
        }
        return a(i3Var, j13, j14, i11);
    }
}
