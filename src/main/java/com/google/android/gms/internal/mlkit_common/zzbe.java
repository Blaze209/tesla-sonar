package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import rv.b;
import rv.c;
import rv.d;
import rv.e;

/* JADX INFO: loaded from: classes5.dex */
final class zzbe implements d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final b zzb;
    private static final b zzc;
    private static final c zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final c zzh;
    private final zzbi zzi = new zzbi(this);

    static {
        b.C2317b c2317bA = b.a(Action.KEY_ATTRIBUTE);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("value");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        zzd = new c() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
            @Override // rv.c
            public final void encode(Object obj, Object obj2) {
                zzbe.zzg((Map.Entry) obj, (d) obj2);
            }
        };
    }

    zzbe(OutputStream outputStream, Map map, Map map2, c cVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = cVar;
    }

    static /* synthetic */ void zzg(Map.Entry entry, d dVar) {
        dVar.add(zzb, entry.getKey());
        dVar.add(zzc, entry.getValue());
    }

    private static int zzh(b bVar) {
        zzbc zzbcVar = (zzbc) bVar.c(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(c cVar, Object obj) throws IOException {
        zzaz zzazVar = new zzaz();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzazVar;
            try {
                cVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzazVar.zza();
                zzazVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzazVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static zzbc zzj(b bVar) {
        zzbc zzbcVar = (zzbc) bVar.c(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzbe zzk(c cVar, b bVar, Object obj, boolean z11) throws IOException {
        long jZzi = zzi(cVar, obj);
        if (z11 && jZzi == 0) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 2);
        zzo(jZzi);
        cVar.encode(obj, this);
        return this;
    }

    private final zzbe zzl(e eVar, b bVar, Object obj, boolean z11) {
        this.zzi.zza(bVar, z11);
        eVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i11) throws IOException {
        while (true) {
            int i12 = i11 & 127;
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                this.zze.write(i12);
                return;
            } else {
                this.zze.write(i12 | 128);
                i11 >>>= 7;
            }
        }
    }

    private final void zzo(long j11) throws IOException {
        while (true) {
            int i11 = ((int) j11) & 127;
            if (((-128) & j11) == 0) {
                this.zze.write(i11);
                return;
            } else {
                this.zze.write(i11 | 128);
                j11 >>>= 7;
            }
        }
    }

    @Override // rv.d
    @NonNull
    public final d add(@NonNull b bVar, double d11) throws IOException {
        zza(bVar, d11, true);
        return this;
    }

    @NonNull
    public final d inline(Object obj) {
        zzf(obj);
        return this;
    }

    @NonNull
    public final d nested(@NonNull b bVar) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    final d zza(@NonNull b bVar, double d11, boolean z11) throws IOException {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d11).array());
        return this;
    }

    final d zzb(@NonNull b bVar, float f11, boolean z11) throws IOException {
        if (z11 && f11 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f11).array());
        return this;
    }

    final d zzc(@NonNull b bVar, Object obj, boolean z11) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    zzn((zzh(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(bVar, ((Double) obj).doubleValue(), z11);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(bVar, ((Float) obj).floatValue(), z11);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(bVar, ((Number) obj).longValue(), z11);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    c cVar = (c) this.zzf.get(obj.getClass());
                    if (cVar != null) {
                        zzk(cVar, bVar, obj, z11);
                        return this;
                    }
                    e eVar = (e) this.zzg.get(obj.getClass());
                    if (eVar != null) {
                        zzl(eVar, bVar, obj, z11);
                        return this;
                    }
                    if (obj instanceof zzba) {
                        zzd(bVar, ((zzba) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(bVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, bVar, obj, z11);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z11 || bArr.length != 0) {
                    zzn((zzh(bVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final zzbe zzd(@NonNull b bVar, int i11, boolean z11) throws IOException {
        if (!z11 || i11 != 0) {
            zzbc zzbcVarZzj = zzj(bVar);
            int iOrdinal = zzbcVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzbcVarZzj.zza() << 3);
                zzn(i11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzbcVarZzj.zza() << 3);
                zzn((i11 + i11) ^ (i11 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzbcVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    final zzbe zze(@NonNull b bVar, long j11, boolean z11) throws IOException {
        if (!z11 || j11 != 0) {
            zzbc zzbcVarZzj = zzj(bVar);
            int iOrdinal = zzbcVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzbcVarZzj.zza() << 3);
                zzo(j11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzbcVarZzj.zza() << 3);
                zzo((j11 >> 63) ^ (j11 + j11));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzbcVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    final zzbe zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        c cVar = (c) this.zzf.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.encode(obj, this);
        return this;
    }

    @NonNull
    public final d add(@NonNull b bVar, float f11) throws IOException {
        zzb(bVar, f11, true);
        return this;
    }

    @NonNull
    public final d nested(@NonNull String str) {
        return nested(b.d(str));
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, int i11) throws IOException {
        zzd(bVar, i11, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, long j11) throws IOException {
        zze(bVar, j11, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final d add(@NonNull b bVar, Object obj) throws IOException {
        zzc(bVar, obj, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, boolean z11) throws IOException {
        zzd(bVar, z11 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, double d11) throws IOException {
        zza(b.d(str), d11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, int i11) throws IOException {
        zzd(b.d(str), i11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, long j11) throws IOException {
        zze(b.d(str), j11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, Object obj) throws IOException {
        zzc(b.d(str), obj, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, boolean z11) throws IOException {
        zzd(b.d(str), z11 ? 1 : 0, true);
        return this;
    }
}
