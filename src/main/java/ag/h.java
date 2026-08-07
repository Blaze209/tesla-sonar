package ag;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1031c;

    public h(String str, float f11, float f12) {
        this.f1029a = str;
        this.f1031c = f12;
        this.f1030b = f11;
    }

    public boolean a(String str) {
        if (this.f1029a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f1029a.endsWith("\r")) {
            String str2 = this.f1029a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
