package com.dylanvann.fastimage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import jj.h;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c0;
import okio.j;
import okio.r;
import okio.r0;

/* JADX INFO: loaded from: classes3.dex */
public class FastImageOkHttpProgressGlideModule extends sj.c {
    private static final b progressListener = new b();

    class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21503a;

        a(d dVar) {
            this.f21503a = dVar;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Response responseProceed = chain.proceed(request);
            return responseProceed.newBuilder().body(new c(request.url().getUrl(), responseProceed.body(), this.f21503a)).build();
        }
    }

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, FastImageProgressListener> f21504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Long> f21505b;

        private boolean d(String str, long j11, long j12, float f11) {
            if (f11 != BitmapDescriptorFactory.HUE_RED && j11 != 0 && j12 != j11) {
                long j13 = (long) (((j11 * 100.0f) / j12) / f11);
                Long l11 = this.f21505b.get(str);
                if (l11 != null && j13 == l11.longValue()) {
                    return false;
                }
                this.f21505b.put(str, Long.valueOf(j13));
            }
            return true;
        }

        @Override // com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule.d
        public void a(String str, long j11, long j12) {
            FastImageProgressListener fastImageProgressListener = this.f21504a.get(str);
            if (fastImageProgressListener == null) {
                return;
            }
            if (j12 <= j11) {
                c(str);
            }
            if (d(str, j11, j12, fastImageProgressListener.getGranularityPercentage())) {
                fastImageProgressListener.onProgress(str, j11, j12);
            }
        }

        void b(String str, FastImageProgressListener fastImageProgressListener) {
            this.f21504a.put(str, fastImageProgressListener);
        }

        void c(String str) {
            this.f21504a.remove(str);
            this.f21505b.remove(str);
        }

        private b() {
            this.f21504a = new WeakHashMap();
            this.f21505b = new HashMap();
        }
    }

    private interface d {
        void a(String str, long j11, long j12);
    }

    private static Interceptor createInterceptor(d dVar) {
        return new a(dVar);
    }

    static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.b(str, fastImageProgressListener);
    }

    static void forget(String str) {
        progressListener.c(str);
    }

    @Override // sj.c
    public void registerComponents(@NonNull Context context, @NonNull com.bumptech.glide.c cVar, @NonNull Registry registry) {
        registry.r(h.class, InputStream.class, new com.bumptech.glide.integration.okhttp3.b.a(com.facebook.react.modules.network.h.f().newBuilder().addInterceptor(createInterceptor(progressListener)).build()));
    }

    private static class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ResponseBody f21507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f21508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f21509d;

        class a extends r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f21510a;

            a(r0 r0Var) {
                super(r0Var);
                this.f21510a = 0L;
            }

            @Override // okio.r, okio.r0
            public long read(okio.h hVar, long j11) {
                long j12 = super.read(hVar, j11);
                long contentLength = c.this.f21507b.getContentLength();
                if (j12 == -1) {
                    this.f21510a = contentLength;
                } else {
                    this.f21510a += j12;
                }
                c.this.f21508c.a(c.this.f21506a, this.f21510a, contentLength);
                return j12;
            }
        }

        c(String str, ResponseBody responseBody, d dVar) {
            this.f21506a = str;
            this.f21507b = responseBody;
            this.f21508c = dVar;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f21507b.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f21507b.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public j getBodySource() {
            if (this.f21509d == null) {
                this.f21509d = c0.d(source(this.f21507b.getBodySource()));
            }
            return this.f21509d;
        }

        private r0 source(r0 r0Var) {
            return new a(r0Var);
        }
    }
}
