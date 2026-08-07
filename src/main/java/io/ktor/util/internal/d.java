package io.ktor.util.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0012\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00072\n\u0010\u000f\u001a\u00060\u0000j\u0002`\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001e\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r¨\u0006\u001f"}, d2 = {"Lio/ktor/util/internal/d;", "", "<init>", "()V", "Lio/ktor/util/internal/f;", IntegerTokenConverter.CONVERTER_KEY, "()Lio/ktor/util/internal/f;", "Lio/ktor/util/internal/Node;", "next", "Ljn0/h0;", "c", "(Lio/ktor/util/internal/d;)V", "g", "()Lio/ktor/util/internal/d;", "b", "_prev", "Lio/ktor/util/internal/e;", "op", "a", "(Lio/ktor/util/internal/d;Lio/ktor/util/internal/e;)Lio/ktor/util/internal/d;", "", "h", "()Z", "f", "", "toString", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "e", "nextNode", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f78526a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f78527b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78528c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    private final d a(d _prev, e op2) {
        Object obj;
        while (true) {
            d dVar = null;
            while (true) {
                obj = _prev._next;
                if (obj == op2) {
                    return _prev;
                }
                if (obj instanceof e) {
                    ((e) obj).a(_prev);
                } else if (!(obj instanceof f)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof f) {
                        return null;
                    }
                    if (obj != this) {
                        s.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        dVar = _prev;
                        _prev = (d) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        if (androidx.concurrent.futures.b.a(f78527b, this, obj2, _prev) && !(_prev._prev instanceof f)) {
                            return null;
                        }
                    }
                } else {
                    if (dVar != null) {
                        break;
                    }
                    _prev = c.a(_prev._prev);
                }
            }
            _prev.g();
            androidx.concurrent.futures.b.a(f78526a, dVar, _prev, ((f) obj).ref);
            _prev = dVar;
        }
    }

    private final d b() {
        d dVarE = this;
        while (!(dVarE instanceof b)) {
            dVarE = dVarE.e();
            if (dVarE == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return dVarE;
    }

    private final void c(d next) {
        f();
        next.a(c.a(this._prev), null);
    }

    private final d g() {
        Object obj;
        d dVarB;
        do {
            obj = this._prev;
            if (obj instanceof f) {
                return ((f) obj).ref;
            }
            if (obj == this) {
                dVarB = b();
            } else {
                s.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                dVarB = (d) obj;
            }
        } while (!androidx.concurrent.futures.b.a(f78527b, this, obj, dVarB.i()));
        return (d) obj;
    }

    private final f i() {
        f fVar = (f) this._removedRef;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        f78528c.lazySet(this, fVar2);
        return fVar2;
    }

    public final Object d() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof e)) {
                return obj;
            }
            ((e) obj).a(this);
        }
    }

    public final d e() {
        return c.a(d());
    }

    public final void f() {
        Object objD;
        d dVarG = g();
        Object obj = this._next;
        s.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        d dVar = ((f) obj).ref;
        while (true) {
            d dVar2 = null;
            while (true) {
                Object objD2 = dVar.d();
                if (objD2 instanceof f) {
                    dVar.g();
                    dVar = ((f) objD2).ref;
                } else {
                    objD = dVarG.d();
                    if (objD instanceof f) {
                        if (dVar2 != null) {
                            break;
                        } else {
                            dVarG = c.a(dVarG._prev);
                        }
                    } else if (objD != this) {
                        s.i(objD, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        d dVar3 = (d) objD;
                        if (dVar3 == dVar) {
                            return;
                        }
                        dVar2 = dVarG;
                        dVarG = dVar3;
                    } else if (androidx.concurrent.futures.b.a(f78526a, dVarG, this, dVar)) {
                        return;
                    }
                }
            }
            dVarG.g();
            androidx.concurrent.futures.b.a(f78526a, dVar2, dVarG, ((f) objD).ref);
            dVarG = dVar2;
        }
    }

    public boolean h() {
        Object objD;
        d dVar;
        do {
            objD = d();
            if ((objD instanceof f) || objD == this) {
                return false;
            }
            s.i(objD, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            dVar = (d) objD;
        } while (!androidx.concurrent.futures.b.a(f78526a, this, objD, dVar.i()));
        c(dVar);
        return true;
    }

    public String toString() {
        return o0.b(getClass()).l() + '@' + hashCode();
    }
}
