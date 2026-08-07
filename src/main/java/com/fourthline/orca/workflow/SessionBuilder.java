package com.fourthline.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.internal.C4015x5;
import com.fourthline.orca.internal.Fg;
import com.fourthline.orca.internal.Gg;
import com.fourthline.orca.internal.InterfaceC3626o3;
import com.fourthline.orca.internal.PE;
import com.fourthline.orca.internal.Qy;
import com.fourthline.orca.internal.X5;
import com.fourthline.orca.internal.Zy;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Locale;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/fourthline/orca/workflow/SessionBuilder;", "Lcom/fourthline/orca/workflow/WorkflowSessionConfiguration;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", WorkflowKeys.VALIDATION_CODE, "Lcom/fourthline/orca/internal/o3;", "analytics", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/fourthline/orca/internal/o3;)V", "Lcom/fourthline/orca/workflow/WorkflowConfig;", "config", "Lcom/fourthline/orca/workflow/WorkflowSessionStart;", "configure", "(Lcom/fourthline/orca/workflow/WorkflowConfig;)Lcom/fourthline/orca/workflow/WorkflowSessionStart;", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lcom/fourthline/orca/internal/o3;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SessionBuilder implements WorkflowSessionConfiguration {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String validationCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3626o3 analytics;

    static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gg f37407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionBuilder f37408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Locale f37409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f37410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WorkflowConfig f37411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Zy f37412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f37413h;

        /* JADX INFO: renamed from: com.fourthline.orca.workflow.SessionBuilder$a$a, reason: collision with other inner class name */
        static final class C0630a extends SuspendLambda implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37415b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Gg.b f37416c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l f37417d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ WorkflowConfig f37418e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ SessionBuilder f37419f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Zy f37420g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f37421h;

            /* JADX INFO: renamed from: com.fourthline.orca.workflow.SessionBuilder$a$a$a, reason: collision with other inner class name */
            static final class C0631a extends SuspendLambda implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f37422a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Zy f37423b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Gg.b f37424c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ SessionBuilder f37425d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f37426e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0631a(Zy zy2, Gg.b bVar, SessionBuilder sessionBuilder, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f37423b = zy2;
                    this.f37424c = bVar;
                    this.f37425d = sessionBuilder;
                    this.f37426e = coroutineScope;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0631a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0631a(this.f37423b, this.f37424c, this.f37425d, this.f37426e, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f37422a;
                    if (i11 == 0) {
                        t.b(obj);
                        Zy zy2 = this.f37423b;
                        PE peA = this.f37424c.a().a();
                        Context context = this.f37425d.context;
                        CoroutineScope coroutineScope = this.f37426e;
                        this.f37422a = 1;
                        if (SessionBuilderKt.tryCollectDeviceData(zy2, peA, context, coroutineScope, this) == coroutine_suspended) {
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
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0630a(Gg.b bVar, l lVar, WorkflowConfig workflowConfig, SessionBuilder sessionBuilder, Zy zy2, CoroutineScope coroutineScope, Continuation continuation) {
                super(2, continuation);
                this.f37416c = bVar;
                this.f37417d = lVar;
                this.f37418e = workflowConfig;
                this.f37419f = sessionBuilder;
                this.f37420g = zy2;
                this.f37421h = coroutineScope;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0630a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0630a c0630a = new C0630a(this.f37416c, this.f37417d, this.f37418e, this.f37419f, this.f37420g, this.f37421h, continuation);
                c0630a.f37415b = obj;
                return c0630a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f37414a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f37415b;
                Fg fgA = this.f37416c.a();
                WorkflowConfig workflowConfig = this.f37418e;
                SessionBuilder sessionBuilder = this.f37419f;
                sessionBuilder.analytics.track((InterfaceC3626o3.b) new InterfaceC3626o3.b.e(fgA, workflowConfig, fgA.a().c()));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0631a(this.f37420g, this.f37416c, this.f37419f, this.f37421h, null), 3, null);
                l lVar = this.f37417d;
                s.Companion companion = s.INSTANCE;
                lVar.invoke(s.a(s.b(this.f37416c.a())));
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Gg gg2, SessionBuilder sessionBuilder, Locale locale, l lVar, WorkflowConfig workflowConfig, Zy zy2, CoroutineScope coroutineScope, Continuation continuation) {
            super(2, continuation);
            this.f37407b = gg2;
            this.f37408c = sessionBuilder;
            this.f37409d = locale;
            this.f37410e = lVar;
            this.f37411f = workflowConfig;
            this.f37412g = zy2;
            this.f37413h = coroutineScope;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f37407b, this.f37408c, this.f37409d, this.f37410e, this.f37411f, this.f37412g, this.f37413h, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r12, r3, r11) == r0) goto L17;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f37406a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r12)
                goto L91
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                jn0.t.b(r12)
                jn0.s r12 = (jn0.s) r12
                java.lang.Object r12 = r12.getValue()
                goto L49
            L25:
                jn0.t.b(r12)
                com.fourthline.orca.internal.Gg r12 = r11.f37407b
                com.fourthline.orca.internal.Gg$a r1 = new com.fourthline.orca.internal.Gg$a
                com.fourthline.orca.workflow.SessionBuilder r4 = r11.f37408c
                java.lang.String r4 = com.fourthline.orca.workflow.SessionBuilder.access$getValidationCode$p(r4)
                java.util.Locale r5 = r11.f37409d
                java.lang.String r5 = r5.getLanguage()
                java.lang.String r6 = "getLanguage(...)"
                p013kotlin.jvm.internal.s.j(r5, r6)
                r1.<init>(r4, r5)
                r11.f37406a = r3
                java.lang.Object r12 = r12.a(r1, r11)
                if (r12 != r0) goto L49
                goto L6e
            L49:
                wn0.l r5 = r11.f37410e
                com.fourthline.orca.workflow.WorkflowConfig r6 = r11.f37411f
                com.fourthline.orca.workflow.SessionBuilder r7 = r11.f37408c
                com.fourthline.orca.internal.Zy r8 = r11.f37412g
                kotlinx.coroutines.CoroutineScope r9 = r11.f37413h
                java.lang.Throwable r1 = jn0.s.e(r12)
                if (r1 != 0) goto L6f
                r4 = r12
                com.fourthline.orca.internal.Gg$b r4 = (com.fourthline.orca.internal.Gg.b) r4
                kotlinx.coroutines.MainCoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getMain()
                com.fourthline.orca.workflow.SessionBuilder$a$a r3 = new com.fourthline.orca.workflow.SessionBuilder$a$a
                r10 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r11.f37406a = r2
                java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r3, r11)
                if (r12 != r0) goto L91
            L6e:
                return r0
            L6f:
                com.fourthline.orca.internal.ZD r12 = com.fourthline.orca.internal.AbstractC3039aE.a(r1)
                com.fourthline.orca.workflow.WorkflowError$Unexpected r0 = new com.fourthline.orca.workflow.WorkflowError$Unexpected
                java.lang.String r1 = r12.getMessage()
                if (r1 != 0) goto L7f
                java.lang.String r1 = r12.toString()
            L7f:
                r0.<init>(r1)
                java.lang.Object r12 = jn0.t.a(r0)
                java.lang.Object r12 = jn0.s.b(r12)
                jn0.s r12 = jn0.s.a(r12)
                r5.invoke(r12)
            L91:
                jn0.h0 r12 = jn0.h0.f84049a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.workflow.SessionBuilder.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SessionBuilder(Context context, String validationCode, InterfaceC3626o3 analytics) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.context = context;
        this.validationCode = validationCode;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SessionBuilder sessionBuilder, WorkflowConfig workflowConfig, l onSessionStartResult) {
        p013kotlin.jvm.internal.s.k(onSessionStartResult, "onSessionStartResult");
        Zy zyBuild = X5.a().a(new Qy(sessionBuilder.validationCode, workflowConfig)).a().b().a(new C4015x5(sessionBuilder.context)).build();
        Gg ggB = zyBuild.b();
        Locale locale = sessionBuilder.context.getResources().getConfiguration().getLocales().get(0);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(ggB, sessionBuilder, locale, onSessionStartResult, workflowConfig, zyBuild, CoroutineScope, null), 3, null);
    }

    @Override // com.fourthline.orca.workflow.WorkflowSessionConfiguration
    public WorkflowSessionStart configure(final WorkflowConfig config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        return new WorkflowSessionStart() { // from class: com.fourthline.orca.workflow.a
            @Override // com.fourthline.orca.workflow.WorkflowSessionStart
            public final void start(l lVar) {
                SessionBuilder.a(this.f37511a, config, lVar);
            }
        };
    }

    public /* synthetic */ SessionBuilder(Context context, String str, InterfaceC3626o3 interfaceC3626o3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? new InterfaceC3626o3() { // from class: com.fourthline.orca.workflow.SessionBuilder.1
            @Override // com.fourthline.orca.internal.InterfaceC3626o3
            public void onProductFailed(Throwable th2) {
                InterfaceC3626o3.a.a((InterfaceC3626o3) this, th2);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3626o3
            public void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization) {
                InterfaceC3626o3.a.a(this, productConfig, productCustomization);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3626o3
            public void onProductSuccess(Object obj) {
                InterfaceC3626o3.a.a(this, obj);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3354ho
            public void track(InterfaceC3626o3.b bVar) {
                InterfaceC3626o3.a.a((InterfaceC3626o3) this, bVar);
            }
        } : interfaceC3626o3);
    }
}
