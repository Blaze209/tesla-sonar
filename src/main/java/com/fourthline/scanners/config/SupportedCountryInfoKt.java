package com.fourthline.scanners.config;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"toCountryNetworkModel", "Lcom/fourthline/core/CountryNetworkModel;", "Lcom/fourthline/scanners/config/SupportedCountryInfo;", "toDocumentType", "Lcom/fourthline/core/DocumentType;", "", "countryCode", "toDate", "Ljava/util/Date;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SupportedCountryInfoKt {
    public static final CountryNetworkModel toCountryNetworkModel(SupportedCountryInfo supportedCountryInfo) throws JSONException {
        s.k(supportedCountryInfo, "<this>");
        String issuingCountry = supportedCountryInfo.getIssuingCountry();
        List<IdDocument> idDocument = supportedCountryInfo.getIdDocument();
        ArrayList arrayList = new ArrayList(v.y(idDocument, 10));
        for (IdDocument idDocument2 : idDocument) {
            DocumentType documentType = toDocumentType(idDocument2.getType(), supportedCountryInfo.getIssuingCountry());
            List<String> nationalities = idDocument2.getNationalities();
            String nfcIssueDate = idDocument2.getNfcIssueDate();
            arrayList.add(new CountryNetworkModel.Document(documentType, nationalities, nfcIssueDate != null ? toDate(nfcIssueDate) : null, idDocument2.getValidityPeriod()));
        }
        return new CountryNetworkModel(issuingCountry, arrayList);
    }

    private static final Date toDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r1.equals("Paper ID") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r1.equals("PaperID") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        return com.fourthline.core.DocumentType.PAPER_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r1.equals("Residence Permit") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1.equals("DrivingLicense") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r1.equals("ResidencePermit") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        return com.fourthline.core.DocumentType.RESIDENCE_PERMIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r1.equals("Driving License") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (p013kotlin.jvm.internal.s.f(r2, "NLD") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return com.fourthline.core.DocumentType.DUTCH_DRIVERS_LICENSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        return com.fourthline.core.DocumentType.DRIVERS_LICENSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (r1.equals("National ID Card") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if (r1.equals("NationalIDCard") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (p013kotlin.jvm.internal.s.f(r2, "FRA") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        return com.fourthline.core.DocumentType.FRENCH_ID_CARD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        return com.fourthline.core.DocumentType.ID_CARD;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.fourthline.core.DocumentType toDocumentType(java.lang.String r1, java.lang.String r2) throws org.json.JSONException {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1901603043: goto L64;
                case -410451257: goto L5b;
                case -320916312: goto L45;
                case 174761633: goto L3a;
                case 517140122: goto L31;
                case 859074229: goto L28;
                case 869433223: goto L1d;
                case 1182586959: goto L14;
                case 1281421362: goto L9;
                default: goto L7;
            }
        L7:
            goto L7a
        L9:
            java.lang.String r2 = "Passport"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.PASSPORT
            return r1
        L14:
            java.lang.String r2 = "Paper ID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            goto L25
        L1d:
            java.lang.String r2 = "PaperID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
        L25:
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.PAPER_ID
            return r1
        L28:
            java.lang.String r2 = "Residence Permit"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            goto L42
        L31:
            java.lang.String r0 = "DrivingLicense"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7a
            goto L4d
        L3a:
            java.lang.String r2 = "ResidencePermit"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
        L42:
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.RESIDENCE_PERMIT
            return r1
        L45:
            java.lang.String r0 = "Driving License"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7a
        L4d:
            java.lang.String r1 = "NLD"
            boolean r1 = p013kotlin.jvm.internal.s.f(r2, r1)
            if (r1 == 0) goto L58
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.DUTCH_DRIVERS_LICENSE
            return r1
        L58:
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.DRIVERS_LICENSE
            return r1
        L5b:
            java.lang.String r0 = "National ID Card"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7a
            goto L6c
        L64:
            java.lang.String r0 = "NationalIDCard"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7a
        L6c:
            java.lang.String r1 = "FRA"
            boolean r1 = p013kotlin.jvm.internal.s.f(r2, r1)
            if (r1 == 0) goto L77
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.FRENCH_ID_CARD
            return r1
        L77:
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.ID_CARD
            return r1
        L7a:
            org.json.JSONException r1 = new org.json.JSONException
            java.lang.String r2 = "Cannot parse IDS document type"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.scanners.config.SupportedCountryInfoKt.toDocumentType(java.lang.String, java.lang.String):com.fourthline.core.DocumentType");
    }
}
