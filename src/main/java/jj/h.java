package jj;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h implements dj.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f83846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f83847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f83850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f83851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f83852h;

    public h(URL url) {
        this(url, i.f83854b);
    }

    private byte[] d() {
        if (this.f83851g == null) {
            this.f83851g = c().getBytes(dj.e.f60683a);
        }
        return this.f83851g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f83849e)) {
            String string = this.f83848d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) xj.k.d(this.f83847c)).toString();
            }
            this.f83849e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f83849e;
    }

    private URL g() {
        if (this.f83850f == null) {
            this.f83850f = new URL(f());
        }
        return this.f83850f;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f83848d;
        return str != null ? str : ((URL) xj.k.d(this.f83847c)).toString();
    }

    public Map<String, String> e() {
        return this.f83846b.b();
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f83846b.equals(hVar.f83846b)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // dj.e
    public int hashCode() {
        if (this.f83852h == 0) {
            int iHashCode = c().hashCode();
            this.f83852h = iHashCode;
            this.f83852h = (iHashCode * 31) + this.f83846b.hashCode();
        }
        return this.f83852h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f83854b);
    }

    public h(URL url, i iVar) {
        this.f83847c = (URL) xj.k.d(url);
        this.f83848d = null;
        this.f83846b = (i) xj.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f83847c = null;
        this.f83848d = xj.k.b(str);
        this.f83846b = (i) xj.k.d(iVar);
    }
}
