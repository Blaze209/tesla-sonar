package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Bv, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002\u0017%B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/fourthline/orca/internal/Bv;", "", "Lcom/fourthline/orca/internal/ty;", "selfie", "Lcom/fourthline/orca/internal/gj;", "liveness", "Lcom/fourthline/orca/internal/Ag;", "geolocation", "Lcom/fourthline/orca/internal/Ay;", "sign", "<init>", "(Lcom/fourthline/orca/internal/ty;Lcom/fourthline/orca/internal/gj;Lcom/fourthline/orca/internal/Ag;Lcom/fourthline/orca/internal/Ay;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ty;Lcom/fourthline/orca/internal/gj;Lcom/fourthline/orca/internal/Ag;Lcom/fourthline/orca/internal/Ay;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Bv;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ty;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/ty;", "b", "Lcom/fourthline/orca/internal/gj;", "c", "()Lcom/fourthline/orca/internal/gj;", "Lcom/fourthline/orca/internal/Ag;", "()Lcom/fourthline/orca/internal/Ag;", "Lcom/fourthline/orca/internal/Ay;", "getSign", "()Lcom/fourthline/orca/internal/Ay;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class QesSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d[] f25137e = {null, null, null, new vo0.e1("com.fourthline.orca.core.internal.backend.model.SignSettings", Ay.INSTANCE, new Annotation[0])};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieSettings selfie;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LivenessSettings liveness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final GeolocationSettings geolocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ay sign;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Bv$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25143b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25142a = aVar;
            f25143b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.QesSettings", aVar, 4);
            m1Var.o("selfie", false);
            m1Var.o("liveness", true);
            m1Var.o("geolocation", false);
            m1Var.o("sign", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QesSettings deserialize(uo0.e decoder) {
            int i11;
            SelfieSettings selfieSettings;
            LivenessSettings livenessSettings;
            GeolocationSettings geolocationSettings;
            Ay ay2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = QesSettings.f25137e;
            SelfieSettings selfieSettings2 = null;
            if (cVarB.i()) {
                SelfieSettings selfieSettings3 = (SelfieSettings) cVarB.n(fVar, 0, SelfieSettings.a.f35769a, null);
                LivenessSettings livenessSettings2 = (LivenessSettings) cVarB.v(fVar, 1, LivenessSettings.a.f32031a, null);
                GeolocationSettings geolocationSettings2 = (GeolocationSettings) cVarB.n(fVar, 2, GeolocationSettings.a.f24947a, null);
                ay2 = (Ay) cVarB.n(fVar, 3, dVarArr[3], null);
                selfieSettings = selfieSettings3;
                geolocationSettings = geolocationSettings2;
                i11 = 15;
                livenessSettings = livenessSettings2;
            } else {
                boolean z11 = true;
                int i12 = 0;
                LivenessSettings livenessSettings3 = null;
                GeolocationSettings geolocationSettings3 = null;
                Ay ay3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        selfieSettings2 = (SelfieSettings) cVarB.n(fVar, 0, SelfieSettings.a.f35769a, selfieSettings2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        livenessSettings3 = (LivenessSettings) cVarB.v(fVar, 1, LivenessSettings.a.f32031a, livenessSettings3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        geolocationSettings3 = (GeolocationSettings) cVarB.n(fVar, 2, GeolocationSettings.a.f24947a, geolocationSettings3);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        ay3 = (Ay) cVarB.n(fVar, 3, dVarArr[3], ay3);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                selfieSettings = selfieSettings2;
                livenessSettings = livenessSettings3;
                geolocationSettings = geolocationSettings3;
                ay2 = ay3;
            }
            cVarB.c(fVar);
            return new QesSettings(i11, selfieSettings, livenessSettings, geolocationSettings, ay2, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{SelfieSettings.a.f35769a, so0.a.p(LivenessSettings.a.f32031a), GeolocationSettings.a.f24947a, QesSettings.f25137e[3]};
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
        public final void serialize(uo0.f encoder, QesSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            QesSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Bv$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<QesSettings> serializer() {
            return a.f25142a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QesSettings(int i11, SelfieSettings selfieSettings, LivenessSettings livenessSettings, GeolocationSettings geolocationSettings, Ay ay2, vo0.v1 v1Var) {
        if (13 != (i11 & 13)) {
            vo0.h1.b(i11, 13, a.f25142a.getDescriptor());
        }
        this.selfie = selfieSettings;
        if ((i11 & 2) == 0) {
            this.liveness = null;
        } else {
            this.liveness = livenessSettings;
        }
        this.geolocation = geolocationSettings;
        this.sign = ay2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GeolocationSettings getGeolocation() {
        return this.geolocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LivenessSettings getLiveness() {
        return this.liveness;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SelfieSettings getSelfie() {
        return this.selfie;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QesSettings)) {
            return false;
        }
        QesSettings qesSettings = (QesSettings) other;
        return p013kotlin.jvm.internal.s.f(this.selfie, qesSettings.selfie) && p013kotlin.jvm.internal.s.f(this.liveness, qesSettings.liveness) && p013kotlin.jvm.internal.s.f(this.geolocation, qesSettings.geolocation) && p013kotlin.jvm.internal.s.f(this.sign, qesSettings.sign);
    }

    public int hashCode() {
        int iHashCode = this.selfie.hashCode() * 31;
        LivenessSettings livenessSettings = this.liveness;
        return ((((iHashCode + (livenessSettings == null ? 0 : livenessSettings.hashCode())) * 31) + this.geolocation.hashCode()) * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "QesSettings(selfie=" + this.selfie + ", liveness=" + this.liveness + ", geolocation=" + this.geolocation + ", sign=" + this.sign + ")";
    }

    public QesSettings(SelfieSettings selfie, LivenessSettings livenessSettings, GeolocationSettings geolocation, Ay sign) {
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        p013kotlin.jvm.internal.s.k(geolocation, "geolocation");
        p013kotlin.jvm.internal.s.k(sign, "sign");
        this.selfie = selfie;
        this.liveness = livenessSettings;
        this.geolocation = geolocation;
        this.sign = sign;
    }

    public static final /* synthetic */ void a(QesSettings self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f25137e;
        output.D(serialDesc, 0, SelfieSettings.a.f35769a, self.selfie);
        if (output.G(serialDesc, 1) || self.liveness != null) {
            output.y(serialDesc, 1, LivenessSettings.a.f32031a, self.liveness);
        }
        output.D(serialDesc, 2, GeolocationSettings.a.f24947a, self.geolocation);
        output.D(serialDesc, 3, dVarArr[3], self.sign);
    }

    public /* synthetic */ QesSettings(SelfieSettings selfieSettings, LivenessSettings livenessSettings, GeolocationSettings geolocationSettings, Ay ay2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieSettings, (i11 & 2) != 0 ? null : livenessSettings, geolocationSettings, ay2);
    }
}
