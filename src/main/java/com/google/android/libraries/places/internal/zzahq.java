package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzahq extends zzahr {
    zzahq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(zzk(obj, j11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(zzj(obj, j11));
    }

    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.zzahs.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.zzahs.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative
    	at java.base/java.lang.System.arraycopy(Native Method)
    	at java.base/java.util.ArrayList.shiftTailOverGap(ArrayList.java:837)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1790)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1759)
    	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:139)
    	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:172)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:137)
    	at jadx.core.dex.regions.conditions.IfCondition.replaceArg(IfCondition.java:270)
    	at jadx.core.dex.instructions.mods.TernaryInsn.replaceArg(TernaryInsn.java:67)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:141)
    	at jadx.core.dex.visitors.InlineMethods.replaceRegs(InlineMethods.java:127)
    	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:86)
    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
    	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
     */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.libraries.places.internal.zzahs.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzahs.zzb) {
            zzahs.zzi(obj, j11, z11);
        } else {
            zzahs.zzj(obj, j11, z11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzahs.zzb) {
            zzahs.zzD(obj, j11, b11);
        } else {
            zzahs.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zze(Object obj, long j11, double d11) {
        zzo(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzf(Object obj, long j11, float f11) {
        zzn(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final boolean zzg(Object obj, long j11) {
        return zzahs.zzb ? zzahs.zzt(obj, j11) : zzahs.zzu(obj, j11);
    }
}
