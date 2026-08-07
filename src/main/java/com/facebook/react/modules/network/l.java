package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.c0;
import okio.r;
import okio.r0;

/* JADX INFO: loaded from: classes3.dex */
public class l extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResponseBody f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private okio.j f22842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22843d = 0;

    class a extends r {
        a(r0 r0Var) {
            super(r0Var);
        }

        @Override // okio.r, okio.r0
        public long read(okio.h hVar, long j11) {
            long j12 = super.read(hVar, j11);
            l.this.f22843d += j12 != -1 ? j12 : 0L;
            l.this.f22841b.a(l.this.f22843d, l.this.f22840a.getContentLength(), j12 == -1);
            return j12;
        }
    }

    public l(ResponseBody responseBody, j jVar) {
        this.f22840a = responseBody;
        this.f22841b = jVar;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.f22840a.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.f22840a.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public okio.j getBodySource() {
        if (this.f22842c == null) {
            this.f22842c = c0.d(source(this.f22840a.getBodySource()));
        }
        return this.f22842c;
    }

    public long t() {
        return this.f22843d;
    }

    private r0 source(r0 r0Var) {
        return new a(r0Var);
    }
}
