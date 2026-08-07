package com.fourthline.nfc;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcr0/a;", "Lcom/fourthline/nfc/PersonalDetails;", "getPersonalDetails", "(Lcr0/a;)Lcom/fourthline/nfc/PersonalDetails;", "personalDetails", "fourthline-nfc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PersonalDetailsKt {
    public static final PersonalDetails getPersonalDetails(cr0.a aVar) {
        s.k(aVar, "<this>");
        return new PersonalDetails(aVar.j(), aVar.k(), aVar.n(), aVar.i(), aVar.p(), aVar.m(), aVar.s(), aVar.q(), aVar.t(), aVar.o(), aVar.l(), aVar.h());
    }
}
