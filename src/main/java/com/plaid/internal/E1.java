package com.plaid.internal;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ax.c("available")
    private final Double f46287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ax.c("current")
    private final Double f46288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ax.c("currency")
    private final String f46289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ax.c("localized")
    private final U3 f46290d;

    @jn0.e
    public static final class a implements vo0.e0<E1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46292b;

        static {
            a aVar = new a();
            f46291a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            m1Var.o("available", true);
            m1Var.o("current", true);
            m1Var.o("currency", true);
            m1Var.o("localized", true);
            f46292b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.t tVar = vo0.t.f119690a;
            return new ro0.d[]{so0.a.p(tVar), so0.a.p(tVar), so0.a.p(vo0.z1.f119730a), so0.a.p(U3.a.f46739a)};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            int i11;
            Double d11;
            Double d12;
            String str;
            U3 u11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46292b;
            uo0.c cVarB = decoder.b(m1Var);
            Double d13 = null;
            if (cVarB.i()) {
                vo0.t tVar = vo0.t.f119690a;
                Double d14 = (Double) cVarB.v(m1Var, 0, tVar, null);
                Double d15 = (Double) cVarB.v(m1Var, 1, tVar, null);
                String str2 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, null);
                d12 = d15;
                u11 = (U3) cVarB.v(m1Var, 3, U3.a.f46739a, null);
                str = str2;
                i11 = 15;
                d11 = d14;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Double d16 = null;
                String str3 = null;
                U3 u12 = null;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        d13 = (Double) cVarB.v(m1Var, 0, vo0.t.f119690a, d13);
                        i12 |= 1;
                    } else if (iA == 1) {
                        d16 = (Double) cVarB.v(m1Var, 1, vo0.t.f119690a, d16);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str3 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, str3);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        u12 = (U3) cVarB.v(m1Var, 3, U3.a.f46739a, u12);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                d11 = d13;
                d12 = d16;
                str = str3;
                u11 = u12;
            }
            cVarB.c(m1Var);
            return new E1(i11, d11, d12, str, u11);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46292b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            E1 value = (E1) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46292b;
            uo0.d dVarB = encoder.b(m1Var);
            E1.a(value, dVarB, m1Var);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public E1() {
        this.f46287a = null;
        this.f46288b = null;
        this.f46289c = null;
        this.f46290d = null;
    }

    public static final /* synthetic */ void a(E1 e11, uo0.d dVar, vo0.m1 m1Var) {
        if (dVar.G(m1Var, 0) || e11.f46287a != null) {
            dVar.y(m1Var, 0, vo0.t.f119690a, e11.f46287a);
        }
        if (dVar.G(m1Var, 1) || e11.f46288b != null) {
            dVar.y(m1Var, 1, vo0.t.f119690a, e11.f46288b);
        }
        if (dVar.G(m1Var, 2) || e11.f46289c != null) {
            dVar.y(m1Var, 2, vo0.z1.f119730a, e11.f46289c);
        }
        if (!dVar.G(m1Var, 3) && e11.f46290d == null) {
            return;
        }
        dVar.y(m1Var, 3, U3.a.f46739a, e11.f46290d);
    }

    public final String b() {
        return this.f46289c;
    }

    public final Double c() {
        return this.f46288b;
    }

    public final U3 d() {
        return this.f46290d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e11 = (E1) obj;
        return p013kotlin.jvm.internal.s.f(this.f46287a, e11.f46287a) && p013kotlin.jvm.internal.s.f(this.f46288b, e11.f46288b) && p013kotlin.jvm.internal.s.f(this.f46289c, e11.f46289c) && p013kotlin.jvm.internal.s.f(this.f46290d, e11.f46290d);
    }

    public final int hashCode() {
        Double d11 = this.f46287a;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.f46288b;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.f46289c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        U3 u11 = this.f46290d;
        return iHashCode3 + (u11 != null ? u11.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseBalance(available=" + this.f46287a + ", current=" + this.f46288b + ", currency=" + this.f46289c + ", localized=" + this.f46290d + ")";
    }

    public final Double a() {
        return this.f46287a;
    }

    @jn0.e
    public E1(int i11, Double d11, Double d12, String str, U3 u11) {
        if ((i11 & 1) == 0) {
            this.f46287a = null;
        } else {
            this.f46287a = d11;
        }
        if ((i11 & 2) == 0) {
            this.f46288b = null;
        } else {
            this.f46288b = d12;
        }
        if ((i11 & 4) == 0) {
            this.f46289c = null;
        } else {
            this.f46289c = str;
        }
        if ((i11 & 8) == 0) {
            this.f46290d = null;
        } else {
            this.f46290d = u11;
        }
    }
}
