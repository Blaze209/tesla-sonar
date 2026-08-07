package rb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: rb0.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lrb0/g;", "", "", "success", "", "signedMessage", "nonce", "tag", "", AnalyticsAttribute.Error, "<init>", "(Z[B[B[BLjava/lang/String;)V", "a", "()Z", "b", "()[B", "c", DateTokenConverter.CONVERTER_KEY, "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "[B", "getSignedMessage", "getNonce", "getTag", "e", "Ljava/lang/String;", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignedMessageResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] signedMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] nonce;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] tag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    public SignedMessageResponse(boolean z11, byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        this.success = z11;
        this.signedMessage = bArr;
        this.nonce = bArr2;
        this.tag = bArr3;
        this.error = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getSignedMessage() {
        return this.signedMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedMessageResponse)) {
            return false;
        }
        SignedMessageResponse signedMessageResponse = (SignedMessageResponse) other;
        return this.success == signedMessageResponse.success && s.f(this.signedMessage, signedMessageResponse.signedMessage) && s.f(this.nonce, signedMessageResponse.nonce) && s.f(this.tag, signedMessageResponse.tag) && s.f(this.error, signedMessageResponse.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        byte[] bArr = this.signedMessage;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.nonce;
        int iHashCode3 = (iHashCode2 + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.tag;
        int iHashCode4 = (iHashCode3 + (bArr3 == null ? 0 : Arrays.hashCode(bArr3))) * 31;
        String str = this.error;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SignedMessageResponse(success=" + this.success + ", signedMessage=" + Arrays.toString(this.signedMessage) + ", nonce=" + Arrays.toString(this.nonce) + ", tag=" + Arrays.toString(this.tag) + ", error=" + this.error + ")";
    }
}
