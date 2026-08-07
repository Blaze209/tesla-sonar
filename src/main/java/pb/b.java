package pb;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sb.m0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lpb/b;", "T", "Lpb/e;", "Lqb/h;", "tracker", "<init>", "(Lqb/h;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "Lkotlinx/coroutines/flow/Flow;", "Lob/b;", "b", "(Landroidx/work/e;)Lkotlinx/coroutines/flow/Flow;", "Lsb/m0;", "workSpec", "a", "(Lsb/m0;)Z", "Lqb/h;", "", "e", "()I", "getReason$annotations", "()V", AnalyticsAttribute.Reason, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qb.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lob/b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<ProducerScope<? super ob.b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102060n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f102061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b<T> f102062p;

        /* JADX INFO: renamed from: pb.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pb/b$a$a", "Lob/a;", "newValue", "Ljn0/h0;", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2160a implements ob.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<T> f102063a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProducerScope<ob.b> f102064b;

            /* JADX WARN: Multi-variable type inference failed */
            C2160a(b<T> bVar, ProducerScope<? super ob.b> producerScope) {
                this.f102063a = bVar;
                this.f102064b = producerScope;
            }

            @Override // ob.a
            public void a(T newValue) {
                this.f102064b.getChannel().mo85trySendJP2dKIU(this.f102063a.f(newValue) ? new ob.b.ConstraintsNotMet(this.f102063a.e()) : ob.b.a.f97044a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f102062p = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(b bVar, C2160a c2160a) {
            bVar.tracker.f(c2160a);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f102062p, continuation);
            aVar.f102061o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f102060n;
            if (i11 == 0) {
                t.b(obj);
                ProducerScope producerScope = (ProducerScope) this.f102061o;
                final C2160a c2160a = new C2160a(this.f102062p, producerScope);
                ((b) this.f102062p).tracker.c(c2160a);
                final b<T> bVar = this.f102062p;
                wn0.a aVar = new wn0.a() { // from class: pb.a
                    @Override // wn0.a
                    public final Object invoke() {
                        return b.a.b(bVar, c2160a);
                    }
                };
                this.f102060n = 1;
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
        public final Object invoke(ProducerScope<? super ob.b> producerScope, Continuation<? super h0> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(qb.h<T> tracker) {
        s.k(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // pb.e
    public boolean a(m0 workSpec) {
        s.k(workSpec, "workSpec");
        return c(workSpec) && f(this.tracker.e());
    }

    @Override // pb.e
    public Flow<ob.b> b(androidx.work.e constraints) {
        s.k(constraints, "constraints");
        return FlowKt.callbackFlow(new a(this, null));
    }

    /* JADX INFO: renamed from: e */
    protected abstract int getReason();

    protected abstract boolean f(T value);
}
