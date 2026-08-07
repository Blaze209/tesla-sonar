package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import java.io.InputStream;
import jj.h;
import jj.o;
import jj.p;
import jj.s;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public class b implements o<h, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Call.Factory f20497a;

    public static class a implements p<h, InputStream> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile Call.Factory f20498b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Call.Factory f20499a;

        public a() {
            this(a());
        }

        private static Call.Factory a() {
            if (f20498b == null) {
                synchronized (a.class) {
                    try {
                        if (f20498b == null) {
                            f20498b = new OkHttpClient();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f20498b;
        }

        @Override // jj.p
        public void d() {
        }

        @Override // jj.p
        @NonNull
        public o<h, InputStream> e(s sVar) {
            return new b(this.f20499a);
        }

        public a(@NonNull Call.Factory factory) {
            this.f20499a = factory;
        }
    }

    public b(@NonNull Call.Factory factory) {
        this.f20497a = factory;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@NonNull h hVar, int i11, int i12, @NonNull dj.h hVar2) {
        return new o.a<>(hVar, new cj.a(this.f20497a, hVar));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull h hVar) {
        return true;
    }
}
