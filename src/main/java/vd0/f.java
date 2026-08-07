package vd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014RT\u0010\u001a\u001aB\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00070\u0007 \u0017* \u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001cj\b\u0012\u0004\u0012\u00020\u0004`\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lvd0/f;", "", "<init>", "()V", "", "type", "vin", "", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ljn0/h0;", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "sendTelemetry", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lwn0/a;)V", "h", "Lcom/tesla/logging/g;", "a", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "sentTelemetry", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "sentTelemetryByVin", "", "Lvd0/f$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "telemetryFrequency", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("TelemetryTracker");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap.KeySetView<String, Boolean> sentTelemetry = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, HashSet<String>> sentTelemetryByVin = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, a> telemetryFrequency = v0.f(x.a("PII-decrypt", a.ONCE_PER_VIN));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvd0/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "ONCE_PER_FOREGROUND_SESSION", "ONCE_PER_VIN", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        ALWAYS,
        ONCE_PER_FOREGROUND_SESSION,
        ONCE_PER_VIN;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119040a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ONCE_PER_FOREGROUND_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ONCE_PER_VIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119040a = iArr;
        }
    }

    private final boolean e(String type, String vin) {
        boolean zContains;
        synchronized (this) {
            try {
                a aVar = this.telemetryFrequency.get(type);
                if (aVar == null) {
                    aVar = a.ALWAYS;
                }
                int i11 = b.f119040a[aVar.ordinal()];
                zContains = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (vin != null) {
                            ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = this.sentTelemetryByVin;
                            final l lVar = new l() { // from class: vd0.b
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return f.f((String) obj);
                                }
                            };
                            zContains = true ^ concurrentHashMap.computeIfAbsent(vin, new Function() { // from class: vd0.c
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return f.g(lVar, obj);
                                }
                            }).contains(type);
                        }
                    } else if (this.sentTelemetry.contains(type)) {
                        zContains = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet f(String it) {
        s.k(it, "it");
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet g(l lVar, Object obj) {
        return (HashSet) lVar.invoke(obj);
    }

    private final void j(String type, String vin) {
        synchronized (this) {
            try {
                a aVar = this.telemetryFrequency.get(type);
                if (aVar == null) {
                    aVar = a.ALWAYS;
                }
                int i11 = b.f119040a[aVar.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.sentTelemetry.add(type);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (vin != null) {
                            ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = this.sentTelemetryByVin;
                            final l lVar = new l() { // from class: vd0.d
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return f.k((String) obj);
                                }
                            };
                            concurrentHashMap.computeIfAbsent(vin, new Function() { // from class: vd0.e
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return f.l(lVar, obj);
                                }
                            }).add(type);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet k(String it) {
        s.k(it, "it");
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet l(l lVar, Object obj) {
        return (HashSet) lVar.invoke(obj);
    }

    public final void h() {
        synchronized (this) {
            this.sentTelemetry.clear();
            this.sentTelemetryByVin.clear();
            h0 h0Var = h0.f84049a;
        }
    }

    public final void i(String type, String vin, wn0.a<h0> sendTelemetry) {
        s.k(type, "type");
        s.k(sendTelemetry, "sendTelemetry");
        synchronized (this) {
            try {
                if (e(type, vin)) {
                    sendTelemetry.invoke();
                    j(type, vin);
                } else {
                    this.logger.j(vin + " Not sending telemetry " + type + ", already sent");
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
