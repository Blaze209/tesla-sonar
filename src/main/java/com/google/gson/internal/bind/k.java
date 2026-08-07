package com.google.gson.internal.bind;

import bx.b0;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends x<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f44910c = f(v.DOUBLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f44911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f44912b;

    class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f44913a;

        a(w wVar) {
            this.f44913a = wVar;
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Object.class) {
                return new k(fVar, this.f44913a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44914a;

        static {
            int[] iArr = new int[ex.b.values().length];
            f44914a = iArr;
            try {
                iArr[ex.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44914a[ex.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44914a[ex.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44914a[ex.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44914a[ex.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44914a[ex.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ k(com.google.gson.f fVar, w wVar, a aVar) {
        this(fVar, wVar);
    }

    public static y e(w wVar) {
        return wVar == v.DOUBLE ? f44910c : f(wVar);
    }

    private static y f(w wVar) {
        return new a(wVar);
    }

    private Object g(ex.a aVar, ex.b bVar) throws IOException {
        int i11 = b.f44914a[bVar.ordinal()];
        if (i11 == 3) {
            return aVar.O();
        }
        if (i11 == 4) {
            return this.f44912b.readNumber(aVar);
        }
        if (i11 == 5) {
            return Boolean.valueOf(aVar.nextBoolean());
        }
        if (i11 == 6) {
            aVar.c0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(ex.a aVar, ex.b bVar) throws IOException {
        int i11 = b.f44914a[bVar.ordinal()];
        if (i11 == 1) {
            aVar.f();
            return new ArrayList();
        }
        if (i11 != 2) {
            return null;
        }
        aVar.h();
        return new b0();
    }

    @Override // com.google.gson.x
    public Object b(ex.a aVar) throws IOException {
        ex.b bVarN0 = aVar.n0();
        Object objH = h(aVar, bVarN0);
        if (objH == null) {
            return g(aVar, bVarN0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strL = objH instanceof Map ? aVar.L() : null;
                ex.b bVarN1 = aVar.n0();
                Object objH2 = h(aVar, bVarN1);
                boolean z11 = objH2 != null;
                if (objH2 == null) {
                    objH2 = g(aVar, bVarN1);
                }
                if (objH instanceof List) {
                    ((List) objH).add(objH2);
                } else {
                    ((Map) objH).put(strL, objH2);
                }
                if (z11) {
                    arrayDeque.addLast(objH);
                    objH = objH2;
                }
            } else {
                if (objH instanceof List) {
                    aVar.e();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return objH;
                }
                objH = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    public void d(ex.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.k0();
            return;
        }
        x xVarM = this.f44911a.m(obj.getClass());
        if (!(xVarM instanceof k)) {
            xVarM.d(cVar, obj);
        } else {
            cVar.t();
            cVar.H();
        }
    }

    private k(com.google.gson.f fVar, w wVar) {
        this.f44911a = fVar;
        this.f44912b = wVar;
    }
}
