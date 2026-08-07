package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final List<h.e> f49501e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h.e> f49502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<d> f49504c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, h<?>> f49505d = new LinkedHashMap();

    class a implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f49506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f49507b;

        a(Type type, h hVar) {
            this.f49506a = type;
            this.f49507b = hVar;
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            if (set.isEmpty() && v20.c.w(this.f49506a, type)) {
                return this.f49507b;
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<h.e> f49508a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49509b = 0;

        public b a(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f49508a;
            int i11 = this.f49509b;
            this.f49509b = i11 + 1;
            list.add(i11, eVar);
            return this;
        }

        public b b(Object obj) {
            if (obj != null) {
                return a(com.squareup.moshi.a.c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> b c(Type type, h<T> hVar) {
            return a(u.h(type, hVar));
        }

        public u d() {
            return new u(this);
        }
    }

    static final class c<T> extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Type f49510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f49511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f49512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        h<T> f49513d;

        c(Type type, String str, Object obj) {
            this.f49510a = type;
            this.f49511b = str;
            this.f49512c = obj;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) {
            h<T> hVar = this.f49513d;
            if (hVar != null) {
                return hVar.fromJson(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, T t11) {
            h<T> hVar = this.f49513d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.toJson(rVar, t11);
        }

        public String toString() {
            h<T> hVar = this.f49513d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<c<?>> f49514a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Deque<c<?>> f49515b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f49516c;

        d() {
        }

        <T> void a(h<T> hVar) {
            this.f49515b.getLast().f49513d = hVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f49516c) {
                this.f49516c = true;
                if (this.f49515b.size() != 1 || this.f49515b.getFirst().f49511b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<c<?>> itDescendingIterator = this.f49515b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        c<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f49510a);
                        if (next.f49511b != null) {
                            sb2.append(' ');
                            sb2.append(next.f49511b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void c(boolean z11) {
            this.f49515b.removeLast();
            if (this.f49515b.isEmpty()) {
                u.this.f49504c.remove();
                if (z11) {
                    synchronized (u.this.f49505d) {
                        try {
                            int size = this.f49514a.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                c<?> cVar = this.f49514a.get(i11);
                                h<T> hVar = (h) u.this.f49505d.put(cVar.f49512c, cVar.f49513d);
                                if (hVar != 0) {
                                    cVar.f49513d = hVar;
                                    u.this.f49505d.put(cVar.f49512c, hVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        <T> h<T> d(Type type, String str, Object obj) {
            int size = this.f49514a.size();
            for (int i11 = 0; i11 < size; i11++) {
                c<?> cVar = this.f49514a.get(i11);
                if (cVar.f49512c.equals(obj)) {
                    this.f49515b.add(cVar);
                    h<T> hVar = (h<T>) cVar.f49513d;
                    return hVar != null ? hVar : cVar;
                }
            }
            c<?> cVar2 = new c<>(type, str, obj);
            this.f49514a.add(cVar2);
            this.f49515b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f49501e = arrayList;
        arrayList.add(w.f49519a);
        arrayList.add(e.f49399b);
        arrayList.add(t.f49498c);
        arrayList.add(com.squareup.moshi.b.f49379c);
        arrayList.add(v.f49518a);
        arrayList.add(com.squareup.moshi.d.f49392d);
    }

    u(b bVar) {
        int size = bVar.f49508a.size();
        List<h.e> list = f49501e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f49508a);
        arrayList.addAll(list);
        this.f49502a = Collections.unmodifiableList(arrayList);
        this.f49503b = bVar.f49509b;
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    static <T> h.e h(Type type, h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (hVar != null) {
            return new a(type, hVar);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> h<T> c(Class<T> cls) {
        return e(cls, v20.c.f117641a);
    }

    public <T> h<T> d(Type type) {
        return e(type, v20.c.f117641a);
    }

    public <T> h<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    public <T> h<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = v20.c.p(v20.c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f49505d) {
            try {
                h<T> hVar = (h) this.f49505d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                d dVar = this.f49504c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.f49504c.set(dVar);
                }
                h<T> hVarD = dVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        dVar.c(false);
                        return hVarD;
                    }
                    try {
                        int size = this.f49502a.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            h<T> hVar2 = (h<T>) this.f49502a.get(i11).create(typeP, set, this);
                            if (hVar2 != null) {
                                dVar.a(hVar2);
                                dVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + v20.c.u(typeP, set));
                    } catch (IllegalArgumentException e11) {
                        throw dVar.b(e11);
                    }
                } catch (Throwable th2) {
                    dVar.c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public <T> h<T> i(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = v20.c.p(v20.c.a(type));
        int iIndexOf = this.f49502a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f49502a.size();
        for (int i11 = iIndexOf + 1; i11 < size; i11++) {
            h<T> hVar = (h<T>) this.f49502a.get(i11).create(typeP, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + v20.c.u(typeP, set));
    }
}
