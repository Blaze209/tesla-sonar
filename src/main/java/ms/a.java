package ms;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import gs.h;
import gs.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ou.e;
import ts.d0;
import ts.u;
import ts.v;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f92503q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f92504r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f92505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<String> f92506p;

    public a() {
        super("SubripDecoder");
        this.f92505o = new StringBuilder();
        this.f92506p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private gs.b B(Spanned spanned, String str) {
        gs.b.C1421b c1421bO = new gs.b.C1421b().o(spanned);
        if (str == null) {
            return c1421bO.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c1421bO.l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c1421bO.l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c1421bO.l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c1421bO.l(1);
                } else {
                    c1421bO.l(2);
                }
                break;
            default:
                c1421bO.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c1421bO.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c1421bO.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c1421bO.i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c1421bO.i(1);
                } else {
                    c1421bO.i(0);
                }
                break;
            default:
                c1421bO.i(1);
                break;
        }
        return c1421bO.k(D(c1421bO.d())).h(D(c1421bO.c()), 0).a();
    }

    private Charset C(d0 d0Var) {
        Charset charsetP = d0Var.P();
        return charsetP != null ? charsetP : e.f100000c;
    }

    static float D(int i11) {
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

    private static long E(Matcher matcher, int i11) {
        String strGroup = matcher.group(i11 + 1);
        long j11 = (strGroup != null ? Long.parseLong(strGroup) * CoreConstants.MILLIS_IN_ONE_HOUR : 0L) + (Long.parseLong((String) ts.a.e(matcher.group(i11 + 2))) * 60000) + (Long.parseLong((String) ts.a.e(matcher.group(i11 + 3))) * 1000);
        String strGroup2 = matcher.group(i11 + 4);
        if (strGroup2 != null) {
            j11 += Long.parseLong(strGroup2);
        }
        return j11 * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f92504r.matcher(strTrim);
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

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) {
        String str;
        ArrayList arrayList = new ArrayList();
        v vVar = new v();
        d0 d0Var = new d0(bArr, i11);
        Charset charsetC = C(d0Var);
        while (true) {
            String strT = d0Var.t(charsetC);
            int i12 = 0;
            if (strT == null) {
                break;
            }
            if (strT.length() != 0) {
                try {
                    Integer.parseInt(strT);
                    String strT2 = d0Var.t(charsetC);
                    if (strT2 == null) {
                        u.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f92503q.matcher(strT2);
                    if (matcher.matches()) {
                        vVar.a(E(matcher, 1));
                        vVar.a(E(matcher, 6));
                        this.f92505o.setLength(0);
                        this.f92506p.clear();
                        for (String strT3 = d0Var.t(charsetC); !TextUtils.isEmpty(strT3); strT3 = d0Var.t(charsetC)) {
                            if (this.f92505o.length() > 0) {
                                this.f92505o.append("<br>");
                            }
                            this.f92505o.append(F(strT3, this.f92506p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f92505o.toString());
                        while (true) {
                            if (i12 >= this.f92506p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f92506p.get(i12);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i12++;
                        }
                        arrayList.add(B(spannedFromHtml, str));
                        arrayList.add(gs.b.f69464r);
                    } else {
                        u.i("SubripDecoder", "Skipping invalid timing: " + strT2);
                    }
                } catch (NumberFormatException unused) {
                    u.i("SubripDecoder", "Skipping invalid index: " + strT);
                }
            }
        }
        return new b((gs.b[]) arrayList.toArray(new gs.b[0]), vVar.d());
    }
}
