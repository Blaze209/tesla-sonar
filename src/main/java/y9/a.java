package y9;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.common.collect.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.c0;
import s7.n;
import s7.t;
import t9.d;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f125278d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f125279e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f125280a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f125281b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f125282c = new c0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private r7.a d(Spanned spanned, String str) {
        r7.a.b bVarO = new r7.a.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                bVarO.l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                bVarO.l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            default:
                bVarO.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                bVarO.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                bVarO.i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            default:
                bVarO.i(1);
                break;
        }
        return bVarO.k(f(bVarO.d())).h(f(bVarO.c()), 0).a();
    }

    private Charset e(c0 c0Var) {
        Charset charsetW = c0Var.W();
        return charsetW != null ? charsetW : StandardCharsets.UTF_8;
    }

    public static float f(int i11) {
        if (i11 == 0) {
            return 0.08f;
        }
        if (i11 == 1) {
            return 0.5f;
        }
        if (i11 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i11) {
        String strGroup = matcher.group(i11 + 1);
        long j11 = (strGroup != null ? Long.parseLong(strGroup) * CoreConstants.MILLIS_IN_ONE_HOUR : 0L) + (Long.parseLong((String) s7.a.f(matcher.group(i11 + 2))) * 60000) + (Long.parseLong((String) s7.a.f(matcher.group(i11 + 3))) * 1000);
        String strGroup2 = matcher.group(i11 + 4);
        if (strGroup2 != null) {
            j11 += Long.parseLong(strGroup2);
        }
        return j11 * 1000;
    }

    private String h(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f125279e.matcher(strTrim);
        int i11 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i11;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i11 += length;
        }
        return sb2.toString();
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<d> nVar) {
        long j11;
        String str;
        this.f125282c.Z(bArr, i11 + i12);
        this.f125282c.b0(i11);
        Charset charsetE = e(this.f125282c);
        long j12 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f112984a == -9223372036854775807L || !bVar.f112985b) ? null : new ArrayList();
        while (true) {
            String strY = this.f125282c.y(charsetE);
            if (strY == null) {
                break;
            }
            if (!strY.isEmpty()) {
                try {
                    Integer.parseInt(strY);
                    String strY2 = this.f125282c.y(charsetE);
                    if (strY2 == null) {
                        t.i("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f125278d.matcher(strY2);
                    if (matcher.matches()) {
                        long jG = g(matcher, 1);
                        long jG2 = g(matcher, 6);
                        int i13 = 0;
                        this.f125280a.setLength(0);
                        this.f125281b.clear();
                        String strY3 = this.f125282c.y(charsetE);
                        while (!TextUtils.isEmpty(strY3)) {
                            if (this.f125280a.length() > 0) {
                                this.f125280a.append("<br>");
                            }
                            this.f125280a.append(h(strY3, this.f125281b));
                            strY3 = this.f125282c.y(charsetE);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f125280a.toString());
                        while (true) {
                            if (i13 >= this.f125281b.size()) {
                                str = null;
                                break;
                            }
                            str = this.f125281b.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        j11 = j12;
                        long j13 = bVar.f112984a;
                        if (j13 == j11 || jG2 >= j13) {
                            nVar.accept(new d(x.s(d(spannedFromHtml, str)), jG, jG2 - jG));
                        } else if (arrayList != null) {
                            arrayList.add(new d(x.s(d(spannedFromHtml, str)), jG, jG2 - jG));
                        }
                    } else {
                        j11 = j12;
                        t.i("SubripParser", "Skipping invalid timing: " + strY2);
                    }
                    j12 = j11;
                } catch (NumberFormatException unused) {
                    j11 = j12;
                    t.i("SubripParser", "Skipping invalid index: " + strY);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
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
