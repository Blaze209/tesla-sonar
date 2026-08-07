package co0;

import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lco0/k;", "T", "V", "Lco0/o;", "Lco0/i;", "receiver", "value", "Ljn0/h0;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lco0/k$a;", "getSetter", "()Lco0/k$a;", "setter", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k<T, V> extends o<T, V>, i<V> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lco0/k$a;", "T", "V", "Lco0/i$a;", "Lkotlin/Function2;", "Ljn0/h0;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a<T, V> extends i.a<V>, wn0.p<T, V, h0> {
    }

    @Override // co0.i
    a<T, V> getSetter();

    void h(T receiver, V value);
}
