package th;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: th.a$a, reason: collision with other inner class name */
    public interface InterfaceC2419a {
        void a(File file);

        void a(Throwable th2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(String str, String str2, InterfaceC2419a interfaceC2419a) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                throw new IOException("Server returned HTTP " + httpURLConnection.getResponseCode());
            }
            httpURLConnection.getContentLength();
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            interfaceC2419a.a(file);
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th5;
            }
        } catch (Throwable th6) {
            interfaceC2419a.a(th6);
        }
    }
}
