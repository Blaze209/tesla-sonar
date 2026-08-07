package ce0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ie0.n;
import java.security.SecureRandom;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lce0/g;", "", "<init>", "()V", "", "a", "Lkotlin/Lazy;", "e", "()[B", "bytes", "", "b", "f", "()Ljava/lang/String;", "hex", "Lokio/k;", "c", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "byteString", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy bytes = m.b(new wn0.a() { // from class: ce0.e
        @Override // wn0.a
        public final Object invoke() {
            return g.c();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy hex = m.b(new wn0.a() { // from class: ce0.f
        @Override // wn0.a
        public final Object invoke() {
            return g.g(this.f19105a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final okio.k byteString = okio.k.Companion.i(okio.k.INSTANCE, e(), 0, 0, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private final byte[] e() {
        return (byte[]) this.bytes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(g gVar) {
        return n.e(gVar.e(), 0, 1, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getByteString() {
        return this.byteString;
    }

    public final String f() {
        return (String) this.hex.getValue();
    }
}
