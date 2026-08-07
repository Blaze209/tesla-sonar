package f8;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.u;
import s7.c0;
import s7.i0;
import t9.q;
import w8.j0;
import w8.o0;
import w8.p;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f64559i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f64560j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f64562b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.a f64564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f64565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f64566f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f64568h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f64563c = new c0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f64567g = new byte[1024];

    public j(String str, i0 i0Var, q.a aVar, boolean z11) {
        this.f64561a = str;
        this.f64562b = i0Var;
        this.f64564d = aVar;
        this.f64565e = z11;
    }

    @RequiresNonNull({"output"})
    private o0 b(long j11) {
        o0 o0VarB = this.f64566f.b(0, 3);
        o0VarB.g(new u.b().y0("text/vtt").n0(this.f64561a).C0(j11).P());
        this.f64566f.j();
        return o0VarB;
    }

    @RequiresNonNull({"output"})
    private void c() throws ParserException {
        c0 c0Var = new c0(this.f64567g);
        ca.h.e(c0Var);
        long jH = 0;
        long jD = 0;
        for (String strX = c0Var.x(); !TextUtils.isEmpty(strX); strX = c0Var.x()) {
            if (strX.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f64559i.matcher(strX);
                if (!matcher.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strX, null);
                }
                Matcher matcher2 = f64560j.matcher(strX);
                if (!matcher2.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strX, null);
                }
                jD = ca.h.d((String) s7.a.f(matcher.group(1)));
                jH = i0.h(Long.parseLong((String) s7.a.f(matcher2.group(1))));
            }
        }
        Matcher matcherA = ca.h.a(c0Var);
        if (matcherA == null) {
            b(0L);
            return;
        }
        long jD2 = ca.h.d((String) s7.a.f(matcherA.group(1)));
        long jB = this.f64562b.b(i0.l((jH + jD2) - jD));
        o0 o0VarB = b(jB - jD2);
        this.f64563c.Z(this.f64567g, this.f64568h);
        o0VarB.f(this.f64563c, this.f64568h);
        o0VarB.b(jB, 1, this.f64568h, 0, null);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        throw new IllegalStateException();
    }

    @Override // w8.p
    public void e(r rVar) {
        if (this.f64565e) {
            rVar = new t9.r(rVar, this.f64564d);
        }
        this.f64566f = rVar;
        rVar.t(new j0.b(-9223372036854775807L));
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) throws ParserException {
        s7.a.f(this.f64566f);
        int length = (int) qVar.getLength();
        int i11 = this.f64568h;
        byte[] bArr = this.f64567g;
        if (i11 == bArr.length) {
            this.f64567g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f64567g;
        int i12 = this.f64568h;
        int i13 = qVar.read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f64568h + i13;
            this.f64568h = i14;
            if (length == -1 || i14 != length) {
                return 0;
            }
        }
        c();
        return -1;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        qVar.f(this.f64567g, 0, 6, false);
        this.f64563c.Z(this.f64567g, 6);
        if (ca.h.b(this.f64563c)) {
            return true;
        }
        qVar.f(this.f64567g, 6, 3, false);
        this.f64563c.Z(this.f64567g, 9);
        return ca.h.b(this.f64563c);
    }

    @Override // w8.p
    public void release() {
    }
}
