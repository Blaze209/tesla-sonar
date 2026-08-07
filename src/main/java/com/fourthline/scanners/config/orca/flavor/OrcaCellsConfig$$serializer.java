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

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/flavor/OrcaCellsConfig.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OrcaCellsConfig$$serializer implements e0<OrcaCellsConfig> {
    public static final OrcaCellsConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OrcaCellsConfig$$serializer orcaCellsConfig$$serializer = new OrcaCellsConfig$$serializer();
        INSTANCE = orcaCellsConfig$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.flavor.OrcaCellsConfig", orcaCellsConfig$$serializer, 2);
        m1Var.o("cellStyle1", false);
        m1Var.o("cellStyle2", false);
        descriptor = m1Var;
    }

    private OrcaCellsConfig$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        OrcaCellConfig$$serializer orcaCellConfig$$serializer = OrcaCellConfig$$serializer.INSTANCE;
        return new d[]{a.p(orcaCellConfig$$serializer), a.p(orcaCellConfig$$serializer)};
    }

    @Override // ro0.c
    public final OrcaCellsConfig deserialize(uo0.e decoder) {
        OrcaCellConfig orcaCellConfig;
        int i11;
        OrcaCellConfig orcaCellConfig2;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        if (cVarB.i()) {
            OrcaCellConfig$$serializer orcaCellConfig$$serializer = OrcaCellConfig$$serializer.INSTANCE;
            orcaCellConfig2 = (OrcaCellConfig) cVarB.v(fVar, 0, orcaCellConfig$$serializer, null);
            orcaCellConfig = (OrcaCellConfig) cVarB.v(fVar, 1, orcaCellConfig$$serializer, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            orcaCellConfig = null;
            OrcaCellConfig orcaCellConfig3 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    orcaCellConfig3 = (OrcaCellConfig) cVarB.v(fVar, 0, OrcaCellConfig$$serializer.INSTANCE, orcaCellConfig3);
                    i12 |= 1;
                } else {
                    if (iA != 1) {
                        throw new UnknownFieldException(iA);
                    }
                    orcaCellConfig = (OrcaCellConfig) cVarB.v(fVar, 1, OrcaCellConfig$$serializer.INSTANCE, orcaCellConfig);
                    i12 |= 2;
                }
            }
            i11 = i12;
            orcaCellConfig2 = orcaCellConfig3;
        }
        cVarB.c(fVar);
        return new OrcaCellsConfig(i11, orcaCellConfig2, orcaCellConfig, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, OrcaCellsConfig value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        OrcaCellsConfig.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
