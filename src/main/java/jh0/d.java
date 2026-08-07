package jh0;

import a30.ViewEnvironment;
import a30.e0;
import a30.i0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import bh0.q;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002KLB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b1\u00107\u0012\u0004\b<\u0010\u0004\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001b\u0010F\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010H\u001a\u0004\b(\u0010I¨\u0006M"}, d2 = {"Ljh0/d;", "Lzh0/a;", "Ldh0/c;", "<init>", "()V", "Ljn0/h0;", "p", "Lcom/withpersona/sdk2/inquiry/internal/j;", "y", "()Lcom/withpersona/sdk2/inquiry/internal/j;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lbh0/q;", "o", "Lbh0/q;", "r", "()Lbh0/q;", "setInquiryComponent$inquiry_internal_release", "(Lbh0/q;)V", "inquiryComponent", "Ljh0/f$a;", "Ljh0/f$a;", "u", "()Ljh0/f$a;", "setViewModelFactory", "(Ljh0/f$a;)V", "viewModelFactory", "Ljh0/i$a;", "q", "Ljh0/i$a;", "x", "()Ljh0/i$a;", "setWorkflowStateViewModelFactory", "(Ljh0/i$a;)V", "workflowStateViewModelFactory", "Lji0/a;", "Lji0/a;", "s", "()Lji0/a;", "setSystemUiController", "(Lji0/a;)V", "systemUiController", "La30/e0;", "La30/e0;", "v", "()La30/e0;", "setViewRegistry", "(La30/e0;)V", "getViewRegistry$annotations", "viewRegistry", "Ljh0/f;", "t", "Lkotlin/Lazy;", "()Ljh0/f;", "viewModel", "Ljh0/i;", "w", "()Ljh0/i;", "workflowStateViewModel", "Ljh0/d$b;", "Lzh0/c;", "()Ljh0/d$b;", "args", "b", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends zh0.a<dh0.c> {

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public q inquiryComponent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public jh0.f.a viewModelFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public jh0.i.a workflowStateViewModelFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ji0.a systemUiController;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public e0 viewRegistry;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy workflowStateViewModel;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final zh0.c args;

    /* JADX INFO: renamed from: jh0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljh0/d$a;", "", "<init>", "()V", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "inquiryWorkflowProps", "Lzh0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m$c;)Lzh0/a;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zh0.a<?> a(String inquiryId, String sessionToken, com.withpersona.sdk2.inquiry.internal.m.c inquiryWorkflowProps) {
            s.k(inquiryWorkflowProps, "inquiryWorkflowProps");
            return zh0.b.a(new d(), new b(inquiryId, sessionToken, inquiryWorkflowProps));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljh0/d$b;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "inquiryWorkflowProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m$c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "o", "c", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "()Lcom/withpersona/sdk2/inquiry/internal/m$c;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String inquiryId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final com.withpersona.sdk2.inquiry.internal.m.c inquiryWorkflowProps;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), (com.withpersona.sdk2.inquiry.internal.m.c) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(String str, String str2, com.withpersona.sdk2.inquiry.internal.m.c inquiryWorkflowProps) {
            s.k(inquiryWorkflowProps, "inquiryWorkflowProps");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.inquiryWorkflowProps = inquiryWorkflowProps;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.withpersona.sdk2.inquiry.internal.m.c getInquiryWorkflowProps() {
            return this.inquiryWorkflowProps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.inquiryWorkflowProps, flags);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$1", f = "InquiryWorkflowFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83741n;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f83743a;

            a(d dVar) {
                this.f83743a = dVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.inquiry.internal.m.b bVar, Continuation<? super h0> continuation) {
                this.f83743a.y().p(bVar);
                return h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83741n;
            if (i11 == 0) {
                t.b(obj);
                SharedFlow<com.withpersona.sdk2.inquiry.internal.m.b> sharedFlowG = d.this.t().g();
                a aVar = new a(d.this);
                this.f83741n = 1;
                if (sharedFlowG.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: jh0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1767d implements wn0.a<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f83744a;

        public C1767d(Fragment fragment) {
            this.f83744a = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f83744a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f83744a + " has null arguments");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {2, 0, 0})
    public static final class e extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f83745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lazy f83746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wn0.a aVar, Lazy lazy) {
            super(0);
            this.f83745c = aVar;
            this.f83746d = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f83745c;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            f1 f1VarC = w0.c(this.f83746d);
            androidx.p003lifecycle.n nVar = f1VarC instanceof androidx.p003lifecycle.n ? (androidx.p003lifecycle.n) f1VarC : null;
            return nVar != null ? nVar.getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class f implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f83747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f83748b;

        public f(Fragment fragment, wn0.l lVar) {
            this.f83747a = fragment;
            this.f83748b = lVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new ci0.a(this.f83747a, this.f83748b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 0, 0})
    public static final class g extends u implements wn0.a<Fragment> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f83749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f83749c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f83749c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/f1;", "b", "()Landroidx/lifecycle/f1;"}, k = 3, mv = {2, 0, 0})
    public static final class h extends u implements wn0.a<f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f83750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(wn0.a aVar) {
            super(0);
            this.f83750c = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return (f1) this.f83750c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {2, 0, 0})
    public static final class i extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lazy f83751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Lazy lazy) {
            super(0);
            this.f83751c = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return w0.c(this.f83751c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {2, 0, 0})
    public static final class j extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f83752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lazy f83753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(wn0.a aVar, Lazy lazy) {
            super(0);
            this.f83752c = aVar;
            this.f83753d = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f83752c;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            f1 f1VarC = w0.c(this.f83753d);
            androidx.p003lifecycle.n nVar = f1VarC instanceof androidx.p003lifecycle.n ? (androidx.p003lifecycle.n) f1VarC : null;
            return nVar != null ? nVar.getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class k implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f83754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f83755b;

        public k(Fragment fragment, wn0.l lVar) {
            this.f83754a = fragment;
            this.f83755b = lVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new ci0.a(this.f83754a, this.f83755b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 0, 0})
    public static final class l extends u implements wn0.a<Fragment> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f83756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f83756c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f83756c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/f1;", "b", "()Landroidx/lifecycle/f1;"}, k = 3, mv = {2, 0, 0})
    public static final class m extends u implements wn0.a<f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f83757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(wn0.a aVar) {
            super(0);
            this.f83757c = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return (f1) this.f83757c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {2, 0, 0})
    public static final class n extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lazy f83758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Lazy lazy) {
            super(0);
            this.f83758c = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return w0.c(this.f83758c).getViewModelStore();
        }
    }

    public d() {
        f fVar = new f(this, new wn0.l() { // from class: jh0.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.z(this.f83727a, (s0) obj);
            }
        });
        g gVar = new g(this);
        jn0.p pVar = jn0.p.NONE;
        Lazy lazyA = jn0.m.a(pVar, new h(gVar));
        this.viewModel = w0.b(this, o0.b(jh0.f.class), new i(lazyA), new j(null, lazyA), fVar);
        k kVar = new k(this, new wn0.l() { // from class: jh0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.A(this.f83728a, (s0) obj);
            }
        });
        Lazy lazyA2 = jn0.m.a(pVar, new m(new l(this)));
        this.workflowStateViewModel = w0.b(this, o0.b(jh0.i.class), new n(lazyA2), new e(null, lazyA2), kVar);
        this.args = new zh0.c(o0.b(b.class), new C1767d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh0.i A(d dVar, s0 it) {
        s.k(it, "it");
        return dVar.x().a(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        t().c(r(), q().getInquiryWorkflowProps(), w(), false);
        Context contextRequireContext = requireContext();
        s.j(contextRequireContext, "requireContext(...)");
        i0 i0Var = new i0(contextRequireContext, null, 2, 0 == true ? 1 : 0);
        Lifecycle lifecycle = getLifecycle();
        s.j(lifecycle, "<get-lifecycle>(...)");
        i0.b(i0Var, lifecycle, t().i(w()), null, new ViewEnvironment(v0.m(x.a(e0.INSTANCE, v()), x.a(ji0.b.f83813b, s()))), 4, null);
        i().getRoot().removeAllViews();
        i().getRoot().addView(i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b q() {
        return (b) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jh0.f t() {
        return (jh0.f) this.viewModel.getValue();
    }

    private final jh0.i w() {
        return (jh0.i) this.workflowStateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.withpersona.sdk2.inquiry.internal.j y() {
        Fragment parentFragment = getParentFragment();
        s.i(parentFragment, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryFragment");
        return (com.withpersona.sdk2.inquiry.internal.j) parentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh0.f z(d dVar, s0 it) {
        s.k(it, "it");
        return dVar.u().a(it);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        y().m().create().a(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        dh0.c cVarC = dh0.c.c(inflater, container, false);
        s.j(cVarC, "inflate(...)");
        j(cVarC);
        FrameLayout root = i().getRoot();
        s.j(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        t().f().setValue(q().getInquiryId());
        t().h().setValue(q().getSessionToken());
        p();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        s.j(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(viewLifecycleOwner), null, null, new c(null), 3, null);
    }

    public final q r() {
        q qVar = this.inquiryComponent;
        if (qVar != null) {
            return qVar;
        }
        s.B("inquiryComponent");
        return null;
    }

    public final ji0.a s() {
        ji0.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        s.B("systemUiController");
        return null;
    }

    public final jh0.f.a u() {
        jh0.f.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        s.B("viewModelFactory");
        return null;
    }

    public final e0 v() {
        e0 e0Var = this.viewRegistry;
        if (e0Var != null) {
            return e0Var;
        }
        s.B("viewRegistry");
        return null;
    }

    public final jh0.i.a x() {
        jh0.i.a aVar = this.workflowStateViewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        s.B("workflowStateViewModelFactory");
        return null;
    }
}
