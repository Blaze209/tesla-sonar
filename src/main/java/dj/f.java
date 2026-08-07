package dj;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> implements l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<? extends l<T>> f60684b;

    @SafeVarargs
    public f(@NonNull l<T>... lVarArr) {
        if (lVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f60684b = Arrays.asList(lVarArr);
    }

    @Override // dj.l
    @NonNull
    public fj.c<T> a(@NonNull Context context, @NonNull fj.c<T> cVar, int i11, int i12) {
        Iterator<? extends l<T>> it = this.f60684b.iterator();
        fj.c<T> cVar2 = cVar;
        while (it.hasNext()) {
            fj.c<T> cVarA = it.next().a(context, cVar2, i11, i12);
            if (cVar2 != null && !cVar2.equals(cVar) && !cVar2.equals(cVarA)) {
                cVar2.recycle();
            }
            cVar2 = cVarA;
        }
        return cVar2;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        Iterator<? extends l<T>> it = this.f60684b.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f60684b.equals(((f) obj).f60684b);
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return this.f60684b.hashCode();
    }
}
