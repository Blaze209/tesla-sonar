package v20;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;

/* JADX INFO: loaded from: classes6.dex */
public final class a<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f117639a;

    public a(h<T> hVar) {
        this.f117639a = hVar;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) {
        if (kVar.B() != k.c.NULL) {
            return this.f117639a.fromJson(kVar);
        }
        throw new JsonDataException("Unexpected null at " + kVar.getPath());
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, T t11) {
        if (t11 != null) {
            this.f117639a.toJson(rVar, t11);
            return;
        }
        throw new JsonDataException("Unexpected null at " + rVar.getPath());
    }

    public String toString() {
        return this.f117639a + ".nonNull()";
    }
}
