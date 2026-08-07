package r5;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f106998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f106999e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f107000f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f106995a = (String) u5.h.g(str);
        this.f106996b = (String) u5.h.g(str2);
        this.f106997c = (String) u5.h.g(str3);
        this.f106998d = (List) u5.h.g(list);
        this.f107000f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f106998d;
    }

    public int c() {
        return this.f106999e;
    }

    String d() {
        return this.f107000f;
    }

    public String e() {
        return this.f106995a;
    }

    public String f() {
        return this.f106996b;
    }

    public String g() {
        return this.f106997c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f106995a + ", mProviderPackage: " + this.f106996b + ", mQuery: " + this.f106997c + ", mCertificates:");
        for (int i11 = 0; i11 < this.f106998d.size(); i11++) {
            sb2.append(" [");
            List<byte[]> list = this.f106998d.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f106999e);
        return sb2.toString();
    }
}
