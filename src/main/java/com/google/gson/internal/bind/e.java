package com.google.gson.internal.bind;

import bx.v;
import com.google.gson.r;
import com.google.gson.x;
import com.google.gson.y;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f44889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y f44890d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f44891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, y> f44892b = new ConcurrentHashMap();

    private static class b implements y {
        private b() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f44889c = new b();
        f44890d = new b();
    }

    public e(v vVar) {
        this.f44891a = vVar;
    }

    private static Object b(v vVar, Class<?> cls) {
        return vVar.w(com.google.gson.reflect.a.get((Class) cls), true).construct();
    }

    private static ax.b c(Class<?> cls) {
        return (ax.b) cls.getAnnotation(ax.b.class);
    }

    private y f(Class<?> cls, y yVar) {
        y yVarPutIfAbsent = this.f44892b.putIfAbsent(cls, yVar);
        return yVarPutIfAbsent != null ? yVarPutIfAbsent : yVar;
    }

    @Override // com.google.gson.y
    public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        ax.b bVarC = c(aVar.getRawType());
        if (bVarC == null) {
            return null;
        }
        return (x<T>) d(this.f44891a, fVar, aVar, bVarC, true);
    }

    x<?> d(v vVar, com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, ax.b bVar, boolean z11) {
        x<?> xVarA;
        Object objB = b(vVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objB instanceof x) {
            xVarA = (x) objB;
        } else if (objB instanceof y) {
            y yVarF = (y) objB;
            if (z11) {
                yVarF = f(aVar.getRawType(), yVarF);
            }
            xVarA = yVarF.a(fVar, aVar);
        } else {
            boolean z12 = objB instanceof r;
            if (!z12 && !(objB instanceof com.google.gson.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objB.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            n nVar = new n(z12 ? (r) objB : null, objB instanceof com.google.gson.k ? (com.google.gson.k) objB : null, fVar, aVar, z11 ? f44889c : f44890d, zNullSafe);
            zNullSafe = false;
            xVarA = nVar;
        }
        return (xVarA == null || !zNullSafe) ? xVarA : xVarA.a();
    }

    public boolean e(com.google.gson.reflect.a<?> aVar, y yVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(yVar);
        if (yVar == f44889c) {
            return true;
        }
        Class<? super Object> rawType = aVar.getRawType();
        y yVar2 = this.f44892b.get(rawType);
        if (yVar2 != null) {
            return yVar2 == yVar;
        }
        ax.b bVarC = c(rawType);
        if (bVarC == null) {
            return false;
        }
        Class<?> clsValue = bVarC.value();
        return y.class.isAssignableFrom(clsValue) && f(rawType, (y) b(this.f44891a, clsValue)) == yVar;
    }
}
