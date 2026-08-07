package com.fourthline.kyc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.core.Gender;
import com.fourthline.core.Validatable;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bi\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%Jp\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u00103R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00103R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010 \"\u0004\b:\u0010;R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u00103R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00100\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u00103R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u00103R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010%\"\u0004\bF\u0010GR\u001c\u0010J\u001a\n H*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010D¨\u0006K"}, d2 = {"Lcom/fourthline/kyc/Person;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/PersonValidationError;", "", EContextPaymentMethod.FIRST_NAME, "middleName", EContextPaymentMethod.LAST_NAME, "Lcom/fourthline/core/Gender;", "gender", "nationalityCode", "birthCountryCode", "birthPlace", "Ljava/util/Date;", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "", "c", "()Z", "e", "f", "b", DateTokenConverter.CONVERTER_KEY, "a", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/fourthline/core/Gender;", "component5", "component6", "component7", "component8", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/fourthline/kyc/Person;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "setFirstName", "(Ljava/lang/String;)V", "getMiddleName", "setMiddleName", "getLastName", "setLastName", "Lcom/fourthline/core/Gender;", "getGender", "setGender", "(Lcom/fourthline/core/Gender;)V", "getNationalityCode", "setNationalityCode", "getBirthCountryCode", "setBirthCountryCode", "g", "getBirthPlace", "setBirthPlace", "h", "Ljava/util/Date;", "getBirthDate", "setBirthDate", "(Ljava/util/Date;)V", "kotlin.jvm.PlatformType", IntegerTokenConverter.CONVERTER_KEY, "startOfTheDay", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Person implements Validatable<PersonValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String middleName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private Gender gender;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String nationalityCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String birthCountryCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String birthPlace;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private Date birthDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Date startOfTheDay;

    public Person() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private final boolean a() {
        String str = this.birthCountryCode;
        if (str != null) {
            return CountryCodes.INSTANCE.isSupportedCountry(str);
        }
        return true;
    }

    private final boolean b() {
        Date date = this.birthDate;
        if (date != null) {
            return date.before(this.startOfTheDay);
        }
        return false;
    }

    private final boolean c() {
        String str = this.firstName;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    public static /* synthetic */ Person copy$default(Person person, String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = person.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = person.middleName;
        }
        if ((i11 & 4) != 0) {
            str3 = person.lastName;
        }
        if ((i11 & 8) != 0) {
            gender = person.gender;
        }
        if ((i11 & 16) != 0) {
            str4 = person.nationalityCode;
        }
        if ((i11 & 32) != 0) {
            str5 = person.birthCountryCode;
        }
        if ((i11 & 64) != 0) {
            str6 = person.birthPlace;
        }
        if ((i11 & 128) != 0) {
            date = person.birthDate;
        }
        String str7 = str6;
        Date date2 = date;
        String str8 = str4;
        String str9 = str5;
        return person.copy(str, str2, str3, gender, str8, str9, str7, date2);
    }

    private final boolean d() {
        return this.gender != null;
    }

    private final boolean e() {
        String str = this.lastName;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    private final boolean f() {
        String str = this.nationalityCode;
        if (str != null) {
            return CountryCodes.INSTANCE.isSupportedCountry(str);
        }
        return false;
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
    public final Gender getGender() {
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
    public final Date getBirthDate() {
        return this.birthDate;
    }

    public final Person copy(String firstName, String middleName, String lastName, Gender gender, String nationalityCode, String birthCountryCode, String birthPlace, Date birthDate) {
        return new Person(firstName, middleName, lastName, gender, nationalityCode, birthCountryCode, birthPlace, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Person)) {
            return false;
        }
        Person person = (Person) other;
        return s.f(this.firstName, person.firstName) && s.f(this.middleName, person.middleName) && s.f(this.lastName, person.lastName) && this.gender == person.gender && s.f(this.nationalityCode, person.nationalityCode) && s.f(this.birthCountryCode, person.birthCountryCode) && s.f(this.birthPlace, person.birthPlace) && s.f(this.birthDate, person.birthDate);
    }

    public final String getBirthCountryCode() {
        return this.birthCountryCode;
    }

    public final Date getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Gender getGender() {
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
        Gender gender = this.gender;
        int iHashCode4 = (iHashCode3 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str4 = this.nationalityCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthCountryCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.birthPlace;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.birthDate;
        return iHashCode7 + (date != null ? date.hashCode() : 0);
    }

    public final void setBirthCountryCode(String str) {
        this.birthCountryCode = str;
    }

    public final void setBirthDate(Date date) {
        this.birthDate = date;
    }

    public final void setBirthPlace(String str) {
        this.birthPlace = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setGender(Gender gender) {
        this.gender = gender;
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
        return "Person(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", gender=" + this.gender + ", nationalityCode=" + this.nationalityCode + ", birthCountryCode=" + this.birthCountryCode + ", birthPlace=" + this.birthPlace + ", birthDate=" + this.birthDate + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<PersonValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!c()) {
            arrayList.add(PersonValidationError.INVALID_FIRST_NAME);
        }
        if (!e()) {
            arrayList.add(PersonValidationError.INVALID_LAST_NAME);
        }
        if (!f()) {
            arrayList.add(PersonValidationError.INVALID_NATIONALITY_CODE);
        }
        if (!d()) {
            arrayList.add(PersonValidationError.INVALID_GENDER);
        }
        if (!b()) {
            arrayList.add(PersonValidationError.INVALID_BIRTH_DATE);
        }
        if (!a()) {
            arrayList.add(PersonValidationError.INVALID_BIRTH_COUNTRY_CODE);
        }
        return arrayList;
    }

    public Person(String str) {
        this(str, null, null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public Person(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public Person(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    public Person(String str, String str2, String str3, Gender gender) {
        this(str, str2, str3, gender, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }

    public Person(String str, String str2, String str3, Gender gender, String str4) {
        this(str, str2, str3, gender, str4, null, null, null, 224, null);
    }

    public Person(String str, String str2, String str3, Gender gender, String str4, String str5) {
        this(str, str2, str3, gender, str4, str5, null, null, 192, null);
    }

    public Person(String str, String str2, String str3, Gender gender, String str4, String str5, String str6) {
        this(str, str2, str3, gender, str4, str5, str6, null, 128, null);
    }

    public Person(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.gender = gender;
        this.nationalityCode = str4;
        this.birthCountryCode = str5;
        this.birthPlace = str6;
        this.birthDate = date;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.startOfTheDay = calendar.getTime();
    }

    public /* synthetic */ Person(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : gender, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : date);
    }
}
