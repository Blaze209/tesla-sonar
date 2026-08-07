package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char[] f66500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final m f66501i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char[] f66502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f66503g;

    static {
        char[] cArr = new char[0];
        f66500h = cArr;
        f66501i = new m(cArr, false);
    }

    private m(char[] cArr, boolean z11) {
        this.f66502f = cArr;
        this.f66503g = z11;
    }

    @Override // freemarker.core.k
    protected String d(boolean z11) {
        if (!z11) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("text ");
            stringBuffer.append(mk0.e.g(new String(this.f66502f)));
            return stringBuffer.toString();
        }
        String str = new String(this.f66502f);
        if (!this.f66503g) {
            return str;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("<#noparse>");
        stringBuffer2.append(str);
        stringBuffer2.append("</#noparse>");
        return stringBuffer2.toString();
    }
}
