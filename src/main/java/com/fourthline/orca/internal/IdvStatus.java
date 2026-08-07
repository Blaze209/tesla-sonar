package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fh, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0013\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/fh;", "", "Lcom/fourthline/orca/internal/jh;", "verificationStatus", "Lcom/fourthline/orca/internal/ih;", "uploadStatus", "<init>", "(Lcom/fourthline/orca/internal/jh;Lcom/fourthline/orca/internal/ih;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/jh;Lcom/fourthline/orca/internal/ih;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/fh;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/jh;", "b", "()Lcom/fourthline/orca/internal/jh;", "Lcom/fourthline/orca/internal/ih;", "getUploadStatus", "()Lcom/fourthline/orca/internal/ih;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class IdvStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d[] f31754c = {EnumC3431jh.INSTANCE.serializer(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3431jh verificationStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdvUploadStatus uploadStatus;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fh$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31758b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31757a = aVar;
            f31758b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.IdvStatus", aVar, 2);
            m1Var.o("verificationStatus", false);
            m1Var.o("uploadStatus", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdvStatus deserialize(uo0.e decoder) {
            EnumC3431jh enumC3431jh;
            IdvUploadStatus c3389ih;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = IdvStatus.f31754c;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                enumC3431jh = (EnumC3431jh) cVarB.n(fVar, 0, dVarArr[0], null);
                c3389ih = (IdvUploadStatus) cVarB.n(fVar, 1, IdvUploadStatus.a.f32543a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                EnumC3431jh enumC3431jh2 = null;
                IdvUploadStatus c3389ih2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        enumC3431jh2 = (EnumC3431jh) cVarB.n(fVar, 0, dVarArr[0], enumC3431jh2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        c3389ih2 = (IdvUploadStatus) cVarB.n(fVar, 1, IdvUploadStatus.a.f32543a, c3389ih2);
                        i12 |= 2;
                    }
                }
                enumC3431jh = enumC3431jh2;
                c3389ih = c3389ih2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new IdvStatus(i11, enumC3431jh, c3389ih, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{IdvStatus.f31754c[0], IdvUploadStatus.a.f32543a};
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
        public final void serialize(uo0.f encoder, IdvStatus value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            IdvStatus.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fh$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<IdvStatus> serializer() {
            return a.f31757a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdvStatus(int i11, EnumC3431jh enumC3431jh, IdvUploadStatus c3389ih, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f31757a.getDescriptor());
        }
        this.verificationStatus = enumC3431jh;
        this.uploadStatus = c3389ih;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC3431jh getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdvStatus)) {
            return false;
        }
        IdvStatus idvStatus = (IdvStatus) other;
        return this.verificationStatus == idvStatus.verificationStatus && p013kotlin.jvm.internal.s.f(this.uploadStatus, idvStatus.uploadStatus);
    }

    public int hashCode() {
        return (this.verificationStatus.hashCode() * 31) + this.uploadStatus.hashCode();
    }

    public String toString() {
        return "IdvStatus(verificationStatus=" + this.verificationStatus + ", uploadStatus=" + this.uploadStatus + ")";
    }

    public IdvStatus(EnumC3431jh verificationStatus, IdvUploadStatus uploadStatus) {
        p013kotlin.jvm.internal.s.k(verificationStatus, "verificationStatus");
        p013kotlin.jvm.internal.s.k(uploadStatus, "uploadStatus");
        this.verificationStatus = verificationStatus;
        this.uploadStatus = uploadStatus;
    }

    public static final /* synthetic */ void a(IdvStatus self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f31754c[0], self.verificationStatus);
        output.D(serialDesc, 1, IdvUploadStatus.a.f32543a, self.uploadStatus);
    }
}
