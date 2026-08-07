package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class X7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29693e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29694f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f29695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f29697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29698d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(G5 issuingCountry, List supportedCountries) {
            Object next;
            List<CountryNetworkModel.Document> idDocuments;
            Date time;
            p013kotlin.jvm.internal.s.k(issuingCountry, "issuingCountry");
            p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
            Iterator it = supportedCountries.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(((CountryNetworkModel) next).getIssuingCountry(), issuingCountry.c()));
            CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
            if (countryNetworkModel == null || (idDocuments = countryNetworkModel.getIdDocuments()) == null) {
                return p013kotlin.collections.v.m();
            }
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(idDocuments, 10));
            for (CountryNetworkModel.Document document : idDocuments) {
                Date nfcIssueDate = document.getNfcIssueDate();
                if (nfcIssueDate != null) {
                    Integer validityPeriod = document.getValidityPeriod();
                    int iIntValue = validityPeriod != null ? validityPeriod.intValue() : 10;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(nfcIssueDate);
                    calendar.add(1, iIntValue);
                    time = calendar.getTime();
                } else {
                    time = null;
                }
                arrayList.add(new X7(document.getType(), document.getNationalities(), time, !document.getNationalities().isEmpty()));
            }
            return arrayList;
        }

        private a() {
        }
    }

    public X7(DocumentType type, List nationalities, Date date, boolean z11) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(nationalities, "nationalities");
        this.f29695a = type;
        this.f29696b = nationalities;
        this.f29697c = date;
        this.f29698d = z11;
    }

    public final X7 a(DocumentType type, List nationalities, Date date, boolean z11) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(nationalities, "nationalities");
        return new X7(type, nationalities, date, z11);
    }

    public final Date b() {
        return this.f29697c;
    }

    public final DocumentType c() {
        return this.f29695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X7)) {
            return false;
        }
        X7 x11 = (X7) obj;
        return this.f29695a == x11.f29695a && p013kotlin.jvm.internal.s.f(this.f29696b, x11.f29696b) && p013kotlin.jvm.internal.s.f(this.f29697c, x11.f29697c) && this.f29698d == x11.f29698d;
    }

    public int hashCode() {
        int iHashCode = ((this.f29695a.hashCode() * 31) + this.f29696b.hashCode()) * 31;
        Date date = this.f29697c;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + Boolean.hashCode(this.f29698d);
    }

    public String toString() {
        return "DocumentDetails(type=" + this.f29695a + ", nationalities=" + this.f29696b + ", nfcExpiryDate=" + this.f29697c + ", isSupported=" + this.f29698d + ")";
    }

    public static /* synthetic */ X7 a(X7 x11, DocumentType documentType, List list, Date date, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = x11.f29695a;
        }
        if ((i11 & 2) != 0) {
            list = x11.f29696b;
        }
        if ((i11 & 4) != 0) {
            date = x11.f29697c;
        }
        if ((i11 & 8) != 0) {
            z11 = x11.f29698d;
        }
        return x11.a(documentType, list, date, z11);
    }

    public final List a() {
        return this.f29696b;
    }
}
