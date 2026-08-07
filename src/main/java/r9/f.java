package r9;

import androidx.media3.common.ParserException;
import s7.c0;
import w8.q;
import w8.s;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f107339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f107340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f107341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f107342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f107343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f107344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f107345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f107346j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c0 f107347k = new c0(255);

    f() {
    }

    public boolean a(q qVar, boolean z11) throws ParserException {
        b();
        this.f107347k.X(27);
        if (!s.c(qVar, this.f107347k.f(), 0, 27, z11) || this.f107347k.O() != 1332176723) {
            return false;
        }
        int iM = this.f107347k.M();
        this.f107337a = iM;
        if (iM != 0) {
            if (z11) {
                return false;
            }
            throw ParserException.d("unsupported bit stream revision");
        }
        this.f107338b = this.f107347k.M();
        this.f107339c = this.f107347k.A();
        this.f107340d = this.f107347k.C();
        this.f107341e = this.f107347k.C();
        this.f107342f = this.f107347k.C();
        int iM2 = this.f107347k.M();
        this.f107343g = iM2;
        this.f107344h = iM2 + 27;
        this.f107347k.X(iM2);
        if (!s.c(qVar, this.f107347k.f(), 0, this.f107343g, z11)) {
            return false;
        }
        for (int i11 = 0; i11 < this.f107343g; i11++) {
            this.f107346j[i11] = this.f107347k.M();
            this.f107345i += this.f107346j[i11];
        }
        return true;
    }

    public void b() {
        this.f107337a = 0;
        this.f107338b = 0;
        this.f107339c = 0L;
        this.f107340d = 0L;
        this.f107341e = 0L;
        this.f107342f = 0L;
        this.f107343g = 0;
        this.f107344h = 0;
        this.f107345i = 0;
    }

    public boolean c(q qVar) {
        return d(qVar, -1L);
    }

    public boolean d(q qVar, long j11) {
        s7.a.a(qVar.getPosition() == qVar.h());
        this.f107347k.X(4);
        while (true) {
            if ((j11 != -1 && qVar.getPosition() + 4 >= j11) || !s.c(qVar, this.f107347k.f(), 0, 4, true)) {
                break;
            }
            this.f107347k.b0(0);
            if (this.f107347k.O() == 1332176723) {
                qVar.g();
                return true;
            }
            qVar.k(1);
        }
        do {
            if (j11 != -1 && qVar.getPosition() >= j11) {
                break;
            }
        } while (qVar.a(1) != -1);
        return false;
    }
}
