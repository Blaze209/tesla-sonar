package v5;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u0000 02\u00020\u0001:\u0001\u0017Bu\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u0017\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001b\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/¨\u00061"}, d2 = {"Lv5/c;", "", "", "uwbConfigType", "sessionId", "subSessionId", "", "sessionKeyInfo", "subSessionKeyInfo", "Lv5/i;", "complexChannel", "", "Lv5/k;", "peerDevices", "updateRateType", "Lv5/m;", "uwbRangeDataNtfConfig", "", "slotDurationMillis", "", "isAoaDisabled", "<init>", "(III[B[BLv5/i;Ljava/util/List;ILv5/m;JZ)V", "a", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "b", "c", "f", DateTokenConverter.CONVERTER_KEY, "[B", "()[B", "e", "g", "Lv5/i;", "()Lv5/i;", "Ljava/util/List;", "()Ljava/util/List;", "h", "Lv5/m;", "j", "()Lv5/m;", "J", "()J", "k", "Z", "()Z", "l", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int uwbConfigType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int subSessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte[] sessionKeyInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final byte[] subSessionKeyInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final UwbComplexChannel complexChannel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<k> peerDevices;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int updateRateType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final m uwbRangeDataNtfConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long slotDurationMillis;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isAoaDisabled;

    public c(int i11, int i12, int i13, byte[] bArr, byte[] bArr2, UwbComplexChannel uwbComplexChannel, List<k> peerDevices, int i14, m mVar, long j11, boolean z11) {
        s.k(peerDevices, "peerDevices");
        this.uwbConfigType = i11;
        this.sessionId = i12;
        this.subSessionId = i13;
        this.sessionKeyInfo = bArr;
        this.subSessionKeyInfo = bArr2;
        this.complexChannel = uwbComplexChannel;
        this.peerDevices = peerDevices;
        this.updateRateType = i14;
        this.uwbRangeDataNtfConfig = mVar;
        this.slotDurationMillis = j11;
        this.isAoaDisabled = z11;
        if ((i11 == 1 || i11 == 2 || i11 == 3) && (bArr == null || bArr.length != 8)) {
            throw new IllegalArgumentException("Session key should be 8 bytes in length for static STS.");
        }
        if (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
            if (bArr == null || bArr.length != 16) {
                throw new IllegalArgumentException("At present, only 16 byte session key is supported for provisioned STS.");
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UwbComplexChannel getComplexChannel() {
        return this.complexChannel;
    }

    public final List<k> b() {
        return this.peerDevices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getSessionKeyInfo() {
        return this.sessionKeyInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSlotDurationMillis() {
        return this.slotDurationMillis;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSubSessionId() {
        return this.subSessionId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final byte[] getSubSessionKeyInfo() {
        return this.subSessionKeyInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getUpdateRateType() {
        return this.updateRateType;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getUwbConfigType() {
        return this.uwbConfigType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final m getUwbRangeDataNtfConfig() {
        return this.uwbRangeDataNtfConfig;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsAoaDisabled() {
        return this.isAoaDisabled;
    }
}
