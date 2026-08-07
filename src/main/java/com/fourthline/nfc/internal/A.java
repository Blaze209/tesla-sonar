package com.fourthline.nfc.internal;

import com.fourthline.nfc.IdlBasicInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC2819j {
    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public Map a(List list) {
        Object next;
        IdlBasicInfo idlBasicInfoB;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof C2826p));
        C2826p c2826p = next instanceof C2826p ? (C2826p) next : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c2826p != null && (idlBasicInfoB = c2826p.b()) != null) {
            linkedHashMap.put("issuing_country", idlBasicInfoB.getIssuingCountry());
            Date issueDate = idlBasicInfoB.getIssueDate();
            if (issueDate != null) {
                linkedHashMap.put("issuing_date", issueDate);
            }
            Date expirationDate = idlBasicInfoB.getExpirationDate();
            if (expirationDate != null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, expirationDate);
            }
            linkedHashMap.put("mrz_length", "3.14");
        }
        return linkedHashMap;
    }

    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public List b(List list) {
        Object next;
        IdlBasicInfo idlBasicInfoB;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof C2826p));
        C2826p c2826p = next instanceof C2826p ? (C2826p) next : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        ArrayList arrayList = new ArrayList();
        if (c2826p != null && (idlBasicInfoB = c2826p.b()) != null) {
            if (idlBasicInfoB.getDocumentNumber().length() > 0) {
                arrayList.add("DOCUMENT_NUMBER_TAG");
            }
            if (idlBasicInfoB.getExpirationDate() != null) {
                arrayList.add("EXPIRATION_DATE_TAG");
            }
            if (idlBasicInfoB.getIssuingAuthority().length() > 0) {
                arrayList.add("ISSUING_AUTHORITY_TAG");
            }
            if (idlBasicInfoB.getIssuingCountry().length() > 0) {
                arrayList.add("ISSUING_COUNTRY_TAG");
            }
            if (idlBasicInfoB.getIssueDate() != null) {
                arrayList.add("DATE_OF_ISSUE_TAG");
            }
            if (idlBasicInfoB.getBirthPlace().length() > 0) {
                arrayList.add("PLACE_OF_BIRTH_TAG");
            }
            if (idlBasicInfoB.getBirthDate() != null) {
                arrayList.add("FULL_DATE_OF_BIRTH_TAG");
            }
        }
        return arrayList;
    }

    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public List c(List list) {
        Object next;
        IdlBasicInfo idlBasicInfoB;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof C2826p));
        C2826p c2826p = next instanceof C2826p ? (C2826p) next : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        ArrayList arrayList = new ArrayList();
        if (c2826p != null && (idlBasicInfoB = c2826p.b()) != null) {
            if (idlBasicInfoB.getFirstName().length() > 0) {
                arrayList.add("FIRST_NAME_TAG");
            }
            if (idlBasicInfoB.getLastName().length() > 0) {
                arrayList.add("LAST_NAME_TAG");
            }
            if (idlBasicInfoB.getBirthPlace().length() > 0) {
                arrayList.add("PLACE_OF_BIRTH_TAG");
            }
            if (idlBasicInfoB.getBirthDate() != null) {
                arrayList.add("FULL_DATE_OF_BIRTH_TAG");
            }
        }
        return arrayList;
    }
}
