package p013kotlin.text;

import bo0.n;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.collections.h1;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0019\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\r\u001a\u0011\u0010\u0011\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aO\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u001e*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00132\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001fH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "", "O1", "(Ljava/lang/CharSequence;)C", "", "index", "P1", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "Q1", "S1", "", "n", "M1", "(Ljava/lang/String;I)Ljava/lang/String;", "N1", "T1", "U1", "R1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "K1", "(Ljava/lang/CharSequence;)Z", "size", "", "L1", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "step", "partialWindows", "V1", "(Ljava/lang/CharSequence;IIZ)Ljava/util/List;", "R", "Lkotlin/Function1;", "transform", "W1", "(Ljava/lang/CharSequence;IIZLwn0/l;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class l0 extends j0 {
    public static boolean K1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static List<String> L1(CharSequence charSequence, int i11) {
        s.k(charSequence, "<this>");
        return V1(charSequence, i11, i11, true);
    }

    public static String M1(String str, int i11) {
        s.k(str, "<this>");
        if (i11 >= 0) {
            String strSubstring = str.substring(n.j(i11, str.length()));
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static String N1(String str, int i11) {
        s.k(str, "<this>");
        if (i11 >= 0) {
            return T1(str, n.f(str.length() - i11, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static char O1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character P1(CharSequence charSequence, int i11) {
        s.k(charSequence, "<this>");
        if (i11 < 0 || i11 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i11));
    }

    public static char Q1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(i0.p0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence R1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static char S1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String T1(String str, int i11) {
        s.k(str, "<this>");
        if (i11 >= 0) {
            String strSubstring = str.substring(0, n.j(i11, str.length()));
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static String U1(String str, int i11) {
        s.k(str, "<this>");
        if (i11 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - n.j(i11, length));
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    public static List<String> V1(CharSequence charSequence, int i11, int i12, boolean z11) {
        s.k(charSequence, "<this>");
        return W1(charSequence, i11, i12, z11, new l() { // from class: kotlin.text.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return l0.X1((CharSequence) obj);
            }
        });
    }

    public static final <R> List<R> W1(CharSequence charSequence, int i11, int i12, boolean z11, l<? super CharSequence, ? extends R> transform) {
        s.k(charSequence, "<this>");
        s.k(transform, "transform");
        h1.a(i11, i12);
        int length = charSequence.length();
        int i13 = 0;
        ArrayList arrayList = new ArrayList((length / i12) + (length % i12 == 0 ? 0 : 1));
        while (i13 >= 0 && i13 < length) {
            int i14 = i13 + i11;
            if (i14 < 0 || i14 > length) {
                if (!z11) {
                    break;
                }
                i14 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i13, i14)));
            i13 += i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X1(CharSequence it) {
        s.k(it, "it");
        return it.toString();
    }
}
