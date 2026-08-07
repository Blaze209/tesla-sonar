package yx;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
abstract class g extends d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f125987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125988b;

    g(Uri uri, int i11) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f125987a = uri;
        this.f125988b = i11;
    }

    @Override // yx.d.b
    public final int a() {
        return this.f125988b;
    }

    @Override // yx.d.b
    @NonNull
    public final Uri b() {
        return this.f125987a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.b) {
            d.b bVar = (d.b) obj;
            if (this.f125987a.equals(bVar.b()) && this.f125988b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f125987a.hashCode() ^ 1000003) * 1000003) ^ this.f125988b;
    }

    public final String toString() {
        String string = this.f125987a.toString();
        int length = string.length();
        int i11 = this.f125988b;
        StringBuilder sb2 = new StringBuilder(length + 20 + String.valueOf(i11).length() + 1);
        sb2.append("Pdf{uri=");
        sb2.append(string);
        sb2.append(", pageCount=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
