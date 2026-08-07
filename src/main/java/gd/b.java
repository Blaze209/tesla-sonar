package gd;

import android.app.Activity;
import android.app.Application;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.s0;
import ce.PermissionRequestData;
import ce.t;
import ce.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.m;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.Threeds2ChallengeAction;
import com.adyen.checkout.core.exception.CheckoutException;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import je.g;
import jn0.h0;
import ke.GenericComponentParams;
import kf.r;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u00019B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00110)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\u001f\u00101\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u0010\u0013J\u0017\u00106\u001a\u00020\u00112\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010GR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010O\u001a\u0004\b@\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010WR \u0010Z\u001a\b\u0012\u0004\u0012\u00020V0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bY\u0010PR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u0002040U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u0002040N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010O\u001a\u0004\bR\u0010PR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010WR \u0010c\u001a\b\u0012\u0004\u0012\u00020_0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010O\u001a\u0004\bb\u0010PR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010$\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010\u0019\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lgd/b;", "Lgd/c;", "Lce/t;", "Lce/e;", "observerRepository", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lbe/d;", "checkoutConfiguration", "Lke/k;", "componentParams", "Lgd/a;", "actionDelegateProvider", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Lce/e;Landroidx/lifecycle/s0;Lbe/d;Lke/k;Lgd/a;Landroid/app/Application;)V", "Ljn0/h0;", "K", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "y", "(Lcom/adyen/checkout/components/core/action/Action;)V", "Lje/a;", "delegate", "D", "(Lje/a;)V", "", "C", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "E", Gender.FEMALE, "G", "H", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "g", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "J", "Landroid/app/Activity;", "activity", "v", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "I", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "r", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "b", "a", "Lce/e;", "Landroidx/lifecycle/s0;", "k", "()Landroidx/lifecycle/s0;", "c", "Lbe/d;", DateTokenConverter.CONVERTER_KEY, "Lke/k;", "A", "()Lke/k;", "Lgd/a;", "f", "Landroid/app/Application;", "Lje/a;", "_delegate", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkf/f;", "h", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_viewFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "viewFlow", "j", "Lkotlinx/coroutines/CoroutineScope;", "_coroutineScope", "Lkotlinx/coroutines/channels/Channel;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "Lkotlinx/coroutines/channels/Channel;", "detailsChannel", "l", "detailsFlow", "m", "exceptionChannel", "n", "exceptionFlow", "Lce/s;", "o", "permissionChannel", "p", "permissionFlow", "Lkotlin/Function0;", "q", "Lwn0/a;", "onRedirectListener", "Lce/u;", "z", "()Lcom/adyen/checkout/components/core/action/Action;", "B", "()Lkotlinx/coroutines/CoroutineScope;", "getDelegate", "()Lje/a;", "s", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements gd.c, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ce.e observerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final be.d checkoutConfiguration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final GenericComponentParams componentParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a actionDelegateProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private je.a _delegate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<kf.f> _viewFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Flow<kf.f> viewFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope _coroutineScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Channel<ActionComponentData> detailsChannel;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Flow<ActionComponentData> detailsFlow;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Channel<CheckoutException> exceptionChannel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Flow<CheckoutException> exceptionFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Channel<PermissionRequestData> permissionChannel;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Flow<PermissionRequestData> permissionFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onRedirectListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u action;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f68735t = {o0.k(new f0(b.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/Action;", 0))};

    /* JADX INFO: renamed from: gd.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class C1404b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {
        C1404b() {
            super(0);
        }

        public final void b() {
            b.this.I();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adyen/checkout/components/core/ActionComponentData;", "it", "Ljn0/h0;", "<anonymous>", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeDetails$2", f = "DefaultGenericActionDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<ActionComponentData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68755n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f68756o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ActionComponentData actionComponentData, Continuation<? super h0> continuation) {
            return ((c) create(actionComponentData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f68756o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68755n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this.detailsChannel.mo85trySendJP2dKIU((ActionComponentData) this.f68756o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adyen/checkout/core/exception/CheckoutException;", "it", "Ljn0/h0;", "<anonymous>", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeExceptions$2", f = "DefaultGenericActionDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CheckoutException, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f68759o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CheckoutException checkoutException, Continuation<? super h0> continuation) {
            return ((d) create(checkoutException, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = b.this.new d(continuation);
            dVar.f68759o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68758n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this.exceptionChannel.mo85trySendJP2dKIU((CheckoutException) this.f68759o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/s;", "it", "Ljn0/h0;", "<anonymous>", "(Lce/s;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observePermissionRequests$2", f = "DefaultGenericActionDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<PermissionRequestData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68761n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f68762o;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PermissionRequestData permissionRequestData, Continuation<? super h0> continuation) {
            return ((e) create(permissionRequestData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = b.this.new e(continuation);
            eVar.f68762o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68761n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this.permissionChannel.mo85trySendJP2dKIU((PermissionRequestData) this.f68762o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkf/f;", "it", "Ljn0/h0;", "<anonymous>", "(Lkf/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeViewFlow$2", f = "DefaultGenericActionDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<kf.f, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68764n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f68765o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kf.f fVar, Continuation<? super h0> continuation) {
            return ((f) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f68765o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68764n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this._viewFlow.tryEmit((kf.f) this.f68765o);
            return h0.f84049a;
        }
    }

    public b(ce.e observerRepository, s0 savedStateHandle, be.d checkoutConfiguration, GenericComponentParams componentParams, a actionDelegateProvider, Application application) {
        s.k(observerRepository, "observerRepository");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(componentParams, "componentParams");
        s.k(actionDelegateProvider, "actionDelegateProvider");
        s.k(application, "application");
        this.observerRepository = observerRepository;
        this.savedStateHandle = savedStateHandle;
        this.checkoutConfiguration = checkoutConfiguration;
        this.componentParams = componentParams;
        this.actionDelegateProvider = actionDelegateProvider;
        this.application = application;
        MutableStateFlow<kf.f> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._viewFlow = MutableStateFlow;
        this.viewFlow = MutableStateFlow;
        Channel<ActionComponentData> channelA = le.b.a();
        this.detailsChannel = channelA;
        this.detailsFlow = FlowKt.receiveAsFlow(channelA);
        Channel<CheckoutException> channelA2 = le.b.a();
        this.exceptionChannel = channelA2;
        this.exceptionFlow = FlowKt.receiveAsFlow(channelA2);
        Channel<PermissionRequestData> channelA3 = le.b.a();
        this.permissionChannel = channelA3;
        this.permissionFlow = FlowKt.receiveAsFlow(channelA3);
        this.action = new u("ACTION_KEY");
    }

    private final CoroutineScope B() {
        CoroutineScope coroutineScope = this._coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final boolean C(Action action) {
        me.a aVar;
        me.b bVarA;
        StringBuilder sb2;
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf((this._delegate instanceof md.b) && (action instanceof Threeds2ChallengeAction));
        } catch (ClassNotFoundException e11) {
            e = e11;
            aVar = me.a.WARN;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                bVarA = companion.a();
                sb2 = new StringBuilder();
                sb2.append("CO.");
                sb2.append("runCompileOnly");
                bVarA.b(aVar, sb2.toString(), "Class not found. Are you missing a dependency?", e);
            }
            boolValueOf = null;
        } catch (NoClassDefFoundError e12) {
            e = e12;
            aVar = me.a.WARN;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar)) {
                bVarA = companion2.a();
                sb2 = new StringBuilder();
                sb2.append("CO.");
                sb2.append("runCompileOnly");
                bVarA.b(aVar, sb2.toString(), "Class not found. Are you missing a dependency?", e);
            }
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final void D(je.a delegate) {
        E(delegate);
        F(delegate);
        G(delegate);
        H(delegate);
    }

    private final void E(je.a delegate) {
        if (delegate instanceof je.c) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = b.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Observing details", null);
            }
            FlowKt.launchIn(FlowKt.onEach(((je.c) delegate).l(), new c(null)), B());
        }
    }

    private final void F(je.a delegate) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = b.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Observing exceptions", null);
        }
        FlowKt.launchIn(FlowKt.onEach(delegate.j(), new d(null)), B());
    }

    private final void G(je.a delegate) {
        if (delegate instanceof je.e) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = b.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Observing permission requests", null);
            }
            FlowKt.launchIn(FlowKt.onEach(((je.e) delegate).p(), new e(null)), B());
        }
    }

    private final void H(je.a delegate) {
        if (delegate instanceof r) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = b.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Observing view flow", null);
            }
            FlowKt.launchIn(FlowKt.onEach(((r) delegate).d(), new f(null)), B());
        }
    }

    private final void K() {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = b.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Restoring state", null);
        }
        Action actionZ = z();
        if (this._delegate != null || actionZ == null) {
            return;
        }
        y(actionZ);
    }

    private final void y(Action action) {
        wn0.a<h0> aVar;
        je.a aVarA = this.actionDelegateProvider.a(action, this.checkoutConfiguration, getSavedStateHandle(), this.application);
        this._delegate = aVarA;
        me.a aVar2 = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar2)) {
            String name = b.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar2, "CO." + name, "Created delegate of type " + o0.b(aVarA.getClass()).l(), null);
        }
        if ((aVarA instanceof je.f) && (aVar = this.onRedirectListener) != null) {
            ((je.f) aVarA).f(aVar);
        }
        aVarA.g(B());
        D(aVarA);
    }

    private final Action z() {
        return (Action) this.action.getValue(this, f68735t[0]);
    }

    @Override // je.b
    /* JADX INFO: renamed from: A, reason: from getter and merged with bridge method [inline-methods] */
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    public void I() {
        je.a aVar = this._delegate;
        if (aVar instanceof g) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar2)) {
                String name = b.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar2, "CO." + name, "Refreshing status", null);
            }
            ((g) aVar).w();
        }
    }

    public void J() {
        this.observerRepository.b();
    }

    @Override // je.b
    public void b() {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = b.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "onCleared", null);
        }
        J();
        je.a aVar2 = this._delegate;
        if (aVar2 != null) {
            aVar2.b();
        }
        this._delegate = null;
        this._coroutineScope = null;
        this.onRedirectListener = null;
    }

    @Override // kf.r
    public Flow<kf.f> d() {
        return this.viewFlow;
    }

    @Override // je.b
    public void g(CoroutineScope coroutineScope) {
        s.k(coroutineScope, "coroutineScope");
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = b.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "initialize", null);
        }
        this._coroutineScope = coroutineScope;
        K();
    }

    @Override // gd.c
    public je.a getDelegate() {
        je.a aVar = this._delegate;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // je.a
    public void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super ce.b, h0> callback) {
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(coroutineScope, "coroutineScope");
        s.k(callback, "callback");
        this.observerRepository.a(l(), j(), p(), lifecycleOwner, coroutineScope, callback);
        le.g.a(lifecycleOwner, new C1404b());
    }

    @Override // je.a
    public Flow<CheckoutException> j() {
        return this.exceptionFlow;
    }

    @Override // ce.t
    /* JADX INFO: renamed from: k, reason: from getter */
    public s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @Override // je.c
    public Flow<ActionComponentData> l() {
        return this.detailsFlow;
    }

    @Override // je.e
    public Flow<PermissionRequestData> p() {
        return this.permissionFlow;
    }

    @Override // je.a
    public void r(CheckoutException e11) {
        s.k(e11, "e");
        getDelegate().r(e11);
    }

    @Override // je.a
    public void v(Action action, Activity activity) {
        s.k(action, "action");
        s.k(activity, "activity");
        if (C(action)) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = b.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Continuing the handling of 3ds2 challenge with old flow.", null);
            }
        } else {
            y(action);
        }
        getDelegate().v(action, activity);
    }
}
