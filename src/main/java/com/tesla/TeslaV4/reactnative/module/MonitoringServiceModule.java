package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b \u0010\u001dR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/MonitoringServiceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "traceValue", "Lkotlin/Function1;", "Lnc0/l;", "Ljn0/h0;", "onParseTrace", "parseTraceValue", "(ILwn0/l;)V", "", "getName", "()Ljava/lang/String;", "", "enabled", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "setMonitoringEnabled", "(ZLcom/facebook/react/bridge/Promise;)V", "startTrace", "(I)V", "endTrace", "cancelTrace", "attributes", "endTraceWithAttributes", "(Ljava/lang/String;)V", "trace", "startHTTPTrace", "endHTTPTrace", "Lkd0/e;", "getMonitoringService", "()Lkd0/e;", "monitoringService", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MonitoringServiceModule extends ReactContextBaseJavaModule {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55645a = new int[nc0.l.values().length];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitoringServiceModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 cancelTrace$lambda$2(MonitoringServiceModule monitoringServiceModule, nc0.l it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        monitoringServiceModule.getMonitoringService().e(it);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 endTrace$lambda$1(MonitoringServiceModule monitoringServiceModule, nc0.l it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        kd0.e.b.d(monitoringServiceModule.getMonitoringService(), it, null, null, 6, null);
        return jn0.h0.f84049a;
    }

    private final kd0.e getMonitoringService() {
        return kd0.e.INSTANCE.a();
    }

    private final void parseTraceValue(int traceValue, wn0.l<? super nc0.l, jn0.h0> onParseTrace) {
        nc0.l lVarA = nc0.l.INSTANCE.a(traceValue);
        if ((lVarA == null ? -1 : a.f55645a[lVarA.ordinal()]) != -1) {
            onParseTrace.invoke(lVarA);
            return;
        }
        throw new IllegalArgumentException(traceValue + " not supported");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 startTrace$lambda$0(MonitoringServiceModule monitoringServiceModule, nc0.l it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        kd0.e.b.b(monitoringServiceModule.getMonitoringService(), it, null, 2, null);
        return jn0.h0.f84049a;
    }

    @ReactMethod
    public final void cancelTrace(int traceValue) {
        parseTraceValue(traceValue, new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.i
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return MonitoringServiceModule.cancelTrace$lambda$2(this.f55696a, (nc0.l) obj);
            }
        });
    }

    @ReactMethod
    public final void endHTTPTrace(String trace) {
        p013kotlin.jvm.internal.s.k(trace, "trace");
        getMonitoringService().i(nc0.f.f93796f.decode(ie0.n.a(trace)));
    }

    @ReactMethod
    public final void endTrace(int traceValue) {
        parseTraceValue(traceValue, new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return MonitoringServiceModule.endTrace$lambda$1(this.f55700a, (nc0.l) obj);
            }
        });
    }

    @ReactMethod
    public final void endTraceWithAttributes(String attributes) {
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        nc0.c cVarDecode = nc0.c.f93788e.decode(ie0.n.a(attributes));
        nc0.d noAttributes = cVarDecode.getNoAttributes();
        if (noAttributes != null) {
            kd0.e.b.d(getMonitoringService(), noAttributes.getTrace(), null, null, 6, null);
        }
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        nc0.j timeToInteractiveAttributes = cVarDecode.getTimeToInteractiveAttributes();
        if (timeToInteractiveAttributes != null) {
            kd0.e monitoringService = getMonitoringService();
            nc0.l lVar = nc0.l.ANDROID_TIME_TO_INTERACTIVE;
            kd0.a.Companion companion = kd0.a.INSTANCE;
            kd0.e.b.d(monitoringService, lVar, p013kotlin.collections.v.p(companion.a("initial_product_list_fetch", Boolean.valueOf(timeToInteractiveAttributes.getInitialProductListFetch())), companion.a("product_count", Integer.valueOf(timeToInteractiveAttributes.getProductCount())), companion.a("destination", ld0.c.a(timeToInteractiveAttributes.getDestination())), companion.a("current_memory_usage_bytes", Long.valueOf(jFreeMemory))), null, 4, null);
        }
        nc0.b monitoring_AttributeList = cVarDecode.getMonitoring_AttributeList();
        if (monitoring_AttributeList != null) {
            kd0.e monitoringService2 = getMonitoringService();
            nc0.l trace = monitoring_AttributeList.getTrace();
            List<nc0.a> listC = monitoring_AttributeList.c();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listC, 10));
            for (nc0.a aVar : listC) {
                arrayList.add(kd0.a.INSTANCE.a(aVar.getName(), aVar.getValue()));
            }
            monitoringService2.k(trace, arrayList, monitoring_AttributeList.d());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MonitoringServiceModule";
    }

    @ReactMethod
    public final void setMonitoringEnabled(boolean enabled, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        kd0.d dVar = kd0.d.f85939a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        dVar.a(reactApplicationContext, enabled);
        promise.resolve(null);
    }

    @ReactMethod
    public final void startHTTPTrace(String trace) {
        p013kotlin.jvm.internal.s.k(trace, "trace");
        getMonitoringService().d(nc0.g.f93802e.decode(ie0.n.a(trace)));
    }

    @ReactMethod
    public final void startTrace(int traceValue) {
        parseTraceValue(traceValue, new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return MonitoringServiceModule.startTrace$lambda$0(this.f55702a, (nc0.l) obj);
            }
        });
    }
}
