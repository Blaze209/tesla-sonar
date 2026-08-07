package lo0;

import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\u001a[\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llo0/o;", "T", "", "Lkotlin/Function1;", "Ljn0/h0;", "alternativeFormats", "primaryFormat", "a", "(Llo0/o;[Lwn0/l;Lwn0/l;)V", "", "ifZero", "format", "c", "(Llo0/o;Ljava/lang/String;Lwn0/l;)V", "", "value", "b", "(Llo0/o;C)V", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {
    public static final <T extends o> void a(T t11, wn0.l<? super T, jn0.h0>[] alternativeFormats, wn0.l<? super T, jn0.h0> primaryFormat) {
        p013kotlin.jvm.internal.s.k(t11, "<this>");
        p013kotlin.jvm.internal.s.k(alternativeFormats, "alternativeFormats");
        p013kotlin.jvm.internal.s.k(primaryFormat, "primaryFormat");
        if (!(t11 instanceof b)) {
            throw new IllegalStateException("impossible");
        }
        ((b) t11).j((wn0.l[]) Arrays.copyOf(alternativeFormats, alternativeFormats.length), (wn0.l) u0.g(primaryFormat, 1));
    }

    public static final void b(o oVar, char c11) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        oVar.d(String.valueOf(c11));
    }

    public static final <T extends o> void c(T t11, String ifZero, wn0.l<? super T, jn0.h0> format) {
        p013kotlin.jvm.internal.s.k(t11, "<this>");
        p013kotlin.jvm.internal.s.k(ifZero, "ifZero");
        p013kotlin.jvm.internal.s.k(format, "format");
        if (!(t11 instanceof b)) {
            throw new IllegalStateException("impossible");
        }
        ((b) t11).k(ifZero, (wn0.l) u0.g(format, 1));
    }

    public static /* synthetic */ void d(o oVar, String str, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        c(oVar, str, lVar);
    }
}
