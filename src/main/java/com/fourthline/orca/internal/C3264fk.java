package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.analytics.TrackingConsent;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.analytics.internal.LogLevel;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3264fk implements AnalyticsInterface, CoroutineScope {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f31771e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31772f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f31774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Gl f31775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f31776d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fk$a */
    private enum a {
        NewAnalytics("/newanalytics");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f31779d = on0.a.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31780a;

        a(String str) {
            this.f31780a = str;
        }

        public final String b() {
            return this.f31780a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fk$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fk$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gl f31782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f31783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MockEvent f31784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Gl gl2, a aVar, MockEvent c3221ek, Continuation continuation) {
            super(2, continuation);
            this.f31782b = gl2;
            this.f31783c = aVar;
            this.f31784d = c3221ek;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f31782b, this.f31783c, this.f31784d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f31781a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Gl gl2 = this.f31782b;
                Cl.b bVar = Cl.b.POST;
                String strB = this.f31783c.b();
                wo0.b bVarA = Ki.a();
                MockEvent c3221ek = this.f31784d;
                bVarA.getSerializersModule();
                Cl.a aVar = new Cl.a("mock_analytics", bVar, strB, null, null, AbstractC3885u5.a(bVarA.b(MockEvent.INSTANCE.serializer(), c3221ek)), 24, null);
                this.f31781a = 1;
                if (gl2.a(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                ((jn0.s) obj).getValue();
            }
            return jn0.h0.f84049a;
        }
    }

    public C3264fk(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f31773a = coroutineScope;
        this.f31774b = new ConcurrentHashMap();
        this.f31776d = new ArrayList();
    }

    public final void a(Gl gl2) {
        this.f31775c = gl2;
        if (gl2 != null) {
            Iterator it = this.f31776d.iterator();
            while (it.hasNext()) {
                a(gl2, a.NewAnalytics, (MockEvent) it.next());
            }
            this.f31776d.clear();
        }
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void clearContext(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.f31774b.remove(identifier);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public AnalyticsContext getContext(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return (AnalyticsContext) this.f31774b.get(identifier);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31773a.getCoroutineContext();
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void log(LogLevel level, String message, Map attributes, Throwable th2) {
        p013kotlin.jvm.internal.s.k(level, "level");
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void registerContext(AnalyticsContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f31774b.put(context.getIdentifier(), context);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setEventOrigin(String str) {
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setSessionAttribute(String key, String value) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(value, "value");
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setTenant(String str, String str2) {
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void setTrackingConsent(TrackingConsent consent) {
        p013kotlin.jvm.internal.s.k(consent, "consent");
    }

    @Override // com.fourthline.analytics.internal.AnalyticsInterface
    public void trackNew(NewAnalyticsEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        String eventName = event.getEventName();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Map<String, Object> attributes = event.getAttributes();
        Collection<AnalyticsContext> collectionValues = this.f31774b.values();
        p013kotlin.jvm.internal.s.j(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(collectionValues, 10));
        for (AnalyticsContext analyticsContext : collectionValues) {
            arrayList.add(new ContextEntity(analyticsContext.getIdentifier(), analyticsContext.getData()));
        }
        MockEvent c3221ek = new MockEvent(eventName, attributes, jElapsedRealtimeNanos, arrayList);
        c3221ek.getEvent();
        Map mapB = c3221ek.getAttributes();
        List listC = c3221ek.getContext();
        Objects.toString(mapB);
        Objects.toString(listC);
        Gl gl2 = this.f31775c;
        if (gl2 != null) {
            a(gl2, a.NewAnalytics, c3221ek);
        } else {
            this.f31776d.add(c3221ek);
        }
    }

    public /* synthetic */ C3264fk(CoroutineScope coroutineScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope);
    }

    private final void a(Gl gl2, a aVar, MockEvent c3221ek) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(gl2, aVar, c3221ek, null), 3, null);
    }
}
