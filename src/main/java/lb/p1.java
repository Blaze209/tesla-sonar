package lb;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import sb.WorkGenerationalId;
import sb.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002.(B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010\rR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010W\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010YR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bS\u0010\\¨\u0006^"}, d2 = {"Llb/p1;", "", "Llb/p1$a;", "builder", "<init>", "(Llb/p1$a;)V", "Llb/p1$b;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/y$a;", "result", "", "r", "(Landroidx/work/y$a;)Z", "", "stopReason", "u", "(I)Z", "n", "A", "()Z", "", "workSpecId", "Ljn0/h0;", "p", "(Ljava/lang/String;)V", "s", "t", "z", "", "tags", "k", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/google/common/util/concurrent/s;", "q", "()Lcom/google/common/util/concurrent/s;", "o", "(I)V", "y", "Lsb/m0;", "a", "Lsb/m0;", "m", "()Lsb/m0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", DateTokenConverter.CONVERTER_KEY, "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/y;", "e", "Landroidx/work/y;", "builderWorker", "Lub/b;", "f", "Lub/b;", "workTaskExecutor", "Landroidx/work/c;", "g", "Landroidx/work/c;", "configuration", "Landroidx/work/b;", "h", "Landroidx/work/b;", "clock", "Lrb/a;", IntegerTokenConverter.CONVERTER_KEY, "Lrb/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lsb/n0;", "Lsb/n0;", "workSpecDao", "Lsb/b;", "l", "Lsb/b;", "dependencyDao", "Ljava/util/List;", "workDescription", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "workerJob", "Lsb/z;", "()Lsb/z;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sb.m0 workSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String workSpecId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters.a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.y builderWorker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ub.b workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.c configuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.b clock;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final rb.a foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final sb.n0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sb.b dependencyDao;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<String> tags;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String workDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob workerJob;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Llb/p1$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/c;", "configuration", "Lub/b;", "workTaskExecutor", "Lrb/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lsb/m0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/c;Lub/b;Lrb/a;Landroidx/work/impl/WorkDatabase;Lsb/m0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Llb/p1$a;", "Llb/p1;", "a", "()Llb/p1;", "Landroidx/work/c;", "c", "()Landroidx/work/c;", "b", "Lub/b;", IntegerTokenConverter.CONVERTER_KEY, "()Lub/b;", "Lrb/a;", DateTokenConverter.CONVERTER_KEY, "()Lrb/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Lsb/m0;", "h", "()Lsb/m0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/y;", "Landroidx/work/y;", "j", "()Landroidx/work/y;", "setWorker", "(Landroidx/work/y;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.work.c configuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ub.b workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rb.a foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final sb.m0 workSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<String> tags;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Context appContext;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private androidx.work.y worker;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private WorkerParameters.a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.c configuration, ub.b workTaskExecutor, rb.a foregroundProcessor, WorkDatabase workDatabase, sb.m0 workSpec, List<String> tags) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            p013kotlin.jvm.internal.s.k(workTaskExecutor, "workTaskExecutor");
            p013kotlin.jvm.internal.s.k(foregroundProcessor, "foregroundProcessor");
            p013kotlin.jvm.internal.s.k(workDatabase, "workDatabase");
            p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
            p013kotlin.jvm.internal.s.k(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.a();
        }

        public final p1 a() {
            return new p1(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.work.c getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final rb.a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final List<String> f() {
            return this.tags;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final sb.m0 getWorkSpec() {
            return this.workSpec;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ub.b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final androidx.work.y getWorker() {
            return this.worker;
        }

        public final a k(WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Llb/p1$b;", "", "<init>", "()V", "c", "a", "b", "Llb/p1$b$a;", "Llb/p1$b$b;", "Llb/p1$b$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Llb/p1$b$a;", "Llb/p1$b;", "Landroidx/work/y$a;", "result", "<init>", "(Landroidx/work/y$a;)V", "a", "Landroidx/work/y$a;", "()Landroidx/work/y$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final androidx.work.y.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.work.y.a result) {
                super(null);
                p013kotlin.jvm.internal.s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.y.a getResult() {
                return this.result;
            }

            public /* synthetic */ a(androidx.work.y.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? new androidx.work.y.a.C0256a() : aVar);
            }
        }

        /* JADX INFO: renamed from: lb.p1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Llb/p1$b$b;", "Llb/p1$b;", "Landroidx/work/y$a;", "result", "<init>", "(Landroidx/work/y$a;)V", "a", "Landroidx/work/y$a;", "()Landroidx/work/y$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1894b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final androidx.work.y.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1894b(androidx.work.y.a result) {
                super(null);
                p013kotlin.jvm.internal.s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.y.a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Llb/p1$b$c;", "Llb/p1$b;", "", AnalyticsAttribute.Reason, "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int reason;

            public c(int i11) {
                super(null);
                this.reason = i11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public /* synthetic */ c(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? -256 : i11);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89859n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Llb/p1$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Llb/p1$b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super b>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f89861n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p1 f89862o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p1 p1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f89862o = p1Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f89862o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f89861n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    return obj;
                }
                jn0.t.b(obj);
                p1 p1Var = this.f89862o;
                this.f89861n = 1;
                Object objV = p1Var.v(this);
                return objV == coroutine_suspended ? coroutine_suspended : objV;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super b> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean b(b bVar, p1 p1Var) {
            boolean zU;
            if (bVar instanceof b.C1894b) {
                zU = p1Var.r(((b.C1894b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                p1Var.y(((b.a) bVar).getResult());
                zU = false;
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                zU = p1Var.u(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(zU);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return p1.this.new c(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final b aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89859n;
            int i12 = 1;
            androidx.work.y.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    CompletableJob completableJob = p1.this.workerJob;
                    a aVar3 = new a(p1.this, null);
                    this.f89859n = 1;
                    obj = BuildersKt.withContext(completableJob, aVar3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                aVar = (b) obj;
            } catch (WorkerStoppedException e11) {
                aVar = new b.c(e11.getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i12, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                androidx.work.z.e().d(r1.f89879a, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = p1.this.workDatabase;
            final p1 p1Var = p1.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: lb.q1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return p1.c.b(aVar, p1Var);
                }
            });
            p013kotlin.jvm.internal.s.j(objRunInTransaction, "runInTransaction(...)");
            return objRunInTransaction;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m = "runWorker", n = {"params"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f89863n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f89864o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f89866q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f89864o = obj;
            this.f89866q |= Integer.MIN_VALUE;
            return p1.this.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/y$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/y$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", i = {}, l = {300, EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super androidx.work.y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89867n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.work.y f89869p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.n f89870q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.work.y yVar, androidx.work.n nVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f89869p = yVar;
            this.f89870q = nVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return p1.this.new e(this.f89869p, this.f89870q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89867n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Context context = p1.this.appContext;
                sb.m0 workSpec = p1.this.getWorkSpec();
                androidx.work.y yVar = this.f89869p;
                androidx.work.n nVar = this.f89870q;
                ub.b bVar = p1.this.workTaskExecutor;
                this.f89867n = 1;
                eVar = this;
                if (tb.j0.b(context, workSpec, yVar, nVar, bVar, eVar) != coroutine_suspended) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            eVar = this;
            String str = r1.f89879a;
            p1 p1Var = p1.this;
            androidx.work.z.e().a(str, "Starting work for " + p1Var.getWorkSpec().workerClassName);
            com.google.common.util.concurrent.s<androidx.work.y.a> sVarStartWork = eVar.f89869p.startWork();
            p013kotlin.jvm.internal.s.j(sVarStartWork, "startWork(...)");
            androidx.work.y yVar2 = eVar.f89869p;
            eVar.f89867n = 2;
            Object objD = r1.d(sVarStartWork, yVar2, this);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super androidx.work.y.a> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public p1(a builder) {
        p013kotlin.jvm.internal.s.k(builder, "builder");
        sb.m0 workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        androidx.work.c configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.j();
        this.dependencyDao = workDatabase.d();
        List<String> listF = builder.f();
        this.tags = listF;
        this.workDescription = k(listF);
        this.workerJob = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    private final boolean A() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: lb.o1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p1.B(this.f89828a);
            }
        });
        p013kotlin.jvm.internal.s.j(objRunInTransaction, "runInTransaction(...)");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean B(p1 p1Var) {
        boolean z11;
        if (p1Var.workSpecDao.a(p1Var.workSpecId) == androidx.work.r0.c.ENQUEUED) {
            p1Var.workSpecDao.j(androidx.work.r0.c.RUNNING, p1Var.workSpecId);
            p1Var.workSpecDao.D(p1Var.workSpecId);
            p1Var.workSpecDao.c(p1Var.workSpecId, -256);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    private final String k(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + p013kotlin.collections.v.y0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean n(androidx.work.y.a result) {
        if (result instanceof androidx.work.y.a.c) {
            String str = r1.f89879a;
            androidx.work.z.e().f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.o() ? t() : z(result);
        }
        if (result instanceof androidx.work.y.a.b) {
            String str2 = r1.f89879a;
            androidx.work.z.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return s(-256);
        }
        String str3 = r1.f89879a;
        androidx.work.z.e().f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            return t();
        }
        if (result == null) {
            result = new androidx.work.y.a.C0256a();
        }
        return y(result);
    }

    private final void p(String workSpecId) {
        List listS = p013kotlin.collections.v.s(workSpecId);
        while (!listS.isEmpty()) {
            String str = (String) p013kotlin.collections.v.O(listS);
            if (this.workSpecDao.a(str) != androidx.work.r0.c.CANCELLED) {
                this.workSpecDao.j(androidx.work.r0.c.FAILED, str);
            }
            listS.addAll(this.dependencyDao.a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(androidx.work.y.a result) {
        androidx.work.r0.c cVarA = this.workSpecDao.a(this.workSpecId);
        this.workDatabase.i().b(this.workSpecId);
        if (cVarA == null) {
            return false;
        }
        if (cVarA == androidx.work.r0.c.RUNNING) {
            return n(result);
        }
        if (cVarA.isFinished()) {
            return false;
        }
        return s(-512);
    }

    private final boolean s(int stopReason) {
        this.workSpecDao.j(androidx.work.r0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.p(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.w(this.workSpecId, -1L);
        this.workSpecDao.c(this.workSpecId, stopReason);
        return true;
    }

    private final boolean t() {
        this.workSpecDao.k(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.j(androidx.work.r0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.n(this.workSpecId);
        this.workSpecDao.p(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.q(this.workSpecId);
        this.workSpecDao.w(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(int stopReason) {
        if (p013kotlin.jvm.internal.s.f(this.workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            String str = r1.f89879a;
            androidx.work.z.e().a(str, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            s(stopReason);
            return true;
        }
        androidx.work.r0.c cVarA = this.workSpecDao.a(this.workSpecId);
        if (cVarA == null || cVarA.isFinished()) {
            String str2 = r1.f89879a;
            androidx.work.z.e().a(str2, "Status for " + this.workSpecId + " is " + cVarA + " ; not doing any work");
            return false;
        }
        String str3 = r1.f89879a;
        androidx.work.z.e().a(str3, "Status for " + this.workSpecId + " is " + cVarA + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.j(androidx.work.r0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.c(this.workSpecId, stopReason);
        this.workSpecDao.w(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:66:0x0216  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(Continuation<? super b> continuation) {
        d dVar;
        androidx.work.g gVarA;
        WorkerParameters workerParameters;
        Consumer<androidx.work.x0> consumerQ;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f89866q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f89866q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithContext = dVar.f89864o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f89866q;
        int i13 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            if (i12 == 0) {
                jn0.t.b(objWithContext);
                final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
                final String traceTag = this.workSpec.getTraceTag();
                if (zIsEnabled && traceTag != null) {
                    this.configuration.getTracer().d(traceTag, this.workSpec.hashCode());
                }
                int i14 = 0;
                if (((Boolean) this.workDatabase.runInTransaction(new Callable() { // from class: lb.m1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return p1.w(this.f89820a);
                    }
                })).booleanValue()) {
                    return new b.c(i14, i13, defaultConstructorMarker);
                }
                if (this.workSpec.o()) {
                    gVarA = this.workSpec.input;
                } else {
                    androidx.work.o oVarB = this.configuration.getInputMergerFactory().b(this.workSpec.inputMergerClassName);
                    if (oVarB == null) {
                        String str = r1.f89879a;
                        androidx.work.z.e().c(str, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                        return new b.a(objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
                    }
                    gVarA = oVarB.a(p013kotlin.collections.v.P0(p013kotlin.collections.v.e(this.workSpec.input), this.workSpecDao.g(this.workSpecId)));
                }
                androidx.work.g gVar = gVarA;
                UUID uuidFromString = UUID.fromString(this.workSpecId);
                List<String> list = this.tags;
                WorkerParameters.a aVar = this.runtimeExtras;
                sb.m0 m0Var = this.workSpec;
                WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, gVar, list, aVar, m0Var.runAttemptCount, m0Var.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new tb.n0(this.workDatabase, this.workTaskExecutor), new tb.l0(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
                final androidx.work.y yVarB = this.builderWorker;
                if (yVarB == null) {
                    try {
                        yVarB = this.configuration.getWorkerFactory().b(this.appContext, this.workSpec.workerClassName, workerParameters2);
                    } catch (Throwable th2) {
                        String str2 = r1.f89879a;
                        androidx.work.z.e().c(str2, "Could not create Worker " + this.workSpec.workerClassName);
                        Consumer<androidx.work.x0> consumerS = this.configuration.s();
                        if (consumerS != null) {
                            tb.o0.a(consumerS, new androidx.work.x0(this.workSpec.workerClassName, workerParameters2, th2), r1.f89879a);
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                }
                yVarB.setUsed();
                CoroutineContext.Element element = dVar.getContext().get(Job.INSTANCE);
                p013kotlin.jvm.internal.s.h(element);
                Job job = (Job) element;
                job.invokeOnCompletion(new wn0.l() { // from class: lb.n1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return p1.x(yVarB, zIsEnabled, traceTag, this, (Throwable) obj);
                    }
                });
                if (!A()) {
                    return new b.c(0, 1, null);
                }
                int i15 = 0;
                int i16 = 1;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (job.isCancelled()) {
                    return new b.c(i15, i16, defaultConstructorMarker2);
                }
                androidx.work.n nVarB = workerParameters2.b();
                p013kotlin.jvm.internal.s.j(nVarB, "getForegroundUpdater(...)");
                Executor executorC = this.workTaskExecutor.c();
                p013kotlin.jvm.internal.s.j(executorC, "getMainThreadExecutor(...)");
                CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(executorC);
                try {
                    e eVar = new e(yVarB, nVarB, null);
                    dVar.f89863n = workerParameters2;
                    dVar.f89866q = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, eVar, dVar);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    workerParameters = workerParameters2;
                } catch (Throwable th3) {
                    th = th3;
                    workerParameters = workerParameters2;
                    String str3 = r1.f89879a;
                    androidx.work.z.e().d(str3, this.workDescription + " failed because it threw an exception/error", th);
                    consumerQ = this.configuration.q();
                    if (consumerQ != null) {
                        tb.o0.a(consumerQ, new androidx.work.x0(this.workSpec.workerClassName, workerParameters, th), r1.f89879a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workerParameters = (WorkerParameters) dVar.f89863n;
                try {
                    jn0.t.b(objWithContext);
                } catch (Throwable th4) {
                    th = th4;
                    String str4 = r1.f89879a;
                    androidx.work.z.e().d(str4, this.workDescription + " failed because it threw an exception/error", th);
                    consumerQ = this.configuration.q();
                    if (consumerQ != null) {
                        tb.o0.a(consumerQ, new androidx.work.x0(this.workSpec.workerClassName, workerParameters, th), r1.f89879a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            androidx.work.y.a aVar2 = (androidx.work.y.a) objWithContext;
            p013kotlin.jvm.internal.s.h(aVar2);
            return new b.C1894b(aVar2);
        } catch (CancellationException e11) {
            String str5 = r1.f89879a;
            androidx.work.z.e().g(str5, this.workDescription + " was cancelled", e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean w(p1 p1Var) {
        sb.m0 m0Var = p1Var.workSpec;
        if (m0Var.state != androidx.work.r0.c.ENQUEUED) {
            String str = r1.f89879a;
            androidx.work.z.e().a(str, p1Var.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!m0Var.o() && !p1Var.workSpec.n()) || p1Var.clock.currentTimeMillis() >= p1Var.workSpec.c()) {
            return Boolean.FALSE;
        }
        androidx.work.z.e().a(r1.f89879a, "Delaying execution for " + p1Var.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x(androidx.work.y yVar, boolean z11, String str, p1 p1Var, Throwable th2) {
        if (th2 instanceof WorkerStoppedException) {
            yVar.stop(((WorkerStoppedException) th2).getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String());
        }
        if (z11 && str != null) {
            p1Var.configuration.getTracer().c(str, p1Var.workSpec.hashCode());
        }
        return jn0.h0.f84049a;
    }

    private final boolean z(androidx.work.y.a result) {
        this.workSpecDao.j(androidx.work.r0.c.SUCCEEDED, this.workSpecId);
        p013kotlin.jvm.internal.s.i(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.g gVarC = ((androidx.work.y.a.c) result).c();
        p013kotlin.jvm.internal.s.j(gVarC, "getOutputData(...)");
        this.workSpecDao.A(this.workSpecId, gVarC);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.a(this.workSpecId)) {
            if (this.workSpecDao.a(str) == androidx.work.r0.c.BLOCKED && this.dependencyDao.b(str)) {
                String str2 = r1.f89879a;
                androidx.work.z.e().f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.j(androidx.work.r0.c.ENQUEUED, str);
                this.workSpecDao.k(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    public final WorkGenerationalId l() {
        return v1.a(this.workSpec);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final sb.m0 getWorkSpec() {
        return this.workSpec;
    }

    public final void o(int stopReason) {
        this.workerJob.cancel((CancellationException) new WorkerStoppedException(stopReason));
    }

    public final com.google.common.util.concurrent.s<Boolean> q() {
        return androidx.work.w.k(this.workTaskExecutor.a().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new c(null), 2, null);
    }

    public final boolean y(androidx.work.y.a result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        p(this.workSpecId);
        androidx.work.g gVarC = ((androidx.work.y.a.C0256a) result).c();
        p013kotlin.jvm.internal.s.j(gVarC, "getOutputData(...)");
        this.workSpecDao.p(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.A(this.workSpecId, gVarC);
        return false;
    }
}
