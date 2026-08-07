package bh0;

import android.app.Application;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nh0.PassportNfcReaderConfig;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import zg0.ScreenState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 o2\u00020\u0001:\u0001pB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R*\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b&\u0010/\"\u0004\b3\u00101R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R#\u0010E\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bD\u0010\u0013\u001a\u0004\b\u0019\u0010CR#\u0010J\u001a\b\u0012\u0004\u0012\u00020F0:8\u0006¢\u0006\u0012\n\u0004\bG\u0010<\u0012\u0004\bI\u0010\u0013\u001a\u0004\bH\u0010>R&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000e0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR,\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020W\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0X0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\b!\u0010QR2\u0010^\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0[\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0X0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010QR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010O\u001a\u0004\b`\u0010QR.\u0010d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0[\u0012\u0006\u0012\u0004\u0018\u00010S0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010O\u001a\u0004\bc\u0010QR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020f0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\bh\u0010QR&\u0010n\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020k0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010Q¨\u0006q"}, d2 = {"Lbh0/b0;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/s0;)V", "Lh/b;", "activityResultCaller", "Ljn0/h0;", "B", "(Lh/b;)V", "y", "", "newValue", "C", "(Z)V", "z", "()V", "A", "force", "g", "t", "Landroid/app/Application;", "u", "Landroidx/lifecycle/s0;", "()Landroidx/lifecycle/s0;", "Lbh0/q;", "v", "Lbh0/q;", "component", "Lfi0/c;", "w", "Lfi0/c;", "()Lfi0/c;", "sdkFilesManager", "Lkotlinx/coroutines/flow/StateFlow;", "x", "Lkotlinx/coroutines/flow/StateFlow;", "n", "()Lkotlinx/coroutines/flow/StateFlow;", "forceFallbackModeFlow", "Landroidx/lifecycle/i0;", "", "Landroidx/lifecycle/i0;", "o", "()Landroidx/lifecycle/i0;", "setInquiryId", "(Landroidx/lifecycle/i0;)V", "inquiryId", "setSessionToken", "sessionToken", "Lai0/e;", "Lai0/e;", "j", "()Lai0/e;", "dataCollector", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lei0/a;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "h", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "controllerRequestFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lzg0/d;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getScreenStateFlow$annotations", "screenStateFlow", "Lzg0/c;", "D", "m", "getEventFlow$annotations", "eventFlow", "Lcom/withpersona/sdk2/inquiry/launchers/g0;", "Lh/e;", "Lh/a;", "E", "Lcom/withpersona/sdk2/inquiry/launchers/g0;", "s", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "resolvableApiLauncher", "Landroid/net/Uri;", Gender.FEMALE, "q", "pictureLaunchResultLauncher", "Lh/f;", "", "G", "selectFromPhotoLibraryLauncher", "", "H", "l", "documentsSelectResultLauncher", "I", "r", "requestPermissionResultLauncher", "J", "k", "documentSelectResultLauncher", "Lnh0/e;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "K", "p", "passportNfcReaderLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "", "L", IntegerTokenConverter.CONVERTER_KEY, "customTabsLauncher", Gender.MALE, "b", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 extends androidx.p003lifecycle.b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final ai0.e dataCollector;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final MutableSharedFlow<ei0.a> controllerRequestFlow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final MutableStateFlow<ScreenState> screenStateFlow;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final MutableSharedFlow<zg0.c> eventFlow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<h.e, h.a> resolvableApiLauncher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<Uri, Boolean> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<h.f, List<Uri>> selectFromPhotoLibraryLauncher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<String[], List<Uri>> documentsSelectResultLauncher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<String, Boolean> requestPermissionResultLauncher;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<String[], Uri> documentSelectResultLauncher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<PassportNfcReaderConfig, com.withpersona.sdk2.inquiry.nfc.a> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.launchers.g0<com.withpersona.sdk2.inquiry.launchers.b, Integer> customTabsLauncher;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final androidx.p003lifecycle.s0 savedStateHandle;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private q component;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> forceFallbackModeFlow;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private androidx.p003lifecycle.i0<String> inquiryId;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private androidx.p003lifecycle.i0<String> sessionToken;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", f = "InquiryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17193n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f17194o;

        /* JADX INFO: renamed from: bh0.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1", f = "InquiryViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        static final class C0345a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17196n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b0 f17197o;

            /* JADX INFO: renamed from: bh0.b0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C0346a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b0 f17198a;

                C0346a(b0 b0Var) {
                    this.f17198a = b0Var;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryActivityEvent inquiryActivityEvent, Continuation<? super jn0.h0> continuation) {
                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                        this.f17198a.g(true);
                    }
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0345a(b0 b0Var, Continuation<? super C0345a> continuation) {
                super(2, continuation);
                this.f17197o = b0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new C0345a(this.f17197o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f17196n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    SharedFlow<InquiryActivityEvent> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                    C0346a c0346a = new C0346a(this.f17197o);
                    this.f17196n = 1;
                    if (eventFlow.collect(c0346a, this) == coroutine_suspended) {
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

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((C0345a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2", f = "InquiryViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17199n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b0 f17200o;

            /* JADX INFO: renamed from: bh0.b0$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C0347a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0347a<T> f17201a = new C0347a<>();

                C0347a() {
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(zg0.c cVar, Continuation<? super jn0.h0> continuation) {
                    OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                    if (onEventListener != null) {
                        onEventListener.onEvent(cVar);
                    }
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b0 b0Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f17200o = b0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f17200o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f17199n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    MutableSharedFlow<zg0.c> mutableSharedFlowM = this.f17200o.m();
                    FlowCollector<? super zg0.c> flowCollector = C0347a.f17201a;
                    this.f17199n = 1;
                    if (mutableSharedFlowM.collect(flowCollector, this) == coroutine_suspended) {
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

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = b0.this.new a(continuation);
            aVar.f17194o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17193n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f17194o;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0345a(b0.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new b(b0.this, null), 2, null);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", f = "InquiryViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17202n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f17204p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17204p = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return b0.this.new c(this.f17204p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f17202n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow<ei0.a> mutableSharedFlowH = b0.this.h();
                ei0.a.CancelRequest cancelRequest = new ei0.a.CancelRequest(this.f17204p);
                this.f17202n = 1;
                if (mutableSharedFlowH.emit(cancelRequest, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Application application, androidx.p003lifecycle.s0 savedStateHandle) {
        super(application);
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.application = application;
        this.savedStateHandle = savedStateHandle;
        this.sdkFilesManager = new fi0.c(application);
        this.forceFallbackModeFlow = savedStateHandle.i("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.g("inquiry_id", null);
        this.sessionToken = savedStateHandle.g("session_token", null);
        this.dataCollector = new ai0.e(savedStateHandle);
        this.controllerRequestFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.screenStateFlow = StateFlowKt.MutableStateFlow(new ScreenState(false, false, true));
        this.eventFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.resolvableApiLauncher = com.withpersona.sdk2.inquiry.launchers.d0.b();
        this.pictureLaunchResultLauncher = com.withpersona.sdk2.inquiry.launchers.l.h();
        this.selectFromPhotoLibraryLauncher = com.withpersona.sdk2.inquiry.launchers.l.f();
        this.documentsSelectResultLauncher = com.withpersona.sdk2.inquiry.launchers.l.d();
        this.requestPermissionResultLauncher = com.withpersona.sdk2.inquiry.launchers.x.b();
        this.documentSelectResultLauncher = com.withpersona.sdk2.inquiry.launchers.r.b();
        this.passportNfcReaderLauncher = nh0.h.b();
        this.customTabsLauncher = CustomTabsLauncherModuleKt.b();
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), Dispatchers.getDefault(), null, new a(null), 2, null);
    }

    private final void B(h.b activityResultCaller) {
        this.resolvableApiLauncher.e(activityResultCaller);
        this.pictureLaunchResultLauncher.e(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.e(activityResultCaller);
        this.documentsSelectResultLauncher.e(activityResultCaller);
        this.requestPermissionResultLauncher.e(activityResultCaller);
        this.documentSelectResultLauncher.e(activityResultCaller);
        this.passportNfcReaderLauncher.e(activityResultCaller);
        this.customTabsLauncher.e(activityResultCaller);
    }

    public final void A() {
        hg0.g gVarA;
        q qVar = this.component;
        if (qVar == null || (gVarA = qVar.a()) == null) {
            return;
        }
        gVarA.a();
    }

    public final void C(boolean newValue) {
        this.savedStateHandle.n("force_fallback_mode", Boolean.valueOf(newValue));
    }

    public final void g(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), Dispatchers.getDefault(), null, new c(force, null), 2, null);
    }

    public final MutableSharedFlow<ei0.a> h() {
        return this.controllerRequestFlow;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<com.withpersona.sdk2.inquiry.launchers.b, Integer> i() {
        return this.customTabsLauncher;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ai0.e getDataCollector() {
        return this.dataCollector;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<String[], Uri> k() {
        return this.documentSelectResultLauncher;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<String[], List<Uri>> l() {
        return this.documentsSelectResultLauncher;
    }

    public final MutableSharedFlow<zg0.c> m() {
        return this.eventFlow;
    }

    public final StateFlow<Boolean> n() {
        return this.forceFallbackModeFlow;
    }

    public final androidx.p003lifecycle.i0<String> o() {
        return this.inquiryId;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<PassportNfcReaderConfig, com.withpersona.sdk2.inquiry.nfc.a> p() {
        return this.passportNfcReaderLauncher;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<Uri, Boolean> q() {
        return this.pictureLaunchResultLauncher;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<String, Boolean> r() {
        return this.requestPermissionResultLauncher;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<h.e, h.a> s() {
        return this.resolvableApiLauncher;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final androidx.p003lifecycle.s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final MutableStateFlow<ScreenState> u() {
        return this.screenStateFlow;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final fi0.c getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    public final com.withpersona.sdk2.inquiry.launchers.g0<h.f, List<Uri>> w() {
        return this.selectFromPhotoLibraryLauncher;
    }

    public final androidx.p003lifecycle.i0<String> x() {
        return this.sessionToken;
    }

    public final void y(h.b activityResultCaller) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        B(activityResultCaller);
    }

    public final void z() {
        ec.r rVarF;
        q qVar = this.component;
        if (qVar == null || (rVarF = qVar.f()) == null) {
            return;
        }
        rVarF.shutdown();
    }
}
