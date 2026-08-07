package com.plaid.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$GetMultipleContents;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.p003lifecycle.ViewModelProvider;
import com.plaid.internal.K7;
import com.plaid.link.R;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/K7;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class K7 extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f46388l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W5 f46389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U5 f46390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P7 f46391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4553v f46392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f46393e = jn0.m.b(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p013kotlin.jvm.internal.u f46394f = f.f46409a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wn0.a<jn0.h0> f46395g = e.f46408a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActivityResultLauncher<String> f46396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ActivityResultLauncher<String> f46397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ActivityResultLauncher<jn0.h0> f46398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f46399k;

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<C4443i5> {
        public a() {
            super(0);
        }

        @Override // wn0.a
        public final C4443i5 invoke() {
            P7 p11 = K7.this.f46391c;
            if (p11 == null) {
                p013kotlin.jvm.internal.s.B("viewModel");
                p11 = null;
            }
            C4443i5 c4443i5 = p11.f46595d;
            if (c4443i5 != null) {
                return c4443i5;
            }
            p013kotlin.jvm.internal.s.B("internalPictureStorage");
            return null;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", f = "WebviewFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46401a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return K7.this.new b(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return K7.this.new b(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46401a;
            if (i11 == 0) {
                jn0.t.b(obj);
                U5 u11 = K7.this.f46390b;
                if (u11 == null) {
                    p013kotlin.jvm.internal.s.B("webView");
                    u11 = null;
                }
                this.f46401a = 1;
                Object objCollect = u11.f46743b.f47804d.collect(new P5(new S5(u11)), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = jn0.h0.f84049a;
                }
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = jn0.h0.f84049a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$4", f = "WebviewFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46403a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return K7.this.new c(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return K7.this.new c(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46403a;
            W5 w11 = null;
            if (i11 == 0) {
                jn0.t.b(obj);
                P7 p11 = K7.this.f46391c;
                if (p11 == null) {
                    p013kotlin.jvm.internal.s.B("viewModel");
                    p11 = null;
                }
                this.f46403a = 1;
                InterfaceC4560v6 interfaceC4560v6 = p11.f46597f;
                if (interfaceC4560v6 == null) {
                    p013kotlin.jvm.internal.s.B("readWebviewBackgroundTransparencyState");
                    interfaceC4560v6 = null;
                }
                obj = interfaceC4560v6.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                W5 w12 = K7.this.f46389a;
                if (w12 == null) {
                    p013kotlin.jvm.internal.s.B("binding");
                    w12 = null;
                }
                w12.f46795a.setBackground(androidx.core.content.b.getDrawable(K7.this.requireContext(), R.drawable.plaid_transparent_webview_animation));
                W5 w13 = K7.this.f46389a;
                if (w13 == null) {
                    p013kotlin.jvm.internal.s.B("binding");
                } else {
                    w11 = w13;
                }
                Drawable background = w11.f46795a.getBackground();
                p013kotlin.jvm.internal.s.i(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            } else {
                W5 w14 = K7.this.f46389a;
                if (w14 == null) {
                    p013kotlin.jvm.internal.s.B("binding");
                } else {
                    w11 = w14;
                }
                w11.f46795a.setBackgroundColor(-1);
                androidx.fragment.app.u activity = K7.this.getActivity();
                if (activity != null) {
                    C4445i7.a(activity);
                }
            }
            return jn0.h0.f84049a;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$5", f = "WebviewFragment.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46405a;

        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ K7 f46407a;

            public a(K7 k11) {
                this.f46407a = k11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                U5 u11 = this.f46407a.f46390b;
                U5 u12 = null;
                if (u11 == null) {
                    p013kotlin.jvm.internal.s.B("webView");
                    u11 = null;
                }
                if (!u11.f46746e.get()) {
                    P7 p11 = this.f46407a.f46391c;
                    if (p11 == null) {
                        p013kotlin.jvm.internal.s.B("viewModel");
                        p11 = null;
                    }
                    p11.getClass();
                    BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(p11), null, null, new R7(p11, null), 3, null);
                    U5 u13 = this.f46407a.f46390b;
                    if (u13 == null) {
                        p013kotlin.jvm.internal.s.B("webView");
                        u13 = null;
                    }
                    if (!p013kotlin.jvm.internal.s.f(u13.getUrl(), str)) {
                        U5 u14 = this.f46407a.f46390b;
                        if (u14 == null) {
                            p013kotlin.jvm.internal.s.B("webView");
                        } else {
                            u12 = u14;
                        }
                        u12.loadUrl(str);
                    }
                }
                return jn0.h0.f84049a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return K7.this.new d(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return K7.this.new d(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46405a;
            if (i11 == 0) {
                jn0.t.b(obj);
                P7 p11 = K7.this.f46391c;
                if (p11 == null) {
                    p013kotlin.jvm.internal.s.B("viewModel");
                    p11 = null;
                }
                SharedFlow sharedFlowAsSharedFlow = FlowKt.asSharedFlow(p11.f46604m);
                a aVar = new a(K7.this);
                this.f46405a = 1;
                if (sharedFlowAsSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class e extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f46408a = new e();

        public e() {
            super(0);
        }

        @Override // wn0.a
        public final /* bridge */ /* synthetic */ jn0.h0 invoke() {
            return jn0.h0.f84049a;
        }
    }

    public static final class f extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f46409a = new f();

        public f() {
            super(0);
        }

        @Override // wn0.a
        public final /* bridge */ /* synthetic */ jn0.h0 invoke() {
            return jn0.h0.f84049a;
        }
    }

    public K7() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: g00.c
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                K7.a(this.f66817a, (Boolean) obj);
            }
        });
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f46396h = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$GetMultipleContents(), new ActivityResultCallback() { // from class: g00.d
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                K7.a(this.f66818a, (List) obj);
            }
        });
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f46397i = activityResultLauncherRegisterForActivityResult2;
        this.f46399k = new g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        p013kotlin.jvm.internal.s.i(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f46391c = (P7) new ViewModelProvider(this, ((r8) activity).a()).b(P7.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        Bundle arguments = getArguments();
        W5 w11 = null;
        Y6 y11 = (Y6) (arguments != null ? arguments.get("smsAutofillType") : null);
        g listener = this.f46399k;
        p013kotlin.jvm.internal.s.k(listener, "listener");
        C4553v c4348a7 = (y11 == null ? -1 : C4544u.f48146a[y11.ordinal()]) == 1 ? new C4348a7(listener) : new C4553v();
        this.f46392d = c4348a7;
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        c4348a7.a(contextRequireContext);
        View viewInflate = inflater.inflate(R.layout.plaid_webview_fragment, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        W5 w12 = new W5(frameLayout, frameLayout);
        p013kotlin.jvm.internal.s.j(w12, "inflate(...)");
        this.f46389a = w12;
        ActivityResultLauncher<jn0.h0> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C4436h7((C4443i5) this.f46393e.getValue()), new ActivityResultCallback() { // from class: g00.a
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                K7.a(this.f66815a, (Uri) obj);
            }
        });
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f46398j = activityResultLauncherRegisterForActivityResult;
        P7 p11 = this.f46391c;
        if (p11 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            p11 = null;
        }
        N5 n11 = p11.f46599h;
        if (n11 == null) {
            p013kotlin.jvm.internal.s.B("webViewRegistry");
            n11 = null;
        }
        U5 u5C = n11.c();
        this.f46390b = u5C;
        Context context = requireContext();
        p013kotlin.jvm.internal.s.j(context, "requireContext(...)");
        P7 listener2 = this.f46391c;
        if (listener2 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            listener2 = null;
        }
        P7 listener3 = this.f46391c;
        if (listener3 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            listener3 = null;
        }
        ActivityResultLauncher<String> fileInputContract = this.f46397i;
        ActivityResultLauncher<jn0.h0> takePictureContract = this.f46398j;
        if (takePictureContract == null) {
            p013kotlin.jvm.internal.s.B("takePictureContract");
            takePictureContract = null;
        }
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(listener2, "interceptor");
        p013kotlin.jvm.internal.s.k(listener3, "listener");
        p013kotlin.jvm.internal.s.k(fileInputContract, "fileInputContract");
        p013kotlin.jvm.internal.s.k(takePictureContract, "takePictureContract");
        p013kotlin.jvm.internal.s.k(this, "permissionHelper");
        Context context2 = u5C.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        u5C.f46744c = listener3;
        C4397d4 c4397d4 = u5C.f46742a;
        c4397d4.getClass();
        p013kotlin.jvm.internal.s.k(listener2, "listener");
        c4397d4.f47615a = listener2;
        u5C.setWebChromeClient(new R4(fileInputContract, takePictureContract, listener3, this));
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new b(null), 3, null);
        W5 w13 = this.f46389a;
        if (w13 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            w13 = null;
        }
        FrameLayout frameLayout2 = w13.f46796b;
        U5 u11 = this.f46390b;
        if (u11 == null) {
            p013kotlin.jvm.internal.s.B("webView");
            u11 = null;
        }
        frameLayout2.addView(u11);
        W5 w14 = this.f46389a;
        if (w14 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            w14 = null;
        }
        ViewCompat.E0(w14.f46796b, new androidx.core.view.a0() { // from class: g00.b
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return K7.a(this.f66816a, view, windowInsetsCompat);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new d(null), 3, null);
        W5 w15 = this.f46389a;
        if (w15 == null) {
            p013kotlin.jvm.internal.s.B("binding");
        } else {
            w11 = w15;
        }
        FrameLayout frameLayout3 = w11.f46795a;
        p013kotlin.jvm.internal.s.j(frameLayout3, "getRoot(...)");
        return frameLayout3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        U5 u11 = this.f46390b;
        C4553v c4553v = null;
        if (u11 == null) {
            p013kotlin.jvm.internal.s.B("webView");
            u11 = null;
        }
        if (!u11.f46746e.getAndSet(true)) {
            W5 w11 = this.f46389a;
            if (w11 == null) {
                p013kotlin.jvm.internal.s.B("binding");
                w11 = null;
            }
            w11.f46795a.setBackground(androidx.core.content.b.getDrawable(requireContext(), R.drawable.plaid_transparent_webview_animation_fade_out));
            W5 w12 = this.f46389a;
            if (w12 == null) {
                p013kotlin.jvm.internal.s.B("binding");
                w12 = null;
            }
            if (w12.f46795a.getBackground() instanceof AnimationDrawable) {
                W5 w13 = this.f46389a;
                if (w13 == null) {
                    p013kotlin.jvm.internal.s.B("binding");
                    w13 = null;
                }
                Drawable background = w13.f46795a.getBackground();
                p013kotlin.jvm.internal.s.i(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
            W5 w14 = this.f46389a;
            if (w14 == null) {
                p013kotlin.jvm.internal.s.B("binding");
                w14 = null;
            }
            FrameLayout frameLayout = w14.f46796b;
            U5 u12 = this.f46390b;
            if (u12 == null) {
                p013kotlin.jvm.internal.s.B("webView");
                u12 = null;
            }
            frameLayout.removeView(u12);
            U5 u13 = this.f46390b;
            if (u13 == null) {
                p013kotlin.jvm.internal.s.B("webView");
                u13 = null;
            }
            u13.destroy();
        }
        C4553v c4553v2 = this.f46392d;
        if (c4553v2 == null) {
            p013kotlin.jvm.internal.s.B("autofillManager");
        } else {
            c4553v = c4553v2;
        }
        c4553v.b(getContext());
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.u, wn0.a] */
    public static final void a(K7 this$0, Boolean bool) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.h(bool);
        if (bool.booleanValue()) {
            this$0.f46394f.invoke();
        } else {
            Toast.makeText(this$0.getContext(), this$0.getResources().getString(R.string.grant_camera_permission_to_continue), 0).show();
            this$0.f46395g.invoke();
        }
    }

    public static final void a(K7 this$0, List list) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        P7 p11 = this$0.f46391c;
        if (p11 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            p11 = null;
        }
        p013kotlin.jvm.internal.s.h(list);
        p11.a(list);
    }

    public static final void a(K7 this$0, Uri uri) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        P7 p11 = this$0.f46391c;
        if (p11 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            p11 = null;
        }
        p11.a(p013kotlin.collections.v.e(uri));
    }

    public static final WindowInsetsCompat a(K7 this$0, View v11, WindowInsetsCompat windowInsets) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(v11, "v");
        p013kotlin.jvm.internal.s.k(windowInsets, "windowInsets");
        k5.e eVarF = windowInsets.f(WindowInsetsCompat.n.h());
        p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
        k5.e eVarF2 = windowInsets.f(WindowInsetsCompat.n.c());
        p013kotlin.jvm.internal.s.j(eVarF2, "getInsets(...)");
        if (this$0.requireContext().getApplicationInfo().targetSdkVersion >= 35) {
            v11.setPadding(eVarF.f84924a, eVarF.f84925b, eVarF.f84926c, Math.max(eVarF.f84927d, eVarF2.f84927d));
        } else {
            v11.setPadding(eVarF.f84924a, eVarF.f84925b, eVarF.f84926c, 0);
        }
        return WindowInsetsCompat.f7692b;
    }

    public static final class g implements Z6 {
        public g() {
        }

        @Override // com.plaid.internal.Z6
        public final void a(String smsMessage) {
            final String strSubstring;
            String value;
            p013kotlin.jvm.internal.s.k(smsMessage, "smsMessage");
            U5 u11 = null;
            p013kotlin.text.m mVarD = p013kotlin.text.q.d(new p013kotlin.text.q("[:]\\s?[\\d]{4,8}\\s?[.]?"), smsMessage, 0, 2, null);
            if (mVarD != null && mVarD.getValue().length() < 7) {
                p013kotlin.jvm.internal.s.k("No OTP code found in SMS message.", "message");
                X5.a.b(X5.f46812a, "No OTP code found in SMS message.");
                J5 j11 = T6.f46721a;
                if (j11 != null) {
                    j11.a("No OTP code found in SMS message.");
                    return;
                }
                return;
            }
            if (mVarD == null || (value = mVarD.getValue()) == null) {
                strSubstring = null;
            } else {
                strSubstring = value.substring(2, mVarD.getValue().length() - 1);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            }
            U5 u12 = K7.this.f46390b;
            if (u12 == null) {
                p013kotlin.jvm.internal.s.B("webView");
            } else {
                u11 = u12;
            }
            final K7 k11 = K7.this;
            u11.post(new Runnable() { // from class: g00.e
                @Override // java.lang.Runnable
                public final void run() {
                    K7.g.a(k11, strSubstring);
                }
            });
        }

        public static final void a(K7 this$0, String str) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            U5 u11 = this$0.f46390b;
            if (u11 == null) {
                p013kotlin.jvm.internal.s.B("webView");
                u11 = null;
            }
            u11.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"rm-otp-code-input\", \"data\": {\"otpCode\": \"" + str + "\"}}')");
            A6.a.b(p013kotlin.collections.v0.i(), "JSBridge - sent rm-otp-code-input");
        }

        @Override // com.plaid.internal.Z6
        public final void a() {
            X5.f46812a.getClass();
            X5.a.a("OTP TimeOut", true);
        }
    }

    public final boolean a() {
        return androidx.core.content.f.b(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(wn0.a<jn0.h0> success, wn0.a<jn0.h0> failure) {
        p013kotlin.jvm.internal.s.k(success, "success");
        p013kotlin.jvm.internal.s.k(failure, "failure");
        this.f46394f = (p013kotlin.jvm.internal.u) success;
        this.f46395g = failure;
        this.f46396h.b("android.permission.CAMERA");
    }
}
