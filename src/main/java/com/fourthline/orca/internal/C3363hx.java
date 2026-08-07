package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Date;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3363hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentType f32373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f32374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f32375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f32376d;

    public C3363hx(DocumentType documentType, Date date, Date date2, List list) {
        this.f32373a = documentType;
        this.f32374b = date;
        this.f32375c = date2;
        this.f32376d = list;
    }

    private final boolean e() {
        return this.f32373a != null;
    }

    public final void a(DocumentType documentType) {
        this.f32373a = documentType;
    }

    public final List b() {
        return this.f32376d;
    }

    public final Date c() {
        return this.f32374b;
    }

    public final DocumentType d() {
        return this.f32373a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3363hx)) {
            return false;
        }
        C3363hx c3363hx = (C3363hx) obj;
        return this.f32373a == c3363hx.f32373a && p013kotlin.jvm.internal.s.f(this.f32374b, c3363hx.f32374b) && p013kotlin.jvm.internal.s.f(this.f32375c, c3363hx.f32375c) && p013kotlin.jvm.internal.s.f(this.f32376d, c3363hx.f32376d);
    }

    public final boolean f() {
        return e() && AbstractC3669p3.a(this.f32374b) && AbstractC3669p3.a(this.f32376d);
    }

    public int hashCode() {
        DocumentType documentType = this.f32373a;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        Date date = this.f32374b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f32375c;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.f32376d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SecondaryDocumentBundle(type=" + this.f32373a + ", issueDate=" + this.f32374b + ", expirationDate=" + this.f32375c + ", images=" + this.f32376d + ")";
    }

    public final Date a() {
        return this.f32375c;
    }

    public final void a(Date date) {
        this.f32375c = date;
    }

    public final void a(List list) {
        this.f32376d = list;
    }

    public /* synthetic */ C3363hx(DocumentType documentType, Date date, Date date2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentType, (i11 & 2) != 0 ? null : date, (i11 & 4) != 0 ? null : date2, (i11 & 8) != 0 ? null : list);
    }
}
