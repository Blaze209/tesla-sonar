package wf0;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f121785a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f121786b;

    public a(String str) {
        this.f121786b = str;
    }

    private static SSLContext b(String str) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new b(str)}, null);
            return sSLContext;
        } catch (Exception e11) {
            throw new IOException(e11.getMessage());
        }
    }

    public final SSLContext a() {
        if (this.f121785a == null) {
            this.f121785a = b(this.f121786b);
        }
        return this.f121785a;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(a.class);
    }

    public int hashCode() {
        return a.class.hashCode();
    }
}
