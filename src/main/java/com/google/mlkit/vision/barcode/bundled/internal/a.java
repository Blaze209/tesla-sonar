package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbe;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import hy.b0;
import hy.d0;
import hy.f0;
import hy.g;
import hy.h;
import hy.h0;
import hy.j;
import hy.l0;
import hy.m;
import hy.p0;
import hy.q;
import hy.r;
import hy.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nu.e;
import nu.f;
import nu.i;
import nu.l;
import nu.o;
import org.spongycastle.math.ec.Tnaf;
import xx.d;

/* JADX INFO: loaded from: classes5.dex */
final class a extends zzbm {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f45100q = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[][] f45101r = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f45102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zzba f45103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BarhopperV3 f45104p;

    a(Context context, zzba zzbaVar) {
        this.f45102n = context;
        this.f45103o = zzbaVar;
    }

    private final RecognitionOptions R2() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.a(this.f45103o.zza());
        recognitionOptions.f(this.f45103o.zzb());
        recognitionOptions.b(true);
        recognitionOptions.c(true);
        return recognitionOptions;
    }

    private static zzan S2(b0 b0Var, String str, String str2) {
        if (b0Var == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(b0Var.d(), b0Var.zzd(), b0Var.a(), b0Var.b(), b0Var.zzc(), b0Var.c(), b0Var.g(), matcher.find() ? matcher.group(1) : null);
    }

    private final hy.a T2(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f45104p);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.n(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.o(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.o(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    private final List U2(IObjectWrapper iObjectWrapper, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        hy.a aVarP;
        zzar zzarVar;
        zzau zzauVar;
        zzav zzavVar;
        zzax zzaxVar;
        zzaw zzawVar;
        zzas zzasVar;
        zzao zzaoVar;
        zzap zzapVar;
        zzaq zzaqVar;
        byte b11;
        Point[] pointArr;
        int i11;
        zzau[] zzauVarArr;
        zzar[] zzarVarArr;
        zzam[] zzamVarArr;
        int iZzb = zzccVar.zzb();
        byte b12 = -1;
        if (iZzb == -1) {
            aVarP = ((BarhopperV3) Preconditions.checkNotNull(this.f45104p)).p((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), recognitionOptions);
        } else if (iZzb == 17) {
            aVarP = T2((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzccVar, recognitionOptions);
        } else if (iZzb != 35) {
            if (iZzb != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + zzccVar.zzb());
            }
            aVarP = T2((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzccVar, recognitionOptions);
        } else {
            aVarP = T2(((Image) Preconditions.checkNotNull((Image) ObjectWrapper.unwrap(iObjectWrapper))).getPlanes()[0].getBuffer(), zzccVar, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        Matrix matrixE = d.b().e(zzccVar.zzd(), zzccVar.zza(), zzccVar.zzc());
        for (s sVar : aVarP.c()) {
            if (sVar.b() > 0 && matrixE != null) {
                float[] fArr = new float[8];
                List listN = sVar.n();
                int iB = sVar.b();
                for (int i12 = 0; i12 < iB; i12++) {
                    int i13 = i12 + i12;
                    fArr[i13] = ((h) listN.get(i12)).a();
                    fArr[i13 + 1] = ((h) listN.get(i12)).b();
                }
                matrixE.mapPoints(fArr);
                int iZzc = zzccVar.zzc();
                int i14 = 0;
                while (i14 < iB) {
                    r rVar = (r) sVar.zzH();
                    int i15 = i14 + i14;
                    byte b13 = b12;
                    g gVarC = h.c();
                    gVarC.a((int) fArr[i15]);
                    gVarC.b((int) fArr[i15 + 1]);
                    rVar.a((i14 + iZzc) % iB, (h) gVarC.zzj());
                    sVar = (s) rVar.zzj();
                    i14++;
                    b12 = b13;
                }
            }
            byte b14 = b12;
            if (sVar.s()) {
                l0 l0VarG = sVar.g();
                zzarVar = new zzar(l0VarG.c() - 1, l0VarG.zzc(), l0VarG.zze(), l0VarG.zzd());
            } else {
                zzarVar = null;
            }
            if (sVar.u()) {
                zzco zzcoVarZzb = sVar.zzb();
                zzauVar = new zzau(zzcoVarZzb.zzd() - 1, zzcoVarZzb.zzc());
            } else {
                zzauVar = null;
            }
            if (sVar.v()) {
                j jVarI = sVar.i();
                zzavVar = new zzav(jVarI.zzc(), jVarI.zzd());
            } else {
                zzavVar = null;
            }
            if (sVar.x()) {
                q qVarK = sVar.k();
                zzaxVar = new zzax(qVarK.zzd(), qVarK.zzc(), qVarK.c() - 1);
            } else {
                zzaxVar = null;
            }
            if (sVar.w()) {
                m mVarJ = sVar.j();
                zzawVar = new zzaw(mVarJ.zzc(), mVarJ.zzd());
            } else {
                zzawVar = null;
            }
            if (sVar.t()) {
                p0 p0VarH = sVar.h();
                zzasVar = new zzas(p0VarH.a(), p0VarH.b());
            } else {
                zzasVar = null;
            }
            if (sVar.p()) {
                d0 d0VarD = sVar.d();
                zzaoVar = new zzao(d0VarD.zzj(), d0VarD.zze(), d0VarD.zzf(), d0VarD.zzh(), d0VarD.zzi(), S2(d0VarD.b(), sVar.l().zzn() ? sVar.l().zzt() : null, "DTSTART:([0-9TZ]*)"), S2(d0VarD.a(), sVar.l().zzn() ? sVar.l().zzt() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaoVar = null;
            }
            if (sVar.q()) {
                f0 f0VarE = sVar.e();
                zzck zzckVarZza = f0VarE.zza();
                zzat zzatVar = zzckVarZza != null ? new zzat(zzckVarZza.zzd(), zzckVarZza.zzi(), zzckVarZza.zzh(), zzckVarZza.zzc(), zzckVarZza.zzf(), zzckVarZza.zze(), zzckVarZza.zzj()) : null;
                String strZzd = f0VarE.zzd();
                String strZze = f0VarE.zze();
                List listE = f0VarE.e();
                if (listE.isEmpty()) {
                    zzauVarArr = null;
                } else {
                    zzau[] zzauVarArr2 = new zzau[listE.size()];
                    for (int i16 = 0; i16 < listE.size(); i16++) {
                        zzauVarArr2[i16] = new zzau(((zzco) listE.get(i16)).zzd() - 1, ((zzco) listE.get(i16)).zzc());
                    }
                    zzauVarArr = zzauVarArr2;
                }
                List listD = f0VarE.d();
                if (listD.isEmpty()) {
                    zzarVarArr = null;
                } else {
                    zzar[] zzarVarArr2 = new zzar[listD.size()];
                    for (int i17 = 0; i17 < listD.size(); i17++) {
                        zzarVarArr2[i17] = new zzar(((l0) listD.get(i17)).c() - 1, ((l0) listD.get(i17)).zzc(), ((l0) listD.get(i17)).zze(), ((l0) listD.get(i17)).zzd());
                    }
                    zzarVarArr = zzarVarArr2;
                }
                String[] strArr = (String[]) f0VarE.f().toArray(new String[0]);
                List listC = f0VarE.c();
                if (listC.isEmpty()) {
                    zzamVarArr = null;
                } else {
                    zzam[] zzamVarArr2 = new zzam[listC.size()];
                    for (int i18 = 0; i18 < listC.size(); i18++) {
                        zzamVarArr2[i18] = new zzam(((zzci) listC.get(i18)).zzc() - 1, (String[]) ((zzci) listC.get(i18)).zzb().toArray(new String[0]));
                    }
                    zzamVarArr = zzamVarArr2;
                }
                zzapVar = new zzap(zzatVar, strZzd, strZze, zzauVarArr, zzarVarArr, strArr, zzamVarArr);
            } else {
                zzapVar = null;
            }
            if (sVar.r()) {
                h0 h0VarF = sVar.f();
                zzaqVar = new zzaq(h0VarF.zzi(), h0VarF.c(), h0VarF.i(), h0VarF.g(), h0VarF.d(), h0VarF.zze(), h0VarF.zzc(), h0VarF.zzd(), h0VarF.zzf(), h0VarF.h(), h0VarF.e(), h0VarF.zzj(), h0VarF.zzh(), h0VarF.f());
            } else {
                zzaqVar = null;
            }
            int i19 = 4;
            switch (sVar.y() - 1) {
                case 0:
                    b11 = 0;
                    break;
                case 1:
                    b11 = 1;
                    break;
                case 2:
                    b11 = 2;
                    break;
                case 3:
                    b11 = 4;
                    break;
                case 4:
                    b11 = 8;
                    break;
                case 5:
                    b11 = Tnaf.POW_2_WIDTH;
                    break;
                case 6:
                    b11 = 32;
                    break;
                case 7:
                    b11 = 64;
                    break;
                case 8:
                    b11 = 128;
                    break;
                case 9:
                    b11 = 256;
                    break;
                case 10:
                    b11 = 512;
                    break;
                case 11:
                    b11 = 1024;
                    break;
                case 12:
                    b11 = 2048;
                    break;
                case 13:
                    b11 = 4096;
                    break;
                default:
                    b11 = b14;
                    break;
            }
            String strM = sVar.m();
            String strZzt = sVar.l().zzn() ? sVar.l().zzt() : null;
            byte[] bArrZzw = sVar.l().zzw();
            List listN2 = sVar.n();
            if (listN2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[listN2.size()];
                for (int i21 = 0; i21 < listN2.size(); i21++) {
                    pointArr2[i21] = new Point(((h) listN2.get(i21)).a(), ((h) listN2.get(i21)).b());
                }
                pointArr = pointArr2;
            }
            switch (sVar.a() - 1) {
                case 1:
                    i11 = 1;
                    continue;
                    arrayList.add(new zzay(b11, strM, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    b12 = b14;
                    break;
                case 2:
                    i11 = 2;
                    continue;
                    arrayList.add(new zzay(b11, strM, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    b12 = b14;
                    break;
                case 3:
                    i19 = 3;
                    break;
                case 4:
                    break;
                case 5:
                    i19 = 5;
                    break;
                case 6:
                    i19 = 6;
                    break;
                case 7:
                    i19 = 7;
                    break;
                case 8:
                    i11 = 8;
                    continue;
                    arrayList.add(new zzay(b11, strM, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    b12 = b14;
                    break;
                case 9:
                    i19 = 9;
                    break;
                case 10:
                    i19 = 10;
                    break;
                case 11:
                    i19 = 11;
                    break;
                case 12:
                    i19 = 12;
                    break;
                default:
                    i11 = 0;
                    continue;
                    arrayList.add(new zzay(b11, strM, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    b12 = b14;
                    break;
            }
            i11 = i19;
            arrayList.add(new zzay(b11, strM, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
            b12 = b14;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(IObjectWrapper iObjectWrapper, zzcc zzccVar) {
        return U2(iObjectWrapper, zzccVar, R2());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(IObjectWrapper iObjectWrapper, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptionsR2 = R2();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.b(zzbcVar.zza().zza());
        multiScaleDecodingOptions.c(zzbcVar.zza().zzb());
        recognitionOptionsR2.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(zzbcVar.zza().zzc());
        recognitionOptionsR2.e(multiScaleDetectionOptions);
        recognitionOptionsR2.g(zzbcVar.zzb());
        return U2(iObjectWrapper, zzccVar, recognitionOptionsR2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() {
        if (this.f45104p != null) {
            return;
        }
        this.f45104p = new BarhopperV3();
        l lVarA = nu.m.a();
        i iVarA = nu.j.a();
        int i11 = 16;
        int i12 = 0;
        for (int i13 = 0; i13 < 6; i13++) {
            f fVarA = nu.g.a();
            fVarA.c(i11);
            fVarA.d(i11);
            for (int i14 = 0; i14 < f45100q[i13]; i14++) {
                double[] dArr = f45101r[i12];
                double d11 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f11 = (float) d11;
                fVarA.a(f11 / fSqrt);
                fVarA.b(f11 * fSqrt);
                i12++;
            }
            i11 += i11;
            iVarA.a(fVarA);
        }
        lVarA.a(iVarA);
        try {
            InputStream inputStreamOpen = this.f45102n.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = this.f45102n.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = this.f45102n.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f45104p);
                        o oVarA = nu.a.a();
                        lVarA.b(zzdf.zzs(inputStreamOpen));
                        oVarA.a(lVarA);
                        nu.d dVarA = e.a();
                        dVarA.a(zzdf.zzs(inputStreamOpen2));
                        dVarA.b(zzdf.zzs(inputStreamOpen3));
                        oVarA.b(dVarA);
                        barhopperV3.c(oVarA.zzj());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Failed to open Barcode models", e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zze(zzbe zzbeVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.f45104p;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f45104p = null;
        }
    }
}
