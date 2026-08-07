package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final yu.c<?> f45079b = yu.c.c(n.class).b(yu.q.k(i.class)).b(yu.q.k(Context.class)).f(new yu.g() { // from class: com.google.mlkit.common.sdkinternal.f0
        @Override // yu.g
        public final Object a(yu.d dVar) {
            return new n((Context) dVar.a(Context.class));
        }
    }).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f45080a;

    public n(@NonNull Context context) {
        this.f45080a = context;
    }

    @NonNull
    @KeepForSdk
    public synchronized String a() {
        String string = e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        e().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    @KeepForSdk
    public synchronized long b(@NonNull qx.b bVar) {
        return e().getLong(String.format("downloading_begin_time_%s", bVar.d()), 0L);
    }

    @KeepForSdk
    public synchronized long c(@NonNull qx.b bVar) {
        return e().getLong(String.format("model_first_use_time_%s", bVar.d()), 0L);
    }

    @KeepForSdk
    public synchronized void d(@NonNull qx.b bVar, long j11) {
        e().edit().putLong(String.format("model_first_use_time_%s", bVar.d()), j11).apply();
    }

    @NonNull
    protected final SharedPreferences e() {
        return this.f45080a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
