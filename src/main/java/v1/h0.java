package v1;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv1/h0;", "Lv1/g0;", "<init>", "()V", "Landroidx/compose/ui/d;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "Ld3/c$c;", "alignment", "b", "(Landroidx/compose/ui/d;Ld3/c$c;)Landroidx/compose/ui/d;", "Lz3/p;", "alignmentLine", "e", "(Landroidx/compose/ui/d;Lz3/p;)Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f117504a = new h0();

    private h0() {
    }

    @Override // v1.g0
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, boolean z11) {
        if (f11 > 0.0d) {
            return dVar.g(new LayoutWeightElement(bo0.n.i(f11, Float.MAX_VALUE), z11));
        }
        throw new IllegalArgumentException(("invalid weight " + f11 + "; must be greater than zero").toString());
    }

    @Override // v1.g0
    public androidx.compose.ui.d b(androidx.compose.ui.d dVar, d3.c.InterfaceC1212c interfaceC1212c) {
        return dVar.g(new VerticalAlignElement(interfaceC1212c));
    }

    @Override // v1.g0
    public androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return e(dVar, z3.b.a());
    }

    public androidx.compose.ui.d e(androidx.compose.ui.d dVar, z3.p pVar) {
        return dVar.g(new WithAlignmentLineElement(pVar));
    }
}
