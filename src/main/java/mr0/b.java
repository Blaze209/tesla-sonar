package mr0;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j11) {
        return new Date((j11 - 2082844800) * 1000);
    }
}
