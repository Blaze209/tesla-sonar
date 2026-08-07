package qj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f105594a = new ArrayList();

    private static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<Z> f105595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f105596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e<Z, R> f105597c;

        a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.f105595a = cls;
            this.f105596b = cls2;
            this.f105597c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f105595a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f105596b);
        }
    }

    @NonNull
    public synchronized <Z, R> e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f105594a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f105597c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f105594a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f105596b)) {
                arrayList.add(aVar.f105596b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
        this.f105594a.add(new a<>(cls, cls2, eVar));
    }
}
