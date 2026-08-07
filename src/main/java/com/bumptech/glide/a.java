package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.dylanvann.fastimage.GlideRequests;
import rj.o;
import rj.p;

/* JADX INFO: loaded from: classes3.dex */
final class a implements o.b {
    a() {
    }

    @Override // rj.o.b
    @NonNull
    public l a(@NonNull c cVar, @NonNull rj.j jVar, @NonNull p pVar, @NonNull Context context) {
        return new GlideRequests(cVar, jVar, pVar, context);
    }
}
