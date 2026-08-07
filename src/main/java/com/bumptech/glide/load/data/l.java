package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f20547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f20548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f20549c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f20548b = contentResolver;
        this.f20547a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t11 = this.f20549c;
        if (t11 != null) {
            try {
                e(t11);
            } catch (IOException unused) {
            }
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
    public final void d(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super T> aVar) {
        try {
            T tF = f(this.f20547a, this.f20548b);
            this.f20549c = tF;
            aVar.e(tF);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.f(e11);
        }
    }

    protected abstract void e(T t11);

    protected abstract T f(Uri uri, ContentResolver contentResolver);
}
