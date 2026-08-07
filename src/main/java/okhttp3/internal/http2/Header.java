package okhttp3.internal.http2;

import okio.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lokio/k;", "name", "value", "<init>", "(Lokio/k;Lokio/k;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/k;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lokio/k;", "component2", "copy", "(Lokio/k;Lokio/k;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/k;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {
    public static final k PSEUDO_PREFIX;
    public static final k RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final k TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final k TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final k TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final k TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final k name;
    public final k value;

    static {
        k.Companion companion = k.INSTANCE;
        PSEUDO_PREFIX = companion.f(":");
        RESPONSE_STATUS = companion.f(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = companion.f(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.f(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.f(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.f(TARGET_AUTHORITY_UTF8);
    }

    public Header(k name, k value) {
        s.k(name, "name");
        s.k(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.D() + 32 + value.D();
    }

    public static /* synthetic */ Header copy$default(Header header, k kVar, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = header.name;
        }
        if ((i11 & 2) != 0) {
            kVar2 = header.value;
        }
        return header.copy(kVar, kVar2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final k getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final k getValue() {
        return this.value;
    }

    public final Header copy(k name, k value) {
        s.k(name, "name");
        s.k(value, "value");
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return s.f(this.name, header.name) && s.f(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.K() + ": " + this.value.K();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String name, String value) {
        s.k(name, "name");
        s.k(value, "value");
        k.Companion companion = k.INSTANCE;
        this(companion.f(name), companion.f(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(k name, String value) {
        this(name, k.INSTANCE.f(value));
        s.k(name, "name");
        s.k(value, "value");
    }
}
