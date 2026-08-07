package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpg implements zzpb {
    private final AtomicBoolean zza = new AtomicBoolean();
    private HashMap zzb = null;
    private final HashMap zzc = new HashMap(16, 1.0f);
    private final HashMap zzd = new HashMap(16, 1.0f);
    private final HashMap zze = new HashMap(16, 1.0f);
    private final HashMap zzf = new HashMap(16, 1.0f);
    private Object zzg = null;
    private boolean zzh = false;
    private final String[] zzi = new String[0];
    private final zzpe zzj = new zzpe();

    private final void zzc(ContentResolver contentResolver) {
        if (this.zzb == null) {
            this.zza.set(false);
            this.zzb = new HashMap(16, 1.0f);
            this.zzg = new Object();
            contentResolver.registerContentObserver(zzpa.zza, true, new zzpd(this, null));
            return;
        }
        if (this.zza.getAndSet(false)) {
            this.zzb.clear();
            this.zzc.clear();
            this.zzd.clear();
            this.zze.clear();
            this.zzf.clear();
            this.zzg = new Object();
            this.zzh = false;
        }
    }

    private static final ContentResolver zzd(ContentResolver contentResolver) {
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:78:0x00f5, B:80:0x00fd, B:83:0x0109), top: B:96:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x00d9, please report this as an issue */
    @Override // com.google.android.gms.internal.nearby.zzpb
    public final boolean zza(ContentResolver contentResolver, String str, boolean z11) {
        Object obj;
        String str2;
        Boolean bool;
        boolean z12;
        String string;
        HashMap map;
        zzd(contentResolver);
        synchronized (this) {
            try {
                zzc(contentResolver);
                obj = this.zzg;
                HashMap map2 = this.zzc;
                Object obj2 = Boolean.TRUE;
                str2 = null;
                if (map2.containsKey("gms:nearby:requires_gms_check")) {
                    Object obj3 = map2.get("gms:nearby:requires_gms_check");
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                } else {
                    obj2 = null;
                }
                bool = (Boolean) obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        zzd(contentResolver);
        synchronized (this) {
            try {
                zzc(contentResolver);
                Object obj4 = this.zzg;
                z12 = true;
                if (this.zzb.containsKey("gms:nearby:requires_gms_check")) {
                    String str3 = (String) this.zzb.get("gms:nearby:requires_gms_check");
                    if (str3 != null) {
                        str2 = str3;
                    }
                } else {
                    try {
                        Cursor cursorQuery = contentResolver.query(zzpa.zza, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new zzpf("Failed to connect to GservicesProvider");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                            } else {
                                cursorQuery.close();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (this) {
                                try {
                                    if (obj4 == this.zzg) {
                                        this.zzb.put("gms:nearby:requires_gms_check", string);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (string != null) {
                                str2 = string;
                            }
                        } catch (Throwable th4) {
                            if (cursorQuery == null) {
                                throw th4;
                            }
                            try {
                                cursorQuery.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                            if (str2 != null) {
                                if (zzpa.zzc.matcher(str2).matches()) {
                                    bool = Boolean.TRUE;
                                } else if (zzpa.zzd.matcher(str2).matches()) {
                                    bool = Boolean.FALSE;
                                    z12 = false;
                                } else {
                                    Log.w("Gservices", "attempt to read Gservices key gms:nearby:requires_gms_check (value \"" + str2 + "\") as boolean");
                                }
                            }
                            synchronized (this) {
                                try {
                                    map = this.zzc;
                                    if (obj == this.zzg) {
                                        map.put("gms:nearby:requires_gms_check", bool);
                                        this.zzb.remove("gms:nearby:requires_gms_check");
                                    }
                                    return z12;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (zzpf unused) {
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            if (zzpa.zzc.matcher(str2).matches()) {
                bool = Boolean.TRUE;
            } else if (zzpa.zzd.matcher(str2).matches()) {
                bool = Boolean.FALSE;
                z12 = false;
            } else {
                Log.w("Gservices", "attempt to read Gservices key gms:nearby:requires_gms_check (value \"" + str2 + "\") as boolean");
            }
        }
        synchronized (this) {
            map = this.zzc;
            if (obj == this.zzg) {
                map.put("gms:nearby:requires_gms_check", bool);
                this.zzb.remove("gms:nearby:requires_gms_check");
            }
        }
        return z12;
    }
}
