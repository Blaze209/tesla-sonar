package com.fourthline.core.mrz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.core.Gender;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Date;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0014\u0010\u001d\u001a\u00060\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0014\u0010$\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bHÆ\u0003¢\u0006\u0004\b)\u0010!J´\u0001\u0010*\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\f\b\u0002\u0010\b\u001a\u00060\u0002j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\t2\f\b\u0002\u0010\u0011\u001a\u00060\u0002j\u0002`\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001bR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u001bR\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001fR!\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!R!\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bC\u0010!R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010\u001fR\u001b\u0010\u0011\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u0010\u001bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010!¨\u0006Q"}, d2 = {"Lcom/fourthline/core/mrz/MrtdMrzInfo;", "Lcom/fourthline/core/mrz/MrzInfo;", "", "Lcom/fourthline/core/mrz/DocumentCode;", "documentCode", "Lcom/fourthline/core/mrz/Country;", WorkflowKeys.ISSUING_COUNTRY, "Lcom/fourthline/core/mrz/DocumentNumber;", "documentNumber", "Ljava/util/Date;", "expirationDate", "", "Lcom/fourthline/core/mrz/FirstName;", "firstNames", "Lcom/fourthline/core/mrz/LastName;", "lastNames", "birthDate", "nationality", "Lcom/fourthline/core/Gender;", "gender", "optionalData", "rawMrz", "Lcom/fourthline/core/mrz/MrtdMrzInfoValidationError;", "validationErrors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Date;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "()Lcom/fourthline/core/Gender;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/fourthline/core/mrz/MrtdMrzInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "getDocumentCode", DateTokenConverter.CONVERTER_KEY, "getIssuingCountry", "e", "getDocumentNumber", "f", "Ljava/util/Date;", "getExpirationDate", "g", "Ljava/util/List;", "getFirstNames", "h", "getLastNames", IntegerTokenConverter.CONVERTER_KEY, "getBirthDate", "j", "getNationality", "k", "Lcom/fourthline/core/Gender;", "getGender", "l", "getOptionalData", "m", "getRawMrz", "n", "getValidationErrors", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MrtdMrzInfo extends MrzInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List firstNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List lastNames;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date birthDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nationality;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gender gender;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String optionalData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rawMrz;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List validationErrors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtdMrzInfo(String documentCode, String issuingCountry, String documentNumber, Date expirationDate, List<String> firstNames, List<String> lastNames, Date birthDate, String nationality, Gender gender, String str, String rawMrz, List<? extends MrtdMrzInfoValidationError> validationErrors) {
        super(rawMrz, validationErrors, null);
        s.k(documentCode, "documentCode");
        s.k(issuingCountry, "issuingCountry");
        s.k(documentNumber, "documentNumber");
        s.k(expirationDate, "expirationDate");
        s.k(firstNames, "firstNames");
        s.k(lastNames, "lastNames");
        s.k(birthDate, "birthDate");
        s.k(nationality, "nationality");
        s.k(gender, "gender");
        s.k(rawMrz, "rawMrz");
        s.k(validationErrors, "validationErrors");
        this.documentCode = documentCode;
        this.issuingCountry = issuingCountry;
        this.documentNumber = documentNumber;
        this.expirationDate = expirationDate;
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.gender = gender;
        this.optionalData = str;
        this.rawMrz = rawMrz;
        this.validationErrors = validationErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrtdMrzInfo copy$default(MrtdMrzInfo mrtdMrzInfo, String str, String str2, String str3, Date date, List list, List list2, Date date2, String str4, Gender gender, String str5, String str6, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mrtdMrzInfo.documentCode;
        }
        if ((i11 & 2) != 0) {
            str2 = mrtdMrzInfo.issuingCountry;
        }
        if ((i11 & 4) != 0) {
            str3 = mrtdMrzInfo.documentNumber;
        }
        if ((i11 & 8) != 0) {
            date = mrtdMrzInfo.expirationDate;
        }
        if ((i11 & 16) != 0) {
            list = mrtdMrzInfo.firstNames;
        }
        if ((i11 & 32) != 0) {
            list2 = mrtdMrzInfo.lastNames;
        }
        if ((i11 & 64) != 0) {
            date2 = mrtdMrzInfo.birthDate;
        }
        if ((i11 & 128) != 0) {
            str4 = mrtdMrzInfo.nationality;
        }
        if ((i11 & 256) != 0) {
            gender = mrtdMrzInfo.gender;
        }
        if ((i11 & 512) != 0) {
            str5 = mrtdMrzInfo.optionalData;
        }
        if ((i11 & 1024) != 0) {
            str6 = mrtdMrzInfo.rawMrz;
        }
        if ((i11 & 2048) != 0) {
            list3 = mrtdMrzInfo.validationErrors;
        }
        String str7 = str6;
        List list4 = list3;
        Gender gender2 = gender;
        String str8 = str5;
        Date date3 = date2;
        String str9 = str4;
        List list5 = list;
        List list6 = list2;
        return mrtdMrzInfo.copy(str, str2, str3, date, list5, list6, date3, str9, gender2, str8, str7, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentCode() {
        return this.documentCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOptionalData() {
        return this.optionalData;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRawMrz() {
        return this.rawMrz;
    }

    public final List<MrtdMrzInfoValidationError> component12() {
        return this.validationErrors;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final List<String> component5() {
        return this.firstNames;
    }

    public final List<String> component6() {
        return this.lastNames;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    public final MrtdMrzInfo copy(String documentCode, String issuingCountry, String documentNumber, Date expirationDate, List<String> firstNames, List<String> lastNames, Date birthDate, String nationality, Gender gender, String optionalData, String rawMrz, List<? extends MrtdMrzInfoValidationError> validationErrors) {
        s.k(documentCode, "documentCode");
        s.k(issuingCountry, "issuingCountry");
        s.k(documentNumber, "documentNumber");
        s.k(expirationDate, "expirationDate");
        s.k(firstNames, "firstNames");
        s.k(lastNames, "lastNames");
        s.k(birthDate, "birthDate");
        s.k(nationality, "nationality");
        s.k(gender, "gender");
        s.k(rawMrz, "rawMrz");
        s.k(validationErrors, "validationErrors");
        return new MrtdMrzInfo(documentCode, issuingCountry, documentNumber, expirationDate, firstNames, lastNames, birthDate, nationality, gender, optionalData, rawMrz, validationErrors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrtdMrzInfo)) {
            return false;
        }
        MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) other;
        return s.f(this.documentCode, mrtdMrzInfo.documentCode) && s.f(this.issuingCountry, mrtdMrzInfo.issuingCountry) && s.f(this.documentNumber, mrtdMrzInfo.documentNumber) && s.f(this.expirationDate, mrtdMrzInfo.expirationDate) && s.f(this.firstNames, mrtdMrzInfo.firstNames) && s.f(this.lastNames, mrtdMrzInfo.lastNames) && s.f(this.birthDate, mrtdMrzInfo.birthDate) && s.f(this.nationality, mrtdMrzInfo.nationality) && this.gender == mrtdMrzInfo.gender && s.f(this.optionalData, mrtdMrzInfo.optionalData) && s.f(this.rawMrz, mrtdMrzInfo.rawMrz) && s.f(this.validationErrors, mrtdMrzInfo.validationErrors);
    }

    public final Date getBirthDate() {
        return this.birthDate;
    }

    public final String getDocumentCode() {
        return this.documentCode;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final List<String> getFirstNames() {
        return this.firstNames;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final List<String> getLastNames() {
        return this.lastNames;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getOptionalData() {
        return this.optionalData;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    public String getRawMrz() {
        return this.rawMrz;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    public List<MrtdMrzInfoValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.documentCode.hashCode() * 31) + this.issuingCountry.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.firstNames.hashCode()) * 31) + this.lastNames.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.gender.hashCode()) * 31;
        String str = this.optionalData;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.rawMrz.hashCode()) * 31) + this.validationErrors.hashCode();
    }

    public String toString() {
        return "MrtdMrzInfo(documentCode=" + this.documentCode + ", issuingCountry=" + this.issuingCountry + ", documentNumber=" + this.documentNumber + ", expirationDate=" + this.expirationDate + ", firstNames=" + this.firstNames + ", lastNames=" + this.lastNames + ", birthDate=" + this.birthDate + ", nationality=" + this.nationality + ", gender=" + this.gender + ", optionalData=" + this.optionalData + ", rawMrz=" + this.rawMrz + ", validationErrors=" + this.validationErrors + ")";
    }
}
