package com.fourthline.scanners.config.orca.kyc.model;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010-\u0012\u0004\b1\u00102\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u00100R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010-\u0012\u0004\b5\u00102\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u00100R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010-\u0012\u0004\b8\u00102\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00100R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010-\u0012\u0004\b;\u00102\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u00100R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010-\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u00100R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010-\u0012\u0004\bA\u00102\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u00100R*\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010-\u0012\u0004\bD\u00102\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u00100R*\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010-\u0012\u0004\bG\u00102\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u00100¨\u0006J"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "", "", EContextPaymentMethod.FIRST_NAME, "middleName", EContextPaymentMethod.LAST_NAME, "gender", "nationalityCode", "birthCountryCode", "birthPlace", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "setFirstName", "(Ljava/lang/String;)V", "getFirstName$annotations", "()V", "getMiddleName", "setMiddleName", "getMiddleName$annotations", "getLastName", "setLastName", "getLastName$annotations", "getGender", "setGender", "getGender$annotations", "getNationalityCode", "setNationalityCode", "getNationalityCode$annotations", "getBirthCountryCode", "setBirthCountryCode", "getBirthCountryCode$annotations", "getBirthPlace", "setBirthPlace", "getBirthPlace$annotations", "getBirthDate", "setBirthDate", "getBirthDate$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class PersonModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String birthCountryCode;
    private String birthDate;
    private String birthPlace;
    private String firstName;
    private String gender;
    private String lastName;
    private String middleName;
    private String nationalityCode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<PersonModel> serializer() {
            return PersonModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PersonModel(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, v1 v1Var) {
        if (255 != (i11 & 255)) {
            h1.b(i11, 255, PersonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.gender = str4;
        this.nationalityCode = str5;
        this.birthCountryCode = str6;
        this.birthPlace = str7;
        this.birthDate = str8;
    }

    public static /* synthetic */ PersonModel copy$default(PersonModel personModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = personModel.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = personModel.middleName;
        }
        if ((i11 & 4) != 0) {
            str3 = personModel.lastName;
        }
        if ((i11 & 8) != 0) {
            str4 = personModel.gender;
        }
        if ((i11 & 16) != 0) {
            str5 = personModel.nationalityCode;
        }
        if ((i11 & 32) != 0) {
            str6 = personModel.birthCountryCode;
        }
        if ((i11 & 64) != 0) {
            str7 = personModel.birthPlace;
        }
        if ((i11 & 128) != 0) {
            str8 = personModel.birthDate;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return personModel.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @o("birthCountryCode")
    public static /* synthetic */ void getBirthCountryCode$annotations() {
    }

    @o("birthDate")
    public static /* synthetic */ void getBirthDate$annotations() {
    }

    @o("birthPlace")
    public static /* synthetic */ void getBirthPlace$annotations() {
    }

    @o(EContextPaymentMethod.FIRST_NAME)
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @o("gender")
    public static /* synthetic */ void getGender$annotations() {
    }

    @o(EContextPaymentMethod.LAST_NAME)
    public static /* synthetic */ void getLastName$annotations() {
    }

    @o("middleName")
    public static /* synthetic */ void getMiddleName$annotations() {
    }

    @o("nationalityCode")
    public static /* synthetic */ void getNationalityCode$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(PersonModel self, uo0.d output, f serialDesc) {
        z1 z1Var = z1.f119730a;
        output.y(serialDesc, 0, z1Var, self.firstName);
        output.y(serialDesc, 1, z1Var, self.middleName);
        output.y(serialDesc, 2, z1Var, self.lastName);
        output.y(serialDesc, 3, z1Var, self.gender);
        output.y(serialDesc, 4, z1Var, self.nationalityCode);
        output.y(serialDesc, 5, z1Var, self.birthCountryCode);
        output.y(serialDesc, 6, z1Var, self.birthPlace);
        output.y(serialDesc, 7, z1Var, self.birthDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNationalityCode() {
        return this.nationalityCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBirthCountryCode() {
        return this.birthCountryCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public final PersonModel copy(String firstName, String middleName, String lastName, String gender, String nationalityCode, String birthCountryCode, String birthPlace, String birthDate) {
        return new PersonModel(firstName, middleName, lastName, gender, nationalityCode, birthCountryCode, birthPlace, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonModel)) {
            return false;
        }
        PersonModel personModel = (PersonModel) other;
        return s.f(this.firstName, personModel.firstName) && s.f(this.middleName, personModel.middleName) && s.f(this.lastName, personModel.lastName) && s.f(this.gender, personModel.gender) && s.f(this.nationalityCode, personModel.nationalityCode) && s.f(this.birthCountryCode, personModel.birthCountryCode) && s.f(this.birthPlace, personModel.birthPlace) && s.f(this.birthDate, personModel.birthDate);
    }

    public final String getBirthCountryCode() {
        return this.birthCountryCode;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNationalityCode() {
        return this.nationalityCode;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gender;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationalityCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.birthCountryCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.birthPlace;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.birthDate;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setBirthCountryCode(String str) {
        this.birthCountryCode = str;
    }

    public final void setBirthDate(String str) {
        this.birthDate = str;
    }

    public final void setBirthPlace(String str) {
        this.birthPlace = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setGender(String str) {
        this.gender = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setMiddleName(String str) {
        this.middleName = str;
    }

    public final void setNationalityCode(String str) {
        this.nationalityCode = str;
    }

    public String toString() {
        return "PersonModel(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", gender=" + this.gender + ", nationalityCode=" + this.nationalityCode + ", birthCountryCode=" + this.birthCountryCode + ", birthPlace=" + this.birthPlace + ", birthDate=" + this.birthDate + ")";
    }

    public PersonModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.gender = str4;
        this.nationalityCode = str5;
        this.birthCountryCode = str6;
        this.birthPlace = str7;
        this.birthDate = str8;
    }
}
