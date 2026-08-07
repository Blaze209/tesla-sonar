package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import lw.h;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class d implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Callback f44505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f44506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f44507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f44508d;

    public d(Callback callback, k kVar, l lVar, long j11) {
        this.f44505a = callback;
        this.f44506b = h.c(kVar);
        this.f44508d = j11;
        this.f44507c = lVar;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl httpUrlUrl = request.url();
            if (httpUrlUrl != null) {
                this.f44506b.z(httpUrlUrl.url().toString());
            }
            if (request.method() != null) {
                this.f44506b.k(request.method());
            }
        }
        this.f44506b.s(this.f44508d);
        this.f44506b.x(this.f44507c.c());
        nw.d.d(this.f44506b);
        this.f44505a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, this.f44506b, this.f44508d, this.f44507c.c());
        this.f44505a.onResponse(call, response);
    }
}
