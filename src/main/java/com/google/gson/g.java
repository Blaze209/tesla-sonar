package com.google.gson;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bx.w f44853a = bx.w.f18205g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f44854b = s.DEFAULT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f44855c = c.IDENTITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f44856d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<y> f44857e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<y> f44858f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44859g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44860h = f.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44861i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44862j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44863k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44864l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44865m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f44866n = f.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44867o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private u f44868p = f.f44822z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44869q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f44870r = f.D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private w f44871s = f.E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque<t> f44872t = new ArrayDeque<>();

    private static void a(String str, int i11, int i12, List<y> list) {
        y yVarB;
        y yVarB2;
        boolean z11 = com.google.gson.internal.sql.d.f45004a;
        y yVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            yVarB = com.google.gson.internal.bind.c.b.f44883b.b(str);
            if (z11) {
                yVarA = com.google.gson.internal.sql.d.f45006c.b(str);
                yVarB2 = com.google.gson.internal.sql.d.f45005b.b(str);
            } else {
                yVarB2 = null;
            }
        } else {
            if (i11 == 2 && i12 == 2) {
                return;
            }
            y yVarA2 = com.google.gson.internal.bind.c.b.f44883b.a(i11, i12);
            if (z11) {
                yVarA = com.google.gson.internal.sql.d.f45006c.a(i11, i12);
                y yVarA3 = com.google.gson.internal.sql.d.f45005b.a(i11, i12);
                yVarB = yVarA2;
                yVarB2 = yVarA3;
            } else {
                yVarB = yVarA2;
                yVarB2 = null;
            }
        }
        list.add(yVarB);
        if (z11) {
            list.add(yVarA);
            list.add(yVarB2);
        }
    }

    private static boolean c(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f44857e.size() + this.f44858f.size() + 3);
        arrayList.addAll(this.f44857e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f44858f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f44860h, this.f44861i, this.f44862j, arrayList);
        return new f(this.f44853a, this.f44855c, new HashMap(this.f44856d), this.f44859g, this.f44863k, this.f44867o, this.f44865m, this.f44866n, this.f44868p, this.f44864l, this.f44869q, this.f44854b, this.f44860h, this.f44861i, this.f44862j, new ArrayList(this.f44857e), new ArrayList(this.f44858f), arrayList, this.f44870r, this.f44871s, new ArrayList(this.f44872t));
    }

    public g d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z11 = obj instanceof r;
        if (!z11 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof x)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof h) {
            this.f44856d.put(type, (h) obj);
        }
        if (z11 || (obj instanceof k)) {
            this.f44857e.add(com.google.gson.internal.bind.n.g(com.google.gson.reflect.a.get(type), obj));
        }
        if (obj instanceof x) {
            this.f44857e.add(com.google.gson.internal.bind.p.a(com.google.gson.reflect.a.get(type), (x) obj));
        }
        return this;
    }

    public g e(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e11);
            }
        }
        this.f44860h = str;
        return this;
    }

    public g f(c cVar) {
        return g(cVar);
    }

    public g g(d dVar) {
        Objects.requireNonNull(dVar);
        this.f44855c = dVar;
        return this;
    }
}
