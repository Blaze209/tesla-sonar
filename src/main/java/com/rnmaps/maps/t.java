package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class t extends q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f49337r = {-2.003750834789244E7d, 2.003750834789244E7d};

    class a extends p {

        /* JADX INFO: renamed from: com.rnmaps.maps.t$a$a, reason: collision with other inner class name */
        class C0780a extends UrlTileProvider {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f49339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f49340b;

            public C0780a(int i11, int i12, String str) {
                super(i11, i12);
                this.f49339a = str;
                this.f49340b = i11;
            }

            private double[] a(int i11, int i12, int i13) {
                double dPow = 4.007501669578488E7d / Math.pow(2.0d, i13);
                return new double[]{t.f49337r[0] + (((double) i11) * dPow), t.f49337r[1] - (((double) (i12 + 1)) * dPow), t.f49337r[0] + (((double) (i11 + 1)) * dPow), t.f49337r[1] - (((double) i12) * dPow)};
            }

            @Override // com.google.android.gms.maps.model.UrlTileProvider
            public URL getTileUrl(int i11, int i12, int i13) {
                a aVar = a.this;
                t tVar = t.this;
                if (tVar.f49266f > BitmapDescriptorFactory.HUE_RED && i13 > aVar.f49250e) {
                    return null;
                }
                if (tVar.f49268h > BitmapDescriptorFactory.HUE_RED && i13 < aVar.f49252g) {
                    return null;
                }
                double[] dArrA = a(i11, i12, i13);
                try {
                    return new URL(this.f49339a.replace("{minX}", Double.toString(dArrA[0])).replace("{minY}", Double.toString(dArrA[1])).replace("{maxX}", Double.toString(dArrA[2])).replace("{maxY}", Double.toString(dArrA[3])).replace("{width}", Integer.toString(this.f49340b)).replace("{height}", Integer.toString(this.f49340b)));
                } catch (MalformedURLException e11) {
                    throw new AssertionError(e11);
                }
            }
        }

        public a(int i11, String str, int i12, int i13, int i14, String str2, int i15, boolean z11, Context context, boolean z12) {
            super(i11, false, str, i12, i13, i14, false, str2, i15, z11, context, z12);
            this.f49246a = new C0780a(i11, i11, str);
        }
    }

    public t(Context context) {
        super(context);
    }

    @Override // com.rnmaps.maps.q
    protected TileOverlayOptions j() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f49265e);
        tileOverlayOptions.transparency(1.0f - this.f49275o);
        tileOverlayOptions.tileProvider(new a((int) this.f49270j, this.f49264d, (int) this.f49266f, (int) this.f49267g, (int) this.f49268h, this.f49272l, (int) this.f49273m, this.f49274n, this.f49276p, this.f49277q));
        return tileOverlayOptions;
    }
}
