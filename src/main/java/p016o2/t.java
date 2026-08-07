package p016o2;

import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lo2/t;", "", "<init>", "()V", "Lo2/i;", "a", "(Lr2/l;I)Lo2/i;", "colorScheme", "Lo2/s0;", "c", "(Lr2/l;I)Lo2/s0;", "typography", "Lo2/e0;", "b", "(Lr2/l;I)Lo2/e0;", "shapes", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f96158a = new t();

    private t() {
    }

    public final ColorScheme a(l lVar, int i11) {
        if (o.J()) {
            o.S(-561618718, i11, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:83)");
        }
        ColorScheme colorScheme = (ColorScheme) lVar.U(j.e());
        if (o.J()) {
            o.R();
        }
        return colorScheme;
    }

    public final Shapes b(l lVar, int i11) {
        if (o.J()) {
            o.S(419509830, i11, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:99)");
        }
        Shapes shapes = (Shapes) lVar.U(f0.c());
        if (o.J()) {
            o.R();
        }
        return shapes;
    }

    public final Typography c(l lVar, int i11) {
        if (o.J()) {
            o.S(-942794935, i11, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:91)");
        }
        Typography typography = (Typography) lVar.U(t0.a());
        if (o.J()) {
            o.R();
        }
        return typography;
    }
}
