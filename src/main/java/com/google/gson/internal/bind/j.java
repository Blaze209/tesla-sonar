package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends x<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y f44906b = f(v.LAZILY_PARSED_NUMBER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f44907a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return j.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44909a;

        static {
            int[] iArr = new int[ex.b.values().length];
            f44909a = iArr;
            try {
                iArr[ex.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44909a[ex.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44909a[ex.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private j(w wVar) {
        this.f44907a = wVar;
    }

    public static y e(w wVar) {
        return wVar == v.LAZILY_PARSED_NUMBER ? f44906b : f(wVar);
    }

    private static y f(w wVar) {
        return new j(wVar).new a();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(ex.a aVar) throws IOException {
        ex.b bVarN0 = aVar.n0();
        int i11 = b.f44909a[bVarN0.ordinal()];
        if (i11 == 1) {
            aVar.c0();
            return null;
        }
        if (i11 == 2 || i11 == 3) {
            return this.f44907a.readNumber(aVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + bVarN0 + "; at path " + aVar.getPath());
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, Number number) throws IOException {
        cVar.K0(number);
    }
}
