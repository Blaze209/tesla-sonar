package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.LivenessCheckType;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 12\u00020\u0001:\u0002\u0017\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b&\u0010/¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/wx;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/wy;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lcom/fourthline/orca/internal/Ux;", "liveness", "Lcom/fourthline/orca/internal/M3;", "cameraX", "<init>", "(Lcom/fourthline/orca/internal/wy;Lcom/fourthline/orca/internal/Ux;Lcom/fourthline/orca/internal/M3;)V", "", "seen0", "Lcom/fourthline/orca/internal/Aw;", "randomnessConfig", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/wy;Lcom/fourthline/orca/internal/Ux;Lcom/fourthline/orca/internal/M3;Lcom/fourthline/orca/internal/Aw;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/wx;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/tx;", "h", "()Lcom/fourthline/orca/internal/tx;", "Lcom/fourthline/orca/internal/wy;", "g", "()Lcom/fourthline/orca/internal/wy;", "b", "Lcom/fourthline/orca/internal/Ux;", "getLiveness", "()Lcom/fourthline/orca/internal/Ux;", "c", "Lcom/fourthline/orca/internal/M3;", "()Lcom/fourthline/orca/internal/M3;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/Aw;", "e", "()Lcom/fourthline/orca/internal/Aw;", "Lcom/fourthline/vision/RecordingType;", "f", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "()Lcom/fourthline/vision/selfie/LivenessCheckType;", "livenessCheckType", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class C4006wx implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36617e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f36618f = {null, null, null, new ro0.h(p013kotlin.jvm.internal.o0.b(Aw.class), new Annotation[0])};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4007wy video;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ux liveness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Aw randomnessConfig;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wx$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36624b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f36623a = aVar;
            f36624b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlowConfig", aVar, 4);
            m1Var.o(MediaStreamTrack.VIDEO_TRACK_KIND, false);
            m1Var.o("liveness", false);
            m1Var.o("cameraX", true);
            m1Var.o("randomnessConfig", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4006wx deserialize(uo0.e decoder) {
            int i11;
            C4007wy c4007wy;
            Ux ux2;
            CameraX cameraX;
            Aw aw2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = C4006wx.f36618f;
            C4007wy c4007wy2 = null;
            if (cVarB.i()) {
                C4007wy c4007wy3 = (C4007wy) cVarB.n(fVar, 0, C4007wy.a.f36628a, null);
                Ux ux3 = (Ux) cVarB.n(fVar, 1, Ux.a.f28937a, null);
                CameraX cameraX2 = (CameraX) cVarB.n(fVar, 2, CameraX.a.f26887a, null);
                aw2 = (Aw) cVarB.v(fVar, 3, dVarArr[3], null);
                c4007wy = c4007wy3;
                cameraX = cameraX2;
                i11 = 15;
                ux2 = ux3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Ux ux4 = null;
                CameraX cameraX3 = null;
                Aw aw3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        c4007wy2 = (C4007wy) cVarB.n(fVar, 0, C4007wy.a.f36628a, c4007wy2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        ux4 = (Ux) cVarB.n(fVar, 1, Ux.a.f28937a, ux4);
                        i12 |= 2;
                    } else if (iA == 2) {
                        cameraX3 = (CameraX) cVarB.n(fVar, 2, CameraX.a.f26887a, cameraX3);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        aw3 = (Aw) cVarB.v(fVar, 3, dVarArr[3], aw3);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                c4007wy = c4007wy2;
                ux2 = ux4;
                cameraX = cameraX3;
                aw2 = aw3;
            }
            cVarB.c(fVar);
            return new C4006wx(i11, c4007wy, ux2, cameraX, aw2, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{C4007wy.a.f36628a, Ux.a.f28937a, CameraX.a.f26887a, so0.a.p(C4006wx.f36618f[3])};
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
        public final void serialize(uo0.f encoder, C4006wx value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            C4006wx.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wx$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<C4006wx> serializer() {
            return a.f36623a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4006wx(int i11, C4007wy c4007wy, Ux ux2, CameraX cameraX, Aw aw2, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f36623a.getDescriptor());
        }
        this.video = c4007wy;
        this.liveness = ux2;
        Hs hs2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if ((i11 & 4) == 0) {
            this.cameraX = new CameraX(false, (CameraX.ExtensionsApi) (objArr4 == true ? 1 : 0), 2, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0));
        } else {
            this.cameraX = cameraX;
        }
        if ((i11 & 8) != 0) {
            this.randomnessConfig = aw2;
            return;
        }
        boolean zA = ux2.getRandomness().getEnabled();
        int i12 = 1;
        if (zA) {
            hs2 = new Hs(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        } else if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        this.randomnessConfig = hs2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CameraX getCameraX() {
        return this.cameraX;
    }

    public final LivenessCheckType d() {
        boolean zA = this.liveness.getEnabled();
        if (zA) {
            return LivenessCheckType.HEAD_TURN;
        }
        if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        return LivenessCheckType.NONE;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Aw getRandomnessConfig() {
        return this.randomnessConfig;
    }

    public final RecordingType f() {
        boolean zB = this.video.getEnabled();
        if (zB) {
            return RecordingType.VIDEO_ONLY;
        }
        if (zB) {
            throw new NoWhenBranchMatchedException();
        }
        return RecordingType.NONE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4007wy getVideo() {
        return this.video;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3876tx a() {
        return new C3876tx(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(C4006wx self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f36618f;
        boolean z11 = false;
        output.D(serialDesc, 0, C4007wy.a.f36628a, self.video);
        int i11 = 1;
        output.D(serialDesc, 1, Ux.a.f28937a, self.liveness);
        int i12 = 2;
        Hs hs2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (output.G(serialDesc, 2) || !p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) (objArr4 == true ? 1 : 0), i12, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0)))) {
            output.D(serialDesc, 2, CameraX.a.f26887a, self.cameraX);
        }
        if (!output.G(serialDesc, 3)) {
            Aw aw2 = self.randomnessConfig;
            boolean zA = self.liveness.getRandomness().getEnabled();
            if (zA) {
                hs2 = new Hs(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            } else if (zA) {
                throw new NoWhenBranchMatchedException();
            }
            if (p013kotlin.jvm.internal.s.f(aw2, hs2)) {
                return;
            }
        }
        output.y(serialDesc, 3, dVarArr[3], self.randomnessConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4006wx(C4007wy video, Ux liveness, CameraX cameraX) {
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(liveness, "liveness");
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        this.video = video;
        this.liveness = liveness;
        this.cameraX = cameraX;
        boolean zA = liveness.getRandomness().getEnabled();
        Hs hs2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i11 = 1;
        if (zA) {
            hs2 = new Hs(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        } else if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        this.randomnessConfig = hs2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4006wx(C4007wy c4007wy, Ux ux2, CameraX cameraX, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            cameraX = new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this(c4007wy, ux2, cameraX);
    }
}
