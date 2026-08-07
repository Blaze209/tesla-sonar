package jj;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface o<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj.e f83874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<dj.e> f83875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f83876c;

        public a(@NonNull dj.e eVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this(eVar, Collections.EMPTY_LIST, dVar);
        }

        public a(@NonNull dj.e eVar, @NonNull List<dj.e> list, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this.f83874a = (dj.e) xj.k.d(eVar);
            this.f83875b = (List) xj.k.d(list);
            this.f83876c = (com.bumptech.glide.load.data.d) xj.k.d(dVar);
        }
    }

    boolean a(@NonNull Model model);

    a<Data> b(@NonNull Model model, int i11, int i12, @NonNull dj.h hVar);
}
