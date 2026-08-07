package pq0;

/* JADX INFO: loaded from: classes10.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103640b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f103639a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.f103640b != 0) {
            this.f103639a.append('\n');
        }
        this.f103639a.append(charSequence);
        this.f103640b++;
    }

    public String b() {
        return this.f103639a.toString();
    }
}
