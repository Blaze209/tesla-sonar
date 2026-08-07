package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Jk {

    public static final class a {
        public static /* synthetic */ void a(Jk jk2, String str, Integer num, Integer num2, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: didFailRequest");
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            if ((i11 & 4) != 0) {
                num2 = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            jk2.a(str, num, num2, str2, th2);
        }
    }

    void a(String str, Integer num);

    void a(String str, Integer num, Integer num2, String str2);

    void a(String str, Integer num, Integer num2, String str2, Throwable th2);
}
