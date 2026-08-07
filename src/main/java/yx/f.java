package yx;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
abstract class f extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f125985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f125986b;

    f(Uri uri, String str) {
        if (uri == null) {
            throw new NullPointerException("Null imageUri");
        }
        this.f125985a = uri;
        this.f125986b = str;
    }

    @Override // yx.d.a
    @NonNull
    public final Uri a() {
        return this.f125985a;
    }

    @Override // yx.d.a
    public final String b() {
        return this.f125986b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            if (this.f125985a.equals(aVar.a()) && ((str = this.f125986b) != null ? str.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f125985a.hashCode() ^ 1000003;
        String str = this.f125986b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String string = this.f125985a.toString();
        int length = string.length();
        String str = this.f125986b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(str).length() + 1);
        sb2.append("Page{imageUri=");
        sb2.append(string);
        sb2.append(", originalImageHash=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
