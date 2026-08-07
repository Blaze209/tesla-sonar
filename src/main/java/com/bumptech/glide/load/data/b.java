package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f20524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f20525c;

    public b(AssetManager assetManager, String str) {
        this.f20524b = assetManager;
        this.f20523a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t11 = this.f20525c;
        if (t11 == null) {
            return;
        }
        try {
            e(t11);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public dj.a c() {
        return dj.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super T> aVar) {
        try {
            T tF = f(this.f20524b, this.f20523a);
            this.f20525c = tF;
            aVar.e(tF);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.f(e11);
        }
    }

    protected abstract void e(T t11);

    protected abstract T f(AssetManager assetManager, String str);
}
