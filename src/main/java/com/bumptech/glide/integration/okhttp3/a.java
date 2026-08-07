package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import jj.h;
import sj.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    @Override // sj.c
    public void registerComponents(@NonNull Context context, @NonNull com.bumptech.glide.c cVar, @NonNull Registry registry) {
        registry.r(h.class, InputStream.class, new b.a());
    }
}
