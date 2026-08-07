package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Qa, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0013\u001fBC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0013\u0010\u0016¨\u0006\""}, d2 = {"Lcom/fourthline/orca/internal/Qa;", "", "", "seen0", "", WorkflowKeys.ISSUING_COUNTRY, "documentType", "documentSide", "documentModel", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Qa;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentRecognitionValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentSide;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentModel;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Qa$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27452b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f27451a = aVar;
            f27452b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.DocumentRecognitionValue", aVar, 4);
            m1Var.o(WorkflowKeys.ISSUING_COUNTRY, true);
            m1Var.o("documentType", true);
            m1Var.o("documentSide", true);
            m1Var.o("documentModel", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentRecognitionValue deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            String str5 = null;
            if (cVarB.i()) {
                vo0.z1 z1Var = vo0.z1.f119730a;
                String str6 = (String) cVarB.v(fVar, 0, z1Var, null);
                String str7 = (String) cVarB.v(fVar, 1, z1Var, null);
                String str8 = (String) cVarB.v(fVar, 2, z1Var, null);
                str4 = (String) cVarB.v(fVar, 3, z1Var, null);
                i11 = 15;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str5 = (String) cVarB.v(fVar, 0, vo0.z1.f119730a, str5);
                        i12 |= 1;
                    } else if (iA == 1) {
                        str9 = (String) cVarB.v(fVar, 1, vo0.z1.f119730a, str9);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str10 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, str10);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str11 = (String) cVarB.v(fVar, 3, vo0.z1.f119730a, str11);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = str5;
                str2 = str9;
                str3 = str10;
                str4 = str11;
            }
            cVarB.c(fVar);
            return new DocumentRecognitionValue(i11, str, str2, str3, str4, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var)};
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
        public final void serialize(uo0.f encoder, DocumentRecognitionValue value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentRecognitionValue.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Qa$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentRecognitionValue> serializer() {
            return a.f27451a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentRecognitionValue(int i11, String str, String str2, String str3, String str4, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str;
        }
        if ((i11 & 2) == 0) {
            this.documentType = null;
        } else {
            this.documentType = str2;
        }
        if ((i11 & 4) == 0) {
            this.documentSide = null;
        } else {
            this.documentSide = str3;
        }
        if ((i11 & 8) == 0) {
            this.documentModel = null;
        } else {
            this.documentModel = str4;
        }
    }

    public static final /* synthetic */ void a(DocumentRecognitionValue self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.issuingCountry != null) {
            output.y(serialDesc, 0, vo0.z1.f119730a, self.issuingCountry);
        }
        if (output.G(serialDesc, 1) || self.documentType != null) {
            output.y(serialDesc, 1, vo0.z1.f119730a, self.documentType);
        }
        if (output.G(serialDesc, 2) || self.documentSide != null) {
            output.y(serialDesc, 2, vo0.z1.f119730a, self.documentSide);
        }
        if (!output.G(serialDesc, 3) && self.documentModel == null) {
            return;
        }
        output.y(serialDesc, 3, vo0.z1.f119730a, self.documentModel);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentSide() {
        return this.documentSide;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentRecognitionValue)) {
            return false;
        }
        DocumentRecognitionValue documentRecognitionValue = (DocumentRecognitionValue) other;
        return p013kotlin.jvm.internal.s.f(this.issuingCountry, documentRecognitionValue.issuingCountry) && p013kotlin.jvm.internal.s.f(this.documentType, documentRecognitionValue.documentType) && p013kotlin.jvm.internal.s.f(this.documentSide, documentRecognitionValue.documentSide) && p013kotlin.jvm.internal.s.f(this.documentModel, documentRecognitionValue.documentModel);
    }

    public int hashCode() {
        String str = this.issuingCountry;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.documentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentSide;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentModel;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "DocumentRecognitionValue(issuingCountry=" + this.issuingCountry + ", documentType=" + this.documentType + ", documentSide=" + this.documentSide + ", documentModel=" + this.documentModel + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentModel() {
        return this.documentModel;
    }
}
