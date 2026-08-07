package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ReportNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Ljn0/h0;", "shareReport", "()V", "shareLogs", "request", "sendReport", "(Ljava/lang/String;)V", "Lwd0/g;", "reportService$delegate", "Lkotlin/Lazy;", "getReportService", "()Lwd0/g;", "reportService", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "ReportServiceModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a(TAG);

    /* JADX INFO: renamed from: reportService$delegate, reason: from kotlin metadata */
    private final Lazy reportService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.reportService = jn0.m.b(new wn0.a() { // from class: com.tesla.TeslaV4.reactnative.module.h0
            @Override // wn0.a
            public final Object invoke() {
                return ReportNativeModule.reportService_delegate$lambda$0(this.f55695a);
            }
        });
    }

    private final wd0.g getReportService() {
        return (wd0.g) this.reportService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd0.g reportService_delegate$lambda$0(ReportNativeModule reportNativeModule) {
        Context applicationContext = reportNativeModule.getReactApplicationContext().getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        return new wd0.g(applicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void sendReport(String request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        com.teslamotors.plugins.ble.i.B(getReactApplicationContext().getApplicationContext(), "from ReportNativeModule#sendReport").r0(ie0.n.a(request));
    }

    @ReactMethod
    public final void shareLogs() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            wd0.l.f121695a.i(currentActivity);
        }
    }

    @ReactMethod
    public final void shareReport() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            wd0.l.f121695a.k(currentActivity);
        }
    }
}
