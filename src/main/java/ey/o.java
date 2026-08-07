package ey;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final zzv f63453a = zzv.zza("\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f63454b = new Comparator() { // from class: ey.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzv zzvVar = o.f63453a;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    static dy.a a(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i12 = 0;
        while (i12 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i12);
            zzbh zzbhVar2 = new zzbh();
            for (int i13 = i11; i13 < sparseArray3.size(); i13++) {
                zzbhVar2.zza((zzl) sparseArray3.valueAt(i13));
            }
            zzbk zzbkVarZzb = zzbhVar2.zzb();
            List listZza = zzbu.zza(zzbkVarZzb, new zzu() { // from class: ey.l
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzl zzlVar2 = (zzl) obj;
                    zzv zzvVar = o.f63453a;
                    List listB = e.b(zzlVar2.zzb);
                    String str = zzy.zzb(zzlVar2.zze) ? "" : zzlVar2.zze;
                    Rect rectA = e.a(listB);
                    String str2 = zzy.zzb(zzlVar2.zzg) ? "und" : zzlVar2.zzg;
                    final Matrix matrix2 = matrix;
                    return new dy.a.b(str, rectA, listB, str2, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: ey.n
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            zzr zzrVar = (zzr) obj2;
                            zzv zzvVar2 = o.f63453a;
                            List listB2 = e.b(zzrVar.zzb);
                            return new dy.a.C1246a(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, e.a(listB2), listB2, zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            zzf zzfVar = ((zzl) zzbkVarZzb.get(i11)).zzb;
            zzcp zzcpVarListIterator = zzbkVarZzb.listIterator(i11);
            int iMax = Integer.MIN_VALUE;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (zzcpVarListIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) zzcpVarListIterator.next()).zzb;
                int i14 = -zzfVar.zza;
                int i15 = -zzfVar.zzb;
                int i16 = i11;
                double dSin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i17 = i12;
                double dCos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i16] = point;
                point.offset(i14, i15);
                Point point2 = pointArr[i16];
                int i18 = point2.x;
                zzcp zzcpVar = zzcpVarListIterator;
                int i19 = point2.y;
                int i21 = (int) ((((double) i18) * dCos) + (((double) i19) * dSin));
                point2.x = i21;
                int i22 = (int) ((((double) (-i18)) * dSin) + (((double) i19) * dCos));
                point2.y = i22;
                pointArr[1] = new Point(zzfVar2.zzc + i21, i22);
                pointArr[2] = new Point(zzfVar2.zzc + i21, zzfVar2.zzd + i22);
                pointArr[3] = new Point(i21, i22 + zzfVar2.zzd);
                for (int i23 = i16; i23 < 4; i23++) {
                    Point point3 = pointArr[i23];
                    iMin = Math.min(iMin, point3.x);
                    iMax = Math.max(iMax, point3.x);
                    iMin2 = Math.min(iMin2, point3.y);
                    iMax2 = Math.max(iMax2, point3.y);
                }
                zzcpVarListIterator = zzcpVar;
                i11 = i16;
                sparseArray = sparseArray4;
                i12 = i17;
            }
            SparseArray sparseArray5 = sparseArray;
            int i24 = i12;
            int i25 = i11;
            int i26 = zzfVar.zza;
            int i27 = zzfVar.zzb;
            double dSin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double dCos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
            int i28 = i25;
            while (i28 < 4) {
                Point point4 = pointArr2[i28];
                int i29 = point4.x;
                double d11 = dSin2;
                int i31 = point4.y;
                point4.x = (int) ((((double) i29) * dCos2) - (((double) i31) * d11));
                point4.y = (int) ((((double) i29) * d11) + (((double) i31) * dCos2));
                point4.offset(i26, i27);
                i28++;
                dSin2 = d11;
            }
            List listAsList = Arrays.asList(pointArr2);
            zzbhVar.zza(new dy.a.e(f63453a.zzb(zzbu.zza(listZza, new zzu() { // from class: ey.m
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((dy.a.b) obj).d();
                }
            })), e.a(listAsList), listAsList, b(listZza), matrix, listZza));
            i12 = i24 + 1;
            i11 = i25;
            sparseArray = sparseArray5;
        }
        zzbk zzbkVarZzb2 = zzbhVar.zzb();
        return new dy.a(f63453a.zzb(zzbu.zza(zzbkVarZzb2, new zzu() { // from class: ey.k
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((dy.a.e) obj).e();
            }
        })), zzbkVarZzb2);
    }

    private static String b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strB = ((dy.a.b) it.next()).b();
            map.put(strB, Integer.valueOf((map.containsKey(strB) ? ((Integer) map.get(strB)).intValue() : 0) + 1));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(setEntrySet, f63454b)).getKey();
        return !zzy.zzb(str) ? str : "und";
    }
}
