package com.fourthline.nfc.internal;

import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC2819j {
    private final String a(int i11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf((byte) i11)}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return "0x" + str;
    }

    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public List b(List list) {
        Object next;
        List<Integer> listI;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof cr0.b));
        cr0.b bVar = next instanceof cr0.b ? (cr0.b) next : null;
        if (bVar == null || (listI = bVar.i()) == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listI, 10));
        for (Integer num : listI) {
            p013kotlin.jvm.internal.s.h(num);
            arrayList.add(a(num.intValue()));
        }
        return arrayList;
    }

    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public List c(List list) {
        Object next;
        List<Integer> listR;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof cr0.a));
        cr0.a aVar = next instanceof cr0.a ? (cr0.a) next : null;
        if (aVar == null || (listR = aVar.r()) == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listR, 10));
        for (Integer num : listR) {
            p013kotlin.jvm.internal.s.h(num);
            arrayList.add(a(num.intValue()));
        }
        return arrayList;
    }

    @Override // com.fourthline.nfc.internal.AbstractC2819j
    public Map a(List list) {
        Object next;
        Object next2;
        String issuingCountry;
        String strH;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof cr0.e));
        cr0.e eVar = next instanceof cr0.e ? (cr0.e) next : null;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(next2 instanceof cr0.b));
        cr0.b bVar = next2 instanceof cr0.b ? (cr0.b) next2 : null;
        MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(String.valueOf(eVar != null ? eVar.h() : null));
        MrtdMrzInfo mrtdMrzInfo = mrzInfoCreate instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfoCreate : null;
        String str = "N/A";
        if (mrtdMrzInfo == null || (issuingCountry = mrtdMrzInfo.getIssuingCountry()) == null) {
            issuingCountry = "N/A";
        }
        Pair pairA = jn0.x.a("issuing_country", issuingCountry);
        if (bVar != null && (strH = bVar.h()) != null) {
            str = strH;
        }
        return p013kotlin.collections.v0.m(pairA, jn0.x.a("issuing_date", str));
    }
}
