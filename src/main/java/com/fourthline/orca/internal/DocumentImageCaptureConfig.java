package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v9, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/v9;", "", "", "enabled", "", "compressionPercentage", "<init>", "(ZD)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZDLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/v9;Luo0/d;Lto0/f;)V", "()D", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "()Z", "b", "D", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentImageCaptureConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double compressionPercentage;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v9$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36046b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f36045a = aVar;
            f36046b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.document.DocumentImageCaptureConfig", aVar, 2);
            m1Var.o("enabled", false);
            m1Var.o("compressionPercentage", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentImageCaptureConfig deserialize(uo0.e decoder) {
            boolean zW;
            double dS;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                dS = cVarB.s(fVar, 1);
                i11 = 3;
            } else {
                double dS2 = 0.0d;
                boolean z11 = true;
                zW = false;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        dS2 = cVarB.s(fVar, 1);
                        i12 |= 2;
                    }
                }
                dS = dS2;
                i11 = i12;
            }
            boolean z12 = zW;
            cVarB.c(fVar);
            return new DocumentImageCaptureConfig(i11, z12, dS, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, vo0.t.f119690a};
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
        public final void serialize(uo0.f encoder, DocumentImageCaptureConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentImageCaptureConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v9$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentImageCaptureConfig> serializer() {
            return a.f36045a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentImageCaptureConfig(int i11, boolean z11, double d11, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f36045a.getDescriptor());
        }
        this.enabled = z11;
        this.compressionPercentage = d11;
    }

    public static final /* synthetic */ void a(DocumentImageCaptureConfig self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        output.k(serialDesc, 1, self.compressionPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentImageCaptureConfig)) {
            return false;
        }
        DocumentImageCaptureConfig documentImageCaptureConfig = (DocumentImageCaptureConfig) other;
        return this.enabled == documentImageCaptureConfig.enabled && Double.compare(this.compressionPercentage, documentImageCaptureConfig.compressionPercentage) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Double.hashCode(this.compressionPercentage);
    }

    public String toString() {
        return "DocumentImageCaptureConfig(enabled=" + this.enabled + ", compressionPercentage=" + this.compressionPercentage + ")";
    }

    public DocumentImageCaptureConfig(boolean z11, double d11) {
        this.enabled = z11;
        this.compressionPercentage = d11;
    }

    public final double a() {
        if (this.enabled) {
            return this.compressionPercentage;
        }
        return 0.8d;
    }
}
