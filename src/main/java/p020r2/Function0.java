package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import jn0.h0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.a;
import wn0.l;
import wn0.p;

/* JADX INFO: renamed from: r2.o0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0010\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001a\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010\u001e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aK\u0010 \u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006*"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "effect", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/a;Lr2/l;I)V", "", "key1", "Lkotlin/Function1;", "Lr2/l0;", "Lr2/k0;", "c", "(Ljava/lang/Object;Lwn0/l;Lr2/l;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/l;Lr2/l;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwn0/l;Lr2/l;I)V", "", "keys", DateTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;Lwn0/l;Lr2/l;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "g", "(Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", "h", "([Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr2/l;", "composer", "k", "(Lkotlin/coroutines/CoroutineContext;Lr2/l;)Lkotlinx/coroutines/CoroutineScope;", "Lr2/l0;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l0 f106740a = new l0();

    public static final void a(Object obj, Object obj2, Object obj3, l<? super l0, ? extends k0> lVar, l lVar2, int i11) {
        if (o.J()) {
            o.S(-1239538271, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean zN = lVar2.n(obj) | lVar2.n(obj2) | lVar2.n(obj3);
        Object objI = lVar2.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new j0(lVar);
            lVar2.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void b(Object obj, Object obj2, l<? super l0, ? extends k0> lVar, l lVar2, int i11) {
        if (o.J()) {
            o.S(1429097729, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean zN = lVar2.n(obj) | lVar2.n(obj2);
        Object objI = lVar2.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new j0(lVar);
            lVar2.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void c(Object obj, l<? super l0, ? extends k0> lVar, l lVar2, int i11) {
        if (o.J()) {
            o.S(-1371986847, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zN = lVar2.n(obj);
        Object objI = lVar2.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new j0(lVar);
            lVar2.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void d(Object[] objArr, l<? super l0, ? extends k0> lVar, l lVar2, int i11) {
        if (o.J()) {
            o.S(-1307627122, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean zN = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zN |= lVar2.n(obj);
        }
        Object objI = lVar2.I();
        if (zN || objI == l.INSTANCE.a()) {
            lVar2.B(new j0(lVar));
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-54093371, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext coroutineContextA = lVar.A();
        boolean zN = lVar.n(obj) | lVar.n(obj2) | lVar.n(obj3);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new b1(coroutineContextA, pVar);
            lVar.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void f(Object obj, Object obj2, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(590241125, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext coroutineContextA = lVar.A();
        boolean zN = lVar.n(obj) | lVar.n(obj2);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new b1(coroutineContextA, pVar);
            lVar.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void g(Object obj, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(1179185413, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        CoroutineContext coroutineContextA = lVar.A();
        boolean zN = lVar.n(obj);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new b1(coroutineContextA, pVar);
            lVar.B(objI);
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void h(Object[] objArr, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-139560008, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        CoroutineContext coroutineContextA = lVar.A();
        boolean zN = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zN |= lVar.n(obj);
        }
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            lVar.B(new b1(coroutineContextA, pVar));
        }
        if (o.J()) {
            o.R();
        }
    }

    public static final void i(a<h0> aVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-1288466761, i11, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        lVar.E(aVar);
        if (o.J()) {
            o.R();
        }
    }

    public static final CoroutineScope k(CoroutineContext coroutineContext, l lVar) {
        Job.Companion companion = Job.INSTANCE;
        if (coroutineContext.get(companion) == null) {
            CoroutineContext coroutineContextA = lVar.A();
            return CoroutineScopeKt.CoroutineScope(coroutineContextA.plus(JobKt.Job((Job) coroutineContextA.get(companion))).plus(coroutineContext));
        }
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        completableJobJob$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.CoroutineScope(completableJobJob$default);
    }
}
