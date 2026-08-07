package lx;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.v;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class b implements TileProvider {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f90859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f90860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lx.a f90861m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nx.a<c> f90862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection<c> f90863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kx.a f90864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f90865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lx.a f90866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f90867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double[] f90868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f90869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double[] f90870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f90871j;

    /* JADX INFO: renamed from: lx.b$b, reason: collision with other inner class name */
    public static class C1932b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Collection<c> f90872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f90873b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private lx.a f90874c = b.f90861m;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f90875d = 0.7d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private double f90876e = 0.0d;

        public b f() {
            if (this.f90872a != null) {
                return new b(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public C1932b g(lx.a aVar) {
            this.f90874c = aVar;
            return this;
        }

        public C1932b h(double d11) {
            this.f90875d = d11;
            if (d11 < 0.0d || d11 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public C1932b i(int i11) {
            this.f90873b = i11;
            if (i11 < 10 || i11 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public C1932b j(Collection<c> collection) {
            this.f90872a = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 0), Color.rgb(255, 0, 0)};
        f90859k = iArr;
        float[] fArr = {0.2f, 1.0f};
        f90860l = fArr;
        f90861m = new lx.a(iArr, fArr);
    }

    static Bitmap a(double[][] dArr, int[] iArr, double d11) {
        int i11 = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d11;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i12 = 0; i12 < length2; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                double d12 = dArr[i13][i12];
                int i14 = (i12 * length2) + i13;
                int i15 = (int) (d12 * length);
                if (d12 == 0.0d) {
                    iArr2[i14] = 0;
                } else if (i15 < iArr.length) {
                    iArr2[i14] = iArr[i15];
                } else {
                    iArr2[i14] = i11;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static Tile b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static double[][] c(double[][] dArr, double[] dArr2) {
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i11 = length - (iFloor * 2);
        int i12 = iFloor + i11;
        int i13 = i12 - 1;
        boolean z11 = true;
        int i14 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i15 = 0;
        while (true) {
            double d11 = 0.0d;
            if (i15 >= length) {
                break;
            }
            int i16 = i14;
            while (i16 < length) {
                double d12 = dArr[i15][i16];
                if (d12 != d11) {
                    int i17 = i15 + iFloor;
                    if (i13 < i17) {
                        i17 = i13;
                    }
                    int i18 = i17 + 1;
                    int i19 = i15 - iFloor;
                    for (int i21 = iFloor > i19 ? iFloor : i19; i21 < i18; i21++) {
                        double[] dArr4 = dArr3[i21];
                        dArr4[i16] = dArr4[i16] + (dArr2[i21 - i19] * d12);
                    }
                }
                i16++;
                z11 = z11;
                i14 = i14;
                d11 = d11;
            }
            i15++;
        }
        int i22 = i14;
        int[] iArr = new int[2];
        iArr[z11 ? 1 : 0] = i11;
        iArr[i22] = i11;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i23 = iFloor; i23 < i12; i23++) {
            for (int i24 = i22; i24 < length; i24++) {
                double d13 = dArr3[i23][i24];
                if (d13 != 0.0d) {
                    int i25 = i24 + iFloor;
                    if (i13 < i25) {
                        i25 = i13;
                    }
                    int i26 = i25 + 1;
                    int i27 = i24 - iFloor;
                    for (int i28 = iFloor > i27 ? iFloor : i27; i28 < i26; i28++) {
                        double[] dArr6 = dArr5[i23 - iFloor];
                        int i29 = i28 - iFloor;
                        dArr6[i29] = dArr6[i29] + (dArr2[i28 - i27] * d13);
                    }
                }
            }
        }
        return dArr5;
    }

    static double[] d(int i11, double d11) {
        double[] dArr = new double[(i11 * 2) + 1];
        for (int i12 = -i11; i12 <= i11; i12++) {
            dArr[i12 + i11] = Math.exp(((double) ((-i12) * i12)) / ((2.0d * d11) * d11));
        }
        return dArr;
    }

    static kx.a e(Collection<c> collection) {
        Iterator<c> it = collection.iterator();
        c next = it.next();
        double d11 = next.a().f89443a;
        double d12 = next.a().f89443a;
        double d13 = d11;
        double d14 = d12;
        double d15 = next.a().f89444b;
        double d16 = next.a().f89444b;
        while (it.hasNext()) {
            c next2 = it.next();
            double d17 = next2.a().f89443a;
            double d18 = next2.a().f89444b;
            if (d17 < d13) {
                d13 = d17;
            }
            if (d17 > d14) {
                d14 = d17;
            }
            if (d18 < d15) {
                d15 = d18;
            }
            if (d18 > d16) {
                d16 = d18;
            }
        }
        return new kx.a(d13, d14, d15, d16);
    }

    private double[] f(int i11) {
        int i12;
        double[] dArr = new double[22];
        if (this.f90871j != 0.0d) {
            for (int i13 = 0; i13 < 22; i13++) {
                dArr[i13] = this.f90871j;
            }
        } else {
            int i14 = 5;
            while (true) {
                if (i14 >= 11) {
                    break;
                }
                dArr[i14] = g(this.f90863b, this.f90864c, i11, (int) (Math.pow(2.0d, i14 - 3) * 1280.0d));
                if (i14 == 5) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        dArr[i15] = dArr[i14];
                    }
                }
                i14++;
            }
            for (i12 = 11; i12 < 22; i12++) {
                dArr[i12] = dArr[10];
            }
        }
        return dArr;
    }

    static double g(Collection<c> collection, kx.a aVar, int i11, int i12) {
        double d11 = aVar.f89437a;
        double d12 = aVar.f89439c;
        double d13 = aVar.f89438b;
        double d14 = d12 - d11;
        double d15 = aVar.f89440d - d13;
        if (d14 <= d15) {
            d14 = d15;
        }
        double d16 = ((double) ((int) (((double) (i12 / (i11 * 2))) + 0.5d))) / d14;
        v vVar = new v();
        double d17 = 0.0d;
        for (c cVar : collection) {
            double d18 = cVar.a().f89443a;
            int i13 = (int) ((cVar.a().f89444b - d13) * d16);
            long j11 = (int) ((d18 - d11) * d16);
            v vVar2 = (v) vVar.d(j11);
            if (vVar2 == null) {
                vVar2 = new v();
                vVar.h(j11, vVar2);
            }
            long j12 = i13;
            Double dValueOf = (Double) vVar2.d(j12);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double dDoubleValue = dValueOf.doubleValue() + cVar.b();
            vVar2.h(j12, Double.valueOf(dDoubleValue));
            if (dDoubleValue > d17) {
                d17 = dDoubleValue;
            }
        }
        return d17;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i11, int i12, int i13) {
        double d11 = 1.0d;
        double dPow = 1.0d / Math.pow(2.0d, i13);
        int i14 = this.f90865d;
        double d12 = (((double) i14) * dPow) / 512.0d;
        double d13 = ((2.0d * d12) + dPow) / ((double) ((i14 * 2) + 512));
        double d14 = (((double) i11) * dPow) - d12;
        double d15 = (((double) (i11 + 1)) * dPow) + d12;
        double d16 = (((double) i12) * dPow) - d12;
        double d17 = (((double) (i12 + 1)) * dPow) + d12;
        Collection<c> arrayList = new ArrayList();
        if (d14 < 0.0d) {
            arrayList = this.f90862a.c(new kx.a(d14 + 1.0d, 1.0d, d16, d17));
            d11 = -1.0d;
        } else if (d15 > 1.0d) {
            arrayList = this.f90862a.c(new kx.a(0.0d, d15 - 1.0d, d16, d17));
        } else {
            d11 = 0.0d;
        }
        kx.a aVar = new kx.a(d14, d15, d16, d17);
        kx.a aVar2 = this.f90864c;
        if (!aVar.e(new kx.a(aVar2.f89437a - d12, aVar2.f89439c + d12, aVar2.f89438b - d12, aVar2.f89440d + d12))) {
            return TileProvider.NO_TILE;
        }
        Collection<T> collectionC = this.f90862a.c(aVar);
        if (collectionC.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i15 = this.f90865d;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i15 * 2) + 512, (i15 * 2) + 512);
        for (T t11 : collectionC) {
            kx.b bVarA = t11.a();
            int i16 = (int) ((bVarA.f89443a - d14) / d13);
            int i17 = (int) ((bVarA.f89444b - d16) / d13);
            double[] dArr2 = dArr[i16];
            dArr2[i17] = dArr2[i17] + t11.b();
        }
        for (c cVar : arrayList) {
            kx.b bVarA2 = cVar.a();
            int i18 = (int) (((bVarA2.f89443a + d11) - d14) / d13);
            int i19 = (int) ((bVarA2.f89444b - d16) / d13);
            double[] dArr3 = dArr[i18];
            dArr3[i19] = dArr3[i19] + cVar.b();
        }
        return b(a(c(dArr, this.f90868g), this.f90867f, this.f90870i[i13]));
    }

    public void h(lx.a aVar) {
        this.f90866e = aVar;
        this.f90867f = aVar.b(this.f90869h);
    }

    public void i(double d11) {
        this.f90869h = d11;
        h(this.f90866e);
    }

    public void j(int i11) {
        this.f90865d = i11;
        this.f90868g = d(i11, ((double) i11) / 3.0d);
        this.f90870i = f(this.f90865d);
    }

    public void k(Collection<c> collection) {
        this.f90863b = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        kx.a aVarE = e(this.f90863b);
        this.f90864c = aVarE;
        this.f90862a = new nx.a<>(aVarE);
        Iterator<c> it = this.f90863b.iterator();
        while (it.hasNext()) {
            this.f90862a.a(it.next());
        }
        this.f90870i = f(this.f90865d);
    }

    private b(C1932b c1932b) {
        this.f90863b = c1932b.f90872a;
        this.f90865d = c1932b.f90873b;
        this.f90866e = c1932b.f90874c;
        this.f90869h = c1932b.f90875d;
        this.f90871j = c1932b.f90876e;
        int i11 = this.f90865d;
        this.f90868g = d(i11, ((double) i11) / 3.0d);
        h(this.f90866e);
        k(this.f90863b);
    }
}
