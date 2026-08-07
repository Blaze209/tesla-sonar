package com.plaid.link;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.plaid.internal.A1;
import com.plaid.internal.A2;
import com.plaid.internal.A6;
import com.plaid.internal.B6;
import com.plaid.internal.C4355b5;
import com.plaid.internal.C4364c5;
import com.plaid.internal.C4396d3;
import com.plaid.internal.C4406e4;
import com.plaid.internal.C4492o0;
import com.plaid.internal.C4501p0;
import com.plaid.internal.C4515q5;
import com.plaid.internal.C4575x3;
import com.plaid.internal.C6;
import com.plaid.internal.E2;
import com.plaid.internal.E6;
import com.plaid.internal.EnumC4452j5;
import com.plaid.internal.I2;
import com.plaid.internal.InterfaceC4344a3;
import com.plaid.internal.J5;
import com.plaid.internal.P;
import com.plaid.internal.Q0;
import com.plaid.internal.S6;
import com.plaid.internal.T6;
import com.plaid.internal.V3;
import com.plaid.internal.X4;
import com.plaid.internal.X5;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkConfigurationMalformedLinkTokenException;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import ezvcard.property.Kind;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.x;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import qj0.h;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003JA\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u001f\u0010.\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020$2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010&J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010:J\u001f\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0000¢\u0006\u0004\b<\u0010=J)\u0010D\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006\u0018\u00010?j\u0004\u0018\u0001`AH\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010G\u001a\u0002082\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010L\u001a\u00020$2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020$2\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bJ\u0010OJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bU\u0010\u0003J\u0010\u0010Y\u001a\u00020\u0006H\u0080@¢\u0006\u0004\bW\u0010XJ\r\u0010Z\u001a\u00020\u0006¢\u0006\u0004\bZ\u0010\u0003J\u001f\u0010\\\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b[\u0010 J\u000f\u0010^\u001a\u00020\u0006H\u0000¢\u0006\u0004\b]\u0010\u0003J'\u0010e\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0000¢\u0006\u0004\bc\u0010dR\"\u0010g\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR \u0010m\u001a\u00020,8\u0006X\u0087D¢\u0006\u0012\n\u0004\bm\u0010n\u0012\u0004\bq\u0010\u0003\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010zR,\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00060?j\u0002`A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lcom/plaid/link/Plaid;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/plaid/link/event/LinkEvent;", "Ljn0/h0;", "Lcom/plaid/link/event/LinkEventListener;", "linkEventListener", "setLinkEventListener", "(Lwn0/l;)V", "clearLinkEventListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "config", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "Lcom/plaid/link/result/LinkExit;", "failureCallback", "Landroid/view/View;", "createLinkEmbeddedView", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Landroidx/activity/result/ActivityResultLauncher;Lwn0/l;)Landroid/view/View;", "successCallback", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lwn0/l;Lwn0/l;)Landroid/view/View;", "Landroid/app/Application;", Kind.APPLICATION, "linkTokenConfiguration", "Lcom/plaid/link/PlaidHandler;", "create", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/link/PlaidHandler;", "initializeAndCheckPrerequisites", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)V", "initialize", "(Landroid/app/Application;)V", "drainLinkEventQueue", "", "enforceDeviceHasPortrait", "(Landroid/content/Context;)Z", "Lcom/plaid/internal/j5;", "initializeEnvironmentFromTokenOrCrash", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/internal/j5;", "maybeSendTestCrash", "plaidEnvironment", "", "packageName", "shouldSendTestCrash", "(Lcom/plaid/internal/j5;Ljava/lang/String;)Z", "Lcom/plaid/internal/V3;", "logLevel", "setPlogLevel", "(Lcom/plaid/internal/V3;)V", "configuration", "setLinkConfiguration", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPortrait", "Lcom/plaid/internal/a3;", "getOrCreateTokenComponent", "()Lcom/plaid/internal/a3;", "initializeTokenComponentAndRegisterRemoteLogController", "getCustomerFacingLinkEventListenerInternal$link_sdk_release", "()Lwn0/l;", "getCustomerFacingLinkEventListenerInternal", "Lkotlin/Function2;", "Lcom/plaid/internal/I2;", "Lcom/plaid/internal/event/QueueableLinkEventListener;", "getLinkEventListenerInternal$link_sdk_release", "()Lwn0/p;", "getLinkEventListenerInternal", "provideLinkTokenComponent$link_sdk_release", "(Landroid/app/Application;)Lcom/plaid/internal/a3;", "provideLinkTokenComponent", "Landroid/app/Activity;", "activity", "openLinkInternal$link_sdk_release", "(Landroid/app/Activity;)Z", "openLinkInternal", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "submitInternal$link_sdk_release", "(Lcom/plaid/link/SubmissionData;)V", "submitInternal", "preloadLink$link_sdk_release", "preloadLink", "awaitPreload$link_sdk_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPreload", "destroy", "createWithoutPreload$link_sdk_release", "createWithoutPreload", "trackSdkOpen$link_sdk_release", "trackSdkOpen", "", StatusResponse.RESULT_CODE, "Landroid/os/Parcelable;", "data", "setLinkResultAndFinish$link_sdk_release", "(Landroid/app/Activity;ILandroid/os/Parcelable;)V", "setLinkResultAndFinish", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated$link_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setCreated$link_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", CoreConstants.VERSION_NAME_KEY, "Ljava/lang/String;", "getVERSION_NAME", "()Ljava/lang/String;", "getVERSION_NAME$annotations", "Lcom/plaid/internal/X4;", "component", "Lcom/plaid/internal/X4;", "tokenComponent", "Lcom/plaid/internal/a3;", "Lkotlinx/coroutines/Job;", "preloadLinkJob", "Lkotlinx/coroutines/Job;", "Lwn0/l;", "queueableEventListener", "Lwn0/p;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Plaid {
    private static X4 component;
    private static Job preloadLinkJob;
    private static volatile InterfaceC4344a3 tokenComponent;
    public static final Plaid INSTANCE = new Plaid();
    private static AtomicBoolean isCreated = new AtomicBoolean(false);
    private static final String VERSION_NAME = BuildConfig.LINK_VERSION_NAME;
    private static l<? super LinkEvent, h0> linkEventListener = Plaid$linkEventListener$1.INSTANCE;
    private static p<? super LinkEvent, ? super I2, h0> queueableEventListener = Plaid$queueableEventListener$1.INSTANCE;

    /* JADX INFO: renamed from: com.plaid.link.Plaid$clearLinkEventListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "it", "Ljn0/h0;", "invoke", "(Lcom/plaid/link/event/LinkEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends u implements l<LinkEvent, h0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(LinkEvent linkEvent) {
            invoke2(linkEvent);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.link.Plaid$drainLinkEventQueue$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "it", "Ljn0/h0;", "invoke", "(Lcom/plaid/link/event/LinkEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C45981 extends u implements l<LinkEvent, h0> {
        public static final C45981 INSTANCE = new C45981();

        public C45981() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(LinkEvent linkEvent) {
            invoke2(linkEvent);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent it) {
            s.k(it, "it");
            X5.a.a(X5.f46812a, "draining " + it);
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(it);
        }
    }

    /* JADX INFO: renamed from: com.plaid.link.Plaid$setLinkConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.plaid.link.Plaid", f = "Plaid.kt", i = {0}, l = {353, 354}, m = "setLinkConfiguration", n = {"configuration"}, s = {"L$0"})
    public static final class C45991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C45991(Continuation<? super C45991> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Plaid.this.setLinkConfiguration(null, this);
        }
    }

    /* JADX INFO: renamed from: com.plaid.link.Plaid$setLinkEventListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "linkEvent", "Lcom/plaid/internal/I2;", "options", "Ljn0/h0;", "invoke", "(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/I2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46001 extends u implements p<LinkEvent, I2, h0> {
        public static final C46001 INSTANCE = new C46001();

        public C46001() {
            super(2);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(LinkEvent linkEvent, I2 i11) {
            invoke2(linkEvent, i11);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent event, I2 options) {
            s.k(event, "linkEvent");
            s.k(options, "options");
            X4 x11 = Plaid.component;
            if (x11 == null) {
                s.B("component");
                x11 = null;
            }
            A2 a11 = ((C4501p0) x11).f48017j.get();
            if (options instanceof I2.a) {
                a11.a(event, ((I2.a) options).f46346a);
                return;
            }
            if (s.f(options, I2.b.f46347a)) {
                a11.a(event);
                return;
            }
            if (!s.f(options, I2.c.f46348a)) {
                a11.a(event, 0);
                return;
            }
            a11.getClass();
            s.k(event, "event");
            a11.a(event);
            a11.b(null);
        }
    }

    /* JADX INFO: renamed from: com.plaid.link.Plaid$setLinkEventListener$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "event", "Ljn0/h0;", "invoke", "(Lcom/plaid/link/event/LinkEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends u implements l<LinkEvent, h0> {
        final /* synthetic */ l<LinkEvent, h0> $linkEventListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super LinkEvent, h0> lVar) {
            super(1);
            this.$linkEventListener = lVar;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(LinkEvent linkEvent) {
            invoke2(linkEvent);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent event) {
            s.k(event, "event");
            X4 x11 = Plaid.component;
            if (x11 == null) {
                s.B("component");
                x11 = null;
            }
            ((C4501p0) x11).f48021n.get().a(new C4406e4(event.getMetadata().toMap(), event.getEventName().getJson()));
            this.$linkEventListener.invoke(event);
        }
    }

    /* JADX INFO: renamed from: com.plaid.link.Plaid$setPlogLevel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "level", "", "tag", "message", "Ljn0/h0;", "invoke", "(ILjava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46011 extends u implements q<Integer, String, String, h0> {
        public static final C46011 INSTANCE = new C46011();

        public C46011() {
            super(3);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(Integer num, String str, String str2) {
            invoke(num.intValue(), str, str2);
            return h0.f84049a;
        }

        public final void invoke(int i11, String str, String message) {
            s.k(message, "message");
            X4 x11 = Plaid.component;
            if (x11 == null) {
                s.B("component");
                x11 = null;
            }
            C4364c5 c4364c5 = ((C4501p0) x11).f48021n.get();
            if (str == null) {
                str = "";
            }
            c4364c5.a(new A1(message, v0.f(x.a("tag", str)), i11));
        }
    }

    private Plaid() {
    }

    public static final void clearLinkEventListener() {
        linkEventListener = AnonymousClass1.INSTANCE;
    }

    public static final PlaidHandler create(Application application, LinkTokenConfiguration linkTokenConfiguration) throws LinkException {
        s.k(application, "application");
        s.k(linkTokenConfiguration, "linkTokenConfiguration");
        Plaid plaid = INSTANCE;
        plaid.createWithoutPreload$link_sdk_release(application, linkTokenConfiguration);
        plaid.preloadLink$link_sdk_release();
        return new PlaidHandler();
    }

    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, l<? super LinkExit, h0> failureCallback) throws LinkException {
        s.k(context, "context");
        s.k(config, "config");
        s.k(activityResultLauncher, "activityResultLauncher");
        s.k(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        s.k(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q11 = new Q0(context, config, activityResultLauncher, null, failureCallback);
        q11.a();
        return q11.f46621f;
    }

    private final void drainLinkEventQueue() {
        X5.f46812a.getClass();
        X5.a.a("draining link event queue", true);
        X4 x11 = component;
        if (x11 == null) {
            s.B("component");
            x11 = null;
        }
        ((C4501p0) x11).f48017j.get().a(C45981.INSTANCE);
    }

    private final boolean enforceDeviceHasPortrait(Context context) throws LinkException {
        if (hasPortrait(context)) {
            return true;
        }
        throw new LinkException("Device does not support portrait mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4344a3 getOrCreateTokenComponent() {
        InterfaceC4344a3 interfaceC4344a3 = tokenComponent;
        return interfaceC4344a3 == null ? initializeTokenComponentAndRegisterRemoteLogController() : interfaceC4344a3;
    }

    public static final String getVERSION_NAME() {
        return VERSION_NAME;
    }

    public static /* synthetic */ void getVERSION_NAME$annotations() {
    }

    private final boolean hasPortrait(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.screen.portrait");
    }

    private final synchronized void initialize(Application application) {
        if (isCreated.get()) {
            return;
        }
        Application application2 = (Application) h.b(application);
        C4515q5 c4515q5 = (C4515q5) h.b(new C4515q5());
        h.a(application2, Application.class);
        h.a(c4515q5, C4515q5.class);
        C4501p0 c4501p0 = new C4501p0(new C4515q5(), application2);
        component = c4501p0;
        J5 reporter = new J5(c4501p0.f48021n.get());
        s.k(reporter, "reporter");
        T6.f46721a = reporter;
        isCreated.getAndSet(true);
    }

    private final void initializeAndCheckPrerequisites(Application application, LinkTokenConfiguration linkTokenConfiguration) throws LinkException {
        V3 v11;
        initialize(application);
        enforceDeviceHasPortrait(application);
        initializeEnvironmentFromTokenOrCrash(linkTokenConfiguration);
        LinkLogLevel logLevel = linkTokenConfiguration.getLogLevel();
        s.k(logLevel, "<this>");
        switch (E2.f46293a[logLevel.ordinal()]) {
            case 1:
                v11 = V3.ASSERT;
                break;
            case 2:
                v11 = V3.DEBUG;
                break;
            case 3:
                v11 = V3.ERROR;
                break;
            case 4:
                v11 = V3.INFO;
                break;
            case 5:
                v11 = V3.VERBOSE;
                break;
            case 6:
                v11 = V3.WARN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        setPlogLevel(v11);
    }

    private final EnumC4452j5 initializeEnvironmentFromTokenOrCrash(LinkTokenConfiguration linkTokenConfiguration) {
        EnumC4452j5.a aVar = EnumC4452j5.Companion;
        String token = linkTokenConfiguration.getToken();
        aVar.getClass();
        s.k(token, "token");
        X4 x11 = null;
        EnumC4452j5 enumC4452j5 = null;
        for (EnumC4452j5 enumC4452j6 : EnumC4452j5.values()) {
            if (t.h0(token, enumC4452j6.getJson(), false, 2, null)) {
                enumC4452j5 = enumC4452j6;
            }
        }
        if (enumC4452j5 == null) {
            throw LinkConfigurationMalformedLinkTokenException.INSTANCE;
        }
        X4 x12 = component;
        if (x12 == null) {
            s.B("component");
        } else {
            x11 = x12;
        }
        ((C4501p0) x11).f48020m.get().a(enumC4452j5);
        return enumC4452j5;
    }

    private final synchronized InterfaceC4344a3 initializeTokenComponentAndRegisterRemoteLogController() {
        C4492o0 c4492o0;
        B6 b11;
        try {
            X4 x11 = component;
            if (x11 == null) {
                s.B("component");
                x11 = null;
            }
            c4492o0 = new C4492o0(((C4501p0) x11).f48009b, new C4396d3());
            C6 controller = c4492o0.f47966m.get();
            s.k(controller, "controller");
            WeakReference<B6> weakReference = A6.f46207a;
            if (weakReference != null && (b11 = weakReference.get()) != null) {
                b11.clear();
            }
            A6.f46207a = null;
            X5.f46812a.getClass();
            X5.a.a("RemoteLog: Controller unregistered", true);
            A6.f46207a = new WeakReference<>(controller);
            X5.a.a("RemoteLog: Controller registered", true);
            tokenComponent = c4492o0;
        } catch (Throwable th2) {
            throw th2;
        }
        return c4492o0;
    }

    private final void maybeSendTestCrash() {
        X4 x11 = component;
        if (x11 == null) {
            s.B("component");
            x11 = null;
        }
        EnumC4452j5 enumC4452j5B = ((C4501p0) x11).f48020m.get().b();
        X4 x12 = component;
        if (x12 == null) {
            s.B("component");
            x12 = null;
        }
        String packageName = ((C4501p0) x12).f48008a.getPackageName();
        s.j(packageName, "getPackageName(...)");
        if (shouldSendTestCrash(enumC4452j5B, packageName)) {
            X4 x13 = component;
            if (x13 == null) {
                s.B("component");
                x13 = null;
            }
            C4364c5 c4364c5 = ((C4501p0) x13).f48021n.get();
            c4364c5.getClass();
            try {
                S6 crashApi = c4364c5.f46902a;
                s.k(crashApi, "crashApi");
                crashApi.getClass();
                s.k("Proguard crash test", "message");
                throw new RuntimeException("Proguard crash test");
            } catch (RuntimeException e11) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4355b5(c4364c5, e11, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setLinkConfiguration(com.plaid.link.configuration.LinkTokenConfiguration r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.plaid.link.Plaid.C45991
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.link.Plaid$setLinkConfiguration$1 r0 = (com.plaid.link.Plaid.C45991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.plaid.link.Plaid$setLinkConfiguration$1 r0 = new com.plaid.link.Plaid$setLinkConfiguration$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "component"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            jn0.t.b(r9)
            goto Lc1
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$0
            com.plaid.link.configuration.LinkTokenConfiguration r8 = (com.plaid.link.configuration.LinkTokenConfiguration) r8
            jn0.t.b(r9)
            goto L83
        L40:
            jn0.t.b(r9)
            com.plaid.internal.M0 r9 = r8.getEmbeddedSessionInfo()
            if (r9 == 0) goto L53
            com.plaid.internal.N2$a r9 = new com.plaid.internal.N2$a
            com.plaid.internal.M0 r2 = r8.getEmbeddedSessionInfo()
            r9.<init>(r2)
            goto L66
        L53:
            java.util.UUID r9 = java.util.UUID.randomUUID()
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "toString(...)"
            p013kotlin.jvm.internal.s.j(r9, r2)
            com.plaid.internal.N2$b r2 = new com.plaid.internal.N2$b
            r2.<init>(r9, r8)
            r9 = r2
        L66:
            com.plaid.internal.X4 r2 = com.plaid.link.Plaid.component
            if (r2 != 0) goto L6e
            p013kotlin.jvm.internal.s.B(r3)
            r2 = r6
        L6e:
            com.plaid.internal.p0 r2 = (com.plaid.internal.C4501p0) r2
            javax.inject.Provider<com.plaid.internal.y1> r2 = r2.f48013f
            java.lang.Object r2 = r2.get()
            com.plaid.internal.Z2 r2 = (com.plaid.internal.Z2) r2
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L83
            goto Lc0
        L83:
            com.plaid.internal.X4 r9 = com.plaid.link.Plaid.component
            if (r9 != 0) goto L8b
            p013kotlin.jvm.internal.s.B(r3)
            r9 = r6
        L8b:
            com.plaid.internal.p0 r9 = (com.plaid.internal.C4501p0) r9
            javax.inject.Provider<com.plaid.internal.W4> r9 = r9.f48015h
            java.lang.Object r9 = r9.get()
            com.plaid.internal.W4 r9 = (com.plaid.internal.W4) r9
            boolean r8 = r8.getNoLoadingState()
            r0.L$0 = r6
            r0.label = r4
            com.plaid.internal.S4 r2 = r9.f46794b
            if (r2 == 0) goto La8
            com.plaid.internal.S4 r2 = new com.plaid.internal.S4
            r2.<init>(r8)
            r9.f46794b = r2
        La8:
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            com.plaid.internal.V4 r3 = new com.plaid.internal.V4
            r3.<init>(r9, r8, r6)
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r0)
            java.lang.Object r9 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto Lbc
            goto Lbe
        Lbc:
            jn0.h0 r8 = jn0.h0.f84049a
        Lbe:
            if (r8 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.link.Plaid.setLinkConfiguration(com.plaid.link.configuration.LinkTokenConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void setLinkEventListener(l<? super LinkEvent, h0> linkEventListener2) {
        s.k(linkEventListener2, "linkEventListener");
        queueableEventListener = C46001.INSTANCE;
        linkEventListener = new AnonymousClass2(linkEventListener2);
    }

    private final void setPlogLevel(V3 logLevel) {
        X5.a aVar = X5.f46812a;
        C46011 c46011 = C46011.INSTANCE;
        aVar.getClass();
        s.k(logLevel, "priority");
        X5.f46813b = new P(logLevel, c46011);
    }

    private final boolean shouldSendTestCrash(EnumC4452j5 plaidEnvironment, String packageName) {
        return plaidEnvironment == EnumC4452j5.SANDBOX && t.b0(packageName, "com.plaid.", false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object awaitPreload$link_sdk_release(Continuation<? super h0> continuation) {
        Plaid$awaitPreload$1 plaid$awaitPreload$1;
        if (continuation instanceof Plaid$awaitPreload$1) {
            plaid$awaitPreload$1 = (Plaid$awaitPreload$1) continuation;
            int i11 = plaid$awaitPreload$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                plaid$awaitPreload$1.label = i11 - Integer.MIN_VALUE;
            } else {
                plaid$awaitPreload$1 = new Plaid$awaitPreload$1(this, continuation);
            }
        } else {
            plaid$awaitPreload$1 = new Plaid$awaitPreload$1(this, continuation);
        }
        Object obj = plaid$awaitPreload$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = plaid$awaitPreload$1.label;
        if (i12 == 0) {
            jn0.t.b(obj);
            Job job = preloadLinkJob;
            if (job != null && !job.isCompleted()) {
                plaid$awaitPreload$1.L$0 = this;
                plaid$awaitPreload$1.label = 1;
                if (job.join(plaid$awaitPreload$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        preloadLinkJob = null;
        return h0.f84049a;
    }

    public final void createWithoutPreload$link_sdk_release(Application application, LinkTokenConfiguration linkTokenConfiguration) throws LinkException {
        s.k(application, "application");
        s.k(linkTokenConfiguration, "linkTokenConfiguration");
        initializeAndCheckPrerequisites(application, linkTokenConfiguration);
        initializeTokenComponentAndRegisterRemoteLogController();
        Map metadata = v0.m(x.a("linkToken", linkTokenConfiguration.getToken()), x.a("logLevel", linkTokenConfiguration.getLogLevel().name()), x.a("noLoadingState", String.valueOf(linkTokenConfiguration.getNoLoadingState())));
        s.k("SDK Create", "eventName");
        s.k(metadata, "metadata");
        A6.a.a("SDK Create", metadata, E6.INFO);
        BuildersKt__BuildersKt.runBlocking$default(null, new Plaid$createWithoutPreload$1(linkTokenConfiguration, null), 1, null);
        maybeSendTestCrash();
    }

    public final synchronized void destroy() {
        B6 b11;
        try {
            if (isCreated.get()) {
                X4 x11 = component;
                if (x11 == null) {
                    s.B("component");
                    x11 = null;
                }
                ((C4501p0) x11).f48022o.get().a();
                WeakReference<B6> weakReference = A6.f46207a;
                if (weakReference != null && (b11 = weakReference.get()) != null) {
                    b11.clear();
                }
                A6.f46207a = null;
                X5.f46812a.getClass();
                X5.a.a("RemoteLog: Controller unregistered", true);
                tokenComponent = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final l<LinkEvent, h0> getCustomerFacingLinkEventListenerInternal$link_sdk_release() {
        return Plaid$getCustomerFacingLinkEventListenerInternal$1.INSTANCE;
    }

    public final p<LinkEvent, I2, h0> getLinkEventListenerInternal$link_sdk_release() {
        return queueableEventListener;
    }

    public final AtomicBoolean isCreated$link_sdk_release() {
        return isCreated;
    }

    public final boolean openLinkInternal$link_sdk_release(Activity activity) {
        s.k(activity, "activity");
        int i11 = LinkActivity.f47849e;
        s.k(activity, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(activity, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        activity.startActivityForResult(intent, 3364);
        return true;
    }

    public final void preloadLink$link_sdk_release() {
        X5.f46812a.getClass();
        X5.a.a("Preload is called", true);
        Job job = preloadLinkJob;
        if (job != null && job.isActive()) {
            X5.a.a("Requesting cancel on previous preload job", true);
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        preloadLinkJob = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new Plaid$preloadLink$2(null), 2, null);
    }

    public final InterfaceC4344a3 provideLinkTokenComponent$link_sdk_release(Application application) {
        s.k(application, "application");
        initialize(application);
        return getOrCreateTokenComponent();
    }

    public final void setCreated$link_sdk_release(AtomicBoolean atomicBoolean) {
        s.k(atomicBoolean, "<set-?>");
        isCreated = atomicBoolean;
    }

    public final void setLinkResultAndFinish$link_sdk_release(Activity activity, int resultCode, Parcelable data) {
        String str;
        s.k(activity, "activity");
        s.k(data, "data");
        if (resultCode != 6148) {
            str = resultCode != 96171 ? "UNKNOWN" : "SUCCESS";
        } else {
            str = "EXIT";
        }
        X5.a.a(X5.f46812a, "link result delivered: " + str);
        A6.a.b(v0.f(x.a("linkResult", str)), "Link result delivered: " + str);
        drainLinkEventQueue();
        Intent intent = new Intent();
        intent.putExtra("link_result", data);
        activity.setResult(resultCode, intent);
        activity.finish();
        destroy();
    }

    public final void submitInternal$link_sdk_release(SubmissionData submissionData) {
        s.k(submissionData, "submissionData");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new Plaid$submitInternal$1(submissionData, null), 2, null);
    }

    public final void trackSdkOpen$link_sdk_release() {
        InterfaceC4344a3 interfaceC4344a3 = tokenComponent;
        C4575x3 c4575x3 = interfaceC4344a3 != null ? ((C4492o0) interfaceC4344a3).f47957d.get() : null;
        if (c4575x3 == null) {
            X5.a.b(X5.f46812a, "Cannot log open event LinkWorkflowAnalytics is null");
        } else {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new Plaid$trackSdkOpen$1(c4575x3, null), 2, null);
        }
    }

    public final boolean openLinkInternal$link_sdk_release(Fragment fragment) {
        s.k(fragment, "fragment");
        int i11 = LinkActivity.f47849e;
        Context context = fragment.requireContext();
        s.j(context, "requireContext(...)");
        s.k(context, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        fragment.startActivityForResult(intent, 3364);
        return true;
    }

    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, l<? super LinkTokenConfiguration, h0> successCallback, l<? super LinkExit, h0> failureCallback) throws LinkException {
        s.k(context, "context");
        s.k(config, "config");
        s.k(successCallback, "successCallback");
        s.k(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        s.k(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q11 = new Q0(context, config, null, successCallback, failureCallback);
        q11.a();
        return q11.f46621f;
    }
}
