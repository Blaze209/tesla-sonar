package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x<T> {

    private final class b extends x<T> {
        private b() {
        }

        @Override // com.google.gson.x
        public T b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return (T) x.this.b(aVar);
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ex.c cVar, T t11) throws IOException {
            if (t11 == null) {
                cVar.k0();
            } else {
                x.this.d(cVar, t11);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + x.this + "]";
        }
    }

    public final x<T> a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T b(ex.a aVar);

    public final l c(T t11) {
        try {
            com.google.gson.internal.bind.h hVar = new com.google.gson.internal.bind.h();
            d(hVar, t11);
            return hVar.U0();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public abstract void d(ex.c cVar, T t11);
}
