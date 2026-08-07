package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TileOverlayOptions f49169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TileOverlay f49170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lx.b f49171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<lx.c> f49172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lx.a f49173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f49174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f49175g;

    public j(Context context) {
        super(context);
    }

    private TileOverlayOptions j() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        if (this.f49171c == null) {
            lx.b.C1932b c1932bJ = new lx.b.C1932b().j(this.f49172d);
            Integer num = this.f49175g;
            if (num != null) {
                c1932bJ.i(num.intValue());
            }
            Double d11 = this.f49174f;
            if (d11 != null) {
                c1932bJ.h(d11.doubleValue());
            }
            lx.a aVar = this.f49173e;
            if (aVar != null) {
                c1932bJ.g(aVar);
            }
            this.f49171c = c1932bJ.f();
        }
        tileOverlayOptions.tileProvider(this.f49171c);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49170b;
    }

    public TileOverlayOptions getHeatmapOptions() {
        if (this.f49169a == null) {
            this.f49169a = j();
        }
        return this.f49169a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        this.f49170b.remove();
    }

    public void i(Object obj) {
        this.f49170b = ((GoogleMap) obj).addTileOverlay(getHeatmapOptions());
    }

    public void setGradient(lx.a aVar) {
        this.f49173e = aVar;
        lx.b bVar = this.f49171c;
        if (bVar != null) {
            bVar.h(aVar);
        }
        TileOverlay tileOverlay = this.f49170b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(double d11) {
        this.f49174f = Double.valueOf(d11);
        lx.b bVar = this.f49171c;
        if (bVar != null) {
            bVar.i(d11);
        }
        TileOverlay tileOverlay = this.f49170b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setPoints(lx.c[] cVarArr) {
        List<lx.c> listAsList = Arrays.asList(cVarArr);
        this.f49172d = listAsList;
        lx.b bVar = this.f49171c;
        if (bVar != null) {
            bVar.k(listAsList);
        }
        TileOverlay tileOverlay = this.f49170b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setRadius(int i11) {
        this.f49175g = Integer.valueOf(i11);
        lx.b bVar = this.f49171c;
        if (bVar != null) {
            bVar.j(i11);
        }
        TileOverlay tileOverlay = this.f49170b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }
}
