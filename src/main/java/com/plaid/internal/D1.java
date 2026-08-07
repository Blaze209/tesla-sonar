package com.plaid.internal;

import expo.modules.contacts.Columns;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class D1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f46261g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ax.c(Columns.ID)
    private final String f46262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ax.c("meta")
    private final F1 f46263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ax.c("type")
    private final String f46264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ax.c("subtype")
    private final String f46265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ax.c("verification_status")
    private final String f46266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ax.c("balance")
    private final E1 f46267f;

    @jn0.e
    public static final class a implements vo0.e0<D1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46269b;

        static {
            a aVar = new a();
            f46268a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            m1Var.o(Columns.ID, true);
            m1Var.o("meta", true);
            m1Var.o("type", true);
            m1Var.o("subtype", true);
            m1Var.o("verification_status", true);
            m1Var.o("balance", true);
            f46269b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, so0.a.p(F1.a.f46309a), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(E1.a.f46291a)};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            int i11;
            String str;
            F1 f11;
            String str2;
            String str3;
            String str4;
            E1 e11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46269b;
            uo0.c cVarB = decoder.b(m1Var);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(m1Var, 0);
                F1 f12 = (F1) cVarB.v(m1Var, 1, F1.a.f46309a, null);
                vo0.z1 z1Var = vo0.z1.f119730a;
                String str5 = (String) cVarB.v(m1Var, 2, z1Var, null);
                String str6 = (String) cVarB.v(m1Var, 3, z1Var, null);
                String str7 = (String) cVarB.v(m1Var, 4, z1Var, null);
                str = strT2;
                e11 = (E1) cVarB.v(m1Var, 5, E1.a.f46291a, null);
                str3 = str6;
                str4 = str7;
                str2 = str5;
                f11 = f12;
                i11 = 63;
            } else {
                boolean z11 = true;
                int i12 = 0;
                F1 f13 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                E1 e12 = null;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            strT = cVarB.t(m1Var, 0);
                            i12 |= 1;
                            continue;
                        case 1:
                            f13 = (F1) cVarB.v(m1Var, 1, F1.a.f46309a, f13);
                            i12 |= 2;
                            break;
                        case 2:
                            str8 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, str8);
                            i12 |= 4;
                            break;
                        case 3:
                            str9 = (String) cVarB.v(m1Var, 3, vo0.z1.f119730a, str9);
                            i12 |= 8;
                            break;
                        case 4:
                            str10 = (String) cVarB.v(m1Var, 4, vo0.z1.f119730a, str10);
                            i12 |= 16;
                            break;
                        case 5:
                            e12 = (E1) cVarB.v(m1Var, 5, E1.a.f46291a, e12);
                            i12 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i12;
                str = strT;
                f11 = f13;
                str2 = str8;
                str3 = str9;
                str4 = str10;
                e11 = e12;
            }
            cVarB.c(m1Var);
            return new D1(i11, str, f11, str2, str3, str4, e11);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46269b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            D1 value = (D1) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46269b;
            uo0.d dVarB = encoder.b(m1Var);
            D1.a(value, dVarB, m1Var);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b {
        public static void a() {
            a aVar = a.f46268a;
        }
    }

    @jn0.e
    public D1(int i11, String str, F1 f11, String str2, String str3, String str4, E1 e11) {
        this.f46262a = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.f46263b = null;
        } else {
            this.f46263b = f11;
        }
        if ((i11 & 4) == 0) {
            this.f46264c = null;
        } else {
            this.f46264c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f46265d = null;
        } else {
            this.f46265d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f46266e = null;
        } else {
            this.f46266e = str4;
        }
        if ((i11 & 32) == 0) {
            this.f46267f = null;
        } else {
            this.f46267f = e11;
        }
    }

    public static final /* synthetic */ void a(D1 d11, uo0.d dVar, vo0.m1 m1Var) {
        if (dVar.G(m1Var, 0) || !p013kotlin.jvm.internal.s.f(d11.f46262a, "")) {
            dVar.e(m1Var, 0, d11.f46262a);
        }
        if (dVar.G(m1Var, 1) || d11.f46263b != null) {
            dVar.y(m1Var, 1, F1.a.f46309a, d11.f46263b);
        }
        if (dVar.G(m1Var, 2) || d11.f46264c != null) {
            dVar.y(m1Var, 2, vo0.z1.f119730a, d11.f46264c);
        }
        if (dVar.G(m1Var, 3) || d11.f46265d != null) {
            dVar.y(m1Var, 3, vo0.z1.f119730a, d11.f46265d);
        }
        if (dVar.G(m1Var, 4) || d11.f46266e != null) {
            dVar.y(m1Var, 4, vo0.z1.f119730a, d11.f46266e);
        }
        if (!dVar.G(m1Var, 5) && d11.f46267f == null) {
            return;
        }
        dVar.y(m1Var, 5, E1.a.f46291a, d11.f46267f);
    }

    public final F1 b() {
        return this.f46263b;
    }

    public final String c() {
        return this.f46265d;
    }

    public final String d() {
        return this.f46264c;
    }

    public final String e() {
        return this.f46266e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d11 = (D1) obj;
        return p013kotlin.jvm.internal.s.f(this.f46262a, d11.f46262a) && p013kotlin.jvm.internal.s.f(this.f46263b, d11.f46263b) && p013kotlin.jvm.internal.s.f(this.f46264c, d11.f46264c) && p013kotlin.jvm.internal.s.f(this.f46265d, d11.f46265d) && p013kotlin.jvm.internal.s.f(this.f46266e, d11.f46266e) && p013kotlin.jvm.internal.s.f(this.f46267f, d11.f46267f);
    }

    public final String f() {
        return this.f46262a;
    }

    public final int hashCode() {
        int iHashCode = this.f46262a.hashCode() * 31;
        F1 f11 = this.f46263b;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str = this.f46264c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46265d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46266e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        E1 e11 = this.f46267f;
        return iHashCode5 + (e11 != null ? e11.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountResponseAccount(_id=" + this.f46262a + ", meta=" + this.f46263b + ", type=" + this.f46264c + ", subtype=" + this.f46265d + ", verification_status=" + this.f46266e + ", balance=" + this.f46267f + ")";
    }

    public D1() {
        p013kotlin.jvm.internal.s.k("", Columns.ID);
        this.f46262a = "";
        this.f46263b = null;
        this.f46264c = null;
        this.f46265d = null;
        this.f46266e = null;
        this.f46267f = null;
    }

    public final E1 a() {
        return this.f46267f;
    }
}
