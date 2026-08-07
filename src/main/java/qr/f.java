package qr;

import com.google.android.exoplayer2.ParserException;
import hr.l;
import hr.n;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f105887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f105888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f105889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f105891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f105893j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f105894k = new d0(255);

    f() {
    }

    public boolean a(l lVar, boolean z11) throws ParserException {
        b();
        this.f105894k.Q(27);
        if (!n.b(lVar, this.f105894k.e(), 0, 27, z11) || this.f105894k.J() != 1332176723) {
            return false;
        }
        int iH = this.f105894k.H();
        this.f105884a = iH;
        if (iH != 0) {
            if (z11) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.f105885b = this.f105894k.H();
        this.f105886c = this.f105894k.v();
        this.f105887d = this.f105894k.x();
        this.f105888e = this.f105894k.x();
        this.f105889f = this.f105894k.x();
        int iH2 = this.f105894k.H();
        this.f105890g = iH2;
        this.f105891h = iH2 + 27;
        this.f105894k.Q(iH2);
        if (!n.b(lVar, this.f105894k.e(), 0, this.f105890g, z11)) {
            return false;
        }
        for (int i11 = 0; i11 < this.f105890g; i11++) {
            this.f105893j[i11] = this.f105894k.H();
            this.f105892i += this.f105893j[i11];
        }
        return true;
    }

    public void b() {
        this.f105884a = 0;
        this.f105885b = 0;
        this.f105886c = 0L;
        this.f105887d = 0L;
        this.f105888e = 0L;
        this.f105889f = 0L;
        this.f105890g = 0;
        this.f105891h = 0;
        this.f105892i = 0;
    }

    public boolean c(l lVar) {
        return d(lVar, -1L);
    }

    public boolean d(l lVar, long j11) {
        ts.a.a(lVar.getPosition() == lVar.h());
        this.f105894k.Q(4);
        while (true) {
            if ((j11 != -1 && lVar.getPosition() + 4 >= j11) || !n.b(lVar, this.f105894k.e(), 0, 4, true)) {
                break;
            }
            this.f105894k.U(0);
            if (this.f105894k.J() == 1332176723) {
                lVar.g();
                return true;
            }
            lVar.k(1);
        }
        do {
            if (j11 != -1 && lVar.getPosition() >= j11) {
                break;
            }
        } while (lVar.a(1) != -1);
        return false;
    }
}
