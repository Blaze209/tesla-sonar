package sq0;

/* JADX INFO: loaded from: classes10.dex */
public class n extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f111578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f111579g;

    public n() {
    }

    @Override // sq0.r
    public void a(y yVar) {
        yVar.f(this);
    }

    @Override // sq0.r
    protected String k() {
        return "destination=" + this.f111578f + ", title=" + this.f111579g;
    }

    public String m() {
        return this.f111578f;
    }

    public n(String str, String str2) {
        this.f111578f = str;
        this.f111579g = str2;
    }
}
