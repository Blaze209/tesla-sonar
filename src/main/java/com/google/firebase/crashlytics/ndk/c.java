package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.annotation.NonNull;
import gv.g0;

/* JADX INFO: loaded from: classes5.dex */
class c implements bv.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f44109e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.ndk.a f44110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f44113d;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    c(@NonNull com.google.firebase.crashlytics.ndk.a aVar, boolean z11) {
        this.f44110a = aVar;
        this.f44111b = z11;
    }

    public static /* synthetic */ void e(c cVar, String str, String str2, long j11, g0 g0Var) {
        cVar.getClass();
        bv.g.f().b("Initializing native session: " + str);
        if (cVar.f44110a.k(str, str2, j11, g0Var)) {
            return;
        }
        bv.g.f().k("Failed to initialize Crashlytics NDK for session " + str);
    }

    static c f(@NonNull Context context, boolean z11) {
        c cVar = new c(new com.google.firebase.crashlytics.ndk.a(context, new JniNativeApi(context), new jv.g(context)), z11);
        f44109e = cVar;
        return cVar;
    }

    @Override // bv.a
    public synchronized void a(@NonNull final String str, @NonNull final String str2, final long j11, @NonNull final g0 g0Var) throws Throwable {
        try {
            try {
                this.f44112c = str;
                a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.b
                    @Override // com.google.firebase.crashlytics.ndk.c.a
                    public final void a() {
                        c.e(this.f44104a, str, str2, j11, g0Var);
                    }
                };
                this.f44113d = aVar;
                if (this.f44111b) {
                    aVar.a();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // bv.a
    @NonNull
    public bv.h b(@NonNull String str) {
        return new g(this.f44110a.d(str));
    }

    @Override // bv.a
    public boolean c() {
        String str = this.f44112c;
        return str != null && d(str);
    }

    @Override // bv.a
    public boolean d(@NonNull String str) {
        return this.f44110a.j(str);
    }
}
