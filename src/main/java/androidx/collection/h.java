package androidx.collection;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u000b"}, d2 = {"Landroidx/collection/h;", "", "", "first", "second", "a", "(FF)J", "", "packedValue", "b", "(J)J", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class h {
    public static long a(float f11, float f12) {
        return b((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static long b(long j11) {
        return j11;
    }
}
