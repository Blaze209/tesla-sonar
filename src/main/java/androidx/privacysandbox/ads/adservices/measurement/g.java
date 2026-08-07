package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import d6.k;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/g;", "Landroidx/privacysandbox/ads/adservices/measurement/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "Ljn0/h0;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/i;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/h;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/privacysandbox/ads/adservices/measurement/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/j;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MeasurementManager mMeasurementManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13038n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f13039o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h f13040p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f13041q;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
        static final class C0215a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13042n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f13043o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f13044p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13045q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f13046r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Uri f13047s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ h f13048t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0215a(g gVar, Uri uri, h hVar, Continuation<? super C0215a> continuation) {
                super(2, continuation);
                this.f13046r = gVar;
                this.f13047s = uri;
                this.f13048t = hVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0215a(this.f13046r, this.f13047s, this.f13048t, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f13045q;
                if (i11 == 0) {
                    t.b(obj);
                    g gVar = this.f13046r;
                    Uri uri = this.f13047s;
                    h hVar = this.f13048t;
                    this.f13042n = gVar;
                    this.f13043o = uri;
                    this.f13044p = hVar;
                    this.f13045q = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    gVar.getMMeasurementManager().registerSource(uri, hVar.getInputEvent(), new k(), q5.j.a(cancellableContinuationImpl));
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0215a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13040p = hVar;
            this.f13041q = gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f13040p, this.f13041q, continuation);
            aVar.f13039o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13038n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f13039o;
            List<Uri> listB = this.f13040p.b();
            g gVar = this.f13041q;
            h hVar = this.f13040p;
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0215a(gVar, (Uri) it.next(), hVar, null), 3, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(MeasurementManager mMeasurementManager) {
        s.k(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    static /* synthetic */ Object h(g gVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super h0> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        gVar.getMMeasurementManager();
        throw null;
    }

    static /* synthetic */ Object j(g gVar, Continuation<? super Integer> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        gVar.getMMeasurementManager().getMeasurementApiStatus(new k(), q5.j.a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static /* synthetic */ Object k(g gVar, Uri uri, InputEvent inputEvent, Continuation<? super h0> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        gVar.getMMeasurementManager().registerSource(uri, inputEvent, new k(), q5.j.a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    static /* synthetic */ Object l(g gVar, h hVar, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(hVar, gVar, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    static /* synthetic */ Object m(g gVar, Uri uri, Continuation<? super h0> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        gVar.getMMeasurementManager().registerTrigger(uri, new k(), q5.j.a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    static /* synthetic */ Object n(g gVar, i iVar, Continuation<? super h0> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        gVar.getMMeasurementManager();
        throw null;
    }

    static /* synthetic */ Object o(g gVar, j jVar, Continuation<? super h0> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        gVar.getMMeasurementManager();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super h0> continuation) {
        return h(this, aVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(Continuation<? super Integer> continuation) {
        return j(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, Continuation<? super h0> continuation) {
        return k(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(h hVar, Continuation<? super h0> continuation) {
        return l(this, hVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, Continuation<? super h0> continuation) {
        return m(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(i iVar, Continuation<? super h0> continuation) {
        return n(this, iVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(j jVar, Continuation<? super h0> continuation) {
        return o(this, jVar, continuation);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
