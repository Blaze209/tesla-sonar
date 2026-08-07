package io0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "shortName", "Lio0/e;", "e", "(Ljava/lang/String;)Lio0/e;", "", "isoChar", "", "isTimeComponent", DateTokenConverter.CONVERTER_KEY, "(CZ)Lio0/e;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class g extends f {
    public static final e d(char c11, boolean z11) {
        if (!z11) {
            if (c11 == 'D') {
                return e.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c11);
        }
        if (c11 == 'H') {
            return e.HOURS;
        }
        if (c11 == 'M') {
            return e.MINUTES;
        }
        if (c11 == 'S') {
            return e.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c11);
    }

    public static final e e(String shortName) {
        s.k(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return e.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return e.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return e.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return e.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return e.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return e.HOURS;
            }
        } else if (shortName.equals(DateTokenConverter.CONVERTER_KEY)) {
            return e.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
