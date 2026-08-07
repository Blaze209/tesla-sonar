package com.withpersona.sdk2.inquiry.ui.network;

import com.google.android.libraries.places.api.model.PlaceTypes;
import jn0.x;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final Object a(ComponentParam componentParam) {
        s.k(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.a) {
            ComponentParam.a aVar = (ComponentParam.a) componentParam;
            return v0.m(x.a("street_1", aVar.getStreet1()), x.a("street_2", aVar.getStreet2()), x.a("city", aVar.getCity()), x.a("subdivision", aVar.getSubdivision()), x.a(PlaceTypes.POSTAL_CODE, aVar.getPostalCode()));
        }
        if (componentParam instanceof ComponentParam.d) {
            return ((ComponentParam.d) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.e) {
            return ((ComponentParam.e) componentParam).a();
        }
        if (componentParam instanceof ComponentParam.b) {
            return Boolean.valueOf(((ComponentParam.b) componentParam).getValue());
        }
        if (componentParam instanceof ComponentParam.c) {
            return ((ComponentParam.c) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.f) {
            String signatureImageString = ((ComponentParam.f) componentParam).getSignatureImageString();
            return signatureImageString == null ? "" : signatureImageString;
        }
        if (componentParam instanceof ComponentParam.g) {
            ComponentParam.g gVar = (ComponentParam.g) componentParam;
            return v0.m(x.a("caFlag", gVar.getChipAuthenticationStatus()), x.a("dg1", gVar.getDg1()), x.a("dg2", gVar.getDg2()), x.a("sod", gVar.getSod()));
        }
        if (!(componentParam instanceof ComponentParam.h)) {
            throw new NoWhenBranchMatchedException();
        }
        ComponentParam.h hVar = (ComponentParam.h) componentParam;
        return v0.m(x.a("idb_country", hVar.getCom.google.android.libraries.places.api.model.PlaceTypes.COUNTRY java.lang.String()), x.a("idb_type", hVar.getType()), x.a("idb_value", hVar.getValue()));
    }
}
