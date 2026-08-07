package gk;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f69125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69126b;

    static {
        r1 r1Var = new r1();
        f69125a = r1Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.service.dto.CardTokenDto", r1Var, 1);
        m1Var.o("token", false);
        f69126b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        return new ro0.d[]{vo0.z1.f119730a};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        String strT;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69126b;
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
        return new x1(i11, strT);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69126b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        x1 value = (x1) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69126b;
        uo0.d dVarB = encoder.b(m1Var);
        dVarB.e(m1Var, 0, value.f69158a);
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
