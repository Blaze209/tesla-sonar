package l00;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"¨\u0006/"}, d2 = {"Ll00/e;", "", "<init>", "()V", "", "from", "to", "Ljn0/h0;", "m", "(II)V", "l", "k", "Landroid/view/View;", "view", "j", "(Landroid/view/View;)V", "Ll00/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "p", "(Ll00/c;)V", "n", "q", "Lkotlinx/coroutines/Job;", "a", "Lkotlinx/coroutines/Job;", "debounceShowJob", "b", "debounceHideJob", "c", "debounceHeightChangeJob", DateTokenConverter.CONVERTER_KEY, "Ll00/c;", "softInputListener", "e", "I", "previousHeight", "f", "previousScreenHeight", "g", "Ljava/lang/Integer;", "persistedFrom", "Lkotlinx/coroutines/CoroutineScope;", "h", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", IntegerTokenConverter.CONVERTER_KEY, "minSoftInputHeightToDetect", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Job debounceShowJob;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Job debounceHideJob;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Job debounceHeightChangeJob;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private l00.c softInputListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer persistedFrom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousScreenHeight = com.facebook.react.uimanager.d.c().heightPixels;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minSoftInputHeightToDetect = (int) w.h(60.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativeavoidsoftinput.listeners.WindowInsetsListenerImpl$onHeightChange$1", f = "WindowInsetsListenerImpl.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89472n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f89474p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f89475q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f89474p = i11;
            this.f89475q = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.f89474p, this.f89475q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89472n;
            if (i11 == 0) {
                t.b(obj);
                this.f89472n = 1;
                if (DelayKt.delay(250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            int i12 = com.facebook.react.uimanager.d.c().heightPixels;
            l00.c cVar = e.this.softInputListener;
            if (cVar != null) {
                cVar.c(this.f89474p, this.f89475q, i12 != e.this.previousScreenHeight);
            }
            e.this.previousScreenHeight = i12;
            e.this.persistedFrom = null;
            e.this.previousHeight = this.f89475q;
            e.this.debounceHeightChangeJob = null;
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativeavoidsoftinput.listeners.WindowInsetsListenerImpl$onHide$1", f = "WindowInsetsListenerImpl.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89476n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f89478p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f89479q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f89478p = i11;
            this.f89479q = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new c(this.f89478p, this.f89479q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89476n;
            if (i11 == 0) {
                t.b(obj);
                this.f89476n = 1;
                if (DelayKt.delay(250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            l00.c cVar = e.this.softInputListener;
            if (cVar != null) {
                cVar.b(this.f89478p, this.f89479q);
            }
            e.this.debounceHideJob = null;
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativeavoidsoftinput.listeners.WindowInsetsListenerImpl$onShow$1", f = "WindowInsetsListenerImpl.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89480n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f89482p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f89483q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, int i12, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f89482p = i11;
            this.f89483q = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new d(this.f89482p, this.f89483q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89480n;
            if (i11 == 0) {
                t.b(obj);
                this.f89480n = 1;
                if (DelayKt.delay(250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            l00.c cVar = e.this.softInputListener;
            if (cVar != null) {
                cVar.e(this.f89482p, this.f89483q);
            }
            e.this.debounceShowJob = null;
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private final void j(View view) {
        WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(view);
        if (windowInsetsCompatH == null) {
            return;
        }
        k5.e eVarF = windowInsetsCompatH.f(WindowInsetsCompat.n.c());
        s.j(eVarF, "getInsets(...)");
        k5.e eVarF2 = windowInsetsCompatH.f(WindowInsetsCompat.n.h());
        s.j(eVarF2, "getInsets(...)");
        if (this.persistedFrom == null) {
            this.persistedFrom = Integer.valueOf(this.previousHeight);
        }
        int iMax = Math.max(eVarF.f84927d - eVarF2.f84927d, 0);
        Integer num = this.persistedFrom;
        k(num != null ? num.intValue() : this.previousHeight, iMax);
        int i11 = this.previousHeight;
        if (i11 != iMax && iMax > this.minSoftInputHeightToDetect) {
            m(i11, iMax);
            return;
        }
        if (i11 != 0 && iMax <= this.minSoftInputHeightToDetect) {
            l(i11, 0);
            return;
        }
        Job job = this.debounceHideJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    private final void k(int from, int to2) {
        Job job = this.debounceHeightChangeJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.debounceHeightChangeJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(from, to2, null), 3, null);
    }

    private final void l(int from, int to2) {
        Job job = this.debounceHideJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.debounceShowJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.debounceHideJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(from, to2, null), 3, null);
    }

    private final void m(int from, int to2) {
        Job job = this.debounceShowJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.debounceHideJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.debounceShowJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(from, to2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat o(e eVar, View v11, WindowInsetsCompat insets) {
        s.k(v11, "v");
        s.k(insets, "insets");
        eVar.j(v11);
        return insets;
    }

    public void n(View view) {
        s.k(view, "view");
        ViewCompat.E0(view, new a0() { // from class: l00.d
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return e.o(this.f89461a, view2, windowInsetsCompat);
            }
        });
    }

    public void p(l00.c listener) {
        this.softInputListener = listener;
    }

    public void q(View view) {
        s.k(view, "view");
        ViewCompat.E0(view, null);
    }
}
