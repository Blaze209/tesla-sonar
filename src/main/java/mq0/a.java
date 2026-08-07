package mq0;

/* JADX INFO: loaded from: classes9.dex */
abstract class a extends d implements jq0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Class[] f92431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String[] f92432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Class[] f92433m;

    a(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i11, str, cls);
        this.f92431k = clsArr;
        this.f92432l = strArr;
        this.f92433m = clsArr2;
    }

    public Class[] l() {
        if (this.f92433m == null) {
            this.f92433m = e(5);
        }
        return this.f92433m;
    }

    public Class[] m() {
        if (this.f92431k == null) {
            this.f92431k = e(3);
        }
        return this.f92431k;
    }
}
