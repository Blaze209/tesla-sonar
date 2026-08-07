package com.fourthline.kyc.internal;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.kyc.KycInfoValidationError;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[KycInfoValidationError.INVALID_CONTACTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_ADDRESS.ordinal()] = 4;
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
                iArr[KycInfoValidationError.INVALID_DOCUMENTS_TO_SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_SECONDARY_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_METADATA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_TAX_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String a(KycInfoValidationError kycInfoValidationError) {
        switch (a.$EnumSwitchMapping$0[kycInfoValidationError.ordinal()]) {
            case 1:
                return "provider";
            case 2:
                return "person";
            case 3:
                return "contacts";
            case 4:
                return PlaceTypes.ADDRESS;
            case 5:
                return "selfie";
            case 6:
                return "document";
            case 7:
                return "documents_to_sign";
            case 8:
                return "secondary_document";
            case 9:
                return OrcaKeys.METADATA;
            case 10:
                return "tax_info";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String a(Enum r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final void a(Map errors) {
        Pair pairA;
        s.k(errors, "errors");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : errors.entrySet()) {
            List list = (List) entry.getValue();
            if (list == null || !(!list.isEmpty())) {
                pairA = null;
            } else {
                String strA = a((KycInfoValidationError) entry.getKey());
                ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(a((Enum) it.next()));
                }
                pairA = x.a(strA, arrayList2);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "kyc_info_validation_errors", null, v0.m(x.a("errors", v0.y(arrayList)), x.a("isPublic", Boolean.TRUE)), 2, null);
    }
}
