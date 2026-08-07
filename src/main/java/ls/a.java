package ls;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import gs.h;
import gs.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ou.e;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f90697t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f90698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b f90699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, c> f90700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f90701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f90702s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f90701r = -3.4028235E38f;
        this.f90702s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f90698o = false;
            this.f90699p = null;
            return;
        }
        this.f90698o = true;
        String strC = p0.C(list.get(0));
        ts.a.a(strC.startsWith("Format:"));
        this.f90699p = (b) ts.a.e(b.a(strC));
        H(new d0(list.get(1)), e.f100000c);
    }

    private static int B(long j11, List<Long> list, List<List<gs.b>> list2) {
        int i11;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            }
            if (list.get(size).longValue() == j11) {
                return size;
            }
            if (list.get(size).longValue() < j11) {
                i11 = size + 1;
                break;
            }
            size--;
        }
        list.add(i11, Long.valueOf(j11));
        list2.add(i11, i11 == 0 ? new ArrayList() : new ArrayList(list2.get(i11 - 1)));
        return i11;
    }

    private static float C(int i11) {
        if (i11 == 0) {
            return 0.05f;
        }
        if (i11 != 1) {
            return i11 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static gs.b D(String str, c cVar, c.b bVar, float f11, float f12) {
        SpannableString spannableString = new SpannableString(str);
        gs.b.C1421b c1421bO = new gs.b.C1421b().o(spannableString);
        if (cVar != null) {
            if (cVar.f90710c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f90710c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f90717j == 3 && cVar.f90711d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f90711d.intValue()), 0, spannableString.length(), 33);
            }
            float f13 = cVar.f90712e;
            if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                c1421bO.q(f13 / f12, 1);
            }
            boolean z11 = cVar.f90713f;
            if (z11 && cVar.f90714g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z11) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f90714g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f90715h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f90716i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = bVar.f90733a;
        if (i11 == -1) {
            i11 = cVar != null ? cVar.f90709b : -1;
        }
        c1421bO.p(N(i11)).l(M(i11)).i(L(i11));
        PointF pointF = bVar.f90734b;
        if (pointF == null || f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
            c1421bO.k(C(c1421bO.d()));
            c1421bO.h(C(c1421bO.c()), 0);
        } else {
            c1421bO.k(pointF.x / f11);
            c1421bO.h(bVar.f90734b.y / f12, 0);
        }
        return c1421bO.a();
    }

    private Charset E(d0 d0Var) {
        Charset charsetP = d0Var.P();
        return charsetP != null ? charsetP : e.f100000c;
    }

    private void F(String str, b bVar, List<List<gs.b>> list, List<Long> list2) {
        int i11;
        ts.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f90707e);
        if (strArrSplit.length != bVar.f90707e) {
            u.i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jK = K(strArrSplit[bVar.f90703a]);
        if (jK == -9223372036854775807L) {
            u.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jK2 = K(strArrSplit[bVar.f90704b]);
        if (jK2 == -9223372036854775807L) {
            u.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f90700q;
        c cVar = (map == null || (i11 = bVar.f90705c) == -1) ? null : map.get(strArrSplit[i11].trim());
        String str2 = strArrSplit[bVar.f90706d];
        gs.b bVarD = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f90701r, this.f90702s);
        int iB = B(jK2, list2, list);
        for (int iB2 = B(jK, list2, list); iB2 < iB; iB2++) {
            list.get(iB2).add(bVarD);
        }
    }

    private void G(d0 d0Var, List<List<gs.b>> list, List<Long> list2, Charset charset) {
        b bVarA = this.f90698o ? this.f90699p : null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                bVarA = b.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    u.i("SsaDecoder", "Skipping dialogue line before complete format: " + strT);
                } else {
                    F(strT, bVarA, list, list2);
                }
            }
        }
    }

    private void H(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                I(d0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f90700q = J(d0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                u.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    private void I(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (d0Var.a() != 0 && d0Var.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(":");
            if (strArrSplit.length == 2) {
                String strE = ou.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f90701r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f90702s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> J(d0 d0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null || (d0Var.a() != 0 && d0Var.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    u.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f90708a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = f90697t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) p0.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) p0.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) p0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) p0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int L(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i11);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int M(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i11);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment N(int i11) {
        switch (i11) {
            case -1:
                return null;
            case 0:
            default:
                u.i("SsaDecoder", "Unknown alignment: " + i11);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d0 d0Var = new d0(bArr, i11);
        Charset charsetE = E(d0Var);
        if (!this.f90698o) {
            H(d0Var, charsetE);
        }
        G(d0Var, arrayList, arrayList2, charsetE);
        return new d(arrayList, arrayList2);
    }
}
