package com.tesla.utils;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c0;
import androidx.work.r0;
import androidx.work.s0;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tesla/utils/DummyWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/work/y$a;", "c", "a", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DummyWorker extends Worker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.tesla.utils.DummyWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/utils/DummyWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)Z", "Ljn0/h0;", "c", "(Landroid/content/Context;)V", "", "DUMMY_WORKER_TAG", "Ljava/lang/String;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.tesla.utils.DummyWorker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.utils.DummyWorker$Companion$scheduleIfNecessary$1", f = "WorkManagerUtils.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        static final class C1146a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f56571n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Context f56572o;

            /* JADX INFO: renamed from: com.tesla.utils.DummyWorker$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.tesla.utils.DummyWorker$Companion$scheduleIfNecessary$1$hasDummy$1", f = "WorkManagerUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1147a extends SuspendLambda implements p<CoroutineScope, Continuation<? super Boolean>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f56573n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Context f56574o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1147a(Context context, Continuation<? super C1147a> continuation) {
                    super(2, continuation);
                    this.f56574o = context;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1147a(this.f56574o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f56573n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return Boxing.boxBoolean(DummyWorker.INSTANCE.b(this.f56574o));
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C1147a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1146a(Context context, Continuation<? super C1146a> continuation) {
                super(2, continuation);
                this.f56572o = context;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1146a(this.f56572o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f56571n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C1147a c1147a = new C1147a(this.f56572o, null);
                    this.f56571n = 1;
                    obj = BuildersKt.withContext(io2, c1147a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    f.h(this.f56572o).d(new c0.a(DummyWorker.class).a("tesla-widget-DummyWorker").m(3650L, TimeUnit.DAYS).b());
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C1146a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(Context context) {
            List<r0> list;
            try {
                list = s0.INSTANCE.a(context).f("tesla-widget-DummyWorker").get();
            } catch (Exception unused) {
                list = null;
            }
            if (list == null) {
                return false;
            }
            List<r0> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (r0 r0Var : list2) {
                if (r0Var.getState() == r0.c.ENQUEUED || r0Var.getState() == r0.c.RUNNING) {
                    return true;
                }
            }
            return false;
        }

        public final void c(Context context) {
            s.k(context, "context");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C1146a(context, null), 3, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DummyWorker(Context context, WorkerParameters params) {
        super(context, params);
        s.k(context, "context");
        s.k(params, "params");
    }

    @Override // androidx.work.Worker
    public y.a d() {
        Companion companion = INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        companion.c(applicationContext);
        y.a aVarE = y.a.e();
        s.j(aVarE, "success(...)");
        return aVarE;
    }
}
