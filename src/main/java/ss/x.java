package ss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f111759h = new Comparator() { // from class: ss.v
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return x.a((x.b) obj, (x.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f111760i = new Comparator() { // from class: ss.w
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((x.b) obj).f111770c, ((x.b) obj2).f111770c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f111761a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111767g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f111763c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f111762b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111764d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f111769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f111770c;

        private b() {
        }
    }

    public x(int i11) {
        this.f111761a = i11;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f111768a - bVar2.f111768a;
    }

    private void d() {
        if (this.f111764d != 1) {
            Collections.sort(this.f111762b, f111759h);
            this.f111764d = 1;
        }
    }

    private void e() {
        if (this.f111764d != 0) {
            Collections.sort(this.f111762b, f111760i);
            this.f111764d = 0;
        }
    }

    public void c(int i11, float f11) {
        b bVar;
        d();
        int i12 = this.f111767g;
        if (i12 > 0) {
            b[] bVarArr = this.f111763c;
            int i13 = i12 - 1;
            this.f111767g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f111765e;
        this.f111765e = i14 + 1;
        bVar.f111768a = i14;
        bVar.f111769b = i11;
        bVar.f111770c = f11;
        this.f111762b.add(bVar);
        this.f111766f += i11;
        while (true) {
            int i15 = this.f111766f;
            int i16 = this.f111761a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            b bVar2 = this.f111762b.get(0);
            int i18 = bVar2.f111769b;
            if (i18 <= i17) {
                this.f111766f -= i18;
                this.f111762b.remove(0);
                int i19 = this.f111767g;
                if (i19 < 5) {
                    b[] bVarArr2 = this.f111763c;
                    this.f111767g = i19 + 1;
                    bVarArr2[i19] = bVar2;
                }
            } else {
                bVar2.f111769b = i18 - i17;
                this.f111766f -= i17;
            }
        }
    }

    public float f(float f11) {
        e();
        float f12 = f11 * this.f111766f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f111762b.size(); i12++) {
            b bVar = this.f111762b.get(i12);
            i11 += bVar.f111769b;
            if (i11 >= f12) {
                return bVar.f111770c;
            }
        }
        if (this.f111762b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f111762b;
        return arrayList.get(arrayList.size() - 1).f111770c;
    }

    public void g() {
        this.f111762b.clear();
        this.f111764d = -1;
        this.f111765e = 0;
        this.f111766f = 0;
    }
}
