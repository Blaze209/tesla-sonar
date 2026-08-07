package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\u0014\u001cB\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/fourthline/orca/internal/ar;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/M3;", "cameraX", "", "Lcom/fourthline/orca/internal/Wr;", "supportedDocuments", "<init>", "(Lcom/fourthline/orca/internal/M3;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/M3;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ar;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/Zq;", "e", "()Lcom/fourthline/orca/internal/Zq;", "Lcom/fourthline/orca/internal/M3;", "c", "()Lcom/fourthline/orca/internal/M3;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final class C3058ar implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30470c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f30471d = {null, new vo0.e(PoaDocumentTypeConfig.a.f29595a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List supportedDocuments;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ar$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30475b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30474a = aVar;
            f30475b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.poa.PoAFlowConfig", aVar, 2);
            m1Var.o("cameraX", true);
            m1Var.o("supportedDocuments", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3058ar deserialize(uo0.e decoder) {
            List list;
            CameraX cameraX;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = C3058ar.f30471d;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                cameraX = (CameraX) cVarB.n(fVar, 0, CameraX.a.f26887a, null);
                list = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                CameraX cameraX2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        cameraX2 = (CameraX) cVarB.n(fVar, 0, CameraX.a.f26887a, cameraX2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(fVar, 1, dVarArr[1], list2);
                        i12 |= 2;
                    }
                }
                list = list2;
                cameraX = cameraX2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new C3058ar(i11, cameraX, list, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{CameraX.a.f26887a, C3058ar.f30471d[1]};
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
        public final void serialize(uo0.f encoder, C3058ar value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            C3058ar.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ar$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<C3058ar> serializer() {
            return a.f30474a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3058ar(int i11, CameraX cameraX, List list, vo0.v1 v1Var) {
        int i12 = 2;
        if (2 != (i11 & 2)) {
            vo0.h1.b(i11, 2, a.f30474a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.cameraX = new CameraX(false, (CameraX.ExtensionsApi) null, i12, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            this.cameraX = cameraX;
        }
        this.supportedDocuments = list;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CameraX getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSupportedDocuments() {
        return this.supportedDocuments;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Zq a() {
        return new Zq(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(C3058ar self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f30471d;
        boolean z11 = false;
        if (output.G(serialDesc, 0)) {
            output.D(serialDesc, 0, CameraX.a.f26887a, self.cameraX);
        } else {
            if (!p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
                output.D(serialDesc, 0, CameraX.a.f26887a, self.cameraX);
            }
        }
        output.D(serialDesc, 1, dVarArr[1], self.supportedDocuments);
    }

    public C3058ar(CameraX cameraX, List supportedDocuments) {
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        this.cameraX = cameraX;
        this.supportedDocuments = supportedDocuments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3058ar(CameraX cameraX, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            cameraX = new CameraX(false, (CameraX.ExtensionsApi) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this(cameraX, list);
    }
}
