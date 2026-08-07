package com.fourthline.scanners.config.orca.flavor;

import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OrcaColorModeConfig$$serializer implements e0<OrcaColorModeConfig> {
    public static final OrcaColorModeConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OrcaColorModeConfig$$serializer orcaColorModeConfig$$serializer = new OrcaColorModeConfig$$serializer();
        INSTANCE = orcaColorModeConfig$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.flavor.OrcaColorModeConfig", orcaColorModeConfig$$serializer, 2);
        m1Var.o("colorsLight", false);
        m1Var.o("colorsDark", false);
        descriptor = m1Var;
    }

    private OrcaColorModeConfig$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        OrcaColorsConfig$$serializer orcaColorsConfig$$serializer = OrcaColorsConfig$$serializer.INSTANCE;
        return new d[]{a.p(orcaColorsConfig$$serializer), a.p(orcaColorsConfig$$serializer)};
    }

    @Override // ro0.c
    public final OrcaColorModeConfig deserialize(uo0.e decoder) {
        OrcaColorsConfig orcaColorsConfig;
        int i11;
        OrcaColorsConfig orcaColorsConfig2;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        v1 v1Var = null;
        if (cVarB.i()) {
            OrcaColorsConfig$$serializer orcaColorsConfig$$serializer = OrcaColorsConfig$$serializer.INSTANCE;
            orcaColorsConfig2 = (OrcaColorsConfig) cVarB.v(fVar, 0, orcaColorsConfig$$serializer, null);
            orcaColorsConfig = (OrcaColorsConfig) cVarB.v(fVar, 1, orcaColorsConfig$$serializer, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            orcaColorsConfig = null;
            OrcaColorsConfig orcaColorsConfig3 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    orcaColorsConfig3 = (OrcaColorsConfig) cVarB.v(fVar, 0, OrcaColorsConfig$$serializer.INSTANCE, orcaColorsConfig3);
                    i12 |= 1;
                } else {
                    if (iA != 1) {
                        throw new UnknownFieldException(iA);
                    }
                    orcaColorsConfig = (OrcaColorsConfig) cVarB.v(fVar, 1, OrcaColorsConfig$$serializer.INSTANCE, orcaColorsConfig);
                    i12 |= 2;
                }
            }
            i11 = i12;
            orcaColorsConfig2 = orcaColorsConfig3;
        }
        cVarB.c(fVar);
        return new OrcaColorModeConfig(i11, orcaColorsConfig2, orcaColorsConfig, v1Var);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, OrcaColorModeConfig value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        OrcaColorModeConfig.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
