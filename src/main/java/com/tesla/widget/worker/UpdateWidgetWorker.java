package com.tesla.widget.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.widget.worker.UpdateWidgetWorker;
import java.util.Map;
import jn0.m;
import jn0.x;
import me0.WidgetBuilderConfig;
import me0.a0;
import me0.b;
import me0.t;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import qe0.c;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tesla/widget/worker/UpdateWidgetWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme0/s;", "c", "Lkotlin/Lazy;", "()Lme0/s;", "widgetBuilder", DateTokenConverter.CONVERTER_KEY, "a", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateWidgetWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f56602e = g.INSTANCE.a("UpdateWidgetWorker");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy widgetBuilder;

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateWidgetWorker(Context context, WorkerParameters workerParams) {
        s.k(context, "context");
        s.k(workerParams, "workerParams");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        super(applicationContext, workerParams);
        this.widgetBuilder = m.b(new a() { // from class: te0.c
            @Override // wn0.a
            public final Object invoke() {
                return UpdateWidgetWorker.d();
            }
        });
    }

    private final me0.s c() {
        return (me0.s) this.widgetBuilder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final me0.s d() {
        return c.f105355a.d();
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) {
        b bVar;
        Object obj;
        int iF = getInputData().f("app_widget_id", 0);
        String strI = getInputData().i("app_widget_type");
        a0 a0VarA = strI != null ? t.a(strI) : null;
        String strI2 = getInputData().i("execution");
        if (strI2 != null) {
            Object[] enumConstants = b.class.getEnumConstants();
            s.j(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i11];
                if (s.f(((Enum) obj).name(), strI2)) {
                    break;
                }
                i11++;
            }
            bVar = (b) ((Enum) obj);
        } else {
            bVar = null;
        }
        boolean zC = getInputData().c("with_vehicle_cache", false);
        if (iF != 0 && a0VarA != null) {
            f56602e.a("Updating widget via worker:" + getId() + " for appWidget-id: " + iF + " , type: " + a0VarA + " ");
            me0.s sVarC = c();
            Context applicationContext = getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            if (bVar == null) {
                bVar = b.NONE;
            }
            sVarC.q(applicationContext, new WidgetBuilderConfig(iF, a0VarA, zC, bVar));
            y.a aVarE = y.a.e();
            s.j(aVarE, "success(...)");
            return aVarE;
        }
        g gVar = f56602e;
        String str = "appWidget-id: " + iF + " or type: " + a0VarA + " is null";
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g(str);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        y.a aVarA = y.a.a();
        s.j(aVarA, "failure(...)");
        return aVarA;
    }
}
