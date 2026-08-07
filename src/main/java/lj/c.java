package lj;

import android.content.Context;
import androidx.annotation.NonNull;
import dj.l;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l<?> f90048b = new c();

    private c() {
    }

    @NonNull
    public static <T> c<T> c() {
        return (c) f90048b;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
    }

    @Override // dj.l
    @NonNull
    public fj.c<T> a(@NonNull Context context, @NonNull fj.c<T> cVar, int i11, int i12) {
        return cVar;
    }
}
