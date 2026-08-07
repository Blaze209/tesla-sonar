package androidx.media;

import androidx.annotation.NonNull;
import com.plaid.internal.EnumC4419g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9003a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9004b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9005c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9006d = -1;

    public int a() {
        return this.f9004b;
    }

    public int b() {
        int i11 = this.f9005c;
        int iC = c();
        if (iC == 6) {
            i11 |= 4;
        } else if (iC == 7) {
            i11 |= 1;
        }
        return i11 & EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
    }

    public int c() {
        int i11 = this.f9006d;
        return i11 != -1 ? i11 : AudioAttributesCompat.a(false, this.f9005c, this.f9003a);
    }

    public int d() {
        return this.f9003a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f9004b == audioAttributesImplBase.a() && this.f9005c == audioAttributesImplBase.b() && this.f9003a == audioAttributesImplBase.d() && this.f9006d == audioAttributesImplBase.f9006d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9004b), Integer.valueOf(this.f9005c), Integer.valueOf(this.f9003a), Integer.valueOf(this.f9006d)});
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f9006d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f9006d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f9003a));
        sb2.append(" content=");
        sb2.append(this.f9004b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f9005c).toUpperCase());
        return sb2.toString();
    }
}
