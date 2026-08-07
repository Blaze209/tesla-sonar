package f8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p7.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f64551c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f64555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f64556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f64557f;

        public a(int i11, int i12, String str, String str2, String str3, String str4) {
            this.f64552a = i11;
            this.f64553b = i12;
            this.f64554c = str;
            this.f64555d = str2;
            this.f64556e = str3;
            this.f64557f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f64552a == aVar.f64552a && this.f64553b == aVar.f64553b && TextUtils.equals(this.f64554c, aVar.f64554c) && TextUtils.equals(this.f64555d, aVar.f64555d) && TextUtils.equals(this.f64556e, aVar.f64556e) && TextUtils.equals(this.f64557f, aVar.f64557f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f64552a * 31) + this.f64553b) * 31;
            String str = this.f64554c;
            int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f64555d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f64556e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f64557f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List<a> list) {
        this.f64549a = str;
        this.f64550b = str2;
        this.f64551c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (TextUtils.equals(this.f64549a, hVar.f64549a) && TextUtils.equals(this.f64550b, hVar.f64550b) && this.f64551c.equals(hVar.f64551c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f64549a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64550b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f64551c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f64549a != null) {
            str = " [" + this.f64549a + ", " + this.f64550b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
