package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 '2\u00020\u0001:\u0002\u0017\u001fB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/fd;", "Lcom/fourthline/orca/internal/Rf;", "", "eIdFlowName", "documentFlowName", "", "boxCardSimulation", "Lcom/fourthline/orca/internal/w8;", "fallbackDocumentConfig", "makeFlowVariantRequest", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/fourthline/orca/internal/w8;Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/fourthline/orca/internal/w8;ZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/fd;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/cd;", "g", "()Lcom/fourthline/orca/internal/cd;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "Z", "()Z", "Lcom/fourthline/orca/internal/w8;", "e", "()Lcom/fourthline/orca/internal/w8;", "f", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class C3257fd implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31716f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eIdFlowName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String documentFlowName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean boxCardSimulation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DocumentFlowConfig fallbackDocumentConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean makeFlowVariantRequest;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fd$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31723b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31722a = aVar;
            f31723b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.eid.EidFlowConfig", aVar, 5);
            m1Var.o("eIdFlowName", true);
            m1Var.o("documentFlowName", true);
            m1Var.o("boxCardSimulation", true);
            m1Var.o("fallbackDocumentConfig", false);
            m1Var.o("makeFlowVariantRequest", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3257fd deserialize(uo0.e decoder) {
            boolean zW;
            boolean z11;
            int i11;
            String str;
            String str2;
            DocumentFlowConfig c3975w8;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                String strT = cVarB.t(fVar, 0);
                String strT2 = cVarB.t(fVar, 1);
                boolean zW2 = cVarB.w(fVar, 2);
                str = strT;
                c3975w8 = (DocumentFlowConfig) cVarB.n(fVar, 3, DocumentFlowConfig.a.f36363a, null);
                zW = cVarB.w(fVar, 4);
                z11 = zW2;
                str2 = strT2;
                i11 = 31;
            } else {
                boolean z12 = true;
                boolean zW3 = false;
                int i12 = 0;
                String strT3 = null;
                String strT4 = null;
                DocumentFlowConfig c3975w9 = null;
                boolean zW4 = false;
                while (z12) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z12 = false;
                    } else if (iA == 0) {
                        strT3 = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT4 = cVarB.t(fVar, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        zW4 = cVarB.w(fVar, 2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        c3975w9 = (DocumentFlowConfig) cVarB.n(fVar, 3, DocumentFlowConfig.a.f36363a, c3975w9);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        zW3 = cVarB.w(fVar, 4);
                        i12 |= 16;
                    }
                }
                zW = zW3;
                z11 = zW4;
                i11 = i12;
                str = strT3;
                str2 = strT4;
                c3975w8 = c3975w9;
            }
            cVarB.c(fVar);
            return new C3257fd(i11, str, str2, z11, c3975w8, zW, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{z1Var, z1Var, hVar, DocumentFlowConfig.a.f36363a, hVar};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, C3257fd value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            C3257fd.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fd$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<C3257fd> serializer() {
            return a.f31722a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C3257fd(int i11, String str, String str2, boolean z11, DocumentFlowConfig c3975w8, boolean z12, vo0.v1 v1Var) {
        if (8 != (i11 & 8)) {
            vo0.h1.b(i11, 8, a.f31722a.getDescriptor());
        }
        this.eIdFlowName = (i11 & 1) == 0 ? "eIdDocument" : str;
        if ((i11 & 2) == 0) {
            this.documentFlowName = "IdDocument";
        } else {
            this.documentFlowName = str2;
        }
        if ((i11 & 4) == 0) {
            this.boxCardSimulation = true;
        } else {
            this.boxCardSimulation = z11;
        }
        this.fallbackDocumentConfig = c3975w8;
        if ((i11 & 16) == 0) {
            this.makeFlowVariantRequest = true;
        } else {
            this.makeFlowVariantRequest = z12;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBoxCardSimulation() {
        return this.boxCardSimulation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentFlowName() {
        return this.documentFlowName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEIdFlowName() {
        return this.eIdFlowName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentFlowConfig getFallbackDocumentConfig() {
        return this.fallbackDocumentConfig;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getMakeFlowVariantRequest() {
        return this.makeFlowVariantRequest;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3129cd a() {
        return new C3129cd(this);
    }

    public C3257fd(String eIdFlowName, String documentFlowName, boolean z11, DocumentFlowConfig fallbackDocumentConfig, boolean z12) {
        p013kotlin.jvm.internal.s.k(eIdFlowName, "eIdFlowName");
        p013kotlin.jvm.internal.s.k(documentFlowName, "documentFlowName");
        p013kotlin.jvm.internal.s.k(fallbackDocumentConfig, "fallbackDocumentConfig");
        this.eIdFlowName = eIdFlowName;
        this.documentFlowName = documentFlowName;
        this.boxCardSimulation = z11;
        this.fallbackDocumentConfig = fallbackDocumentConfig;
        this.makeFlowVariantRequest = z12;
    }

    public static final /* synthetic */ void a(C3257fd self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.eIdFlowName, "eIdDocument")) {
            output.e(serialDesc, 0, self.eIdFlowName);
        }
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.documentFlowName, "IdDocument")) {
            output.e(serialDesc, 1, self.documentFlowName);
        }
        if (output.G(serialDesc, 2) || !self.boxCardSimulation) {
            output.A(serialDesc, 2, self.boxCardSimulation);
        }
        output.D(serialDesc, 3, DocumentFlowConfig.a.f36363a, self.fallbackDocumentConfig);
        if (!output.G(serialDesc, 4) && self.makeFlowVariantRequest) {
            return;
        }
        output.A(serialDesc, 4, self.makeFlowVariantRequest);
    }

    public /* synthetic */ C3257fd(String str, String str2, boolean z11, DocumentFlowConfig c3975w8, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "eIdDocument" : str, (i11 & 2) != 0 ? "IdDocument" : str2, (i11 & 4) != 0 ? true : z11, c3975w8, (i11 & 16) != 0 ? true : z12);
    }
}
