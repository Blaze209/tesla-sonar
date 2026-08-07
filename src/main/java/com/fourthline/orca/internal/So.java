package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class So implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f27796a = to0.m.d("OrcaPaletteColor", new to0.f[0], new wn0.l() { // from class: com.fourthline.orca.internal.ip0
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return So.a((to0.a) obj);
        }
    });

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OrcaPaletteColor deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        k3.p1.Companion companion = k3.p1.INSTANCE;
        long jI = companion.i();
        long jI2 = companion.i();
        to0.f descriptor = getDescriptor();
        uo0.c cVarB = decoder.b(descriptor);
        long jA = jI;
        long jA2 = jI2;
        while (true) {
            int iA = cVarB.A(getDescriptor());
            if (iA == -1) {
                jn0.h0 h0Var = jn0.h0.f84049a;
                cVarB.c(descriptor);
                return new OrcaPaletteColor(jA, jA2, null);
            }
            if (iA == 0) {
                jA = To.a(cVarB.t(getDescriptor(), 0));
            } else {
                if (iA != 1) {
                    throw new IllegalStateException(("Unexpected index: " + iA).toString());
                }
                jA2 = To.a(cVarB.t(getDescriptor(), 1));
            }
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f27796a;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, OrcaPaletteColor value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(to0.a buildClassSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listM = p013kotlin.collections.v.m();
        vo0.z1 z1Var = vo0.z1.f119730a;
        buildClassSerialDescriptor.a("light", z1Var.getDescriptor(), listM, false);
        buildClassSerialDescriptor.a("dark", z1Var.getDescriptor(), p013kotlin.collections.v.m(), false);
        return jn0.h0.f84049a;
    }
}
