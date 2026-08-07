package dp;

import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f60799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60800b;

    public a(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f60799a = new String[i11];
        this.f60800b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f60799a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append("\n");
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.f60799a;
        int i11 = this.f60800b;
        strArr[i11 % strArr.length] = str;
        this.f60800b = i11 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f60800b);
            sb2.append(" base apk paths.");
            if (this.f60800b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i11 = 0;
            while (true) {
                String[] strArr = this.f60799a;
                if (i11 < strArr.length) {
                    int i12 = (this.f60800b - i11) - 1;
                    if (i12 >= 0) {
                        String str = strArr[i12 % strArr.length];
                        sb2.append("\n");
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i11++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int c() {
        return this.f60800b;
    }
}
