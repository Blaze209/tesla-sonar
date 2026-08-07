package com.rnmaps.maps;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class q extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected TileOverlayOptions f49261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TileOverlay f49262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected p f49263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f49264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected float f49265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float f49266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float f49267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f49268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f49269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f49270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f49271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f49272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f49273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f49274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f49275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Context f49276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f49277q;

    public q(Context context) {
        super(context);
        this.f49267g = 100.0f;
        this.f49269i = false;
        this.f49270j = 256.0f;
        this.f49271k = false;
        this.f49274n = false;
        this.f49275o = 1.0f;
        this.f49277q = false;
        this.f49276p = context;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49262b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f49261a == null) {
            this.f49261a = j();
        }
        return this.f49261a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        this.f49262b.remove();
    }

    public void i(Object obj) {
        this.f49262b = ((GoogleMap) obj).addTileOverlay(getTileOverlayOptions());
    }

    protected TileOverlayOptions j() {
        Log.d("urlTile ", "creating TileProvider");
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f49265e);
        tileOverlayOptions.transparency(1.0f - this.f49275o);
        p pVar = new p((int) this.f49270j, this.f49271k, this.f49264d, (int) this.f49266f, (int) this.f49267g, (int) this.f49268h, this.f49269i, this.f49272l, (int) this.f49273m, this.f49274n, this.f49276p, this.f49277q);
        this.f49263c = pVar;
        tileOverlayOptions.tileProvider(pVar);
        return tileOverlayOptions;
    }

    protected void k() {
        Log.d("urlTile ", "creating new mode TileProvider");
        this.f49277q = true;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.k();
        }
    }

    public void setDoubleTileSize(boolean z11) {
        this.f49271k = z11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.l(z11);
        }
        k();
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setFlipY(boolean z11) {
        this.f49269i = z11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.m(z11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumNativeZ(float f11) {
        this.f49267g = f11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.n((int) f11);
        }
        k();
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumZ(float f11) {
        this.f49266f = f11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.o((int) f11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMinimumZ(float f11) {
        this.f49268h = f11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.p((int) f11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOfflineMode(boolean z11) {
        this.f49274n = z11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.q(z11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(float f11) {
        this.f49275o = f11;
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.setTransparency(1.0f - f11);
        }
    }

    public void setTileCacheMaxAge(float f11) {
        this.f49273m = f11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.r((int) f11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileCachePath(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.f49272l = new URL(str).getPath();
        } catch (MalformedURLException unused) {
            this.f49272l = str;
        } catch (Exception unused2) {
            return;
        }
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.s(str);
        }
        k();
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f11) {
        this.f49270j = f11;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.t((int) f11);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setUrlTemplate(String str) {
        this.f49264d = str;
        p pVar = this.f49263c;
        if (pVar != null) {
            pVar.u(str);
        }
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setZIndex(float f11) {
        this.f49265e = f11;
        TileOverlay tileOverlay = this.f49262b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}
