package com.fourthline.scanners.config;

import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/fourthline/scanners/config/SupportedCountryInfo;", "", "", WorkflowKeys.ISSUING_COUNTRY, "", "Lcom/fourthline/scanners/config/IdDocument;", "idDocument", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/SupportedCountryInfo;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/fourthline/scanners/config/SupportedCountryInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIssuingCountry", "getIssuingCountry$annotations", "()V", "Ljava/util/List;", "getIdDocument", "getIdDocument$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class SupportedCountryInfo {
    private final List<IdDocument> idDocument;
    private final String issuingCountry;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d<Object>[] $childSerializers = {null, new e(IdDocument$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/SupportedCountryInfo$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/SupportedCountryInfo;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<SupportedCountryInfo> serializer() {
            return SupportedCountryInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SupportedCountryInfo(int i11, String str, List list, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, SupportedCountryInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.issuingCountry = str;
        this.idDocument = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedCountryInfo copy$default(SupportedCountryInfo supportedCountryInfo, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supportedCountryInfo.issuingCountry;
        }
        if ((i11 & 2) != 0) {
            list = supportedCountryInfo.idDocument;
        }
        return supportedCountryInfo.copy(str, list);
    }

    @o("idDocuments")
    public static /* synthetic */ void getIdDocument$annotations() {
    }

    @o(WorkflowKeys.ISSUING_COUNTRY)
    public static /* synthetic */ void getIssuingCountry$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(SupportedCountryInfo self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = $childSerializers;
        output.e(serialDesc, 0, self.issuingCountry);
        output.D(serialDesc, 1, dVarArr[1], self.idDocument);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final List<IdDocument> component2() {
        return this.idDocument;
    }

    public final SupportedCountryInfo copy(String issuingCountry, List<IdDocument> idDocument) {
        s.k(issuingCountry, "issuingCountry");
        s.k(idDocument, "idDocument");
        return new SupportedCountryInfo(issuingCountry, idDocument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedCountryInfo)) {
            return false;
        }
        SupportedCountryInfo supportedCountryInfo = (SupportedCountryInfo) other;
        return s.f(this.issuingCountry, supportedCountryInfo.issuingCountry) && s.f(this.idDocument, supportedCountryInfo.idDocument);
    }

    public final List<IdDocument> getIdDocument() {
        return this.idDocument;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public int hashCode() {
        return (this.issuingCountry.hashCode() * 31) + this.idDocument.hashCode();
    }

    public String toString() {
        return "SupportedCountryInfo(issuingCountry=" + this.issuingCountry + ", idDocument=" + this.idDocument + ")";
    }

    public SupportedCountryInfo(String issuingCountry, List<IdDocument> idDocument) {
        s.k(issuingCountry, "issuingCountry");
        s.k(idDocument, "idDocument");
        this.issuingCountry = issuingCountry;
        this.idDocument = idDocument;
    }
}
