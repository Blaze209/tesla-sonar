package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f44687j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int[] f44688k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zv.f f44689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv.b<wu.a> f44690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f44691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f44692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f44693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f44694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f44695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f44696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, String> f44697i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f44698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f44700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f44701d;

        private a(Date date, int i11, g gVar, String str) {
            this.f44698a = date;
            this.f44699b = i11;
            this.f44700c = gVar;
            this.f44701d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f44700c;
        }

        String e() {
            return this.f44701d;
        }

        int f() {
            return this.f44699b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        String getValue() {
            return this.value;
        }
    }

    public m(zv.f fVar, yv.b<wu.a> bVar, Executor executor, Clock clock, Random random, f fVar2, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map<String, String> map) {
        this.f44689a = fVar;
        this.f44690b = bVar;
        this.f44691c = executor;
        this.f44692d = clock;
        this.f44693e = random;
        this.f44694f = fVar2;
        this.f44695g = configFetchHttpClient;
        this.f44696h = tVar;
        this.f44697i = map;
    }

    public static /* synthetic */ Task a(m mVar, Task task, Task task2, Date date, Map map, Task task3) {
        mVar.getClass();
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : mVar.l((String) task.getResult(), ((com.google.firebase.installations.f) task2.getResult()).b(), date, map);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    public static /* synthetic */ Task c(m mVar, Date date, Task task) {
        mVar.x(task, date);
        return task;
    }

    private boolean f(long j11, Date date) {
        Date dateF = this.f44696h.f();
        if (dateF.equals(t.f44750f)) {
            return false;
        }
        return date.before(new Date(dateF.getTime() + TimeUnit.SECONDS.toMillis(j11)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iA = firebaseRemoteConfigServerException.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j11) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j11)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigServerException {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f44695g.fetch(this.f44695g.d(), str, str2, s(), this.f44696h.e(), map, p(), date2, this.f44696h.b());
                if (aVarFetch.d() != null) {
                    this.f44696h.n(aVarFetch.d().k());
                }
                if (aVarFetch.e() != null) {
                    this.f44696h.m(aVarFetch.e());
                }
                this.f44696h.j();
                return aVarFetch;
            } catch (FirebaseRemoteConfigServerException e11) {
                e = e11;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                t.a aVarV = v(firebaseRemoteConfigServerException.a(), date2);
                if (u(aVarV, firebaseRemoteConfigServerException.a())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(aVarV.a().getTime());
                }
                throw g(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e12) {
            e = e12;
            date2 = date;
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? Tasks.forResult(aVarK) : this.f44694f.i(aVarK.d()).onSuccessTask(this.f44691c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(aVarK);
                }
            });
        } catch (FirebaseRemoteConfigException e11) {
            return Tasks.forException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<a> m(Task<g> task, long j11, final Map<String, String> map) {
        final m mVar;
        Task taskContinueWithTask;
        final Date date = new Date(this.f44692d.currentTimeMillis());
        if (task.isSuccessful() && f(j11, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            mVar = this;
        } else {
            final Task<String> id2 = this.f44689a.getId();
            final Task<com.google.firebase.installations.f> taskA = this.f44689a.a(false);
            mVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, taskA}).continueWithTask(this.f44691c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return m.a(this.f44677a, id2, taskA, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(mVar.f44691c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return m.c(this.f44682a, date, task2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f44696h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        wu.a aVar = this.f44690b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.f(true).get("_fot");
    }

    private long q(int i11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f44688k;
        long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f44693e.nextInt((int) millis));
    }

    private Map<String, String> s() {
        HashMap map = new HashMap();
        wu.a aVar = this.f44690b.get();
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.f(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean t(int i11) {
        return i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    private boolean u(t.a aVar, int i11) {
        return aVar.b() > 1 || i11 == 429;
    }

    private t.a v(int i11, Date date) {
        if (t(i11)) {
            w(date);
        }
        return this.f44696h.a();
    }

    private void w(Date date) {
        int iB = this.f44696h.a().b() + 1;
        this.f44696h.l(iB, new Date(date.getTime() + q(iB)));
    }

    private void x(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f44696h.r(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f44696h.s();
        } else {
            this.f44696h.q();
        }
    }

    public Task<a> i() {
        return j(this.f44696h.h());
    }

    public Task<a> j(final long j11) {
        final HashMap map = new HashMap(this.f44697i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.getValue() + "/1");
        return this.f44694f.e().continueWithTask(this.f44691c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f44674a.m(task, j11, map);
            }
        });
    }

    public Task<a> n(b bVar, int i11) {
        final HashMap map = new HashMap(this.f44697i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.getValue() + "/" + i11);
        return this.f44694f.e().continueWithTask(this.f44691c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f44684a.m(task, 0L, map);
            }
        });
    }

    public long r() {
        return this.f44696h.g();
    }
}
