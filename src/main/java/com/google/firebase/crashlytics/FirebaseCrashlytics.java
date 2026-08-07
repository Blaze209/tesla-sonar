package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import bv.d;
import bv.g;
import bv.k;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.f0;
import com.google.firebase.crashlytics.internal.common.k0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.z;
import com.google.firebase.f;
import ev.i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ww.b;
import yv.a;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final z f43926a;

    private FirebaseCrashlytics(@NonNull z zVar) {
        this.f43926a = zVar;
    }

    static FirebaseCrashlytics b(@NonNull f fVar, @NonNull zv.f fVar2, @NonNull a<bv.a> aVar, @NonNull a<wu.a> aVar2, @NonNull a<tw.a> aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + z.q() + " for " + packageName);
        i iVar = new i(executorService, executorService2);
        jv.g gVar = new jv.g(contextK);
        f0 f0Var = new f0(fVar);
        k0 k0Var = new k0(contextK, packageName, fVar2, f0Var);
        d dVar = new d(aVar);
        av.d dVar2 = new av.d(aVar2);
        m mVar = new m(f0Var, gVar);
        b.e(mVar);
        z zVar = new z(fVar, k0Var, dVar, f0Var, dVar2.e(), dVar2.d(), gVar, mVar, new k(aVar3), iVar);
        String strC = fVar.n().c();
        String strM = com.google.firebase.crashlytics.internal.common.i.m(contextK);
        List<com.google.firebase.crashlytics.internal.common.f> listJ = com.google.firebase.crashlytics.internal.common.i.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (com.google.firebase.crashlytics.internal.common.f fVar3 : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", fVar3.c(), fVar3.a(), fVar3.b()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.a aVarA = com.google.firebase.crashlytics.internal.common.a.a(contextK, k0Var, strC, strM, listJ, new bv.f(contextK));
            g.f().i("Installer package name is: " + aVarA.f43930d);
            lv.g gVarL = lv.g.l(contextK, strC, k0Var, new iv.b(), aVarA.f43932f, aVarA.f43933g, gVar, f0Var);
            gVarL.o(iVar).addOnFailureListener(executorService3, new OnFailureListener() { // from class: av.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    bv.g.f().e("Error fetching settings.", exc);
                }
            });
            if (zVar.x(aVarA, gVarL)) {
                zVar.o(gVarL);
            }
            return new FirebaseCrashlytics(zVar);
        } catch (PackageManager.NameNotFoundException e11) {
            g.f().e("Error retrieving app package info.", e11);
            return null;
        }
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) f.l().j(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f43926a.j();
    }

    public void deleteUnsentReports() {
        this.f43926a.k();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f43926a.l();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f43926a.s();
    }

    public void log(@NonNull String str) {
        this.f43926a.t(str);
    }

    public void recordException(@NonNull Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f43926a.u(th2, Collections.EMPTY_MAP);
        }
    }

    public void sendUnsentReports() {
        this.f43926a.y();
    }

    public void setCrashlyticsCollectionEnabled(boolean z11) {
        this.f43926a.z(Boolean.valueOf(z11));
    }

    public void setCustomKey(@NonNull String str, boolean z11) {
        this.f43926a.A(str, Boolean.toString(z11));
    }

    public void setCustomKeys(@NonNull av.g gVar) {
        throw null;
    }

    public void setUserId(@NonNull String str) {
        this.f43926a.B(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f43926a.z(bool);
    }

    public void setCustomKey(@NonNull String str, double d11) {
        this.f43926a.A(str, Double.toString(d11));
    }

    public void setCustomKey(@NonNull String str, float f11) {
        this.f43926a.A(str, Float.toString(f11));
    }

    public void setCustomKey(@NonNull String str, int i11) {
        this.f43926a.A(str, Integer.toString(i11));
    }

    public void recordException(@NonNull Throwable th2, @NonNull av.g gVar) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        throw null;
    }

    public void setCustomKey(@NonNull String str, long j11) {
        this.f43926a.A(str, Long.toString(j11));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f43926a.A(str, str2);
    }
}
