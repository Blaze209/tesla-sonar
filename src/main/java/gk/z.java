package gk;

import ch.qos.logback.core.joran.action.Action;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f69166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69167b;

    static {
        z zVar = new z();
        f69166a = zVar;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.service.dto.TokenizeCardDto", zVar, 7);
        m1Var.o("holder_name", false);
        m1Var.o("pan", false);
        m1Var.o("cvv", false);
        m1Var.o("expiration_month", false);
        m1Var.o("expiration_year", false);
        m1Var.o("country_code", false);
        m1Var.o(Action.KEY_ATTRIBUTE, false);
        f69167b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        vo0.z1 z1Var = vo0.z1.f119730a;
        vo0.j0 j0Var = vo0.j0.f119632a;
        return new ro0.d[]{z1Var, z1Var, z1Var, j0Var, j0Var, z1Var, z1Var};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        String strT;
        String strT2;
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        int i13;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69167b;
        uo0.c cVarB = decoder.b(m1Var);
        if (cVarB.i()) {
            strT = cVarB.t(m1Var, 0);
            String strT3 = cVarB.t(m1Var, 1);
            String strT4 = cVarB.t(m1Var, 2);
            int iE = cVarB.e(m1Var, 3);
            int iE2 = cVarB.e(m1Var, 4);
            String strT5 = cVarB.t(m1Var, 5);
            strT2 = cVarB.t(m1Var, 6);
            str = strT5;
            i11 = iE;
            i12 = iE2;
            str2 = strT4;
            str3 = strT3;
            i13 = 127;
        } else {
            strT = null;
            String strT6 = null;
            String strT7 = null;
            String strT8 = null;
            String strT9 = null;
            boolean z11 = true;
            int iE3 = 0;
            int iE4 = 0;
            int i14 = 0;
            while (z11) {
                int iA = cVarB.A(m1Var);
                switch (iA) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        strT = cVarB.t(m1Var, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        strT9 = cVarB.t(m1Var, 1);
                        i14 |= 2;
                        break;
                    case 2:
                        strT8 = cVarB.t(m1Var, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        iE3 = cVarB.e(m1Var, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iE4 = cVarB.e(m1Var, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        strT7 = cVarB.t(m1Var, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        strT6 = cVarB.t(m1Var, 6);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            strT2 = strT6;
            str = strT7;
            i11 = iE3;
            i12 = iE4;
            str2 = strT8;
            str3 = strT9;
            i13 = i14;
        }
        String str4 = strT;
        cVarB.c(m1Var);
        return new e0(i13, str4, str3, str2, i11, i12, str, strT2);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69167b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        e0 value = (e0) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69167b;
        uo0.d dVarB = encoder.b(m1Var);
        dVarB.e(m1Var, 0, value.f69038a);
        dVarB.e(m1Var, 1, value.f69039b);
        dVarB.e(m1Var, 2, value.f69040c);
        dVarB.x(m1Var, 3, value.f69041d);
        dVarB.x(m1Var, 4, value.f69042e);
        dVarB.e(m1Var, 5, value.f69043f);
        dVarB.e(m1Var, 6, value.f69044g);
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
