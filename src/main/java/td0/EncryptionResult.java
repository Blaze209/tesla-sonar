package td0;

import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: td0.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltd0/g;", "", "", "iv", "encryptedData", "<init>", "([B[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[B", "b", "()[B", "realm_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EncryptionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] iv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] encryptedData;

    public EncryptionResult(byte[] iv2, byte[] encryptedData) {
        p013kotlin.jvm.internal.s.k(iv2, "iv");
        p013kotlin.jvm.internal.s.k(encryptedData, "encryptedData");
        this.iv = iv2;
        this.encryptedData = encryptedData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getIv() {
        return this.iv;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(EncryptionResult.class, other != null ? other.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type com.tesla.realm.EncryptionResult");
        EncryptionResult encryptionResult = (EncryptionResult) other;
        return Arrays.equals(this.iv, encryptionResult.iv) && Arrays.equals(this.encryptedData, encryptionResult.encryptedData);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.iv) * 31) + Arrays.hashCode(this.encryptedData);
    }

    public String toString() {
        return "EncryptionResult(iv=" + Arrays.toString(this.iv) + ", encryptedData=" + Arrays.toString(this.encryptedData) + ")";
    }
}
