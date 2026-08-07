package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzagc {
    private static final zzagb zza;
    private static final zzagb zzb;

    static {
        zzagb zzagbVar = null;
        try {
            zzagbVar = (zzagb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzagbVar;
        zzb = new zzagb();
    }

    static zzagb zza() {
        return zza;
    }

    static zzagb zzb() {
        return zzb;
    }
}
