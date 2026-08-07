package com.google.firebase.crashlytics.ndk;

import gv.f0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f44115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f44116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f44117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f44118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f44119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f44120g;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f44121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f44122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f44123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f44124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private File f44125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f44126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private File f44127g;

        b() {
        }

        b h(File file) {
            this.f44125e = file;
            return this;
        }

        f i() {
            return new f(this);
        }

        b j(File file) {
            this.f44126f = file;
            return this;
        }

        b k(File file) {
            this.f44123c = file;
            return this;
        }

        b l(c cVar) {
            this.f44121a = cVar;
            return this;
        }

        b m(File file) {
            this.f44127g = file;
            return this;
        }

        b n(File file) {
            this.f44124d = file;
            return this;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f44128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.a f44129b;

        c(File file, f0.a aVar) {
            this.f44128a = file;
            this.f44129b = aVar;
        }

        boolean a() {
            File file = this.f44128a;
            return (file != null && file.exists()) || this.f44129b != null;
        }
    }

    private f(b bVar) {
        this.f44114a = bVar.f44121a;
        this.f44115b = bVar.f44122b;
        this.f44116c = bVar.f44123c;
        this.f44117d = bVar.f44124d;
        this.f44118e = bVar.f44125e;
        this.f44119f = bVar.f44126f;
        this.f44120g = bVar.f44127g;
    }
}
