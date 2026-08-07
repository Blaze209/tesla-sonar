package wp0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import yr0.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0013\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0007*\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwp0/c;", "Ljp0/b;", "Lwp0/b;", "<init>", "()V", "", "", "", "startIndex", "charsCount", "", "j", "(Ljava/util/List;II)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;II)Ljava/lang/String;", "h", "e", "g", "a", "(Ljava/lang/String;I)I", "sourceStringLength", "b", "(II)I", "expression", "data", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f122180a = new c();

    private c() {
    }

    private final int a(String str, int i11) {
        Integer numValueOf = Integer.valueOf(str.length() + i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int b(int i11, int i12) {
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() > i12) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i12;
    }

    private final String d(String str, int i11, int i12) {
        if (i11 >= 0 && i12 > 0) {
            return h(str, i11, i12);
        }
        if (i11 >= 0 && i12 < 0) {
            String strSubstring = str.substring(i11, str.length() + i12);
            s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        if (i11 < 0 && i12 < 0) {
            return e(str, i11, i12);
        }
        if (i11 >= 0 || i12 <= 0) {
            return null;
        }
        return g(str, i11, i12);
    }

    private final String e(String str, int i11, int i12) {
        String strSubstring = str.substring(a(str, i11), b(str.length() + i12, str.length()));
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String g(String str, int i11, int i12) {
        int iA = a(str, i11);
        String strSubstring = str.substring(iA, b(i12 + iA, str.length()));
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String h(String str, int i11, int i12) {
        String strSubstring = str.substring(i11, b(i12 + i11, str.length()));
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String i(String str, int i11) {
        if (i11 >= 0) {
            String strSubstring = str.substring(i11);
            s.j(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        if (Math.abs(i11) > str.length()) {
            return str;
        }
        String strSubstring2 = str.substring(str.length() + i11);
        s.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return strSubstring2;
    }

    private final String j(List<? extends Object> list, int i11, int i12) {
        Object objB;
        String strY0 = v.y0(k(v.q0(list)), ",", null, null, 0, null, null, 62, null);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            if (list.size() == 2) {
                strY0 = f122180a.i(strY0, i11);
            } else if (list.size() > 2) {
                strY0 = f122180a.d(strY0, i11, i12);
            }
            objB = jn0.s.b(strY0);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String f(Object expression, Object data) {
        List<? extends Object> listC = yr0.a.c(expression);
        return f122180a.j(listC, d.b(String.valueOf(yr0.c.b(listC))), d.b(String.valueOf(yr0.c.c(listC))));
    }

    public List<String> k(Object obj) {
        return b.a.d(this, obj);
    }
}
