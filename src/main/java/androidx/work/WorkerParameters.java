package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f14436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f14437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f14438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f14439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f14441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CoroutineContext f14442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ub.b f14443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y0 f14444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k0 f14445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n f14446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14447l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f14448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f14449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f14450c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f14448a = list;
            this.f14449b = list;
        }
    }

    public WorkerParameters(UUID uuid, g gVar, Collection<String> collection, a aVar, int i11, int i12, Executor executor, CoroutineContext coroutineContext, ub.b bVar, y0 y0Var, k0 k0Var, n nVar) {
        this.f14436a = uuid;
        this.f14437b = gVar;
        this.f14438c = new HashSet(collection);
        this.f14439d = aVar;
        this.f14440e = i11;
        this.f14447l = i12;
        this.f14441f = executor;
        this.f14442g = coroutineContext;
        this.f14443h = bVar;
        this.f14444i = y0Var;
        this.f14445j = k0Var;
        this.f14446k = nVar;
    }

    public Executor a() {
        return this.f14441f;
    }

    public n b() {
        return this.f14446k;
    }

    public int c() {
        return this.f14447l;
    }

    public UUID d() {
        return this.f14436a;
    }

    public g e() {
        return this.f14437b;
    }

    public Network f() {
        return this.f14439d.f14450c;
    }

    public k0 g() {
        return this.f14445j;
    }

    public int h() {
        return this.f14440e;
    }

    public a i() {
        return this.f14439d;
    }

    public Set<String> j() {
        return this.f14438c;
    }

    public ub.b k() {
        return this.f14443h;
    }

    public List<String> l() {
        return this.f14439d.f14448a;
    }

    public List<Uri> m() {
        return this.f14439d.f14449b;
    }

    public CoroutineContext n() {
        return this.f14442g;
    }

    public y0 o() {
        return this.f14444i;
    }
}
