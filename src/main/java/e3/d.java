package e3;

import java.util.HashMap;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Le3/m;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Le3/m;)Ljava/lang/String;", "getAndroidType$annotations", "(Le3/m;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<m, String> f61587a = v0.k(x.a(m.EmailAddress, "emailAddress"), x.a(m.Username, "username"), x.a(m.Password, "password"), x.a(m.NewUsername, "newUsername"), x.a(m.NewPassword, "newPassword"), x.a(m.PostalAddress, "postalAddress"), x.a(m.PostalCode, "postalCode"), x.a(m.CreditCardNumber, "creditCardNumber"), x.a(m.CreditCardSecurityCode, "creditCardSecurityCode"), x.a(m.CreditCardExpirationDate, "creditCardExpirationDate"), x.a(m.CreditCardExpirationMonth, "creditCardExpirationMonth"), x.a(m.CreditCardExpirationYear, "creditCardExpirationYear"), x.a(m.CreditCardExpirationDay, "creditCardExpirationDay"), x.a(m.AddressCountry, "addressCountry"), x.a(m.AddressRegion, "addressRegion"), x.a(m.AddressLocality, "addressLocality"), x.a(m.AddressStreet, "streetAddress"), x.a(m.AddressAuxiliaryDetails, "extendedAddress"), x.a(m.PostalCodeExtended, "extendedPostalCode"), x.a(m.PersonFullName, "personName"), x.a(m.PersonFirstName, "personGivenName"), x.a(m.PersonLastName, "personFamilyName"), x.a(m.PersonMiddleName, "personMiddleName"), x.a(m.PersonMiddleInitial, "personMiddleInitial"), x.a(m.PersonNamePrefix, "personNamePrefix"), x.a(m.PersonNameSuffix, "personNameSuffix"), x.a(m.PhoneNumber, "phoneNumber"), x.a(m.PhoneNumberDevice, "phoneNumberDevice"), x.a(m.PhoneCountryCode, "phoneCountryCode"), x.a(m.PhoneNumberNational, "phoneNational"), x.a(m.Gender, "gender"), x.a(m.BirthDateFull, "birthDateFull"), x.a(m.BirthDateDay, "birthDateDay"), x.a(m.BirthDateMonth, "birthDateMonth"), x.a(m.BirthDateYear, "birthDateYear"), x.a(m.SmsOtpCode, "smsOTPCode"));

    public static final String a(m mVar) {
        String str = f61587a.get(mVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
