package v5;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv5/f;", "", "", PlaceTypes.ADDRESS, "<init>", "([B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[B", "()[B", "b", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f117883c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] address;

    static {
        BaseEncoding baseEncodingG = BaseEncoding.a().g(":", 2);
        s.j(baseEncodingG, "base16().withSeparator(\":\", 2)");
        f117883c = baseEncodingG;
    }

    public f(byte[] address) {
        s.k(address, "address");
        this.address = address;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getAddress() {
        return this.address;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(f.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type androidx.core.uwb.UwbAddress");
        return Arrays.equals(this.address, ((f) other).address);
    }

    public int hashCode() {
        return Arrays.hashCode(this.address);
    }

    public String toString() {
        String strB = f117883c.b(this.address);
        s.j(strB, "BASE_16_SEPARATOR.encode(address)");
        return strB;
    }
}
