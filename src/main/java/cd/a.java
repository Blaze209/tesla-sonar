package cd;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19064c;

    public a(String str, String str2, String str3) {
        this.f19062a = str;
        this.f19063b = str3 == null ? "" : str3;
        this.f19064c = str2;
    }

    public String a() {
        return this.f19063b + "/" + b.b(this.f19062a, this.f19064c);
    }
}
