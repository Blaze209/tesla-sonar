package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ty, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0013 B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/ty;", "", "Lcom/fourthline/orca/internal/xy;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lcom/fourthline/orca/internal/M3;", "cameraX", "<init>", "(Lcom/fourthline/orca/internal/xy;Lcom/fourthline/orca/internal/M3;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/xy;Lcom/fourthline/orca/internal/M3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ty;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/xy;", "()Lcom/fourthline/orca/internal/xy;", "b", "Lcom/fourthline/orca/internal/M3;", "getCameraX", "()Lcom/fourthline/orca/internal/M3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class SelfieSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieVideoSettings video;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ty$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35770b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f35769a = aVar;
            f35770b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.SelfieSettings", aVar, 2);
            m1Var.o(MediaStreamTrack.VIDEO_TRACK_KIND, true);
            m1Var.o("cameraX", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieSettings deserialize(uo0.e decoder) {
            SelfieVideoSettings c4050xy;
            CameraX cameraX;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                c4050xy = (SelfieVideoSettings) cVarB.v(fVar, 0, SelfieVideoSettings.a.f36849a, null);
                cameraX = (CameraX) cVarB.n(fVar, 1, CameraX.a.f26887a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                c4050xy = null;
                CameraX cameraX2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        c4050xy = (SelfieVideoSettings) cVarB.v(fVar, 0, SelfieVideoSettings.a.f36849a, c4050xy);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        cameraX2 = (CameraX) cVarB.n(fVar, 1, CameraX.a.f26887a, cameraX2);
                        i12 |= 2;
                    }
                }
                cameraX = cameraX2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new SelfieSettings(i11, c4050xy, cameraX, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{so0.a.p(SelfieVideoSettings.a.f36849a), CameraX.a.f26887a};
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
        public final void serialize(uo0.f encoder, SelfieSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SelfieSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ty$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SelfieSettings> serializer() {
            return a.f35769a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SelfieSettings(int i11, SelfieVideoSettings c4050xy, CameraX cameraX, vo0.v1 v1Var) {
        CameraX.ExtensionsApi extensionsApi = null;
        Object[] objArr = 0;
        if ((i11 & 1) == 0) {
            this.video = null;
        } else {
            this.video = c4050xy;
        }
        int i12 = 2;
        if ((i11 & 2) == 0) {
            this.cameraX = new CameraX(false, extensionsApi, i12, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = cameraX;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(SelfieSettings self, uo0.d output, to0.f serialDesc) {
        boolean z11 = false;
        if (output.G(serialDesc, 0) || self.video != null) {
            output.y(serialDesc, 0, SelfieVideoSettings.a.f36849a, self.video);
        }
        if (!output.G(serialDesc, 1)) {
            if (p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        output.D(serialDesc, 1, CameraX.a.f26887a, self.cameraX);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieSettings)) {
            return false;
        }
        SelfieSettings selfieSettings = (SelfieSettings) other;
        return p013kotlin.jvm.internal.s.f(this.video, selfieSettings.video) && p013kotlin.jvm.internal.s.f(this.cameraX, selfieSettings.cameraX);
    }

    public int hashCode() {
        SelfieVideoSettings c4050xy = this.video;
        return ((c4050xy == null ? 0 : c4050xy.hashCode()) * 31) + this.cameraX.hashCode();
    }

    public String toString() {
        return "SelfieSettings(video=" + this.video + ", cameraX=" + this.cameraX + ")";
    }

    public SelfieSettings(SelfieVideoSettings c4050xy, CameraX cameraX) {
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        this.video = c4050xy;
        this.cameraX = cameraX;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SelfieVideoSettings getVideo() {
        return this.video;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SelfieSettings(SelfieVideoSettings c4050xy, CameraX cameraX, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c4050xy, (i11 & 2) != 0 ? new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : cameraX);
    }
}
