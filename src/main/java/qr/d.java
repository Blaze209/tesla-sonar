package qr;

import com.google.android.exoplayer2.ParserException;
import hr.b0;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class d implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f105875d = new p() { // from class: qr.c
        @Override // hr.p
        public final k[] d() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f105876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f105877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f105878c;

    public static /* synthetic */ k[] b() {
        return new k[]{new d()};
    }

    private static d0 c(d0 d0Var) {
        d0Var.U(0);
        return d0Var;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean d(l lVar) {
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f105885b & 2) == 2) {
            int iMin = Math.min(fVar.f105892i, 8);
            d0 d0Var = new d0(iMin);
            lVar.e(d0Var.e(), 0, iMin);
            if (b.p(c(d0Var))) {
                this.f105877b = new b();
            } else if (j.r(c(d0Var))) {
                this.f105877b = new j();
            } else if (h.o(c(d0Var))) {
                this.f105877b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        i iVar = this.f105877b;
        if (iVar != null) {
            iVar.m(j11, j12);
        }
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f105876a = mVar;
    }

    @Override // hr.k
    public boolean h(l lVar) {
        try {
            return d(lVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // hr.k
    public int i(l lVar, y yVar) throws ParserException {
        ts.a.i(this.f105876a);
        if (this.f105877b == null) {
            if (!d(lVar)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            lVar.g();
        }
        if (!this.f105878c) {
            b0 b0VarB = this.f105876a.b(0, 1);
            this.f105876a.j();
            this.f105877b.d(this.f105876a, b0VarB);
            this.f105878c = true;
        }
        return this.f105877b.g(lVar, yVar);
    }

    @Override // hr.k
    public void release() {
    }
}
