package com.android.volley.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.e> f20252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f20254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f20255e;

    public f(int i11, List<com.android.volley.e> list) {
        this(i11, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f20254d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f20255e != null) {
            return new ByteArrayInputStream(this.f20255e);
        }
        return null;
    }

    public final int b() {
        return this.f20253c;
    }

    public final List<com.android.volley.e> c() {
        return Collections.unmodifiableList(this.f20252b);
    }

    public final int d() {
        return this.f20251a;
    }

    public f(int i11, List<com.android.volley.e> list, int i12, InputStream inputStream) {
        this.f20251a = i11;
        this.f20252b = list;
        this.f20253c = i12;
        this.f20254d = inputStream;
        this.f20255e = null;
    }
}
