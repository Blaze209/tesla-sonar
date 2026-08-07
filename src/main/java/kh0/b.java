package kh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sn0.h;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkh0/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "subsystem", "Lkh0/a;", "level", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkh0/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Lkh0/a;Ljava/lang/String;)V", "g", "(Ljava/lang/String;Lkh0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "Ljava/io/File;", "logFile", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "loggerContext", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File logFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher loggerContext;

    /* JADX INFO: renamed from: kh0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.logger.Logger$_log$2", f = "Logger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1842b extends SuspendLambda implements p<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86102n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a f86104p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f86105q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f86106r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1842b(a aVar, String str, String str2, Continuation<? super C1842b> continuation) {
            super(2, continuation);
            this.f86104p = aVar;
            this.f86105q = str;
            this.f86106r = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1842b(this.f86104p, this.f86105q, this.f86106r, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f86102n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                File parentFile = b.this.logFile.getParentFile();
                if (parentFile != null) {
                    Boxing.boxBoolean(parentFile.mkdirs());
                }
                String str = this.f86104p.name() + "," + b.this.dateFormat.format(new Date()) + "," + this.f86105q + "," + this.f86106r;
                FileWriter fileWriter = new FileWriter(b.this.logFile, true);
                try {
                    Writer writerAppend = fileWriter.append((CharSequence) str);
                    sn0.b.a(fileWriter, null);
                    return writerAppend;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(fileWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C1842b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFile$2", f = "Logger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86107n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f86107n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                return Boxing.boxBoolean(b.this.logFile.delete());
            } catch (Exception unused) {
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1", f = "Logger.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86109n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f86110o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f86111p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f86112q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f86113r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, b bVar, String str2, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f86110o = str;
            this.f86111p = bVar;
            this.f86112q = str2;
            this.f86113r = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f86110o, this.f86111p, this.f86112q, this.f86113r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f86109n;
            if (i11 == 0) {
                t.b(obj);
                String strV = p013kotlin.text.t.V(this.f86110o, "\n", "\\n", false, 4, null);
                b bVar = this.f86111p;
                String str = this.f86112q;
                a aVar = this.f86113r;
                this.f86109n = 1;
                if (bVar.a(str, aVar, strV, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2", f = "Logger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86114n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f86116p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f86117q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f86116p = str;
            this.f86117q = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(String str, a aVar, StringBuilder sb2, String str2) {
            List listF1 = p013kotlin.text.t.f1(str2, new String[]{","}, false, 0, 6, null);
            String str3 = (String) listF1.get(0);
            if (s.f((String) listF1.get(2), str) && s.f(str3, aVar.name())) {
                sb2.append(str2);
                sb2.append("\n");
            }
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new e(this.f86116p, this.f86117q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f86114n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                if (!b.this.logFile.exists()) {
                    return null;
                }
                final StringBuilder sb2 = new StringBuilder();
                File file = b.this.logFile;
                final String str = this.f86116p;
                final a aVar = this.f86117q;
                h.g(file, null, new l() { // from class: kh0.c
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return b.e.b(str, aVar, sb2, (String) obj2);
                    }
                }, 1, null);
                return sb2.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(Context context) {
        s.k(context, "context");
        this.logFile = new File(context.getCacheDir(), "persona_log.csv");
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
        this.loggerContext = CoroutineDispatcher.limitedParallelism$default(Dispatchers.getIO(), 1, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, a aVar, String str2, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.loggerContext, new C1842b(aVar, str, str2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final Object e(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.loggerContext, new c(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final void f(String subsystem, a level, String message) {
        s.k(subsystem, "subsystem");
        s.k(level, "level");
        s.k(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(message, this, subsystem, level, null), 3, null);
    }

    public final Object g(String str, a aVar, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.loggerContext, new e(str, aVar, null), continuation);
    }
}
