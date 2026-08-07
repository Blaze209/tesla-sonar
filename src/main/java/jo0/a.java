package jo0;

import java.io.Serializable;
import jn0.c0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Ljo0/a;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "c", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "(Ljo0/a;)I", "hashCode", "()I", "a", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Comparable<a>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f84112d = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long mostSignificantBits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long leastSignificantBits;

    /* JADX INFO: renamed from: jo0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljo0/a$a;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "Ljo0/a;", "a", "(JJ)Ljo0/a;", "", "uuidString", "c", "(Ljava/lang/String;)Ljo0/a;", "NIL", "Ljo0/a;", "b", "()Ljo0/a;", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long mostSignificantBits, long leastSignificantBits) {
            return (mostSignificantBits == 0 && leastSignificantBits == 0) ? b() : new a(mostSignificantBits, leastSignificantBits, null);
        }

        public final a b() {
            return a.f84112d;
        }

        public final a c(String uuidString) {
            s.k(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return b.b(uuidString);
            }
            if (length == 36) {
                return b.c(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.g(uuidString, 64) + "\" of length " + uuidString.length());
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        s.k(other, "other");
        long j11 = this.mostSignificantBits;
        return j11 != other.mostSignificantBits ? Long.compare(c0.b(j11) ^ Long.MIN_VALUE, c0.b(other.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(c0.b(this.leastSignificantBits) ^ Long.MIN_VALUE, c0.b(other.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public final String c() {
        byte[] bArr = new byte[36];
        b.a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.leastSignificantBits, bArr, 24, 2, 8);
        return t.G(bArr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.mostSignificantBits == aVar.mostSignificantBits && this.leastSignificantBits == aVar.leastSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public String toString() {
        return c();
    }

    private a(long j11, long j12) {
        this.mostSignificantBits = j11;
        this.leastSignificantBits = j12;
    }
}
