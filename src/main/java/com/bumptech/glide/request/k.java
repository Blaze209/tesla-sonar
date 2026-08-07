package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k<R> implements e, uj.i, j {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yj.c f20879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f20880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h<R> f20881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f20882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f20883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.e f20884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f20885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class<R> f20886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f20887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f20888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f20889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.h f20890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final uj.j<R> f20891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<h<R>> f20892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final vj.c<? super R> f20893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Executor f20894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private fj.c<R> f20895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j.d f20896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f20897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f20898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f20899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f20900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f20901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f20902z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private k(Context context, com.bumptech.glide.e eVar, @NonNull Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i11, int i12, com.bumptech.glide.h hVar, uj.j<R> jVar, h<R> hVar2, List<h<R>> list, f fVar, com.bumptech.glide.load.engine.j jVar2, vj.c<? super R> cVar, Executor executor) {
        this.f20878b = E ? String.valueOf(super.hashCode()) : null;
        this.f20879c = yj.c.a();
        this.f20880d = obj;
        this.f20883g = context;
        this.f20884h = eVar;
        this.f20885i = obj2;
        this.f20886j = cls;
        this.f20887k = aVar;
        this.f20888l = i11;
        this.f20889m = i12;
        this.f20890n = hVar;
        this.f20891o = jVar;
        this.f20881e = hVar2;
        this.f20892p = list;
        this.f20882f = fVar;
        this.f20898v = jVar2;
        this.f20893q = cVar;
        this.f20894r = executor;
        this.f20899w = a.PENDING;
        if (this.D == null && eVar.g().a(com.bumptech.glide.d.c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(fj.c<R> cVar, R r11, dj.a aVar, boolean z11) {
        boolean z12;
        boolean z13;
        boolean zS = s();
        this.f20899w = a.COMPLETE;
        this.f20895s = cVar;
        if (this.f20884h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r11.getClass().getSimpleName() + " from " + aVar + " for " + this.f20885i + " with size [" + this.A + "x" + this.B + "] in " + xj.g.a(this.f20897u) + " ms");
        }
        x();
        boolean z14 = true;
        this.C = true;
        try {
            List<h<R>> list = this.f20892p;
            if (list != null) {
                z12 = false;
                for (h<R> hVar : list) {
                    R r12 = r11;
                    dj.a aVar2 = aVar;
                    boolean zOnResourceReady = hVar.onResourceReady(r12, this.f20885i, this.f20891o, aVar2, zS) | z12;
                    if (hVar instanceof c) {
                        z13 = z11;
                        zOnResourceReady |= ((c) hVar).b(r12, this.f20885i, this.f20891o, aVar2, zS, z13);
                    } else {
                        z13 = z11;
                    }
                    aVar = aVar2;
                    z11 = z13;
                    z12 = zOnResourceReady;
                    r11 = r12;
                }
            } else {
                z12 = false;
            }
            R r13 = r11;
            dj.a aVar3 = aVar;
            h<R> hVar2 = this.f20881e;
            if (hVar2 == null || !hVar2.onResourceReady(r13, this.f20885i, this.f20891o, aVar3, zS)) {
                z14 = false;
            }
            if (!(z14 | z12)) {
                this.f20891o.onResourceReady(r13, this.f20893q.a(aVar3, zS));
            }
            this.C = false;
            yj.b.f("GlideRequest", this.f20877a);
        } catch (Throwable th2) {
            this.C = false;
            throw th2;
        }
    }

    private void B() {
        if (l()) {
            Drawable drawableQ = this.f20885i == null ? q() : null;
            if (drawableQ == null) {
                drawableQ = p();
            }
            if (drawableQ == null) {
                drawableQ = r();
            }
            this.f20891o.onLoadFailed(drawableQ);
        }
    }

    private void j() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        f fVar = this.f20882f;
        return fVar == null || fVar.j(this);
    }

    private boolean l() {
        f fVar = this.f20882f;
        return fVar == null || fVar.c(this);
    }

    private boolean m() {
        f fVar = this.f20882f;
        return fVar == null || fVar.e(this);
    }

    private void n() {
        j();
        this.f20879c.c();
        this.f20891o.removeCallback(this);
        com.bumptech.glide.load.engine.j.d dVar = this.f20896t;
        if (dVar != null) {
            dVar.a();
            this.f20896t = null;
        }
    }

    private void o(Object obj) {
        List<h<R>> list = this.f20892p;
        if (list == null) {
            return;
        }
        for (h<R> hVar : list) {
            if (hVar instanceof c) {
                ((c) hVar).a(obj);
            }
        }
    }

    private Drawable p() {
        if (this.f20900x == null) {
            Drawable errorPlaceholder = this.f20887k.getErrorPlaceholder();
            this.f20900x = errorPlaceholder;
            if (errorPlaceholder == null && this.f20887k.getErrorId() > 0) {
                this.f20900x = t(this.f20887k.getErrorId());
            }
        }
        return this.f20900x;
    }

    private Drawable q() {
        if (this.f20902z == null) {
            Drawable fallbackDrawable = this.f20887k.getFallbackDrawable();
            this.f20902z = fallbackDrawable;
            if (fallbackDrawable == null && this.f20887k.getFallbackId() > 0) {
                this.f20902z = t(this.f20887k.getFallbackId());
            }
        }
        return this.f20902z;
    }

    private Drawable r() {
        if (this.f20901y == null) {
            Drawable placeholderDrawable = this.f20887k.getPlaceholderDrawable();
            this.f20901y = placeholderDrawable;
            if (placeholderDrawable == null && this.f20887k.getPlaceholderId() > 0) {
                this.f20901y = t(this.f20887k.getPlaceholderId());
            }
        }
        return this.f20901y;
    }

    private boolean s() {
        f fVar = this.f20882f;
        return fVar == null || !fVar.getRoot().a();
    }

    private Drawable t(int i11) {
        return nj.d.a(this.f20883g, i11, this.f20887k.getTheme() != null ? this.f20887k.getTheme() : this.f20883g.getTheme());
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f20878b);
    }

    private static int v(int i11, float f11) {
        return i11 == Integer.MIN_VALUE ? i11 : Math.round(f11 * i11);
    }

    private void w() {
        f fVar = this.f20882f;
        if (fVar != null) {
            fVar.h(this);
        }
    }

    private void x() {
        f fVar = this.f20882f;
        if (fVar != null) {
            fVar.b(this);
        }
    }

    public static <R> k<R> y(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i11, int i12, com.bumptech.glide.h hVar, uj.j<R> jVar, h<R> hVar2, List<h<R>> list, f fVar, com.bumptech.glide.load.engine.j jVar2, vj.c<? super R> cVar, Executor executor) {
        return new k<>(context, eVar, obj, obj2, cls, aVar, i11, i12, hVar, jVar, hVar2, list, fVar, jVar2, cVar, executor);
    }

    private void z(GlideException glideException, int i11) {
        boolean zOnLoadFailed;
        this.f20879c.c();
        synchronized (this.f20880d) {
            try {
                glideException.k(this.D);
                int iH = this.f20884h.h();
                if (iH <= i11) {
                    Log.w("Glide", "Load failed for [" + this.f20885i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                    if (iH <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.f20896t = null;
                this.f20899w = a.FAILED;
                w();
                boolean z11 = true;
                this.C = true;
                try {
                    List<h<R>> list = this.f20892p;
                    if (list != null) {
                        Iterator<h<R>> it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= it.next().onLoadFailed(glideException, this.f20885i, this.f20891o, s());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    h<R> hVar = this.f20881e;
                    if (hVar == null || !hVar.onLoadFailed(glideException, this.f20885i, this.f20891o, s())) {
                        z11 = false;
                    }
                    if (!(zOnLoadFailed | z11)) {
                        B();
                    }
                    this.C = false;
                    yj.b.f("GlideRequest", this.f20877a);
                } catch (Throwable th2) {
                    this.C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean a() {
        boolean z11;
        synchronized (this.f20880d) {
            z11 = this.f20899w == a.COMPLETE;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.j
    public void b(GlideException glideException) {
        z(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.j
    public void c(fj.c<?> cVar, dj.a aVar, boolean z11) {
        this.f20879c.c();
        fj.c<?> cVar2 = null;
        try {
            synchronized (this.f20880d) {
                try {
                    this.f20896t = null;
                    if (cVar == null) {
                        b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f20886j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj == null || !this.f20886j.isAssignableFrom(obj.getClass())) {
                            this.f20895s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f20886j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(cVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            b(new GlideException(sb2.toString()));
                        } else if (m()) {
                            A(cVar, obj, aVar, z11);
                            return;
                        } else {
                            this.f20895s = null;
                            this.f20899w = a.COMPLETE;
                            yj.b.f("GlideRequest", this.f20877a);
                        }
                        this.f20898v.l(cVar);
                    } catch (Throwable th2) {
                        cVar2 = cVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (cVar2 != null) {
                this.f20898v.l(cVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f20880d) {
            try {
                j();
                this.f20879c.c();
                a aVar = this.f20899w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                n();
                fj.c<R> cVar = this.f20895s;
                if (cVar != null) {
                    this.f20895s = null;
                } else {
                    cVar = null;
                }
                if (k()) {
                    this.f20891o.onLoadCleared(r());
                }
                yj.b.f("GlideRequest", this.f20877a);
                this.f20899w = aVar2;
                if (cVar != null) {
                    this.f20898v.l(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void d() {
        synchronized (this.f20880d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // uj.i
    public void e(int i11, int i12) throws Throwable {
        Object obj;
        k<R> kVar = this;
        kVar.f20879c.c();
        Object obj2 = kVar.f20880d;
        synchronized (obj2) {
            try {
                try {
                    boolean z11 = E;
                    if (z11) {
                        kVar.u("Got onSizeReady in " + xj.g.a(kVar.f20897u));
                    }
                    if (kVar.f20899w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        kVar.f20899w = aVar;
                        float sizeMultiplier = kVar.f20887k.getSizeMultiplier();
                        kVar.A = v(i11, sizeMultiplier);
                        kVar.B = v(i12, sizeMultiplier);
                        if (z11) {
                            kVar.u("finished setup for calling load in " + xj.g.a(kVar.f20897u));
                        }
                        try {
                            com.bumptech.glide.load.engine.j jVar = kVar.f20898v;
                            com.bumptech.glide.e eVar = kVar.f20884h;
                            try {
                                Object obj3 = kVar.f20885i;
                                dj.e signature = kVar.f20887k.getSignature();
                                try {
                                    int i13 = kVar.A;
                                    int i14 = kVar.B;
                                    Class<?> resourceClass = kVar.f20887k.getResourceClass();
                                    Class<R> cls = kVar.f20886j;
                                    try {
                                        com.bumptech.glide.h hVar = kVar.f20890n;
                                        fj.a diskCacheStrategy = kVar.f20887k.getDiskCacheStrategy();
                                        Map<Class<?>, dj.l<?>> transformations = kVar.f20887k.getTransformations();
                                        boolean zIsTransformationRequired = kVar.f20887k.isTransformationRequired();
                                        boolean zIsScaleOnlyOrNoTransform = kVar.f20887k.isScaleOnlyOrNoTransform();
                                        dj.h options = kVar.f20887k.getOptions();
                                        boolean zIsMemoryCacheable = kVar.f20887k.isMemoryCacheable();
                                        boolean useUnlimitedSourceGeneratorsPool = kVar.f20887k.getUseUnlimitedSourceGeneratorsPool();
                                        boolean useAnimationPool = kVar.f20887k.getUseAnimationPool();
                                        boolean onlyRetrieveFromCache = kVar.f20887k.getOnlyRetrieveFromCache();
                                        Executor executor = kVar.f20894r;
                                        Object obj4 = obj2;
                                        try {
                                            kVar.f20896t = jVar.g(eVar, obj3, signature, i13, i14, resourceClass, cls, hVar, diskCacheStrategy, transformations, zIsTransformationRequired, zIsScaleOnlyOrNoTransform, options, zIsMemoryCacheable, useUnlimitedSourceGeneratorsPool, useAnimationPool, onlyRetrieveFromCache, kVar, executor);
                                            if (kVar.f20899w != aVar) {
                                                kVar.f20896t = null;
                                            }
                                            if (z11) {
                                                kVar.u("finished onSizeReady in " + xj.g.a(kVar.f20897u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = obj2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj2;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = kVar;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z11;
        synchronized (this.f20880d) {
            z11 = this.f20899w == a.CLEARED;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        int i11;
        int i12;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(eVar instanceof k)) {
            return false;
        }
        synchronized (this.f20880d) {
            try {
                i11 = this.f20888l;
                i12 = this.f20889m;
                obj = this.f20885i;
                cls = this.f20886j;
                aVar = this.f20887k;
                hVar = this.f20890n;
                List<h<R>> list = this.f20892p;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k kVar = (k) eVar;
        synchronized (kVar.f20880d) {
            try {
                i13 = kVar.f20888l;
                i14 = kVar.f20889m;
                obj2 = kVar.f20885i;
                cls2 = kVar.f20886j;
                aVar2 = kVar.f20887k;
                hVar2 = kVar.f20890n;
                List<h<R>> list2 = kVar.f20892p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i11 == i13 && i12 == i14 && xj.l.d(obj, obj2) && cls.equals(cls2) && xj.l.c(aVar, aVar2) && hVar == hVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.j
    public Object h() {
        this.f20879c.c();
        return this.f20880d;
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f20880d) {
            try {
                j();
                this.f20879c.c();
                this.f20897u = xj.g.b();
                Object obj = this.f20885i;
                if (obj == null) {
                    if (xj.l.u(this.f20888l, this.f20889m)) {
                        this.A = this.f20888l;
                        this.B = this.f20889m;
                    }
                    z(new GlideException("Received null model"), q() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f20899w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f20895s, dj.a.MEMORY_CACHE, false);
                    return;
                }
                o(obj);
                this.f20877a = yj.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f20899w = aVar3;
                if (xj.l.u(this.f20888l, this.f20889m)) {
                    e(this.f20888l, this.f20889m);
                } else {
                    this.f20891o.getSize(this);
                }
                a aVar4 = this.f20899w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f20891o.onLoadStarted(r());
                }
                if (E) {
                    u("finished run method in " + xj.g.a(this.f20897u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f20880d) {
            z11 = this.f20899w == a.COMPLETE;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f20880d) {
            try {
                a aVar = this.f20899w;
                z11 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f20880d) {
            obj = this.f20885i;
            cls = this.f20886j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
