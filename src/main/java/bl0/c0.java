package bl0;

import com.google.android.gms.actions.SearchIntents;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"", SearchIntents.EXTRA_QUERY, "", "startIndex", "limit", "", "decode", "Lbl0/x;", "c", "(Ljava/lang/String;IIZ)Lbl0/x;", "Lbl0/y;", "Ljn0/h0;", "b", "(Lbl0/y;Ljava/lang/String;IIZ)V", "nameIndex", "equalIndex", "endIndex", "a", "(Lbl0/y;Ljava/lang/String;IIIZ)V", "start", "end", "", "text", "e", "(IILjava/lang/CharSequence;)I", "f", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c0 {
    private static final void a(y yVar, String str, int i11, int i12, int i13, boolean z11) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i12 == -1) {
            int iF = f(i11, i13, str);
            int iE = e(iF, i13, str);
            if (iE > iF) {
                if (z11) {
                    strSubstring3 = a.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    p013kotlin.jvm.internal.s.j(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                yVar.d(strSubstring3, p013kotlin.collections.v.m());
                return;
            }
            return;
        }
        int iF2 = f(i11, i12, str);
        int iE2 = e(iF2, i12, str);
        if (iE2 > iF2) {
            if (z11) {
                strSubstring = a.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int iF3 = f(i12 + 1, i13, str);
            int iE3 = e(iF3, i13, str);
            if (z11) {
                strSubstring2 = a.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            yVar.f(strSubstring, strSubstring2);
        }
    }

    private static final void b(y yVar, String str, int i11, int i12, boolean z11) {
        int i13;
        int i14;
        int iP0 = p013kotlin.text.t.p0(str);
        int i15 = 0;
        if (i11 <= iP0) {
            int i16 = -1;
            int i17 = i11;
            int i18 = i17;
            while (i15 != i12) {
                char cCharAt = str.charAt(i18);
                if (cCharAt == '&') {
                    a(yVar, str, i17, i16, i18, z11);
                    i15++;
                    i16 = -1;
                    i17 = i18 + 1;
                } else if (cCharAt == '=' && i16 == -1) {
                    i16 = i18;
                }
                if (i18 != iP0) {
                    i18++;
                } else {
                    i14 = i17;
                    i13 = i16;
                }
            }
            return;
        }
        i13 = -1;
        i14 = i11;
        if (i15 == i12) {
            return;
        }
        a(yVar, str, i14, i13, str.length(), z11);
    }

    public static final x c(String query, int i11, int i12, boolean z11) {
        p013kotlin.jvm.internal.s.k(query, "query");
        if (i11 > p013kotlin.text.t.p0(query)) {
            return x.INSTANCE.a();
        }
        x.Companion companion = x.INSTANCE;
        y yVarB = b0.b(0, 1, null);
        b(yVarB, query, i11, i12, z11);
        return yVarB.build();
    }

    public static /* synthetic */ x d(String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 1000;
        }
        if ((i13 & 8) != 0) {
            z11 = true;
        }
        return c(str, i11, i12, z11);
    }

    private static final int e(int i11, int i12, CharSequence charSequence) {
        while (i12 > i11 && p013kotlin.text.a.c(charSequence.charAt(i12 - 1))) {
            i12--;
        }
        return i12;
    }

    private static final int f(int i11, int i12, CharSequence charSequence) {
        while (i11 < i12 && p013kotlin.text.a.c(charSequence.charAt(i11))) {
            i11++;
        }
        return i11;
    }
}
