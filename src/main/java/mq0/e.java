package mq0;

/* JADX INFO: loaded from: classes9.dex */
class e extends a implements kq0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Class f92451n;

    e(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i11, str, cls, clsArr, strArr, clsArr2);
        this.f92451n = cls2;
    }

    @Override // mq0.f
    protected String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f92470b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f92470b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f92451n == null) {
            this.f92451n = d(6);
        }
        return this.f92451n;
    }
}
