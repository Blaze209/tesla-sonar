package s8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f110632h = new Comparator() { // from class: s8.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.b((n.b) obj, (n.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f110633i = new Comparator() { // from class: s8.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((n.b) obj).f110643c, ((n.b) obj2).f110643c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f110634a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f110638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f110639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f110640g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f110636c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f110635b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f110637d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f110642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f110643c;

        private b() {
        }
    }

    public n(int i11) {
        this.f110634a = i11;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f110641a - bVar2.f110641a;
    }

    private void d() {
        if (this.f110637d != 1) {
            Collections.sort(this.f110635b, f110632h);
            this.f110637d = 1;
        }
    }

    private void e() {
        if (this.f110637d != 0) {
            Collections.sort(this.f110635b, f110633i);
            this.f110637d = 0;
        }
    }

    public void c(int i11, float f11) {
        b bVar;
        d();
        int i12 = this.f110640g;
        if (i12 > 0) {
            b[] bVarArr = this.f110636c;
            int i13 = i12 - 1;
            this.f110640g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f110638e;
        this.f110638e = i14 + 1;
        bVar.f110641a = i14;
        bVar.f110642b = i11;
        bVar.f110643c = f11;
        this.f110635b.add(bVar);
        this.f110639f += i11;
        while (true) {
            int i15 = this.f110639f;
            int i16 = this.f110634a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            b bVar2 = this.f110635b.get(0);
            int i18 = bVar2.f110642b;
            if (i18 <= i17) {
                this.f110639f -= i18;
                this.f110635b.remove(0);
                int i19 = this.f110640g;
                if (i19 < 5) {
                    b[] bVarArr2 = this.f110636c;
                    this.f110640g = i19 + 1;
                    bVarArr2[i19] = bVar2;
                }
            } else {
                bVar2.f110642b = i18 - i17;
                this.f110639f -= i17;
            }
        }
    }

    public float f(float f11) {
        e();
        float f12 = f11 * this.f110639f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f110635b.size(); i12++) {
            b bVar = this.f110635b.get(i12);
            i11 += bVar.f110642b;
            if (i11 >= f12) {
                return bVar.f110643c;
            }
        }
        if (this.f110635b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f110635b;
        return arrayList.get(arrayList.size() - 1).f110643c;
    }

    public void g() {
        this.f110635b.clear();
        this.f110637d = -1;
        this.f110638e = 0;
        this.f110639f = 0;
    }
}
