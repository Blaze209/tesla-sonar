package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import androidx.fragment.app.w0;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import bh0.b0;
import bh0.n2;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import zg0.ScreenState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0015J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\f¨\u0006N"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/j;", "Landroidx/fragment/app/Fragment;", "Lzg0/b;", "Lzh0/d;", "<init>", "()V", "", "resetState", "Ljn0/h0;", "g", "(Z)V", "q", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onDestroy", "onDetach", "outState", "onSaveInstanceState", "Lzg0/a;", "k", "()Lzg0/a;", "getContext", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "cancelOutput", "n", "(Lcom/withpersona/sdk2/inquiry/internal/m$b$a;)V", "Ljh0/a$a;", "m", "()Ljh0/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "output", "p", "(Lcom/withpersona/sdk2/inquiry/internal/m$b;)V", "Lcom/withpersona/sdk2/inquiry/internal/h;", "Lkotlin/Lazy;", "j", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lbh0/b0;", "l", "()Lbh0/b0;", "viewModel", "Ldh0/e;", "o", "Ldh0/e;", "binding", "Lbh0/q;", "Lbh0/q;", "component", "Landroid/content/Context;", "themedContext", "", "getTheme", "()Ljava/lang/Integer;", "theme", "isInline", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends Fragment implements zg0.b, zh0.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f57764r = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = jn0.m.b(new wn0.a() { // from class: bh0.t
        @Override // wn0.a
        public final Object invoke() {
            return com.withpersona.sdk2.inquiry.internal.j.f(this.f17348a);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private dh0.e binding;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private bh0.q component;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Context themedContext;

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"com/withpersona/sdk2/inquiry/internal/j$a", "Lei0/e;", "Lkotlinx/coroutines/flow/Flow;", "Lei0/a;", "a", "Lkotlinx/coroutines/flow/Flow;", "c", "()Lkotlinx/coroutines/flow/Flow;", "controllerRequestFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lzg0/d;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "screenStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lzg0/c;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "eventFlow", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "isNavBarEnabled", "e", "handleBackPress", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ei0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Flow<ei0.a> controllerRequestFlow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final MutableStateFlow<ScreenState> screenStateFlow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final MutableSharedFlow<zg0.c> eventFlow;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isNavBarEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean handleBackPress;

        a(j jVar) {
            this.controllerRequestFlow = jVar.l().h();
            this.screenStateFlow = jVar.l().u();
            this.eventFlow = jVar.l().m();
            this.isNavBarEnabled = jVar.j().A();
            this.handleBackPress = jVar.j().k();
        }

        @Override // ei0.e
        public MutableSharedFlow<zg0.c> a() {
            return this.eventFlow;
        }

        @Override // ei0.e
        public MutableStateFlow<ScreenState> b() {
            return this.screenStateFlow;
        }

        @Override // ei0.e
        public Flow<ei0.a> c() {
            return this.controllerRequestFlow;
        }

        @Override // ei0.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getIsNavBarEnabled() {
            return this.isNavBarEnabled;
        }

        @Override // ei0.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getHandleBackPress() {
            return this.handleBackPress;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", f = "InquiryFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57775n;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f57777a;

            a(j jVar) {
                this.f57777a = jVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                this.f57777a.g(true);
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return j.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57775n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowDrop = FlowKt.drop(j.this.l().n(), 1);
                a aVar = new a(j.this);
                this.f57775n = 1;
                if (flowDrop.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<Fragment> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f57778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f57778c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f57778c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/f1;", "b", "()Landroidx/lifecycle/f1;"}, k = 3, mv = {2, 0, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.a<f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f57779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wn0.a aVar) {
            super(0);
            this.f57779c = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return (f1) this.f57779c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {2, 0, 0})
    public static final class e extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lazy f57780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.f57780c = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return w0.c(this.f57780c).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {2, 0, 0})
    public static final class f extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f57781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lazy f57782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(wn0.a aVar, Lazy lazy) {
            super(0);
            this.f57781c = aVar;
            this.f57782d = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f57781c;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            f1 f1VarC = w0.c(this.f57782d);
            androidx.p003lifecycle.n nVar = f1VarC instanceof androidx.p003lifecycle.n ? (androidx.p003lifecycle.n) f1VarC : null;
            return nVar != null ? nVar.getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {2, 0, 0})
    public static final class g extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f57783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lazy f57784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, Lazy lazy) {
            super(0);
            this.f57783c = fragment;
            this.f57784d = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            f1 f1VarC = w0.c(this.f57784d);
            androidx.p003lifecycle.n nVar = f1VarC instanceof androidx.p003lifecycle.n ? (androidx.p003lifecycle.n) f1VarC : null;
            return (nVar == null || (defaultViewModelProviderFactory = nVar.getDefaultViewModelProviderFactory()) == null) ? this.f57783c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public j() {
        Lazy lazyA = jn0.m.a(jn0.p.NONE, new d(new c(this)));
        this.viewModel = w0.b(this, o0.b(b0.class), new e(lazyA), new f(null, lazyA), new g(this, lazyA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h f(j jVar) {
        return new h(jVar.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean resetState) {
        m.c c1184c;
        Context context = this.themedContext;
        if (context == null) {
            return;
        }
        String value = l().o().getValue();
        String strN = j().n();
        String value2 = l().x().getValue();
        if (value != null) {
            c1184c = new m.c.InquiryProps(value, value2, j().g(), j().f(), j().w(), false, 32, null);
        } else if (strN != null) {
            c1184c = new m.c.OneTimeCodeProps(strN, j().f(), j().w(), false, 8, null);
        } else {
            String strU = j().u();
            String strV = j().v();
            String strA = j().a();
            String strO = j().o();
            bh0.s sVarJ = j().j();
            Map<String, InquiryField> mapA = sVarJ != null ? sVarJ.a() : null;
            c1184c = new m.c.TemplateProps(strU, strV, strA, strO, j().g(), mapA, j().x(), j().t(), j().f(), j().w(), false, 1024, null);
        }
        if (resetState) {
            i(context);
            FragmentManager childFragmentManager = getChildFragmentManager();
            p013kotlin.jvm.internal.s.j(childFragmentManager, "getChildFragmentManager(...)");
            r0 r0VarR = childFragmentManager.r();
            r0VarR.o(n2.f17308d, jh0.d.INSTANCE.a(j().l(), j().s(), c1184c));
            r0VarR.g();
            return;
        }
        if (getChildFragmentManager().n0(n2.f17308d) == null) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            p013kotlin.jvm.internal.s.j(childFragmentManager2, "getChildFragmentManager(...)");
            r0 r0VarR2 = childFragmentManager2.r();
            r0VarR2.o(n2.f17308d, jh0.d.INSTANCE.a(j().l(), j().s(), c1184c));
            r0VarR2.g();
        }
    }

    private final void i(Context context) {
        com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar;
        String packageName = context.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName, "getPackageName(...)");
        String strR = p013kotlin.text.t.b0(packageName, "com.withpersona", false, 2, null) ? j().r() : "https://withpersona.com";
        String packageName2 = context.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName2, "getPackageName(...)");
        String strZ = p013kotlin.text.t.b0(packageName2, "com.withpersona", false, 2, null) ? j().z() : "https://webrtc-consumer.withpersona.com";
        String packageName3 = context.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName3, "getPackageName(...)");
        String strI = p013kotlin.text.t.b0(packageName3, "com.withpersona", false, 2, null) ? j().i() : "https://inquiry-fallback.withpersona.com";
        ai0.a aVarJ = j().q() ? l().getDataCollector() : new ai0.d();
        FallbackMode fallbackModeH = (l().n().getValue().booleanValue() || j().t() != null) ? FallbackMode.ALWAYS : j().h();
        if (fallbackModeH == FallbackMode.ALWAYS) {
            aVar = new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(com.withpersona.sdk2.inquiry.internal.fallbackmode.c.a.f57695a);
        } else {
            StaticInquiryTemplate staticInquiryTemplateT = j().t();
            LocalStaticInquiryTemplate localStaticInquiryTemplate = staticInquiryTemplateT instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) staticInquiryTemplateT : null;
            aVar = localStaticInquiryTemplate != null ? new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(new com.withpersona.sdk2.inquiry.internal.fallbackmode.c.b(localStaticInquiryTemplate.getResourceId())) : new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(com.withpersona.sdk2.inquiry.internal.fallbackmode.c.a.f57695a);
        }
        a aVar2 = new a(this);
        com.withpersona.sdk2.inquiry.internal.e.a aVarA = com.withpersona.sdk2.inquiry.internal.e.a();
        androidx.fragment.app.u uVarRequireActivity = requireActivity();
        p013kotlin.jvm.internal.s.j(uVarRequireActivity, "requireActivity(...)");
        bh0.q qVarB = aVarA.j(new bh0.l(uVarRequireActivity)).e(new com.withpersona.sdk2.inquiry.launchers.h(l().q(), l().l(), l().w())).f(new com.withpersona.sdk2.inquiry.launchers.p(l().k())).n(new com.withpersona.sdk2.inquiry.launchers.v(l().r())).m(new nh0.f(l().p())).c(new com.withpersona.sdk2.inquiry.launchers.d(l().i())).l(new NetworkCoreModule(j().y(), j().g(), j().m())).d(new ai0.b(aVarJ)).k(new com.withpersona.sdk2.inquiry.internal.network.f(strR, strZ, strI)).a(aVar).g(new ei0.f(aVar2)).p(new yh0.v(j().c(), j().d())).o(new com.withpersona.sdk2.inquiry.launchers.b0(l().s())).h(new fh0.b(fallbackModeH, j().f(), l().getSavedStateHandle())).i(new fi0.a(l().getSdkFilesManager())).b();
        this.component = qVarB;
        vi0.a.INSTANCE.b(qVarB.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h j() {
        return (h) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 l() {
        return (b0) this.viewModel.getValue();
    }

    private final boolean q() {
        String strS = j().s();
        if (strS == null || !p013kotlin.text.t.g0(strS, '\n', false, 2, null)) {
            return true;
        }
        String strP = j().p();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", zi0.d.SessionTokenError);
        h0 h0Var = h0.f84049a;
        androidx.fragment.app.a0.a(this, strP, bundle);
        getParentFragmentManager().d1();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    @Override // zh0.d
    public Integer getTheme() {
        int iIntValue;
        if (isInline()) {
            Integer numW = j().w();
            iIntValue = (numW == null || numW.intValue() == 0) ? qh0.f.f105574b : numW.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // zh0.d
    public boolean isInline() {
        return requireActivity().getClass() != InquiryActivity.class;
    }

    public final zg0.a k() {
        LifecycleOwner parentFragment = getParentFragment();
        LayoutInflater.Factory activity = getActivity();
        if (parentFragment instanceof zg0.a) {
            return (zg0.a) parentFragment;
        }
        if (activity instanceof zg0.a) {
            return (zg0.a) activity;
        }
        return null;
    }

    public final jh0.a.InterfaceC1766a m() {
        bh0.q qVar = this.component;
        if (qVar != null) {
            return qVar.c();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void n(m.b.Cancel cancelOutput) {
        bh0.q qVar;
        bh0.g gVarB;
        p013kotlin.jvm.internal.s.k(cancelOutput, "cancelOutput");
        String strO = cancelOutput.getSessionToken();
        if (strO != null && (qVar = this.component) != null && (gVarB = qVar.b()) != null) {
            gVarB.i(strO);
        }
        String strP = j().p();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        if (yh0.h.f(cancelOutput.getInquiryId())) {
            bundle.putString("INQUIRY_ID_KEY", cancelOutput.getInquiryId());
            String strO2 = cancelOutput.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", strO2 != null ? h.INSTANCE.a(strO2) : null);
        }
        h0 h0Var = h0.f84049a;
        androidx.fragment.app.a0.a(this, strP, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        super.onAttach(context);
        if (isInline()) {
            context = new n.c(context, getTheme().intValue());
        }
        this.themedContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        Context context = this.themedContext;
        if (context == null) {
            context = contextRequireContext;
        }
        i(context);
        super.onCreate(savedInstanceState);
        eh0.c.a(contextRequireContext);
        if (j().e() || j().b()) {
            eh0.c.d(contextRequireContext, l().getSdkFilesManager().b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        dh0.e eVarC = dh0.e.c(inflater, container, false);
        this.binding = eVarC;
        if (eVarC == null) {
            p013kotlin.jvm.internal.s.B("binding");
            eVarC = null;
        }
        FrameLayout root = eVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        eh0.c.e(contextRequireContext);
        zg0.a aVarK = k();
        if (aVarK != null) {
            aVarK.a();
        }
        super.onDestroy();
        l().z();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        l().A();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        p013kotlin.jvm.internal.s.k(outState, "outState");
        super.onSaveInstanceState(outState);
        vi0.a.INSTANCE.a().e(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        gg0.c.d(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        gg0.c.f(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Exception {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        try {
            if (q()) {
                vi0.a.INSTANCE.a().a(savedInstanceState);
                l().y(this);
                l().o().setValue(j().l());
                l().x().setValue(j().s());
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                p013kotlin.jvm.internal.s.j(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(viewLifecycleOwner), null, null, new b(null), 3, null);
                g(false);
                zg0.a aVarK = k();
                if (aVarK != null) {
                    aVarK.b(this);
                }
            }
        } catch (Exception e11) {
            if (!j().b()) {
                throw e11;
            }
            if (j().e()) {
                Context contextRequireContext = requireContext();
                p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
                eh0.c.c(contextRequireContext).c(e11);
            }
            String strP = j().p();
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle.putParcelable("ERROR_CODE_KEY", zi0.d.ExceptionError);
            h0 h0Var = h0.f84049a;
            androidx.fragment.app.a0.a(this, strP, bundle);
        }
    }

    public final void p(m.b output) {
        p013kotlin.jvm.internal.s.k(output, "output");
        bh0.q qVar = this.component;
        if (qVar == null) {
            return;
        }
        String strO = output.getSessionToken();
        if (strO != null) {
            qVar.b().h(strO);
        }
        l().getSdkFilesManager().a();
        if (output instanceof m.b.Complete) {
            String strP = j().p();
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
            m.b.Complete c1182b = (m.b.Complete) output;
            bundle.putString("INQUIRY_ID_KEY", c1182b.getInquiryId());
            bundle.putString("INQUIRY_STATUS_KEY", c1182b.getInquiryStatus());
            bundle.putParcelable("FIELDS_MAP_KEY", new bh0.s(c1182b.a()));
            bundle.putParcelable("COLLECTED_DATA", bh0.a.d(l().getDataCollector().b()));
            String strO2 = c1182b.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", strO2 != null ? h.INSTANCE.a(strO2) : null);
            h0 h0Var = h0.f84049a;
            androidx.fragment.app.a0.a(this, strP, bundle);
            return;
        }
        if (output instanceof m.b.ReinitializeWithFallbackMode) {
            m.b.ReinitializeWithFallbackMode dVar = (m.b.ReinitializeWithFallbackMode) output;
            l().o().setValue(dVar.getInquiryId());
            l().x().setValue(dVar.getSessionToken());
            l().C(true);
            return;
        }
        if (output instanceof m.b.Cancel) {
            m.b.Cancel aVar = (m.b.Cancel) output;
            if (aVar.getForce()) {
                n(aVar);
                return;
            }
            ch0.e.Companion aVar2 = ch0.e.INSTANCE;
            FragmentManager childFragmentManager = getChildFragmentManager();
            p013kotlin.jvm.internal.s.j(childFragmentManager, "getChildFragmentManager(...)");
            aVar2.a(childFragmentManager, getTheme().intValue(), aVar);
            return;
        }
        if (!(output instanceof m.b.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        m.b.Error cVar = (m.b.Error) output;
        String strO3 = cVar.getSessionToken();
        if (strO3 != null) {
            qVar.b().f(strO3, cVar.getCause());
        }
        String strP2 = j().p();
        Bundle bundle2 = new Bundle();
        bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle2.putString("ERROR_DEBUG_MESSAGE_KEY", cVar.getDebugMessage());
        bundle2.putParcelable("ERROR_CODE_KEY", cVar.getErrorCode());
        h0 h0Var2 = h0.f84049a;
        androidx.fragment.app.a0.a(this, strP2, bundle2);
    }
}
