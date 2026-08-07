package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mw.e;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, ow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<ow.b> f44481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Trace f44482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GaugeManager f44483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f44485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f44486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<ow.a> f44487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Trace> f44488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f44489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f44490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f44491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f44492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kw.a f44478m = kw.a.e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<String, Trace> f44479n = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Parcelable.Creator<Trace> f44480o = new b();

    class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z11, a aVar) {
        this(parcel, z11);
    }

    private void b(@NonNull String str, @NonNull String str2) {
        if (k()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f44484d));
        }
        if (!this.f44486f.containsKey(str) && this.f44486f.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    @NonNull
    public static Trace c(@NonNull String str) {
        return new Trace(str);
    }

    @NonNull
    private com.google.firebase.perf.metrics.a l(@NonNull String str) {
        com.google.firebase.perf.metrics.a aVar = this.f44485e.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f44485e.put(str, aVar2);
        return aVar2;
    }

    private void m(l lVar) {
        if (this.f44488h.isEmpty()) {
            return;
        }
        Trace trace = this.f44488h.get(this.f44488h.size() - 1);
        if (trace.f44492l == null) {
            trace.f44492l = lVar;
        }
    }

    @Override // ow.b
    public void a(ow.a aVar) {
        if (aVar == null) {
            f44478m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!i() || k()) {
                return;
            }
            this.f44487g.add(aVar);
        }
    }

    @NonNull
    Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f44485e;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    l e() {
        return this.f44492l;
    }

    List<ow.a> f() {
        List<ow.a> listUnmodifiableList;
        synchronized (this.f44487g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (ow.a aVar : this.f44487g) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    protected void finalize() throws Throwable {
        try {
            if (j()) {
                f44478m.k("Trace '%s' is started but not stopped when it is destructed!", this.f44484d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    l g() {
        return this.f44491k;
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return this.f44486f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f44486f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f44485e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    @NonNull
    public String getName() {
        return this.f44484d;
    }

    @NonNull
    List<Trace> h() {
        return this.f44488h;
    }

    boolean i() {
        return this.f44491k != null;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j11) {
        String strE = e.e(str);
        if (strE != null) {
            f44478m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f44478m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f44484d);
        } else {
            if (k()) {
                f44478m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f44484d);
                return;
            }
            com.google.firebase.perf.metrics.a aVarL = l(str.trim());
            aVarL.b(j11);
            f44478m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(aVarL.a()), this.f44484d);
        }
    }

    boolean j() {
        return i() && !k();
    }

    boolean k() {
        return this.f44492l != null;
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z11;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f44478m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f44484d);
            z11 = true;
        } catch (Exception e11) {
            f44478m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e11.getMessage());
            z11 = false;
        }
        if (z11) {
            this.f44486f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j11) {
        String strE = e.e(str);
        if (strE != null) {
            f44478m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f44478m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f44484d);
        } else if (k()) {
            f44478m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f44484d);
        } else {
            l(str.trim()).c(j11);
            f44478m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j11), this.f44484d);
        }
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (k()) {
            f44478m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f44486f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f44478m.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f44484d);
        if (strF != null) {
            f44478m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f44484d, strF);
            return;
        }
        if (this.f44491k != null) {
            f44478m.d("Trace '%s' has already started, should not start again!", this.f44484d);
            return;
        }
        this.f44491k = this.f44490j.a();
        registerForAppState();
        ow.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f44481a);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f44483c.collectGaugeMetricOnce(aVarPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f44478m.d("Trace '%s' has not been started so unable to stop!", this.f44484d);
            return;
        }
        if (k()) {
            f44478m.d("Trace '%s' has already stopped, should not stop again!", this.f44484d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f44481a);
        unregisterForAppState();
        l lVarA = this.f44490j.a();
        this.f44492l = lVarA;
        if (this.f44482b == null) {
            m(lVarA);
            if (this.f44484d.isEmpty()) {
                f44478m.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f44489i.x(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f44483c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeParcelable(this.f44482b, 0);
        parcel.writeString(this.f44484d);
        parcel.writeList(this.f44488h);
        parcel.writeMap(this.f44485e);
        parcel.writeParcelable(this.f44491k, 0);
        parcel.writeParcelable(this.f44492l, 0);
        synchronized (this.f44487g) {
            parcel.writeList(this.f44487g);
        }
    }

    private Trace(@NonNull String str) {
        this(str, k.k(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.application.a aVar2, @NonNull GaugeManager gaugeManager) {
        super(aVar2);
        this.f44481a = new WeakReference<>(this);
        this.f44482b = null;
        this.f44484d = str.trim();
        this.f44488h = new ArrayList();
        this.f44485e = new ConcurrentHashMap();
        this.f44486f = new ConcurrentHashMap();
        this.f44490j = aVar;
        this.f44489i = kVar;
        this.f44487g = Collections.synchronizedList(new ArrayList());
        this.f44483c = gaugeManager;
    }

    private Trace(@NonNull Parcel parcel, boolean z11) {
        super(z11 ? null : com.google.firebase.perf.application.a.b());
        this.f44481a = new WeakReference<>(this);
        this.f44482b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f44484d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f44488h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f44485e = concurrentHashMap;
        this.f44486f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f44491k = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f44492l = (l) parcel.readParcelable(l.class.getClassLoader());
        List<ow.a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f44487g = listSynchronizedList;
        parcel.readList(listSynchronizedList, ow.a.class.getClassLoader());
        if (z11) {
            this.f44489i = null;
            this.f44490j = null;
            this.f44483c = null;
        } else {
            this.f44489i = k.k();
            this.f44490j = new com.google.firebase.perf.util.a();
            this.f44483c = GaugeManager.getInstance();
        }
    }
}
