package sq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f111549c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f111550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f111551b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f111552a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f111553b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f111552a, Collections.unmodifiableList(this.f111553b));
        }

        public a b(List<c> list) {
            this.f111553b = list;
            return this;
        }

        public a c(String str) {
            this.f111552a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f111550a = str;
        this.f111551b = list;
    }

    public static a c() {
        return new a();
    }

    @uv.d(tag = 2)
    public List<c> a() {
        return this.f111551b;
    }

    @uv.d(tag = 1)
    public String b() {
        return this.f111550a;
    }
}
