package com.fourthline.orca.internal;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.Gender;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YC {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Pair a(Jp jp2) {
        p013kotlin.jvm.internal.s.k(jp2, "<this>");
        WorkflowResults.IDV.Person personAsWorkflowDataPerson = WorkflowResultsKt.asWorkflowDataPerson(jp2);
        if (personAsWorkflowDataPerson != null) {
            return jn0.x.a(personAsWorkflowDataPerson, new JSONObject().put("person", a(personAsWorkflowDataPerson)));
        }
        return null;
    }

    public static final Pair a(DeviceMetadata deviceMetadata) {
        p013kotlin.jvm.internal.s.k(deviceMetadata, "<this>");
        WorkflowResults.IDV.Geolocation geolocationAsWorkflowGeolocation = WorkflowResultsKt.asWorkflowGeolocation(deviceMetadata);
        if (geolocationAsWorkflowGeolocation != null) {
            return jn0.x.a(geolocationAsWorkflowGeolocation, new JSONObject().put("geolocation", a(geolocationAsWorkflowGeolocation)));
        }
        return null;
    }

    public static final Pair a(DeviceMetadata deviceMetadata, String appTrackerId, String str) {
        p013kotlin.jvm.internal.s.k(deviceMetadata, "<this>");
        p013kotlin.jvm.internal.s.k(appTrackerId, "appTrackerId");
        WorkflowResults.IDV.DeviceMetadata deviceMetadataAsWorkflowDataMetadata = WorkflowResultsKt.asWorkflowDataMetadata(deviceMetadata, appTrackerId, str);
        if (deviceMetadataAsWorkflowDataMetadata != null) {
            return jn0.x.a(deviceMetadataAsWorkflowDataMetadata, new JSONObject().put("devicemetadata", a(deviceMetadataAsWorkflowDataMetadata)));
        }
        return null;
    }

    public static final Pair a(XA xa2) {
        p013kotlin.jvm.internal.s.k(xa2, "<this>");
        WorkflowResults.IDV.TaxInfo taxInfoAsWorkflowDataTaxInfo = WorkflowResultsKt.asWorkflowDataTaxInfo(xa2);
        if (taxInfoAsWorkflowDataTaxInfo != null) {
            return jn0.x.a(taxInfoAsWorkflowDataTaxInfo, new JSONObject().putOpt("tax", a(taxInfoAsWorkflowDataTaxInfo)));
        }
        return null;
    }

    public static final Pair a(C4052y c4052y) {
        p013kotlin.jvm.internal.s.k(c4052y, "<this>");
        WorkflowResults.IDV.Address addressAsWorkflowDataAddress = WorkflowResultsKt.asWorkflowDataAddress(c4052y);
        if (addressAsWorkflowDataAddress != null) {
            return jn0.x.a(addressAsWorkflowDataAddress, new JSONObject().putOpt(PlaceTypes.ADDRESS, a(addressAsWorkflowDataAddress)));
        }
        return null;
    }

    public static final Pair a(F4 f11) {
        p013kotlin.jvm.internal.s.k(f11, "<this>");
        WorkflowResults.IDV.Contacts contactsAsWorkflowDataContacts = WorkflowResultsKt.asWorkflowDataContacts(f11);
        if (contactsAsWorkflowDataContacts != null) {
            return jn0.x.a(contactsAsWorkflowDataContacts, new JSONObject().putOpt("emailAndPhone", a(contactsAsWorkflowDataContacts)));
        }
        return null;
    }

    private static final JSONObject a(WorkflowResults.IDV.Address address) {
        return new JSONObject().put("street", address.getStreet()).put("streetNumber", String.valueOf(address.getStreetNumber())).put("streetNumberSuffix", address.getStreetNumberSuffix()).put("postalCode", address.getPostalCode()).put("city", address.getCity()).put(PlaceTypes.COUNTRY, address.getCountryCode());
    }

    public static final JSONObject a(WorkflowResults.IDV.Contacts contacts) {
        p013kotlin.jvm.internal.s.k(contacts, "<this>");
        return new JSONObject().put(Scopes.EMAIL, contacts.getEmail()).put("mobile", contacts.getMobile()).putOpt("phone", contacts.getPhone());
    }

    public static final JSONObject a(WorkflowResults.IDV.TaxInfo taxInfo) {
        p013kotlin.jvm.internal.s.k(taxInfo, "<this>");
        return new JSONObject().put("countrySubjectToTaxation", taxInfo.getTaxationCountryCode()).put("tin", taxInfo.getTaxNumber()).put("usPerson", taxInfo.getUsPerson()).putOpt("ustin", taxInfo.getUsTin());
    }

    public static final JSONObject a(WorkflowResults.IDV.Person person) throws JSONException {
        p013kotlin.jvm.internal.s.k(person, "<this>");
        JSONObject jSONObjectPut = new JSONObject().put("type", "Natural Person");
        String firstName = person.getFirstName();
        String str = " ";
        if (person.getMiddleName() != null) {
            str = " " + person.getMiddleName() + " ";
        }
        return jSONObjectPut.put("name", firstName + str + person.getLastName()).put(EContextPaymentMethod.FIRST_NAME, person.getFirstName()).put(EContextPaymentMethod.LAST_NAME, person.getLastName()).put("nationality", person.getNationalityCode()).put("gender", a(person.getGender())).put("birthDate", ZC.a().format(person.getBirthDate())).put("placeOfBirth", person.getBirthPlace()).put("countryOfBirth", person.getBirthCountryCode());
    }

    public static final JSONObject a(WorkflowResults.IDV.Geolocation geolocation) throws JSONException {
        p013kotlin.jvm.internal.s.k(geolocation, "<this>");
        JSONObject jSONObject = new JSONObject();
        Coordinate location = geolocation.getLocation();
        JSONObject jSONObjectPutOpt = jSONObject.putOpt(OrcaKeys.LONGITUDE, location != null ? Double.valueOf(location.getLongitude()).toString() : null);
        Coordinate location2 = geolocation.getLocation();
        return jSONObjectPutOpt.putOpt(OrcaKeys.LATITUDE, location2 != null ? Double.valueOf(location2.getLatitude()).toString() : null);
    }

    public static final JSONObject a(WorkflowResults.IDV.DeviceMetadata deviceMetadata) {
        p013kotlin.jvm.internal.s.k(deviceMetadata, "<this>");
        return new JSONObject().put("language", deviceMetadata.getLanguage()).put("sdkVersion", deviceMetadata.getSdkVersion()).put("sdkOrigin", deviceMetadata.getSdkOrigin()).put("model", deviceMetadata.getModel()).put("osCompromised", deviceMetadata.getOsCompromised()).put("osVersion", deviceMetadata.getOsVersion()).put("analyticsID", deviceMetadata.getAnalyticsId()).put("appTrackerId", deviceMetadata.getAppTrackerId());
    }

    private static final String a(Gender gender) {
        int i11 = a.$EnumSwitchMapping$0[gender.ordinal()];
        if (i11 == 1) {
            return "Female";
        }
        if (i11 == 2) {
            return "Male";
        }
        if (i11 == 3) {
            return "Unknown";
        }
        throw new NoWhenBranchMatchedException();
    }
}
