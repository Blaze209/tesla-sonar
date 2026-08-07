package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ezvcard.property.Kind;
import fv.EventMetadata;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final FilenameFilter f44008t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Charset f44009u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f44011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f44012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fv.p f44013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ev.i f44014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f44015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jv.g f44016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.a f44017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fv.f f44018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bv.a f44019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final cv.a f44020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f44021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t0 f44022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d0 f44023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private lv.j f44024o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f44025p = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f44026q = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final TaskCompletionSource<Void> f44027r = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f44028s = new AtomicBoolean(false);

    class a implements d0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.d0.a
        public void a(@NonNull lv.j jVar, @NonNull Thread thread, @NonNull Throwable th2) throws Throwable {
            p.this.I(jVar, thread, th2);
        }
    }

    class b implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f44031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f44032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ lv.j f44033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f44034e;

        class a implements SuccessContinuation<lv.d, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f44036a;

            a(String str) {
                this.f44036a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(lv.d dVar) {
                if (dVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{p.this.N(), p.this.f44022m.z(p.this.f44014e.common, b.this.f44034e ? this.f44036a : null)});
                }
                bv.g.f().k("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        b(long j11, Throwable th2, Thread thread, lv.j jVar, boolean z11) {
            this.f44030a = j11;
            this.f44031b = th2;
            this.f44032c = thread;
            this.f44033d = jVar;
            this.f44034e = z11;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            long jG = p.G(this.f44030a);
            String strC = p.this.C();
            if (strC == null) {
                bv.g.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            p.this.f44012c.a();
            p.this.f44022m.u(this.f44031b, this.f44032c, strC, jG);
            p.this.x(this.f44030a);
            p.this.u(this.f44033d);
            p.this.w(new h().c(), Boolean.valueOf(this.f44034e));
            return !p.this.f44011b.d() ? Tasks.forResult(null) : this.f44033d.b().onSuccessTask(p.this.f44014e.common, new a(strC));
        }
    }

    class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(Void r11) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    class d implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f44039a;

        class a implements SuccessContinuation<lv.d, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(lv.d dVar) {
                if (dVar == null) {
                    bv.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                p.this.N();
                p.this.f44022m.y(p.this.f44014e.common);
                p.this.f44027r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f44039a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Boolean bool) {
            if (bool.booleanValue()) {
                bv.g.f().b("Sending cached crash reports...");
                p.this.f44011b.c(bool.booleanValue());
                return this.f44039a.onSuccessTask(p.this.f44014e.common, new a());
            }
            bv.g.f().i("Deleting cached crash reports...");
            p.r(p.this.L());
            p.this.f44022m.x();
            p.this.f44027r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    class e implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f44042a;

        e(long j11) {
            this.f44042a = j11;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f44042a);
            p.this.f44020k.a("_ae", bundle);
            return null;
        }
    }

    p(Context context, k0 k0Var, f0 f0Var, jv.g gVar, a0 a0Var, com.google.firebase.crashlytics.internal.common.a aVar, fv.p pVar, fv.f fVar, t0 t0Var, bv.a aVar2, cv.a aVar3, m mVar, ev.i iVar) {
        this.f44010a = context;
        this.f44015f = k0Var;
        this.f44011b = f0Var;
        this.f44016g = gVar;
        this.f44012c = a0Var;
        this.f44017h = aVar;
        this.f44013d = pVar;
        this.f44018i = fVar;
        this.f44019j = aVar2;
        this.f44020k = aVar3;
        this.f44021l = mVar;
        this.f44022m = t0Var;
        this.f44014e = iVar;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        SortedSet<String> sortedSetQ = this.f44022m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return sortedSetQ.first();
    }

    private static long D() {
        return G(System.currentTimeMillis());
    }

    @NonNull
    static List<n0> E(bv.h hVar, String str, jv.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("logs_file", "logs", bArr));
        arrayList.add(new i0("crash_meta_file", OrcaKeys.METADATA, hVar.g()));
        arrayList.add(new i0("session_meta_file", "session", hVar.f()));
        arrayList.add(new i0("app_meta_file", "app", hVar.d()));
        arrayList.add(new i0("device_meta_file", Kind.DEVICE, hVar.a()));
        arrayList.add(new i0("os_meta_file", "os", hVar.e()));
        arrayList.add(P(hVar));
        arrayList.add(new i0("user_meta_file", "user", fileQ));
        arrayList.add(new i0("keys_file", "keys", fileQ2));
        arrayList.add(new i0("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        bv.g.f().k("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j11) {
        return j11 / 1000;
    }

    private Task<Void> M(long j11) {
        if (B()) {
            bv.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        bv.g.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                bv.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean O(String str, File file, gv.f0.a aVar) {
        if (file == null || !file.exists()) {
            bv.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            bv.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static n0 P(bv.h hVar) {
        File fileC = hVar.c();
        return (fileC == null || !fileC.exists()) ? new g("minidump_file", "minidump", new byte[]{0}) : new i0("minidump_file", "minidump", fileC);
    }

    private static byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private Task<Boolean> Y() {
        if (this.f44011b.d()) {
            bv.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f44025p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        bv.g.f().b("Automatic data collection is disabled.");
        bv.g.f().i("Notifying that unsent reports are available.");
        this.f44025p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.f44011b.j().onSuccessTask(new c());
        bv.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return ev.b.b(taskOnSuccessTask, this.f44026q.getTask());
    }

    private void Z(String str) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            bv.g.f().i("ANR feature enabled, but device is API " + i11);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f44010a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f44022m.w(str, historicalProcessExitReasons, new fv.f(this.f44016g, str), fv.p.k(str, this.f44016g, this.f44014e));
        } else {
            bv.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static gv.g0.a o(k0 k0Var, com.google.firebase.crashlytics.internal.common.a aVar) {
        return gv.g0.a.b(k0Var.f(), aVar.f43932f, aVar.f43933g, k0Var.a().c(), g0.determineFrom(aVar.f43930d).getId(), aVar.f43934h);
    }

    private static gv.g0.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return gv.g0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), i.x(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static gv.g0.c q() {
        return gv.g0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z11, lv.j jVar, boolean z12) {
        String str;
        ev.i.c();
        ArrayList arrayList = new ArrayList(this.f44022m.q());
        if (arrayList.size() <= z11) {
            bv.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z11 ? 1 : 0);
        if (z12 && jVar.a().f90794b.f90802b) {
            Z(str2);
        } else {
            bv.g.f().i("ANR feature disabled.");
        }
        if (z12 && this.f44019j.d(str2)) {
            z(str2);
        }
        if (z11 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f44021l.e(null);
            str = null;
        }
        this.f44022m.m(D(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long jD = D();
        bv.g.f().b("Opening a new session with ID " + str);
        this.f44019j.a(str, String.format(Locale.US, "Crashlytics Android SDK/%s", z.q()), jD, gv.g0.b(o(this.f44015f, this.f44017h), q(), p(this.f44010a)));
        if (bool.booleanValue() && str != null) {
            this.f44013d.p(str);
        }
        this.f44018i.e(str);
        this.f44021l.e(str);
        this.f44022m.r(str, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j11) {
        try {
            if (this.f44016g.g(".ae" + j11).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e11) {
            bv.g.f().l("Could not create app exception marker file.", e11);
        }
    }

    private void z(String str) {
        bv.g.f().i("Finalizing native report for session " + str);
        bv.h hVarB = this.f44019j.b(str);
        File fileC = hVarB.c();
        gv.f0.a aVarB = hVarB.b();
        if (O(str, fileC, aVarB)) {
            bv.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        fv.f fVar = new fv.f(this.f44016g, str);
        File fileK = this.f44016g.k(str);
        if (!fileK.isDirectory()) {
            bv.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List<n0> listE = E(hVarB, str, this.f44016g, fVar.b());
        o0.b(fileK, listE);
        bv.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f44022m.l(str, listE, aVarB);
        fVar.a();
    }

    boolean A(lv.j jVar) {
        ev.i.c();
        if (K()) {
            bv.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        bv.g.f().i("Finalizing previously open sessions.");
        try {
            v(true, jVar, true);
            bv.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e11) {
            bv.g.f().e("Unable to finalize previously open sessions.", e11);
            return false;
        }
    }

    String H() throws IOException {
        String strR = i.r(this.f44010a);
        if (strR != null) {
            bv.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f44009u), 0);
        }
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            bv.g.f().g("No version control information found");
            return null;
        }
        try {
            bv.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(R(inputStreamF), 0);
            inputStreamF.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                inputStreamF.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    void I(@NonNull lv.j jVar, @NonNull Thread thread, @NonNull Throwable th2) throws Throwable {
        J(jVar, thread, th2, false);
    }

    synchronized void J(@NonNull lv.j jVar, @NonNull Thread thread, @NonNull Throwable th2, boolean z11) throws Throwable {
        Throwable th3;
        try {
            try {
                bv.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z11) {
                    try {
                        ww.a.b();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                Task taskF = this.f44014e.common.f(new b(System.currentTimeMillis(), th2, thread, jVar, z11));
                if (!z11) {
                    try {
                        w0.b(taskF);
                    } catch (TimeoutException unused) {
                        bv.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e11) {
                        bv.g.f().e("Error handling uncaught exception", e11);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    boolean K() {
        d0 d0Var = this.f44023n;
        return d0Var != null && d0Var.a();
    }

    List<File> L() {
        return this.f44016g.h(f44008t);
    }

    void Q(final String str) {
        this.f44014e.common.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f44006a.w(str, Boolean.FALSE);
            }
        });
    }

    void S() {
        try {
            String strH = H();
            if (strH != null) {
                V("com.crashlytics.version-control-info", strH);
                bv.g.f().g("Saved version control info");
            }
        } catch (IOException e11) {
            bv.g.f().l("Unable to save version control info", e11);
        }
    }

    Task<Void> T() {
        this.f44026q.trySetResult(Boolean.TRUE);
        return this.f44027r.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(String str, String str2) {
        try {
            this.f44013d.n(str, str2);
        } catch (IllegalArgumentException e11) {
            Context context = this.f44010a;
            if (context != null && i.v(context)) {
                throw e11;
            }
            bv.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void V(String str, String str2) {
        try {
            this.f44013d.o(str, str2);
        } catch (IllegalArgumentException e11) {
            Context context = this.f44010a;
            if (context != null && i.v(context)) {
                throw e11;
            }
            bv.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(String str) {
        this.f44013d.q(str);
    }

    void X(Task<lv.d> task) {
        if (this.f44022m.p()) {
            bv.g.f().i("Crash reports are available to be sent.");
            Y().onSuccessTask(this.f44014e.common, new d(task));
        } else {
            bv.g.f().i("No crash reports are available to be sent.");
            this.f44025p.trySetResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(@NonNull Thread thread, @NonNull Throwable th2, @NonNull Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (K()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            bv.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f44022m.v(th2, thread, new EventMetadata(strC, jG, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(long j11, String str) {
        if (K()) {
            return;
        }
        this.f44018i.g(j11, str);
    }

    @NonNull
    Task<Boolean> n() {
        if (this.f44028s.compareAndSet(false, true)) {
            return this.f44025p.getTask();
        }
        bv.g.f().k("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    Task<Void> s() {
        this.f44026q.trySetResult(Boolean.FALSE);
        return this.f44027r.getTask();
    }

    boolean t() {
        ev.i.c();
        if (!this.f44012c.c()) {
            String strC = C();
            return strC != null && this.f44019j.d(strC);
        }
        bv.g.f().i("Found previous crash marker.");
        this.f44012c.d();
        return true;
    }

    void u(lv.j jVar) {
        v(false, jVar, false);
    }

    void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, lv.j jVar) {
        this.f44024o = jVar;
        Q(str);
        d0 d0Var = new d0(new a(), jVar, uncaughtExceptionHandler, this.f44019j);
        this.f44023n = d0Var;
        Thread.setDefaultUncaughtExceptionHandler(d0Var);
    }
}
