package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentType;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.IdlBasicInfo;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.PersonalDetails;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A7 f25250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kp f25251b;

    public Cm(A7 documentBundle, Kp personBundle) {
        p013kotlin.jvm.internal.s.k(documentBundle, "documentBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        this.f25250a = documentBundle;
        this.f25251b = personBundle;
    }

    public final void a(Am capabilityResult, DocumentType selectedDocumentType) {
        NfcScannerResult nfcScannerResultA;
        p013kotlin.jvm.internal.s.k(capabilityResult, "capabilityResult");
        p013kotlin.jvm.internal.s.k(selectedDocumentType, "selectedDocumentType");
        Bm bm2 = capabilityResult instanceof Bm ? (Bm) capabilityResult : null;
        if (bm2 == null || (nfcScannerResultA = bm2.a()) == null) {
            return;
        }
        a(this.f25250a, nfcScannerResultA);
        a(this.f25251b.o(), nfcScannerResultA);
    }

    private final void a(A7 a11, NfcScannerResult nfcScannerResult) {
        Bitmap bitmap = (Bitmap) nfcScannerResult.getData(NfcData.NfcDataType.PHOTO);
        MrzInfo mrzInfo = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        Long lValueOf = Long.valueOf(nfcScannerResult.getMetadata().getTimestamp().getTime());
        Coordinate location = nfcScannerResult.getMetadata().getLocation();
        List<NfcDataGroup> dataGroups = nfcScannerResult.getDataGroups();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(dataGroups, 10)), 16));
        for (NfcDataGroup nfcDataGroup : dataGroups) {
            linkedHashMap.put(Integer.valueOf(nfcDataGroup.getGroupNumber()), nfcDataGroup.getRawData());
        }
        a11.a(new Ql(bitmap, mrzInfo, lValueOf, location, linkedHashMap));
        MrzInfo mrzInfo2 = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        if (mrzInfo2 != null && (mrzInfo2 instanceof MrtdMrzInfo)) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo2;
            a11.b(mrtdMrzInfo.getDocumentNumber());
            a11.a(mrtdMrzInfo.getExpirationDate());
        }
        IdlBasicInfo idlBasicInfo = (IdlBasicInfo) nfcScannerResult.getData(NfcData.NfcDataType.IDL_BASIC_INFO);
        if (idlBasicInfo != null) {
            a11.b(idlBasicInfo.getDocumentNumber());
            a11.a(idlBasicInfo.getExpirationDate());
            a11.b(idlBasicInfo.getIssueDate());
        }
    }

    private final void a(Lp lp2, NfcScannerResult nfcScannerResult) {
        MrzInfo mrzInfo = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        if (mrzInfo != null && (mrzInfo instanceof MrtdMrzInfo)) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            String nationality = mrtdMrzInfo.getNationality();
            if (p013kotlin.jvm.internal.s.f(nationality, "D")) {
                nationality = "DEU";
            }
            lp2.d(nationality);
            lp2.b(a(mrtdMrzInfo.getFirstNames()));
            lp2.c(a(mrtdMrzInfo.getLastNames()));
            lp2.a(mrtdMrzInfo.getGender());
            lp2.a(mrtdMrzInfo.getBirthDate());
        }
        PersonalDetails personalDetails = (PersonalDetails) nfcScannerResult.getData(NfcData.NfcDataType.PERSONAL_DETAILS);
        if (personalDetails != null) {
            List<String> placeOfBirth = personalDetails.getPlaceOfBirth();
            lp2.a(placeOfBirth != null ? p013kotlin.collections.v.y0(placeOfBirth, ", ", null, null, 0, null, null, 62, null) : null);
        }
        IdlBasicInfo idlBasicInfo = (IdlBasicInfo) nfcScannerResult.getData(NfcData.NfcDataType.IDL_BASIC_INFO);
        if (idlBasicInfo != null) {
            lp2.b(idlBasicInfo.getFirstName());
            lp2.c(idlBasicInfo.getLastName());
            lp2.a(idlBasicInfo.getBirthDate());
            lp2.a(idlBasicInfo.getBirthPlace());
        }
    }

    private final String a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = ((String) next) + " " + ((String) it.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
