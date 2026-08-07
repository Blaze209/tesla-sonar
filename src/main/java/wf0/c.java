package wf0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import xf0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f121790a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f121791b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f121792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f121793d;

    public c(d dVar, String str) {
        this.f121792c = dVar;
        this.f121793d = str;
    }

    public final int a() {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        j.b("uppay", "HttpConn.connect() +++");
        d dVar = this.f121792c;
        int i11 = 1;
        try {
            try {
                if (dVar == null) {
                    j.d("uppay", "params==null!!!");
                    return 1;
                }
                try {
                    try {
                        try {
                            try {
                                URL urlA = dVar.a();
                                if ("https".equals(urlA.getProtocol().toLowerCase())) {
                                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlA.openConnection()));
                                    httpsURLConnection.setSSLSocketFactory(new a(this.f121793d).a().getSocketFactory());
                                    httpURLConnection = httpsURLConnection;
                                } else {
                                    httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(urlA.openConnection()));
                                }
                                httpURLConnection.setRequestMethod(this.f121792c.c());
                                httpURLConnection.setReadTimeout(60000);
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setUseCaches(false);
                                HashMap mapF = this.f121792c.f();
                                if (mapF != null) {
                                    for (String str : mapF.keySet()) {
                                        httpURLConnection.setRequestProperty(str, (String) mapF.get(str));
                                    }
                                }
                                String strC = this.f121792c.c();
                                int iHashCode = strC.hashCode();
                                if (iHashCode == 70454) {
                                    strC.equals("GET");
                                } else if (iHashCode == 2461856 && strC.equals("POST")) {
                                    httpURLConnection.setDoOutput(true);
                                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                                    outputStreamWriter.write(this.f121792c.e());
                                    outputStreamWriter.flush();
                                    outputStreamWriter.close();
                                }
                                httpURLConnection.connect();
                                if (httpURLConnection.getResponseCode() == 200) {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    this.f121791b = inputStream2;
                                    if (inputStream2 != null) {
                                        this.f121790a = xf0.b.c(inputStream2, "UTF-8");
                                        i11 = 0;
                                    }
                                } else if (httpURLConnection.getResponseCode() == 401) {
                                    i11 = 8;
                                } else if (httpURLConnection.getResponseCode() == 404) {
                                    i11 = 22;
                                } else {
                                    j.d("uppay", "http status code:" + httpURLConnection.getResponseCode());
                                }
                                inputStream = this.f121791b;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                inputStream = this.f121791b;
                                if (inputStream != null) {
                                }
                            }
                        } catch (SSLHandshakeException e12) {
                            e12.printStackTrace();
                            try {
                                InputStream inputStream3 = this.f121791b;
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                            } catch (Exception unused) {
                            }
                            i11 = 4;
                        }
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        inputStream = this.f121791b;
                        if (inputStream != null) {
                        }
                    }
                } catch (IllegalStateException e14) {
                    e14.printStackTrace();
                    inputStream = this.f121791b;
                    if (inputStream != null) {
                    }
                }
                j.b("uppay", "HttpConn.connect() ---");
                return i11;
            } catch (Throwable th2) {
                try {
                    InputStream inputStream4 = this.f121791b;
                    if (inputStream4 != null) {
                        inputStream4.close();
                    }
                } catch (Exception unused2) {
                }
                throw th2;
            }
        } catch (Exception unused3) {
        }
    }

    public final String b() {
        return this.f121790a;
    }
}
