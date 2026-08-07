package p014n4;

import android.graphics.Typeface;
import android.os.Build;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Ln4/c0;", "", "typeface", "Ln4/p;", "font", "Ln4/f0;", "requestedWeight", "Ln4/b0;", "requestedStyle", "a", "(ILjava/lang/Object;Ln4/p;Ln4/f0;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object a(int i11, Object obj, p pVar, FontWeight fontWeight, int i12) {
        boolean z11;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z12 = false;
        if (!c0.k(i11) || s.f(pVar.getWeight(), fontWeight)) {
            z11 = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (fontWeight.compareTo(h.a(companion)) < 0 || pVar.getWeight().compareTo(h.a(companion)) >= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        boolean z13 = c0.j(i11) && !b0.f(i12, pVar.getStyle());
        if (!z13 && !z11) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return d1.f92904a.a((Typeface) obj, z11 ? fontWeight.k() : pVar.getWeight().k(), z13 ? b0.f(i12, b0.INSTANCE.a()) : b0.f(pVar.getStyle(), b0.INSTANCE.a()));
        }
        if (z13 && b0.f(i12, b0.INSTANCE.a())) {
            z12 = true;
        }
        return Typeface.create((Typeface) obj, h.b(z11, z12));
    }
}
