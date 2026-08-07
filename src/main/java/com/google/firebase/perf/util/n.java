package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f44564a;

    public n(URL url) {
        this.f44564a = url;
    }

    public URLConnection a() {
        return this.f44564a.openConnection();
    }

    public String toString() {
        return this.f44564a.toString();
    }
}
