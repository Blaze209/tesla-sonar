package jn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ljn0/u;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lwn0/a;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Lwn0/a;", "", "b", "Ljava/lang/Object;", "_value", "c", "getFinal$annotations", "()V", "final", "getValue", "()Ljava/lang/Object;", "value", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<u<?>, Object> f84065e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile wn0.a<? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object final;

    public u(wn0.a<? extends T> initializer) {
        p013kotlin.jvm.internal.s.k(initializer, "initializer");
        this.initializer = initializer;
        e0 e0Var = e0.f84043a;
        this._value = e0Var;
        this.final = e0Var;
    }

    @Override // p013kotlin.Lazy
    public T getValue() {
        T t11 = (T) this._value;
        e0 e0Var = e0.f84043a;
        if (t11 != e0Var) {
            return t11;
        }
        wn0.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f84065e, this, e0Var, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    @Override // p013kotlin.Lazy
    public boolean isInitialized() {
        return this._value != e0.f84043a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
