package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.S6, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0015 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0015\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/S6;", "", "", "enabled", "", "minimumAge", "", "imageUploadTimeoutMs", "backendProcessingTimeoutMs", "<init>", "(ZIJJ)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZIJJLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/S6;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "I", DateTokenConverter.CONVERTER_KEY, "c", "J", "()J", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentAnalysisConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minimumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long imageUploadTimeoutMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backendProcessingTimeoutMs;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.S6$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27721b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f27720a = aVar;
            f27721b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.document.DocumentAnalysisConfig", aVar, 4);
            m1Var.o("enabled", false);
            m1Var.o("minimumAge", false);
            m1Var.o("imageUploadTimeoutMs", false);
            m1Var.o("backendProcessingTimeoutMs", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentAnalysisConfig deserialize(uo0.e decoder) {
            boolean zW;
            long j11;
            int i11;
            long j12;
            int i12;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                int iE = cVarB.e(fVar, 1);
                long j13 = cVarB.j(fVar, 2);
                j11 = cVarB.j(fVar, 3);
                i11 = iE;
                j12 = j13;
                i12 = 15;
            } else {
                long j14 = 0;
                boolean z11 = true;
                zW = false;
                int iE2 = 0;
                int i13 = 0;
                long j15 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i13 |= 1;
                    } else if (iA == 1) {
                        iE2 = cVarB.e(fVar, 1);
                        i13 |= 2;
                    } else if (iA == 2) {
                        j15 = cVarB.j(fVar, 2);
                        i13 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        j14 = cVarB.j(fVar, 3);
                        i13 |= 8;
                    }
                }
                j11 = j14;
                i11 = iE2;
                j12 = j15;
                i12 = i13;
            }
            boolean z12 = zW;
            cVarB.c(fVar);
            return new DocumentAnalysisConfig(i12, z12, i11, j12, j11, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.s0 s0Var = vo0.s0.f119686a;
            return new ro0.d[]{vo0.h.f119620a, vo0.j0.f119632a, s0Var, s0Var};
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
        public final void serialize(uo0.f encoder, DocumentAnalysisConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentAnalysisConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.S6$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentAnalysisConfig> serializer() {
            return a.f27720a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentAnalysisConfig(int i11, boolean z11, int i12, long j11, long j12, vo0.v1 v1Var) {
        if (15 != (i11 & 15)) {
            vo0.h1.b(i11, 15, a.f27720a.getDescriptor());
        }
        this.enabled = z11;
        this.minimumAge = i12;
        this.imageUploadTimeoutMs = j11;
        this.backendProcessingTimeoutMs = j12;
    }

    public static final /* synthetic */ void a(DocumentAnalysisConfig self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        output.x(serialDesc, 1, self.minimumAge);
        output.z(serialDesc, 2, self.imageUploadTimeoutMs);
        output.z(serialDesc, 3, self.backendProcessingTimeoutMs);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getImageUploadTimeoutMs() {
        return this.imageUploadTimeoutMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentAnalysisConfig)) {
            return false;
        }
        DocumentAnalysisConfig documentAnalysisConfig = (DocumentAnalysisConfig) other;
        return this.enabled == documentAnalysisConfig.enabled && this.minimumAge == documentAnalysisConfig.minimumAge && this.imageUploadTimeoutMs == documentAnalysisConfig.imageUploadTimeoutMs && this.backendProcessingTimeoutMs == documentAnalysisConfig.backendProcessingTimeoutMs;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.minimumAge)) * 31) + Long.hashCode(this.imageUploadTimeoutMs)) * 31) + Long.hashCode(this.backendProcessingTimeoutMs);
    }

    public String toString() {
        return "DocumentAnalysisConfig(enabled=" + this.enabled + ", minimumAge=" + this.minimumAge + ", imageUploadTimeoutMs=" + this.imageUploadTimeoutMs + ", backendProcessingTimeoutMs=" + this.backendProcessingTimeoutMs + ")";
    }

    public DocumentAnalysisConfig(boolean z11, int i11, long j11, long j12) {
        this.enabled = z11;
        this.minimumAge = i11;
        this.imageUploadTimeoutMs = j11;
        this.backendProcessingTimeoutMs = j12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackendProcessingTimeoutMs() {
        return this.backendProcessingTimeoutMs;
    }
}
