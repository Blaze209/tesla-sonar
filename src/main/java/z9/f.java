package z9;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import r7.i;
import r7.j;
import r7.k;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class f {
    @SuppressLint({"WrongConstant"})
    public static void a(Spannable spannable, int i11, int i12, g gVar, c cVar, Map<String, g> map, int i13) {
        c cVarE;
        g gVarF;
        int i14;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i11, i12, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (gVar.s()) {
            j.b(spannable, new ForegroundColorSpan(gVar.d()), i11, i12, 33);
        }
        if (gVar.r()) {
            j.b(spannable, new BackgroundColorSpan(gVar.b()), i11, i12, 33);
        }
        if (gVar.e() != null) {
            j.b(spannable, new TypefaceSpan(gVar.e()), i11, i12, 33);
        }
        if (gVar.q() != null) {
            b bVar = (b) s7.a.f(gVar.q());
            int i15 = bVar.f127903a;
            if (i15 == -1) {
                i15 = (i13 == 2 || i13 == 1) ? 3 : 1;
                i14 = 1;
            } else {
                i14 = bVar.f127904b;
            }
            int i16 = bVar.f127905c;
            if (i16 == -2) {
                i16 = 1;
            }
            j.b(spannable, new k(i15, i14, i16), i11, i12, 33);
        }
        int iL = gVar.l();
        if (iL == 2) {
            c cVarD = d(cVar, map);
            if (cVarD != null && (cVarE = e(cVarD, map)) != null) {
                if (cVarE.g() != 1 || cVarE.f(0).f127907b == null) {
                    t.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) q0.l(cVarE.f(0).f127907b);
                    g gVarF2 = f(cVarE.f127911f, cVarE.l(), map);
                    int iK = gVarF2 != null ? gVarF2.k() : -1;
                    if (iK == -1 && (gVarF = f(cVarD.f127911f, cVarD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new i(str, iK), i11, i12, 33);
                }
            }
        } else if (iL == 3 || iL == 4) {
            spannable.setSpan(new a(), i11, i12, 33);
        }
        if (gVar.p()) {
            j.b(spannable, new r7.g(), i11, i12, 33);
        }
        int iG = gVar.g();
        if (iG == 1) {
            j.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i11, i12, 33);
        } else if (iG == 2) {
            j.b(spannable, new RelativeSizeSpan(gVar.f()), i11, i12, 33);
        } else {
            if (iG != 3) {
                return;
            }
            j.a(spannable, gVar.f() / 100.0f, i11, i12, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static c d(c cVar, Map<String, g> map) {
        while (cVar != null) {
            g gVarF = f(cVar.f127911f, cVar.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return cVar;
            }
            cVar = cVar.f127915j;
        }
        return null;
    }

    private static c e(c cVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g gVarF = f(cVar2.f127911f, cVar2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return cVar2;
            }
            for (int iG = cVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(cVar2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i11 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i11 < length) {
                    gVar2.a(map.get(strArr[i11]));
                    i11++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i11 < length2) {
                    gVar.a(map.get(strArr[i11]));
                    i11++;
                }
            }
        }
        return gVar;
    }
}
