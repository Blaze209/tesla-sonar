package gk;

import com.adyen.checkout.components.core.action.SdkAction;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f69073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69074b;

    static {
        j0 j0Var = new j0();
        f69073a = j0Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.DLLogEvent", j0Var, 5);
        m1Var.o("event", false);
        m1Var.o("interface_style", true);
        m1Var.o("platform", true);
        m1Var.o(SdkAction.ACTION_TYPE, true);
        m1Var.o("merchant", false);
        f69074b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        ro0.d dVarP = so0.a.p(q0.f69111g[1]);
        ro0.d dVarP2 = so0.a.p(i.f69063a);
        y yVar = y.f69159a;
        return new ro0.d[]{o1.f69103a, dVarP, yVar, yVar, dVarP2};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        v1 v1Var;
        q1 q1Var;
        d0 d0Var;
        d0 d0Var2;
        p pVar;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69074b;
        uo0.c cVarB = decoder.b(m1Var);
        ro0.d[] dVarArr = q0.f69111g;
        v1 v1Var2 = null;
        if (cVarB.i()) {
            v1 v1Var3 = (v1) cVarB.n(m1Var, 0, o1.f69103a, null);
            q1 q1Var2 = (q1) cVarB.v(m1Var, 1, dVarArr[1], null);
            y yVar = y.f69159a;
            d0 d0Var3 = (d0) cVarB.n(m1Var, 2, yVar, null);
            q1Var = q1Var2;
            v1Var = v1Var3;
            d0Var2 = (d0) cVarB.n(m1Var, 3, yVar, null);
            pVar = (p) cVarB.v(m1Var, 4, i.f69063a, null);
            d0Var = d0Var3;
            i11 = 31;
        } else {
            boolean z11 = true;
            int i12 = 0;
            q1 q1Var3 = null;
            d0 d0Var4 = null;
            d0 d0Var5 = null;
            p pVar2 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    v1Var2 = (v1) cVarB.n(m1Var, 0, o1.f69103a, v1Var2);
                    i12 |= 1;
                } else if (iA == 1) {
                    q1Var3 = (q1) cVarB.v(m1Var, 1, dVarArr[1], q1Var3);
                    i12 |= 2;
                } else if (iA == 2) {
                    d0Var4 = (d0) cVarB.n(m1Var, 2, y.f69159a, d0Var4);
                    i12 |= 4;
                } else if (iA == 3) {
                    d0Var5 = (d0) cVarB.n(m1Var, 3, y.f69159a, d0Var5);
                    i12 |= 8;
                } else {
                    if (iA != 4) {
                        throw new UnknownFieldException(iA);
                    }
                    pVar2 = (p) cVarB.v(m1Var, 4, i.f69063a, pVar2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            v1Var = v1Var2;
            q1Var = q1Var3;
            d0Var = d0Var4;
            d0Var2 = d0Var5;
            pVar = pVar2;
        }
        cVarB.c(m1Var);
        return new q0(i11, v1Var, q1Var, d0Var, d0Var2, pVar);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69074b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        q0 value = (q0) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69074b;
        uo0.d dVarB = encoder.b(m1Var);
        ro0.d[] dVarArr = q0.f69111g;
        dVarB.D(m1Var, 0, o1.f69103a, value.f69112a);
        if (dVarB.G(m1Var, 1) || value.f69113b != null) {
            dVarB.y(m1Var, 1, dVarArr[1], value.f69113b);
        }
        if (dVarB.G(m1Var, 2) || !p013kotlin.jvm.internal.s.f(value.f69114c, new d0("android", n0.a(q0.f69110f), null))) {
            dVarB.D(m1Var, 2, y.f69159a, value.f69114c);
        }
        if (dVarB.G(m1Var, 3) || !p013kotlin.jvm.internal.s.f(value.f69115d, new d0(DevicePublicKeyStringDef.DIRECT, "1.1.0", null))) {
            dVarB.D(m1Var, 3, y.f69159a, value.f69115d);
        }
        dVarB.y(m1Var, 4, i.f69063a, value.f69116e);
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
