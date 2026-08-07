package com.tesla.command;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.r;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c0;
import androidx.work.l;
import bb0.a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.logging.g;
import com.tesla.oapi.CommandActionExtensionsKt;
import ic0.c;
import ic0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import nd0.k;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ%\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010&\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006)"}, d2 = {"Lcom/tesla/command/CommandCenterBackgroundTasker;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lic0/c;", "action", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lic0/c;)V", "Lcom/tesla/command/CommandCenterBackgroundTasker$a;", "b", "(Lic0/c;Landroid/content/Context;)Lcom/tesla/command/CommandCenterBackgroundTasker$a;", "", "g", "(Lic0/c;)Z", "Lic0/g;", "h", "(Lic0/g;)Z", "f", "e", "response", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lic0/c;Lic0/g;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "", "", "c", "Ljava/util/Set;", "IGNORABLE_REASONS", "", "Ljava/util/List;", "onGoingCommands", "", "()I", "onGoingCommandCount", "a", "OnGoingCommandWorker", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommandCenterBackgroundTasker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CommandCenterBackgroundTasker f55729a = new CommandCenterBackgroundTasker();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("CommandCenterBackgroundTasker");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> IGNORABLE_REASONS = d1.i("already_set", "already_unset", "already closed", "already open", "already on");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List<c> onGoingCommands = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tesla/command/CommandCenterBackgroundTasker$OnGoingCommandWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "a", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnGoingCommandWorker extends CoroutineWorker {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final g f55734d = g.INSTANCE.a("OnGoingCommandWorker");

        /* JADX INFO: renamed from: com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/command/CommandCenterBackgroundTasker$OnGoingCommandWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lic0/c;", "onGoingCommands", "Ljn0/h0;", "c", "(Landroid/content/Context;Ljava/util/List;)V", "b", "(Landroid/content/Context;)V", "a", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(Context context) {
                s.k(context, "context");
                try {
                    f.h(context).c("OnGoingCommandWorker");
                } catch (Exception e11) {
                    OnGoingCommandWorker.f55734d.d("Failed to cancel on going command worker", e11);
                }
            }

            public final void b(Context context) {
                s.k(context, "context");
                try {
                    OnGoingCommandWorker.f55734d.j("Scheduling worker...");
                    f.h(context).f("OnGoingCommandWorker", l.REPLACE, new c0.a(OnGoingCommandWorker.class).b());
                } catch (Exception e11) {
                    OnGoingCommandWorker.f55734d.d("Failed to schedule on going command worker", e11);
                }
            }

            public final void c(Context context, List<c> onGoingCommands) {
                s.k(context, "context");
                s.k(onGoingCommands, "onGoingCommands");
                Pair<Integer, Notification> pairA = a.f16947a.a(context, onGoingCommands);
                r.e(context).g(pairA.a().intValue(), pairA.b());
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker", f = "CommandCenterBackgroundTasker.kt", i = {}, l = {355, 358}, m = "doWork", n = {}, s = {})
        static final class b extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f55735n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f55737p;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f55735n = obj;
                this.f55737p |= Integer.MIN_VALUE;
                return OnGoingCommandWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnGoingCommandWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            s.k(context, "context");
            s.k(workerParameters, "workerParameters");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(60000, r0) == r1) goto L36;
         */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doWork(p013kotlin.coroutines.Continuation<? super androidx.work.y.a> r8) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.tesla.command.CommandCenterBackgroundTasker$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tesla/command/CommandCenterBackgroundTasker$a;", "", "", "title", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getText", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class NotificationPresentation {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        public NotificationPresentation(String title, String text) {
            s.k(title, "title");
            s.k(text, "text");
            this.title = title;
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationPresentation)) {
                return false;
            }
            NotificationPresentation notificationPresentation = (NotificationPresentation) other;
            return s.f(this.title, notificationPresentation.title) && s.f(this.text, notificationPresentation.text);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "NotificationPresentation(title=" + this.title + ", text=" + this.text + ")";
        }
    }

    private CommandCenterBackgroundTasker() {
    }

    private final NotificationPresentation b(c cVar, Context context) {
        String string = context.getString(bc0.a.f16968b);
        s.j(string, "getString(...)");
        String string2 = context.getString(bc0.a.f16965a);
        s.j(string2, "getString(...)");
        return new NotificationPresentation(string, string2);
    }

    private final int c() {
        return onGoingCommands.size();
    }

    private final boolean g(c cVar) {
        return false;
    }

    private final boolean h(ic0.g gVar) {
        return (gVar.getResult() == h.RESULT_SUCCESS || v.g0(IGNORABLE_REASONS, gVar.getResultReason())) ? false : true;
    }

    private final void i(Context context, c action) {
        NotificationPresentation notificationPresentationB = b(action, context);
        String title = notificationPresentationB.getTitle();
        Notification notificationC = k.INSTANCE.b(context).m(title).l(notificationPresentationB.getText()).c();
        s.j(notificationC, "build(...)");
        logger.j("Showing failure notification for " + CommandActionExtensionsKt.getAnalyticsName(action));
        r.e(context).g(title.hashCode(), notificationC);
    }

    public final void d(Context context, c action, ic0.g response) {
        s.k(context, "context");
        s.k(action, "action");
        s.k(response, "response");
        if (h(response) && ie0.f.INSTANCE.a(context).getIsBackgrounded() && g(action)) {
            i(context, action);
        }
    }

    public final void e(Context context, c action) {
        Object next;
        s.k(context, "context");
        s.k(action, "action");
        if (g(action)) {
            synchronized (this) {
                try {
                    Iterator<T> it = onGoingCommands.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!s.f((c) next, action));
                    c cVar = (c) next;
                    if (cVar != null) {
                        List<c> list = onGoingCommands;
                        if (list.remove(cVar)) {
                            OnGoingCommandWorker.INSTANCE.c(context, list);
                        }
                    }
                    g gVar = logger;
                    CommandCenterBackgroundTasker commandCenterBackgroundTasker = f55729a;
                    gVar.j("On-going command count: " + commandCenterBackgroundTasker.c());
                    if (commandCenterBackgroundTasker.c() == 0) {
                        gVar.j("Killing on-going command worker...");
                        OnGoingCommandWorker.INSTANCE.a(context);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void f(Context context, c action) {
        s.k(context, "context");
        s.k(action, "action");
        if (g(action)) {
            synchronized (this) {
                try {
                    List<c> list = onGoingCommands;
                    list.add(action);
                    g gVar = logger;
                    CommandCenterBackgroundTasker commandCenterBackgroundTasker = f55729a;
                    gVar.j("On-going command count: " + commandCenterBackgroundTasker.c());
                    if (commandCenterBackgroundTasker.c() == 1) {
                        gVar.j("Starting on-going command worker... " + CommandActionExtensionsKt.getAnalyticsName(action));
                        OnGoingCommandWorker.INSTANCE.b(context);
                    } else {
                        gVar.j("Updating on-going commands notification...");
                        OnGoingCommandWorker.INSTANCE.c(context, list);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
