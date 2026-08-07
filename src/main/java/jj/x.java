package jj;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class x<Model> implements o<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<?> f83910a = new x<>();

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f83910a;
    }

    @Override // jj.o
    public boolean a(@NonNull Model model) {
        return true;
    }

    @Override // jj.o
    public o.a<Model> b(@NonNull Model model, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(model), new b(model));
    }

    public static class a<Model> implements p<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a<?> f83911a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f83911a;
        }

        @Override // jj.p
        @NonNull
        public o<Model, Model> e(s sVar) {
            return x.c();
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Model f83912a;

        b(Model model) {
            this.f83912a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.f83912a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Model> aVar) {
            aVar.e(this.f83912a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
