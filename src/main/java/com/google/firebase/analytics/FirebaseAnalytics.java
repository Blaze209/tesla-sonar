package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f43847b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzfb f43848a;

    public FirebaseAnalytics(zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfbVar);
        this.f43848a = zzfbVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f43847b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f43847b == null) {
                        f43847b = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f43847b;
    }

    @Keep
    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new a(zzfbVarZza);
    }

    public void a(@NonNull String str, Bundle bundle) {
        this.f43848a.zzh(str, bundle);
    }

    public void b(boolean z11) {
        this.f43848a.zzq(Boolean.valueOf(z11));
    }

    public void c(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f43848a.zzL(bundle);
    }

    public void d(@NonNull String str, String str2) {
        this.f43848a.zzk(null, str, str2, false);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.s().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f43848a.zzp(zzdf.zza(activity), str, str2);
    }
}
