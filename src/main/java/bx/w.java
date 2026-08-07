package bx;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements com.google.gson.y, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f18205g = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f18206a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18207b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18208c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f18210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f18211f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends com.google.gson.x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile com.google.gson.x<T> f18212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f18215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f18216e;

        a(boolean z11, boolean z12, com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
            this.f18213b = z11;
            this.f18214c = z12;
            this.f18215d = fVar;
            this.f18216e = aVar;
        }

        private com.google.gson.x<T> e() {
            com.google.gson.x<T> xVar = this.f18212a;
            if (xVar != null) {
                return xVar;
            }
            com.google.gson.x<T> xVarN = this.f18215d.n(w.this, this.f18216e);
            this.f18212a = xVarN;
            return xVarN;
        }

        @Override // com.google.gson.x
        public T b(ex.a aVar) throws IOException {
            if (!this.f18213b) {
                return e().b(aVar);
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ex.c cVar, T t11) throws IOException {
            if (this.f18214c) {
                cVar.k0();
            } else {
                e().d(cVar, t11);
            }
        }
    }

    public w() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f18210e = list;
        this.f18211f = list;
    }

    private static boolean e(Class<?> cls) {
        return cls.isMemberClass() && !dx.a.n(cls);
    }

    private boolean f(ax.d dVar) {
        if (dVar != null) {
            return this.f18206a >= dVar.value();
        }
        return true;
    }

    private boolean g(ax.e eVar) {
        if (eVar != null) {
            return this.f18206a < eVar.value();
        }
        return true;
    }

    private boolean h(ax.d dVar, ax.e eVar) {
        return f(dVar) && g(eVar);
    }

    @Override // com.google.gson.y
    public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean zC = c(rawType, true);
        boolean zC2 = c(rawType, false);
        if (zC || zC2) {
            return new a(zC2, zC, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w clone() {
        try {
            return (w) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean c(Class<?> cls, boolean z11) {
        if (this.f18206a != -1.0d && !h((ax.d) cls.getAnnotation(ax.d.class), (ax.e) cls.getAnnotation(ax.e.class))) {
            return true;
        }
        if (!this.f18208c && e(cls)) {
            return true;
        }
        if (!z11 && !Enum.class.isAssignableFrom(cls) && dx.a.l(cls)) {
            return true;
        }
        Iterator<com.google.gson.a> it = (z11 ? this.f18210e : this.f18211f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(Field field, boolean z11) {
        ax.a aVar;
        if ((this.f18207b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f18206a != -1.0d && !h((ax.d) field.getAnnotation(ax.d.class), (ax.e) field.getAnnotation(ax.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f18209d && ((aVar = (ax.a) field.getAnnotation(ax.a.class)) == null || (!z11 ? aVar.deserialize() : aVar.serialize()))) || c(field.getType(), z11)) {
            return true;
        }
        List<com.google.gson.a> list = z11 ? this.f18210e : this.f18211f;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
