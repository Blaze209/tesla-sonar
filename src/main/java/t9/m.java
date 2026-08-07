package t9;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p7.u;
import s7.c0;
import s7.q0;
import w8.e0;
import w8.i0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements w8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f112965a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f112967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f112968d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f112971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f112972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f112973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f112974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f112975k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f112966b = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f112970f = q0.f110459f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f112969e = new c0();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f112976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f112977b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f112976a, bVar.f112976a);
        }

        private b(long j11, byte[] bArr) {
            this.f112976a = j11;
            this.f112977b = bArr;
        }
    }

    public m(q qVar, u uVar) {
        this.f112965a = qVar;
        this.f112967c = uVar != null ? uVar.b().y0("application/x-media3-cues").U(uVar.f101544o).Y(qVar.b()).P() : null;
        this.f112968d = new ArrayList();
        this.f112973i = 0;
        this.f112974j = q0.f110460g;
        this.f112975k = -9223372036854775807L;
    }

    public static /* synthetic */ void b(m mVar, d dVar) {
        mVar.getClass();
        b bVar = new b(dVar.f112956b, mVar.f112966b.a(dVar.f112955a, dVar.f112957c));
        mVar.f112968d.add(bVar);
        long j11 = mVar.f112975k;
        if (j11 == -9223372036854775807L || dVar.f112958d >= j11) {
            mVar.k(bVar);
        }
    }

    private void c() throws ParserException {
        try {
            long j11 = this.f112975k;
            this.f112965a.a(this.f112970f, 0, this.f112972h, j11 != -9223372036854775807L ? q.b.c(j11) : q.b.b(), new s7.n() { // from class: t9.l
                @Override // s7.n
                public final void accept(Object obj) {
                    m.b(this.f112964a, (d) obj);
                }
            });
            Collections.sort(this.f112968d);
            this.f112974j = new long[this.f112968d.size()];
            for (int i11 = 0; i11 < this.f112968d.size(); i11++) {
                this.f112974j[i11] = this.f112968d.get(i11).f112976a;
            }
            this.f112970f = q0.f110459f;
        } catch (RuntimeException e11) {
            throw ParserException.a("SubtitleParser failed.", e11);
        }
    }

    private boolean d(w8.q qVar) {
        byte[] bArr = this.f112970f;
        if (bArr.length == this.f112972h) {
            this.f112970f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f112970f;
        int i11 = this.f112972h;
        int i12 = qVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            this.f112972h += i12;
        }
        long length = qVar.getLength();
        return (length != -1 && ((long) this.f112972h) == length) || i12 == -1;
    }

    private boolean f(w8.q qVar) {
        return qVar.a((qVar.getLength() > (-1L) ? 1 : (qVar.getLength() == (-1L) ? 0 : -1)) != 0 ? ru.f.e(qVar.getLength()) : 1024) == -1;
    }

    private void g() {
        long j11 = this.f112975k;
        for (int iK = j11 == -9223372036854775807L ? 0 : q0.k(this.f112974j, j11, true, true); iK < this.f112968d.size(); iK++) {
            k(this.f112968d.get(iK));
        }
    }

    private void k(b bVar) {
        s7.a.j(this.f112971g);
        int length = bVar.f112977b.length;
        this.f112969e.Y(bVar.f112977b);
        this.f112971g.f(this.f112969e, length);
        this.f112971g.b(bVar.f112976a, 1, length, 0, null);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        int i11 = this.f112973i;
        s7.a.h((i11 == 0 || i11 == 5) ? false : true);
        this.f112975k = j12;
        if (this.f112973i == 2) {
            this.f112973i = 1;
        }
        if (this.f112973i == 4) {
            this.f112973i = 3;
        }
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        s7.a.h(this.f112973i == 0);
        o0 o0VarB = rVar.b(0, 3);
        this.f112971g = o0VarB;
        u uVar = this.f112967c;
        if (uVar != null) {
            o0VarB.g(uVar);
            rVar.j();
            rVar.t(new e0(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f112973i = 1;
    }

    @Override // w8.p
    public int h(w8.q qVar, i0 i0Var) throws ParserException {
        int i11 = this.f112973i;
        s7.a.h((i11 == 0 || i11 == 5) ? false : true);
        if (this.f112973i == 1) {
            int iE = qVar.getLength() != -1 ? ru.f.e(qVar.getLength()) : 1024;
            if (iE > this.f112970f.length) {
                this.f112970f = new byte[iE];
            }
            this.f112972h = 0;
            this.f112973i = 2;
        }
        if (this.f112973i == 2 && d(qVar)) {
            c();
            this.f112973i = 4;
        }
        if (this.f112973i == 3 && f(qVar)) {
            g();
            this.f112973i = 4;
        }
        return this.f112973i == 4 ? -1 : 0;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        return true;
    }

    @Override // w8.p
    public void release() {
        if (this.f112973i == 5) {
            return;
        }
        this.f112965a.reset();
        this.f112973i = 5;
    }
}
