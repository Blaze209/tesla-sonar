package sq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pq.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f111532e = new C2384a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f111533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f111534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f111535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f111536d;

    /* JADX INFO: renamed from: sq.a$a, reason: collision with other inner class name */
    public static final class C2384a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f111537a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f111538b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f111539c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f111540d = "";

        C2384a() {
        }

        public C2384a a(d dVar) {
            this.f111538b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f111537a, Collections.unmodifiableList(this.f111538b), this.f111539c, this.f111540d);
        }

        public C2384a c(String str) {
            this.f111540d = str;
            return this;
        }

        public C2384a d(b bVar) {
            this.f111539c = bVar;
            return this;
        }

        public C2384a e(f fVar) {
            this.f111537a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f111533a = fVar;
        this.f111534b = list;
        this.f111535c = bVar;
        this.f111536d = str;
    }

    public static C2384a e() {
        return new C2384a();
    }

    @uv.d(tag = 4)
    public String a() {
        return this.f111536d;
    }

    @uv.d(tag = 3)
    public b b() {
        return this.f111535c;
    }

    @uv.d(tag = 2)
    public List<d> c() {
        return this.f111534b;
    }

    @uv.d(tag = 1)
    public f d() {
        return this.f111533a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
