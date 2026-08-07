package com.fourthline.core;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/fourthline/core/CountryNetworkModel;", "", "", WorkflowKeys.ISSUING_COUNTRY, "", "Lcom/fourthline/core/CountryNetworkModel$Document;", "idDocuments", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/fourthline/core/CountryNetworkModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIssuingCountry", "b", "Ljava/util/List;", "getIdDocuments", "Companion", "Document", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CountryNetworkModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List idDocuments;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/fourthline/core/CountryNetworkModel$Companion;", "", "<init>", "()V", "create", "", "Lcom/fourthline/core/CountryNetworkModel;", "from", "Lorg/json/JSONArray;", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<CountryNetworkModel> create(JSONArray from) {
            s.k(from, "from");
            return CountryNetworkModelKt.a(from);
        }

        private Companion() {
        }

        public final List<CountryNetworkModel> create(String from) {
            s.k(from, "from");
            return CountryNetworkModelKt.a(new JSONArray(from));
        }
    }

    public CountryNetworkModel(String issuingCountry, List<Document> idDocuments) {
        s.k(issuingCountry, "issuingCountry");
        s.k(idDocuments, "idDocuments");
        this.issuingCountry = issuingCountry;
        this.idDocuments = idDocuments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryNetworkModel copy$default(CountryNetworkModel countryNetworkModel, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryNetworkModel.issuingCountry;
        }
        if ((i11 & 2) != 0) {
            list = countryNetworkModel.idDocuments;
        }
        return countryNetworkModel.copy(str, list);
    }

    public static final List<CountryNetworkModel> create(String str) {
        return INSTANCE.create(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final List<Document> component2() {
        return this.idDocuments;
    }

    public final CountryNetworkModel copy(String issuingCountry, List<Document> idDocuments) {
        s.k(issuingCountry, "issuingCountry");
        s.k(idDocuments, "idDocuments");
        return new CountryNetworkModel(issuingCountry, idDocuments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryNetworkModel)) {
            return false;
        }
        CountryNetworkModel countryNetworkModel = (CountryNetworkModel) other;
        return s.f(this.issuingCountry, countryNetworkModel.issuingCountry) && s.f(this.idDocuments, countryNetworkModel.idDocuments);
    }

    public final List<Document> getIdDocuments() {
        return this.idDocuments;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public int hashCode() {
        return (this.issuingCountry.hashCode() * 31) + this.idDocuments.hashCode();
    }

    public String toString() {
        return "CountryNetworkModel(issuingCountry=" + this.issuingCountry + ", idDocuments=" + this.idDocuments + ")";
    }

    public static final List<CountryNetworkModel> create(JSONArray jSONArray) {
        return INSTANCE.create(jSONArray);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/fourthline/core/CountryNetworkModel$Document;", "", "Lcom/fourthline/core/DocumentType;", "type", "", "", "nationalities", "Ljava/util/Date;", "nfcIssueDate", "", "validityPeriod", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/util/List;Ljava/util/Date;Ljava/lang/Integer;)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Date;", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/util/List;Ljava/util/Date;Ljava/lang/Integer;)Lcom/fourthline/core/CountryNetworkModel$Document;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getType", "b", "Ljava/util/List;", "getNationalities", "c", "Ljava/util/Date;", "getNfcIssueDate", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getValidityPeriod", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Document {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentType type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List nationalities;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date nfcIssueDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer validityPeriod;

        public Document(DocumentType type, List<String> nationalities, Date date, Integer num) {
            s.k(type, "type");
            s.k(nationalities, "nationalities");
            this.type = type;
            this.nationalities = nationalities;
            this.nfcIssueDate = date;
            this.validityPeriod = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Document copy$default(Document document, DocumentType documentType, List list, Date date, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentType = document.type;
            }
            if ((i11 & 2) != 0) {
                list = document.nationalities;
            }
            if ((i11 & 4) != 0) {
                date = document.nfcIssueDate;
            }
            if ((i11 & 8) != 0) {
                num = document.validityPeriod;
            }
            return document.copy(documentType, list, date, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentType getType() {
            return this.type;
        }

        public final List<String> component2() {
            return this.nationalities;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Date getNfcIssueDate() {
            return this.nfcIssueDate;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getValidityPeriod() {
            return this.validityPeriod;
        }

        public final Document copy(DocumentType type, List<String> nationalities, Date nfcIssueDate, Integer validityPeriod) {
            s.k(type, "type");
            s.k(nationalities, "nationalities");
            return new Document(type, nationalities, nfcIssueDate, validityPeriod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return this.type == document.type && s.f(this.nationalities, document.nationalities) && s.f(this.nfcIssueDate, document.nfcIssueDate) && s.f(this.validityPeriod, document.validityPeriod);
        }

        public final List<String> getNationalities() {
            return this.nationalities;
        }

        public final Date getNfcIssueDate() {
            return this.nfcIssueDate;
        }

        public final DocumentType getType() {
            return this.type;
        }

        public final Integer getValidityPeriod() {
            return this.validityPeriod;
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.nationalities.hashCode()) * 31;
            Date date = this.nfcIssueDate;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Integer num = this.validityPeriod;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Document(type=" + this.type + ", nationalities=" + this.nationalities + ", nfcIssueDate=" + this.nfcIssueDate + ", validityPeriod=" + this.validityPeriod + ")";
        }

        public /* synthetic */ Document(DocumentType documentType, List list, Date date, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(documentType, list, (i11 & 4) != 0 ? null : date, (i11 & 8) != 0 ? null : num);
        }
    }
}
