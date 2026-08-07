package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes5.dex */
public final class zzel extends zzeg {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzef zzc;

    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzel.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z11 = true;
        if (str != null && !"robolectric".equals(str)) {
            z11 = false;
        }
        zzb = z11;
        zzc = new zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public zzdj zza(Class<?> cls, int i11) {
                return zzdj.zza;
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzel.zza) {
                    try {
                        if (cls.equals(zzel.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzel.zzb || (stackTraceElementZza = zzfj.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }
        };
    }

    static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzdp zze(String str) {
        return zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzef zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected zzev zzj() {
        return zzep.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected String zzm() {
        return "platform: Android";
    }
}
