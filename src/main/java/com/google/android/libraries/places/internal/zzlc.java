package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes5.dex */
public final class zzlc extends zzkx {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzkw zzc;

    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzlc.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z11 = true;
        if (str != null && !"robolectric".equals(str)) {
            z11 = false;
        }
        zzb = z11;
        zzc = new zzkw() { // from class: com.google.android.libraries.places.internal.zzlc.1
            @Override // com.google.android.libraries.places.internal.zzkw
            public zzkb zza(Class<?> cls, int i11) {
                return zzkb.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzkw
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzlc.zza) {
                    try {
                        if (cls.equals(zzlc.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzlc.zzb || (stackTraceElementZza = zzlz.zza(cls, 1)) == null) {
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

    @Override // com.google.android.libraries.places.internal.zzkx
    protected zzkg zze(String str) {
        return zzlf.zzb(str);
    }

    @Override // com.google.android.libraries.places.internal.zzkx
    protected zzkw zzh() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzkx
    protected zzll zzj() {
        return zzlg.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzkx
    protected String zzm() {
        return "platform: Android";
    }
}
