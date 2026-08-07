package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002\u0015\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/tB;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/MA;", "taxationCountry", "", "isTinCaptureRequired", "Lcom/fourthline/orca/internal/M3;", "cameraX", "<init>", "(Lcom/fourthline/orca/internal/MA;Ljava/lang/Boolean;Lcom/fourthline/orca/internal/M3;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/MA;Ljava/lang/Boolean;Lcom/fourthline/orca/internal/M3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/tB;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/rB;", "f", "()Lcom/fourthline/orca/internal/rB;", "Lcom/fourthline/orca/internal/MA;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/MA;", "b", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "c", "Lcom/fourthline/orca/internal/M3;", "()Lcom/fourthline/orca/internal/M3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class C3848tB implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f35608d = {MA.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MA taxationCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Boolean isTinCaptureRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tB$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35613b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f35612a = aVar;
            f35613b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.tin.TinFlowConfig", aVar, 3);
            m1Var.o("taxationCountry", false);
            m1Var.o("isTinCaptureRequired", true);
            m1Var.o("cameraX", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3848tB deserialize(uo0.e decoder) {
            int i11;
            MA ma2;
            Boolean bool;
            CameraX cameraX;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = C3848tB.f35608d;
            MA ma3 = null;
            if (cVarB.i()) {
                ma2 = (MA) cVarB.n(fVar, 0, dVarArr[0], null);
                bool = (Boolean) cVarB.v(fVar, 1, vo0.h.f119620a, null);
                cameraX = (CameraX) cVarB.n(fVar, 2, CameraX.a.f26887a, null);
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Boolean bool2 = null;
                CameraX cameraX2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        ma3 = (MA) cVarB.n(fVar, 0, dVarArr[0], ma3);
                        i12 |= 1;
                    } else if (iA == 1) {
                        bool2 = (Boolean) cVarB.v(fVar, 1, vo0.h.f119620a, bool2);
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
                ma2 = ma3;
                bool = bool2;
                cameraX = cameraX2;
            }
            cVarB.c(fVar);
            return new C3848tB(i11, ma2, bool, cameraX, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{C3848tB.f35608d[0], so0.a.p(vo0.h.f119620a), CameraX.a.f26887a};
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
        public final void serialize(uo0.f encoder, C3848tB value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            C3848tB.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tB$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<C3848tB> serializer() {
            return a.f35612a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3848tB(int i11, MA ma2, Boolean bool, CameraX cameraX, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f35612a.getDescriptor());
        }
        this.taxationCountry = ma2;
        CameraX.ExtensionsApi extensionsApi = null;
        Object[] objArr = 0;
        if ((i11 & 2) == 0) {
            this.isTinCaptureRequired = null;
        } else {
            this.isTinCaptureRequired = bool;
        }
        if ((i11 & 4) == 0) {
            this.cameraX = new CameraX(false, extensionsApi, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = cameraX;
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CameraX getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MA getTaxationCountry() {
        return this.taxationCountry;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getIsTinCaptureRequired() {
        return this.isTinCaptureRequired;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3762rB a() {
        return new C3762rB(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(C3848tB self, uo0.d output, to0.f serialDesc) {
        boolean z11 = false;
        output.D(serialDesc, 0, f35608d[0], self.taxationCountry);
        if (output.G(serialDesc, 1) || self.isTinCaptureRequired != null) {
            output.y(serialDesc, 1, vo0.h.f119620a, self.isTinCaptureRequired);
        }
        int i11 = 2;
        if (!output.G(serialDesc, 2) && p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) null, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.D(serialDesc, 2, CameraX.a.f26887a, self.cameraX);
    }

    public C3848tB(MA taxationCountry, Boolean bool, CameraX cameraX) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        this.taxationCountry = taxationCountry;
        this.isTinCaptureRequired = bool;
        this.cameraX = cameraX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3848tB(MA ma2, Boolean bool, CameraX cameraX, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ma2, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : cameraX);
    }
}
