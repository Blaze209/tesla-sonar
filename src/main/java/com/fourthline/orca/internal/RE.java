package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f27613a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f27613a = simpleDateFormat;
    }

    public static final CountryNetworkModel a(SupportedDocumentsResponse supportedDocumentsResponse) {
        p013kotlin.jvm.internal.s.k(supportedDocumentsResponse, "<this>");
        String issuingCountry = supportedDocumentsResponse.getIssuingCountry();
        List idDocuments = supportedDocumentsResponse.getIdDocuments();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(idDocuments, 10));
        Iterator it = idDocuments.iterator();
        while (it.hasNext()) {
            arrayList.add(a((IdDocument) it.next(), supportedDocumentsResponse.getIssuingCountry()));
        }
        return new CountryNetworkModel(issuingCountry, arrayList);
    }

    public static final CountryNetworkModel.Document a(IdDocument idDocument, String countryCode) throws JSONException {
        p013kotlin.jvm.internal.s.k(idDocument, "<this>");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        DocumentType documentType = CountryNetworkModelKt.toDocumentType(idDocument.getType(), countryCode);
        List nationalities = idDocument.getNationalities();
        String nfcIssueDate = idDocument.getNfcIssueDate();
        return new CountryNetworkModel.Document(documentType, nationalities, nfcIssueDate != null ? f27613a.parse(nfcIssueDate) : null, Integer.valueOf(idDocument.getValidityPeriod()));
    }
}
