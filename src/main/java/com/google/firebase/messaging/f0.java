package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f44283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f44284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rpc f44285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yv.b<qw.i> f44286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yv.b<wv.j> f44287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zv.f f44288f;

    f0(com.google.firebase.f fVar, k0 k0Var, yv.b<qw.i> bVar, yv.b<wv.j> bVar2, zv.f fVar2) {
        this(fVar, k0Var, new Rpc(fVar.k()), bVar, bVar2, fVar2);
    }

    public static /* synthetic */ String a(f0 f0Var, Task task) {
        f0Var.getClass();
        return f0Var.h((Bundle) task.getResult(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(new d6.k(), new Continuation() { // from class: com.google.firebase.messaging.e0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return f0.a(this.f44269a, task2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f44283a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(AnalyticsAttribute.Error);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        wv.j.a aVarA;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f44283a.n().c());
        bundle.putString("gmsv", Integer.toString(this.f44284b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f44284b.a());
        bundle.putString("app_ver_name", this.f44284b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.f) Tasks.await(this.f44288f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e12) {
            e = e12;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f44288f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        wv.j jVar = this.f44287e.get();
        qw.i iVar = this.f44286d.get();
        if (jVar == null || iVar == null || (aVarA = jVar.a("fire-iid")) == wv.j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarA.getCode()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task<Bundle> l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f44285c.send(bundle);
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }

    Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(k0.c(this.f44283a), Marker.ANY_MARKER, bundle));
    }

    Task<CloudMessage> f() {
        return this.f44285c.getProxiedNotificationData();
    }

    Task<String> g() {
        return d(l(k0.c(this.f44283a), Marker.ANY_MARKER, new Bundle()));
    }

    Task<Void> k(boolean z11) {
        return this.f44285c.setRetainProxiedNotifications(z11);
    }

    Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    Task<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    f0(com.google.firebase.f fVar, k0 k0Var, Rpc rpc, yv.b<qw.i> bVar, yv.b<wv.j> bVar2, zv.f fVar2) {
        this.f44283a = fVar;
        this.f44284b = k0Var;
        this.f44285c = rpc;
        this.f44286d = bVar;
        this.f44287e = bVar2;
        this.f44288f = fVar2;
    }
}
