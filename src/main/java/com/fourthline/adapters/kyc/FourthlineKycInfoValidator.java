package com.fourthline.adapters.kyc;

import com.fourthline.adapters.common.FourthlineOutputProcessor;
import com.fourthline.adapters.errors.KycJsonValidationError;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DeviceMetaDataValidationError;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.kyc.Address;
import com.fourthline.kyc.AddressValidationError;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Contacts;
import com.fourthline.kyc.ContactsValidationError;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.DocumentValidationError;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.KycInfoValidationError;
import com.fourthline.kyc.NfcAttachmentValidationError;
import com.fourthline.kyc.Person;
import com.fourthline.kyc.PersonValidationError;
import com.fourthline.kyc.Provider;
import com.fourthline.kyc.ProviderValidationError;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.QesAttachmentValidationError;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.SecondaryDocumentValidationError;
import com.fourthline.kyc.SelfieAttachmentValidationError;
import com.fourthline.kyc.TaxInfo;
import com.fourthline.kyc.TaxInfoValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\fJ\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\rJ\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u000eJ\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u000fJ\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0010J\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0011J\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00140\u0007J\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0015J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0016H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/adapters/kyc/FourthlineKycInfoValidator;", "", "<init>", "()V", "validate", "", "Lcom/fourthline/adapters/errors/KycJsonValidationError;", "", "Lorg/json/JSONObject;", OrcaKeys.KEY_KYC_INFO, "Lcom/fourthline/kyc/KycInfo;", "validateAndMapErrors", "Lcom/fourthline/kyc/Provider;", "Lcom/fourthline/kyc/Person;", "Lcom/fourthline/kyc/Address;", "Lcom/fourthline/kyc/Contacts;", "Lcom/fourthline/kyc/Attachment$Selfie;", "Lcom/fourthline/kyc/Document;", "Lcom/fourthline/kyc/Attachment$Nfc;", "validateAndMapSecondaryDocumentErrors", "Lcom/fourthline/kyc/SecondaryDocument;", "Lcom/fourthline/core/DeviceMetadata;", "Lcom/fourthline/kyc/TaxInfo;", "Lcom/fourthline/kyc/QesAttachment;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineKycInfoValidator {
    public static final FourthlineKycInfoValidator INSTANCE = new FourthlineKycInfoValidator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[KycInfoValidationError.values().length];
            try {
                iArr[KycInfoValidationError.INVALID_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_PERSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_CONTACTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_SELFIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_DOCUMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_SECONDARY_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_METADATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_DOCUMENTS_TO_SIGN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_TAX_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProviderValidationError.values().length];
            try {
                iArr2[ProviderValidationError.INVALID_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ProviderValidationError.INVALID_CLIENT_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PersonValidationError.values().length];
            try {
                iArr3[PersonValidationError.INVALID_FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PersonValidationError.INVALID_LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PersonValidationError.INVALID_NATIONALITY_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PersonValidationError.INVALID_BIRTH_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PersonValidationError.INVALID_BIRTH_COUNTRY_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[PersonValidationError.INVALID_GENDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AddressValidationError.values().length];
            try {
                iArr4[AddressValidationError.INVALID_STREET.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[AddressValidationError.INVALID_STREET_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[AddressValidationError.INVALID_POSTAL_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[AddressValidationError.INVALID_CITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[AddressValidationError.INVALID_COUNTRY_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ContactsValidationError.values().length];
            try {
                iArr5[ContactsValidationError.INVALID_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ContactsValidationError.INVALID_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ContactsValidationError.INVALID_MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[SelfieAttachmentValidationError.values().length];
            try {
                iArr6[SelfieAttachmentValidationError.INVALID_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[SelfieAttachmentValidationError.INVALID_TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[SelfieAttachmentValidationError.INVALID_VIDEO_LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[SelfieAttachmentValidationError.INVALID_LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[SelfieAttachmentValidationError.INVALID_VIDEO_LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DocumentValidationError.values().length];
            try {
                iArr7[DocumentValidationError.INVALID_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_ISSUE_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_IMAGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_NFC_ATTACHMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_VIDEO_LENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[DocumentValidationError.INVALID_VIDEO_LOCATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[NfcAttachmentValidationError.values().length];
            try {
                iArr8[NfcAttachmentValidationError.INVALID_MRZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[NfcAttachmentValidationError.INVALID_TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[NfcAttachmentValidationError.INVALID_LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[SecondaryDocumentValidationError.values().length];
            try {
                iArr9[SecondaryDocumentValidationError.INVALID_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr9[SecondaryDocumentValidationError.INVALID_ISSUE_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr9[SecondaryDocumentValidationError.INVALID_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[DeviceMetaDataValidationError.values().length];
            try {
                iArr10[DeviceMetaDataValidationError.INVALID_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[TaxInfoValidationError.values().length];
            try {
                iArr11[TaxInfoValidationError.INVALID_TAXPAYER_IDENTIFICATION_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr11[TaxInfoValidationError.INVALID_TAXATION_COUNTRY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[QesAttachmentValidationError.values().length];
            try {
                iArr12[QesAttachmentValidationError.INVALID_FILE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr12[QesAttachmentValidationError.FILE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$11 = iArr12;
        }
    }

    private FourthlineKycInfoValidator() {
    }

    public final Map<KycJsonValidationError, List<JSONObject>> validate(KycInfo kycInfo) {
        Document document;
        Attachment.Nfc nfc;
        List<JSONObject> listValidateAndMapErrors;
        Pair pairA;
        List<JSONObject> listM;
        List<JSONObject> listM2;
        List<JSONObject> listM3;
        List<JSONObject> listM4;
        s.k(kycInfo, "kycInfo");
        List<KycInfoValidationError> listValidate = kycInfo.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((KycInfoValidationError) it.next()).ordinal()]) {
                case 1:
                    pairA = x.a(KycJsonValidationError.INVALID_PROVIDER_CONTAINER, INSTANCE.validateAndMapErrors(kycInfo.getProvider()));
                    break;
                case 2:
                    pairA = x.a(KycJsonValidationError.INVALID_PERSON_CONTAINER, INSTANCE.validateAndMapErrors(kycInfo.getPerson()));
                    break;
                case 3:
                    KycJsonValidationError kycJsonValidationError = KycJsonValidationError.INVALID_ADDRESS_CONTAINER;
                    Address address = kycInfo.getAddress();
                    if (address == null || (listM = INSTANCE.validateAndMapErrors(address)) == null) {
                        listM = v.m();
                    }
                    pairA = x.a(kycJsonValidationError, listM);
                    break;
                case 4:
                    pairA = x.a(KycJsonValidationError.INVALID_CONTACTS_CONTAINER, INSTANCE.validateAndMapErrors(kycInfo.getContacts()));
                    break;
                case 5:
                    KycJsonValidationError kycJsonValidationError2 = KycJsonValidationError.INVALID_SELFIE_CONTAINER;
                    Attachment.Selfie selfie = kycInfo.getSelfie();
                    if (selfie == null || (listM2 = INSTANCE.validateAndMapErrors(selfie)) == null) {
                        listM2 = v.m();
                    }
                    pairA = x.a(kycJsonValidationError2, listM2);
                    break;
                case 6:
                    KycJsonValidationError kycJsonValidationError3 = KycJsonValidationError.INVALID_DOCUMENT_CONTAINER;
                    Document document2 = kycInfo.getDocument();
                    if (document2 == null || (listM3 = INSTANCE.validateAndMapErrors(document2)) == null) {
                        listM3 = v.m();
                    }
                    pairA = x.a(kycJsonValidationError3, listM3);
                    break;
                case 7:
                    pairA = x.a(KycJsonValidationError.INVALID_SECONDARY_DOCUMENT_CONTAINER, INSTANCE.validateAndMapSecondaryDocumentErrors(kycInfo.getSecondaryDocuments()));
                    break;
                case 8:
                    pairA = x.a(KycJsonValidationError.INVALID_DEVICE_METADATA_CONTAINER, INSTANCE.validateAndMapErrors(kycInfo.getMetadata()));
                    break;
                case 9:
                    pairA = x.a(KycJsonValidationError.INVALID_DOCUMENTS_TO_SIGN_CONTAINERS, INSTANCE.validateAndMapErrors(kycInfo.getDocumentsToSign()));
                    break;
                case 10:
                    KycJsonValidationError kycJsonValidationError4 = KycJsonValidationError.INVALID_TAX_INFO_CONTAINER;
                    TaxInfo taxInfo = kycInfo.getTaxInfo();
                    if (taxInfo == null || (listM4 = INSTANCE.validateAndMapErrors(taxInfo)) == null) {
                        listM4 = v.m();
                    }
                    pairA = x.a(kycJsonValidationError4, listM4);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(pairA);
        }
        Map<KycJsonValidationError, List<JSONObject>> mapD = v0.D(v0.y(arrayList));
        if (mapD.containsKey(KycJsonValidationError.INVALID_DOCUMENT_CONTAINER) && (document = kycInfo.getDocument()) != null && (nfc = document.getNfc()) != null && (listValidateAndMapErrors = INSTANCE.validateAndMapErrors(nfc)) != null) {
            mapD.put(KycJsonValidationError.INVALID_NFC_CONTAINER, listValidateAndMapErrors);
        }
        return mapD;
    }

    public final List<JSONObject> validateAndMapErrors(Provider provider) {
        Pair pairA;
        s.k(provider, "<this>");
        List<ProviderValidationError> listValidate = provider.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[((ProviderValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidName");
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = x.a(1, "invalidClientNumber");
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapSecondaryDocumentErrors(List<SecondaryDocument> list) {
        Pair pairA;
        s.k(list, "<this>");
        List<SecondaryDocument> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List<SecondaryDocumentValidationError> listValidate = ((SecondaryDocument) it.next()).validate();
            ArrayList arrayList2 = new ArrayList(v.y(listValidate, 10));
            Iterator<T> it2 = listValidate.iterator();
            while (it2.hasNext()) {
                int i11 = WhenMappings.$EnumSwitchMapping$8[((SecondaryDocumentValidationError) it2.next()).ordinal()];
                if (i11 == 1) {
                    pairA = x.a(0, "invalidType");
                } else if (i11 == 2) {
                    pairA = x.a(1, "invalidIssueDate");
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pairA = x.a(2, "invalidImages");
                }
                arrayList2.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
            }
            arrayList.add(arrayList2);
        }
        return v.A(arrayList);
    }

    public final List<JSONObject> validateAndMapErrors(Person person) {
        Pair pairA;
        s.k(person, "<this>");
        List<PersonValidationError> listValidate = person.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$2[((PersonValidationError) it.next()).ordinal()]) {
                case 1:
                    pairA = x.a(0, "invalidFirstName");
                    break;
                case 2:
                    pairA = x.a(1, "invalidLastName");
                    break;
                case 3:
                    pairA = x.a(2, "invalidNationalityCode");
                    break;
                case 4:
                    pairA = x.a(3, "invalidBirthDate");
                    break;
                case 5:
                    pairA = x.a(4, "invalidBirthCountryCode");
                    break;
                case 6:
                    pairA = x.a(5, "invalidGender");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(Address address) {
        Pair pairA;
        s.k(address, "<this>");
        List<AddressValidationError> listValidate = address.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$3[((AddressValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidStreet");
            } else if (i11 == 2) {
                pairA = x.a(1, "invalidStreetNumber");
            } else if (i11 == 3) {
                pairA = x.a(2, "invalidPostalCode");
            } else if (i11 == 4) {
                pairA = x.a(3, "invalidCity");
            } else if (i11 == 5) {
                pairA = x.a(4, "invalidCountryCode");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(Contacts contacts) {
        Pair pairA;
        s.k(contacts, "<this>");
        List<ContactsValidationError> listValidate = contacts.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$4[((ContactsValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidEmail");
            } else if (i11 == 2) {
                pairA = x.a(1, "invalidPhone");
            } else if (i11 == 3) {
                pairA = x.a(2, "invalidMobile");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(Attachment.Selfie selfie) {
        Pair pairA;
        s.k(selfie, "<this>");
        List<SelfieAttachmentValidationError> listValidate = selfie.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$5[((SelfieAttachmentValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidImage");
            } else if (i11 == 2) {
                pairA = x.a(1, "invalidTimestamp");
            } else if (i11 == 3) {
                pairA = x.a(2, "invalidVideoLength");
            } else if (i11 == 4) {
                pairA = x.a(3, "invalidLocation");
            } else if (i11 == 5) {
                pairA = x.a(4, "invalidVideoLocation");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(Document document) {
        Pair pairA;
        s.k(document, "<this>");
        List<DocumentValidationError> listValidate = document.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$6[((DocumentValidationError) it.next()).ordinal()]) {
                case 1:
                    pairA = x.a(0, "invalidType");
                    break;
                case 2:
                    pairA = x.a(1, "invalidNumber");
                    break;
                case 3:
                    pairA = x.a(2, "invalidIssueDate");
                    break;
                case 4:
                    pairA = x.a(3, "invalidImages");
                    break;
                case 5:
                    pairA = x.a(4, "invalidNFCAttachment");
                    break;
                case 6:
                    pairA = x.a(5, "invalidVideoLength");
                    break;
                case 7:
                    pairA = x.a(6, "invalidVideoLocation");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(Attachment.Nfc nfc) {
        Pair pairA;
        s.k(nfc, "<this>");
        List<NfcAttachmentValidationError> listValidate = nfc.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$7[((NfcAttachmentValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidMrz");
            } else if (i11 == 2) {
                pairA = x.a(1, "invalidTimestamp");
            } else if (i11 == 3) {
                pairA = x.a(2, "invalidLocation");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(DeviceMetadata deviceMetadata) {
        s.k(deviceMetadata, "<this>");
        List<DeviceMetaDataValidationError> listValidate = deviceMetadata.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            if (WhenMappings.$EnumSwitchMapping$9[((DeviceMetaDataValidationError) it.next()).ordinal()] == 1) {
                Pair pairA = x.a(0, "invalidLocation");
                arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }

    private final List<JSONObject> validateAndMapErrors(TaxInfo taxInfo) {
        Pair pairA;
        List<TaxInfoValidationError> listValidate = taxInfo.validate();
        ArrayList arrayList = new ArrayList(v.y(listValidate, 10));
        Iterator<T> it = listValidate.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$10[((TaxInfoValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidTaxpayerIdentificationNumber");
            } else if (i11 == 2) {
                pairA = x.a(1, "invalidTaxationCountryCode");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList;
    }

    public final List<JSONObject> validateAndMapErrors(List<QesAttachment> list) {
        Pair pairA;
        s.k(list, "<this>");
        List<QesAttachment> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((QesAttachment) it.next()).validate());
        }
        Set setR1 = v.r1(v.A(arrayList));
        ArrayList arrayList2 = new ArrayList(v.y(setR1, 10));
        Iterator it2 = setR1.iterator();
        while (it2.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$11[((QesAttachmentValidationError) it2.next()).ordinal()];
            if (i11 == 1) {
                pairA = x.a(0, "invalidFileFormat");
            } else if (i11 == 2) {
                pairA = x.a(1, "fileNotFound");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(FourthlineOutputProcessor.INSTANCE.toFailJson(((Number) pairA.a()).intValue(), (String) pairA.b()));
        }
        return arrayList2;
    }
}
