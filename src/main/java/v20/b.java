package v20;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;

/* JADX INFO: loaded from: classes6.dex */
public final class b<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f117640a;

    public b(h<T> hVar) {
        this.f117640a = hVar;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) {
        return kVar.B() == k.c.NULL ? (T) kVar.o() : this.f117640a.fromJson(kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, T t11) {
        if (t11 == null) {
            rVar.c0();
        } else {
            this.f117640a.toJson(rVar, t11);
        }
    }

    public String toString() {
        return this.f117640a + ".nullSafe()";
    }
}
