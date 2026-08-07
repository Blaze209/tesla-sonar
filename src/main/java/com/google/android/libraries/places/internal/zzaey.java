package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzaev;
import com.google.android.libraries.places.internal.zzaey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaey<MessageType extends zzaey<MessageType, BuilderType>, BuilderType extends zzaev<MessageType, BuilderType>> extends zzadq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzahj zzc = zzahj.zzc();

    protected static zzaff zzA() {
        return zzafv.zze();
    }

    protected static zzafg zzB() {
        return zzagp.zzd();
    }

    protected static zzafg zzC(zzafg zzafgVar) {
        int size = zzafgVar.size();
        return zzafgVar.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzF(zzagg zzaggVar, String str, Object[] objArr) {
        return new zzagq(zzaggVar, str, objArr);
    }

    protected static void zzI(Class cls, zzaey zzaeyVar) {
        zzaeyVar.zzH();
        zzb.put(cls, zzaeyVar);
    }

    private final int zza(zzagr zzagrVar) {
        return zzagrVar == null ? zzago.zza().zzb(getClass()).zza(this) : zzagrVar.zza(this);
    }

    static zzaey zzx(Class cls) {
        Map map = zzb;
        zzaey zzaeyVar = (zzaey) map.get(cls);
        if (zzaeyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaeyVar = (zzaey) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzaeyVar != null) {
            return zzaeyVar;
        }
        zzaey zzaeyVar2 = (zzaey) ((zzaey) zzahs.zze(cls)).zzb(6, null, null);
        if (zzaeyVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzaeyVar2);
        return zzaeyVar2;
    }

    protected static zzafd zzz() {
        return zzaez.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzago.zza().zzb(getClass()).zzg(this, (zzaey) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzL()) {
            return zzu();
        }
        int i11 = this.zza;
        if (i11 != 0) {
            return i11;
        }
        int iZzu = zzu();
        this.zza = iZzu;
        return iZzu;
    }

    public final String toString() {
        return zzagi.zza(this, super.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final /* synthetic */ zzagf zzD() {
        return (zzaev) zzb(5, null, null);
    }

    protected final void zzG() {
        zzago.zza().zzb(getClass()).zzd(this);
        zzH();
    }

    final void zzH() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzJ(int i11) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final void zzK(zzael zzaelVar) {
        zzago.zza().zzb(getClass()).zzf(this, zzaem.zza(zzaelVar));
    }

    final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzb(int i11, Object obj, Object obj2);

    @Override // com.google.android.libraries.places.internal.zzadq
    final int zzr(zzagr zzagrVar) {
        if (zzL()) {
            int iZza = zza(zzagrVar);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iZza2 = zza(zzagrVar);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.libraries.places.internal.zzagh
    public final /* synthetic */ zzagg zzt() {
        return (zzaey) zzb(6, null, null);
    }

    final int zzu() {
        return zzago.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final int zzv() {
        if (zzL()) {
            int iZza = zza(null);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iZza2 = zza(null);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    protected final zzaev zzw() {
        return (zzaev) zzb(5, null, null);
    }

    final zzaey zzy() {
        return (zzaey) zzb(4, null, null);
    }
}
