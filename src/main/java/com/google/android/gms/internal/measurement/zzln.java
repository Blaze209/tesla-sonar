package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzna)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z11) {
            while (i12 < zznaVar.size()) {
                this.zza.zzf(i11, zznaVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zznaVar.size(); i16++) {
            zznaVar.zzc(i16);
            i15 += 8;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzly)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z11) {
            while (i12 < zzlyVar.size()) {
                this.zza.zzd(i11, Float.floatToRawIntBits(zzlyVar.zze(i12)));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzlyVar.size(); i16++) {
            zzlyVar.zze(i16);
            i15 += 4;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzlo)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z11) {
            while (i12 < zzloVar.size()) {
                this.zza.zzf(i11, Double.doubleToRawLongBits(zzloVar.zze(i12)));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzloVar.size(); i16++) {
            zzloVar.zze(i16);
            i15 += 8;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzb(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzlm.zzA(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                this.zza.zzb(i11, zzmgVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmgVar.size(); i14++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i14));
        }
        zzlmVar2.zzr(iZzA2);
        while (i12 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i12));
            i12++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzky)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzg(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z11) {
            while (i12 < zzkyVar.size()) {
                this.zza.zzg(i11, zzkyVar.zze(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzkyVar.size(); i16++) {
            zzkyVar.zze(i16);
            i15++;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i11, List list) {
        int i12 = 0;
        if (!(list instanceof zzmx)) {
            while (i12 < list.size()) {
                this.zza.zzh(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i12 < list.size()) {
            Object objZzc = zzmxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i11, (String) objZzc);
            } else {
                this.zza.zzi(i11, (zzlh) objZzc);
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zza.zzi(i11, (zzlh) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzc(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int iZzz = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzz += zzlm.zzz(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(iZzz);
            while (i12 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                this.zza.zzc(i11, zzmgVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int iZzz2 = 0;
        for (int i14 = 0; i14 < zzmgVar.size(); i14++) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i14));
        }
        zzlmVar2.zzr(iZzz2);
        while (i12 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                this.zza.zzd(i11, zzmgVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmgVar.size(); i16++) {
            zzmgVar.zzf(i16);
            i15 += 4;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzna)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z11) {
            while (i12 < zznaVar.size()) {
                this.zza.zzf(i11, zznaVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zznaVar.size(); i16++) {
            zznaVar.zzc(i16);
            i15 += 8;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i12)).intValue();
                    zzlmVar.zzc(i11, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i11, 2);
            int iZzz = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iZzz += zzlm.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlmVar2.zzr(iZzz);
            while (i12 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i12)).intValue();
                zzlmVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int iZzf = zzmgVar.zzf(i12);
                zzlmVar3.zzc(i11, (iZzf >> 31) ^ (iZzf + iZzf));
                i12++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i11, 2);
        int iZzz2 = 0;
        for (int i14 = 0; i14 < zzmgVar.size(); i14++) {
            int iZzf2 = zzmgVar.zzf(i14);
            iZzz2 += zzlm.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzlmVar4.zzr(iZzz2);
        while (i12 < zzmgVar.size()) {
            int iZzf3 = zzmgVar.zzf(i12);
            zzlmVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzna)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    zzlmVar.zze(i11, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iZzA += zzlm.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlmVar2.zzr(iZzA);
            while (i12 < list.size()) {
                long jLongValue3 = ((Long) list.get(i12)).longValue();
                zzlmVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i12++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z11) {
            while (i12 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long jZzc = zznaVar.zzc(i12);
                zzlmVar3.zze(i11, (jZzc >> 63) ^ (jZzc + jZzc));
                i12++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zznaVar.size(); i14++) {
            long jZzc2 = zznaVar.zzc(i14);
            iZzA2 += zzlm.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzlmVar4.zzr(iZzA2);
        while (i12 < zznaVar.size()) {
            long jZzc3 = zznaVar.zzc(i12);
            zzlmVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i11, zzne zzneVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i11, int i12) {
        this.zza.zzd(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i11, long j11) {
        this.zza.zze(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i11, long j11) {
        this.zza.zzf(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i11, float f11) {
        this.zza.zzd(i11, Float.floatToRawIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i11, double d11) {
        this.zza.zzf(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i11, int i12) {
        this.zza.zzb(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i11, long j11) {
        this.zza.zze(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i11, int i12) {
        this.zza.zzb(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i11, long j11) {
        this.zza.zzf(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i11, int i12) {
        this.zza.zzd(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i11, boolean z11) {
        this.zza.zzg(i11, z11);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i11, String str) {
        this.zza.zzh(i11, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i11, zzlh zzlhVar) {
        this.zza.zzi(i11, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i11, int i12) {
        this.zza.zzc(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i11, int i12) {
        this.zza.zzc(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i11, long j11) {
        this.zza.zze(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i11, Object obj, zznx zznxVar) {
        this.zza.zzl(i11, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i11, Object obj, zznx zznxVar) {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i11, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i11) {
        this.zza.zza(i11, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i11) {
        this.zza.zza(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i11, Object obj) {
        if (obj instanceof zzlh) {
            this.zza.zzn(i11, (zzlh) obj);
        } else {
            this.zza.zzm(i11, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzb(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzlm.zzA(((Integer) list.get(i13)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                this.zza.zzb(i11, zzmgVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmgVar.size(); i14++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i14));
        }
        zzlmVar2.zzr(iZzA2);
        while (i12 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmg)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzlmVar.zzr(i13);
            while (i12 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z11) {
            while (i12 < zzmgVar.size()) {
                this.zza.zzd(i11, zzmgVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmgVar.size(); i16++) {
            zzmgVar.zzf(i16);
            i15 += 4;
        }
        zzlmVar2.zzr(i15);
        while (i12 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzna)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zze(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzlm.zzA(((Long) list.get(i13)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z11) {
            while (i12 < zznaVar.size()) {
                this.zza.zze(i11, zznaVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zznaVar.size(); i14++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i14));
        }
        zzlmVar2.zzr(iZzA2);
        while (i12 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzna)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zze(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzlm.zzA(((Long) list.get(i13)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z11) {
            while (i12 < zznaVar.size()) {
                this.zza.zze(i11, zznaVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zznaVar.size(); i14++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i14));
        }
        zzlmVar2.zzr(iZzA2);
        while (i12 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i12));
            i12++;
        }
    }
}
