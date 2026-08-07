package si0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import androidx.p003lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import oi0.Option;
import oi0.c2;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import ui0.e0;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lsi0/k;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lkotlin/Function0;", "Ljn0/h0;", "callback", "q", "(Lwn0/a;)V", "", "visible", "hasTitle", "r", "(ZZ)V", "s", "()V", "Loi0/c2;", "component", "Lkotlin/Function1;", "", "Loi0/e4;", "onItemsSelectedListener", "u", "(Loi0/c2;Lwn0/l;)V", "m", "()Z", "a", "Landroid/view/ViewGroup;", "Lkotlin/Lazy;", "Lri0/a;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Lkotlin/Lazy;", "lazyBinding", "c", "Z", "setup", "", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "bottomSheetStateChangeListener", "o", "()Lri0/a;", "getBinding$delegate", "(Lsi0/k;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy<ri0.a> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super Integer, h0> bottomSheetStateChangeListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f111245o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f111247q;

        /* JADX INFO: renamed from: si0.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C2372a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f111248n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f111249o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CompletableJob f111250p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k f111251q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f111252r;

            /* JADX INFO: renamed from: si0.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C2373a implements wn0.l<WindowInsetsCompat, h0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j0 f111253a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CancellableContinuation<h0> f111254b;

                /* JADX WARN: Multi-variable type inference failed */
                C2373a(j0 j0Var, CancellableContinuation<? super h0> cancellableContinuation) {
                    this.f111253a = j0Var;
                    this.f111254b = cancellableContinuation;
                }

                public final void a(WindowInsetsCompat insets) {
                    s.k(insets, "insets");
                    if (this.f111253a.f86523a) {
                        return;
                    }
                    k5.e eVarF = insets.f(WindowInsetsCompat.n.c());
                    s.j(eVarF, "getInsets(...)");
                    if (eVarF.f84927d > 0) {
                        this.f111253a.f86523a = true;
                        CancellableContinuation<h0> cancellableContinuation = this.f111254b;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(WindowInsetsCompat windowInsetsCompat) {
                    a(windowInsetsCompat);
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: si0.k$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f111255n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ wn0.a<h0> f111256o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(wn0.a<h0> aVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f111256o = aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f111256o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f111255n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f111256o.invoke();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2372a(CompletableJob completableJob, k kVar, wn0.a<h0> aVar, Continuation<? super C2372a> continuation) {
                super(2, continuation);
                this.f111250p = completableJob;
                this.f111251q = kVar;
                this.f111252r = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2372a(this.f111250p, this.f111251q, this.f111252r, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L17;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f111249o
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jn0.t.b(r8)
                    goto L78
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    java.lang.Object r1 = r7.f111248n
                    si0.k r1 = (si0.k) r1
                    jn0.t.b(r8)
                    goto L62
                L23:
                    jn0.t.b(r8)
                    si0.k r8 = r7.f111251q
                    r7.f111248n = r8
                    r7.f111249o = r4
                    kotlinx.coroutines.CancellableContinuationImpl r1 = new kotlinx.coroutines.CancellableContinuationImpl
                    kotlin.coroutines.Continuation r5 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
                    r1.<init>(r5, r4)
                    r1.initCancellability()
                    kotlin.jvm.internal.j0 r5 = new kotlin.jvm.internal.j0
                    r5.<init>()
                    ri0.a r8 = si0.k.k(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    java.lang.String r6 = "getRoot(...)"
                    p013kotlin.jvm.internal.s.j(r8, r6)
                    si0.k$a$a$a r6 = new si0.k$a$a$a
                    r6.<init>(r5, r1)
                    ki0.f.g(r8, r6)
                    java.lang.Object r8 = r1.getResult()
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r8 != r1) goto L5f
                    p013kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
                L5f:
                    if (r8 != r0) goto L62
                    goto L77
                L62:
                    kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                    si0.k$a$a$b r1 = new si0.k$a$a$b
                    wn0.a<jn0.h0> r5 = r7.f111252r
                    r1.<init>(r5, r3)
                    r7.f111248n = r3
                    r7.f111249o = r2
                    java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                    if (r8 != r0) goto L78
                L77:
                    return r0
                L78:
                    kotlinx.coroutines.CompletableJob r8 = r7.f111250p
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r8, r3, r4, r3)
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: si0.k.a.C2372a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2372a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f111257n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ k f111258o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CompletableJob f111259p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f111260q;

            /* JADX INFO: renamed from: si0.k$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2374a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f111261n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ wn0.a<h0> f111262o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2374a(wn0.a<h0> aVar, Continuation<? super C2374a> continuation) {
                    super(2, continuation);
                    this.f111262o = aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2374a(this.f111262o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f111261n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f111262o.invoke();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2374a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k kVar, CompletableJob completableJob, wn0.a<h0> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f111258o = kVar;
                this.f111259p = completableJob;
                this.f111260q = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f111258o, this.f111259p, this.f111260q, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L21;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f111257n
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jn0.t.b(r8)
                    goto L4c
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    jn0.t.b(r8)
                L1e:
                    si0.k r8 = r7.f111258o
                    ri0.a r8 = si0.k.k(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    androidx.core.view.WindowInsetsCompat r8 = androidx.core.view.ViewCompat.H(r8)
                    if (r8 == 0) goto L54
                    int r1 = androidx.core.view.WindowInsetsCompat.n.c()
                    boolean r8 = r8.q(r1)
                    if (r8 != r4) goto L54
                    kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                    si0.k$a$b$a r1 = new si0.k$a$b$a
                    wn0.a<jn0.h0> r5 = r7.f111260q
                    r1.<init>(r5, r3)
                    r7.f111257n = r2
                    java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                    if (r8 != r0) goto L4c
                    goto L5e
                L4c:
                    kotlinx.coroutines.CompletableJob r8 = r7.f111259p
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r8, r3, r4, r3)
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                L54:
                    r7.f111257n = r4
                    r5 = 100
                    java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                    if (r8 != r0) goto L1e
                L5e:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: si0.k.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", f = "InputSelectBottomSheetController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f111263n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ CompletableJob f111264o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f111265p;

            /* JADX INFO: renamed from: si0.k$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", f = "InputSelectBottomSheetController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2375a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f111266n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ wn0.a<h0> f111267o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2375a(wn0.a<h0> aVar, Continuation<? super C2375a> continuation) {
                    super(2, continuation);
                    this.f111267o = aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2375a(this.f111267o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f111266n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f111267o.invoke();
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2375a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CompletableJob completableJob, wn0.a<h0> aVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f111264o = completableJob;
                this.f111265p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f111264o, this.f111265p, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f111263n
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jn0.t.b(r8)
                    goto L41
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    jn0.t.b(r8)
                    goto L2d
                L1f:
                    jn0.t.b(r8)
                    r7.f111263n = r4
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                    if (r8 != r0) goto L2d
                    goto L40
                L2d:
                    kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                    si0.k$a$c$a r1 = new si0.k$a$c$a
                    wn0.a<jn0.h0> r5 = r7.f111265p
                    r1.<init>(r5, r3)
                    r7.f111263n = r2
                    java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                    if (r8 != r0) goto L41
                L40:
                    return r0
                L41:
                    kotlinx.coroutines.CompletableJob r8 = r7.f111264o
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r8, r3, r4, r3)
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: si0.k.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f111247q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = k.this.new a(this.f111247q, continuation);
            aVar.f111245o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f111244n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f111245o;
            CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new C2372a(completableJobSupervisorJob$default, k.this, this.f111247q, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new b(k.this, completableJobSupervisorJob$default, this.f111247q, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, completableJobSupervisorJob$default, null, new c(completableJobSupervisorJob$default, this.f111247q, null), 2, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"si0/k$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            s.k(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            s.k(bottomSheet, "bottomSheet");
            wn0.l lVar = k.this.bottomSheetStateChangeListener;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(newState));
            }
        }
    }

    public k(ViewGroup contentView) {
        s.k(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = jn0.m.b(new wn0.a() { // from class: si0.a
            @Override // wn0.a
            public final Object invoke() {
                return k.p(this.f111223a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(k kVar, boolean z11, MenuItem menuItem) {
        if (menuItem.getItemId() != mi0.e.F) {
            return false;
        }
        kVar.r(true, z11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ri0.a o() {
        return this.lazyBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ri0.a p(k kVar) {
        return ri0.a.c(LayoutInflater.from(kVar.contentView.getContext()), kVar.contentView, true);
    }

    private final void q(wn0.a<h0> callback) {
        Context context = this.contentView.getContext();
        s.h(context);
        androidx.appcompat.app.c cVarA = yh0.f.a(context);
        if (cVarA == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(x.a(cVarA), null, null, new a(callback, null), 3, null);
    }

    private final void r(boolean visible, boolean hasTitle) {
        if (visible) {
            o().f108298i.setVisibility(8);
            o().f108296g.setVisibility(0);
            o().f108299j.getMenu().setGroupVisible(0, false);
            o().f108295f.requestFocus();
            Context context = o().f108295f.getContext();
            s.j(context, "getContext(...)");
            yh0.f.i(context);
        } else {
            Context context2 = o().f108295f.getContext();
            s.j(context2, "getContext(...)");
            yh0.f.c(context2);
            o().f108296g.setVisibility(8);
            o().f108298i.setVisibility(0);
            o().f108299j.getMenu().setGroupVisible(0, true);
            o().f108295f.setText("");
        }
        if (visible && hasTitle) {
            o().f108299j.setNavigationIcon(yh0.l.f125533t);
        } else {
            o().f108299j.setNavigationIcon(yh0.l.f125534u);
        }
    }

    private final void s() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(o().f108291b);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.a1(true);
        wn0.a aVar = new wn0.a() { // from class: si0.j
            @Override // wn0.a
            public final Object invoke() {
                return k.t();
            }
        };
        FrameLayout bottomSheet = o().f108291b;
        s.j(bottomSheet, "bottomSheet");
        ki0.b.b(bottomSheetBehaviorQ0, aVar, bottomSheet, o().f108292c, o().f108297h);
        bottomSheetBehaviorQ0.c0(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 t() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(c2 c2Var, n0 n0Var, k kVar, Option selectedItem) {
        s.k(selectedItem, "selectedItem");
        if (!c2Var.getCanSelectMultipleValues()) {
            wn0.l lVar = (wn0.l) n0Var.f86529a;
            if (lVar != null) {
                lVar.invoke(v.e(selectedItem));
            }
            n0Var.f86529a = null;
            kVar.m();
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(boolean z11, k kVar, View view) {
        if (z11) {
            TextInputLayout searchBarTextInput = kVar.o().f108296g;
            s.j(searchBarTextInput, "searchBarTextInput");
            if (searchBarTextInput.getVisibility() == 0) {
                kVar.r(false, z11);
                return;
            }
        }
        kVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(boolean z11, k kVar, final BottomSheetBehavior bottomSheetBehavior) {
        if (z11) {
            kVar.q(new wn0.a() { // from class: si0.i
                @Override // wn0.a
                public final Object invoke() {
                    return k.y(bottomSheetBehavior);
                }
            });
        } else {
            bottomSheetBehavior.Y0(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.Y0(3);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 z(n0 n0Var, n nVar, k kVar, int i11) {
        if (i11 == 5) {
            wn0.l lVar = (wn0.l) n0Var.f86529a;
            if (lVar != null) {
                lVar.invoke(v.m1(nVar.c()));
            }
            n0Var.f86529a = null;
            Context context = kVar.contentView.getContext();
            s.j(context, "getContext(...)");
            yh0.f.c(context);
        }
        return h0.f84049a;
    }

    public final boolean m() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(o().f108291b);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        Context context = this.contentView.getContext();
        s.j(context, "getContext(...)");
        yh0.f.c(context);
        this.contentView.postDelayed(new Runnable() { // from class: si0.h
            @Override // java.lang.Runnable
            public final void run() {
                k.n(bottomSheetBehaviorQ0);
            }
        }, 100L);
        return bottomSheetBehaviorQ0.w0() != 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(final c2 component, wn0.l<? super List<Option>, h0> onItemsSelectedListener) {
        s.k(component, "component");
        s.k(onItemsSelectedListener, "onItemsSelectedListener");
        s();
        final n0 n0Var = new n0();
        n0Var.f86529a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z11 = label == null || p013kotlin.text.t.y0(label);
        final boolean z12 = !z11;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(o().f108291b);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        Context context = o().f108294e.getContext();
        s.j(context, "getContext(...)");
        final n nVar = new n(context, component.getOptions(), component.getStyles(), component.getCanSelectMultipleValues(), component.c(), new wn0.l() { // from class: si0.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.v(component, n0Var, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new wn0.l() { // from class: si0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.z(n0Var, nVar, this, ((Integer) obj).intValue());
            }
        };
        r(z11, z12);
        o().f108299j.setOnMenuItemClickListener(new Toolbar.f() { // from class: si0.d
            @Override // androidx.appcompat.widget.Toolbar.f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return k.A(this.f111230a, z12, menuItem);
            }
        });
        o().f108298i.setText(component.getLabel());
        o().f108294e.setAdapter(nVar);
        o().f108297h.setOnClickListener(new View.OnClickListener() { // from class: si0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.B(bottomSheetBehaviorQ0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getStyles();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = o().f108298i;
            s.j(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            e0.n(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                o().f108292c.setBackgroundColor(iIntValue);
                o().f108294e.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                o().f108293d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                o().f108299j.setNavigationIconTint(iIntValue2);
                o().f108296g.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(k5.d.l(iIntValue3, 128));
                s.j(colorStateListValueOf, "valueOf(...)");
                o().f108295f.setHintTextColor(colorStateListValueOf);
                o().f108295f.setTextColor(iIntValue3);
            }
        }
        o().f108294e.setLayoutManager(new LinearLayoutManager(o().getRoot().getContext()));
        o().f108294e.setHasFixedSize(true);
        o().f108295f.addTextChangedListener(new c(nVar));
        o().f108299j.setNavigationOnClickListener(new View.OnClickListener() { // from class: si0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.w(z12, this, view);
            }
        });
        o().f108295f.setText("");
        o().f108291b.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.contentView.postDelayed(new Runnable() { // from class: si0.g
            @Override // java.lang.Runnable
            public final void run() {
                k.x(z11, this, bottomSheetBehaviorQ0);
            }
        }, 100L);
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"si0/k$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f111269a;

        c(n nVar) {
            this.f111269a = nVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            this.f111269a.g(String.valueOf(s11));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
