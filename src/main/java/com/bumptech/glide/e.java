package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final m<?, ?> f20483k = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.b f20484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xj.f.b<Registry> f20485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uj.g f20486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a f20487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.h<Object>> f20488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f20489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f20490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f20491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.i f20493j;

    public e(@NonNull Context context, @NonNull gj.b bVar, @NonNull xj.f.b<Registry> bVar2, @NonNull uj.g gVar, @NonNull c.a aVar, @NonNull Map<Class<?>, m<?, ?>> map, @NonNull List<com.bumptech.glide.request.h<Object>> list, @NonNull com.bumptech.glide.load.engine.j jVar, @NonNull f fVar, int i11) {
        super(context.getApplicationContext());
        this.f20484a = bVar;
        this.f20486c = gVar;
        this.f20487d = aVar;
        this.f20488e = list;
        this.f20489f = map;
        this.f20490g = jVar;
        this.f20491h = fVar;
        this.f20492i = i11;
        this.f20485b = xj.f.a(bVar2);
    }

    @NonNull
    public <X> uj.k<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f20486c.a(imageView, cls);
    }

    @NonNull
    public gj.b b() {
        return this.f20484a;
    }

    public List<com.bumptech.glide.request.h<Object>> c() {
        return this.f20488e;
    }

    public synchronized com.bumptech.glide.request.i d() {
        try {
            if (this.f20493j == null) {
                this.f20493j = this.f20487d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20493j;
    }

    @NonNull
    public <T> m<?, T> e(@NonNull Class<T> cls) {
        m<?, T> mVar = (m) this.f20489f.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : this.f20489f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? (m<?, T>) f20483k : mVar;
    }

    @NonNull
    public com.bumptech.glide.load.engine.j f() {
        return this.f20490g;
    }

    public f g() {
        return this.f20491h;
    }

    public int h() {
        return this.f20492i;
    }

    @NonNull
    public Registry i() {
        return this.f20485b.get();
    }
}
