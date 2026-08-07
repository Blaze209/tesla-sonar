package com.tesla.dashcam_viewer;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u0003J'\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R.\u0010*\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00101\u001a\u0002002\u0006\u0010)\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b!\u00103\"\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010;\u001a\u0004\u0018\u00010:2\b\u0010)\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/tesla/dashcam_viewer/RNH264Stream;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "Lcom/tesla/dashcam_viewer/k;", "metadatas", "Ljn0/h0;", "receiveMetadatas", "(Ljava/util/List;)V", "eventPath", "deleteEvent", "(Ljava/lang/String;)V", "camera", "", "timeMs", "selectEventAndSeek", "(Ljava/lang/String;Ljava/lang/String;D)V", "selectEvent", "(Ljava/lang/String;Ljava/lang/String;)V", "pause", "stop", "loadSelectedVehicleConfig", "", "includeMetadata", "initiateDownload", "(Ljava/lang/String;Ljava/lang/String;Z)V", "cancelDownload", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getDashcamViewerStatus", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "selectedEventPath", "Ljava/lang/String;", "Lcom/tesla/dashcam_viewer/j;", "value", "eventList", "Lcom/tesla/dashcam_viewer/j;", "getEventList", "()Lcom/tesla/dashcam_viewer/j;", "setEventList", "(Lcom/tesla/dashcam_viewer/j;)V", "Lcom/tesla/dashcam_viewer/n;", "dashcamViewerStatus", "Lcom/tesla/dashcam_viewer/n;", "()Lcom/tesla/dashcam_viewer/n;", "setDashcamViewerStatus", "(Lcom/tesla/dashcam_viewer/n;)V", "currentEventMetadata", "Lcom/tesla/dashcam_viewer/k;", "setCurrentEventMetadata", "(Lcom/tesla/dashcam_viewer/k;)V", "Lcom/tesla/dashcam_viewer/m;", "saveClipStatus", "Lcom/tesla/dashcam_viewer/m;", "getSaveClipStatus", "()Lcom/tesla/dashcam_viewer/m;", "setSaveClipStatus", "(Lcom/tesla/dashcam_viewer/m;)V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNH264Stream extends ReactContextBaseJavaModule {
    private static DashcamViewerEventMetadata currentEventMetadata;
    private static DashcamViewerEventList eventList;
    private static DashcamViewerSaveClipStatus saveClipStatus;
    private static String selectedEventPath;
    public static final RNH264Stream INSTANCE = new RNH264Stream();
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_RNH264Stream");
    private static n dashcamViewerStatus = n.CONNECTING;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$cancelDownload$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55755n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u1 videoPlayer;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55755n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
            if (latestView != null && (videoPlayer = latestView.getVideoPlayer()) != null) {
                videoPlayer.e();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$currentEventMetadata$1$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55756n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ DashcamViewerEventMetadata f55757o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DashcamViewerEventMetadata dashcamViewerEventMetadata, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f55757o = dashcamViewerEventMetadata;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f55757o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u1 videoPlayer;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55756n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            String strA = t.INSTANCE.a(this.f55757o.getEventMetadata().getCamera());
            if (strA == null) {
                strA = h.FRONT.getValue();
            }
            String str = strA;
            String name = this.f55757o.getName();
            if (name != null) {
                DashcamViewerEventMetadata dashcamViewerEventMetadata = this.f55757o;
                u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
                if (latestView != null && (videoPlayer = latestView.getVideoPlayer()) != null) {
                    videoPlayer.H(name, dashcamViewerEventMetadata.getTotalDurationMs(), dashcamViewerEventMetadata.getEarliestClipTimeMs(), dashcamViewerEventMetadata.getEventEpochTimeMs(), dashcamViewerEventMetadata.getEventMetadata().getEst_lat(), dashcamViewerEventMetadata.getEventMetadata().getEst_lon(), str, p013kotlin.text.t.h0(dashcamViewerEventMetadata.getName(), "SentryClips", false, 2, null));
                }
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$initiateDownload$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f55759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f55760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f55761q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, boolean z11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f55759o = str;
            this.f55760p = str2;
            this.f55761q = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f55759o, this.f55760p, this.f55761q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u1 videoPlayer;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55758n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
            if (latestView != null && (videoPlayer = latestView.getVideoPlayer()) != null) {
                videoPlayer.s(this.f55759o, this.f55760p, this.f55761q);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$selectEvent$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55762n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f55763o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f55764p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f55763o = str;
            this.f55764p = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f55763o, this.f55764p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55762n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
            if (latestView != null) {
                latestView.K(this.f55763o, this.f55764p, null);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$selectEventAndSeek$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f55766o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f55767p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ double f55768q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, double d11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f55766o = str;
            this.f55767p = str2;
            this.f55768q = d11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new e(this.f55766o, this.f55767p, this.f55768q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55765n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
            if (latestView != null) {
                latestView.K(this.f55766o, this.f55767p, jn0.c0.a(jn0.j0.a(this.f55768q)));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264Stream$stop$1", f = "RNH264Stream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55769n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55769n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
            if (latestView != null) {
                latestView.K("", "", null);
            }
            RNH264Stream.selectedEventPath = "";
            RNH264Stream.INSTANCE.setCurrentEventMetadata(null);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    private RNH264Stream() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentEventMetadata(DashcamViewerEventMetadata dashcamViewerEventMetadata) {
        currentEventMetadata = dashcamViewerEventMetadata;
        if (dashcamViewerEventMetadata != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(dashcamViewerEventMetadata, null), 3, null);
        }
    }

    @ReactMethod
    public final void cancelDownload() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(null), 3, null);
    }

    @ReactMethod
    public final void deleteEvent(String eventPath) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        f1.f55840a.R(eventPath);
    }

    public final n getDashcamViewerStatus() {
        return dashcamViewerStatus;
    }

    public final DashcamViewerEventList getEventList() {
        return eventList;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNH264Stream";
    }

    public final DashcamViewerSaveClipStatus getSaveClipStatus() {
        return saveClipStatus;
    }

    @ReactMethod
    public final void initiateDownload(String eventPath, String camera, boolean includeMetadata) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new c(eventPath, camera, includeMetadata, null), 3, null);
    }

    @ReactMethod
    public final void loadSelectedVehicleConfig() {
        x.f56132a.i("dashcam event list screen mounts");
    }

    @ReactMethod
    public final void pause() {
        u1 videoPlayer;
        u0 latestView = RNH264StreamViewManager.INSTANCE.getLatestView();
        if (latestView == null || (videoPlayer = latestView.getVideoPlayer()) == null) {
            return;
        }
        videoPlayer.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void receiveMetadatas(List<DashcamViewerEventMetadata> metadatas) {
        p013kotlin.jvm.internal.s.k(metadatas, "metadatas");
        ArrayList arrayList = new ArrayList();
        for (DashcamViewerEventMetadata dashcamViewerEventMetadata : metadatas) {
            String name = dashcamViewerEventMetadata.getName();
            if (name != null && name.length() != 0) {
                if (p013kotlin.jvm.internal.s.f(name, selectedEventPath)) {
                    setCurrentEventMetadata(dashcamViewerEventMetadata);
                }
                DashcamViewerEventMetadataForJS lVar = new DashcamViewerEventMetadataForJS(dashcamViewerEventMetadata, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                List<Byte> listF = dashcamViewerEventMetadata.f();
                if (listF != null) {
                    lVar.c(Base64.encodeToString(p013kotlin.collections.v.g1(listF), 0));
                }
                arrayList.add(lVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        RNH264StreamEvents.INSTANCE.receivedEventMetadatas(arrayList);
    }

    @ReactMethod
    public final void selectEvent(String eventPath, String camera) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        selectedEventPath = eventPath;
        com.tesla.dashcam_viewer.d.f55787a.b(eventPath);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new d(eventPath, camera, null), 3, null);
    }

    @ReactMethod
    public final void selectEventAndSeek(String eventPath, String camera, double timeMs) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        selectedEventPath = eventPath;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new e(eventPath, camera, timeMs, null), 3, null);
    }

    public final void setDashcamViewerStatus(n value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        dashcamViewerStatus = value;
        RNH264StreamEvents.INSTANCE.dashcamViewerStatusChanged(value, f1.f55840a.W());
    }

    public final void setEventList(DashcamViewerEventList jVar) {
        eventList = jVar;
        if (jVar != null) {
            RNH264StreamEvents.INSTANCE.eventListChanged(jVar);
        }
    }

    public final void setSaveClipStatus(DashcamViewerSaveClipStatus dashcamViewerSaveClipStatus) {
        saveClipStatus = dashcamViewerSaveClipStatus;
        if (dashcamViewerSaveClipStatus != null) {
            RNH264StreamEvents.INSTANCE.saveClipStateChanged(dashcamViewerSaveClipStatus);
        }
    }

    @ReactMethod
    public final void stop() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new f(null), 3, null);
    }

    @ReactMethod
    public final void getDashcamViewerStatus(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, dashcamViewerStatus.getValue());
            writableMapCreateMap.putString("vin", f1.f55840a.W());
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            logger.d("getDashcamViewerStatus error", e11);
            promise.reject("getDashcamViewerStatus error", e11);
        }
    }
}
