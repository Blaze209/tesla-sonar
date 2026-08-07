package ob;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.z;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sb.m0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lob/g;", "Lpb/e;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "Lkotlinx/coroutines/flow/Flow;", "Lob/b;", "b", "(Landroidx/work/e;)Lkotlinx/coroutines/flow/Flow;", "Lsb/m0;", "workSpec", "", "c", "(Lsb/m0;)Z", "a", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements pb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMs;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lob/b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<ProducerScope<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97056n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f97057o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.work.e f97058p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f97059q;

        /* JADX INFO: renamed from: ob.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        static final class C2075a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f97060n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ g f97061o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ProducerScope<b> f97062p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2075a(g gVar, ProducerScope<? super b> producerScope, Continuation<? super C2075a> continuation) {
                super(2, continuation);
                this.f97061o = gVar;
                this.f97062p = producerScope;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2075a(this.f97061o, this.f97062p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f97060n;
                if (i11 == 0) {
                    t.b(obj);
                    long j11 = this.f97061o.timeoutMs;
                    this.f97060n = 1;
                    if (DelayKt.delay(j11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                z.e().a(n.f97080a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f97061o.timeoutMs + " ms");
                this.f97062p.mo85trySendJP2dKIU(new b.ConstraintsNotMet(7));
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2075a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.e eVar, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f97058p = eVar;
            this.f97059q = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 c(Job job, ProducerScope producerScope, b bVar) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            producerScope.mo85trySendJP2dKIU(bVar);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 e(wn0.a aVar) {
            aVar.invoke();
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f97058p, this.f97059q, continuation);
            aVar.f97057o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f97056n;
            if (i11 == 0) {
                t.b(obj);
                final ProducerScope producerScope = (ProducerScope) this.f97057o;
                NetworkRequest networkRequestD = this.f97058p.d();
                if (networkRequestD == null) {
                    SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                    return h0.f84049a;
                }
                final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C2075a(this.f97059q, producerScope, null), 3, null);
                wn0.l<? super b, h0> lVar = new wn0.l() { // from class: ob.e
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return g.a.c(jobLaunch$default, producerScope, (b) obj2);
                    }
                };
                final wn0.a<h0> aVarB = Build.VERSION.SDK_INT >= 30 ? k.f97069a.b(this.f97059q.connManager, networkRequestD, lVar) : d.INSTANCE.b(this.f97059q.connManager, networkRequestD, lVar);
                wn0.a aVar = new wn0.a() { // from class: ob.f
                    @Override // wn0.a
                    public final Object invoke() {
                        return g.a.e(aVarB);
                    }
                };
                this.f97056n = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
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
        public final Object invoke(ProducerScope<? super b> producerScope, Continuation<? super h0> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(ConnectivityManager connManager, long j11) {
        s.k(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j11;
    }

    @Override // pb.e
    public boolean a(m0 workSpec) {
        s.k(workSpec, "workSpec");
        if (c(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // pb.e
    public Flow<b> b(androidx.work.e constraints) {
        s.k(constraints, "constraints");
        return FlowKt.callbackFlow(new a(constraints, this, null));
    }

    @Override // pb.e
    public boolean c(m0 workSpec) {
        s.k(workSpec, "workSpec");
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.d() != null;
    }

    public /* synthetic */ g(ConnectivityManager connectivityManager, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i11 & 2) != 0 ? 1000L : j11);
    }
}
