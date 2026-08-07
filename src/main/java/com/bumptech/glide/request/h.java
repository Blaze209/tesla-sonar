package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;

/* JADX INFO: loaded from: classes3.dex */
public interface h<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, @NonNull uj.j<R> jVar, boolean z11);

    boolean onResourceReady(@NonNull R r11, @NonNull Object obj, uj.j<R> jVar, @NonNull dj.a aVar, boolean z11);
}
