package gk;

import com.fourthline.adapters.serialization.OrcaKeys;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f69103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69104b;

    static {
        o1 o1Var = new o1();
        f69103a = o1Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogEventDto", o1Var, 3);
        m1Var.o("occurrence_time", true);
        m1Var.o("type", false);
        m1Var.o(OrcaKeys.METADATA, false);
        f69104b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        return new ro0.d[]{vo0.z1.f119730a, v1.f69147e[1], s.f69127a};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        String strT;
        e eVar;
        x xVar;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69104b;
        uo0.c cVarB = decoder.b(m1Var);
        ro0.d[] dVarArr = v1.f69147e;
        String strT2 = null;
        if (cVarB.i()) {
            strT = cVarB.t(m1Var, 0);
            eVar = (e) cVarB.n(m1Var, 1, dVarArr[1], null);
            xVar = (x) cVarB.n(m1Var, 2, s.f69127a, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            e eVar2 = null;
            x xVar2 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    strT2 = cVarB.t(m1Var, 0);
                    i12 |= 1;
                } else if (iA == 1) {
                    eVar2 = (e) cVarB.n(m1Var, 1, dVarArr[1], eVar2);
                    i12 |= 2;
                } else {
                    if (iA != 2) {
                        throw new UnknownFieldException(iA);
                    }
                    xVar2 = (x) cVarB.n(m1Var, 2, s.f69127a, xVar2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            strT = strT2;
            eVar = eVar2;
            xVar = xVar2;
        }
        cVarB.c(m1Var);
        return new v1(i11, strT, eVar, xVar);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69104b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        v1 value = (v1) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69104b;
        uo0.d dVarB = encoder.b(m1Var);
        v1.a(value, dVarB, m1Var);
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
