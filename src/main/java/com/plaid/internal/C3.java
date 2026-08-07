package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.ViewModelProvider;
import com.plaid.link.R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/C3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3 f46236a;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.loading.LoadingFragment$onCreateView$1", f = "LoadingFragment.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46237a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4506p5 f46239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4506p5 c4506p5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46239c = c4506p5;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C3.this.new a(this.f46239c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C3.this.new a(this.f46239c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46237a;
            if (i11 == 0) {
                jn0.t.b(obj);
                D3 d11 = C3.this.f46236a;
                W4 w11 = null;
                if (d11 == null) {
                    p013kotlin.jvm.internal.s.B("viewModel");
                    d11 = null;
                }
                this.f46237a = 1;
                W4 w12 = d11.f46270a;
                if (w12 != null) {
                    w11 = w12;
                } else {
                    p013kotlin.jvm.internal.s.B("clientSideOnlyConfigurationStore");
                }
                obj = w11.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            S4 s11 = (S4) obj;
            if (s11 != null) {
                this.f46239c.f48038a.setVisibility(s11.f46697a ? 4 : 0);
            }
            return jn0.h0.f84049a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        p013kotlin.jvm.internal.s.i(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f46236a = (D3) new ViewModelProvider(this, ((r8) activity).b()).b(D3.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.plaid_loading_fragment, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        C4506p5 c4506p5 = new C4506p5(frameLayout);
        p013kotlin.jvm.internal.s.j(c4506p5, "inflate(...)");
        D3 d11 = this.f46236a;
        if (d11 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            d11 = null;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(d11), null, null, new a(c4506p5, null), 3, null);
        p013kotlin.jvm.internal.s.j(frameLayout, "getRoot(...)");
        return frameLayout;
    }
}
