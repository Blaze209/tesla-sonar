package p020r2;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import t2.b;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"r2/o3", "r2/p3", "r2/q3", "r2/r3", "r2/s3"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class n3 {
    public static final <T extends R, R> y3<R> a(Flow<? extends T> flow, R r11, CoroutineContext coroutineContext, l lVar, int i11, int i12) {
        return q3.b(flow, r11, coroutineContext, lVar, i11, i12);
    }

    public static final <T> y3<T> b(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, l lVar, int i11, int i12) {
        return q3.c(stateFlow, coroutineContext, lVar, i11, i12);
    }

    public static final b<i0> c() {
        return o3.b();
    }

    public static final <T> y3<T> d(m3<T> m3Var, a<? extends T> aVar) {
        return o3.c(m3Var, aVar);
    }

    public static final <T> y3<T> e(a<? extends T> aVar) {
        return o3.d(aVar);
    }

    public static final <T> SnapshotStateList<T> f() {
        return s3.a();
    }

    public static final <T> SnapshotStateList<T> g(T... tArr) {
        return s3.b(tArr);
    }

    public static final <T> p1<T> h(T t11, m3<T> m3Var) {
        return s3.c(t11, m3Var);
    }

    public static final <T> m3<T> j() {
        return r3.a();
    }

    public static final <T> y3<T> k(T t11, Object obj, Object obj2, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        return p3.a(t11, obj, obj2, pVar, lVar, i11);
    }

    public static final <T> y3<T> l(T t11, Object obj, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        return p3.b(t11, obj, pVar, lVar, i11);
    }

    public static final <T> y3<T> m(T t11, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        return p3.c(t11, pVar, lVar, i11);
    }

    public static final <T> m3<T> n() {
        return r3.b();
    }

    public static final <T> y3<T> o(T t11, l lVar, int i11) {
        return s3.e(t11, lVar, i11);
    }

    public static final <T> Flow<T> p(a<? extends T> aVar) {
        return q3.e(aVar);
    }

    public static final <T> m3<T> q() {
        return r3.c();
    }
}
