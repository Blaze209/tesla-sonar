package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f44365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44367c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f44369e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f44368d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44370f = false;

    private x0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f44365a = sharedPreferences;
        this.f44366b = str;
        this.f44367c = str2;
        this.f44369e = executor;
    }

    private boolean b(boolean z11) {
        if (z11 && !this.f44370f) {
            i();
        }
        return z11;
    }

    static x0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        x0 x0Var = new x0(sharedPreferences, str, str2, executor);
        x0Var.d();
        return x0Var;
    }

    private void d() {
        synchronized (this.f44368d) {
            try {
                this.f44368d.clear();
                String string = this.f44365a.getString(this.f44366b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f44367c)) {
                    String[] strArrSplit = string.split(this.f44367c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f44368d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f44368d) {
            this.f44365a.edit().putString(this.f44366b, g()).commit();
        }
    }

    private void i() {
        this.f44369e.execute(new Runnable() { // from class: com.google.firebase.messaging.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44362a.h();
            }
        });
    }

    public String e() {
        String strPeek;
        synchronized (this.f44368d) {
            strPeek = this.f44368d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f44368d) {
            zB = b(this.f44368d.remove(obj));
        }
        return zB;
    }

    @NonNull
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f44368d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f44367c);
        }
        return sb2.toString();
    }
}
