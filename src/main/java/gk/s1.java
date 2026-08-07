package gk;

import android.os.Build;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {
    public static final String a(s1 s1Var) {
        s1Var.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            String str = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneId.of("GMT")).format(Instant.now());
            p013kotlin.jvm.internal.s.h(str);
            return str;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        String str2 = simpleDateFormat.format(new Date());
        p013kotlin.jvm.internal.s.h(str2);
        return str2;
    }
}
