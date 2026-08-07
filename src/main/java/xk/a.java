package xk;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static int a(int i11, int i12) {
        return ((i11 + 31) * 31) + i12;
    }

    public static int b(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
