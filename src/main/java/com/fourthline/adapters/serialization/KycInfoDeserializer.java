package com.fourthline.adapters.serialization;

import android.graphics.Bitmap;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.adapters.common.DateFormat;
import com.fourthline.adapters.common.FourthlineOutputProcessor;
import com.fourthline.adapters.errors.KycJsonError;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.kyc.Address;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Contacts;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.EmploymentStatus;
import com.fourthline.kyc.Industry;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.Person;
import com.fourthline.kyc.Profession;
import com.fourthline.kyc.Provider;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.TaxInfo;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.a;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002J\f\u0010\u000f\u001a\u00020\u0010*\u00020\rH\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\rH\u0002J\f\u0010\u0013\u001a\u00020\u0014*\u00020\rH\u0002J\f\u0010\u0015\u001a\u00020\u0016*\u00020\rH\u0002J\f\u0010\u0017\u001a\u00020\u0018*\u00020\rH\u0002J\f\u0010\u0019\u001a\u00020\u001a*\u00020\rH\u0002J\f\u0010\u001b\u001a\u00020\u001c*\u00020\rH\u0002J\f\u0010\u001d\u001a\u00020\u001e*\u00020\rH\u0002J\f\u0010\u001f\u001a\u00020 *\u00020\rH\u0002J\f\u0010!\u001a\u00020\"*\u00020\rH\u0002J\f\u0010#\u001a\u00020$*\u00020\rH\u0002J\f\u0010%\u001a\u00020&*\u00020\rH\u0002J\u000e\u0010'\u001a\u0004\u0018\u00010(*\u00020\rH\u0002J\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020+0**\u00020,H\u0002J\f\u0010-\u001a\u00020+*\u00020\rH\u0002J\u0012\u0010.\u001a\b\u0012\u0004\u0012\u00020/0**\u00020,H\u0002J\f\u00100\u001a\u00020/*\u00020\rH\u0002J\u0018\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402*\u00020,H\u0002J\f\u00105\u001a\u000204*\u00020\u000bH\u0002J\f\u00106\u001a\u000207*\u00020\rH\u0002J\u000e\u00108\u001a\u0004\u0018\u00010(*\u00020\rH\u0002J\f\u00109\u001a\u00020:*\u00020;H\u0002J\f\u0010<\u001a\u00020=*\u00020\u000bH\u0002J\f\u0010>\u001a\u00020?*\u00020\u000bH\u0002J\f\u0010@\u001a\u00020A*\u00020\u000bH\u0002J\f\u0010B\u001a\u00020C*\u00020\u000bH\u0002J\f\u0010D\u001a\u00020E*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/fourthline/adapters/serialization/KycInfoDeserializer;", "", "requiresMetaData", "", "bitmapDeserializer", "Lcom/fourthline/adapters/serialization/BitmapDeserializer;", "<init>", "(ZLcom/fourthline/adapters/serialization/BitmapDeserializer;)V", "deserialize", "Lcom/fourthline/kyc/KycInfo;", "kycInfoString", "", "kycInfoJson", "Lorg/json/JSONObject;", "toKycInfo", "toKycProvider", "Lcom/fourthline/kyc/Provider;", "toKycPerson", "Lcom/fourthline/kyc/Person;", "toKycAddress", "Lcom/fourthline/kyc/Address;", "toKycContacts", "Lcom/fourthline/kyc/Contacts;", "toKycProfession", "Lcom/fourthline/kyc/Profession;", "toKycAttachmentSelfie", "Lcom/fourthline/kyc/Attachment$Selfie;", "toKycDocument", "Lcom/fourthline/kyc/Document;", "toTaxInfo", "Lcom/fourthline/kyc/TaxInfo;", "toKycAttachmentNfc", "Lcom/fourthline/kyc/Attachment$Nfc;", "toVideoRecording", "Lcom/fourthline/core/VideoRecording;", "toKycSecondaryDocument", "Lcom/fourthline/kyc/SecondaryDocument;", "toKycDeviceMetadata", "Lcom/fourthline/core/DeviceMetadata;", "getLocation", "Lcom/fourthline/core/location/Coordinate;", "toKycQesAttachments", "", "Lcom/fourthline/kyc/QesAttachment;", "Lorg/json/JSONArray;", "toKycQesAttachment", "toImages", "Lcom/fourthline/kyc/Attachment$Document;", "toAttachmentDocument", "toNfcDataGroups", "", "", "", "decodeHex", "toLocalFileAttachment", "Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", "toLocation", "toBitmap", "Landroid/graphics/Bitmap;", "Ljava/io/File;", "toDocumentType", "Lcom/fourthline/core/DocumentType;", "toDocumentFileSide", "Lcom/fourthline/core/DocumentFileSide;", "toGender", "Lcom/fourthline/core/Gender;", "toEmploymentStatus", "Lcom/fourthline/kyc/EmploymentStatus;", "toIndustry", "Lcom/fourthline/kyc/Industry;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KycInfoDeserializer {
    private final BitmapDeserializer bitmapDeserializer;
    private final boolean requiresMetaData;

    public KycInfoDeserializer(boolean z11, BitmapDeserializer bitmapDeserializer) {
        s.k(bitmapDeserializer, "bitmapDeserializer");
        this.requiresMetaData = z11;
        this.bitmapDeserializer = bitmapDeserializer;
    }

    private final byte[] decodeHex(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Must have an even length");
        }
        List<String> listL1 = t.L1(str, 2);
        ArrayList arrayList = new ArrayList(v.y(listL1, 10));
        Iterator<T> it = listL1.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), a.a(16))));
        }
        return v.g1(arrayList);
    }

    private final Coordinate getLocation(JSONObject jSONObject) {
        Coordinate location;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("location");
        Coordinate coordinate = (jSONObjectOptJSONObject == null || (location = toLocation(jSONObjectOptJSONObject)) == null) ? null : new Coordinate(location.getLatitude(), location.getLongitude());
        if (coordinate == null || !s.f(coordinate, LocationProviderKt.getNotProvidedCoordinate())) {
            return s.f(jSONObject.optString("location"), "notProvided") ? LocationProviderKt.getNotProvidedCoordinate() : coordinate;
        }
        return LocationProviderKt.getNotProvidedCoordinate();
    }

    private final Attachment.Document toAttachmentDocument(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "image");
            Bitmap bitmap = androidOptString != null ? toBitmap(new File(new URI(androidOptString))) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Action.FILE_ATTRIBUTE);
            Attachment.LocalFileAttachment localFileAttachment = jSONObjectOptJSONObject != null ? toLocalFileAttachment(jSONObjectOptJSONObject) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "fileSide");
            DocumentFileSide documentFileSide = androidOptString2 != null ? toDocumentFileSide(androidOptString2) : null;
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, "timestamp");
            Long lValueOf = androidOptString3 != null ? Long.valueOf(DateFormat.ISO8601.fromDateFormat(androidOptString3).getTime()) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("location");
            Attachment.Document document = new Attachment.Document(bitmap, localFileAttachment, documentFileSide, false, lValueOf, jSONObjectOptJSONObject2 != null ? toLocation(jSONObjectOptJSONObject2) : null, 8, null);
            Boolean optBoolean = JSONExtensionsKt.getOptBoolean(jSONObject, "isAngled");
            if (optBoolean != null) {
                document.setAngled(optBoolean.booleanValue());
            }
            return document;
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Bitmap toBitmap(File file) {
        return this.bitmapDeserializer.deserialize(file);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DocumentFileSide toDocumentFileSide(String str) throws JSONException {
        switch (str.hashCode()) {
            case -1703764096:
                if (str.equals("insideRight")) {
                    return DocumentFileSide.INSIDE_RIGHT;
                }
                break;
            case -193690077:
                if (str.equals("insideLeft")) {
                    return DocumentFileSide.INSIDE_LEFT;
                }
                break;
            case 3015911:
                if (str.equals("back")) {
                    return DocumentFileSide.BACK;
                }
                break;
            case 97705513:
                if (str.equals("front")) {
                    return DocumentFileSide.FRONT;
                }
                break;
        }
        KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
        throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DocumentType toDocumentType(String str) throws JSONException {
        switch (str.hashCode()) {
            case -2055554759:
                if (str.equals("proofOfAddress")) {
                    return DocumentType.PROOF_OF_ADDRESS;
                }
                break;
            case -1596972795:
                if (str.equals("frenchIdCard")) {
                    return DocumentType.FRENCH_ID_CARD;
                }
                break;
            case -1194461493:
                if (str.equals("idCard")) {
                    return DocumentType.ID_CARD;
                }
                break;
            case -1190775690:
                if (str.equals("driversLicense")) {
                    return DocumentType.DRIVERS_LICENSE;
                }
                break;
            case -795220025:
                if (str.equals("paperId")) {
                    return DocumentType.PAPER_ID;
                }
                break;
            case -300245523:
                if (str.equals("tinReferenceDocument")) {
                    return DocumentType.TIN_REFERENCE_DOCUMENT;
                }
                break;
            case -200533954:
                if (str.equals("dutchDriversLicense")) {
                    return DocumentType.DUTCH_DRIVERS_LICENSE;
                }
                break;
            case 1171779265:
                if (str.equals("residencePermit")) {
                    return DocumentType.RESIDENCE_PERMIT;
                }
                break;
            case 1216777234:
                if (str.equals("passport")) {
                    return DocumentType.PASSPORT;
                }
                break;
        }
        KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
        throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
    }

    private final EmploymentStatus toEmploymentStatus(String str) throws JSONException {
        int iHashCode = str.hashCode();
        if (iHashCode != -1606087143) {
            if (iHashCode != -1575269306) {
                if (iHashCode == 1193469613 && str.equals("employed")) {
                    return EmploymentStatus.EMPLOYED;
                }
            } else if (str.equals("unemployed")) {
                return EmploymentStatus.UNEMPLOYED;
            }
        } else if (str.equals("selfEmployed")) {
            return EmploymentStatus.SELF_EMPLOYED;
        }
        KycJsonError kycJsonError = KycJsonError.INCORRECT_PROFESSION_CONFIGURATION;
        throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
    }

    private final Gender toGender(String str) throws JSONException {
        int iHashCode = str.hashCode();
        if (iHashCode != -1278174388) {
            if (iHashCode != -284840886) {
                if (iHashCode == 3343885 && str.equals("male")) {
                    return Gender.MALE;
                }
            } else if (str.equals("unknown")) {
                return Gender.UNKNOWN;
            }
        } else if (str.equals("female")) {
            return Gender.FEMALE;
        }
        KycJsonError kycJsonError = KycJsonError.INCORRECT_PERSON_CONFIGURATION;
        throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
    }

    private final List<Attachment.Document> toImages(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            s.j(jSONObject, "getJSONObject(...)");
            arrayList.add(toAttachmentDocument(jSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Industry toIndustry(String str) throws JSONException {
        switch (str.hashCode()) {
            case -2072738007:
                if (str.equals("publicAdministrationDefence")) {
                    return Industry.PUBLIC_ADMINISTRATION_DEFENCE;
                }
                break;
            case -2020060662:
                if (str.equals("informationCommunication")) {
                    return Industry.INFORMATION_COMMUNICATION;
                }
                break;
            case -1995960111:
                if (str.equals("construction")) {
                    return Industry.CONSTRUCTION;
                }
                break;
            case -1839103150:
                if (str.equals("otherServiceActivities")) {
                    return Industry.OTHER_SERVICE_ACTIVITIES;
                }
                break;
            case -1594681259:
                if (str.equals("agricultureForestryFishing")) {
                    return Industry.AGRICULTURE_FORESTRY_FISHING;
                }
                break;
            case -1129815816:
                if (str.equals("electricityGasSteamAirConditioningSupply")) {
                    return Industry.ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY;
                }
                break;
            case -977333614:
                if (str.equals("accommodationFoodServiceActivities")) {
                    return Industry.ACCOMMODATION_FOOD_SERVICE_ACTIVITIES;
                }
                break;
            case -920230594:
                if (str.equals("manufacturing")) {
                    return Industry.MANUFACTURING;
                }
                break;
            case -622377449:
                if (str.equals("realEstateActivities")) {
                    return Industry.REAL_ESTATE_ACTIVITIES;
                }
                break;
            case -554778517:
                if (str.equals("activitiesOfHouseholdAsEmployers")) {
                    return Industry.ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS;
                }
                break;
            case -290756696:
                if (str.equals("education")) {
                    return Industry.EDUCATION;
                }
                break;
            case 104037782:
                if (str.equals("miningQuarrying")) {
                    return Industry.MINING_QUARRYING;
                }
                break;
            case 332000486:
                if (str.equals("waterSupply")) {
                    return Industry.WATER_SUPPLY;
                }
                break;
            case 430076714:
                if (str.equals("artsEntertainmentRecreation")) {
                    return Industry.ARTS_ENTERTAINMENT_RECREATION;
                }
                break;
            case 587110595:
                if (str.equals("wholesaleRetailTrade")) {
                    return Industry.WHOLESALE_RETAIL_TRADE;
                }
                break;
            case 709532446:
                if (str.equals("financialInsuranceActivities")) {
                    return Industry.FINANCIAL_INSURANCE_ACTIVITIES;
                }
                break;
            case 775599041:
                if (str.equals("administrativeSupportServiceActivities")) {
                    return Industry.ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES;
                }
                break;
            case 1030411119:
                if (str.equals("transportationStorage")) {
                    return Industry.TRANSPORTATION_STORAGE;
                }
                break;
            case 1068935808:
                if (str.equals("activitiesOfExtraterritorialOrganizationsAndBodies")) {
                    return Industry.ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES;
                }
                break;
            case 1426783796:
                if (str.equals("humanHealthSocialWorkActivities")) {
                    return Industry.HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES;
                }
                break;
            case 1447154522:
                if (str.equals("professionalScientificTechnicalActivities")) {
                    return Industry.PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES;
                }
                break;
        }
        KycJsonError kycJsonError = KycJsonError.INCORRECT_PROFESSION_CONFIGURATION;
        throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
    }

    private final Address toKycAddress(JSONObject jSONObject) throws JSONException {
        try {
            return new Address(JSONExtensionsKt.getAndroidOptString(jSONObject, "street"), JSONExtensionsKt.getOptInt(jSONObject, "streetNumber"), JSONExtensionsKt.getAndroidOptString(jSONObject, "streetNumberSuffix"), JSONExtensionsKt.getAndroidOptString(jSONObject, "postalCode"), JSONExtensionsKt.getAndroidOptString(jSONObject, "city"), JSONExtensionsKt.getAndroidOptString(jSONObject, "countryCode"), JSONExtensionsKt.getAndroidOptString(jSONObject, "region"));
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_ADDRESS_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Attachment.Nfc toKycAttachmentNfc(JSONObject jSONObject) throws JSONException {
        Map<Integer, byte[]> mapI;
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "image");
            Bitmap bitmap = androidOptString != null ? toBitmap(new File(new URI(androidOptString))) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "timestamp");
            Long lValueOf = androidOptString2 != null ? Long.valueOf(DateFormat.ISO8601.fromDateFormat(androidOptString2).getTime()) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("location");
            Coordinate location = jSONObjectOptJSONObject != null ? toLocation(jSONObjectOptJSONObject) : null;
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, "mrz");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dataGroups");
            if (jSONArrayOptJSONArray == null || (mapI = toNfcDataGroups(jSONArrayOptJSONArray)) == null) {
                mapI = v0.i();
            }
            return new Attachment.Nfc(bitmap, androidOptString3, lValueOf, location, mapI);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Attachment.Selfie toKycAttachmentSelfie(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "image");
            Bitmap bitmap = androidOptString != null ? toBitmap(new File(new URI(androidOptString))) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "timestamp");
            Long lValueOf = androidOptString2 != null ? Long.valueOf(DateFormat.ISO8601.fromDateFormat(androidOptString2).getTime()) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("location");
            Coordinate location = jSONObjectOptJSONObject != null ? toLocation(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoRecording");
            return new Attachment.Selfie(bitmap, lValueOf, location, jSONObjectOptJSONObject2 != null ? toVideoRecording(jSONObjectOptJSONObject2) : null, null, 16, null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_SELFIE_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Contacts toKycContacts(JSONObject jSONObject) throws JSONException {
        try {
            return new Contacts(JSONExtensionsKt.getAndroidOptString(jSONObject, Scopes.EMAIL), JSONExtensionsKt.getAndroidOptString(jSONObject, "phone"), JSONExtensionsKt.getAndroidOptString(jSONObject, "mobile"));
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_CONTACTS_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final DeviceMetadata toKycDeviceMetadata(JSONObject jSONObject) throws JSONException {
        try {
            return new DeviceMetadata(JSONExtensionsKt.getAndroidOptString(jSONObject, "ipAddress"), getLocation(jSONObject), null, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DEVICE_METADATA_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Document toKycDocument(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "type");
            DocumentType documentType = androidOptString != null ? toDocumentType(androidOptString) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, InquiryField.FloatField.TYPE2);
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, "issueDate");
            Date dateFromDateFormat = androidOptString3 != null ? DateFormat.SHORT.fromDateFormat(androidOptString3) : null;
            String androidOptString4 = JSONExtensionsKt.getAndroidOptString(jSONObject, "expirationDate");
            Date dateFromDateFormat2 = androidOptString4 != null ? DateFormat.SHORT.fromDateFormat(androidOptString4) : null;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
            List<Attachment.Document> images = jSONArrayOptJSONArray != null ? toImages(jSONArrayOptJSONArray) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("nfc");
            Attachment.Nfc kycAttachmentNfc = jSONObjectOptJSONObject != null ? toKycAttachmentNfc(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoRecording");
            return new Document(documentType, androidOptString2, dateFromDateFormat, dateFromDateFormat2, images, kycAttachmentNfc, jSONObjectOptJSONObject2 != null ? toVideoRecording(jSONObjectOptJSONObject2) : null, null, 128, null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    private final KycInfo toKycInfo(JSONObject jSONObject) throws JSONException {
        List listM;
        Provider provider;
        DeviceMetadata deviceMetadata;
        DeviceMetadata kycDeviceMetadata;
        JSONArray jSONArrayOptJSONArray;
        List<QesAttachment> listM2;
        Contacts kycContacts;
        Person kycPerson;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("secondaryDocuments");
        if (jSONArrayOptJSONArray2 != null) {
            listM = new ArrayList();
            int length = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i11);
                s.j(jSONObject2, "getJSONObject(...)");
                listM.add(toKycSecondaryDocument(jSONObject2));
            }
        } else {
            listM = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("provider");
        if (jSONObjectOptJSONObject == null || (provider = toKycProvider(jSONObjectOptJSONObject)) == null) {
            provider = new Provider(null, null, 3, null);
        }
        Provider provider2 = provider;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("person");
        Person person = (jSONObjectOptJSONObject2 == null || (kycPerson = toKycPerson(jSONObjectOptJSONObject2)) == null) ? new Person(null, null, null, null, null, null, null, null, 255, null) : kycPerson;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(PlaceTypes.ADDRESS);
        Address kycAddress = jSONObjectOptJSONObject3 != null ? toKycAddress(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("contacts");
        Contacts contacts = (jSONObjectOptJSONObject4 == null || (kycContacts = toKycContacts(jSONObjectOptJSONObject4)) == null) ? new Contacts(null, null, null, 7, null) : kycContacts;
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("profession");
        Profession kycProfession = jSONObjectOptJSONObject5 != null ? toKycProfession(jSONObjectOptJSONObject5) : null;
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("selfie");
        Attachment.Selfie kycAttachmentSelfie = jSONObjectOptJSONObject6 != null ? toKycAttachmentSelfie(jSONObjectOptJSONObject6) : null;
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("document");
        Document kycDocument = jSONObjectOptJSONObject7 != null ? toKycDocument(jSONObjectOptJSONObject7) : null;
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("taxInfo");
        TaxInfo taxInfo = jSONObjectOptJSONObject8 != null ? toTaxInfo(jSONObjectOptJSONObject8) : null;
        if (!this.requiresMetaData) {
            JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject(OrcaKeys.METADATA);
            if (jSONObjectOptJSONObject9 == null || (kycDeviceMetadata = toKycDeviceMetadata(jSONObjectOptJSONObject9)) == null) {
                deviceMetadata = new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null);
            }
            jSONArrayOptJSONArray = jSONObject.optJSONArray("documentsToSign");
            if (jSONArrayOptJSONArray != null || (listM2 = toKycQesAttachments(jSONArrayOptJSONArray)) == null) {
                listM2 = v.m();
            }
            return new KycInfo(provider2, person, kycAddress, contacts, kycProfession, kycAttachmentSelfie, kycDocument, list, deviceMetadata, listM2, taxInfo);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(OrcaKeys.METADATA);
        s.j(jSONObject3, "getJSONObject(...)");
        kycDeviceMetadata = toKycDeviceMetadata(jSONObject3);
        deviceMetadata = kycDeviceMetadata;
        jSONArrayOptJSONArray = jSONObject.optJSONArray("documentsToSign");
        if (jSONArrayOptJSONArray != null) {
            listM2 = v.m();
        } else {
            listM2 = v.m();
        }
        return new KycInfo(provider2, person, kycAddress, contacts, kycProfession, kycAttachmentSelfie, kycDocument, list, deviceMetadata, listM2, taxInfo);
    }

    private final Person toKycPerson(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, EContextPaymentMethod.FIRST_NAME);
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "middleName");
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, EContextPaymentMethod.LAST_NAME);
            String androidOptString4 = JSONExtensionsKt.getAndroidOptString(jSONObject, "gender");
            Gender gender = androidOptString4 != null ? toGender(androidOptString4) : null;
            String androidOptString5 = JSONExtensionsKt.getAndroidOptString(jSONObject, "nationalityCode");
            String androidOptString6 = JSONExtensionsKt.getAndroidOptString(jSONObject, "birthCountryCode");
            String androidOptString7 = JSONExtensionsKt.getAndroidOptString(jSONObject, "birthPlace");
            String androidOptString8 = JSONExtensionsKt.getAndroidOptString(jSONObject, "birthDate");
            return new Person(androidOptString, androidOptString2, androidOptString3, gender, androidOptString5, androidOptString6, androidOptString7, androidOptString8 != null ? DateFormat.SHORT.fromDateFormat(androidOptString8) : null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_PERSON_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Profession toKycProfession(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "employment");
            EmploymentStatus employmentStatus = androidOptString != null ? toEmploymentStatus(androidOptString) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "profession");
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, "industry");
            return new Profession(employmentStatus, androidOptString2, androidOptString3 != null ? toIndustry(androidOptString3) : null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_PROFESSION_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Provider toKycProvider(JSONObject jSONObject) throws JSONException {
        try {
            return new Provider(JSONExtensionsKt.getAndroidOptString(jSONObject, "name"), JSONExtensionsKt.getAndroidOptString(jSONObject, "clientNumber"));
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_PROVIDER_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final QesAttachment toKycQesAttachment(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "id");
            UUID uuidFromString = androidOptString != null ? UUID.fromString(androidOptString) : null;
            s.h(uuidFromString);
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "fileUrl");
            URI uriCreate = androidOptString2 != null ? URI.create(androidOptString2) : null;
            s.h(uriCreate);
            return new QesAttachment(uuidFromString, uriCreate);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENTS_TO_SIGN_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final List<QesAttachment> toKycQesAttachments(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            s.j(jSONObject, "getJSONObject(...)");
            arrayList.add(toKycQesAttachment(jSONObject));
        }
        return arrayList;
    }

    private final SecondaryDocument toKycSecondaryDocument(JSONObject jSONObject) throws JSONException {
        try {
            String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "type");
            DocumentType documentType = androidOptString != null ? toDocumentType(androidOptString) : null;
            String androidOptString2 = JSONExtensionsKt.getAndroidOptString(jSONObject, "issueDate");
            Date dateFromDateFormat = androidOptString2 != null ? DateFormat.SHORT.fromDateFormat(androidOptString2) : null;
            String androidOptString3 = JSONExtensionsKt.getAndroidOptString(jSONObject, "expirationDate");
            Date dateFromDateFormat2 = androidOptString3 != null ? DateFormat.SHORT.fromDateFormat(androidOptString3) : null;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
            return new SecondaryDocument(documentType, dateFromDateFormat, dateFromDateFormat2, jSONArrayOptJSONArray != null ? toImages(jSONArrayOptJSONArray) : null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_SECONDARY_DOCUMENT_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final Attachment.LocalFileAttachment toLocalFileAttachment(JSONObject jSONObject) {
        String androidOptString = JSONExtensionsKt.getAndroidOptString(jSONObject, "filePath");
        if (androidOptString == null) {
            throw new IllegalStateException("Could not create valid URI from 'filePath'");
        }
        URI uri = new URI(androidOptString);
        if (s.f(JSONExtensionsKt.getAndroidOptString(jSONObject, "mimeType"), "application/pdf")) {
            return new Attachment.LocalFileAttachment(uri, Attachment.LocalFileAttachment.MimeType.PDF);
        }
        throw new IllegalStateException("'mimeType' not supported");
    }

    private final Coordinate toLocation(JSONObject jSONObject) {
        Double optDouble = JSONExtensionsKt.getOptDouble(jSONObject, OrcaKeys.LATITUDE);
        Double optDouble2 = JSONExtensionsKt.getOptDouble(jSONObject, OrcaKeys.LONGITUDE);
        if (optDouble == null || optDouble2 == null) {
            return null;
        }
        return new Coordinate(optDouble.doubleValue(), optDouble2.doubleValue());
    }

    private final Map<Integer, byte[]> toNfcDataGroups(JSONArray jSONArray) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Integer numValueOf = Integer.valueOf(jSONObject.getInt("groupNumber"));
            String string = jSONObject.getString("data");
            s.j(string, "getString(...)");
            linkedHashMap.put(numValueOf, decodeHex(string));
        }
        return linkedHashMap;
    }

    private final TaxInfo toTaxInfo(JSONObject jSONObject) throws JSONException {
        try {
            return new TaxInfo(JSONExtensionsKt.getAndroidOptString(jSONObject, "taxationCountryCode"), JSONExtensionsKt.getAndroidOptString(jSONObject, "taxpayerIdentificationNumber"));
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_TAX_INFO_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    private final VideoRecording toVideoRecording(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("duration");
            s.j(string, "getString(...)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            VideoDuration videoDuration = s.f(upperCase, "EXTENDED") ? VideoDuration.EXTENDED.INSTANCE : VideoDuration.DEFAULT.INSTANCE;
            URI uri = new URI(jSONObject.getString(ImagesContract.URL));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("location");
            return new VideoRecording(uri, videoDuration, jSONObjectOptJSONObject != null ? toLocation(jSONObjectOptJSONObject) : null);
        } catch (Throwable unused) {
            KycJsonError kycJsonError = KycJsonError.INCORRECT_DOCUMENT_CONFIGURATION;
            throw new JSONException(FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString());
        }
    }

    public final KycInfo deserialize(String kycInfoString) throws JSONException {
        s.k(kycInfoString, "kycInfoString");
        try {
            return deserialize(new JSONObject(t.n(kycInfoString)));
        } catch (Exception unused) {
            KycJsonError kycJsonError = KycJsonError.JSON_PARSE_ERROR;
            String string = FourthlineOutputProcessor.INSTANCE.toFailJson(kycJsonError.getErrorCode(), kycJsonError.getErrorDescription()).toString();
            s.j(string, "with(...)");
            throw new JSONException(string);
        }
    }

    public /* synthetic */ KycInfoDeserializer(boolean z11, BitmapDeserializer bitmapDeserializer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? new BitmapDeserializer() : bitmapDeserializer);
    }

    public final KycInfo deserialize(JSONObject kycInfoJson) {
        s.k(kycInfoJson, "kycInfoJson");
        return toKycInfo(kycInfoJson);
    }
}
