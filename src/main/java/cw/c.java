package cw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import wv.i;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f59215d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f59216e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv.b<i> f59218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f59219c = new e();

    public c(@NonNull Context context, @NonNull yv.b<i> bVar) {
        this.f59217a = context;
        this.f59218b = bVar;
    }

    private static String a(String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            return jSONObject;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private String g() {
        try {
            Context context = this.f59217a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f59217a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("ContentValues", "No such package: " + this.f59217a.getPackageName(), e11);
            return null;
        }
    }

    private URL h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e11) {
            throw new FirebaseInstallationsException(e11.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    private static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void l(HttpURLConnection httpURLConnection, String str, @NonNull String str2, @NonNull String str3) {
        String strP = p(httpURLConnection);
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Log.w("Firebase-Installations", strP);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection m(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f59217a.getPackageName());
            i iVar = this.f59218b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(iVar.b()));
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                } catch (ExecutionException e12) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e12);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", g());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    static long n(String str) {
        Preconditions.checkArgument(f59215d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f59216e));
        f.a aVarA = f.a();
        d.a aVarA2 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(d.b.OK).a();
    }

    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f59216e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    private f q(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f59216e));
        f.a aVarA = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(f.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, String str, @NonNull String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public d d(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, String str5) {
        d dVarO;
        if (!this.f59219c.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL urlH = h(String.format("projects/%s/installations", str3));
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                try {
                    httpURLConnectionM.setRequestMethod("POST");
                    httpURLConnectionM.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionM.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    r(httpURLConnectionM, str2, str4);
                    int responseCode = httpURLConnectionM.getResponseCode();
                    this.f59219c.f(responseCode);
                    if (j(responseCode)) {
                        dVarO = o(httpURLConnectionM);
                    } else {
                        l(httpURLConnectionM, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            dVarO = d.a().e(d.b.BAD_CONFIG).a();
                        }
                        httpURLConnectionM.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return dVarO;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @NonNull
    public void e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        URL urlH = h(String.format("projects/%s/installations/%s", str3, str2));
        int i11 = 0;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                httpURLConnectionM.setRequestMethod("DELETE");
                httpURLConnectionM.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionM.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    l(httpURLConnectionM, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        k();
                        throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.a.BAD_CONFIG);
                    }
                    i11++;
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th2) {
                httpURLConnectionM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @NonNull
    public f f(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        f fVarQ;
        if (!this.f59219c.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL urlH = h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM = m(urlH, str);
            try {
                try {
                    httpURLConnectionM.setRequestMethod("POST");
                    httpURLConnectionM.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM.setDoOutput(true);
                    s(httpURLConnectionM);
                    int responseCode = httpURLConnectionM.getResponseCode();
                    this.f59219c.f(responseCode);
                    if (j(responseCode)) {
                        fVarQ = q(httpURLConnectionM);
                    } else {
                        l(httpURLConnectionM, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            fVarQ = f.a().b(f.b.AUTH_ERROR).a();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                k();
                                fVarQ = f.a().b(f.b.BAD_CONFIG).a();
                            }
                            httpURLConnectionM.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return fVarQ;
                } catch (Throwable th2) {
                    httpURLConnectionM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }
}
