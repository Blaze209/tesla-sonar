package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ek, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002\u0018$B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR.\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b)\u0010.¨\u00060"}, d2 = {"Lcom/fourthline/orca/internal/ek;", "", "", "event", "", "attributes", "", "timestamp", "", "Lcom/fourthline/orca/internal/v5;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/lang/String;Ljava/util/Map;JLjava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;JLjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ek;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/util/Map;", "()Ljava/util/Map;", "getAttributes$annotations", "()V", "c", "J", "getTimestamp", "()J", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class MockEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f31452e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f31453f = {null, new C4032xg(), null, new vo0.e(ContextEntity.a.f36016a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List context;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ek$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31459b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31458a = aVar;
            f31459b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.analytics.MockEvent", aVar, 4);
            m1Var.o("event", false);
            m1Var.o("attributes", true);
            m1Var.o("timestamp", false);
            m1Var.o(CoreConstants.CONTEXT_SCOPE_VALUE, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MockEvent deserialize(uo0.e decoder) {
            int i11;
            String str;
            Map map;
            List list;
            long j11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = MockEvent.f31453f;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(fVar, 0);
                Map map2 = (Map) cVarB.n(fVar, 1, dVarArr[1], null);
                long j12 = cVarB.j(fVar, 2);
                list = (List) cVarB.n(fVar, 3, dVarArr[3], null);
                str = strT2;
                i11 = 15;
                map = map2;
                j11 = j12;
            } else {
                boolean z11 = true;
                int i12 = 0;
                long j13 = 0;
                Map map3 = null;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        map3 = (Map) cVarB.n(fVar, 1, dVarArr[1], map3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        j13 = cVarB.j(fVar, 2);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(fVar, 3, dVarArr[3], list2);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                map = map3;
                list = list2;
                j11 = j13;
            }
            cVarB.c(fVar);
            return new MockEvent(i11, str, map, j11, list, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = MockEvent.f31453f;
            return new ro0.d[]{vo0.z1.f119730a, dVarArr[1], vo0.s0.f119686a, dVarArr[3]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, MockEvent value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            MockEvent.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ek$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<MockEvent> serializer() {
            return a.f31458a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MockEvent(int i11, String str, Map map, long j11, List list, vo0.v1 v1Var) {
        if (5 != (i11 & 5)) {
            vo0.h1.b(i11, 5, a.f31458a.getDescriptor());
        }
        this.event = str;
        if ((i11 & 2) == 0) {
            this.attributes = p013kotlin.collections.v0.i();
        } else {
            this.attributes = map;
        }
        this.timestamp = j11;
        if ((i11 & 8) == 0) {
            this.context = p013kotlin.collections.v.m();
        } else {
            this.context = list;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MockEvent)) {
            return false;
        }
        MockEvent mockEvent = (MockEvent) other;
        return p013kotlin.jvm.internal.s.f(this.event, mockEvent.event) && p013kotlin.jvm.internal.s.f(this.attributes, mockEvent.attributes) && this.timestamp == mockEvent.timestamp && p013kotlin.jvm.internal.s.f(this.context, mockEvent.context);
    }

    public int hashCode() {
        return (((((this.event.hashCode() * 31) + this.attributes.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "MockEvent(event=" + this.event + ", attributes=" + this.attributes + ", timestamp=" + this.timestamp + ", context=" + this.context + ")";
    }

    public static final /* synthetic */ void a(MockEvent self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f31453f;
        output.e(serialDesc, 0, self.event);
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.attributes, p013kotlin.collections.v0.i())) {
            output.D(serialDesc, 1, dVarArr[1], self.attributes);
        }
        output.z(serialDesc, 2, self.timestamp);
        if (!output.G(serialDesc, 3) && p013kotlin.jvm.internal.s.f(self.context, p013kotlin.collections.v.m())) {
            return;
        }
        output.D(serialDesc, 3, dVarArr[3], self.context);
    }

    public MockEvent(String event, Map attributes, long j11, List context) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.event = event;
        this.attributes = attributes;
        this.timestamp = j11;
        this.context = context;
    }
}
