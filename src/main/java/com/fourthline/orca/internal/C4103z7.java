package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.location.Coordinate;
import java.net.URI;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4103z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f37204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URI f37205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFileSide f37206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f37208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Coordinate f37209f;

    public C4103z7(Bitmap bitmap, URI uri, DocumentFileSide documentFileSide, boolean z11, Long l11, Coordinate coordinate) {
        this.f37204a = bitmap;
        this.f37205b = uri;
        this.f37206c = documentFileSide;
        this.f37207d = z11;
        this.f37208e = l11;
        this.f37209f = coordinate;
    }

    private final boolean b() {
        return this.f37206c != null;
    }

    private final boolean d() {
        return (this.f37204a != null) ^ (this.f37205b != null);
    }

    public final DocumentFileSide a() {
        return this.f37206c;
    }

    public final Bitmap c() {
        return this.f37204a;
    }

    public final Coordinate e() {
        return this.f37209f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4103z7)) {
            return false;
        }
        C4103z7 c4103z7 = (C4103z7) obj;
        return p013kotlin.jvm.internal.s.f(this.f37204a, c4103z7.f37204a) && p013kotlin.jvm.internal.s.f(this.f37205b, c4103z7.f37205b) && this.f37206c == c4103z7.f37206c && this.f37207d == c4103z7.f37207d && p013kotlin.jvm.internal.s.f(this.f37208e, c4103z7.f37208e) && p013kotlin.jvm.internal.s.f(this.f37209f, c4103z7.f37209f);
    }

    public final Long f() {
        return this.f37208e;
    }

    public final boolean g() {
        return d() && b() && AbstractC3669p3.a(this.f37208e) && AbstractC3669p3.a(this.f37209f);
    }

    public final boolean h() {
        return this.f37207d;
    }

    public int hashCode() {
        Bitmap bitmap = this.f37204a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        URI uri = this.f37205b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        DocumentFileSide documentFileSide = this.f37206c;
        int iHashCode3 = (((iHashCode2 + (documentFileSide == null ? 0 : documentFileSide.hashCode())) * 31) + Boolean.hashCode(this.f37207d)) * 31;
        Long l11 = this.f37208e;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Coordinate coordinate = this.f37209f;
        return iHashCode4 + (coordinate != null ? coordinate.hashCode() : 0);
    }

    public String toString() {
        return "DocumentAttachmentBundle(image=" + this.f37204a + ", file=" + this.f37205b + ", fileSide=" + this.f37206c + ", isAngled=" + this.f37207d + ", timestamp=" + this.f37208e + ", location=" + this.f37209f + ")";
    }

    public /* synthetic */ C4103z7(Bitmap bitmap, URI uri, DocumentFileSide documentFileSide, boolean z11, Long l11, Coordinate coordinate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : uri, (i11 & 4) != 0 ? null : documentFileSide, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : coordinate);
    }
}
