package oc;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Loc/b;", "P", "T", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Lkotlin/Function1;", "initializer", "<init>", "(Lwn0/l;)V", "parameter", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwn0/l;", "b", "Ljava/lang/Object;", "_value", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<P, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l<? super P, ? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object _value = d.f97100a;

    public b(l<? super P, ? extends T> lVar) {
        this.initializer = lVar;
    }

    public final T a(P parameter) {
        T tInvoke;
        T t11 = (T) this._value;
        d dVar = d.f97100a;
        if (t11 != dVar) {
            return t11;
        }
        synchronized (this) {
            tInvoke = (T) this._value;
            if (tInvoke == dVar) {
                l<? super P, ? extends T> lVar = this.initializer;
                s.h(lVar);
                tInvoke = lVar.invoke(parameter);
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }
}
