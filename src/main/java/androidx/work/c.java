package androidx.work;

import androidx.core.util.Consumer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.Executor;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 X2\u00020\u0001:\u0003\n\u0015\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u001f\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u001f\u00109\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00101R\u001f\u0010<\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00101R\u0019\u0010@\u001a\u0004\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\b\u0015\u0010?R\u001a\u0010D\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b:\u0010CR\u0017\u0010H\u001a\u00020E8G¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\b7\u0010GR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\b3\u0010GR\u0017\u0010K\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\b(\u0010GR\u0017\u0010L\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\b\u0010\u0010GR\u0017\u0010M\u001a\u00020E8G¢\u0006\f\n\u0004\b\u001f\u0010F\u001a\u0004\b/\u0010GR\u0017\u0010O\u001a\u00020\u00068G¢\u0006\f\n\u0004\b8\u0010N\u001a\u0004\bO\u0010\bR\u001a\u0010R\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u0012\u0004\bP\u0010QR\u0017\u0010W\u001a\u00020S8G¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bI\u0010V¨\u0006Y"}, d2 = {"Landroidx/work/c;", "", "Landroidx/work/c$a;", "builder", "<init>", "(Landroidx/work/c$a;)V", "", "t", "()Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/Executor;", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "p", "()Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "c", "n", "taskExecutor", "Landroidx/work/b;", "Landroidx/work/b;", "()Landroidx/work/b;", "clock", "Landroidx/work/y0;", "e", "Landroidx/work/y0;", "r", "()Landroidx/work/y0;", "workerFactory", "Landroidx/work/p;", "f", "Landroidx/work/p;", "()Landroidx/work/p;", "inputMergerFactory", "Landroidx/work/m0;", "g", "Landroidx/work/m0;", "l", "()Landroidx/work/m0;", "runnableScheduler", "Landroidx/core/util/Consumer;", "", "h", "Landroidx/core/util/Consumer;", "()Landroidx/core/util/Consumer;", "initializationExceptionHandler", IntegerTokenConverter.CONVERTER_KEY, "m", "schedulingExceptionHandler", "Landroidx/work/x0;", "j", "s", "workerInitializationExceptionHandler", "k", "q", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "J", "()J", "remoteSessionTimeoutMillis", "", "I", "()I", "minimumLoggingLevel", "o", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "Z", "isUsingDefaultTaskExecutor", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Landroidx/work/o0;", "u", "Landroidx/work/o0;", "()Landroidx/work/o0;", "tracer", "v", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workerCoroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor taskExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b clock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y0 workerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p inputMergerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m0 runnableScheduler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Consumer<Throwable> initializationExceptionHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Consumer<Throwable> schedulingExceptionHandler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Consumer<x0> workerInitializationExceptionHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Consumer<x0> workerExecutionExceptionHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String defaultProcessName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long remoteSessionTimeoutMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int minimumLoggingLevel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int minJobSchedulerId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int maxJobSchedulerId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int contentUriTriggerWorkersLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int maxSchedulerLimit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isUsingDefaultTaskExecutor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isMarkingJobsAsImportantWhileForeground;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final o0 tracer;

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00100\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R$\u00107\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b\u0017\u00104\"\u0004\b5\u00106R$\u0010>\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010F\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b2\u0010C\"\u0004\bD\u0010ER*\u0010J\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER*\u0010O\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER*\u0010S\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010C\"\u0004\bR\u0010ER$\u0010Y\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\b'\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]\"\u0004\b^\u0010_R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010a\u001a\u0004\bA\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010a\u001a\u0004\bT\u0010b\"\u0004\be\u0010dR\"\u0010h\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010a\u001a\u0004\bL\u0010b\"\u0004\bg\u0010dR\"\u0010k\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010a\u001a\u0004\bP\u0010b\"\u0004\bj\u0010dR\"\u0010m\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010a\u001a\u0004\b\u001f\u0010b\"\u0004\bl\u0010dR\"\u0010s\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010o\u001a\u0004\bG\u0010p\"\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010u\u001a\u0004\bi\u0010v\"\u0004\bw\u0010x¨\u0006z"}, d2 = {"Landroidx/work/c$a;", "", "<init>", "()V", "", "loggingLevel", "w", "(I)Landroidx/work/c$a;", "", "processName", "v", "(Ljava/lang/String;)Landroidx/work/c$a;", "Landroidx/work/c;", "a", "()Landroidx/work/c;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "r", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerContext", "Landroidx/work/y0;", "c", "Landroidx/work/y0;", "t", "()Landroidx/work/y0;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/y0;)V", "workerFactory", "Landroidx/work/p;", DateTokenConverter.CONVERTER_KEY, "Landroidx/work/p;", "g", "()Landroidx/work/p;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/p;)V", "inputMergerFactory", "p", "setTaskExecutor$work_runtime_release", "taskExecutor", "Landroidx/work/b;", "f", "Landroidx/work/b;", "()Landroidx/work/b;", "setClock$work_runtime_release", "(Landroidx/work/b;)V", "clock", "Landroidx/work/m0;", "Landroidx/work/m0;", "n", "()Landroidx/work/m0;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/m0;)V", "runnableScheduler", "Landroidx/core/util/Consumer;", "", "h", "Landroidx/core/util/Consumer;", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "initializationExceptionHandler", IntegerTokenConverter.CONVERTER_KEY, "o", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Landroidx/work/x0;", "j", "u", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "s", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "m", "J", "()J", "setRemoteSessionTimeoutMillis$work_runtime_release", "(J)V", "remoteSessionTimeoutMillis", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "q", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Landroidx/work/o0;", "Landroidx/work/o0;", "()Landroidx/work/o0;", "setTracer$work_runtime_release", "(Landroidx/work/o0;)V", "tracer", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Executor executor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext workerContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private y0 workerFactory;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p inputMergerFactory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Executor taskExecutor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private b clock;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private m0 runnableScheduler;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Consumer<Throwable> initializationExceptionHandler;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Consumer<Throwable> schedulingExceptionHandler;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Consumer<x0> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Consumer<x0> workerExecutionExceptionHandler;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String defaultProcessName;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int minJobSchedulerId;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private o0 tracer;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long remoteSessionTimeoutMillis = 600000;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int loggingLevel = 4;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private int maxJobSchedulerId = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private int maxSchedulerLimit = 20;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private int contentUriTriggerWorkersLimit = 8;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean markJobsAsImportantWhileForeground = true;

        public final c a() {
            return new c(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        public final Consumer<Throwable> f() {
            return this.initializationExceptionHandler;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final p getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final long getRemoteSessionTimeoutMillis() {
            return this.remoteSessionTimeoutMillis;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final m0 getRunnableScheduler() {
            return this.runnableScheduler;
        }

        public final Consumer<Throwable> o() {
            return this.schedulingExceptionHandler;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final o0 getTracer() {
            return this.tracer;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        public final Consumer<x0> s() {
            return this.workerExecutionExceptionHandler;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final y0 getWorkerFactory() {
            return this.workerFactory;
        }

        public final Consumer<x0> u() {
            return this.workerInitializationExceptionHandler;
        }

        public final a v(String processName) {
            p013kotlin.jvm.internal.s.k(processName, "processName");
            this.defaultProcessName = processName;
            return this;
        }

        public final a w(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/c$c;", "", "Landroidx/work/c;", "g", "()Landroidx/work/c;", "workManagerConfiguration", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InterfaceC0245c {
        c g();
    }

    public c(a builder) {
        p013kotlin.jvm.internal.s.k(builder, "builder");
        CoroutineContext workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? d.d(workerContext) : null;
            if (executor == null) {
                executor = d.e(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = builder.getExecutor() != null ? ExecutorsKt.from(executor) : Dispatchers.getDefault();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? d.e(true) : taskExecutor;
        b clock = builder.getClock();
        this.clock = clock == null ? new n0() : clock;
        y0 workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? i.f14545a : workerFactory;
        p inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? b0.f14453a : inputMergerFactory;
        m0 runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new lb.d() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.f();
        this.schedulingExceptionHandler = builder.o();
        this.workerInitializationExceptionHandler = builder.u();
        this.workerExecutionExceptionHandler = builder.s();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.remoteSessionTimeoutMillis = builder.getRemoteSessionTimeoutMillis();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        o0 tracer = builder.getTracer();
        this.tracer = tracer == null ? d.f() : tracer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getClock() {
        return this.clock;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    public final Consumer<Throwable> e() {
        return this.initializationExceptionHandler;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getRemoteSessionTimeoutMillis() {
        return this.remoteSessionTimeoutMillis;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m0 getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final Consumer<Throwable> m() {
        return this.schedulingExceptionHandler;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final o0 getTracer() {
        return this.tracer;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final Consumer<x0> q() {
        return this.workerExecutionExceptionHandler;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final y0 getWorkerFactory() {
        return this.workerFactory;
    }

    public final Consumer<x0> s() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
