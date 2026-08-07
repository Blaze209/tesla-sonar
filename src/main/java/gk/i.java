package gk;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f69063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69064b;

    static {
        i iVar = new i();
        f69063a = iVar;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogMerchantDto", iVar, 2);
        m1Var.o(PlaceTypes.COUNTRY, false);
        m1Var.o("app", true);
        f69064b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        return new ro0.d[]{so0.a.p(vo0.z1.f119730a), so0.a.p(y.f69159a)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        String str;
        d0 d0Var;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69064b;
        uo0.c cVarB = decoder.b(m1Var);
        String str2 = null;
        if (cVarB.i()) {
            str = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, null);
            d0Var = (d0) cVarB.v(m1Var, 1, y.f69159a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            d0 d0Var2 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    str2 = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, str2);
                    i12 |= 1;
                } else {
                    if (iA != 1) {
                        throw new UnknownFieldException(iA);
                    }
                    d0Var2 = (d0) cVarB.v(m1Var, 1, y.f69159a, d0Var2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            str = str2;
            d0Var = d0Var2;
        }
        cVarB.c(m1Var);
        return new p(i11, str, d0Var);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69064b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        p value = (p) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69064b;
        uo0.d dVarB = encoder.b(m1Var);
        dVarB.y(m1Var, 0, vo0.z1.f119730a, value.f69106a);
        if (dVarB.G(m1Var, 1) || value.f69107b != null) {
            dVarB.y(m1Var, 1, y.f69159a, value.f69107b);
        }
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
