package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sv, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0015\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0015\u0010'¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/sv;", "", "", "enabled", "Lcom/fourthline/orca/internal/wy;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lcom/fourthline/orca/internal/M3;", "cameraX", "<init>", "(ZLcom/fourthline/orca/internal/wy;Lcom/fourthline/orca/internal/M3;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLcom/fourthline/orca/internal/wy;Lcom/fourthline/orca/internal/M3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/sv;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "()Z", "b", "Lcom/fourthline/orca/internal/wy;", "()Lcom/fourthline/orca/internal/wy;", "c", "Lcom/fourthline/orca/internal/M3;", "()Lcom/fourthline/orca/internal/M3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class QesSelfieConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C4007wy video;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sv$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35417b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f35416a = aVar;
            f35417b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.qes.internal.QesSelfieConfig", aVar, 3);
            m1Var.o("enabled", false);
            m1Var.o(MediaStreamTrack.VIDEO_TRACK_KIND, false);
            m1Var.o("cameraX", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QesSelfieConfig deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            C4007wy c4007wy;
            CameraX cameraX;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                zW = cVarB.w(fVar, 0);
                C4007wy c4007wy2 = (C4007wy) cVarB.n(fVar, 1, C4007wy.a.f36628a, null);
                cameraX = (CameraX) cVarB.n(fVar, 2, CameraX.a.f26887a, null);
                c4007wy = c4007wy2;
                i11 = 7;
            } else {
                boolean z11 = true;
                zW = false;
                C4007wy c4007wy3 = null;
                CameraX cameraX2 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        c4007wy3 = (C4007wy) cVarB.n(fVar, 1, C4007wy.a.f36628a, c4007wy3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        cameraX2 = (CameraX) cVarB.n(fVar, 2, CameraX.a.f26887a, cameraX2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                c4007wy = c4007wy3;
                cameraX = cameraX2;
            }
            boolean z12 = zW;
            cVarB.c(fVar);
            return new QesSelfieConfig(i11, z12, c4007wy, cameraX, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.h.f119620a, C4007wy.a.f36628a, CameraX.a.f26887a};
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
        public final void serialize(uo0.f encoder, QesSelfieConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            QesSelfieConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sv$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<QesSelfieConfig> serializer() {
            return a.f35416a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ QesSelfieConfig(int i11, boolean z11, C4007wy c4007wy, CameraX cameraX, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f35416a.getDescriptor());
        }
        this.enabled = z11;
        this.video = c4007wy;
        if ((i11 & 4) != 0) {
            this.cameraX = cameraX;
        } else {
            this.cameraX = new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(QesSelfieConfig self, uo0.d output, to0.f serialDesc) {
        boolean z11 = false;
        output.A(serialDesc, 0, self.enabled);
        output.D(serialDesc, 1, C4007wy.a.f36628a, self.video);
        int i11 = 2;
        if (!output.G(serialDesc, 2) && p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) null, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.D(serialDesc, 2, CameraX.a.f26887a, self.cameraX);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4007wy getVideo() {
        return this.video;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QesSelfieConfig)) {
            return false;
        }
        QesSelfieConfig qesSelfieConfig = (QesSelfieConfig) other;
        return this.enabled == qesSelfieConfig.enabled && p013kotlin.jvm.internal.s.f(this.video, qesSelfieConfig.video) && p013kotlin.jvm.internal.s.f(this.cameraX, qesSelfieConfig.cameraX);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + this.video.hashCode()) * 31) + this.cameraX.hashCode();
    }

    public String toString() {
        return "QesSelfieConfig(enabled=" + this.enabled + ", video=" + this.video + ", cameraX=" + this.cameraX + ")";
    }

    public QesSelfieConfig(boolean z11, C4007wy video, CameraX cameraX) {
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        this.enabled = z11;
        this.video = video;
        this.cameraX = cameraX;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CameraX getCameraX() {
        return this.cameraX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ QesSelfieConfig(boolean z11, C4007wy c4007wy, CameraX cameraX, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            cameraX = new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this(z11, c4007wy, cameraX);
    }
}
