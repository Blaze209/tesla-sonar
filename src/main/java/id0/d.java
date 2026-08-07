package id0;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import sc0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsc0/h;", "Lcom/tesla/logging/g;", "logger", "", "useToDestination", "", "a", "(Lsc0/h;Lcom/tesla/logging/g;Z)Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final String a(h hVar, g logger, boolean z11) {
        k routing_address;
        s.k(hVar, "<this>");
        s.k(logger, "logger");
        sc0.a to_destination = hVar.getTo_destination();
        sc0.a from_destination = hVar.getFrom_destination();
        if (z11) {
            if (to_destination != null) {
                routing_address = to_destination.getRouting_address();
            } else {
                routing_address = null;
            }
        } else if (from_destination != null) {
            routing_address = from_destination.getRouting_address();
        } else {
            routing_address = null;
        }
        if (z11 && to_destination == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = logger.getTag();
            String strG = logger.g("RoutableMessage toDestination is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return "";
        }
        if (z11) {
            if ((to_destination != null ? to_destination.getDomain() : null) == sc0.b.DOMAIN_BROADCAST) {
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = logger.getTag();
                String strG2 = logger.g("RoutableMessage broadcast, no routing address");
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = v0.f(x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return "";
            }
        }
        if (!z11 && from_destination == null) {
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = logger.getTag();
            String strG3 = logger.g("RoutableMessage fromDestination is null");
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = v0.f(x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
            return "";
        }
        if (routing_address != null) {
            String strM = routing_address.m();
            if (strM != null) {
                Locale US = Locale.US;
                s.j(US, "US");
                String upperCase = strM.toUpperCase(US);
                s.j(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    return upperCase;
                }
            }
            return "";
        }
        TeslaLog teslaLog4 = TeslaLog.INSTANCE;
        String tag4 = logger.getTag();
        String strG4 = logger.g("RoutableMessage routing address is null");
        zb0.a aVar4 = zb0.a.f128044a;
        Map mapF4 = v0.f(x.a(tag4, strG4));
        FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry4 : mapF4.entrySet()) {
            zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
        }
        firebaseCrashlytics4.recordException(new Exception(strG4));
        TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
        vr0.a.INSTANCE.a(strG4, new Object[0]);
        return "";
    }

    public static /* synthetic */ String b(h hVar, g gVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return a(hVar, gVar, z11);
    }
}
