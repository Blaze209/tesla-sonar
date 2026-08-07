package com.fourthline.analytics.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.fourthline.analytics.TrackingConsent;
import com.fourthline.analytics.internal.context.b;
import com.fourthline.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import k20.e;
import k20.q;
import o20.l;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import q20.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011j\u0002`\u0014*\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00122\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010)J\u0019\u00103\u001a\u0004\u0018\u00010\f2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R,\u0010@\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010E\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/fourthline/analytics/internal/SnowplowAnalytics;", "Lcom/fourthline/analytics/internal/AnalyticsInterface;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ll20/a;", "initializeTracker", "(Landroid/content/Context;)Ll20/a;", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "event", "", "Lcom/fourthline/analytics/internal/AnalyticsContext;", "contexts", "Ljn0/h0;", "trackEventAndContexts", "(Lcom/fourthline/analytics/internal/NewAnalyticsEvent;Ljava/util/List;)V", "", "", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", Action.KEY_ATTRIBUTE, "value", "putIfAbsent", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Lcom/fourthline/analytics/internal/LogLevel;", "level", "message", "attributes", "", AnalyticsAttribute.Error, "log", "(Lcom/fourthline/analytics/internal/LogLevel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", "trackNew", "(Lcom/fourthline/analytics/internal/NewAnalyticsEvent;)V", "Lcom/fourthline/analytics/TrackingConsent;", "consent", "setTrackingConsent", "(Lcom/fourthline/analytics/TrackingConsent;)V", "newOrigin", "setEventOrigin", "(Ljava/lang/String;)V", "setSessionAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "newTenant", "workflowId", "setTenant", "registerContext", "(Lcom/fourthline/analytics/internal/AnalyticsContext;)V", "identifier", "clearContext", "getContext", "(Ljava/lang/String;)Lcom/fourthline/analytics/internal/AnalyticsContext;", "Landroid/content/Context;", "tracker", "Ll20/a;", "", "eventContexts", "Ljava/util/Map;", "Lcom/fourthline/analytics/internal/context/b;", "sessionContext", "Lcom/fourthline/analytics/internal/context/b;", "", "Lkotlin/Pair;", "queuedEvents", "Ljava/util/List;", "businessPartnerIdentifier", "Ljava/lang/String;", "workflowIdentifier", "consentState", "Lcom/fourthline/analytics/TrackingConsent;", "a", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnowplowAnalytics implements AnalyticsInterface {
    private String businessPartnerIdentifier;
    private TrackingConsent consentState;
    private final Context context;
    private final Map<String, AnalyticsContext> eventContexts;
    private final List<Pair<NewAnalyticsEvent, List<AnalyticsContext>>> queuedEvents;
    private final b sessionContext;
    private l20.a tracker;
    private String workflowIdentifier;

    private enum a {
        LOCALHOST_MICRO("http://10.0.2.2:9090"),
        SANDBOX_MINI("https://com-fourthline-dev1.mini.snplow.net"),
        PRODUCTION("com-fourthline-prod1.collector.snplow.net");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24027f = on0.a.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24028a;

        a(String str) {
            this.f24028a = str;
        }

        public final String b() {
            return this.f24028a;
        }
    }

    public SnowplowAnalytics(Context context) {
        s.k(context, "context");
        this.context = context;
        this.eventContexts = new LinkedHashMap();
        b bVar = new b();
        this.sessionContext = bVar;
        this.queuedEvents = new ArrayList();
        this.businessPartnerIdentifier = AnalyticsAttribute.NotAvailable;
        this.workflowIdentifier = AnalyticsAttribute.NotAvailable;
        this.consentState = TrackingConsent.NOT_GRANTED;
        registerContext(bVar);
        registerContext(new com.fourthline.analytics.internal.context.a(context));
    }

    private final l20.a initializeTracker(Context context) {
        String packageName = context.getPackageName();
        e eVar = new e(a.PRODUCTION.b(), c.POST);
        s.h(packageName);
        return j20.a.a(context, BuildConfig.LIBRARY_PACKAGE_NAME, eVar, new q(packageName).b(s20.a.Mobile).B(false).z(false).c(false).d(false).D(true).E(false).C(s20.c.DEBUG), new k20.b().a(m20.a.Single));
    }

    private final Map<String, Object> putIfAbsent(Map<String, ? extends Object> map, String str, String str2) {
        Object obj = map.get(str);
        return (obj == null || s.f(obj, AnalyticsAttribute.NotAvailable)) ? v0.r(map, v0.f(x.a(str, str2))) : map;
    }

    private final void trackEventAndContexts(NewAnalyticsEvent event, List<? extends AnalyticsContext> contexts) {
        AnalyticsContext context;
        Map mapC = v0.c();
        mapC.putAll(event.getAttributes());
        Map mapB = v0.b(mapC);
        if (event.getSchema().length() > 0) {
            l lVar = new l(event.getSchema(), mapB);
            ArrayList<AnalyticsContext> arrayList = new ArrayList(v.y(contexts, 10));
            for (AnalyticsContext analyticsContext : contexts) {
                if (s.f(analyticsContext.getIdentifier(), AnalyticsContext.Workflow) && (context = getContext(AnalyticsContext.Workflow)) != null) {
                    analyticsContext = context;
                }
                arrayList.add(analyticsContext);
            }
            ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
            for (AnalyticsContext analyticsContext2 : arrayList) {
                arrayList2.add(new r20.b(analyticsContext2.getSchema(), v0.A(analyticsContext2.getData())));
            }
            lVar.getEntities().addAll(arrayList2);
            l20.a aVar = this.tracker;
            if (aVar != null) {
                aVar.a(lVar);
            }
        }
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void clearContext(String identifier) {
        s.k(identifier, "identifier");
        this.eventContexts.remove(identifier);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public AnalyticsContext getContext(String identifier) {
        s.k(identifier, "identifier");
        return this.eventContexts.get(identifier);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void log(LogLevel level, String message, Map<String, ? extends Object> attributes, Throwable error) {
        s.k(level, "level");
        s.k(message, "message");
        s.k(attributes, "attributes");
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void registerContext(AnalyticsContext context) {
        s.k(context, "context");
        this.eventContexts.put(context.getIdentifier(), context);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setEventOrigin(String newOrigin) {
        String lowerCase;
        b bVar = this.sessionContext;
        String strA = b.a.f24034a.a();
        if (newOrigin != null) {
            lowerCase = newOrigin.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        bVar.set(strA, lowerCase);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setSessionAttribute(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        if (s.f(key, AnalyticsAttribute.PluginType) || s.f(key, AnalyticsAttribute.PluginPlatformVersion)) {
            this.sessionContext.set(key, value);
        }
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setTenant(String newTenant, String workflowId) {
        if (newTenant == null) {
            newTenant = AnalyticsAttribute.NotAvailable;
        }
        this.businessPartnerIdentifier = newTenant;
        if (workflowId == null) {
            workflowId = AnalyticsAttribute.NotAvailable;
        }
        this.workflowIdentifier = workflowId;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setTrackingConsent(TrackingConsent consent) {
        s.k(consent, "consent");
        this.consentState = consent;
        if (consent == TrackingConsent.GRANTED) {
            if (this.tracker == null) {
                this.tracker = initializeTracker(this.context);
            }
            Iterator<T> it = this.queuedEvents.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                trackEventAndContexts((NewAnalyticsEvent) pair.e(), (List) pair.f());
            }
            this.queuedEvents.clear();
        }
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void trackNew(NewAnalyticsEvent event) {
        s.k(event, "event");
        List<? extends AnalyticsContext> listM1 = v.m1(this.eventContexts.values());
        if (this.tracker == null || this.consentState != TrackingConsent.GRANTED) {
            this.queuedEvents.add(x.a(event, listM1));
        } else {
            trackEventAndContexts(event, listM1);
        }
    }
}
