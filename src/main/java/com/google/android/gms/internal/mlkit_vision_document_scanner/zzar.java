package com.google.android.gms.internal.mlkit_vision_document_scanner;

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
final class zzar implements d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final b zzg;
    private static final b zzh;
    private static final c zzi;
    private OutputStream zzb;
    private final Map zzc;
    private final Map zzd;
    private final c zze;
    private final zzav zzf = new zzav(this);

    static {
        b.C2317b c2317bA = b.a(Action.KEY_ATTRIBUTE);
        zzal zzalVar = new zzal();
        zzalVar.zza(1);
        zzg = c2317bA.b(zzalVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("value");
        zzal zzalVar2 = new zzal();
        zzalVar2.zza(2);
        zzh = c2317bA2.b(zzalVar2.zzb()).a();
        zzi = zzaq.zza;
    }

    zzar(OutputStream outputStream, Map map, Map map2, c cVar) {
        this.zzb = outputStream;
        this.zzc = map;
        this.zzd = map2;
        this.zze = cVar;
    }

    static /* synthetic */ void zzg(Map.Entry entry, d dVar) {
        dVar.add(zzg, entry.getKey());
        dVar.add(zzh, entry.getValue());
    }

    private final zzar zzh(c cVar, b bVar, Object obj, boolean z11) throws IOException {
        long jZzi = zzi(cVar, obj);
        if (z11 && jZzi == 0) {
            return this;
        }
        zzn((zzl(bVar) << 3) | 2);
        zzo(jZzi);
        cVar.encode(obj, this);
        return this;
    }

    private final long zzi(c cVar, Object obj) throws IOException {
        zzam zzamVar = new zzam();
        try {
            OutputStream outputStream = this.zzb;
            this.zzb = zzamVar;
            try {
                cVar.encode(obj, this);
                this.zzb = outputStream;
                long jZza = zzamVar.zza();
                zzamVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zzb = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzamVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private final zzar zzj(e eVar, b bVar, Object obj, boolean z11) {
        zzav zzavVar = this.zzf;
        zzavVar.zza(bVar, z11);
        eVar.encode(obj, zzavVar);
        return this;
    }

    private static ByteBuffer zzk(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int zzl(b bVar) {
        zzap zzapVar = (zzap) bVar.c(zzap.class);
        if (zzapVar != null) {
            return zzapVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static zzap zzm(b bVar) {
        zzap zzapVar = (zzap) bVar.c(zzap.class);
        if (zzapVar != null) {
            return zzapVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final void zzn(int i11) throws IOException {
        while (true) {
            int i12 = i11 & 127;
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                this.zzb.write(i12);
                return;
            } else {
                this.zzb.write(i12 | 128);
                i11 >>>= 7;
            }
        }
    }

    private final void zzo(long j11) throws IOException {
        while (true) {
            int i11 = ((int) j11) & 127;
            if (((-128) & j11) == 0) {
                this.zzb.write(i11);
                return;
            } else {
                this.zzb.write(i11 | 128);
                j11 >>>= 7;
            }
        }
    }

    @Override // rv.d
    @NonNull
    public final d add(@NonNull b bVar, double d11) {
        zzb(bVar, d11, true);
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

    final d zza(@NonNull b bVar, Object obj, boolean z11) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    zzn((zzl(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zzb.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zza(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzh(zzi, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zzb(bVar, ((Double) obj).doubleValue(), z11);
                    return this;
                }
                if (obj instanceof Float) {
                    zzc(bVar, ((Float) obj).floatValue(), z11);
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
                    c cVar = (c) this.zzc.get(obj.getClass());
                    if (cVar != null) {
                        zzh(cVar, bVar, obj, z11);
                        return this;
                    }
                    e eVar = (e) this.zzd.get(obj.getClass());
                    if (eVar != null) {
                        zzj(eVar, bVar, obj, z11);
                        return this;
                    }
                    if (obj instanceof zzan) {
                        zzd(bVar, ((zzan) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(bVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzh(this.zze, bVar, obj, z11);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z11 || bArr.length != 0) {
                    zzn((zzl(bVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zzb.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final d zzb(@NonNull b bVar, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        zzn((zzl(bVar) << 3) | 1);
        this.zzb.write(zzk(8).putDouble(d11).array());
        return this;
    }

    final d zzc(@NonNull b bVar, float f11, boolean z11) {
        if (z11 && f11 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzn((zzl(bVar) << 3) | 5);
        this.zzb.write(zzk(4).putFloat(f11).array());
        return this;
    }

    final zzar zzd(@NonNull b bVar, int i11, boolean z11) {
        if (!z11 || i11 != 0) {
            zzap zzapVarZzm = zzm(bVar);
            int iOrdinal = zzapVarZzm.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzapVarZzm.zza() << 3);
                zzn(i11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzapVarZzm.zza() << 3);
                zzn((i11 + i11) ^ (i11 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzapVarZzm.zza() << 3) | 5);
                this.zzb.write(zzk(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    final zzar zze(@NonNull b bVar, long j11, boolean z11) {
        if (!z11 || j11 != 0) {
            zzap zzapVarZzm = zzm(bVar);
            int iOrdinal = zzapVarZzm.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzapVarZzm.zza() << 3);
                zzo(j11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzapVarZzm.zza() << 3);
                zzo((j11 >> 63) ^ (j11 + j11));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzapVarZzm.zza() << 3) | 1);
                this.zzb.write(zzk(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    final zzar zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        c cVar = (c) this.zzc.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.encode(obj, this);
        return this;
    }

    @NonNull
    public final d add(@NonNull b bVar, float f11) {
        zzc(bVar, f11, true);
        return this;
    }

    @NonNull
    public final d nested(@NonNull String str) {
        return nested(b.d(str));
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, int i11) {
        zzd(bVar, i11, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, long j11) {
        zze(bVar, j11, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final d add(@NonNull b bVar, Object obj) {
        zza(bVar, obj, true);
        return this;
    }

    @Override // rv.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, boolean z11) {
        zzd(bVar, z11 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, double d11) {
        zzb(b.d(str), d11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, int i11) {
        zzd(b.d(str), i11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, long j11) {
        zze(b.d(str), j11, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, Object obj) {
        zza(b.d(str), obj, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, boolean z11) {
        zzd(b.d(str), z11 ? 1 : 0, true);
        return this;
    }
}
