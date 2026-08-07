package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.InputStream;
import jj.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class OkHttpGlideModule implements sj.b {
    @Override // sj.b
    public void a(@NonNull Context context, @NonNull d dVar) {
    }

    @Override // sj.b
    public void b(Context context, c cVar, Registry registry) {
        registry.r(h.class, InputStream.class, new b.a());
    }
}
