package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.VideoDuration;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Dc, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002\u0016\"B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0016\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, d2 = {"Lcom/fourthline/orca/internal/Dc;", "", "", "enabled", "", "duration", "", "bitrate", "", "resolution", "<init>", "(ZJLjava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZJLjava/lang/Integer;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Dc;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "()Z", "b", "J", "getDuration", "()J", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getResolution", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentVideoCaptureConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bitrate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resolution;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Dc$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25456b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25455a = aVar;
            f25456b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.document.DocumentVideoCaptureConfig", aVar, 4);
            m1Var.o("enabled", false);
            m1Var.o("duration", true);
            m1Var.o("bitrate", true);
            m1Var.o("resolution", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentVideoCaptureConfig deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            long j11;
            Integer num;
            String strT;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                long j12 = cVarB.j(fVar, 1);
                Integer num2 = (Integer) cVarB.v(fVar, 2, vo0.j0.f119632a, null);
                i11 = 15;
                strT = cVarB.t(fVar, 3);
                num = num2;
                j11 = j12;
            } else {
                long j13 = 0;
                boolean z11 = true;
                zW = false;
                Integer num3 = null;
                String strT2 = null;
                i11 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i11 |= 1;
                    } else if (iA == 1) {
                        j13 = cVarB.j(fVar, 1);
                        i11 |= 2;
                    } else if (iA == 2) {
                        num3 = (Integer) cVarB.v(fVar, 2, vo0.j0.f119632a, num3);
                        i11 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        strT2 = cVarB.t(fVar, 3);
                        i11 |= 8;
                    }
                }
                j11 = j13;
                num = num3;
                strT = strT2;
            }
            boolean z12 = zW;
            int i12 = i11;
            cVarB.c(fVar);
            return new DocumentVideoCaptureConfig(i12, z12, j11, num, strT, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, vo0.s0.f119686a, so0.a.p(vo0.j0.f119632a), vo0.z1.f119730a};
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
        public final void serialize(uo0.f encoder, DocumentVideoCaptureConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentVideoCaptureConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Dc$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentVideoCaptureConfig> serializer() {
            return a.f25455a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentVideoCaptureConfig(int i11, boolean z11, long j11, Integer num, String str, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f25455a.getDescriptor());
        }
        this.enabled = z11;
        if ((i11 & 2) == 0) {
            this.duration = VideoDuration.DEFAULT.INSTANCE.getDuration();
        } else {
            this.duration = j11;
        }
        if ((i11 & 4) == 0) {
            this.bitrate = null;
        } else {
            this.bitrate = num;
        }
        if ((i11 & 8) == 0) {
            this.resolution = "FHD";
        } else {
            this.resolution = str;
        }
    }

    public static final /* synthetic */ void a(DocumentVideoCaptureConfig self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.enabled);
        if (output.G(serialDesc, 1) || self.duration != VideoDuration.DEFAULT.INSTANCE.getDuration()) {
            output.z(serialDesc, 1, self.duration);
        }
        if (output.G(serialDesc, 2) || self.bitrate != null) {
            output.y(serialDesc, 2, vo0.j0.f119632a, self.bitrate);
        }
        if (!output.G(serialDesc, 3) && p013kotlin.jvm.internal.s.f(self.resolution, "FHD")) {
            return;
        }
        output.e(serialDesc, 3, self.resolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentVideoCaptureConfig)) {
            return false;
        }
        DocumentVideoCaptureConfig documentVideoCaptureConfig = (DocumentVideoCaptureConfig) other;
        return this.enabled == documentVideoCaptureConfig.enabled && this.duration == documentVideoCaptureConfig.duration && p013kotlin.jvm.internal.s.f(this.bitrate, documentVideoCaptureConfig.bitrate) && p013kotlin.jvm.internal.s.f(this.resolution, documentVideoCaptureConfig.resolution);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.enabled) * 31) + Long.hashCode(this.duration)) * 31;
        Integer num = this.bitrate;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.resolution.hashCode();
    }

    public String toString() {
        return "DocumentVideoCaptureConfig(enabled=" + this.enabled + ", duration=" + this.duration + ", bitrate=" + this.bitrate + ", resolution=" + this.resolution + ")";
    }

    public DocumentVideoCaptureConfig(boolean z11, long j11, Integer num, String resolution) {
        p013kotlin.jvm.internal.s.k(resolution, "resolution");
        this.enabled = z11;
        this.duration = j11;
        this.bitrate = num;
        this.resolution = resolution;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    public /* synthetic */ DocumentVideoCaptureConfig(boolean z11, long j11, Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? VideoDuration.DEFAULT.INSTANCE.getDuration() : j11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? "FHD" : str);
    }
}
