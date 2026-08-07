package com.plaid.internal;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ax.c("available")
    private final String f46737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ax.c("current")
    private final String f46738b;

    @jn0.e
    public static final class a implements vo0.e0<U3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46740b;

        static {
            a aVar = new a();
            f46739a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.url.LocalizedLinkAccountResponseBalance", aVar, 2);
            m1Var.o("available", true);
            m1Var.o("current", true);
            f46740b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var)};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46740b;
            uo0.c cVarB = decoder.b(m1Var);
            String str3 = null;
            if (cVarB.i()) {
                vo0.z1 z1Var = vo0.z1.f119730a;
                str = (String) cVarB.v(m1Var, 0, z1Var, null);
                str2 = (String) cVarB.v(m1Var, 1, z1Var, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str4 = null;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str3 = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, str3);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        str4 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, str4);
                        i12 |= 2;
                    }
                }
                i11 = i12;
                str = str3;
                str2 = str4;
            }
            cVarB.c(m1Var);
            return new U3(i11, str, str2);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46740b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            U3 value = (U3) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46740b;
            uo0.d dVarB = encoder.b(m1Var);
            U3.a(value, dVarB, m1Var);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public U3() {
        this.f46737a = null;
        this.f46738b = null;
    }

    public static final /* synthetic */ void a(U3 u11, uo0.d dVar, vo0.m1 m1Var) {
        if (dVar.G(m1Var, 0) || u11.f46737a != null) {
            dVar.y(m1Var, 0, vo0.z1.f119730a, u11.f46737a);
        }
        if (!dVar.G(m1Var, 1) && u11.f46738b == null) {
            return;
        }
        dVar.y(m1Var, 1, vo0.z1.f119730a, u11.f46738b);
    }

    public final String b() {
        return this.f46738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U3)) {
            return false;
        }
        U3 u11 = (U3) obj;
        return p013kotlin.jvm.internal.s.f(this.f46737a, u11.f46737a) && p013kotlin.jvm.internal.s.f(this.f46738b, u11.f46738b);
    }

    public final int hashCode() {
        String str = this.f46737a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46738b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LocalizedLinkAccountResponseBalance(available=" + this.f46737a + ", current=" + this.f46738b + ")";
    }

    public final String a() {
        return this.f46737a;
    }

    @jn0.e
    public U3(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f46737a = null;
        } else {
            this.f46737a = str;
        }
        if ((i11 & 2) == 0) {
            this.f46738b = null;
        } else {
            this.f46738b = str2;
        }
    }
}
