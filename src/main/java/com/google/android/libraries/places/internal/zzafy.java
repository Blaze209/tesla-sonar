package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzafy implements zzags {
    private static final zzage zza = new zzafw();
    private final zzage zzb;

    public zzafy() {
        zzage zzageVar;
        zzaeu zzaeuVarZza = zzaeu.zza();
        try {
            zzageVar = (zzage) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzageVar = zza;
        }
        zzafx zzafxVar = new zzafx(zzaeuVarZza, zzageVar);
        zzafh.zzf(zzafxVar, "messageInfoFactory");
        this.zzb = zzafxVar;
    }

    private static boolean zzb(zzagd zzagdVar) {
        return zzagdVar.zzc() == 1;
    }

    @Override // com.google.android.libraries.places.internal.zzags
    public final zzagr zza(Class cls) {
        zzagt.zzE(cls);
        zzagd zzagdVarZzb = this.zzb.zzb(cls);
        if (zzagdVarZzb.zzb()) {
            return zzaey.class.isAssignableFrom(cls) ? zzagk.zzi(zzagt.zzB(), zzaeq.zzb(), zzagdVarZzb.zza()) : zzagk.zzi(zzagt.zzz(), zzaeq.zza(), zzagdVarZzb.zza());
        }
        if (zzaey.class.isAssignableFrom(cls)) {
            return zzb(zzagdVarZzb) ? zzagj.zzi(cls, zzagdVarZzb, zzagm.zzb(), zzafu.zzd(), zzagt.zzB(), zzaeq.zzb(), zzagc.zzb()) : zzagj.zzi(cls, zzagdVarZzb, zzagm.zzb(), zzafu.zzd(), zzagt.zzB(), null, zzagc.zzb());
        }
        return zzb(zzagdVarZzb) ? zzagj.zzi(cls, zzagdVarZzb, zzagm.zza(), zzafu.zzc(), zzagt.zzz(), zzaeq.zza(), zzagc.zza()) : zzagj.zzi(cls, zzagdVarZzb, zzagm.zza(), zzafu.zzc(), zzagt.zzA(), null, zzagc.zza());
    }
}
