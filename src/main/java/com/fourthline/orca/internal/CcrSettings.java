package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.V3, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012 B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/V3;", "", "", "seen0", "Lcom/fourthline/orca/internal/ty;", "selfie", "Lcom/fourthline/orca/internal/Ag;", "geolocation", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILcom/fourthline/orca/internal/ty;Lcom/fourthline/orca/internal/Ag;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/V3;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ty;", "getSelfie", "()Lcom/fourthline/orca/internal/ty;", "b", "Lcom/fourthline/orca/internal/Ag;", "getGeolocation", "()Lcom/fourthline/orca/internal/Ag;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class CcrSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieSettings selfie;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final GeolocationSettings geolocation;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.V3$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28957b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f28956a = aVar;
            f28957b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.CcrSettings", aVar, 2);
            m1Var.o("selfie", false);
            m1Var.o("geolocation", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CcrSettings deserialize(uo0.e decoder) {
            SelfieSettings selfieSettings;
            GeolocationSettings geolocationSettings;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                selfieSettings = (SelfieSettings) cVarB.n(fVar, 0, SelfieSettings.a.f35769a, null);
                geolocationSettings = (GeolocationSettings) cVarB.n(fVar, 1, GeolocationSettings.a.f24947a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                selfieSettings = null;
                GeolocationSettings geolocationSettings2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        selfieSettings = (SelfieSettings) cVarB.n(fVar, 0, SelfieSettings.a.f35769a, selfieSettings);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        geolocationSettings2 = (GeolocationSettings) cVarB.n(fVar, 1, GeolocationSettings.a.f24947a, geolocationSettings2);
                        i12 |= 2;
                    }
                }
                geolocationSettings = geolocationSettings2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new CcrSettings(i11, selfieSettings, geolocationSettings, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{SelfieSettings.a.f35769a, GeolocationSettings.a.f24947a};
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
        public final void serialize(uo0.f encoder, CcrSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            CcrSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.V3$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<CcrSettings> serializer() {
            return a.f28956a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CcrSettings(int i11, SelfieSettings selfieSettings, GeolocationSettings geolocationSettings, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f28956a.getDescriptor());
        }
        this.selfie = selfieSettings;
        this.geolocation = geolocationSettings;
    }

    public static final /* synthetic */ void a(CcrSettings self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, SelfieSettings.a.f35769a, self.selfie);
        output.D(serialDesc, 1, GeolocationSettings.a.f24947a, self.geolocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CcrSettings)) {
            return false;
        }
        CcrSettings ccrSettings = (CcrSettings) other;
        return p013kotlin.jvm.internal.s.f(this.selfie, ccrSettings.selfie) && p013kotlin.jvm.internal.s.f(this.geolocation, ccrSettings.geolocation);
    }

    public int hashCode() {
        return (this.selfie.hashCode() * 31) + this.geolocation.hashCode();
    }

    public String toString() {
        return "CcrSettings(selfie=" + this.selfie + ", geolocation=" + this.geolocation + ")";
    }
}
