package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mc, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0014\"B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/mc;", "", "Lcom/fourthline/orca/internal/cD;", "primary", "secondary", "poa", "tin", "<init>", "(Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/cD;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mc;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/cD;", "getPrimary", "()Lcom/fourthline/orca/internal/cD;", "b", "getSecondary", "c", "getPoa", DateTokenConverter.CONVERTER_KEY, "getTin", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentUploadStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d[] f33546e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD secondary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD poa;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD tin;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mc$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33552b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33551a = aVar;
            f33552b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DocumentUploadStatus", aVar, 4);
            m1Var.o("primary", false);
            m1Var.o("secondary", true);
            m1Var.o("poa", true);
            m1Var.o("tin", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentUploadStatus deserialize(uo0.e decoder) {
            int i11;
            EnumC3123cD enumC3123cD;
            EnumC3123cD enumC3123cD2;
            EnumC3123cD enumC3123cD3;
            EnumC3123cD enumC3123cD4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = DocumentUploadStatus.f33546e;
            EnumC3123cD enumC3123cD5 = null;
            if (cVarB.i()) {
                EnumC3123cD enumC3123cD6 = (EnumC3123cD) cVarB.n(fVar, 0, dVarArr[0], null);
                EnumC3123cD enumC3123cD7 = (EnumC3123cD) cVarB.v(fVar, 1, dVarArr[1], null);
                EnumC3123cD enumC3123cD8 = (EnumC3123cD) cVarB.v(fVar, 2, dVarArr[2], null);
                enumC3123cD4 = (EnumC3123cD) cVarB.v(fVar, 3, dVarArr[3], null);
                enumC3123cD = enumC3123cD6;
                i11 = 15;
                enumC3123cD3 = enumC3123cD8;
                enumC3123cD2 = enumC3123cD7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                EnumC3123cD enumC3123cD9 = null;
                EnumC3123cD enumC3123cD10 = null;
                EnumC3123cD enumC3123cD11 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        enumC3123cD5 = (EnumC3123cD) cVarB.n(fVar, 0, dVarArr[0], enumC3123cD5);
                        i12 |= 1;
                    } else if (iA == 1) {
                        enumC3123cD9 = (EnumC3123cD) cVarB.v(fVar, 1, dVarArr[1], enumC3123cD9);
                        i12 |= 2;
                    } else if (iA == 2) {
                        enumC3123cD10 = (EnumC3123cD) cVarB.v(fVar, 2, dVarArr[2], enumC3123cD10);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        enumC3123cD11 = (EnumC3123cD) cVarB.v(fVar, 3, dVarArr[3], enumC3123cD11);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                enumC3123cD = enumC3123cD5;
                enumC3123cD2 = enumC3123cD9;
                enumC3123cD3 = enumC3123cD10;
                enumC3123cD4 = enumC3123cD11;
            }
            cVarB.c(fVar);
            return new DocumentUploadStatus(i11, enumC3123cD, enumC3123cD2, enumC3123cD3, enumC3123cD4, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = DocumentUploadStatus.f33546e;
            return new ro0.d[]{dVarArr[0], so0.a.p(dVarArr[1]), so0.a.p(dVarArr[2]), so0.a.p(dVarArr[3])};
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
        public final void serialize(uo0.f encoder, DocumentUploadStatus value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentUploadStatus.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mc$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentUploadStatus> serializer() {
            return a.f33551a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC3123cD.Companion companion = EnumC3123cD.INSTANCE;
        f33546e = new ro0.d[]{companion.serializer(), companion.serializer(), companion.serializer(), companion.serializer()};
    }

    public /* synthetic */ DocumentUploadStatus(int i11, EnumC3123cD enumC3123cD, EnumC3123cD enumC3123cD2, EnumC3123cD enumC3123cD3, EnumC3123cD enumC3123cD4, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f33551a.getDescriptor());
        }
        this.primary = enumC3123cD;
        if ((i11 & 2) == 0) {
            this.secondary = null;
        } else {
            this.secondary = enumC3123cD2;
        }
        if ((i11 & 4) == 0) {
            this.poa = null;
        } else {
            this.poa = enumC3123cD3;
        }
        if ((i11 & 8) == 0) {
            this.tin = null;
        } else {
            this.tin = enumC3123cD4;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentUploadStatus)) {
            return false;
        }
        DocumentUploadStatus documentUploadStatus = (DocumentUploadStatus) other;
        return this.primary == documentUploadStatus.primary && this.secondary == documentUploadStatus.secondary && this.poa == documentUploadStatus.poa && this.tin == documentUploadStatus.tin;
    }

    public int hashCode() {
        int iHashCode = this.primary.hashCode() * 31;
        EnumC3123cD enumC3123cD = this.secondary;
        int iHashCode2 = (iHashCode + (enumC3123cD == null ? 0 : enumC3123cD.hashCode())) * 31;
        EnumC3123cD enumC3123cD2 = this.poa;
        int iHashCode3 = (iHashCode2 + (enumC3123cD2 == null ? 0 : enumC3123cD2.hashCode())) * 31;
        EnumC3123cD enumC3123cD3 = this.tin;
        return iHashCode3 + (enumC3123cD3 != null ? enumC3123cD3.hashCode() : 0);
    }

    public String toString() {
        return "DocumentUploadStatus(primary=" + this.primary + ", secondary=" + this.secondary + ", poa=" + this.poa + ", tin=" + this.tin + ")";
    }

    public DocumentUploadStatus(EnumC3123cD primary, EnumC3123cD enumC3123cD, EnumC3123cD enumC3123cD2, EnumC3123cD enumC3123cD3) {
        p013kotlin.jvm.internal.s.k(primary, "primary");
        this.primary = primary;
        this.secondary = enumC3123cD;
        this.poa = enumC3123cD2;
        this.tin = enumC3123cD3;
    }

    public static final /* synthetic */ void a(DocumentUploadStatus self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f33546e;
        output.D(serialDesc, 0, dVarArr[0], self.primary);
        if (output.G(serialDesc, 1) || self.secondary != null) {
            output.y(serialDesc, 1, dVarArr[1], self.secondary);
        }
        if (output.G(serialDesc, 2) || self.poa != null) {
            output.y(serialDesc, 2, dVarArr[2], self.poa);
        }
        if (!output.G(serialDesc, 3) && self.tin == null) {
            return;
        }
        output.y(serialDesc, 3, dVarArr[3], self.tin);
    }

    public /* synthetic */ DocumentUploadStatus(EnumC3123cD enumC3123cD, EnumC3123cD enumC3123cD2, EnumC3123cD enumC3123cD3, EnumC3123cD enumC3123cD4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3123cD, (i11 & 2) != 0 ? null : enumC3123cD2, (i11 & 4) != 0 ? null : enumC3123cD3, (i11 & 8) != 0 ? null : enumC3123cD4);
    }
}
