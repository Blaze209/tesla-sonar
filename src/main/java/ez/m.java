package ez;

import android.util.Size;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/util/Size;", "left", "right", "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/util/Size;Landroid/util/Size;)I", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/util/Size;Landroid/util/Size;)F", "Ls0/c$a;", "size", "e", "(Ls0/c$a;Landroid/util/Size;)Ls0/c$a;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {
    private static final float d(Size size, Size size2) {
        return Math.abs(n.a(size) - n.a(size2));
    }

    public static final s0.c.a e(s0.c.a aVar, final Size size) {
        s.k(aVar, "<this>");
        s.k(size, "size");
        s0.c.a aVarE = aVar.e(new s0.b() { // from class: ez.j
            @Override // s0.b
            public final List a(List list, int i11) {
                return m.f(size, list, i11);
            }
        });
        s.j(aVarE, "setResolutionFilter(...)");
        return aVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(final Size size, List supportedSizes, int i11) {
        s.k(supportedSizes, "supportedSizes");
        return v.a1(supportedSizes, mn0.a.b(new wn0.l() { // from class: ez.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m.g(size, (Size) obj);
            }
        }, new wn0.l() { // from class: ez.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m.h(size, (Size) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable g(Size size, Size size2) {
        s.h(size2);
        return Float.valueOf(d(size2, size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable h(Size size, Size size2) {
        s.h(size2);
        return Integer.valueOf(i(size2, size));
    }

    private static final int i(Size size, Size size2) {
        return Math.abs((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }
}
