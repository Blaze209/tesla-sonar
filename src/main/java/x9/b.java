package x9;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.c0;
import s7.n;
import s7.q0;
import s7.t;
import t9.d;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f123098g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f123099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f123100b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, c> f123102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f123103e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f123104f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f123101c = new c0();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f123099a = false;
            this.f123100b = null;
            return;
        }
        this.f123099a = true;
        String strK = q0.K(list.get(0));
        s7.a.a(strK.startsWith("Format:"));
        this.f123100b = (a) s7.a.f(a.a(strK));
        j(new c0(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int d(long j11, List<Long> list, List<List<r7.a>> list2) {
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

    private static float e(int i11) {
        if (i11 == 0) {
            return 0.05f;
        }
        if (i11 != 1) {
            return i11 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static r7.a f(String str, int i11, c cVar, c.b bVar, float f11, float f12) {
        SpannableString spannableString = new SpannableString(str);
        r7.a.b bVarT = new r7.a.b().o(spannableString).t(i11);
        if (cVar != null) {
            if (cVar.f123107c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f123107c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f123114j == 3 && cVar.f123108d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f123108d.intValue()), 0, spannableString.length(), 33);
            }
            float f13 = cVar.f123109e;
            if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                bVarT.q(f13 / f12, 1);
            }
            boolean z11 = cVar.f123110f;
            if (z11 && cVar.f123111g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z11) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f123111g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f123112h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f123113i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i12 = bVar.f123130a;
        if (i12 == -1) {
            i12 = cVar != null ? cVar.f123106b : -1;
        }
        bVarT.p(p(i12)).l(o(i12)).i(n(i12));
        PointF pointF = bVar.f123131b;
        if (pointF == null || f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
            bVarT.k(e(bVarT.d()));
            bVarT.h(e(bVarT.c()), 0);
        } else {
            bVarT.k(pointF.x / f11);
            bVarT.h(bVar.f123131b.y / f12, 0);
        }
        return bVarT.a();
    }

    private Charset g(c0 c0Var) {
        Charset charsetW = c0Var.W();
        return charsetW != null ? charsetW : StandardCharsets.UTF_8;
    }

    private void h(String str, a aVar, List<List<r7.a>> list, List<Long> list2) {
        int i11;
        int i12;
        s7.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f123097f);
        if (strArrSplit.length != aVar.f123097f) {
            t.i("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i13 = aVar.f123092a;
        if (i13 != -1) {
            try {
                i11 = Integer.parseInt(strArrSplit[i13].trim());
            } catch (RuntimeException unused) {
                t.i("SsaParser", "Fail to parse layer: " + strArrSplit[aVar.f123092a]);
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        int i14 = i11;
        long jM = m(strArrSplit[aVar.f123093b]);
        if (jM == -9223372036854775807L) {
            t.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f123094c]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            t.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f123102d;
        c cVar = (map == null || (i12 = aVar.f123095d) == -1) ? null : map.get(strArrSplit[i12].trim());
        String str2 = strArrSplit[aVar.f123096e];
        r7.a aVarF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i14, cVar, c.b.b(str2), this.f123103e, this.f123104f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            list.get(iD2).add(aVarF);
        }
    }

    private void i(c0 c0Var, List<List<r7.a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f123099a ? this.f123100b : null;
        while (true) {
            String strY = c0Var.y(charset);
            if (strY == null) {
                return;
            }
            if (strY.startsWith("Format:")) {
                aVarA = a.a(strY);
            } else if (strY.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    t.i("SsaParser", "Skipping dialogue line before complete format: " + strY);
                } else {
                    h(strY, aVarA, list, list2);
                }
            }
        }
    }

    private void j(c0 c0Var, Charset charset) {
        while (true) {
            String strY = c0Var.y(charset);
            if (strY == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strY)) {
                k(c0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strY)) {
                this.f123102d = l(c0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strY)) {
                t.g("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strY)) {
                return;
            }
        }
    }

    private void k(c0 c0Var, Charset charset) {
        while (true) {
            String strY = c0Var.y(charset);
            if (strY == null) {
                return;
            }
            if (c0Var.a() != 0 && c0Var.l(charset) == 91) {
                return;
            }
            String[] strArrSplit = strY.split(":");
            if (strArrSplit.length == 2) {
                String strE = ou.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f123103e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f123104f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> l(c0 c0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strY = c0Var.y(charset);
            if (strY == null || (c0Var.a() != 0 && c0Var.l(charset) == 91)) {
                break;
            }
            if (strY.startsWith("Format:")) {
                aVarA = c.a.a(strY);
            } else if (strY.startsWith("Style:")) {
                if (aVarA == null) {
                    t.i("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strY);
                } else {
                    c cVarB = c.b(strY, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f123105a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f123098g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) q0.l(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) q0.l(matcher.group(2))) * 60000000) + (Long.parseLong((String) q0.l(matcher.group(3))) * 1000000) + (Long.parseLong((String) q0.l(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int n(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                t.i("SsaParser", "Unknown alignment: " + i11);
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

    private static int o(int i11) {
        switch (i11) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                t.i("SsaParser", "Unknown alignment: " + i11);
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

    private static Layout.Alignment p(int i11) {
        switch (i11) {
            case -1:
                return null;
            case 0:
            default:
                t.i("SsaParser", "Unknown alignment: " + i11);
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

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<d> nVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f123101c.Z(bArr, i11 + i12);
        this.f123101c.b0(i11);
        Charset charsetG = g(this.f123101c);
        if (!this.f123099a) {
            j(this.f123101c, charsetG);
        }
        i(this.f123101c, arrayList, arrayList2, charsetG);
        ArrayList arrayList3 = (bVar.f112984a == -9223372036854775807L || !bVar.f112985b) ? null : new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            List<r7.a> list = arrayList.get(i13);
            if (!list.isEmpty() || i13 == 0) {
                if (i13 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i13).longValue();
                long jLongValue2 = arrayList2.get(i13 + 1).longValue();
                d dVar = new d(list, jLongValue, jLongValue2 - jLongValue);
                long j11 = bVar.f112984a;
                if (j11 == -9223372036854775807L || jLongValue2 >= j11) {
                    nVar.accept(dVar);
                } else if (arrayList3 != null) {
                    arrayList3.add(dVar);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                nVar.accept((d) it.next());
            }
        }
    }

    @Override // t9.q
    public int b() {
        return 1;
    }
}
