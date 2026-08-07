package gs;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.u0;
import hr.b0;
import hr.x;
import hr.y;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class l implements hr.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f69524a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u0 f69527d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private hr.m f69530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f69531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69532i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f69525b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f69526c = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Long> f69528e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<d0> f69529f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69533j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69534k = -9223372036854775807L;

    public l(j jVar, u0 u0Var) {
        this.f69524a = jVar;
        this.f69527d = u0Var.b().g0("text/x-exoplayer-cues").K(u0Var.f40712l).G();
    }

    private void b() throws ParserException, InterruptedIOException {
        try {
            m mVarB = this.f69524a.b();
            while (mVarB == null) {
                Thread.sleep(5L);
                mVarB = this.f69524a.b();
            }
            mVarB.q(this.f69532i);
            mVarB.f39720c.put(this.f69526c.e(), 0, this.f69532i);
            mVarB.f39720c.limit(this.f69532i);
            this.f69524a.d(mVarB);
            n nVarA = this.f69524a.a();
            while (nVarA == null) {
                Thread.sleep(5L);
                nVarA = this.f69524a.a();
            }
            for (int i11 = 0; i11 < nVarA.b(); i11++) {
                byte[] bArrA = this.f69525b.a(nVarA.d(nVarA.a(i11)));
                this.f69528e.add(Long.valueOf(nVarA.a(i11)));
                this.f69529f.add(new d0(bArrA));
            }
            nVarA.p();
        } catch (SubtitleDecoderException e11) {
            throw ParserException.a("SubtitleDecoder failed.", e11);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean c(hr.l lVar) {
        int iB = this.f69526c.b();
        int i11 = this.f69532i;
        if (iB == i11) {
            this.f69526c.c(i11 + 1024);
        }
        int i12 = lVar.read(this.f69526c.e(), this.f69532i, this.f69526c.b() - this.f69532i);
        if (i12 != -1) {
            this.f69532i += i12;
        }
        long length = lVar.getLength();
        return (length != -1 && ((long) this.f69532i) == length) || i12 == -1;
    }

    private boolean d(hr.l lVar) {
        return lVar.a((lVar.getLength() > (-1L) ? 1 : (lVar.getLength() == (-1L) ? 0 : -1)) != 0 ? ru.f.e(lVar.getLength()) : 1024) == -1;
    }

    private void f() {
        ts.a.i(this.f69531h);
        ts.a.g(this.f69528e.size() == this.f69529f.size());
        long j11 = this.f69534k;
        for (int iF = j11 == -9223372036854775807L ? 0 : p0.f(this.f69528e, Long.valueOf(j11), true, true); iF < this.f69529f.size(); iF++) {
            d0 d0Var = this.f69529f.get(iF);
            d0Var.U(0);
            int length = d0Var.e().length;
            this.f69531h.d(d0Var, length);
            this.f69531h.e(this.f69528e.get(iF).longValue(), 1, length, 0, null);
        }
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        int i11 = this.f69533j;
        ts.a.g((i11 == 0 || i11 == 5) ? false : true);
        this.f69534k = j12;
        if (this.f69533j == 2) {
            this.f69533j = 1;
        }
        if (this.f69533j == 4) {
            this.f69533j = 3;
        }
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        ts.a.g(this.f69533j == 0);
        this.f69530g = mVar;
        this.f69531h = mVar.b(0, 3);
        this.f69530g.j();
        this.f69530g.p(new x(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f69531h.b(this.f69527d);
        this.f69533j = 1;
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        return true;
    }

    @Override // hr.k
    public int i(hr.l lVar, y yVar) throws ParserException, InterruptedIOException {
        int i11 = this.f69533j;
        ts.a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f69533j == 1) {
            this.f69526c.Q(lVar.getLength() != -1 ? ru.f.e(lVar.getLength()) : 1024);
            this.f69532i = 0;
            this.f69533j = 2;
        }
        if (this.f69533j == 2 && c(lVar)) {
            b();
            f();
            this.f69533j = 4;
        }
        if (this.f69533j == 3 && d(lVar)) {
            f();
            this.f69533j = 4;
        }
        return this.f69533j == 4 ? -1 : 0;
    }

    @Override // hr.k
    public void release() {
        if (this.f69533j == 5) {
            return;
        }
        this.f69524a.release();
        this.f69533j = 5;
    }
}
