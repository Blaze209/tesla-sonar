package mf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.s0;
import vc0.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmf0/h;", "", "a", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, t0> f92085b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: mf0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lmf0/h$a;", "", "<init>", "()V", "", "size", "", "c", "(I)[B", "", "vin", "sessionId", "Lvc0/t0;", "data", "Ljn0/h0;", "a", "(Ljava/lang/String;ILvc0/t0;)V", "e", "(Ljava/lang/String;I)Lvc0/t0;", "b", "()I", "Lvc0/s0;", "stsMode", DateTokenConverter.CONVERTER_KEY, "(Lvc0/s0;)[B", "Ljava/util/concurrent/ConcurrentHashMap;", "dataManager", "Ljava/util/concurrent/ConcurrentHashMap;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: mf0.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C1965a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f92086a;

            static {
                int[] iArr = new int[s0.values().length];
                try {
                    iArr[s0.PROVISIONED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s0.PROVISIONED_INDIVIDUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s0.STATIC.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f92086a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] c(int size) {
            byte[] bArr = new byte[size];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }

        public final void a(String vin, int sessionId, t0 data) {
            s.k(vin, "vin");
            s.k(data, "data");
            h.f92085b.put(vin + sessionId, data);
        }

        public final int b() {
            return new SecureRandom().nextInt();
        }

        public final byte[] d(s0 stsMode) {
            s.k(stsMode, "stsMode");
            int i11 = C1965a.f92086a[stsMode.ordinal()];
            if (i11 == 1 || i11 == 2) {
                return c(16);
            }
            return i11 != 3 ? c(0) : c(8);
        }

        public final t0 e(String vin, int sessionId) {
            s.k(vin, "vin");
            return (t0) h.f92085b.get(vin + sessionId);
        }

        private Companion() {
        }
    }
}
