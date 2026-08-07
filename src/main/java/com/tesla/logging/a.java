package com.tesla.logging;

import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006!"}, d2 = {"Lcom/tesla/logging/a;", "", "<init>", "()V", "Lcom/tesla/logging/b;", "forwardingClient", "Ljn0/h0;", "f", "(Lcom/tesla/logging/b;)V", "Lcom/tesla/logging/a$a;", "event", StatusResponse.PAYLOAD, "b", "(Lcom/tesla/logging/a$a;Ljava/lang/Object;)V", "client", "c", "(Lcom/tesla/logging/b;Lcom/tesla/logging/a$a;Ljava/lang/Object;)V", "a", "(Lcom/tesla/logging/a$a;)V", "e", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lkotlin/Pair;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "pendingMessages", "Ljava/util/concurrent/atomic/AtomicBoolean;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingMessagesSent", "Lcom/tesla/logging/b;", "jsForwardingClient", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56366a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("JsBridge");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentLinkedDeque<Pair<EnumC1131a, Object>> pendingMessages = new ConcurrentLinkedDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static AtomicBoolean pendingMessagesSent = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static b jsForwardingClient;

    private a() {
    }

    private final void a(EnumC1131a event) {
        if (pendingMessagesSent.get()) {
            return;
        }
        ConcurrentLinkedDeque<Pair<EnumC1131a, Object>> concurrentLinkedDeque = pendingMessages;
        synchronized (concurrentLinkedDeque) {
            try {
                if (event.getReplace()) {
                    Iterator<Pair<EnumC1131a, Object>> it = concurrentLinkedDeque.iterator();
                    s.j(it, "iterator(...)");
                    while (it.hasNext()) {
                        if (it.next().e() == event) {
                            it.remove();
                            break;
                        }
                    }
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void b(EnumC1131a event, Object payload) {
        s.k(event, "event");
        b bVar = jsForwardingClient;
        if (bVar == null) {
            f56366a.a(event);
            ConcurrentLinkedDeque<Pair<EnumC1131a, Object>> concurrentLinkedDeque = pendingMessages;
            synchronized (concurrentLinkedDeque) {
                concurrentLinkedDeque.add(x.a(event, payload));
            }
            return;
        }
        if (!pendingMessagesSent.get()) {
            a aVar = f56366a;
            aVar.a(event);
            aVar.e();
        }
        f56366a.c(bVar, event, payload);
    }

    private final void c(b client, EnumC1131a event, Object payload) {
        String eventName = event.getEventName();
        if (event.getLogSelf()) {
            logger.b("Sending `" + eventName + "` to JS", false);
        }
        client.a(eventName, payload);
    }

    public static /* synthetic */ void d(EnumC1131a enumC1131a, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        b(enumC1131a, obj);
    }

    private final void e() {
        pendingMessagesSent.set(true);
        ConcurrentLinkedDeque<Pair<EnumC1131a, Object>> concurrentLinkedDeque = pendingMessages;
        synchronized (concurrentLinkedDeque) {
            try {
                if (concurrentLinkedDeque.isEmpty()) {
                    return;
                }
                logger.j("Sending " + concurrentLinkedDeque.size() + " pending messages to JS");
                Iterator<T> it = concurrentLinkedDeque.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    EnumC1131a enumC1131a = (EnumC1131a) pair.a();
                    Object objB = pair.b();
                    b bVar = jsForwardingClient;
                    if (bVar != null) {
                        f56366a.c(bVar, enumC1131a, objB);
                    }
                }
                pendingMessages.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void f(b forwardingClient) {
        s.k(forwardingClient, "forwardingClient");
        jsForwardingClient = forwardingClient;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BLE_SYSTEM_STATUS' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.tesla.logging.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/tesla/logging/a$a;", "", "", "eventName", "", Parser.REPLACE_CONVERTER_WORD, "logSelf", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "Z", "getReplace", "()Z", "getLogSelf", "BLE_SYSTEM_STATUS", "BLE_VEHICLE_STATUS", "BLE_PRODUCT_SWITCH", "BLE_VEHICLE_EVENT", "BLE_VEHICLE_NFC_SWIPE", "BLE_SHARED_FLEET_PERIPHERALS", "BLE_VEHICLE_ENCRYPTED_MESSAGE", "LOG", "AUTH_FAILURE", "GODOT_MESSAGE", "VEHICLE_CONNECTIVITY_STATE", "HERMES_STATUS", "PSEUDONYM_SYNC", "PROTO_VEHICLE_DATA", "CAR_API_STREAM_MESSAGE", "CAR_API_ICE_CONFIG", "CAR_API_VEHICLE_DATA_SUBSCRIPTION", "CAR_API_PII_KEY_RESPONSE", "CAR_API_VEHICLE_PING", "MOTION_SHAKE", "SUBMIT_NON_USER_REPORT", "USER_ACTIVITY_ACTIVE", "USER_ACTIVITY_INACTIVE", "AIRPLANE_MODE", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumC1131a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1131a[] $VALUES;
        public static final EnumC1131a AIRPLANE_MODE;
        public static final EnumC1131a AUTH_FAILURE;
        public static final EnumC1131a BLE_PRODUCT_SWITCH;
        public static final EnumC1131a BLE_SHARED_FLEET_PERIPHERALS;
        public static final EnumC1131a BLE_SYSTEM_STATUS;
        public static final EnumC1131a BLE_VEHICLE_ENCRYPTED_MESSAGE;
        public static final EnumC1131a BLE_VEHICLE_EVENT;
        public static final EnumC1131a BLE_VEHICLE_NFC_SWIPE;
        public static final EnumC1131a BLE_VEHICLE_STATUS;
        public static final EnumC1131a CAR_API_ICE_CONFIG;
        public static final EnumC1131a CAR_API_PII_KEY_RESPONSE;
        public static final EnumC1131a CAR_API_STREAM_MESSAGE;
        public static final EnumC1131a CAR_API_VEHICLE_DATA_SUBSCRIPTION;
        public static final EnumC1131a HERMES_STATUS;
        public static final EnumC1131a LOG;
        public static final EnumC1131a MOTION_SHAKE;
        public static final EnumC1131a PROTO_VEHICLE_DATA;
        public static final EnumC1131a PSEUDONYM_SYNC;
        public static final EnumC1131a SUBMIT_NON_USER_REPORT;
        public static final EnumC1131a USER_ACTIVITY_INACTIVE;
        public static final EnumC1131a VEHICLE_CONNECTIVITY_STATE;
        private final String eventName;
        private final boolean logSelf;
        private final boolean replace;
        public static final EnumC1131a GODOT_MESSAGE = new EnumC1131a("GODOT_MESSAGE", 9, "onGodotMessage", false, false, 6, null);
        public static final EnumC1131a CAR_API_VEHICLE_PING = new EnumC1131a("CAR_API_VEHICLE_PING", 18, "carApiVehiclePing", false, false, 6, null);
        public static final EnumC1131a USER_ACTIVITY_ACTIVE = new EnumC1131a("USER_ACTIVITY_ACTIVE", 21, "userBecameActive", true, false, 4, null);

        private static final /* synthetic */ EnumC1131a[] $values() {
            return new EnumC1131a[]{BLE_SYSTEM_STATUS, BLE_VEHICLE_STATUS, BLE_PRODUCT_SWITCH, BLE_VEHICLE_EVENT, BLE_VEHICLE_NFC_SWIPE, BLE_SHARED_FLEET_PERIPHERALS, BLE_VEHICLE_ENCRYPTED_MESSAGE, LOG, AUTH_FAILURE, GODOT_MESSAGE, VEHICLE_CONNECTIVITY_STATE, HERMES_STATUS, PSEUDONYM_SYNC, PROTO_VEHICLE_DATA, CAR_API_STREAM_MESSAGE, CAR_API_ICE_CONFIG, CAR_API_VEHICLE_DATA_SUBSCRIPTION, CAR_API_PII_KEY_RESPONSE, CAR_API_VEHICLE_PING, MOTION_SHAKE, SUBMIT_NON_USER_REPORT, USER_ACTIVITY_ACTIVE, USER_ACTIVITY_INACTIVE, AIRPLANE_MODE};
        }

        static {
            boolean z11 = false;
            BLE_SYSTEM_STATUS = new EnumC1131a("BLE_SYSTEM_STATUS", 0, "ble:status", false, z11, 6, null);
            boolean z12 = false;
            BLE_VEHICLE_STATUS = new EnumC1131a("BLE_VEHICLE_STATUS", 1, "ble:vehicle_status", z11, z12, 6, null);
            boolean z13 = false;
            BLE_PRODUCT_SWITCH = new EnumC1131a("BLE_PRODUCT_SWITCH", 2, "ble:productSwitch", z12, z13, 6, null);
            boolean z14 = false;
            BLE_VEHICLE_EVENT = new EnumC1131a("BLE_VEHICLE_EVENT", 3, "ble:vehicle_event", z13, z14, 6, null);
            boolean z15 = false;
            BLE_VEHICLE_NFC_SWIPE = new EnumC1131a("BLE_VEHICLE_NFC_SWIPE", 4, "ble:nfc_swipe", z14, z15, 6, null);
            boolean z16 = false;
            BLE_SHARED_FLEET_PERIPHERALS = new EnumC1131a("BLE_SHARED_FLEET_PERIPHERALS", 5, "ble:shared_fleet_peripherals", z15, z16, 6, null);
            boolean z17 = false;
            BLE_VEHICLE_ENCRYPTED_MESSAGE = new EnumC1131a("BLE_VEHICLE_ENCRYPTED_MESSAGE", 6, "ble:vehicle_encrypted_message", z16, z17, 6, null);
            LOG = new EnumC1131a("LOG", 7, "log", z17, false, 2, null);
            DefaultConstructorMarker defaultConstructorMarker = null;
            AUTH_FAILURE = new EnumC1131a("AUTH_FAILURE", 8, "auth_failure", true, false, 4, defaultConstructorMarker);
            boolean z18 = false;
            VEHICLE_CONNECTIVITY_STATE = new EnumC1131a("VEHICLE_CONNECTIVITY_STATE", 10, "vehicleOnlineState", true, z18, 4, null);
            boolean z19 = false;
            HERMES_STATUS = new EnumC1131a("HERMES_STATUS", 11, "hermes:status", z18, z19, 6, null);
            boolean z21 = false;
            PSEUDONYM_SYNC = new EnumC1131a("PSEUDONYM_SYNC", 12, "pseudonymSync", z19, z21, 6, null);
            boolean z22 = false;
            PROTO_VEHICLE_DATA = new EnumC1131a("PROTO_VEHICLE_DATA", 13, "protoVehicleData", z21, z22, 6, null);
            boolean z23 = false;
            CAR_API_STREAM_MESSAGE = new EnumC1131a("CAR_API_STREAM_MESSAGE", 14, "carApiStreamMessage", z22, z23, 6, null);
            boolean z24 = false;
            CAR_API_ICE_CONFIG = new EnumC1131a("CAR_API_ICE_CONFIG", 15, "carApiIceConfig", z23, z24, 6, null);
            boolean z25 = false;
            CAR_API_VEHICLE_DATA_SUBSCRIPTION = new EnumC1131a("CAR_API_VEHICLE_DATA_SUBSCRIPTION", 16, "carApiVehicleDataSubscriptionResponse", z24, z25, 6, null);
            CAR_API_PII_KEY_RESPONSE = new EnumC1131a("CAR_API_PII_KEY_RESPONSE", 17, "carApiVehicleDataPiiKeyResponse", z25, false, 6, defaultConstructorMarker);
            boolean z26 = false;
            MOTION_SHAKE = new EnumC1131a("MOTION_SHAKE", 19, "shakeDetected", true, z26, 4, null);
            SUBMIT_NON_USER_REPORT = new EnumC1131a("SUBMIT_NON_USER_REPORT", 20, "submit_non_user_report", z26, false, 6, null);
            boolean z27 = false;
            USER_ACTIVITY_INACTIVE = new EnumC1131a("USER_ACTIVITY_INACTIVE", 22, "userBecameInactive", true, z27, 4, null);
            AIRPLANE_MODE = new EnumC1131a("AIRPLANE_MODE", 23, "airplane_mode", z27, false, 6, null);
            EnumC1131a[] enumC1131aArr$values = $values();
            $VALUES = enumC1131aArr$values;
            $ENTRIES = on0.a.a(enumC1131aArr$values);
        }

        private EnumC1131a(String str, int i11, String str2, boolean z11, boolean z12) {
            super(str, i11);
            this.eventName = str2;
            this.replace = z11;
            this.logSelf = z12;
        }

        public static EnumEntries<EnumC1131a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC1131a valueOf(String str) {
            return (EnumC1131a) Enum.valueOf(EnumC1131a.class, str);
        }

        public static EnumC1131a[] values() {
            return (EnumC1131a[]) $VALUES.clone();
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final boolean getLogSelf() {
            return this.logSelf;
        }

        public final boolean getReplace() {
            return this.replace;
        }

        /* synthetic */ EnumC1131a(String str, int i11, String str2, boolean z11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, str2, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? true : z12);
        }
    }
}
