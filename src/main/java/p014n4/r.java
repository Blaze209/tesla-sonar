package p014n4;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.collections.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Ln4/p;", OrcaFlavourKeys.FONTS, "Ln4/q;", "b", "([Ln4/p;)Ln4/q;", "Ln4/u0;", "typeface", "a", "(Ln4/u0;)Ln4/q;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {
    public static final q a(u0 u0Var) {
        return new LoadedFontFamily(u0Var);
    }

    public static final q b(p... pVarArr) {
        return new FontListFontFamily(n.h(pVarArr));
    }
}
