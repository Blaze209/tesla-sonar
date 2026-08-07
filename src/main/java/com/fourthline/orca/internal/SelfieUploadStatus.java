package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vy, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/vy;", "", "Lcom/fourthline/orca/internal/cD;", "selfie", "liveness", "<init>", "(Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/vy;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/cD;", "getSelfie", "()Lcom/fourthline/orca/internal/cD;", "b", "getLiveness", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class SelfieUploadStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d[] f36308c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD selfie;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD liveness;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vy$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36312b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f36311a = aVar;
            f36312b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.SelfieUploadStatus", aVar, 2);
            m1Var.o("selfie", false);
            m1Var.o("liveness", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieUploadStatus deserialize(uo0.e decoder) {
            EnumC3123cD enumC3123cD;
            EnumC3123cD enumC3123cD2;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = SelfieUploadStatus.f36308c;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                enumC3123cD2 = (EnumC3123cD) cVarB.n(fVar, 0, dVarArr[0], null);
                enumC3123cD = (EnumC3123cD) cVarB.n(fVar, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                EnumC3123cD enumC3123cD3 = null;
                EnumC3123cD enumC3123cD4 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        enumC3123cD4 = (EnumC3123cD) cVarB.n(fVar, 0, dVarArr[0], enumC3123cD4);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        enumC3123cD3 = (EnumC3123cD) cVarB.n(fVar, 1, dVarArr[1], enumC3123cD3);
                        i12 |= 2;
                    }
                }
                enumC3123cD = enumC3123cD3;
                enumC3123cD2 = enumC3123cD4;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new SelfieUploadStatus(i11, enumC3123cD2, enumC3123cD, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = SelfieUploadStatus.f36308c;
            return new ro0.d[]{dVarArr[0], dVarArr[1]};
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
        public final void serialize(uo0.f encoder, SelfieUploadStatus value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SelfieUploadStatus.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vy$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SelfieUploadStatus> serializer() {
            return a.f36311a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC3123cD.Companion companion = EnumC3123cD.INSTANCE;
        f36308c = new ro0.d[]{companion.serializer(), companion.serializer()};
    }

    public /* synthetic */ SelfieUploadStatus(int i11, EnumC3123cD enumC3123cD, EnumC3123cD enumC3123cD2, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f36311a.getDescriptor());
        }
        this.selfie = enumC3123cD;
        this.liveness = enumC3123cD2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieUploadStatus)) {
            return false;
        }
        SelfieUploadStatus selfieUploadStatus = (SelfieUploadStatus) other;
        return this.selfie == selfieUploadStatus.selfie && this.liveness == selfieUploadStatus.liveness;
    }

    public int hashCode() {
        return (this.selfie.hashCode() * 31) + this.liveness.hashCode();
    }

    public String toString() {
        return "SelfieUploadStatus(selfie=" + this.selfie + ", liveness=" + this.liveness + ")";
    }

    public SelfieUploadStatus(EnumC3123cD selfie, EnumC3123cD liveness) {
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        p013kotlin.jvm.internal.s.k(liveness, "liveness");
        this.selfie = selfie;
        this.liveness = liveness;
    }

    public static final /* synthetic */ void a(SelfieUploadStatus self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f36308c;
        output.D(serialDesc, 0, dVarArr[0], self.selfie);
        output.D(serialDesc, 1, dVarArr[1], self.liveness);
    }
}
