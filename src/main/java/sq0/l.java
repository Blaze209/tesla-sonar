package sq0;

/* JADX INFO: loaded from: classes10.dex */
public class l extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f111575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f111576g;

    public l() {
    }

    @Override // sq0.r
    public void a(y yVar) {
        yVar.r(this);
    }

    @Override // sq0.r
    protected String k() {
        return "destination=" + this.f111575f + ", title=" + this.f111576g;
    }

    public String m() {
        return this.f111575f;
    }

    public l(String str, String str2) {
        this.f111575f = str;
        this.f111576g = str2;
    }
}
