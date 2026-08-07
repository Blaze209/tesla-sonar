package qx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.l;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f106187e = new EnumMap(rx.a.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final Map f106188f = new EnumMap(rx.a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rx.a f106190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f106191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106192d;

    @NonNull
    @KeepForSdk
    public String a() {
        return this.f106192d;
    }

    @NonNull
    @KeepForSdk
    public String b() {
        String str = this.f106189a;
        if (str != null) {
            return str;
        }
        return (String) f106188f.get(this.f106190b);
    }

    @NonNull
    @KeepForSdk
    public l c() {
        return this.f106191c;
    }

    @NonNull
    @KeepForSdk
    public String d() {
        String str = this.f106189a;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f106188f.get(this.f106190b)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equal(this.f106189a, bVar.f106189a) && Objects.equal(this.f106190b, bVar.f106190b) && Objects.equal(this.f106191c, bVar.f106191c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f106189a, this.f106190b, this.f106191c);
    }

    @NonNull
    public String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModel");
        zzqVarZzb.zza("modelName", this.f106189a);
        zzqVarZzb.zza("baseModel", this.f106190b);
        zzqVarZzb.zza("modelType", this.f106191c);
        return zzqVarZzb.toString();
    }
}
