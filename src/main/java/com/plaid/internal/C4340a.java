package com.plaid.internal;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.plaid.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class C4340a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46855a;

    /* JADX INFO: renamed from: com.plaid.internal.a$a, reason: collision with other inner class name */
    @jn0.e
    public static final class C0720a implements vo0.e0<C4340a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0720a f46856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46857b;

        static {
            C0720a c0720a = new C0720a();
            f46856a = c0720a;
            vo0.m1 m1Var = new vo0.m1("com.plaid.core.webview.ActionMessage", c0720a, 1);
            m1Var.o("action", false);
            f46857b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            String strT;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46857b;
            uo0.c cVarB = decoder.b(m1Var);
            int i11 = 1;
            if (cVarB.i()) {
                strT = cVarB.t(m1Var, 0);
            } else {
                strT = null;
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
                        strT = cVarB.t(m1Var, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(m1Var);
            return new C4340a(i11, strT);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46857b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            C4340a value = (C4340a) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46857b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.e(m1Var, 0, value.f46855a);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.a$b */
    public static final class b {
        public static void a() {
            C0720a c0720a = C0720a.f46856a;
        }
    }

    @jn0.e
    public C4340a(int i11, @ro0.o("action") String str) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, C0720a.f46857b);
        }
        this.f46855a = str;
    }

    public final String a() {
        return this.f46855a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4340a) && p013kotlin.jvm.internal.s.f(this.f46855a, ((C4340a) obj).f46855a);
    }

    public final int hashCode() {
        return this.f46855a.hashCode();
    }

    public final String toString() {
        return "ActionMessage(action=" + this.f46855a + ")";
    }
}
