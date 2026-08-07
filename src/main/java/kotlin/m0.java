package kotlin;

import i4.Placeholder;
import i4.TextStyle;
import i4.d;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import t4.t;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001av\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "Lb2/l0;", "current", "Li4/d;", "text", "Li4/r0;", "style", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "", "softWrap", "Lt4/t;", "overflow", "maxLines", "minLines", "", "Li4/d$c;", "Li4/w;", "placeholders", "b", "(Lb2/l0;Li4/d;Li4/r0;Lw4/d;Ln4/q$b;ZIIILjava/util/List;)Lb2/l0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {
    public static final int a(float f11) {
        return Math.round((float) Math.ceil(f11));
    }

    public static final l0 b(l0 l0Var, d dVar, TextStyle textStyle, w4.d dVar2, q.b bVar, boolean z11, int i11, int i12, int i13, List<d.Range<Placeholder>> list) {
        boolean z12;
        int i14;
        int i15;
        int i16;
        List<d.Range<Placeholder>> list2;
        if (s.f(l0Var.getText(), dVar) && s.f(l0Var.getStyle(), textStyle)) {
            z12 = z11;
            if (l0Var.getSoftWrap() == z12) {
                i14 = i11;
                if (t.e(l0Var.getOverflow(), i14)) {
                    i15 = i12;
                    if (l0Var.getMaxLines() == i15) {
                        i16 = i13;
                        if (l0Var.getMinLines() == i16 && s.f(l0Var.getDensity(), dVar2)) {
                            list2 = list;
                            if (s.f(l0Var.h(), list2)) {
                                bVar = bVar;
                                if (l0Var.getFontFamilyResolver() == bVar) {
                                    return l0Var;
                                }
                            } else {
                                bVar = bVar;
                            }
                        } else {
                            bVar = bVar;
                            list2 = list;
                        }
                    } else {
                        bVar = bVar;
                        i16 = i13;
                        list2 = list;
                    }
                } else {
                    bVar = bVar;
                    i15 = i12;
                    i16 = i13;
                    list2 = list;
                }
            }
            return new l0(dVar, textStyle, i15, i16, z12, i14, dVar2, bVar, list2, null);
        }
        z12 = z11;
        i14 = i11;
        i15 = i12;
        i16 = i13;
        list2 = list;
        return new l0(dVar, textStyle, i15, i16, z12, i14, dVar2, bVar, list2, null);
    }

    public static /* synthetic */ l0 c(l0 l0Var, d dVar, TextStyle textStyle, w4.d dVar2, q.b bVar, boolean z11, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            z11 = true;
        }
        if ((i14 & 64) != 0) {
            i11 = t.INSTANCE.a();
        }
        if ((i14 & 128) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i14 & 256) != 0) {
            i13 = 1;
        }
        return b(l0Var, dVar, textStyle, dVar2, bVar, z11, i11, i12, i13, list);
    }
}
