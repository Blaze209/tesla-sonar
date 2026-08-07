package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ih, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002\u0017%B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/ih;", "", "Lcom/fourthline/orca/internal/mc;", "documents", "Lcom/fourthline/orca/internal/vy;", "selfie", "Lcom/fourthline/orca/internal/cD;", OrcaKeys.METADATA, "Lcom/fourthline/orca/internal/e4;", SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA, "<init>", "(Lcom/fourthline/orca/internal/mc;Lcom/fourthline/orca/internal/vy;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/e4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mc;Lcom/fourthline/orca/internal/vy;Lcom/fourthline/orca/internal/cD;Lcom/fourthline/orca/internal/e4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ih;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mc;", "getDocuments", "()Lcom/fourthline/orca/internal/mc;", "b", "Lcom/fourthline/orca/internal/vy;", "getSelfie", "()Lcom/fourthline/orca/internal/vy;", "c", "Lcom/fourthline/orca/internal/cD;", "getMetadata", "()Lcom/fourthline/orca/internal/cD;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/e4;", "getClientData", "()Lcom/fourthline/orca/internal/e4;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class IdvUploadStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d[] f32538e = {null, null, EnumC3123cD.INSTANCE.serializer(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentUploadStatus documents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieUploadStatus selfie;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3123cD metadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ClientData clientData;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ih$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32544b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f32543a = aVar;
            f32544b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.IdvUploadStatus", aVar, 4);
            m1Var.o("documents", false);
            m1Var.o("selfie", false);
            m1Var.o(OrcaKeys.METADATA, false);
            m1Var.o(SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdvUploadStatus deserialize(uo0.e decoder) {
            int i11;
            DocumentUploadStatus c3555mc;
            SelfieUploadStatus c3964vy;
            EnumC3123cD enumC3123cD;
            ClientData clientData;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = IdvUploadStatus.f32538e;
            DocumentUploadStatus c3555mc2 = null;
            if (cVarB.i()) {
                DocumentUploadStatus c3555mc3 = (DocumentUploadStatus) cVarB.n(fVar, 0, DocumentUploadStatus.a.f33551a, null);
                SelfieUploadStatus c3964vy2 = (SelfieUploadStatus) cVarB.n(fVar, 1, SelfieUploadStatus.a.f36311a, null);
                enumC3123cD = (EnumC3123cD) cVarB.n(fVar, 2, dVarArr[2], null);
                c3555mc = c3555mc3;
                clientData = (ClientData) cVarB.v(fVar, 3, ClientData.a.f31329a, null);
                i11 = 15;
                c3964vy = c3964vy2;
            } else {
                boolean z11 = true;
                int i12 = 0;
                SelfieUploadStatus c3964vy3 = null;
                EnumC3123cD enumC3123cD2 = null;
                ClientData clientData2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        c3555mc2 = (DocumentUploadStatus) cVarB.n(fVar, 0, DocumentUploadStatus.a.f33551a, c3555mc2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        c3964vy3 = (SelfieUploadStatus) cVarB.n(fVar, 1, SelfieUploadStatus.a.f36311a, c3964vy3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        enumC3123cD2 = (EnumC3123cD) cVarB.n(fVar, 2, dVarArr[2], enumC3123cD2);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        clientData2 = (ClientData) cVarB.v(fVar, 3, ClientData.a.f31329a, clientData2);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                c3555mc = c3555mc2;
                c3964vy = c3964vy3;
                enumC3123cD = enumC3123cD2;
                clientData = clientData2;
            }
            cVarB.c(fVar);
            return new IdvUploadStatus(i11, c3555mc, c3964vy, enumC3123cD, clientData, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{DocumentUploadStatus.a.f33551a, SelfieUploadStatus.a.f36311a, IdvUploadStatus.f32538e[2], so0.a.p(ClientData.a.f31329a)};
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
        public final void serialize(uo0.f encoder, IdvUploadStatus value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            IdvUploadStatus.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ih$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<IdvUploadStatus> serializer() {
            return a.f32543a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdvUploadStatus(int i11, DocumentUploadStatus c3555mc, SelfieUploadStatus c3964vy, EnumC3123cD enumC3123cD, ClientData clientData, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f32543a.getDescriptor());
        }
        this.documents = c3555mc;
        this.selfie = c3964vy;
        this.metadata = enumC3123cD;
        if ((i11 & 8) == 0) {
            this.clientData = null;
        } else {
            this.clientData = clientData;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdvUploadStatus)) {
            return false;
        }
        IdvUploadStatus idvUploadStatus = (IdvUploadStatus) other;
        return p013kotlin.jvm.internal.s.f(this.documents, idvUploadStatus.documents) && p013kotlin.jvm.internal.s.f(this.selfie, idvUploadStatus.selfie) && this.metadata == idvUploadStatus.metadata && p013kotlin.jvm.internal.s.f(this.clientData, idvUploadStatus.clientData);
    }

    public int hashCode() {
        int iHashCode = ((((this.documents.hashCode() * 31) + this.selfie.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        ClientData clientData = this.clientData;
        return iHashCode + (clientData == null ? 0 : clientData.hashCode());
    }

    public String toString() {
        return "IdvUploadStatus(documents=" + this.documents + ", selfie=" + this.selfie + ", metadata=" + this.metadata + ", clientData=" + this.clientData + ")";
    }

    public IdvUploadStatus(DocumentUploadStatus documents, SelfieUploadStatus selfie, EnumC3123cD metadata, ClientData clientData) {
        p013kotlin.jvm.internal.s.k(documents, "documents");
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        this.documents = documents;
        this.selfie = selfie;
        this.metadata = metadata;
        this.clientData = clientData;
    }

    public static final /* synthetic */ void a(IdvUploadStatus self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f32538e;
        output.D(serialDesc, 0, DocumentUploadStatus.a.f33551a, self.documents);
        output.D(serialDesc, 1, SelfieUploadStatus.a.f36311a, self.selfie);
        output.D(serialDesc, 2, dVarArr[2], self.metadata);
        if (!output.G(serialDesc, 3) && self.clientData == null) {
            return;
        }
        output.y(serialDesc, 3, ClientData.a.f31329a, self.clientData);
    }
}
