package expo.modules.kotlin.activityresult;

import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.kotlin.activityaware.AppCompatActivityAware;
import expo.modules.kotlin.activityaware.AppCompatActivityAwareHelper;
import expo.modules.kotlin.activityaware.OnActivityAvailableListener;
import expo.modules.kotlin.providers.CurrentActivityProvider;
import ezvcard.property.Gender;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012JT\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\b\b\u0000\u0010\u0015*\u00020\u0014\"\u0004\b\u0001\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;", "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "currentActivityProvider", "<init>", "(Lexpo/modules/kotlin/providers/CurrentActivityProvider;)V", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/appcompat/app/c;", "activity", "onHostResume", "(Landroidx/appcompat/app/c;)V", "onHostDestroy", "Ljava/io/Serializable;", "I", Gender.OTHER, "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "fallbackCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "registerForActivityResult", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnActivityAvailableListener", "(Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;)V", "removeOnActivityAvailableListener", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;", "registry", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;", "activityAwareHelper", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityResultsManager implements AppContextActivityResultCaller, AppCompatActivityAware {
    private final AppCompatActivityAwareHelper activityAwareHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final AppContextActivityResultRegistry registry;

    /* JADX INFO: renamed from: expo.modules.kotlin.activityresult.ActivityResultsManager$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.activityresult.ActivityResultsManager$1", f = "ActivityResultsManager.kt", i = {0}, l = {101}, m = "invokeSuspend", n = {"$this$withActivityAvailable$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return ActivityResultsManager.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [expo.modules.kotlin.activityaware.OnActivityAvailableListener, expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                final ActivityResultsManager activityResultsManager = ActivityResultsManager.this;
                this.L$0 = activityResultsManager;
                this.L$1 = activityResultsManager;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                final ?? r11 = new OnActivityAvailableListener() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1
                    @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
                    public void onActivityAvailable(androidx.appcompat.app.c activity) {
                        Object objB;
                        s.k(activity, "activity");
                        if (cancellableContinuationImpl.isActive()) {
                            activityResultsManager.removeOnActivityAvailableListener(this);
                            CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                            try {
                                jn0.s.Companion companion = jn0.s.INSTANCE;
                                activityResultsManager.registry.restoreInstanceState(activity);
                                objB = jn0.s.b(h0.f84049a);
                            } catch (Throwable th2) {
                                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                                objB = jn0.s.b(t.a(th2));
                            }
                            cancellableContinuation.resumeWith(objB);
                        }
                    }
                };
                activityResultsManager.addOnActivityAvailableListener(r11);
                cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, h0>() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$2
                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                        invoke2(th2);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        activityResultsManager.removeOnActivityAvailableListener(r11);
                    }
                });
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public ActivityResultsManager(CurrentActivityProvider currentActivityProvider) {
        s.k(currentActivityProvider, "currentActivityProvider");
        this.registry = new AppContextActivityResultRegistry(currentActivityProvider);
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityAwareHelper = new AppCompatActivityAwareHelper();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // expo.modules.kotlin.activityaware.AppCompatActivityAware
    public void addOnActivityAvailableListener(OnActivityAvailableListener listener) {
        s.k(listener, "listener");
        this.activityAwareHelper.addOnActivityAvailableListener(listener);
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.registry.dispatchResult(requestCode, resultCode, data);
    }

    public final void onHostDestroy(androidx.appcompat.app.c activity) {
        s.k(activity, "activity");
        this.registry.persistInstanceState(activity);
    }

    public final void onHostResume(androidx.appcompat.app.c activity) {
        s.k(activity, "activity");
        this.activityAwareHelper.dispatchOnActivityAvailable(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [expo.modules.kotlin.activityaware.OnActivityAvailableListener, expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$1] */
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultCaller
    public <I extends Serializable, O> Object registerForActivityResult(final AppContextActivityResultContract<I, O> appContextActivityResultContract, final AppContextActivityResultFallbackCallback<I, O> appContextActivityResultFallbackCallback, Continuation<? super AppContextActivityResultLauncher<I, O>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final ?? r11 = new OnActivityAvailableListener() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$1
            @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
            public void onActivityAvailable(androidx.appcompat.app.c activity) {
                Object objB;
                s.k(activity, "activity");
                if (cancellableContinuationImpl.isActive()) {
                    this.removeOnActivityAvailableListener(this);
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    try {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        objB = jn0.s.b(this.registry.register("AppContext_rq#" + this.nextLocalRequestCode.getAndIncrement(), activity, appContextActivityResultContract, appContextActivityResultFallbackCallback));
                    } catch (Throwable th2) {
                        jn0.s.Companion companion2 = jn0.s.INSTANCE;
                        objB = jn0.s.b(t.a(th2));
                    }
                    cancellableContinuation.resumeWith(objB);
                }
            }
        };
        addOnActivityAvailableListener(r11);
        cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, h0>() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$2
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                invoke2(th2);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                this.removeOnActivityAvailableListener(r11);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // expo.modules.kotlin.activityaware.AppCompatActivityAware
    public void removeOnActivityAvailableListener(OnActivityAvailableListener listener) {
        s.k(listener, "listener");
        this.activityAwareHelper.removeOnActivityAvailableListener(listener);
    }
}
