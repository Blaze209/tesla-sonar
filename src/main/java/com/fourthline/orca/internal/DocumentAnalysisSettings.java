package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r7, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002\u0016 BE\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u0016\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/r7;", "", "", "seen0", "", "enabled", "", "imageUploadTimeoutMs", "backendProcessingTimeoutMs", "minimumAge", "", "scannerDialogStrategy", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(IZJJILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/r7;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "J", "c", "()J", DateTokenConverter.CONVERTER_KEY, "I", "e", "Ljava/lang/String;", "getScannerDialogStrategy", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentAnalysisSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long imageUploadTimeoutMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backendProcessingTimeoutMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minimumAge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scannerDialogStrategy;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r7$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34992b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f34991a = aVar;
            f34992b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DocumentAnalysisSettings", aVar, 5);
            m1Var.o("enabled", true);
            m1Var.o("imageUploadTimeoutMs", true);
            m1Var.o("backendProcessingTimeoutMs", true);
            m1Var.o("minimumAge", true);
            m1Var.o("scannerDialogStrategy", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentAnalysisSettings deserialize(uo0.e decoder) {
            boolean zW;
            int iE;
            String strT;
            int i11;
            long j11;
            long j12;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                long j13 = cVarB.j(fVar, 1);
                long j14 = cVarB.j(fVar, 2);
                iE = cVarB.e(fVar, 3);
                strT = cVarB.t(fVar, 4);
                i11 = 31;
                j11 = j13;
                j12 = j14;
            } else {
                boolean z11 = true;
                int i12 = 0;
                long j15 = 0;
                long j16 = 0;
                String strT2 = null;
                zW = false;
                int iE2 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        j15 = cVarB.j(fVar, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        j16 = cVarB.j(fVar, 2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        iE2 = cVarB.e(fVar, 3);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        strT2 = cVarB.t(fVar, 4);
                        i12 |= 16;
                    }
                }
                iE = iE2;
                strT = strT2;
                i11 = i12;
                j11 = j15;
                j12 = j16;
            }
            boolean z12 = zW;
            cVarB.c(fVar);
            return new DocumentAnalysisSettings(i11, z12, j11, j12, iE, strT, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.s0 s0Var = vo0.s0.f119686a;
            return new ro0.d[]{vo0.h.f119620a, s0Var, s0Var, vo0.j0.f119632a, vo0.z1.f119730a};
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
        public final void serialize(uo0.f encoder, DocumentAnalysisSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentAnalysisSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r7$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentAnalysisSettings> serializer() {
            return a.f34991a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentAnalysisSettings(int i11, boolean z11, long j11, long j12, int i12, String str, vo0.v1 v1Var) {
        this.enabled = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.imageUploadTimeoutMs = 10000L;
        } else {
            this.imageUploadTimeoutMs = j11;
        }
        if ((i11 & 4) == 0) {
            this.backendProcessingTimeoutMs = 15000L;
        } else {
            this.backendProcessingTimeoutMs = j12;
        }
        if ((i11 & 8) == 0) {
            this.minimumAge = 18;
        } else {
            this.minimumAge = i12;
        }
        if ((i11 & 16) == 0) {
            this.scannerDialogStrategy = "Default";
        } else {
            this.scannerDialogStrategy = str;
        }
    }

    public static final /* synthetic */ void a(DocumentAnalysisSettings self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.enabled) {
            output.A(serialDesc, 0, self.enabled);
        }
        if (output.G(serialDesc, 1) || self.imageUploadTimeoutMs != 10000) {
            output.z(serialDesc, 1, self.imageUploadTimeoutMs);
        }
        if (output.G(serialDesc, 2) || self.backendProcessingTimeoutMs != 15000) {
            output.z(serialDesc, 2, self.backendProcessingTimeoutMs);
        }
        if (output.G(serialDesc, 3) || self.minimumAge != 18) {
            output.x(serialDesc, 3, self.minimumAge);
        }
        if (!output.G(serialDesc, 4) && p013kotlin.jvm.internal.s.f(self.scannerDialogStrategy, "Default")) {
            return;
        }
        output.e(serialDesc, 4, self.scannerDialogStrategy);
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
        if (!(other instanceof DocumentAnalysisSettings)) {
            return false;
        }
        DocumentAnalysisSettings documentAnalysisSettings = (DocumentAnalysisSettings) other;
        return this.enabled == documentAnalysisSettings.enabled && this.imageUploadTimeoutMs == documentAnalysisSettings.imageUploadTimeoutMs && this.backendProcessingTimeoutMs == documentAnalysisSettings.backendProcessingTimeoutMs && this.minimumAge == documentAnalysisSettings.minimumAge && p013kotlin.jvm.internal.s.f(this.scannerDialogStrategy, documentAnalysisSettings.scannerDialogStrategy);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.enabled) * 31) + Long.hashCode(this.imageUploadTimeoutMs)) * 31) + Long.hashCode(this.backendProcessingTimeoutMs)) * 31) + Integer.hashCode(this.minimumAge)) * 31) + this.scannerDialogStrategy.hashCode();
    }

    public String toString() {
        return "DocumentAnalysisSettings(enabled=" + this.enabled + ", imageUploadTimeoutMs=" + this.imageUploadTimeoutMs + ", backendProcessingTimeoutMs=" + this.backendProcessingTimeoutMs + ", minimumAge=" + this.minimumAge + ", scannerDialogStrategy=" + this.scannerDialogStrategy + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackendProcessingTimeoutMs() {
        return this.backendProcessingTimeoutMs;
    }
}
