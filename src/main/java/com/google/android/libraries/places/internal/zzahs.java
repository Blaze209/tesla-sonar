package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzahs {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzahr zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z11;
        boolean z12;
        zzahr zzahrVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        zzd = zzads.zza();
        Class cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        Class cls2 = Integer.TYPE;
        boolean zZzv2 = zzv(cls2);
        zzahr zzahpVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzahpVar = new zzahq(unsafeZzg);
            } else if (zZzv2) {
                zzahpVar = new zzahp(unsafeZzg);
            }
        }
        zzf = zzahpVar;
        if (zzahpVar == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = zzahpVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                zzh(th2);
            }
        }
        zzg = z11;
        zzahr zzahrVar2 = zzf;
        if (zzahrVar2 == null) {
            z12 = false;
        } else {
            try {
                Class<?> cls4 = zzahrVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z12 = true;
            } catch (Throwable th3) {
                zzh(th3);
                z12 = false;
            }
        }
        zzh = z12;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzahrVar = zzf) != null) {
            zzahrVar.zzl(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzahs() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i11 = zzads.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        zzahr zzahrVar = zzf;
        int iZzj = zzahrVar.zzj(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        zzahrVar.zzn(obj, j12, ((255 & b11) << i11) | (iZzj & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        zzahr zzahrVar = zzf;
        int i11 = (((int) j11) & 3) << 3;
        zzahrVar.zzn(obj, j12, ((255 & b11) << i11) | (zzahrVar.zzj(obj, j12) & (~(255 << i11))));
    }

    static double zza(Object obj, long j11) {
        return zzf.zza(obj, j11);
    }

    static float zzb(Object obj, long j11) {
        return zzf.zzb(obj, j11);
    }

    static int zzc(Object obj, long j11) {
        return zzf.zzj(obj, j11);
    }

    static long zzd(Object obj, long j11) {
        return zzf.zzk(obj, j11);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static Object zzf(Object obj, long j11) {
        return zzf.zzm(obj, j11);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaho());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzahs.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void zzm(Object obj, long j11, boolean z11) {
        zzf.zzc(obj, j11, z11);
    }

    static void zzn(byte[] bArr, long j11, byte b11) {
        zzf.zzd(bArr, zza + j11, b11);
    }

    static void zzo(Object obj, long j11, double d11) {
        zzf.zze(obj, j11, d11);
    }

    static void zzp(Object obj, long j11, float f11) {
        zzf.zzf(obj, j11, f11);
    }

    static void zzq(Object obj, long j11, int i11) {
        zzf.zzn(obj, j11, i11);
    }

    static void zzr(Object obj, long j11, long j12) {
        zzf.zzo(obj, j11, j12);
    }

    static void zzs(Object obj, long j11, Object obj2) {
        zzf.zzp(obj, j11, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j11) {
        return ((byte) ((zzf.zzj(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j11) {
        return ((byte) ((zzf.zzj(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class cls) {
        int i11 = zzads.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzw(Object obj, long j11) {
        return zzf.zzg(obj, j11);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
