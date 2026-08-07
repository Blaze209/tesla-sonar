package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.orca.workflow.WorkflowResults;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A8 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3038aD.values().length];
            try {
                iArr[EnumC3038aD.DocumentVideo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3038aD.Document.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3038aD.NfcPicture.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3038aD.TinDocument.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3038aD.ProofOfAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Date a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    public static final Pair b(C4104z8 c4104z8) {
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        A7 a7G = c4104z8.g();
        byte[] bArrI = c4104z8.i();
        if (bArrI == null) {
            bArrI = new byte[0];
        }
        return ZC.a(a7G, bArrI);
    }

    public static final Pair c(C4104z8 c4104z8) {
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        A7 a7G = c4104z8.g();
        String strD = c4104z8.d();
        G5 g5H = c4104z8.h();
        return ZC.a(a7G, strD, g5H != null ? g5H.c() : null);
    }

    public static final Gender a(OcrData ocrData) {
        String gender = ocrData != null ? ocrData.getGender() : null;
        if (p013kotlin.jvm.internal.s.f(gender, "Male")) {
            return Gender.MALE;
        }
        return p013kotlin.jvm.internal.s.f(gender, "Female") ? Gender.FEMALE : Gender.UNKNOWN;
    }

    public static final Pair a(C4104z8 c4104z8) {
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        return ZC.b(c4104z8.g());
    }

    public static final C3347hh a(C4104z8 c4104z8, String workflowId, EnumC3038aD idvPart) {
        Pair pairA;
        p013kotlin.jvm.internal.s.k(c4104z8, "<this>");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(idvPart, "idvPart");
        int i11 = a.$EnumSwitchMapping$0[idvPart.ordinal()];
        if (i11 == 1) {
            Pair pairB = b(c4104z8);
            if (pairB != null) {
                return new C3347hh(idvPart, new C2862Ec(workflowId, (List) pairB.b()), (WorkflowResults.IDV.DocumentVideo) pairB.a());
            }
            return null;
        }
        if (i11 == 2) {
            Pair pairC = c(c4104z8);
            if (pairC == null) {
                return null;
            }
            WorkflowResults.IDV.Document document = (WorkflowResults.IDV.Document) pairC.a();
            JSONObject jSONObject = (JSONObject) pairC.b();
            String strD = c4104z8.d();
            if (strD != null) {
                p013kotlin.jvm.internal.s.h(jSONObject);
                return new C3347hh(idvPart, new C3416j8(workflowId, strD, jSONObject), document);
            }
            AbstractC3989wg.a("DocumentId is not available.");
            throw new KotlinNothingValueException();
        }
        if (i11 == 3) {
            Pair pairA2 = a(c4104z8);
            if (pairA2 != null) {
                return new C3347hh(idvPart, new Y9(workflowId, (List) pairA2.b()), (WorkflowResults.IDV.Nfc) pairA2.a());
            }
            return null;
        }
        if (i11 != 4) {
            if (i11 == 5 && (pairA = ZC.a(c4104z8.n(), DocumentType.PROOF_OF_ADDRESS)) != null) {
                return new C3347hh(idvPart, new C3614ns(workflowId, (List) pairA.b()), (WorkflowResults.IDV.SecondaryDocument) pairA.a());
            }
            return null;
        }
        Pair pairA3 = ZC.a(c4104z8.n(), DocumentType.TIN_REFERENCE_DOCUMENT);
        if (pairA3 != null) {
            return new C3347hh(idvPart, new KA(workflowId, (List) pairA3.b()), (WorkflowResults.IDV.SecondaryDocument) pairA3.a());
        }
        return null;
    }
}
