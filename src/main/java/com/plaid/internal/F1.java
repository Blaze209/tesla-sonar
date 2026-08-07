package com.plaid.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class F1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f46306c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ax.c("name")
    private final String f46307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ax.c(InquiryField.FloatField.TYPE2)
    private final String f46308b;

    @jn0.e
    public static final class a implements vo0.e0<F1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46310b;

        static {
            a aVar = new a();
            f46309a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.url.LinkAccountResponseMeta", aVar, 2);
            m1Var.o("name", true);
            m1Var.o(InquiryField.FloatField.TYPE2, true);
            f46310b = m1Var;
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
            vo0.m1 m1Var = f46310b;
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
            return new F1(i11, str, str2);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46310b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            F1 value = (F1) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46310b;
            uo0.d dVarB = encoder.b(m1Var);
            F1.a(value, dVarB, m1Var);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b {
    }

    public F1() {
        this.f46307a = null;
        this.f46308b = null;
    }

    public static final /* synthetic */ void a(F1 f11, uo0.d dVar, vo0.m1 m1Var) {
        if (dVar.G(m1Var, 0) || f11.f46307a != null) {
            dVar.y(m1Var, 0, vo0.z1.f119730a, f11.f46307a);
        }
        if (!dVar.G(m1Var, 1) && f11.f46308b == null) {
            return;
        }
        dVar.y(m1Var, 1, vo0.z1.f119730a, f11.f46308b);
    }

    public final String b() {
        return this.f46308b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return false;
        }
        F1 f11 = (F1) obj;
        return p013kotlin.jvm.internal.s.f(this.f46307a, f11.f46307a) && p013kotlin.jvm.internal.s.f(this.f46308b, f11.f46308b);
    }

    public final int hashCode() {
        String str = this.f46307a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46308b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseMeta(name=" + this.f46307a + ", number=" + this.f46308b + ")";
    }

    public final String a() {
        return this.f46307a;
    }

    @jn0.e
    public F1(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f46307a = null;
        } else {
            this.f46307a = str;
        }
        if ((i11 & 2) == 0) {
            this.f46308b = null;
        } else {
            this.f46308b = str2;
        }
    }
}
