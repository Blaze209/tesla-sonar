package t9;

import com.google.common.collect.x;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<r7.a> f112955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f112958d;

    public d(List<r7.a> list, long j11, long j12) {
        this.f112955a = x.n(list);
        this.f112956b = j11;
        this.f112957c = j12;
        long j13 = -9223372036854775807L;
        if (j11 != -9223372036854775807L && j12 != -9223372036854775807L) {
            j13 = j11 + j12;
        }
        this.f112958d = j13;
    }
}
