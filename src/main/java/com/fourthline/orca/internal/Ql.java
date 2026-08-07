package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f27509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MrzInfo f27510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f27511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Coordinate f27512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f27513e;

    public Ql(Bitmap bitmap, MrzInfo mrzInfo, Long l11, Coordinate coordinate, Map dataGroups) {
        p013kotlin.jvm.internal.s.k(dataGroups, "dataGroups");
        this.f27509a = bitmap;
        this.f27510b = mrzInfo;
        this.f27511c = l11;
        this.f27512d = coordinate;
        this.f27513e = dataGroups;
    }

    private final boolean f() {
        String strD = d();
        if (strD != null) {
            return !p013kotlin.text.t.y0(strD);
        }
        return false;
    }

    public final Map a() {
        return this.f27513e;
    }

    public final Bitmap b() {
        return this.f27509a;
    }

    public final Coordinate c() {
        return this.f27512d;
    }

    public final String d() {
        MrzInfo mrzInfo = this.f27510b;
        if (mrzInfo != null) {
            return mrzInfo.getRawMrz();
        }
        return null;
    }

    public final MrzInfo e() {
        return this.f27510b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ql)) {
            return false;
        }
        Ql ql2 = (Ql) obj;
        return p013kotlin.jvm.internal.s.f(this.f27509a, ql2.f27509a) && p013kotlin.jvm.internal.s.f(this.f27510b, ql2.f27510b) && p013kotlin.jvm.internal.s.f(this.f27511c, ql2.f27511c) && p013kotlin.jvm.internal.s.f(this.f27512d, ql2.f27512d) && p013kotlin.jvm.internal.s.f(this.f27513e, ql2.f27513e);
    }

    public final Long g() {
        return this.f27511c;
    }

    public final boolean h() {
        return AbstractC3669p3.a(this.f27511c) && f() && AbstractC3669p3.a(this.f27512d);
    }

    public int hashCode() {
        Bitmap bitmap = this.f27509a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        MrzInfo mrzInfo = this.f27510b;
        int iHashCode2 = (iHashCode + (mrzInfo == null ? 0 : mrzInfo.hashCode())) * 31;
        Long l11 = this.f27511c;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Coordinate coordinate = this.f27512d;
        return ((iHashCode3 + (coordinate != null ? coordinate.hashCode() : 0)) * 31) + this.f27513e.hashCode();
    }

    public String toString() {
        return "NfcAttachmentBundle(image=" + this.f27509a + ", mrzInfo=" + this.f27510b + ", timestamp=" + this.f27511c + ", location=" + this.f27512d + ", dataGroups=" + this.f27513e + ")";
    }
}
