package com.plaid.internal;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0 f46466a;

    @jn0.e
    public static final class a implements vo0.e0<N0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46468b;

        static {
            a aVar = new a();
            f46467a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.models.EmbeddedSessionLinkTokenConfiguration", aVar, 1);
            m1Var.o("link_token_configuration", false);
            f46468b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{M0.a.f46450a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            M0 m11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46468b;
            uo0.c cVarB = decoder.b(m1Var);
            int i11 = 1;
            M0 m12 = null;
            if (cVarB.i()) {
                m11 = (M0) cVarB.n(m1Var, 0, M0.a.f46450a, null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        m12 = (M0) cVarB.n(m1Var, 0, M0.a.f46450a, m12);
                        i12 = 1;
                    }
                }
                m11 = m12;
                i11 = i12;
            }
            cVarB.c(m1Var);
            return new N0(i11, m11);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46468b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            N0 value = (N0) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46468b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.D(m1Var, 0, M0.a.f46450a, value.f46466a);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b {
        public static void a() {
            a aVar = a.f46467a;
        }
    }

    @jn0.e
    public N0(int i11, @ro0.o("link_token_configuration") M0 m11) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f46468b);
        }
        this.f46466a = m11;
    }

    public final M0 a() {
        return this.f46466a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N0) && p013kotlin.jvm.internal.s.f(this.f46466a, ((N0) obj).f46466a);
    }

    public final int hashCode() {
        return this.f46466a.hashCode();
    }

    public final String toString() {
        return "EmbeddedSessionLinkTokenConfiguration(embeddedSessionInfo=" + this.f46466a + ")";
    }
}
