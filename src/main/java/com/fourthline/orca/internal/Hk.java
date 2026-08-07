package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Calendar;
import java.util.Date;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Hk implements Dy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26119b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26120c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Calendar f26121d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A7 f26122a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 7, 30, 0, 0);
        p013kotlin.jvm.internal.s.j(calendar, "apply(...)");
        f26121d = calendar;
    }

    public Hk(A7 document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        this.f26122a = document;
    }

    @Override // com.fourthline.orca.internal.Dy
    public boolean a(G5 g11, MA taxationCountry, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        Date dateB = this.f26122a.b();
        if (dateB == null) {
            return false;
        }
        if (documentType != DocumentType.PASSPORT) {
            return true;
        }
        if (p013kotlin.jvm.internal.s.f(g11 != null ? g11.c() : null, taxationCountry.d())) {
            return dateB.before(f26121d.getTime());
        }
        return true;
    }
}
