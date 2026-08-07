package v1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lk5/e;", "Lv1/u;", "e", "(Lk5/e;)Lv1/u;", "insets", "", "name", "Lv1/l0;", "a", "(Lk5/e;Ljava/lang/String;)Lv1/l0;", "Lv1/m0$a;", "Lv1/m0;", "b", "(Lv1/m0$a;Lr2/l;I)Lv1/m0;", "ime", "c", "navigationBars", DateTokenConverter.CONVERTER_KEY, "systemBars", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s0 {
    public static final l0 a(k5.e eVar, String str) {
        return new l0(e(eVar), str);
    }

    public static final m0 b(m0.Companion companion, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-1466917860, i11, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        a aVarD = n0.INSTANCE.c(lVar, 6).getIme();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return aVarD;
    }

    public static final m0 c(m0.Companion companion, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(1596175702, i11, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        a aVarE = n0.INSTANCE.c(lVar, 6).getNavigationBars();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return aVarE;
    }

    public static final m0 d(m0.Companion companion, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-282936756, i11, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        a aVarG = n0.INSTANCE.c(lVar, 6).getSystemBars();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return aVarG;
    }

    public static final InsetsValues e(k5.e eVar) {
        return new InsetsValues(eVar.f84924a, eVar.f84925b, eVar.f84926c, eVar.f84927d);
    }
}
