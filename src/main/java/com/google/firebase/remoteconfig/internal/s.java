package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f44727t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f44728u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<rw.c> f44729a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44731c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpURLConnection f44734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.firebase.remoteconfig.internal.b f44735g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f44737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f44738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.f f44739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zv.f f44740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f44741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f44742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f44743o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final t f44746r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f44736h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44730b = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Random f44744p = new Random();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Clock f44745q = DefaultClock.getInstance();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44732d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44733e = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f44747s = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.e();
        }
    }

    public s(com.google.firebase.f fVar, zv.f fVar2, m mVar, f fVar3, Context context, String str, Set<rw.c> set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f44729a = set;
        this.f44737i = scheduledExecutorService;
        this.f44731c = Math.max(8 - tVar.i().b(), 1);
        this.f44739k = fVar;
        this.f44738j = mVar;
        this.f44740l = fVar2;
        this.f44741m = fVar3;
        this.f44742n = context;
        this.f44743o = str;
        this.f44746r = tVar;
    }

    private void D(Date date) {
        int iB = this.f44746r.i().b() + 1;
        this.f44746r.p(iB, new Date(date.getTime() + o(iB)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task a(s sVar, Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        Throwable th2;
        InputStream inputStream;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        sVar.getClass();
        boolean z11 = true;
        try {
            if (!task.isSuccessful()) {
                throw new IOException(task.getException());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
            sVar.f44734f = httpURLConnection;
            inputStream = httpURLConnection.getInputStream();
            try {
                errorStream = sVar.f44734f.getErrorStream();
                try {
                    int responseCode = sVar.f44734f.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            try {
                                sVar.v();
                                sVar.f44746r.k();
                                com.google.firebase.remoteconfig.internal.b bVarB = sVar.B(sVar.f44734f);
                                sVar.f44735g = bVarB;
                                bVarB.h();
                            } catch (IOException e11) {
                                e = e11;
                                if (sVar.f44733e) {
                                    sVar.v();
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                sVar.i(inputStream, errorStream);
                                sVar.y(false);
                                if (sVar.f44733e || (numValueOf != 0 && !sVar.r(numValueOf.intValue()))) {
                                    z11 = false;
                                }
                                if (z11) {
                                    sVar.D(new Date(sVar.f44745q.currentTimeMillis()));
                                }
                                if (!z11 || numValueOf.intValue() == 200) {
                                    sVar.w();
                                } else {
                                    String strT = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strT = sVar.t(sVar.f44734f.getErrorStream());
                                    }
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strT, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                sVar.f44734f = null;
                                sVar.f44735g = null;
                                return Tasks.forResult(null);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            sVar.i(inputStream, errorStream);
                            sVar.y(false);
                            if (sVar.f44733e || (numValueOf != 0 && !sVar.r(numValueOf.intValue()))) {
                                z11 = false;
                            }
                            if (z11) {
                                sVar.D(new Date(sVar.f44745q.currentTimeMillis()));
                            }
                            if (z11 || numValueOf.intValue() == 200) {
                                sVar.w();
                            } else {
                                String strT2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strT2 = sVar.t(sVar.f44734f.getErrorStream());
                                }
                                sVar.u(new FirebaseRemoteConfigServerException(numValueOf.intValue(), strT2, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                            }
                            throw th2;
                        }
                    }
                    sVar.i(inputStream, errorStream);
                    sVar.y(false);
                    z11 = !sVar.f44733e && sVar.r(responseCode);
                    if (z11) {
                        sVar.D(new Date(sVar.f44745q.currentTimeMillis()));
                    }
                    if (z11 || responseCode == 200) {
                        sVar.w();
                    } else {
                        String strT3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strT3 = sVar.t(sVar.f44734f.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strT3, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                        sVar.u(firebaseRemoteConfigServerException);
                    }
                } catch (IOException e12) {
                    e = e12;
                    numValueOf = 0;
                } catch (Throwable th4) {
                    numValueOf = 0;
                    th2 = th4;
                }
            } catch (IOException e13) {
                e = e13;
                errorStream = null;
                numValueOf = errorStream;
                if (sVar.f44733e) {
                    sVar.v();
                } else {
                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                }
                sVar.i(inputStream, errorStream);
                sVar.y(false);
                if (sVar.f44733e) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (z11) {
                    sVar.D(new Date(sVar.f44745q.currentTimeMillis()));
                }
                if (z11) {
                }
                sVar.w();
                sVar.f44734f = null;
                sVar.f44735g = null;
                return Tasks.forResult(null);
            } catch (Throwable th5) {
                numValueOf = 0;
                th2 = th5;
                errorStream = null;
            }
            sVar.f44734f = null;
            sVar.f44735g = null;
            return Tasks.forResult(null);
        } catch (IOException e14) {
            e = e14;
            inputStream = null;
            errorStream = null;
        } catch (Throwable th6) {
            errorStream = null;
            numValueOf = 0;
            th2 = th6;
            inputStream = null;
        }
    }

    public static /* synthetic */ Task b(s sVar, Task task, Task task2, Task task3) {
        sVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) sVar.q().openConnection();
            sVar.A(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.f) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e11) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e11));
        }
    }

    private synchronized boolean f() {
        return (this.f44729a.isEmpty() || this.f44730b || this.f44732d || this.f44733e) ? false : true;
    }

    private synchronized boolean g() {
        boolean zF;
        zF = f();
        if (zF) {
            y(true);
        }
        return zF;
    }

    private void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e11);
            }
        }
    }

    private JSONObject k(String str) {
        HashMap map = new HashMap();
        map.put("project", m(this.f44739k.n().c()));
        map.put("namespace", this.f44743o);
        map.put("lastKnownVersionNumber", Long.toString(this.f44738j.r()));
        map.put("appId", this.f44739k.n().c());
        map.put("sdkVersion", "23.0.1");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        this.f44732d = true;
    }

    private static String m(String str) {
        Matcher matcher = f44728u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String n() {
        try {
            Context context = this.f44742n;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f44742n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f44742n.getPackageName());
            return null;
        }
    }

    private long o(int i11) {
        int[] iArr = f44727t;
        int length = iArr.length;
        if (i11 >= length) {
            i11 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i11 - 1]);
        return (millis / 2) + ((long) this.f44744p.nextInt((int) millis));
    }

    private String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m(this.f44739k.n().c()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f44743o));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean r(int i11) {
        return i11 == 408 || i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    private synchronized void s(long j11) {
        try {
            if (f()) {
                int i11 = this.f44731c;
                if (i11 > 0) {
                    this.f44731c = i11 - 1;
                    this.f44737i.schedule(new a(), j11, TimeUnit.MILLISECONDS);
                } else if (!this.f44733e) {
                    u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<rw.c> it = this.f44729a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void v() {
        this.f44731c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f44739k.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f44742n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z11) {
        this.f44730b = z11;
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.b B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f44738j, this.f44741m, this.f44729a, new b(), this.f44737i, this.f44746r);
    }

    public void C() {
        s(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (g()) {
            if (new Date(this.f44745q.currentTimeMillis()).before(this.f44746r.i().a())) {
                w();
            } else {
                final Task<HttpURLConnection> taskJ = j();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskJ}).continueWith(this.f44737i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.q
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return s.a(this.f44722a, taskJ, task);
                    }
                });
            }
        }
    }

    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f44734f;
        if (httpURLConnection != null && !this.f44733e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> j() {
        final Task<com.google.firebase.installations.f> taskA = this.f44740l.a(false);
        final Task<String> id2 = this.f44740l.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskA, id2}).continueWithTask(this.f44737i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return s.b(this.f44724a, taskA, id2, task);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0L, this.f44746r.i().a().getTime() - new Date(this.f44745q.currentTimeMillis()).getTime()));
    }

    public void z(boolean z11) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f44747s) {
            try {
                this.f44733e = z11;
                com.google.firebase.remoteconfig.internal.b bVar = this.f44735g;
                if (bVar != null) {
                    bVar.k(z11);
                }
                if (Build.VERSION.SDK_INT >= 26 && z11 && (httpURLConnection = this.f44734f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    class b implements rw.c {
        b() {
        }

        @Override // rw.c
        public void b(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
            s.this.l();
            s.this.u(firebaseRemoteConfigException);
        }

        @Override // rw.c
        public void a(@NonNull rw.b bVar) {
        }
    }
}
