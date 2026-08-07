package com.fourthline.nfc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jp\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010\u0010¨\u00068"}, d2 = {"Lcom/fourthline/nfc/IdlBasicInfo;", "", "", WorkflowKeys.ISSUING_COUNTRY, "issuingAuthority", "documentNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthDate", "birthPlace", EContextPaymentMethod.FIRST_NAME, EContextPaymentMethod.LAST_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/nfc/IdlBasicInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIssuingCountry", "b", "getIssuingAuthority", "c", "getDocumentNumber", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "getIssueDate", "e", "getExpirationDate", "f", "getBirthDate", "g", "getBirthPlace", "h", "getFirstName", IntegerTokenConverter.CONVERTER_KEY, "getLastName", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IdlBasicInfo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingAuthority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date issueDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date birthDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthPlace;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    public IdlBasicInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ IdlBasicInfo copy$default(IdlBasicInfo idlBasicInfo, String str, String str2, String str3, Date date, Date date2, Date date3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = idlBasicInfo.issuingCountry;
        }
        if ((i11 & 2) != 0) {
            str2 = idlBasicInfo.issuingAuthority;
        }
        if ((i11 & 4) != 0) {
            str3 = idlBasicInfo.documentNumber;
        }
        if ((i11 & 8) != 0) {
            date = idlBasicInfo.issueDate;
        }
        if ((i11 & 16) != 0) {
            date2 = idlBasicInfo.expirationDate;
        }
        if ((i11 & 32) != 0) {
            date3 = idlBasicInfo.birthDate;
        }
        if ((i11 & 64) != 0) {
            str4 = idlBasicInfo.birthPlace;
        }
        if ((i11 & 128) != 0) {
            str5 = idlBasicInfo.firstName;
        }
        if ((i11 & 256) != 0) {
            str6 = idlBasicInfo.lastName;
        }
        String str7 = str5;
        String str8 = str6;
        Date date4 = date3;
        String str9 = str4;
        Date date5 = date2;
        String str10 = str3;
        return idlBasicInfo.copy(str, str2, str10, date, date5, date4, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final IdlBasicInfo copy(String issuingCountry, String issuingAuthority, String documentNumber, Date issueDate, Date expirationDate, Date birthDate, String birthPlace, String firstName, String lastName) {
        s.k(issuingCountry, "issuingCountry");
        s.k(issuingAuthority, "issuingAuthority");
        s.k(documentNumber, "documentNumber");
        s.k(birthPlace, "birthPlace");
        s.k(firstName, "firstName");
        s.k(lastName, "lastName");
        return new IdlBasicInfo(issuingCountry, issuingAuthority, documentNumber, issueDate, expirationDate, birthDate, birthPlace, firstName, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdlBasicInfo)) {
            return false;
        }
        IdlBasicInfo idlBasicInfo = (IdlBasicInfo) other;
        return s.f(this.issuingCountry, idlBasicInfo.issuingCountry) && s.f(this.issuingAuthority, idlBasicInfo.issuingAuthority) && s.f(this.documentNumber, idlBasicInfo.documentNumber) && s.f(this.issueDate, idlBasicInfo.issueDate) && s.f(this.expirationDate, idlBasicInfo.expirationDate) && s.f(this.birthDate, idlBasicInfo.birthDate) && s.f(this.birthPlace, idlBasicInfo.birthPlace) && s.f(this.firstName, idlBasicInfo.firstName) && s.f(this.lastName, idlBasicInfo.lastName);
    }

    public final Date getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Date getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        int iHashCode = ((((this.issuingCountry.hashCode() * 31) + this.issuingAuthority.hashCode()) * 31) + this.documentNumber.hashCode()) * 31;
        Date date = this.issueDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthDate;
        return ((((((iHashCode3 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.birthPlace.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode();
    }

    public String toString() {
        return "IdlBasicInfo(issuingCountry=" + this.issuingCountry + ", issuingAuthority=" + this.issuingAuthority + ", documentNumber=" + this.documentNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthDate=" + this.birthDate + ", birthPlace=" + this.birthPlace + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
    }

    public IdlBasicInfo(String issuingCountry, String issuingAuthority, String documentNumber, Date date, Date date2, Date date3, String birthPlace, String firstName, String lastName) {
        s.k(issuingCountry, "issuingCountry");
        s.k(issuingAuthority, "issuingAuthority");
        s.k(documentNumber, "documentNumber");
        s.k(birthPlace, "birthPlace");
        s.k(firstName, "firstName");
        s.k(lastName, "lastName");
        this.issuingCountry = issuingCountry;
        this.issuingAuthority = issuingAuthority;
        this.documentNumber = documentNumber;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthDate = date3;
        this.birthPlace = birthPlace;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public /* synthetic */ IdlBasicInfo(String str, String str2, String str3, Date date, Date date2, Date date3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : date, (i11 & 16) != 0 ? null : date2, (i11 & 32) != 0 ? null : date3, (i11 & 64) != 0 ? "" : str4, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? "" : str6);
    }
}
