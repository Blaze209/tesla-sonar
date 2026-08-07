package com.teslamotors.plugins.ble;

import android.util.LruCache;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R2\u0010\u001a\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/teslamotors/plugins/ble/x0;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "", "", "Ljn0/h0;", "action", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/p;)V", "a", "(Ljava/lang/String;)V", "sizeOfMessage", "writeTimestamp", "b", "(Ljava/lang/String;IJ)V", "c", "(Ljava/lang/String;)Ljava/lang/Long;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "listeners", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "writeSuccess", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f57016a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("PeripheralWriteListener");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, wn0.p<Integer, Long, jn0.h0>> listeners = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final LruCache<String, Long> writeSuccess = new LruCache<>(20);

    private x0() {
    }

    public static final void a(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        if (listeners.remove(key) != null) {
            logger.j("NOT executing action for " + key + "!");
        }
    }

    public static final void b(String key, int sizeOfMessage, long writeTimestamp) {
        p013kotlin.jvm.internal.s.k(key, "key");
        wn0.p<Integer, Long, jn0.h0> pVarRemove = listeners.remove(key);
        if (pVarRemove != null) {
            logger.j("executing action for " + key + "!");
            pVarRemove.invoke(Integer.valueOf(sizeOfMessage), Long.valueOf(writeTimestamp));
        }
        writeSuccess.put(key, Long.valueOf(writeTimestamp));
    }

    public static final void d(String key, wn0.p<? super Integer, ? super Long, jn0.h0> action) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(action, "action");
        logger.j(key + " waiting...");
        listeners.put(key, action);
    }

    public final Long c(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return writeSuccess.remove(key);
    }
}
