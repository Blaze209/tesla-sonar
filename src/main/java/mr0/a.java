package mr0;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static int a(long j11) {
        if (j11 <= 2147483647L && j11 >= -2147483648L) {
            return (int) j11;
        }
        throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + j11 + ")");
    }
}
