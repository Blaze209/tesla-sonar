package di;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60651b;

    h(int i11, String str) {
        this.f60650a = i11;
        this.f60651b = str;
    }

    public final int b() {
        return this.f60650a;
    }

    public final String c() {
        return this.f60651b;
    }

    public static h a(int i11) {
        for (h hVar : values()) {
            if (hVar.b() == i11) {
                return hVar;
            }
        }
        return NONE;
    }
}
