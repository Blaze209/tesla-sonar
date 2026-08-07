package p009i2;

import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Li2/j1;", "", "<init>", "()V", "Li2/r;", "a", "(Lr2/l;I)Li2/r;", "colors", "Li2/w2;", "c", "(Lr2/l;I)Li2/w2;", "typography", "Li2/c2;", "b", "(Lr2/l;I)Li2/c2;", "shapes", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f74525a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f74526b = 0;

    private j1() {
    }

    public final Colors a(l lVar, int i11) {
        if (o.J()) {
            o.S(-1462282791, i11, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:100)");
        }
        Colors colors = (Colors) lVar.U(s.e());
        if (o.J()) {
            o.R();
        }
        return colors;
    }

    public final Shapes b(l lVar, int i11) {
        if (o.J()) {
            o.S(-1586253541, i11, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:118)");
        }
        Shapes shapes = (Shapes) lVar.U(d2.a());
        if (o.J()) {
            o.R();
        }
        return shapes;
    }

    public final Typography c(l lVar, int i11) {
        if (o.J()) {
            o.S(-1630198856, i11, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:110)");
        }
        Typography w2Var = (Typography) lVar.U(x2.c());
        if (o.J()) {
            o.R();
        }
        return w2Var;
    }
}
