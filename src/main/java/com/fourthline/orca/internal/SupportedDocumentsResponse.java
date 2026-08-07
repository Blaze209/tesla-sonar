package com.fourthline.orca.internal;

import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.FA, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0014 B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/FA;", "", "", WorkflowKeys.ISSUING_COUNTRY, "", "Lcom/fourthline/orca/internal/ch;", "idDocuments", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/FA;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class SupportedDocumentsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25785c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f25786d = {null, new vo0.e(IdDocument.a.f30896a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List idDocuments;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.FA$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25790b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25789a = aVar;
            f25790b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.SupportedDocumentsResponse", aVar, 2);
            m1Var.o(WorkflowKeys.ISSUING_COUNTRY, false);
            m1Var.o("idDocuments", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SupportedDocumentsResponse deserialize(uo0.e decoder) {
            List list;
            String strT;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = SupportedDocumentsResponse.f25786d;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(fVar, 0);
                list = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                String strT2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(fVar, 0);
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
                strT = strT2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new SupportedDocumentsResponse(i11, strT, list, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, SupportedDocumentsResponse.f25786d[1]};
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
        public final void serialize(uo0.f encoder, SupportedDocumentsResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SupportedDocumentsResponse.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.FA$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SupportedDocumentsResponse> serializer() {
            return a.f25789a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SupportedDocumentsResponse(int i11, String str, List list, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f25789a.getDescriptor());
        }
        this.issuingCountry = str;
        this.idDocuments = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getIdDocuments() {
        return this.idDocuments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedDocumentsResponse)) {
            return false;
        }
        SupportedDocumentsResponse supportedDocumentsResponse = (SupportedDocumentsResponse) other;
        return p013kotlin.jvm.internal.s.f(this.issuingCountry, supportedDocumentsResponse.issuingCountry) && p013kotlin.jvm.internal.s.f(this.idDocuments, supportedDocumentsResponse.idDocuments);
    }

    public int hashCode() {
        return (this.issuingCountry.hashCode() * 31) + this.idDocuments.hashCode();
    }

    public String toString() {
        return "SupportedDocumentsResponse(issuingCountry=" + this.issuingCountry + ", idDocuments=" + this.idDocuments + ")";
    }

    public SupportedDocumentsResponse(String issuingCountry, List idDocuments) {
        p013kotlin.jvm.internal.s.k(issuingCountry, "issuingCountry");
        p013kotlin.jvm.internal.s.k(idDocuments, "idDocuments");
        this.issuingCountry = issuingCountry;
        this.idDocuments = idDocuments;
    }

    public static final /* synthetic */ void a(SupportedDocumentsResponse self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f25786d;
        output.e(serialDesc, 0, self.issuingCountry);
        output.D(serialDesc, 1, dVarArr[1], self.idDocuments);
    }
}
