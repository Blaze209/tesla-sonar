package com.google.android.gms.internal.identity;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j11) {
        return j11 >= 0 ? zza.format(new Date(j11)) : Long.toString(j11);
    }

    public static String zzb(long j11) {
        String string;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j11, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j11, StringBuilder sb2) {
        if (j11 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z11 = false;
        if (j11 < 0) {
            sb2.append("-");
            if (j11 != Long.MIN_VALUE) {
                j11 = -j11;
            } else {
                j11 = Long.MAX_VALUE;
                z11 = true;
            }
        }
        if (j11 >= CoreConstants.MILLIS_IN_ONE_DAY) {
            sb2.append(j11 / CoreConstants.MILLIS_IN_ONE_DAY);
            sb2.append(DateTokenConverter.CONVERTER_KEY);
            j11 %= CoreConstants.MILLIS_IN_ONE_DAY;
        }
        if (true == z11) {
            j11 = 25975808;
        }
        if (j11 >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            sb2.append(j11 / CoreConstants.MILLIS_IN_ONE_HOUR);
            sb2.append("h");
            j11 %= CoreConstants.MILLIS_IN_ONE_HOUR;
        }
        if (j11 >= 60000) {
            sb2.append(j11 / 60000);
            sb2.append("m");
            j11 %= 60000;
        }
        if (j11 >= 1000) {
            sb2.append(j11 / 1000);
            sb2.append("s");
            j11 %= 1000;
        }
        if (j11 > 0) {
            sb2.append(j11);
            sb2.append("ms");
        }
        return sb2;
    }
}
