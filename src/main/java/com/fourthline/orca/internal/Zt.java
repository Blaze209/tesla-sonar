package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 )2\u00020\u0001:\u0002\u0017\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0017\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b\u0017\u0010(¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/Zt;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/sv;", "selfie", "Lcom/fourthline/orca/internal/Ux;", "liveness", "Lcom/fourthline/orca/internal/Uu;", "geolocation", "<init>", "(Lcom/fourthline/orca/internal/sv;Lcom/fourthline/orca/internal/Ux;Lcom/fourthline/orca/internal/Uu;)V", "", "seen0", "Lcom/fourthline/orca/internal/gw;", "initialStatus", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/sv;Lcom/fourthline/orca/internal/Ux;Lcom/fourthline/orca/internal/Uu;Lcom/fourthline/orca/internal/gw;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Zt;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/Do;", "()Lcom/fourthline/orca/internal/Do;", "Lcom/fourthline/orca/internal/sv;", "f", "()Lcom/fourthline/orca/internal/sv;", "b", "Lcom/fourthline/orca/internal/Ux;", "e", "()Lcom/fourthline/orca/internal/Ux;", "c", "Lcom/fourthline/orca/internal/Uu;", "()Lcom/fourthline/orca/internal/Uu;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/gw;", "()Lcom/fourthline/orca/internal/gw;", "(Lcom/fourthline/orca/internal/gw;)V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class Zt implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30121e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f30122f = {null, null, null, EnumC3319gw.INSTANCE.serializer()};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final QesSelfieConfig selfie;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ux liveness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final QesGeolocationConfig geolocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EnumC3319gw initialStatus;

    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30128b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30127a = aVar;
            f30128b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.qes.internal.QesFlowConfig", aVar, 4);
            m1Var.o("selfie", false);
            m1Var.o("liveness", false);
            m1Var.o("geolocation", false);
            m1Var.o("initialStatus", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Zt deserialize(uo0.e decoder) {
            int i11;
            QesSelfieConfig c3831sv;
            Ux ux2;
            QesGeolocationConfig uu2;
            EnumC3319gw enumC3319gw;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = Zt.f30122f;
            QesSelfieConfig c3831sv2 = null;
            if (cVarB.i()) {
                QesSelfieConfig c3831sv3 = (QesSelfieConfig) cVarB.n(fVar, 0, QesSelfieConfig.a.f35416a, null);
                Ux ux3 = (Ux) cVarB.n(fVar, 1, Ux.a.f28937a, null);
                QesGeolocationConfig uu3 = (QesGeolocationConfig) cVarB.n(fVar, 2, QesGeolocationConfig.a.f28855a, null);
                enumC3319gw = (EnumC3319gw) cVarB.v(fVar, 3, dVarArr[3], null);
                c3831sv = c3831sv3;
                uu2 = uu3;
                i11 = 15;
                ux2 = ux3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Ux ux4 = null;
                QesGeolocationConfig uu4 = null;
                EnumC3319gw enumC3319gw2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        c3831sv2 = (QesSelfieConfig) cVarB.n(fVar, 0, QesSelfieConfig.a.f35416a, c3831sv2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        ux4 = (Ux) cVarB.n(fVar, 1, Ux.a.f28937a, ux4);
                        i12 |= 2;
                    } else if (iA == 2) {
                        uu4 = (QesGeolocationConfig) cVarB.n(fVar, 2, QesGeolocationConfig.a.f28855a, uu4);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        enumC3319gw2 = (EnumC3319gw) cVarB.v(fVar, 3, dVarArr[3], enumC3319gw2);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                c3831sv = c3831sv2;
                ux2 = ux4;
                uu2 = uu4;
                enumC3319gw = enumC3319gw2;
            }
            cVarB.c(fVar);
            return new Zt(i11, c3831sv, ux2, uu2, enumC3319gw, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{QesSelfieConfig.a.f35416a, Ux.a.f28937a, QesGeolocationConfig.a.f28855a, so0.a.p(Zt.f30122f[3])};
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
        public final void serialize(uo0.f encoder, Zt value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            Zt.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zt$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<Zt> serializer() {
            return a.f30127a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Zt(int i11, QesSelfieConfig c3831sv, Ux ux2, QesGeolocationConfig uu2, EnumC3319gw enumC3319gw, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f30127a.getDescriptor());
        }
        this.selfie = c3831sv;
        this.liveness = ux2;
        this.geolocation = uu2;
        if ((i11 & 8) == 0) {
            this.initialStatus = null;
        } else {
            this.initialStatus = enumC3319gw;
        }
    }

    public static final /* synthetic */ void a(Zt self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f30122f;
        output.D(serialDesc, 0, QesSelfieConfig.a.f35416a, self.selfie);
        output.D(serialDesc, 1, Ux.a.f28937a, self.liveness);
        output.D(serialDesc, 2, QesGeolocationConfig.a.f28855a, self.geolocation);
        if (!output.G(serialDesc, 3) && self.initialStatus == null) {
            return;
        }
        output.y(serialDesc, 3, dVarArr[3], self.initialStatus);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final QesGeolocationConfig getGeolocation() {
        return this.geolocation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC3319gw getInitialStatus() {
        return this.initialStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Ux getLiveness() {
        return this.liveness;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final QesSelfieConfig getSelfie() {
        return this.selfie;
    }

    public Zt(QesSelfieConfig selfie, Ux liveness, QesGeolocationConfig geolocation) {
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        p013kotlin.jvm.internal.s.k(liveness, "liveness");
        p013kotlin.jvm.internal.s.k(geolocation, "geolocation");
        this.selfie = selfie;
        this.liveness = liveness;
        this.geolocation = geolocation;
    }

    public final void a(EnumC3319gw enumC3319gw) {
        this.initialStatus = enumC3319gw;
    }

    @Override // com.fourthline.orca.internal.Rf
    public Do a() {
        return new Wt(this);
    }
}
