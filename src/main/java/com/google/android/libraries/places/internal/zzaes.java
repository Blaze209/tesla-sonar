package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzaes {
    private static final zzaes zzb = new zzaes(true);
    final zzahe zza = new zzagu(16);
    private boolean zzc;
    private boolean zzd;

    private zzaes() {
    }

    public static zzaes zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[RETURN] */
    private static final void zzd(zzaer zzaerVar, Object obj) {
        boolean z11;
        zzaerVar.zzb();
        zzafh.zze(obj);
        zzahx zzahxVar = zzahx.zza;
        zzahy zzahyVar = zzahy.INT;
        switch (r0.zza()) {
            case INT:
                z11 = obj instanceof Integer;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z11 = obj instanceof Long;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z11 = obj instanceof Float;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z11 = obj instanceof Double;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z11 = obj instanceof String;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzaed) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzafa)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzagg) || (obj instanceof zzafl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaerVar.zza()), zzaerVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzaes zzaesVar = new zzaes();
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry entryZzg = this.zza.zzg(i11);
            zzaesVar.zzc((zzaer) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzaesVar.zzc((zzaer) entry.getKey(), entry.getValue());
        }
        zzaesVar.zzd = this.zzd;
        return zzaesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaes) {
            return this.zza.equals(((zzaes) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry entryZzg = this.zza.zzg(i11);
            if (entryZzg.getValue() instanceof zzaey) {
                ((zzaey) entryZzg.getValue()).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzaer zzaerVar, Object obj) {
        if (!zzaerVar.zzc()) {
            zzd(zzaerVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzd(zzaerVar, arrayList.get(i11));
            }
            obj = arrayList;
        }
        if (obj instanceof zzafl) {
            this.zzd = true;
        }
        this.zza.put(zzaerVar, obj);
    }

    private zzaes(boolean z11) {
        zzb();
        zzb();
    }
}
