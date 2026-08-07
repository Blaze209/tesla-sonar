package com.fourthline.adapters.common;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.adapters.extensions.DateExtensionsKt;
import com.fourthline.core.Gender;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.nfc.IdlBasicInfo;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jn0.h0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0002¨\u0006\u0016"}, d2 = {"Lcom/fourthline/adapters/common/KycMrzJsonProducer;", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "<init>", "()V", "produceMrtdMrzInfoJsonObject", "Lorg/json/JSONObject;", "mrzInfo", "Lcom/fourthline/core/mrz/MrtdMrzInfo;", "produceIdlMrzInfoJsonObject", "Lcom/fourthline/core/mrz/IdlMrzInfo;", "produceIdlBasicInfoJsonObject", "rawMrz", "", "idlBasicInfo", "Lcom/fourthline/nfc/IdlBasicInfo;", "produceIdlMrzValidationError", "Lorg/json/JSONArray;", "errors", "", "Lcom/fourthline/core/mrz/IdlMrzInfoValidationError;", "produceMrtdMrzValidationError", "Lcom/fourthline/core/mrz/MrtdMrzInfoValidationError;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KycMrzJsonProducer implements MrzJsonProducer {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IdlMrzInfoValidationError.values().length];
            try {
                iArr2[IdlMrzInfoValidationError.INVALID_DOCUMENT_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MrtdMrzInfoValidationError.values().length];
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_DOCUMENT_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_ISSUING_COUNTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_FIRST_NAMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_LAST_NAMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_BIRTH_DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_NATIONALITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_GENDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[MrtdMrzInfoValidationError.TRUNCATED_NAMES.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final JSONArray produceIdlMrzValidationError(List<? extends IdlMrzInfoValidationError> errors) {
        JSONObject failJson;
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = errors.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[((IdlMrzInfoValidationError) it.next()).ordinal()];
            if (i11 == 1) {
                failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(912, "Invalid document number.");
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(919, "Invalid total checksum.");
            }
            jSONArray.put(failJson);
        }
        return jSONArray;
    }

    private final JSONArray produceMrtdMrzValidationError(List<? extends MrtdMrzInfoValidationError> errors) {
        JSONObject failJson;
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = errors.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$2[((MrtdMrzInfoValidationError) it.next()).ordinal()]) {
                case 1:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(910, "Invalid document code.");
                    break;
                case 2:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(911, "Invalid issuing country.");
                    break;
                case 3:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(912, "Invalid document number.");
                    break;
                case 4:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(913, "Invalid expiration date.");
                    break;
                case 5:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(914, "Invalid first names.");
                    break;
                case 6:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(915, "Invalid last names.");
                    break;
                case 7:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(916, "Invalid birth date.");
                    break;
                case 8:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(917, "Invalid nationality.");
                    break;
                case 9:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(918, "Invalid gender.");
                    break;
                case 10:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(919, "Invalid total checksum.");
                    break;
                case 11:
                    failJson = FourthlineOutputProcessor.INSTANCE.toFailJson(920, "Truncated names.");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            jSONArray.put(failJson);
        }
        return jSONArray;
    }

    @Override // com.fourthline.adapters.common.MrzJsonProducer
    public JSONObject produceIdlBasicInfoJsonObject(String rawMrz, IdlBasicInfo idlBasicInfo) throws JSONException {
        s.k(idlBasicInfo, "idlBasicInfo");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rawMrz", rawMrz);
        jSONObject.put(WorkflowKeys.ISSUING_COUNTRY, idlBasicInfo.getIssuingCountry());
        jSONObject.put("issuingAuthority", idlBasicInfo.getIssuingAuthority());
        jSONObject.put("documentNumber", idlBasicInfo.getDocumentNumber());
        Date issueDate = idlBasicInfo.getIssueDate();
        if (issueDate != null) {
            jSONObject.put("issueDate", DateExtensionsKt.toShortString(issueDate));
        }
        Date expirationDate = idlBasicInfo.getExpirationDate();
        if (expirationDate != null) {
            jSONObject.put("expirationDate", DateExtensionsKt.toShortString(expirationDate));
        }
        jSONObject.put(EContextPaymentMethod.FIRST_NAME, idlBasicInfo.getFirstName());
        jSONObject.put(EContextPaymentMethod.LAST_NAME, idlBasicInfo.getLastName());
        Date birthDate = idlBasicInfo.getBirthDate();
        if (birthDate != null) {
            jSONObject.put("birthDate", DateExtensionsKt.toShortString(birthDate));
        }
        JSONObject jSONObjectPut = jSONObject.put("birthPlace", idlBasicInfo.getBirthPlace());
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }

    @Override // com.fourthline.adapters.common.MrzJsonProducer
    public JSONObject produceIdlMrzInfoJsonObject(IdlMrzInfo mrzInfo) throws JSONException {
        s.k(mrzInfo, "mrzInfo");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rawMrz", mrzInfo.getRawMrz());
        jSONObject.put("documentNumber", mrzInfo.getDocumentNumber());
        JSONObject jSONObjectPut = jSONObject.put("validationErrors", produceIdlMrzValidationError(mrzInfo.getValidationErrors()));
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }

    @Override // com.fourthline.adapters.common.MrzJsonProducer
    public JSONObject produceMrtdMrzInfoJsonObject(MrtdMrzInfo mrzInfo) throws JSONException {
        String str;
        s.k(mrzInfo, "mrzInfo");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rawMrz", mrzInfo.getRawMrz());
        jSONObject.put("documentCode", mrzInfo.getDocumentCode());
        jSONObject.put(WorkflowKeys.ISSUING_COUNTRY, mrzInfo.getIssuingCountry());
        jSONObject.put("documentNumber", mrzInfo.getDocumentNumber());
        jSONObject.put("expirationDate", DateExtensionsKt.toShortString(mrzInfo.getExpirationDate()));
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = mrzInfo.getFirstNames().iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            jSONArray.put(upperCase);
        }
        h0 h0Var = h0.f84049a;
        jSONObject.put("firstNames", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = mrzInfo.getLastNames().iterator();
        while (it2.hasNext()) {
            String upperCase2 = ((String) it2.next()).toUpperCase(Locale.ROOT);
            s.j(upperCase2, "toUpperCase(...)");
            jSONArray2.put(upperCase2);
        }
        h0 h0Var2 = h0.f84049a;
        jSONObject.put("lastNames", jSONArray2);
        jSONObject.put("birthDate", DateExtensionsKt.toShortString(mrzInfo.getBirthDate()));
        jSONObject.put("nationality", mrzInfo.getNationality());
        int i11 = WhenMappings.$EnumSwitchMapping$0[mrzInfo.getGender().ordinal()];
        if (i11 == 1) {
            str = "male";
        } else if (i11 == 2) {
            str = "female";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "unknown";
        }
        jSONObject.put("gender", str);
        JSONObject jSONObjectPut = jSONObject.put("validationErrors", produceMrtdMrzValidationError(mrzInfo.getValidationErrors()));
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }
}
