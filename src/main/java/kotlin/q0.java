package kotlin;

import i4.TextStyle;
import i4.o;
import p013kotlin.collections.v;
import p013kotlin.text.t;
import p014n4.q;
import w4.c;
import w4.d;
import w4.s;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Li4/r0;", "style", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Lw4/r;", "a", "(Li4/r0;Lw4/d;Ln4/q$b;Ljava/lang/String;I)J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f15854a = t.R("H", 10);

    public static final long a(TextStyle textStyle, d dVar, q.b bVar, String str, int i11) {
        o oVarA = i4.t.a(str, textStyle, c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? v.m() : v.m(), (64 & 64) != 0 ? v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i11, (64 & 256) != 0 ? false : false);
        return s.a(m0.a(oVarA.d()), m0.a(oVarA.getHeight()));
    }

    public static /* synthetic */ long b(TextStyle textStyle, d dVar, q.b bVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = f15854a;
        }
        if ((i12 & 16) != 0) {
            i11 = 1;
        }
        return a(textStyle, dVar, bVar, str, i11);
    }

    public static final String c() {
        return f15854a;
    }
}
