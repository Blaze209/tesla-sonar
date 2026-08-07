package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import t2.b;
import wn0.a;
import z2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lr2/y3;", "Lr2/m3;", "policy", "c", "(Lr2/m3;Lwn0/a;)Lr2/y3;", "Lt2/b;", "Lr2/i0;", "b", "()Lt2/b;", "Lr2/t3;", "Lz2/d;", "a", "Lr2/t3;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t3<IntRef> f106743a = new t3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t3<b<i0>> f106744b = new t3<>();

    public static final b<i0> b() {
        t3<b<i0>> t3Var = f106744b;
        b<i0> bVarA = t3Var.a();
        if (bVarA != null) {
            return bVarA;
        }
        b<i0> bVar = new b<>(new i0[0], 0);
        t3Var.b(bVar);
        return bVar;
    }

    public static final <T> y3<T> c(m3<T> m3Var, a<? extends T> aVar) {
        return new g0(aVar, m3Var);
    }

    public static final <T> y3<T> d(a<? extends T> aVar) {
        return new g0(aVar, null);
    }
}
