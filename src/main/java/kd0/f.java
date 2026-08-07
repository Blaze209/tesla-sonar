package kd0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkd0/f;", "", "", "responseCode", "", "responseSize", "", "responseContentType", "Ljn0/h0;", "a", "(IJLjava/lang/String;)V", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(f fVar, int i11, long j11, String str, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
            }
            if ((i12 & 2) != 0) {
                j11 = 0;
            }
            if ((i12 & 4) != 0) {
                str = null;
            }
            fVar.a(i11, j11, str);
        }
    }

    void a(int responseCode, long responseSize, String responseContentType);
}
