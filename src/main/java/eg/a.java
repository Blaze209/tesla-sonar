package eg;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final HttpURLConnection f62924a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f62924a = httpURLConnection;
    }

    private String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f62924a.disconnect();
    }

    @Override // eg.d
    public String g1() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f62924a.getURL() + ". Failed with " + this.f62924a.getResponseCode() + "\n" + c(this.f62924a);
        } catch (IOException e11) {
            hg.e.d("get error failed ", e11);
            return e11.getMessage();
        }
    }

    @Override // eg.d
    public boolean isSuccessful() {
        try {
            return this.f62924a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // eg.d
    public String k2() {
        return this.f62924a.getContentType();
    }

    @Override // eg.d
    @NonNull
    public InputStream p2() {
        return this.f62924a.getInputStream();
    }
}
