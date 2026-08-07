package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f20494a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f20495a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f20494a = Collections.unmodifiableMap(new HashMap(aVar.f20495a));
    }

    public boolean a(Class<Object> cls) {
        return this.f20494a.containsKey(cls);
    }
}
