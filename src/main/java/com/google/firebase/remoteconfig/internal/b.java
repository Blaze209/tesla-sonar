package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<rw.c> f44635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f44636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f44637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f44638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rw.c f44639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f44640f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f44643i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f44641g = new Random();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44644j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f44642h = DefaultClock.getInstance();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44646b;

        a(int i11, long j11) {
            this.f44645a = i11;
            this.f44646b = j11;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.d(this.f44645a, this.f44646b);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<rw.c> set, rw.c cVar, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f44636b = httpURLConnection;
        this.f44637c = mVar;
        this.f44638d = fVar;
        this.f44635a = set;
        this.f44639e = cVar;
        this.f44640f = scheduledExecutorService;
        this.f44643i = tVar;
    }

    public static /* synthetic */ Task a(b bVar, Task task, Task task2, long j11, int i11, Task task3) throws JSONException {
        bVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        m.a aVar = (m.a) task.getResult();
        g gVarA = (g) task2.getResult();
        if (!e(aVar, j11).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            bVar.b(i11, j11);
            return Tasks.forResult(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (gVarA == null) {
            gVarA = g.l().a();
        }
        Set<String> setF = gVarA.f(aVar.d());
        if (setF.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        bVar.c(rw.b.a(setF));
        return Tasks.forResult(null);
    }

    private void b(int i11, long j11) {
        if (i11 == 0) {
            j(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f44640f.schedule(new a(i11, j11), this.f44641g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(rw.b bVar) {
        Iterator<rw.c> it = this.f44635a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j11) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().k() >= j11);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    private void f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strI = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strI = strI + line;
                if (line.contains("}")) {
                    strI = i(strI);
                    if (strI.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strI);
                if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                    this.f44639e.b(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                }
                if (g()) {
                    break;
                }
                if (jSONObject.has("latestTemplateVersionNumber")) {
                    long jR = this.f44637c.r();
                    long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                    if (j11 > jR) {
                        b(3, j11);
                    }
                }
                if (jSONObject.has("retryIntervalSeconds")) {
                    l(jSONObject.getInt("retryIntervalSeconds"));
                }
            } catch (JSONException e11) {
                j(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e11.getCause(), FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e11);
            }
        }
        bufferedReader.close();
    }

    private synchronized boolean g() {
        return this.f44635a.isEmpty();
    }

    private String i(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void j(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<rw.c> it = this.f44635a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void l(int i11) {
        this.f44643i.o(new Date(new Date(this.f44642h.currentTimeMillis()).getTime() + (((long) i11) * 1000)));
    }

    public synchronized Task<Void> d(int i11, final long j11) throws Throwable {
        final int i12 = i11 - 1;
        try {
            try {
                final Task<m.a> taskN = this.f44637c.n(m.b.REALTIME, 3 - i12);
                final Task<g> taskE = this.f44638d.e();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskN, taskE}).continueWithTask(this.f44640f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return b.a(this.f44630a, taskN, taskE, j11, i12, task);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public void h() {
        HttpURLConnection httpURLConnection = this.f44636b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e11) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e11);
                }
            } catch (IOException e12) {
                if (!this.f44644j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e12);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e13);
                }
            }
            throw th2;
        }
    }

    public void k(boolean z11) {
        this.f44644j = z11;
    }
}
