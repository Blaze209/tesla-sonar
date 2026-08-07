package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.a0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f20545a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gj.b f20546a;

        public a(gj.b bVar) {
            this.f20546a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f20546a);
        }
    }

    public k(InputStream inputStream, gj.b bVar) {
        a0 a0Var = new a0(inputStream, bVar);
        this.f20545a = a0Var;
        a0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f20545a.release();
    }

    public void c() {
        this.f20545a.n();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f20545a.reset();
        return this.f20545a;
    }
}
