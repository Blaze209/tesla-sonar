package v1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lv1/g0;", "", "Landroidx/compose/ui/d;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "Ld3/c$c;", "alignment", "b", "(Landroidx/compose/ui/d;Ld3/c$c;)Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g0 {
    static /* synthetic */ androidx.compose.ui.d c(g0 g0Var, androidx.compose.ui.d dVar, float f11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return g0Var.a(dVar, f11, z11);
    }

    androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, boolean z11);

    androidx.compose.ui.d b(androidx.compose.ui.d dVar, d3.c.InterfaceC1212c interfaceC1212c);

    androidx.compose.ui.d d(androidx.compose.ui.d dVar);
}
