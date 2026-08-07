package com.android.volley.toolbox;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f20261a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f20262b;

        a(Context context) {
            this.f20262b = context;
        }

        @Override // com.android.volley.toolbox.d.c
        public File get() {
            if (this.f20261a == null) {
                this.f20261a = new File(this.f20262b.getCacheDir(), "volley");
            }
            return this.f20261a;
        }
    }

    @NonNull
    public static com.android.volley.j a(Context context) {
        return c(context, null);
    }

    @NonNull
    private static com.android.volley.j b(Context context, com.android.volley.f fVar) {
        com.android.volley.j jVar = new com.android.volley.j(new d(new a(context.getApplicationContext())), fVar);
        jVar.g();
        return jVar;
    }

    @NonNull
    public static com.android.volley.j c(Context context, com.android.volley.toolbox.a aVar) {
        return b(context, aVar == null ? new b(new h()) : new b(aVar));
    }
}
