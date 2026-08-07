package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import wv.i;
import yu.t;

/* JADX INFO: loaded from: classes5.dex */
public class c implements zv.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f44158m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f44159n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f44160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cw.c f44161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bw.c f44162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f44163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t<bw.b> f44164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zv.h f44165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f44166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f44167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f44168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f44169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<aw.a> f44170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<g> f44171l;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f44172a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f44172a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44174b;

        static {
            int[] iArr = new int[cw.f.b.values().length];
            f44174b = iArr;
            try {
                iArr[cw.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44174b[cw.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44174b[cw.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[cw.d.b.values().length];
            f44173a = iArr2;
            try {
                iArr2[cw.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44173a[cw.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final com.google.firebase.f fVar, @NonNull yv.b<i> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, fVar, new cw.c(fVar.k(), bVar), new bw.c(fVar), h.c(), new t(new yv.b() { // from class: zv.a
            @Override // yv.b
            public final Object get() {
                return com.google.firebase.installations.c.f(fVar);
            }
        }), new zv.h());
    }

    private bw.d A(bw.d dVar) throws FirebaseInstallationsException {
        cw.d dVarD = this.f44161b.d(o(), dVar.d(), w(), p(), (dVar.d() == null || dVar.d().length() != 11) ? null : r().i());
        int i11 = b.f44173a[dVarD.e().ordinal()];
        if (i11 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f44163d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i11 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void B(Exception exc) {
        synchronized (this.f44166g) {
            try {
                Iterator<g> it = this.f44171l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void C(bw.d dVar) {
        synchronized (this.f44166g) {
            try {
                Iterator<g> it = this.f44171l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void D(String str) {
        this.f44169j = str;
    }

    private synchronized void E(bw.d dVar, bw.d dVar2) {
        if (this.f44170k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<aw.a> it = this.f44170k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ bw.b f(com.google.firebase.f fVar) {
        return new bw.b(fVar);
    }

    private Task<f> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new d(this.f44163d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void i(g gVar) {
        synchronized (this.f44166g) {
            this.f44171l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void k() {
        D(null);
        bw.d dVarU = u();
        if (dVarU.k()) {
            this.f44161b.e(o(), dVarU.d(), w(), dVarU.f());
        }
        x(dVarU.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z11) {
        bw.d dVarA;
        bw.d dVarU = u();
        try {
            if (dVarU.i() || dVarU.l()) {
                dVarA = A(dVarU);
            } else {
                if (!z11 && !this.f44163d.f(dVarU)) {
                    return;
                }
                dVarA = n(dVarU);
            }
            x(dVarA);
            E(dVarU, dVarA);
            if (dVarA.k()) {
                D(dVarA.d());
            }
            if (dVarA.i()) {
                B(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (dVarA.j()) {
                B(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                C(dVarA);
            }
        } catch (FirebaseInstallationsException e11) {
            B(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(final boolean z11) {
        bw.d dVarV = v();
        if (z11) {
            dVarV = dVarV.p();
        }
        C(dVarV);
        this.f44168i.execute(new Runnable() { // from class: zv.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f129151a.l(z11);
            }
        });
    }

    private bw.d n(@NonNull bw.d dVar) throws FirebaseInstallationsException {
        cw.f fVarF = this.f44161b.f(o(), dVar.d(), w(), dVar.f());
        int i11 = b.f44174b[fVarF.b().ordinal()];
        if (i11 == 1) {
            return dVar.o(fVarF.c(), fVarF.d(), this.f44163d.b());
        }
        if (i11 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i11 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        D(null);
        return dVar.r();
    }

    private synchronized String q() {
        return this.f44169j;
    }

    private bw.b r() {
        return this.f44164e.get();
    }

    @NonNull
    public static c s() {
        return t(com.google.firebase.f.l());
    }

    @NonNull
    public static c t(@NonNull com.google.firebase.f fVar) {
        Preconditions.checkArgument(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(zv.f.class);
    }

    private bw.d u() {
        bw.d dVarD;
        synchronized (f44158m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44160a.k(), "generatefid.lock");
                try {
                    dVarD = this.f44162c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    private bw.d v() {
        bw.d dVarD;
        synchronized (f44158m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44160a.k(), "generatefid.lock");
                try {
                    dVarD = this.f44162c.d();
                    if (dVarD.j()) {
                        dVarD = this.f44162c.b(dVarD.t(z(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    private void x(bw.d dVar) {
        synchronized (f44158m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44160a.k(), "generatefid.lock");
                try {
                    this.f44162c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void y() {
        Preconditions.checkNotEmpty(p(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(w(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(o(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(p()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(o()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String z(bw.d dVar) {
        if ((!this.f44160a.m().equals("CHIME_ANDROID_SDK") && !this.f44160a.u()) || !dVar.m()) {
            return this.f44165f.a();
        }
        String strF = r().f();
        return TextUtils.isEmpty(strF) ? this.f44165f.a() : strF;
    }

    @Override // zv.f
    @NonNull
    public Task<f> a(final boolean z11) {
        y();
        Task<f> taskG = g();
        this.f44167h.execute(new Runnable() { // from class: zv.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f129149a.m(z11);
            }
        });
        return taskG;
    }

    @Override // zv.f
    @NonNull
    public Task<String> getId() {
        y();
        String strQ = q();
        if (strQ != null) {
            return Tasks.forResult(strQ);
        }
        Task<String> taskH = h();
        this.f44167h.execute(new Runnable() { // from class: zv.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f129148a.m(false);
            }
        });
        return taskH;
    }

    @NonNull
    public Task<Void> j() {
        return Tasks.call(this.f44167h, new Callable() { // from class: zv.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f129153a.k();
            }
        });
    }

    String o() {
        return this.f44160a.n().b();
    }

    String p() {
        return this.f44160a.n().c();
    }

    String w() {
        return this.f44160a.n().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, cw.c cVar, bw.c cVar2, h hVar, t<bw.b> tVar, zv.h hVar2) {
        this.f44166g = new Object();
        this.f44170k = new HashSet();
        this.f44171l = new ArrayList();
        this.f44160a = fVar;
        this.f44161b = cVar;
        this.f44162c = cVar2;
        this.f44163d = hVar;
        this.f44164e = tVar;
        this.f44165f = hVar2;
        this.f44167h = executorService;
        this.f44168i = executor;
    }
}
