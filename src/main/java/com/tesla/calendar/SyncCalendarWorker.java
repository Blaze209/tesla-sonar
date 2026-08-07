package com.tesla.calendar;

import android.content.Context;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.a0;
import androidx.work.c0;
import androidx.work.e;
import androidx.work.l;
import androidx.work.rxjava3.RxWorker;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.h;
import com.tesla.calendar.SyncCalendarWorker;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.x;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.r;
import wa0.c;
import wb.f;
import za0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tesla/calendar/SyncCalendarWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lio/reactivex/rxjava3/core/u;", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Lio/reactivex/rxjava3/core/u;", "a", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncCalendarWorker extends RxWorker {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f55728e = g.INSTANCE.a("SyncCalendarWorker");

    /* JADX INFO: renamed from: com.tesla.calendar.SyncCalendarWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tesla/calendar/SyncCalendarWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", DateTokenConverter.CONVERTER_KEY, "", "syncEnabled", "c", "(Landroid/content/Context;Z)V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "CALENDAR_UPDATED_REASON", "", "MAX_RETRIES", "I", "WORKER_NAME_CALENDAR_CHANGES", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void b(Context context) {
            try {
                b.f128027a.a("Cancelling calendar change worker");
                f.h(context).c("SyncCalendarWorker_CalendarChanges");
            } catch (Exception e11) {
                SyncCalendarWorker.f55728e.d("Failed to cancel calendar worker", e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(Context context) {
            try {
                b.f128027a.a("Scheduling calendar change worker");
                e.a aVarD = new e.a().d(a0.CONNECTED);
                Uri CONTENT_URI = CalendarContract.CONTENT_URI;
                s.j(CONTENT_URI, "CONTENT_URI");
                e.a aVarA = aVarD.a(CONTENT_URI, true);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVarA.i(15L, timeUnit);
                f.h(context).f("SyncCalendarWorker_CalendarChanges", l.REPLACE, new c0.a(SyncCalendarWorker.class).j(aVarD.b()).i(a.EXPONENTIAL, 5L, timeUnit).b());
            } catch (Exception e11) {
                SyncCalendarWorker.f55728e.d("Failed to schedule calendar worker", e11);
            }
        }

        public final void c(Context context, boolean syncEnabled) {
            s.k(context, "context");
            if (syncEnabled) {
                d(context);
            } else {
                b(context);
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCalendarWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        s.k(context, "context");
        s.k(workerParams, "workerParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(List list, final v emitter) {
        s.k(emitter, "emitter");
        c.f121636a.a().a(list, "calendar-updated", new wn0.l() { // from class: wa0.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return SyncCalendarWorker.m(emitter, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(v vVar, boolean z11) {
        vVar.onSuccess(z11 ? y.a.e() : y.a.a());
        b.f128027a.a("Calendar sync for calendar-updated reason.");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y.a n(Throwable e11) {
        s.k(e11, "e");
        b.f128027a.a("Worker error " + e11.getMessage());
        TeslaLog.INSTANCE.e("SyncCalendarWorker", "Error sending calendar data to vehicle", e11);
        return y.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SyncCalendarWorker syncCalendarWorker) {
        b.f128027a.a("Worker terminated, enqueuing calendar change worker.");
        Companion companion = INSTANCE;
        Context applicationContext = syncCalendarWorker.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        companion.d(applicationContext);
    }

    @Override // androidx.work.rxjava3.RxWorker
    public u<y.a> d() {
        if (getRunAttemptCount() > 3) {
            b.f128027a.a("Max retries reached for calendar changes worker, failing.");
            u<y.a> uVarM = u.m(y.a.a());
            s.j(uVarM, "just(...)");
            return uVarM;
        }
        if (!r.d()) {
            b.f128027a.a("Calendar sync not enabled, doing nothing more.");
            u<y.a> uVarM2 = u.m(y.a.a());
            s.j(uVarM2, "just(...)");
            return uVarM2;
        }
        List<String> listV = he0.b.m(getApplicationContext()).v();
        s.j(listV, "getRecentlySelectedVINs(...)");
        if (listV.size() == 0) {
            b.f128027a.a("No recently selected vehicle.");
            u<y.a> uVarM3 = u.m(y.a.a());
            s.j(uVarM3, "just(...)");
            return uVarM3;
        }
        final List listL0 = p013kotlin.collections.v.l0(listV);
        u<y.a> uVarG = u.d(new x() { // from class: wa0.d
            @Override // io.reactivex.rxjava3.core.x
            public final void a(v vVar) {
                SyncCalendarWorker.l(listL0, vVar);
            }
        }).q(new h() { // from class: wa0.e
            @Override // cm0.h
            public final Object apply(Object obj) {
                return SyncCalendarWorker.n((Throwable) obj);
            }
        }).g(new cm0.a() { // from class: wa0.f
            @Override // cm0.a
            public final void run() {
                SyncCalendarWorker.o(this.f121639a);
            }
        });
        s.j(uVarG, "doOnTerminate(...)");
        return uVarG;
    }
}
