package f90;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"Li3/f;", "Landroidx/compose/ui/focus/d;", "focusDirection", "", "a", "(Li3/f;I)Z", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final boolean a(i3.f moveFocusSafely, int i11) {
        s.k(moveFocusSafely, "$this$moveFocusSafely");
        try {
            return moveFocusSafely.h(i11);
        } catch (IllegalArgumentException e11) {
            o30.d.INSTANCE.a(false).a("Skipping moving focus due to exception: " + e11);
            return false;
        }
    }
}
