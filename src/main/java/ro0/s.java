package ro0;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import vo0.f1;
import vo0.g1;
import vo0.t1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "Lco0/d;", "Lro0/d;", "a", "(Lco0/d;)Lro0/d;", "b", "kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class s {
    public static final <T> d<T> a(co0.d<T> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        d<T> dVarB = r.b(dVar);
        if (dVarB != null) {
            return dVarB;
        }
        g1.e(dVar);
        throw new KotlinNothingValueException();
    }

    public static final <T> d<T> b(co0.d<T> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        d<T> dVarB = f1.b(dVar);
        return dVarB == null ? t1.b(dVar) : dVarB;
    }
}
