package com.fourthline.nfc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¸\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0013R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010\u0013R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\u0015R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010\u0013R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bA\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010\u0013¨\u0006D"}, d2 = {"Lcom/fourthline/nfc/PersonalDetails;", "", "", "fullName", "", "otherNames", "personalNumber", "dateOfBirth", "placeOfBirth", "permanentAddress", "telephone", "profession", "title", "summary", "otherValidTDNumbers", "custodyInformation", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/fourthline/nfc/PersonalDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFullName", "b", "Ljava/util/List;", "getOtherNames", "c", "getPersonalNumber", DateTokenConverter.CONVERTER_KEY, "getDateOfBirth", "e", "getPlaceOfBirth", "f", "getPermanentAddress", "g", "getTelephone", "h", "getProfession", IntegerTokenConverter.CONVERTER_KEY, "getTitle", "j", "getSummary", "k", "getOtherValidTDNumbers", "l", "getCustodyInformation", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalDetails {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List otherNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String personalNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateOfBirth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List placeOfBirth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List permanentAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String telephone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String profession;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List otherValidTDNumbers;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String custodyInformation;

    public PersonalDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalDetails copy$default(PersonalDetails personalDetails, String str, List list, String str2, String str3, List list2, List list3, String str4, String str5, String str6, String str7, List list4, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = personalDetails.fullName;
        }
        if ((i11 & 2) != 0) {
            list = personalDetails.otherNames;
        }
        if ((i11 & 4) != 0) {
            str2 = personalDetails.personalNumber;
        }
        if ((i11 & 8) != 0) {
            str3 = personalDetails.dateOfBirth;
        }
        if ((i11 & 16) != 0) {
            list2 = personalDetails.placeOfBirth;
        }
        if ((i11 & 32) != 0) {
            list3 = personalDetails.permanentAddress;
        }
        if ((i11 & 64) != 0) {
            str4 = personalDetails.telephone;
        }
        if ((i11 & 128) != 0) {
            str5 = personalDetails.profession;
        }
        if ((i11 & 256) != 0) {
            str6 = personalDetails.title;
        }
        if ((i11 & 512) != 0) {
            str7 = personalDetails.summary;
        }
        if ((i11 & 1024) != 0) {
            list4 = personalDetails.otherValidTDNumbers;
        }
        if ((i11 & 2048) != 0) {
            str8 = personalDetails.custodyInformation;
        }
        List list5 = list4;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        List list6 = list2;
        List list7 = list3;
        return personalDetails.copy(str, list, str2, str3, list6, list7, str12, str13, str10, str11, list5, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final List<String> component11() {
        return this.otherValidTDNumbers;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCustodyInformation() {
        return this.custodyInformation;
    }

    public final List<String> component2() {
        return this.otherNames;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final List<String> component5() {
        return this.placeOfBirth;
    }

    public final List<String> component6() {
        return this.permanentAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTelephone() {
        return this.telephone;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProfession() {
        return this.profession;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final PersonalDetails copy(String fullName, List<String> otherNames, String personalNumber, String dateOfBirth, List<String> placeOfBirth, List<String> permanentAddress, String telephone, String profession, String title, String summary, List<String> otherValidTDNumbers, String custodyInformation) {
        return new PersonalDetails(fullName, otherNames, personalNumber, dateOfBirth, placeOfBirth, permanentAddress, telephone, profession, title, summary, otherValidTDNumbers, custodyInformation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDetails)) {
            return false;
        }
        PersonalDetails personalDetails = (PersonalDetails) other;
        return s.f(this.fullName, personalDetails.fullName) && s.f(this.otherNames, personalDetails.otherNames) && s.f(this.personalNumber, personalDetails.personalNumber) && s.f(this.dateOfBirth, personalDetails.dateOfBirth) && s.f(this.placeOfBirth, personalDetails.placeOfBirth) && s.f(this.permanentAddress, personalDetails.permanentAddress) && s.f(this.telephone, personalDetails.telephone) && s.f(this.profession, personalDetails.profession) && s.f(this.title, personalDetails.title) && s.f(this.summary, personalDetails.summary) && s.f(this.otherValidTDNumbers, personalDetails.otherValidTDNumbers) && s.f(this.custodyInformation, personalDetails.custodyInformation);
    }

    public final String getCustodyInformation() {
        return this.custodyInformation;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final List<String> getOtherNames() {
        return this.otherNames;
    }

    public final List<String> getOtherValidTDNumbers() {
        return this.otherValidTDNumbers;
    }

    public final List<String> getPermanentAddress() {
        return this.permanentAddress;
    }

    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    public final List<String> getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final String getProfession() {
        return this.profession;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTelephone() {
        return this.telephone;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.fullName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.otherNames;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.personalNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateOfBirth;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.placeOfBirth;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.permanentAddress;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.telephone;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profession;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.summary;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list4 = this.otherValidTDNumbers;
        int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.custodyInformation;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PersonalDetails(fullName=" + this.fullName + ", otherNames=" + this.otherNames + ", personalNumber=" + this.personalNumber + ", dateOfBirth=" + this.dateOfBirth + ", placeOfBirth=" + this.placeOfBirth + ", permanentAddress=" + this.permanentAddress + ", telephone=" + this.telephone + ", profession=" + this.profession + ", title=" + this.title + ", summary=" + this.summary + ", otherValidTDNumbers=" + this.otherValidTDNumbers + ", custodyInformation=" + this.custodyInformation + ")";
    }

    public PersonalDetails(String str, List<String> list, String str2, String str3, List<String> list2, List<String> list3, String str4, String str5, String str6, String str7, List<String> list4, String str8) {
        this.fullName = str;
        this.otherNames = list;
        this.personalNumber = str2;
        this.dateOfBirth = str3;
        this.placeOfBirth = list2;
        this.permanentAddress = list3;
        this.telephone = str4;
        this.profession = str5;
        this.title = str6;
        this.summary = str7;
        this.otherValidTDNumbers = list4;
        this.custodyInformation = str8;
    }

    public /* synthetic */ PersonalDetails(String str, List list, String str2, String str3, List list2, List list3, String str4, String str5, String str6, String str7, List list4, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : list2, (i11 & 32) != 0 ? null : list3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : list4, (i11 & 2048) != 0 ? null : str8);
    }
}
