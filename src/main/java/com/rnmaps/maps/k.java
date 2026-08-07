package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TileOverlayOptions f49176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TileOverlay f49177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f49178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f49180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49182g;

    class a implements TileProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f49184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f49185c;

        public a(int i11, String str, boolean z11) {
            this.f49183a = i11;
            this.f49184b = str;
            this.f49185c = z11;
        }

        private String a(int i11, int i12, int i13) {
            return this.f49184b.replace("{x}", Integer.toString(i11)).replace("{y}", Integer.toString(i12)).replace("{z}", Integer.toString(i13));
        }

        /* JADX WARN: Code duplicated, block: B:55:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
        private byte[] b(int i11, int i12, int i13) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            String strA = a(i11, i12, i13);
            InputStream inputStream2 = null;
            try {
                InputStream inputStreamOpen = this.f49185c ? k.this.getContext().getAssets().open(strA) : new FileInputStream(strA);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i14 = inputStreamOpen.read(bArr, 0, 16384);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStreamOpen.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e11) {
                        e = e11;
                        inputStream = inputStreamOpen;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream2 = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        inputStream = inputStreamOpen;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        inputStream2 = inputStreamOpen;
                        th = th3;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (byteArrayOutputStream != null) {
                            throw th;
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Throwable th4 = e;
                    inputStream = inputStreamOpen;
                    e = th4;
                    byteArrayOutputStream2 = null;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                    Throwable th5 = e;
                    inputStream = inputStreamOpen;
                    e = th5;
                    byteArrayOutputStream2 = null;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (Throwable th6) {
                    inputStream2 = inputStreamOpen;
                    th = th6;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e15) {
                e = e15;
                inputStream = null;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                return null;
            } catch (OutOfMemoryError e16) {
                e = e16;
                inputStream = null;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                return null;
            } catch (Throwable th7) {
                th = th7;
                byteArrayOutputStream = null;
            }
        }

        public void c(String str) {
            this.f49184b = str;
        }

        public void d(int i11) {
            this.f49183a = i11;
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i11, int i12, int i13) throws Throwable {
            byte[] bArrB = b(i11, i12, i13);
            if (bArrB == null) {
                return TileProvider.NO_TILE;
            }
            int i14 = this.f49183a;
            return new Tile(i14, i14, bArrB);
        }
    }

    public k(Context context) {
        super(context);
    }

    private TileOverlayOptions j() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f49181f);
        a aVar = new a((int) this.f49180e, this.f49179d, this.f49182g);
        this.f49178c = aVar;
        tileOverlayOptions.tileProvider(aVar);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49177b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f49176a == null) {
            this.f49176a = j();
        }
        return this.f49176a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        this.f49177b.remove();
    }

    public void i(Object obj) {
        this.f49177b = ((GoogleMap) obj).addTileOverlay(getTileOverlayOptions());
    }

    public void setPathTemplate(String str) {
        this.f49179d = str;
        a aVar = this.f49178c;
        if (aVar != null) {
            aVar.c(str);
        }
        TileOverlay tileOverlay = this.f49177b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f11) {
        this.f49180e = f11;
        a aVar = this.f49178c;
        if (aVar != null) {
            aVar.d((int) f11);
        }
    }

    public void setUseAssets(boolean z11) {
        this.f49182g = z11;
    }

    public void setZIndex(float f11) {
        this.f49181f = f11;
        TileOverlay tileOverlay = this.f49177b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}
