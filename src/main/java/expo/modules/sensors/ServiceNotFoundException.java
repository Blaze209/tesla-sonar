package expo.modules.sensors;

import co0.d;
import expo.modules.kotlin.exception.CodedException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/sensors/ServiceNotFoundException;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/d;", "type", "<init>", "(Lco0/d;)V", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceNotFoundException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceNotFoundException(d<?> type) {
        super(type + " not found", null, 2, null);
        s.k(type, "type");
    }
}
