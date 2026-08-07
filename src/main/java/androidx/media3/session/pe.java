package androidx.media3.session;

import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class pe extends p7.r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final pe f12130g = new pe(com.google.common.collect.x.r(), null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f12131h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.common.collect.x<a> f12132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f12133f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7.y f12134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12136c;

        public a(p7.y yVar, long j11, long j12) {
            this.f12134a = yVar;
            this.f12135b = j11;
            this.f12136c = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12135b == aVar.f12135b && this.f12134a.equals(aVar.f12134a) && this.f12136c == aVar.f12136c;
        }

        public int hashCode() {
            long j11 = this.f12135b;
            int iHashCode = (((EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f12134a.hashCode()) * 31;
            long j12 = this.f12136c;
            return iHashCode + ((int) (j12 ^ (j12 >>> 32)));
        }
    }

    private pe(com.google.common.collect.x<a> xVar, a aVar) {
        this.f12132e = xVar;
        this.f12133f = aVar;
    }

    public static pe F(List<ha.l.h> list) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ha.l.h hVar = list.get(i11);
            aVar.a(new a(LegacyConversions.A(hVar), hVar.d(), -9223372036854775807L));
        }
        return new pe(aVar.k(), null);
    }

    private a I(int i11) {
        a aVar;
        return (i11 != this.f12132e.size() || (aVar = this.f12133f) == null) ? this.f12132e.get(i11) : aVar;
    }

    public pe A(p7.y yVar, long j11) {
        return new pe(this.f12132e, new a(yVar, -1L, j11));
    }

    public pe B(int i11, int i12, int i13) {
        ArrayList arrayList = new ArrayList(this.f12132e);
        s7.q0.a1(arrayList, i11, i12, i13);
        return new pe(com.google.common.collect.x.n(arrayList), this.f12133f);
    }

    public pe C(int i11, p7.y yVar, long j11) {
        s7.a.a(i11 < this.f12132e.size() || (i11 == this.f12132e.size() && this.f12133f != null));
        if (i11 == this.f12132e.size()) {
            return new pe(this.f12132e, new a(yVar, -1L, j11));
        }
        long j12 = this.f12132e.get(i11).f12135b;
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        aVar.j(this.f12132e.subList(0, i11));
        aVar.a(new a(yVar, j12, j11));
        com.google.common.collect.x<a> xVar = this.f12132e;
        aVar.j(xVar.subList(i11 + 1, xVar.size()));
        return new pe(aVar.k(), this.f12133f);
    }

    public pe D(int i11, List<p7.y> list) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        aVar.j(this.f12132e.subList(0, i11));
        for (int i12 = 0; i12 < list.size(); i12++) {
            aVar.a(new a(list.get(i12), -1L, -9223372036854775807L));
        }
        com.google.common.collect.x<a> xVar = this.f12132e;
        aVar.j(xVar.subList(i11, xVar.size()));
        return new pe(aVar.k(), this.f12133f);
    }

    public pe E(int i11, int i12) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        aVar.j(this.f12132e.subList(0, i11));
        com.google.common.collect.x<a> xVar = this.f12132e;
        aVar.j(xVar.subList(i12, xVar.size()));
        return new pe(aVar.k(), this.f12133f);
    }

    public p7.y G(int i11) {
        if (i11 >= t()) {
            return null;
        }
        return I(i11).f12134a;
    }

    public long H(int i11) {
        if (i11 < 0 || i11 >= this.f12132e.size()) {
            return -1L;
        }
        return this.f12132e.get(i11).f12135b;
    }

    @Override // p7.r0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        return Objects.equals(this.f12132e, peVar.f12132e) && Objects.equals(this.f12133f, peVar.f12133f);
    }

    @Override // p7.r0
    public int f(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p7.r0
    public int hashCode() {
        return Objects.hash(this.f12132e, this.f12133f);
    }

    @Override // p7.r0
    public p7.r0.b k(int i11, p7.r0.b bVar, boolean z11) {
        a aVarI = I(i11);
        bVar.u(Long.valueOf(aVarI.f12135b), null, i11, s7.q0.b1(aVarI.f12136c), 0L);
        return bVar;
    }

    @Override // p7.r0
    public int m() {
        return t();
    }

    @Override // p7.r0
    public Object q(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // p7.r0
    public p7.r0.d s(int i11, p7.r0.d dVar, long j11) {
        a aVarI = I(i11);
        dVar.h(f12131h, aVarI.f12134a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, s7.q0.b1(aVarI.f12136c), i11, i11, 0L);
        return dVar;
    }

    @Override // p7.r0
    public int t() {
        return this.f12132e.size() + (this.f12133f == null ? 0 : 1);
    }

    public boolean x(p7.y yVar) {
        a aVar = this.f12133f;
        if (aVar != null && yVar.equals(aVar.f12134a)) {
            return true;
        }
        for (int i11 = 0; i11 < this.f12132e.size(); i11++) {
            if (yVar.equals(this.f12132e.get(i11).f12134a)) {
                return true;
            }
        }
        return false;
    }

    public pe y() {
        return new pe(this.f12132e, this.f12133f);
    }

    public pe z() {
        return new pe(this.f12132e, null);
    }
}
